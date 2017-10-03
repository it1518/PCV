/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

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
        System.out.println(student.toString());
        Human studentka = new Human("Hilda",12, Human.Sex.WOMAN);
        studentka.setHeight((float) 1.59);
        studentka.setWeight(65);
        System.out.println(studentka.toString());
    }
    
}
