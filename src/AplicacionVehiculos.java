import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplicacionVehiculos extends JFrame {
    private JButton btnAnterior;
    private JButton btnSiguiente;
    private JLabel lblMarca;
    private JLabel lblModelo;
    private JLabel lblAnio;

    private Vehiculo[] vehiculos;
    private int indiceActual;

    public AplicacionVehiculos() {
        super("Navegador de Vehículos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        vehiculos = cargarVehiculos();
        indiceActual = 0;

        lblMarca = new JLabel();
        lblModelo = new JLabel();
        lblAnio = new JLabel();

        btnAnterior = new JButton("Anterior");
        btnSiguiente = new JButton("Siguiente");

        btnAnterior.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarVehiculoAnterior();
            }
        });

        btnSiguiente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarVehiculoSiguiente();
            }
        });

        JPanel panelBotones = new JPanel();
        panelBotones.add(btnAnterior);
        panelBotones.add(btnSiguiente);

        JPanel panelInfo = new JPanel();
        panelInfo.setLayout(new GridLayout(3, 2));
        panelInfo.add(new JLabel("Marca:"));
        panelInfo.add(lblMarca);
        panelInfo.add(new JLabel("Modelo:"));
        panelInfo.add(lblModelo);
        panelInfo.add(new JLabel("Año:"));
        panelInfo.add(lblAnio);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panelInfo, BorderLayout.CENTER);
        getContentPane().add(panelBotones, BorderLayout.SOUTH);
    }

    // Método para cargar los vehículos desde un archivo
    private Vehiculo[] cargarVehiculos() {

        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Vehiculo("Marca1", "Modelo1", 2000);
        vehiculos[1] = new Vehiculo("Marca2", "Modelo2", 2010);
        vehiculos[2] = new Vehiculo("Marca3", "Modelo3", 2020);

        return vehiculos;
    }

    private void mostrarVehiculoAnterior() {
        if (indiceActual > 0) {
            indiceActual--;
            mostrarVehiculoActual();
        }
    }

    private void mostrarVehiculoSiguiente() {
        if (indiceActual < vehiculos.length - 1) {
            indiceActual++;
            mostrarVehiculoActual();
        }
    }

    private void mostrarVehiculoActual() {
        Vehiculo vehiculoActual = vehiculos[indiceActual];
        lblMarca.setText(vehiculoActual.getMarca());
        lblModelo.setText(vehiculoActual.getModelo());
        lblAnio.setText(Integer.toString(vehiculoActual.getAnio()));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                AplicacionVehiculos aplicacion = new AplicacionVehiculos();
                aplicacion.setVisible(true);
            }
        });
    }
}
