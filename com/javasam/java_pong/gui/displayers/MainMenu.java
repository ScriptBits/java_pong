package com.javasam.java_pong.gui.displayers;

import java.awt.Dimension;
import java.awt.Point;

import com.javasam.java_pong.Pong;
import com.javasam.java_pong.gui.Gui;
import com.javasam.java_pong.gui.element.displayers.BasicGameElement;
import com.javasam.java_pong.gui.element.displayers.CPUElement;

public class MainMenu extends Gui {

	public MainMenu(Pong pong) {
		super(pong);
		
		Dimension size = pong.getWindow().getContentPane().getSize();
		elements.add(new BasicGameElement(pong, new Point(size.width / 2 - 100, size.height / 2 - 125), new Dimension(200, 150)));
		elements.add(new CPUElement(pong, new Point(size.width / 2 - 100, size.height / 2 + 75), new Dimension(200, 100)));
	}

}
