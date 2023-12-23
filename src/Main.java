import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        JFrame frame =new JFrame();
        frame.setTitle("Lamp");
        frame.setSize(600,500);

        MyPanel p =new MyPanel();
        frame.setContentPane(p);
        frame.setVisible(true);

    }
}