package com.company;

public class NDrob {
    private int num;
    private int denom;


    // служебные методы:

    public void setNum(int num) {
        this.num = num;
    }

    public void setDenom(int denom) {
        if (denom!=0)
          this.denom = denom;
        else
            this.denom = 1;
    }

    public int getNum() {
        return num;
    }

    public int getDenom() {
        return denom;
    }

    // вычислительные
    public NDrob muiti(NDrob secondMn){
        NDrob rez = new NDrob();
        rez.num = this.num * secondMn.num;
        rez.denom = this.denom * secondMn.denom;
        if (rez.denom<=rez.num) {celoe(rez.num, rez.denom);}
        return rez;
    }

    public NDrob delenie(NDrob secondMn){
        NDrob rez = new NDrob();
        rez.num = this.num * secondMn.denom;
        rez.denom = this.denom * secondMn.num;
        if (rez.denom<=rez.num) {celoe(rez.num, rez.denom);}
        return rez;
    }

    public NDrob slogenie (NDrob secondMn){
        NDrob rez = new NDrob();
        rez.num = (this.num * secondMn.denom) + (secondMn.denom * this.denom);
        rez.denom = this.denom * secondMn.denom;
        if (rez.denom<=rez.num) {celoe(rez.num, rez.denom);}
        return rez;
    }

    public NDrob vichitanie (NDrob secondMn){
        NDrob rez = new NDrob();
        rez.num = (this.num * secondMn.denom) - (secondMn.denom * this.denom);
        rez.denom = this.denom * secondMn.denom;
        if (rez.denom<=rez.num) {celoe(rez.num, rez.denom);}
        return rez;
    }

    public void celoe (int num, int denom){
        int a = (num/ denom);
        num =  num - (denom * a);
        if (num ==0) System.out.print(a+ "=");
        else System.out.print(a+ " "+ num +"/"+ denom + "=");
    }

    // методы поддержки
    public void print () {
        System.out.println(num+ "/" + denom );
    }
    @Override
    public String toString() {
        return num+ "/" + denom ;
    }
}
