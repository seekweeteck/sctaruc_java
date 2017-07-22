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
public class DataField {
    private byte[] data = new byte[4];

    public DataField() {
    }
    
    public DataField(byte[] data) {
        setData(data);
    }
    
    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
    
    public boolean isEmpty(){
        for(byte c: data){
            if(c == 0){
                return false;
            }
        }
        return true;
    }
//    public boolean isValidData(){
//        for(byte c: data){
//            if(c==0) {
//                return false;
//            }
//        }
//        return true;
//    }
}
