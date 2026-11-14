/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defencesystem;

/**
 *
 * @author chand
 */    
    public interface DefenceController {
    void receiveMessage(String message, String senderName);
    void sendPrivateMessage(String message, String receiver);
}
