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
    class Animal 
    {
    protected void animalSound()
    {
    System.out.println("make sounds");
    }
    }
        
    class Dog extends Animal
    {
    protected void animalSound()
    {
    System.out.println("bark bark");
    }
    }
    
    class Cat extends Animal
    {
    protected void animalSound()
    {
    System.out.println("meow meow");
    }
    }
   
    
    

