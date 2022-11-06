package com.smartkids.codewizclassregions.events;

import java.io.FileWriter;
import java.io.IOException;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.common.io.FileWriteMode;


public class Regions implements Listener{
    
/*
 * This class is just me testing out how the JSON should be stored and managed.
 * Once a student joins is checks the JSON and then decide where to teleport them based on the time.
 *  
 */

 private Object put;

public Regions(){}

    /**
     * JUST TESTING  (idk if things have been finalized)
     * Get the player's name and UUDI and store in .json file
     * 
     *
     * @param event event object for when the player joins the server
     * */    
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        JSONObject obj = new JSONObject();
        //JSONArray  arr = new JSONArray();
        Player plr = event.getPlayer();
        
        obj.put("Town name", "test town");
        obj.put(plr.name(), plr.getUniqueId());
        
        try (FileWriter file = new FileWriter("test.json")){
            file.write(obj.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The JSON: " + obj);
    }
}


