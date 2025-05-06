import java.util.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class Master extends JFrame implements KeyListener, ActionListener, MouseListener {
    public Master(String judul) {
        super(judul);
        setSize(400, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel lblJudul = new JLabel("Register Mahasiswa");
        lblJudul.setSize(100, 100);
        lblJudul.setBounds(135, 30, 200, 25);
        add(lblJudul);

        JLabel lblNRP = new JLabel("NRP: ");
        lblNRP.setBounds(20, 60, 100, 25);
        add(lblNRP);

        JTextField txtNRP = new JTextField();
        txtNRP.setBounds(135, 60, 200, 25);
        add(txtNRP);

        JLabel lblNama = new JLabel("Nama: ");
        lblNama.setBounds(20, 95, 100, 25);
        add(lblNama);

        JTextField txtNama = new JTextField();
        txtNama.setBounds(135, 95, 200, 25);
        add(txtNama);

        JLabel lblJK = new JLabel("Jenis Kelamin: ");
        lblJK.setBounds(20, 130, 100, 25);
        add(lblJK);
        JRadioButton rdL = new JRadioButton("Laki Laki");
        rdL.setBounds(130, 130, 100, 25);
        add(rdL);
        JRadioButton rdP = new JRadioButton("Perempuan");
        rdP.setBounds(230, 130, 100, 25);
        add(rdP);

        ButtonGroup groupJK = new ButtonGroup();
        groupJK.add(rdL);
        groupJK.add(rdP);

        JLabel lblJur = new JLabel("Jurusan: ");
        lblJur.setBounds(20, 165, 100, 25);
        add(lblJur);

        String jur[] = { "Elektro", "Informatika", "DKV", "SIB" };
        JComboBox<String> cbJur = new JComboBox<>(jur);
        cbJur.setBounds(135, 165, 200, 25);
        add(cbJur);

        JLabel lblSetuju = new JLabel("Setuju(?): ");
        lblSetuju.setBounds(20, 200, 100, 25);
        add(lblSetuju);

        JCheckBox ckSetuju = new JCheckBox("Setuju");
        ckSetuju.setBounds(130, 200, 100, 25);
        add(ckSetuju);

        // txtNRP.addKeyListener((KeyListener) new KeyAdapter() {
        // public void keyTyped(KeyEvent e) {
        // System.out.println("Ngetik: " + e.getKeyChar());
        // }
        // });

        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(260, 250, 75, 25);
        add(btnSubmit);

        JPanel panel = new JPanel();
        panel.setSize(100, 100);
        panel.setBackground(Color.CYAN);
        panel.setBounds(10, 350, 100, 100);
        add(panel);

        txtNRP.addKeyListener(this);
        cbJur.addActionListener(this);
        btnSubmit.addActionListener(this);
        panel.addMouseListener(this);

        setVisible(true);
        // repaint(); // Gambar Ulang
        // revalidate(); // Posisi Ulang
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Mengetik: " + e.getKeyChar());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object sumber = e.getSource();
        if (sumber instanceof JComboBox) {
            JComboBox s = (JComboBox) e.getSource();
            String pilihan = (String) s.getSelectedItem();
            System.out.println("Jurusan yang dipilih: " + pilihan);
        } else {
            JButton btn = (JButton) sumber;
            String tulisan = btn.getText();
            if (tulisan.equalsIgnoreCase("Submit")) {
                System.out.println("Tombol Submit ditekan!");
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Y: " + e.getY());
        System.out.println("X: " + e.getX());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }
}
