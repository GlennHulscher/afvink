import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Afvinkopdracht2 extends JFrame implements ActionListener {
    private JPanel panel;
    private  JTextField textfield1, textfield2;
    private JLabel label1, label2;

    public static void main(String[] args) {
        Afvinkopdracht2 frame = new Afvinkopdracht2();
        frame.setSize(500, 500);
        frame.createGUI();
        frame.setVisible(true);
    }

    private JButton button1;

    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500,400));
        panel.setBackground(Color.white);
        window.add(panel);

        label1 = new JLabel(" x");
        window.add(label1);
        textfield1 = new JTextField("10",5);
        window.add(textfield1);
        label2 = new JLabel(" y");
        window.add(label2);
        textfield2 = new JTextField("10",5);
        window.add(textfield2);
        button1 = new JButton("Klik hier");
        button1.addActionListener(this);
        window.add(button1);
    }

    public void actionPerformed (ActionEvent event) {
        int x;
        int y;
        x = Integer.parseInt(textfield1.getText());
        y = Integer.parseInt(textfield2.getText());
        Graphics paper = panel.getGraphics();
        paper.setColor(Color.white);
        paper.fillRect(0, 0, 600, 500);
        paper.setColor(Color.blue);
        paper.fillOval(x, y, 50, 50);
        paper.fillOval(x, y + 200, 50, 50);
        paper.setColor(Color.black);
        paper.drawLine(x + 40, y + 40, x + 140, y + 100);
        paper.drawLine(x + 45, y + 220, x + 140, y + 145);
        paper.setColor(Color.red);
        paper.fillOval(x + 130, y + 90, 70, 70);
    }
}