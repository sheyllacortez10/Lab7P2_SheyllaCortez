/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_sheyllacortez;

import java.util.regex.Pattern;

/**
 *
 * @author DELL
 */
public class Producto {
    private int id = 0;
    private String name = "";
    private int categoria = 0;
    private double price = 0;
    private int aisle = 0;
    private int bin = 0;

    public Producto() {
    }

    public Producto(int id, String name, int categoria, double price, int aisle, int bin) {
       this.id = id;
       this.name = name;
       this.categoria = categoria;
       this.price = price;
       this.aisle = aisle;
       this.bin = bin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAisle() {
        return aisle;
    }

    public void setAisle(int aisle) {
        this.aisle = aisle;
    }

    public int getBin() {
        return bin;
    }

    public void setBin(int bin) {
        this.bin = bin;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", name=" + name + ", categoria=" + categoria + ", price=" + price + ", aisle=" + aisle + ", bin=" + bin + '}';
    }


    
}
