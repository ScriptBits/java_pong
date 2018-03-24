package com.javasam.java_pong.gui;

import java.util.ArrayList;
import java.util.List;

import com.javasam.java_pong.Pong;
import com.javasam.java_pong.gui.element.Element;

public abstract class Gui {

	protected final Pong pong;
	protected final List<Element> elements = new ArrayList<Element>();
	
	public Gui(Pong pong) {
		this.pong = pong;
	}

	public final List<Element> getElements() {
		return elements;
	}
}
