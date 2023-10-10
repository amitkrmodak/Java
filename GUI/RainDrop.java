import java.awt.Graphics;
public class RainDrop{
	protected int x, y, velocity;
	private static int DELTA = 5;

	public RainDrop(int _x, int _y){
		this(_x, _y, 0);
	}

	public RainDrop(int _x, int _y, int _v){
		this.x = _x;
		this.y = _y;
		this.velocity = _v;
	}
	public void paint(Graphics g){
		g.drawLine(x, y, x+DELTA, y+DELTA);
		x = x + DELTA + velocity;
		y = y + DELTA + velocity;
	}
}