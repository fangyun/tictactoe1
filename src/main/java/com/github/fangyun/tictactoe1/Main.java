/**
 * GPL
 */
package com.github.fangyun.tictactoe1;

/**
 * @author FangYun
 *
 */
public class Main {
	public static void main(String[] args) {
		TicTacToe ttt = new TicTacToe();
		String palaces = ttt.makePalace();
		System.out.println(palaces);
	}
}
