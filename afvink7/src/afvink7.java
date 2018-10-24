import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


public class afvink7 extends JFrame implements ActionListener {

    private JButton openButton, saveButton;
    private JFileChooser fileChooser;
    private JTextField nameField;
    private JTextArea textArea;
    private BufferedReader inFile;
    private JPanel panel;
    private int lengte = 0;
    private int start;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        afvink7 frame = new afvink7();
        frame.setSize(450, 370);
        frame.createGUI();
        frame.setVisible(true);
    }


    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        //Bovenste regel
        window.add(new JLabel("File: "));

        nameField = new JTextField(20);
        window.add(nameField);

        openButton = new JButton("Browse");
        window.add(openButton);
        openButton.addActionListener(this);

        saveButton = new JButton("Analyse");
        window.add(saveButton);
        saveButton.addActionListener(this);

        //Textarea
        window.add(new JLabel("Results: "));
        textArea = new JTextArea(8, 37);
        window.add(textArea);

        //Plaatje:
        window.add(new JLabel("Percentage: \n"));


        panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 50));

        panel.setBackground(Color.WHITE);
        window.add(panel);
    }

    public void readFile() {

        try {
            inFile = new BufferedReader(new FileReader(nameField.getText()));
            textArea.setText("");
            String line;
            String sequence = "";
            int amountAminoAcids = 0;
            int amountHydrophilicAmino = 0;
            int amountHydrophobicAmino = 0;
            int amountNeutralAmino = 0;


            while ((line = inFile.readLine()) != null) {
                char[] lineArray = line.toCharArray();
                int goed = 0;
                int strLen = line.length();
                lengte = line.length() + lengte;

                Graphics paper = panel.getGraphics();
                int start = 0;
                int einde = 0;
                int plus = 400 / lengte;

                for (char Character : lineArray) {
                    if (Character != 'A' && Character != 'C' && Character != 'D' && Character != 'E' && Character != 'F' && Character != 'G'
                            && Character != 'H' && Character != 'I' && Character != 'K' && Character != 'L' && Character != 'M' && Character != 'N'
                            && Character != 'P' && Character != 'Q' && Character != 'R' && Character != 'S' && Character != 'T' && Character != 'V'
                            && Character != 'W' && Character != 'Y') {
                        throw new NotAnAA("Invalid Amino Acid");
                    } else {
                        goed = goed + 1;
                        amountAminoAcids = amountAminoAcids + 1;


                        if (Character == 'A' || Character == 'L' || Character == 'I' || Character == 'V' || Character == 'F' || Character == 'Y' || Character == 'W') {
                            amountHydrophobicAmino = amountHydrophobicAmino + 1;
                            paper.setColor(Color.RED);
                            paper.fillRect(start, 0, einde + plus, 50);
                            start = start + plus;


                        }

                        if (Character == 'M' || Character == 'C' || Character == 'I' || Character == 'G' || Character == 'P' || Character == 'H') {
                            paper.setColor(Color.ORANGE);
                            paper.fillRect(start, 0, einde + plus, 50);
                            start = start + plus;

                        }
                        if (Character == 'N' || Character == 'Q' || Character == 'S' || Character == 'T' || Character == 'R' || Character == 'K' || Character == 'D' || Character == 'E') {
                            amountHydrophilicAmino = amountHydrophilicAmino + 1;
                            paper.setColor(Color.BLUE);
                            paper.fillRect(start, 0, einde + plus, 50);
                            start = start + plus;
                        }

                    }
                }
                if (goed == strLen) {
                    sequence = sequence + line;
                } else {
                    textArea.setText(""); //throw exception
                }
            }
            inFile.close();

            float HydrophobicPercentage = (amountHydrophobicAmino * 100.0f) / amountAminoAcids;
            float HydrophilicPercentage = (amountHydrophilicAmino * 100.0f) / amountAminoAcids;

            textArea.setText("Goede entry\n");
            textArea.append("Totale aantal Aminoacids: " + amountAminoAcids + "\n");
            textArea.append(HydrophobicPercentage + "% is hydrofoob and " + HydrophilicPercentage + "% is Hydrofiel");
            textArea.append("\nHydrofoob = Rood\nHydrofiel = Bauw\nNeutraal = Oranje");


        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "File Error: " + e.toString());
        } catch (NotAnAA ex) {
            JOptionPane.showMessageDialog(null, "File is corrupted.");
        }

    }


    @Override
    public void actionPerformed(ActionEvent event) {
        File selectedFile;
        int reply;
        if (event.getSource() == saveButton) {
            //Analyse file
            readFile();
        }
        if (event.getSource() == openButton) {
            fileChooser = new JFileChooser();
            reply = fileChooser.showOpenDialog(this);
            if (reply == JFileChooser.APPROVE_OPTION) {
                selectedFile = fileChooser.getSelectedFile();
                nameField.setText(selectedFile.getAbsolutePath());
            }
        }
    }

}

class NotAnAA extends Exception {
    /**
     * Constructor of exception
     */
    public NotAnAA() {
        /** call of the constructor of the super class: Exception
         */
        super();
    }

    public NotAnAA(String err) {
        super(err);
    }
}
