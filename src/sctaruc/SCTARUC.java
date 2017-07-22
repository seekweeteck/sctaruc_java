/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sctaruc;

/**
 *
 * @author kweetecksee
 */
public class SCTARUC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte[] command = new byte[]{0x0, 0x6, 0x10, 0xf};
        DataField field1 = new DataField(new byte[]{0x0, 0x0, 0x0, 0x0});
        DataField field2 = new DataField(new byte[]{0x1, 0x10, 0xa, 0xf});    
        DataField[] dataField = {field1, field2};
        
        Message message = new Message(command, dataField);
        
        for(byte b : command){
            System.out.println("Command :" + b);
        }
        
        for(int i=0; i < message.getMessageSize(); i++){
            System.out.println("Data Field (" + i + ")");
            System.out.println("Byte 1 :" + message.getDataField()[i].getData()[0]);
            System.out.println("Byte 2 :" + message.getDataField()[i].getData()[1]);
            System.out.println("Byte 3 :" + message.getDataField()[i].getData()[2]);
            System.out.println("Byte 4 :" + message.getDataField()[i].getData()[3]);
        }
        
    }
    
}
