import javax.swing.*;

public class vehiculos {
    private javax.swing.JPanel JPanel;
    private JLabel numeracion;
    private JLabel marca;
    private JLabel anio;
    private JLabel modelo;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton retroceder;
    private JButton avanzar;

    public static void main(String[] args) {
        JFrame frame = new JFrame("vehiculos");
        frame.setContentPane(new vehiculos().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
