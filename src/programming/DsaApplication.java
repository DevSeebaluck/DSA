/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming;

/**
 *
 * @author seebaluck
 */
public class DsaApplication implements IDisplayable_Interface {
    
    @Override
    public void display() {
        System.out.println("Welcome back to your Home Interface");
    }
    
    public static void student(){
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        DsaApplication myIDisplayable = new DsaApplication();
        myIDisplayable.display();
        
        student();
    }

    
    
}
