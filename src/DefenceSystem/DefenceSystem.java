/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DefenceSystem;

/**
 *
 * @author theekshanasankalpa
 */
public class DefenceSystem {
    public static void main(String[] args) {               
        
        Helicopter helicopter = new Helicopter();
        helicopter.setVisible(true);
        Tank tank = new Tank();
        tank.setVisible(true);
        Submarine submarine = new Submarine();
        submarine.setVisible(true);
        
        
        DefenceSystemObservable defenceSystemObservable = new DefenceSystemObservable();
        defenceSystemObservable.addObserver(helicopter);
        defenceSystemObservable.addObserver(tank);
        defenceSystemObservable.addObserver(submarine);
        
        
        new MainController(defenceSystemObservable).setVisible(true);

        // TODO code application logic here
    }
}
