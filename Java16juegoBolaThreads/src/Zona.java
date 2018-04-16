import java.awt.Color;
import java.awt.Graphics;

public class Zona {

	private int x;
	private int y;
	private int ancho;
	private int alto;
	private Color color;

	public Zona(int x, int y, int ancho, int alto, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
		this.color = color;
	}

	public boolean detectarColision(Bola b) {
		if (b.getX() >= this.x && b.getX() <= (this.x + this.ancho)
				&& b.getY() >= this.x && b.getY() <= (this.x + this.ancho)) {

			return true;

		} else {
			return false;

		}

	}

	public void dibujar(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, ancho, alto);

	}

}
