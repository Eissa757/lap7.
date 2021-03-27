/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package size;

/**
 *
 * @author Taif
 */
public class Size {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        public int size(){
    node n = head;
    node m = tail;
    if(n == null){
        return 0;
    }
    int size = 1;
    While(n!=m){
        size++;
        n=n.getNext();
    }
    return size;
}
    }
    
}
