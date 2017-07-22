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
public class Message {
    private byte[] command = new byte[4];
    private int size;
    private DataField[] dataField;

    public Message() {
    }

    public Message(byte[] command, DataField[] dataField) {
        this.size = dataField.length;
        this.dataField = dataField;
    }

    public byte[] getCommand() {
        return command;
    }

    public void setCommand(byte[] command) {
        this.command = command;
    }

    public int getMessageSize() {
        return size;
    }

    public DataField[] getDataField() {
        return dataField;
    }

    public void setDataField(DataField[] dataField) {
        this.size = dataField.length;
        this.dataField = dataField;
    }
    
    public boolean isValidMessage(){
        for(int i=0; i < this.size; i++){
            if(dataField[i].isEmpty()){
                return false;
            }
        }
        return true;
    }
}
