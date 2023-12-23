import java.awt.*;
import java.awt.geom.GeneralPath;

public class MyPanel extends Panel {
    public MyPanel() {
        this.setBackground(Color.white);
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        GeneralPath path = new GeneralPath();



        //windo
        g.setColor(new Color(5, 11, 49, 255));
        g.fillRect(10,10,220,220);

        g.setColor( Color.white);
        g.drawLine(120,10,120,230);
        g.drawLine(10,120,230,120);


        g.setColor(Color.white);
        g.fillOval(35,25,40,40);

        g.fillOval(15,15,5,5);
        g.fillOval(200,70,5,5);
        g.fillOval(212,50,5,5);
        g.fillOval(10,215,5,5);
        g.fillOval(155,250,5,5);
        g.setColor(Color.yellow);
        g.fillOval(25,265,2,2);
        g.fillOval(210,65,5,5);
        g.fillOval(35,25,5,5);


        //clock
        g.setColor(Color.black);
        g.drawOval(400,40,80,80);

        g.setColor( Color.black);
        g.drawLine(440,80,450,100);
        g.drawLine(440,80,420,110);



        //lamp
        g.setColor(Color.black);
        g.drawRect(250,300,80,10);

        g.drawLine(270,300,285,260);
        g.drawLine(310,300,295,260);


        g.setColor(new Color(252, 229, 0,137));
        g.fillOval(250,160,80,30);
        g.setColor(Color.black);
        g.drawOval(250,160,80,30);

        g.setColor( Color.black);
        g.drawLine(230,250,250,175);
        g.drawLine(350,250,330,175);


        g.setColor(Color.black);
        g.drawOval(245,200,20,30);
        g.drawOval(275,195,30,50);
        g.drawOval(315,200,20,30);

        g.setColor(new Color(252, 229, 0, 137));
        g.fillOval(245,200,20,30);
        g.fillOval(275,195,30,50);
        g.fillOval(315,200,20,30);

        g.setColor(Color.black);
        path.moveTo(230, 250);
        path.quadTo(290, 270, 350, 250);
        g2d.draw(path);


        //the table
        g.setColor(new Color(0, 0, 0, 100)); //  color for shadow
        g.fillRect(70, 310, 450, 510); // Draw the shadow offset from the actual shape
        g.setColor(new Color(85, 49, 17, 255));
        g.fillRect(70,310,440,500);

        //first shilf
        g.setColor(new Color(0, 0, 0, 70)); //  color for shadow
        g.fillRect(150, 320, 280, 25); // Draw the shadow offset from the actual shape
        g.setColor(new Color(129, 81, 43));
        g.fillRect(150,320,280,20);
        g.setColor(new Color(0, 0, 0));
        g.fillOval(200,325,5,5);
        g.fillOval(385,325,5,5);

        //left1
        g.setColor(new Color(0, 0, 0, 70)); //  color for shadow
        g.fillRect(100, 350, 100, 25); // Draw the shadow offset from the actual shape
        g.setColor(new Color(129, 81, 43));
        g.fillRect(100,350,100,20);
        g.setColor(new Color(0, 0, 0));
        g.fillOval(150,355,5,5);

        //left2
        g.setColor(new Color(0, 0, 0, 70)); //  color for shadow
        g.fillRect(100, 380, 100, 25); // Draw the shadow offset from the actual shape
        g.setColor(new Color(129, 81, 43));
        g.fillRect(100,380,100,20);
        g.setColor(new Color(0, 0, 0));
        g.fillOval(150,385,5,5);

        //left3
        g.setColor(new Color(0, 0, 0, 70)); //  color for shadow
        g.fillRect(100, 410, 100, 25); // Draw the shadow offset from the actual shape
        g.setColor(new Color(129, 81, 43));
        g.fillRect(100,410,100,20);
        g.setColor(new Color(0, 0, 0));
        g.fillOval(150,415,5,5);

        //left4
        g.setColor(new Color(0, 0, 0, 70)); //  color for shadow
        g.fillRect(100, 440, 100, 25); // Draw the shadow offset from the actual shape
        g.setColor(new Color(129, 81, 43));
        g.fillRect(100,440,100,20);
        g.setColor(new Color(0, 0, 0));
        g.fillOval(150,445,5,5);


        //Shadow in the mid
        g.setColor(new Color(0, 0, 0, 70)); //  color for shadow
        g.fillRect(220, 350, 140, 115); // Draw the shadow offset from the actual shape

        //right
        g.setColor(new Color(0, 0, 0, 70)); //  color for shadow
        g.fillRect(380, 350, 100, 115); // Draw the shadow offset from the actual shape
        g.setColor(new Color(129, 81, 43));
        g.fillRect(380,350,100,110);
        g.setColor(new Color(0, 0, 0));
        g.fillOval(465,400,5,5);

    }

}
