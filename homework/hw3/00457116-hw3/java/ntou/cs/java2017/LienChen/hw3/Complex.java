/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.LienChen.hw3;

/**
 *
 * @author Lien
 */

//complex class to set the real number and imaginary number
public class Complex {
    private float real;
    private float imaginary;
    
    //construct complex with 0 + 0i
    public Complex(){
        this.real = 0.0F;
        this.imaginary = 0.0F;
    }
    
    //construct complex with _real + _imaginayr i
    public Complex(float _real, float _imaginary){
        this.real = _real;
        this.imaginary = _imaginary;
    }
    
    //get the real number
    public float getReal(){
        return this.real;
    }
    
    //get the imaginary number
    public float getImaginary(){
        return this.imaginary;
    }
    
    // get the conjugate of this complex
    public Complex getConjugates(){
        return new Complex(this.real, (-1) * this.imaginary);
    }
    
    //get the absolute of this complex
    public double getAbsComplex(){
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2));
    }
    
    //add the complex to this object
    public Complex addComplex(Complex _add){
        return new Complex(this.real + _add.real, this.imaginary + _add.imaginary);
    }
    
    //subtract the complex to this object 
    public Complex subComplex(Complex _sub){
        return new Complex(this.real - _sub.real, this.imaginary - _sub.imaginary);
    }
    
    //multiply the complex to this object
    public Complex multiComplex(Complex _multi){
        return new Complex(this.real * _multi.real - this.imaginary * _multi.imaginary,
                           this.real* _multi.imaginary + this.imaginary * _multi.real);
    }
    
    //divide the complex to this object
    public Complex divComplex(Complex _div){
        float _temp = _div.getReal() * _div.getReal() + _div.getImaginary() * _div.getImaginary();
        return new Complex((this.real * _div.real + this.imaginary* _div.imaginary) / _temp,
                            (this.imaginary * _div.real - this.real * _div.imaginary) / _temp);
    }
    
    //get the string of this object's real number and imaginary number
    public String toString(){
        if(this.imaginary >= 0)
            return String.format("%.2f + %.2fi", this.real, this.imaginary);
        else
            return String.format("%.2f - %.2fi", this.real, (-1) * this.imaginary);
    }
}
