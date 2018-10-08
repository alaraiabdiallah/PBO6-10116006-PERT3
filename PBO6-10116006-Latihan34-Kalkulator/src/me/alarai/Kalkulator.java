package me.alarai;

public class Kalkulator {
    public double value1;
    public double value2;

    public double tambahBilangan(){
        return this.value1 + this.value2;
    }

    public double kurangBilangan(){
        return this.value1 - this.value2;
    }

    public double kaliBilangan(){
        return this.value1 * this.value2;
    }

    public double bagiBilangan(){
        return this.value1 / this.value2;
    }

    public double sisaBilangan(){
        return this.value1 % this.value2;
    }
}
