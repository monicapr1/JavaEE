/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methods2;

/**
 *
 * @author Monica Padilla
 */
public class figura {
    
   // atributos
    double lado1, lado2;
    double perimetro;
    double area;
    double radio;
    double base;
    double altura;

    // overwritting / overloanding
    // constructor (endpoint) o API
    public figura(){
       //lado= 0.0;
       perimetro= 0.0;
       area= 0.0;
        
    }
    // circulo
    public figura (double  radio){
        this.radio= radio;
    }
    // cuadrado
    public figura (double lado1, double lado2){
        this.lado1= lado1;
        this.lado2= lado2;
    }
    public figura (double base, double altura, double area){
        
    }
    public void calcularaArea(){
        area= lado1*lado2;
    }
    private void calcularPerimetro(){
        System.out.println("metodo privado");
        
    }
    protected void saludo(){
            
    }
    public static void main(String[] args) {
        figura f = new figura(15);
        figura fcuad= new figura(2,5);
    }
}
