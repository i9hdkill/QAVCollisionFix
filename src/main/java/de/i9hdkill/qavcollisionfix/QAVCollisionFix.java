package de.i9hdkill.qavcollisionfix;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import me.zombie_striker.qg.exp.cars.api.events.VehicleSpawnEvent;

public class QAVCollisionFix extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);

    }

    @EventHandler
    public void onVehicleSpawn(VehicleSpawnEvent e) {
        //This fixes bounding boxes of vehicles.
        //For some reason -4 makes them exactly as big as the Vehicle itself
        e.getVehicle().getType().setCrashRadius(-4);
    }

}
