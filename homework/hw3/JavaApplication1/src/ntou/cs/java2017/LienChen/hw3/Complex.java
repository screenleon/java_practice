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

public class Complex {
    private float real;
    private float imaginary;
    
    public Complex(){
        this.real = 0.0F;
        this.imaginary = 0.0F;
    }
    
    public Complex(float _real, float _imaginary){
        this.real = _real;
        this.imaginary = _imaginary;
    }
    
    public float getReal(){
        return this.real;
    }
    
    public float getImaginary(){
        return this.imaginary;
    }
    
    public Complex getConjugates(){
        return new Complex(this.real, (-1) * this.imaginary);
    }
    
    public double getAbsComplex(){
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2));
    }
    
    public Complex addComplex(Complex _add){
        return new Complex(this.real + _add.real, this.imaginary + _add.imaginary);
    }
    
    public Complex subComplex(Complex _sub){
        return new Complex(this.real - _sub.real, this.imaginary - _sub.imaginary);
    }
    
    public Complex multiComplex(Complex _multi){
        return new Complex(this.real * _multi.real - this.imaginary * _multi.imaginary,
                           this.real* _multi.imaginary + this.imaginary * _multi.real);
    }
    
    public Complex divComplex(Complex _div){
        float _temp = _div.getReal() * _div.getReal() + _div.getImaginary() * _div.getImaginary();
        return new Complex((this.real * _div.real + this.imaginary* _div.imaginary) / _temp,
                            (this.imaginary * _div.real - this.real * _div.imaginary) / _temp);
    }
    
    public String toString(){
        if(this.imaginary >= 0)
            return String.format("%.2f + %.2fi", this.real, this.imaginary);
        else
            return String.format("%.2f - %.2fi", this.real, (-1) * this.imaginary);
    }
}
