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
		String palaces = ttt.makePalace(null);
		System.out.print(palaces);
		palaces = ttt.makePalace(TicTacToe.LEFT_MAP);
		System.out.print(palaces);
		palaces = ttt.makePalace(TicTacToe.TOP_MAP);
		System.out.print(palaces);
		palaces = ttt.makePalace(TicTacToe.RIGHT_MAP);
		System.out.print(palaces);
	}
}
