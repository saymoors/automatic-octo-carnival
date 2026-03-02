/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mephi.automatic.octo.carnival;

/**
 *
 * @author test2023
 */
public class AutomaticOctoCarnival {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Carnaval carnaval = new Carnaval();
        PartisipantFactory factory = new PartisipantFactory();
        for (int i = 0; i < 10; i++) {
            carnaval.addParticipant(factory.createPartisipant());
        }
        carnaval.dance();
    }
}
