package clasevehiculo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author geo
 */
public class Vehiculo {
   private String Carro;
    private String Placa;
    private int NumLantas; 

    public String getCarro() {
        return Carro;
    }

    public void setCarro(String Carro) {
        this.Carro = Carro;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public int getNumLantas() {
        return NumLantas;
    }

    public void setNumLantas(int NumLantas) {
        this.NumLantas = NumLantas;
    }  
}
