/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DefenceSystem;
import java.util.ArrayList;
/**
 *
 * @author theekshanasankalpa
 */
public class DefenceSystemObservable {
    private ArrayList<DefenceSystemObserver> observerList = new ArrayList<>();
    
    private boolean status;
    private int position;
    private String message;
    private boolean select;
    private int checkNum;
    
    public void addObserver(DefenceSystemObserver ob) {
        observerList.add(ob);
    }

    public void setAreaClearedMessage(boolean status) {
        if (this.status != status) {
            this.status = status;
            notifyDevices();
        }
    }
    
    public void setUpdatePosition(int position){
        if (this.position != position) {
            this.position = position;
            notifyDevices();
        }
    }
    public void setUpdateSendMessages(String message,boolean select,int checkNum){
        if(this.message != message){
            this.message = message;
            this.select = select;
            this.checkNum = checkNum;
            notifyDevices();
        }
    }
    public void notifyDevices(){
        for (DefenceSystemObserver ob : observerList) {
            ob.areaClearedMessage(status);
            ob.updatePosition(position);
            ob.updateSendMessages(message,select,checkNum);
        }
    }
}
