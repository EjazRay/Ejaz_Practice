/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pract_week1_week3;

/**
 *
 * @author ejazr
 */
public class Inventory {
    
    private long id;
    private String name; 
    private String cat; 
    private int stockNum;

    public int getStockNum() {
        return stockNum;
    }

    public void setStockNum(int stock) {
        this.stockNum = stock;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }
    
    
}

