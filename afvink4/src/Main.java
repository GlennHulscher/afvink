import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Main extends JFrame implements ActionListener {
    private JTextField textField1, textField2;
    private JLabel label1, label2;
    private JButton button;
    private Translator translator = new Translator();
    private List<String> lijst = new ArrayList<String>();

    public static void main(String[] args) {
        Main frame = new Main();
        frame.setSize(250, 250);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        label1 = new JLabel("Aminozuren 1 lettercode: ");
        window.add(label1);
        textField1 = new JTextField("", 20);
        window.add(textField1);
        System.out.println(textField1);
        button = new JButton("Translate");
        button.addActionListener(this);
        window.add(button);
        label2 = new JLabel("Aminozuren 3 lettercode: ");
        window.add(label2);
        textField2 = new JTextField("", 20);
        window.add(textField2);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String aminozuur1 = textField1.getText().toUpperCase();
                for (int i = 0, n=aminozuur1.length(); i < n; i++){
                    char c = aminozuur1.charAt(i);
                    String letter = Character.toString(c);
                    String vertaling = null;
                    try {
                        vertaling = Translator.one2three(letter);
                    } catch (NotAnAA notAnAA) {
                        notAnAA.printStackTrace();
                    }
                    lijst.add(vertaling +"-");
                    StringBuilder sb = new StringBuilder();
                    for (String s : lijst){
                        sb.append(s);
                    }
                    //System.out.println(sb);
                    textField2.setText(sb.toString());
                    textField2.repaint();
                }
            }
        });
    }

    public void actionPerformed (ActionEvent event){
        return;


    }
}
