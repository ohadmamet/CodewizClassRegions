package com.smartkids.codewizclassregions.events;

import java.io.FileWriter;
import java.io.IOException;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.json.simple.JSONObject;



public class Regions implements Listener{
    
/*
 * This class is just me testing out how the JSON should be stored and managed.
 * Once a student joins is checks the JSON and then decide where to teleport them based on the time.
 *  
 */


public Regions(){}

    /**
     * JUST TESTING  (idk if things have been finalized)
     * Get the player's name and UUDI and store in .json file
     * 
     *
     * @param event event object for when the player joins the server
     * */    
    @EventHandler
    @SuppressWarnings("unchecked")
    public void onPlayerJoin(PlayerJoinEvent event){
        JSONObject obj = new JSONObject();
        //JSONArray  arr = new JSONArray();
        //Player plr = event.getPlayer(); I guess dont do this because it returns broken json
        
        obj.put("Town name", "test town");
        obj.put(event.getPlayer().getName(), event.getPlayer().getUniqueId());
        
        try (FileWriter file = new FileWriter("test.json")){ // output located in root of server dir 
            file.append(obj.toString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    

/*My output
 * 
 * 
 * 
 */



}


