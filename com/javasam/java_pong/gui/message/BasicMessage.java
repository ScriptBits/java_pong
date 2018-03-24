package com.javasam.java_pong.gui.message;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import com.javasam.java_pong.Pong;
import com.javasam.java_pong.utils.GraphicsUtils;
import com.javasam.java_pong.window.Paintable;

public class BasicMessage implements Paintable {
	protected final Pong pong;
	protected final String message;

	public BasicMessage(Pong pong, String message) {
		this.pong = pong;
		this.message = message;
	}

	public void paint(Graphics g) {
		Dimension size = pong.getWindow().getContentPane().getSize();
		g.setColor(Color.WHITE);
		g.fillRect(200, 200, size.width - 400, 200);
		g.setColor(Color.DARK_GRAY);
		GraphicsUtils.drawCenteredString(g, message, new Font("arial", 1, 24), size.width / 2, size.height / 2);
	}
}
