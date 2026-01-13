/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pract_week1_week3;

/**
 *
 * @author ejazr
 */
public class Pract_Week1_Week3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Inventory inv[] = new Inventory[4]; 
        
        Inventory inv1 = new Inventory();
        inv1.setId(12); 
        inv1.setName("Pen");
        inv1.setCat("Pens");
        inv1.setStockNum(1);
        inv[0] = (inv1);
        
        Inventory inv2 = new Inventory();
        inv2.setId(13); 
        inv2.setName("Pencil");
        inv2.setCat("Pencils");
        inv2.setStockNum(1);
        inv[1] = (inv2);
        
        
        Inventory inv3 = new Inventory();
        inv3.setId(14); 
        inv3.setName("Marker");
        inv3.setCat("Markers");
        inv3.setStockNum(1);
        inv[2] = (inv3);
        
        Inventory inv4 = new Inventory();
        inv4.setId(15); 
        inv4.setName("Crayon");
        inv4.setCat("Crayons");
        inv4.setStockNum(1);
        inv[3] = (inv4);
        
        for(Inventory in:inv){
            System.out.print(in.getCat() + " " + in.getId() + " " + in.getName() + "\n"); 
        }
        // test 3 now 
        // another test 
    }
    
}



