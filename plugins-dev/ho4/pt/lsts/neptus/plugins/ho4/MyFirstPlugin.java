/*
 * Copyright (c) 2004-2020 Universidade do Porto - Faculdade de Engenharia
 * Laboratório de Sistemas e Tecnologia Subaquática (LSTS)
 * All rights reserved.
 * Rua Dr. Roberto Frias s/n, sala I203, 4200-465 Porto, Portugal
 *
 * This file is part of Neptus, Command and Control Framework.
 *
 * Commercial Licence Usage
 * Licencees holding valid commercial Neptus licences may use this file
 * in accordance with the commercial licence agreement provided with the
 * Software or, alternatively, in accordance with the terms contained in a
 * written agreement between you and Universidade do Porto. For licensing
 * terms, conditions, and further information contact lsts@fe.up.pt.
 *
 * Modified European Union Public Licence - EUPL v.1.1 Usage
 * Alternatively, this file may be used under the terms of the Modified EUPL,
 * Version 1.1 only (the "Licence"), appearing in the file LICENSE.md
 * included in the packaging of this file. You may not use this work
 * except in compliance with the Licence. Unless required by applicable
 * law or agreed to in writing, software distributed under the Licence is
 * distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF
 * ANY KIND, either express or implied. See the Licence for the specific
 * language governing permissions and limitations at
 * https://github.com/LSTS/neptus/blob/develop/LICENSE.md
 * and http://ec.europa.eu/idabc/eupl.html.
 *
 * For more information please see <http://lsts.fe.up.pt/neptus>.
 *
 * Author: henning
 * Sep 29, 2020
 */
package pt.lsts.neptus.plugins.ho4;

import pt.lsts.imc.IMCAddressResolver;
import pt.lsts.imc.PathControlState;
import pt.lsts.imc.PlanDB;
import pt.lsts.imc.Rpm;
import pt.lsts.imc.Temperature;

import java.awt.Color;
import java.awt.Graphics2D;
import java.text.DecimalFormat;


import com.google.common.eventbus.Subscribe;


import pt.lsts.neptus.NeptusLog;
import pt.lsts.neptus.console.ConsoleLayer;
import pt.lsts.neptus.console.events.ConsoleEventMainSystemChange;
import pt.lsts.neptus.plugins.PluginDescription;
import pt.lsts.neptus.renderer2d.StateRenderer2D;
import pt.lsts.neptus.types.coord.LocationType;
import pt.lsts.neptus.types.vehicle.VehicleType;
import pt.lsts.neptus.types.vehicle.VehiclesHolder;

/**
 * @author henning
 *
 */

@PluginDescription(name="MyPlugin", version="0.1", description = "This is my first plugin")
public class MyFirstPlugin extends ConsoleLayer {

    private short rpmVal = -1;
    private double tempVal = Double.MAX_VALUE;
    private VehicleType vehicle;
    private IMCAddressResolver res = new IMCAddressResolver();
    private int mainVehicleId;
    private LocationType loc = null;
    private String planid = null;


    public MyFirstPlugin() {
        NeptusLog.pub().info("MyFirstPlugin is loaded");
    }

    @Subscribe
    public void mainVehicleChangeNotification(ConsoleEventMainSystemChange evt){
        vehicle = VehiclesHolder.getVehicleById(evt.getCurrent());
        System.out.println("Main Vehicle Changed to "+ vehicle);
        
        mainVehicleId = res.resolve(vehicle.getId());
    }
    
    @Override
    public void paint(Graphics2D g, StateRenderer2D renderer) {
        super.paint(g, renderer);
        
        Graphics2D g2 = (Graphics2D) g.create();
        
        g2.setColor(Color.BLACK);
        
        StringBuilder str0 = new StringBuilder();
        str0.append("Selected vehicle is: ");
        str0.append(getConsole().getMainSystem());
        
        g2.drawString(str0.toString(), 15, 15);
        
        StringBuilder str1 =  new StringBuilder();
        str1.append("RPM: ");
        if (rpmVal != -1) {
            str1.append(rpmVal);
        } else {
            str1.append("N/A");
        }

        g2.drawString(str1.toString(), 15, 30);
        
        StringBuilder str2 =  new StringBuilder();

        str2.append("Temperature: ");
        
        DecimalFormat df2 = new DecimalFormat("#.##");
        
        if (tempVal != Double.MAX_VALUE) {
            str2.append(df2.format(tempVal));
        } else {
            str2.append("N/A");
        }
        

        g2.drawString(str2.toString(), 15, 45);

        try {
        StringBuilder str3 =  new StringBuilder();

        str3.append("Target Location: ");
        str3.append(Double.toString(loc.getLatitudeDegs()));
        str3.append(", ");
        str3.append(Double.toString(loc.getLongitudeDegs()));
        

        g2.drawString(str3.toString(), 15, 60);
        } catch(Exception e) {
//            System.out.println(e.toString());
//            System.out.println("Unable to get lat/lon");
        }
        
        StringBuilder str4 =  new StringBuilder();
        str4.append("Plan ID: ");
        if (planid != null) {
            str4.append(planid);
        } else {
            str4.append("N/A");
        }

        g2.drawString(str4.toString(), 15, 75);

        g2.dispose();
        
    }

    @Subscribe
    public void consume(Rpm rpm) {
        if (rpm.getSrc() == mainVehicleId) {
           rpmVal = rpm.getValue();
        }
    }

    @Subscribe
    public void consume(Temperature temp) {
        if (temp.getSrc() == mainVehicleId) {
            tempVal = temp.getValue();
        }
    }

    @Subscribe
    public void consume(PathControlState pcs) {
        if (pcs.getSrc() == mainVehicleId) {
            loc = new LocationType(Math.toDegrees(pcs.getEndLat()), Math.toDegrees(pcs.getEndLon()));
        }
    }

    @Subscribe
    public void consume(PlanDB pdb) {
        if (pdb.getSrc() == mainVehicleId) {
            planid = pdb.getPlanId().toString();
        }
    }

    
    
    public boolean userControlsOpacity(){
        return false;
    }
    @Override
    public void initLayer(){

    }
    @Override
    public void cleanLayer(){

    }
}