import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Depan extends JFrame implements ActionListener{

	private JPanel contentPane;
	
	ArrayList<TRY> pesan = new ArrayList<TRY>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Depan frame = new Depan();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	JButton bselanjutnya1;
	private JLabel judul1;
	private JLabel judul2;
	private JLabel judul3;
	private JLabel judul4;
	private JButton bpemberitahuan;
	private JFrame Menu;
	private JTextField futbk;
	private JTextField fnama;
	private JLabel utbk;
	private JLabel lblNewLabel_1;
	
	public Depan() {
		setTitle("REKAYASA SISTEM KOMPUTER UNTAN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 459);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 215, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		bselanjutnya1 = new JButton("MASUK");
		bselanjutnya1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String utbk = futbk.getText();
			String nama = fnama.getText();
			if(utbk.equals("") && nama.equals("")) {
				Data next1 = new Data();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TIDAK BOLEH KOSONG");
// 0001, 0003, 0005, 0007, 0009, 0011, 0013, 0015, 0017, 0019
			} else {
			if(utbk.equals("0001") && nama.isEmpty()) {
				Data next1 = new Data();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TIDAK BOLEH KOSONG");
			} else {
			if(utbk.equals("0001")) {
				Data next1 = new Data();
				next1.setVisible(true);
				JOptionPane.showMessageDialog(null, "TERDAFTAR : " +utbk+ " " +nama);
			} else {
			if(utbk.equals("0003") && nama.isEmpty()) {
				Data next1 = new Data();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TIDAK BOLEH KOSONG");
			} else {
			if(utbk.equals("0003")) {
				Data next1 = new Data();
				next1.setVisible(true);
				JOptionPane.showMessageDialog(null, "TERDAFTAR : " +utbk+ " " +nama);
			} else {
			if(utbk.equals("0005") && nama.isEmpty()) {
				Data next1 = new Data();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TIDAK BOLEH KOSONG");
			} else {
			if(utbk.equals("0005")) {
				Data next1 = new Data();
				next1.setVisible(true);
				JOptionPane.showMessageDialog(null, "TERDAFTAR : " +utbk+ " " +nama);
			} else {
			if(utbk.equals("0007") && nama.isEmpty()) {
				Data next1 = new Data();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TIDAK BOLEH KOSONG");
			} else {
			if(utbk.equals("0007")) {
				Data next1 = new Data();
				next1.setVisible(true);
				JOptionPane.showMessageDialog(null, "TERDAFTAR : " +utbk+ " " +nama);
			} else {
			if(utbk.equals("0009") && nama.isEmpty()) {
				Data next1 = new Data();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TIDAK BOLEH KOSONG");
			} else {
			if(utbk.equals("0009")) {
				Data next1 = new Data();
				next1.setVisible(true);
				JOptionPane.showMessageDialog(null, "TERDAFTAR : " +utbk+ " " +nama);
			} else {
			if(utbk.equals("0011") && nama.isEmpty()) {
				Data next1 = new Data();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TIDAK BOLEH KOSONG");
			} else {
			if(utbk.equals("0011")) {
				Data next1 = new Data();
				next1.setVisible(true);
				JOptionPane.showMessageDialog(null, "TERDAFTAR : " +utbk+ " " +nama);
			} else {
			if(utbk.equals("0013") && nama.isEmpty()) {
				Data next1 = new Data();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TIDAK BOLEH KOSONG");
			} else {
			if(utbk.equals("0013")) {
				Data next1 = new Data();
				next1.setVisible(true);
				JOptionPane.showMessageDialog(null, "TERDAFTAR : " +utbk+ " " +nama);
			} else {
			if(utbk.equals("0015") && nama.isEmpty()) {
				Data next1 = new Data();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TIDAK BOLEH KOSONG");
			} else {
			if(utbk.equals("0015")) {
				Data next1 = new Data();
				next1.setVisible(true);
				JOptionPane.showMessageDialog(null, "TERDAFTAR : " +utbk+ " " +nama);
			} else {
			if(utbk.equals("0017") && nama.isEmpty()) {
				Data next1 = new Data();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TIDAK BOLEH KOSONG");
			} else {
			if(utbk.equals("0017")) {
				Data next1 = new Data();
				next1.setVisible(true);
				JOptionPane.showMessageDialog(null, "TERDAFTAR : " +utbk+ " " +nama);
			} else {
			if(utbk.equals("0019") && nama.isEmpty()) {
				Data next1 = new Data();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TIDAK BOLEH KOSONG");
			} else {
			if(utbk.equals("0019")) {
				Data next1 = new Data();
				next1.setVisible(true);
				JOptionPane.showMessageDialog(null, "TERDAFTAR : " +utbk+ " " +nama);
			} else {
			if(utbk.isEmpty() && nama.equals("")) {
				Data next1 = new Data();
				next1.setVisible(false);
			} else {
				JOptionPane.showMessageDialog(null, "NO. PESERTA TIDAK TERDAFTAR");
			}}}}}}}}}}}}}}}}}}}}}}}
		});
		bselanjutnya1.setBounds(265, 353, 113, 29);
		bselanjutnya1.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		bselanjutnya1.setBackground(new Color(255, 250, 205));
		contentPane.add(bselanjutnya1);
		
		judul1 = new JLabel("KONFIRMASI KELULUSAN MAHASISWA BARU JALUR SBMPTN");
		judul1.setBounds(11, 11, 616, 14);
		judul1.setHorizontalAlignment(SwingConstants.CENTER);
		judul1.setFont(new Font("Georgia", Font.BOLD, 18));
		contentPane.add(judul1);
		
		judul2 = new JLabel("PRODI REKAYASA SISTEM KOMPUTER FMIPA");
		judul2.setBounds(80, 29, 483, 14);
		judul2.setHorizontalAlignment(SwingConstants.CENTER);
		judul2.setFont(new Font("Georgia", Font.BOLD, 18));
		contentPane.add(judul2);
		
		judul3 = new JLabel("UNIVERSITAS TANJUNGPURA");
		judul3.setBounds(154, 47, 334, 14);
		judul3.setHorizontalAlignment(SwingConstants.CENTER);
		judul3.setFont(new Font("Georgia", Font.BOLD, 18));
		contentPane.add(judul3);
		
		judul4 = new JLabel("2021");
		judul4.setBounds(291, 65, 60, 14);
		judul4.setHorizontalAlignment(SwingConstants.CENTER);
		judul4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		contentPane.add(judul4);
		
		bpemberitahuan = new JButton("?");
		bpemberitahuan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pemberitahuan next = new Pemberitahuan();
				next.setVisible(true);
			}
		});
		bpemberitahuan.setBounds(295, 386, 52, 23);
		bpemberitahuan.setBackground(new Color(255, 250, 205));
		bpemberitahuan.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(bpemberitahuan);
		
		futbk = new JTextField();
		futbk.setBounds(237, 280, 168, 29);
		contentPane.add(futbk);
		futbk.setColumns(10);
		
		fnama = new JTextField();
		fnama.setColumns(10);
		fnama.setBounds(237, 312, 168, 29);
		contentPane.add(fnama);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Depan.class.getResource("/images/logo180 ok.png")));
		lblNewLabel.setBounds(230, 90, 183, 179);
		contentPane.add(lblNewLabel);
		
		utbk = new JLabel("NO. PESERTA UTBK    :");
		utbk.setHorizontalAlignment(SwingConstants.CENTER);
		utbk.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		utbk.setBounds(63, 287, 163, 14);
		contentPane.add(utbk);
		
		lblNewLabel_1 = new JLabel("NAMA LENGKAP         :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(63, 319, 164, 14);
		contentPane.add(lblNewLabel_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bselanjutnya1) {
			System.out.println("poo");
		}
	}
}
