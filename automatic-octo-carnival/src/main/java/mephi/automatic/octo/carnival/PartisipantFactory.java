/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.automatic.octo.carnival;


import com.github.javafaker.*;
import java.util.Locale;
/**
 *
 * @author test2023
 */
public class PartisipantFactory {
    private Faker faker;

    public PartisipantFactory() {
        initialize();
    }

    private void initialize() {
        faker = new Faker(new Locale("pt-BR"));
    }
    
    public Participant createPartisipant(){
        String name = faker.name().fullName();
        String style = faker.music().genre();
        
        return(new Participant(name, style));
    }
}
