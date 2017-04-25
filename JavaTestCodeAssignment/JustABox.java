/*
**
file: JustABox.java
**
purpose: Puts up a frame containing
**
an ABox component.*/

import javax.swing.*;

public class JustABox {
	
	public static void main(String[] args) {
	JFrame f = new JFrame("Just a Box");
	f.setSize(200, 200);
	f.setDefaultCloseOperation(
	JFrame.EXIT_ON_CLOSE);
	f.add(new ABox());
	f.setVisible(true);
	}
}