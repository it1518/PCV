/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class People {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Human student = new Human("Hugo",18, Human.Sex.MAN);
        //System.out.println(student.toString());
        Human studentka = new Human("Hilda",12, Human.Sex.WOMAN);
        studentka.setHeight((float) 1.59);
        studentka.setWeight(65);
        //System.out.println(studentka.toString());
        Sportsman sportovec = new Sportsman("Pepa", 20000);
        sportovec.setAge(45);
        sportovec.setHeight(189);
        sportovec.setWeight(102);
        //System.out.println(sportovec.toString());
        HockeyPlayer player = new HockeyPlayer("Kuba", 10000);
        player.setAge(50);
        player.setHeight(200);
        player.setWeight(80);
        //System.out.println(player.toString());
        
        
        List<Human> lide = new ArrayList<>();
        lide.add(student);
        lide.add(studentka);
        lide.add(sportovec);
        
        for(Human clovek : lide){
            System.out.println(clovek.toString());
        }
    }
    
}
