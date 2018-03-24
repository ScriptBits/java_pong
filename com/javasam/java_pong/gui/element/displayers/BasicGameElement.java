package com.javasam.java_pong.gui.element.displayers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;

import com.javasam.java_pong.Pong;
import com.javasam.java_pong.game.GameType;
import com.javasam.java_pong.gui.element.Element;
import com.javasam.java_pong.utils.GraphicsUtils;

public class BasicGameElement extends Element {

	public BasicGameElement(Pong pong, Point location, Dimension dimensions) {
		super(pong, location, dimensions);
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(new Color(122, 214, 225));
		g.fillRoundRect(this.location.x, this.location.y, this.dimensions.width, this.dimensions.height, 20, 20);
		g.setColor(Color.WHITE);
		g.drawRoundRect(this.location.x, this.location.y, this.dimensions.width, this.dimensions.height, 20, 20);
		GraphicsUtils.drawCenteredString(g, "Play", new Font("arial", 0, 32), this.location.x + this.dimensions.width / 2, this.location.y + this.dimensions.height / 2);
	}

	@Override
	public boolean onClick() {
		pong.startGame(GameType.NORMAL);
		return true;
	}

}