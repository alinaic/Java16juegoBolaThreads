import java.awt.Color;
import java.awt.Graphics;

public class Bola {

	private int x;
	private int y;
	private int ancho;
	private int alto;
	public Direcciones direccionBola = Direcciones.DERECHA;

	// si no hay ningun constructor mas java inclue uno vacio que no pide nada
	// ni hace nada
	// constructor vacio por defecto

	public Bola(int x, int y) {
		this.x = x;
		this.y = y;
		this.ancho = 50;
		this.alto = 50;

	}

	public void mover() {

		if (direccionBola == Direcciones.DERECHA) {
			x++;
		} else if (direccionBola == Direcciones.ABAJO) {
			y++;
		}
	}

	public void dibujar(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(x, y, ancho, alto);
	}

	// metodo de acceso para la x
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
