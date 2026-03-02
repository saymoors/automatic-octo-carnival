/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.automatic.octo.carnival;

/**
 *
 * @author test2023
 */
public class Participant {
    private String name;
    
    private String style;

    public Participant(String name, String style) {
        this.name = name;
        this.style = style;
    }
    
    public void dance(){
        System.out.println( name + " танцует " +  style);
    }
}
