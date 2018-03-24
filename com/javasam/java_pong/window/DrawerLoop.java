package com.javasam.java_pong.window;

import com.javasam.java_pong.Pong;

public class DrawerLoop extends Thread {
	
	private final Pong pong;
	private int it = 0;
	private final int FPS_LIMIT = 500;
	
	public DrawerLoop(Pong pong) {
		this.pong = pong;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000 / FPS_LIMIT);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			pong.getWindow().repaint();
			it++;
		}
	}

	public int getIterations() {
		int currentFPS = it;
		it = 0;
		return currentFPS;
	}
}
