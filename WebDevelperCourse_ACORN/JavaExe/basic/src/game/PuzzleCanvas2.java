package game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;


public class PuzzleCanvas2 extends Canvas {
	
	private Puzzle puzzle;
	
	public PuzzleCanvas2()
	{
		// ������� ����� ���� �غ��ϱ�
		PuzzleContext.setCanvas(this);
		
		// ���� �����ϱ�
		puzzle = new Puzzle(2);
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
		puzzle.paint(g);
	}
}
