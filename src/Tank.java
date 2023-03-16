import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Tank {
    private int xPozicia;
    private int yPozicia;
    private String farbaKaroserie;




    public Tank(int xPozicia, int yPozicia)
    {
        this.xPozicia = xPozicia;
        this.yPozicia = yPozicia;
        farbaKaroserie = "seda";

        kresli();
    }
    public void horizontalnyPosun(int vzdialenost) {
        int pomocna;

        if(vzdialenost < 0)
        {
            pomocna = -1;
            vzdialenost = -vzdialenost;
        }
        else
        {
            pomocna = 1;
        }

        for(int i = 0; i < vzdialenost; i++)
        {
            vymaz();
            xPozicia += pomocna;
            kresli();
        }
    }

    private void vymaz () {
        Platno platno = Platno.getPlatno();
        platno.vymaz(new Rectangle(xPozicia+15, yPozicia+5, 50, 25));
        platno.vymaz(new Rectangle(xPozicia+33, yPozicia-8, 15, 35));
        platno.vymaz(new Rectangle(xPozicia+33, yPozicia-25, 40, 10));
        platno.vymaz(new Ellipse2D.Double(xPozicia+15, yPozicia+28, 15, 15));
        platno.vymaz(new Ellipse2D.Double(xPozicia+50,yPozicia+28, 15, 15 ));
    }
    private void kresli() {
        Platno platno = Platno.getPlatno();


        platno.setBarvaPopredi(farbaKaroserie);
        platno.vybarvi(new Rectangle(xPozicia+15, yPozicia+5, 50, 25));
        platno.vybarvi(new Rectangle(xPozicia+33, yPozicia-8, 15, 35));
        platno.vymaz(new Rectangle(xPozicia+33, yPozicia-15, 40, 10));


        platno.setBarvaPopredi("cerna");
        platno.vybarvi(new Ellipse2D.Double(xPozicia+15, yPozicia+28, 15, 15));
        platno.vybarvi(new Ellipse2D.Double(xPozicia+50,yPozicia+28, 15, 15 ));
        platno.wait(10);







    }
}
