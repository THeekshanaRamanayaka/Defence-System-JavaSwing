/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DefenceSystem;

/**
 *
 * @author theekshanasankalpa
 */
public interface DefenceSystemObserver {
    void areaClearedMessage(boolean status);
    void updatePosition(int positionLevel);
    void updateSendMessages(String message,boolean select,int checkNum);
}
