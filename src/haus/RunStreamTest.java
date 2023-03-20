package haus;

import java.util.ArrayList;

public class RunStreamTest {

	//Attribute
	private static ArrayList<Person> Menschenmenge = new ArrayList<Person>();
	
    // Methoden
	private static void initMenschenmenge() {
		Person p1 = new Person("Maurice","Peters",25);
		Menschenmenge.add(p1);
		Person p2 = new Person("Michael","Wagner",20);
		Menschenmenge.add(p2);
		Person p3 = new Person("Christian","Wild",25);
		Menschenmenge.add(p3);
		Person p4 = new Person("Thorsten","Engel",20);
		Menschenmenge.add(p4);
		Person p5 = new Person("Marc","Dietz",24);
		Menschenmenge.add(p5);
		Person p6 = new Person("Fred","Mutz",23);
		Menschenmenge.add(p6);
		Person p7 = new Person("Nicole","Reinhardt",30);
		Menschenmenge.add(p7);
		Person p8 = new Person("Michael","Varga",101);
		Menschenmenge.add(p8);
		Person p9 = new Person("Maurice","Rengers",67);
		Menschenmenge.add(p9);
		Person p10 = new Person("Marc","Limes",76);
		Menschenmenge.add(p10);
		Person p11 = new Person("Stefan","Limes",34);
		Menschenmenge.add(p11);
		Person p12 = new Person("Günter","Rothaar",21);
		Menschenmenge.add(p12);
		Person p13 = new Person("Günter","Rothaar",13);
		Menschenmenge.add(p13);
		Person p14 = new Person("Günter","Vildinski",42);
		Menschenmenge.add(p14);
		Person p15 = new Person("Thorsten","Rufolfs",20);
		Menschenmenge.add(p15);
	}
	
	private static void ausgabeMenschenmenge() {
		Menschenmenge.stream().forEach(p -> System.out.println(p.getVorname() + " " + p.getNachname() + ", " + p.getAlter()));
	}

	//Main
	public static void main(String[] args) {
		initMenschenmenge();
		ausgabeMenschenmenge();		
	}
}
