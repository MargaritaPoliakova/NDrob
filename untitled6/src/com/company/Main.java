package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	NDrob fract1 = new NDrob();
	fract1.setNum(3);
	fract1.setDenom(5);
	NDrob fract2 = new NDrob();
	fract2.setNum(in.nextInt());
	fract2.setDenom(in.nextInt());
        System.out.println(fract2);
		fract1.print();
		System.out.println(fract1.muiti(fract2));
		System.out.println(fract1.delenie (fract2));
		System.out.println(fract1.slogenie (fract2));
		System.out.println(fract1.vichitanie (fract2));

    }
}
