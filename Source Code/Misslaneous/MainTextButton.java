import java.util.*;
import java.io.*;

class MainTextButton{
    public static void main(String args[]){
        Scanner s = null;
        for(int i=1; i<119; i++){
            try{
                s = new Scanner(new File("..\\..\\src\\periodictable\\elements.txt"));
            }
            catch(Exception e){}
                
            while(s.hasNext()){
                String name = s.next();
                String symbol = s.next();
                String number = s.next();
                String mass = s.next();
                String radius = s.next();
                String valence = s.next();
                String melting = s.next();
                String boiling = s.next();
                String density = s.next();
                if (i == Integer.parseInt(number)){
                    System.out.print("jButton"+i+".setBackground(new java.awt.Color(153, 204, 255));\njButton"+i+".setFont(new java.awt.Font(\"Segoe UI\", 1, 18));\njButton"+i+".setText(\""+symbol+"\");\njButton"+i+".setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));\n\n");
                }
            }
        }
    }
}