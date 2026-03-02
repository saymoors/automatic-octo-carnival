/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.automatic.octo.carnival;

import java.util.ArrayList;

/**
 *
 * @author test2023
 */
public class Carnaval {
    
    private ArrayList<Participant> participants;

    public Carnaval() {
        participants = new ArrayList();
    }

    public void dance(){
        System.out.println("Танцуют Все!");
        
        participants.stream().forEach(a -> a.dance());
    }
    
    public void addParticipant(Participant p){
        participants.add(p);
    }
}
