/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphsim;

/**
 *
 * @author UR
 */
public class Main {
     public static void main (String[] args)
    {
    Animal animal = new Animal();
    Animal dog = new Dog();
    Animal cat = new Cat();
    
    animal.animalSound();
    dog.animalSound();
    cat.animalSound();
   
    }
}
