import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class Data extends JFrame {

	private JPanel contentPane;
	private JTextField utbkf;
	private JTextField namaf;
	private JTextField nisnf;
	private JTextField ttlf;
	private JTextField asalsklhf;
	private JTextField emailf;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_14;
	private JButton simpan;
	private JTextArea textArea;
	private JScrollPane scrollPane;
	private JButton btnSelesai;
	private JButton hapus;
	
	ArrayList<coba> array = new ArrayList<coba>();
	private JScrollPane scrollPane_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Data frame = new Data();
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
	public Data() {
		setTitle("REKAYASA SISTEM KOMPUTER UNTAN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 459);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 215, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
			
		JLabel lblNewLabel = new JLabel("DATA CALON MAHASISWA BARU (LULUS)");
		lblNewLabel.setBounds(27, 11, 606, 14);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("JALUR SBMPTN PRODI REKAYASA SISTEM KOMPUTER");
		lblNewLabel_1.setBounds(37, 27, 596, 14);
		lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("FMIPA UNIVERSITAS TANJUNGPURA      ");
		lblNewLabel_2.setBounds(115, 43, 413, 14);
		lblNewLabel_2.setFont(new Font("Georgia", Font.BOLD, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("2021");
		lblNewLabel_3.setBounds(489, 45, 46, 14);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		utbkf = new JTextField();
		utbkf.setBounds(245, 69, 153, 20);
		utbkf.setColumns(10);
		
		namaf = new JTextField();
		namaf.setBounds(245, 91, 153, 20);
		namaf.setColumns(10);
		
		nisnf = new JTextField();
		nisnf.setBounds(245, 113, 153, 20);
		nisnf.setColumns(10);
		
		ttlf = new JTextField();
		ttlf.setBounds(245, 135, 153, 20);
		ttlf.setColumns(10);
		
		asalsklhf = new JTextField();
		asalsklhf.setBounds(245, 157, 153, 20);
		asalsklhf.setColumns(10);
		
		emailf = new JTextField();
		emailf.setBounds(245, 179, 153, 20);
		emailf.setColumns(10);
		
		lblNewLabel_4 = new JLabel("NO. PESERTA UTBK     :");
		lblNewLabel_4.setBounds(63, 71, 172, 14);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_5 = new JLabel("NAMA LENGKAP          :");
		lblNewLabel_5.setBounds(64, 93, 172, 14);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		lblNewLabel_6 = new JLabel("NISN                               :");
		lblNewLabel_6.setBounds(67, 115, 165, 14);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		JLabel lblNewLabel_7 = new JLabel("TEMPAT, TGL, LAHIR   :");
		lblNewLabel_7.setBounds(63, 137, 172, 14);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_8 = new JLabel("ASAL SEKOLAH            :");
		lblNewLabel_8.setBounds(63, 159, 172, 14);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_9 = new JLabel("ALAMAT EMAIL           :");
		lblNewLabel_9.setBounds(67, 181, 168, 14);
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_10 = new JLabel("*menggunakan huruf kapital");
		lblNewLabel_10.setBounds(396, 91, 132, 14);
		lblNewLabel_10.setForeground(Color.DARK_GRAY);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 9));
		
		lblNewLabel_11 = new JLabel("*cth : Riau, 03-12-2002");
		lblNewLabel_11.setBounds(396, 135, 97, 11);
		lblNewLabel_11.setForeground(Color.DARK_GRAY);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 9));
		
		lblNewLabel_12 = new JLabel("*menggunakan email aktif");
		lblNewLabel_12.setBounds(396, 179, 127, 11);
		lblNewLabel_12.setForeground(Color.DARK_GRAY);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 9));
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel_2);
		contentPane.add(lblNewLabel_3);
		contentPane.add(utbkf);
		contentPane.add(namaf);
		contentPane.add(nisnf);
		contentPane.add(ttlf);
		contentPane.add(asalsklhf);
		contentPane.add(emailf);
		contentPane.add(lblNewLabel_4);
		contentPane.add(lblNewLabel_5);
		contentPane.add(lblNewLabel_6);
		contentPane.add(lblNewLabel_7);
		contentPane.add(lblNewLabel_8);
		contentPane.add(lblNewLabel_9);
		contentPane.add(lblNewLabel_10);
		contentPane.add(lblNewLabel_11);
		contentPane.add(lblNewLabel_12);
		
		lblNewLabel_14 = new JLabel("*menggunakan huruf kapital");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_14.setForeground(Color.DARK_GRAY);
		lblNewLabel_14.setBounds(396, 157, 127, 14);
		contentPane.add(lblNewLabel_14);
		
		JTextArea textArea1 = new JTextArea();
		textArea1.setEditable(false);
		textArea1.setBounds(245, 210, 250, 197);
		contentPane.add(textArea1);
		textArea1.setText("");
		textArea1.setLineWrap(true);
		textArea1.setWrapStyleWord(true);
		textArea1.setBackground(new Color(200,200,200));
		textArea1.setBorder(BorderFactory.createBevelBorder(1));
		textArea1.setForeground(new Color(55,55,55));
		textArea1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		simpan = new JButton("SIMPAN");
		simpan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String noutbk = utbkf.getText();
				String nama = namaf.getText();
				String nisn = nisnf.getText();
				String ttl = ttlf.getText();
				String asalsklh = asalsklhf.getText();
				String email = emailf.getText();
				
			array.add(new coba(noutbk, nama, nisn, ttl, asalsklh, email));
		
			if(noutbk.isEmpty() && nama.isEmpty() && nisn.isEmpty() && ttl.isEmpty() && asalsklh.isEmpty() && email.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TIDAK BOLEH KOSONG");
			} else {
			if(noutbk.equals("0001") && nama.isEmpty() && nisn.isEmpty() && ttl.isEmpty() && asalsklh.isEmpty() && email.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0001") && nama.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0001") && nisn.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0001") && ttl.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0001") && asalsklh.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0001") && email.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0001")) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TERSIMPAN");
				array.add(new coba(noutbk, nama, nisn, ttl, asalsklh, email));
			for (int i=0; i<array.size(); i++) {
					textArea1.setText ("\r\n ----------------------- \n NO. Peserta: " + array.get(i).noutbkf + "\n Nama: " + array.get(i).namaf +
						"\n NISN: " + array.get(i).nisnf + "\n TTL: " + array.get(i).ttlf +
						"\n Asal Sekolah: " + array.get(i).asalsklhf + "\n Email: " + array.get(i).emailf);
				}
			} else {
				if(noutbk.equals("0003") && nama.isEmpty() && nisn.isEmpty() && ttl.isEmpty() && asalsklh.isEmpty() && email.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0003") && nama.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0003") && nisn.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0003") && ttl.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0003") && asalsklh.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0003") && email.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
					JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0003")) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TERSIMPAN");	
				array.add(new coba(noutbk, nama, nisn, ttl, asalsklh, email));
			for (int i=0; i<array.size(); i++) {
					textArea1.setText ("\r\n ----------------------- \n NO. Peserta: " + array.get(i).noutbkf + "\n Nama: " + array.get(i).namaf +
						"\n NISN: " + array.get(i).nisnf + "\n TTL: " + array.get(i).ttlf +
						"\n Asal Sekolah: " + array.get(i).asalsklhf + "\n Email: " + array.get(i).emailf);
				}
			} else {
			if(noutbk.equals("0005") && nama.isEmpty() && nisn.isEmpty() && ttl.isEmpty() && asalsklh.isEmpty() && email.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0005") && nama.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0005") && nisn.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0005") && ttl.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0005") && asalsklh.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0005") && email.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0005")) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TERSIMPAN");
				array.add(new coba(noutbk, nama, nisn, ttl, asalsklh, email));
			for (int i=0; i<array.size(); i++) {
					textArea1.setText ("\r\n ----------------------- \n NO. Peserta: " + array.get(i).noutbkf + "\n Nama: " + array.get(i).namaf +
						"\n NISN: " + array.get(i).nisnf + "\n TTL: " + array.get(i).ttlf +
						"\n Asal Sekolah: " + array.get(i).asalsklhf + "\n Email: " + array.get(i).emailf);
				}
			} else {
				if(noutbk.equals("0007") && nama.isEmpty() && nisn.isEmpty() && ttl.isEmpty() && asalsklh.isEmpty() && email.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0007") && nama.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0007") && nisn.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0007") && ttl.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0007") && asalsklh.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0007") && email.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0007")) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TERSIMPAN");
				array.add(new coba(noutbk, nama, nisn, ttl, asalsklh, email));
			for (int i=0; i<array.size(); i++) {
					textArea1.setText ("\r\n ----------------------- \n NO. Peserta: " + array.get(i).noutbkf + "\n Nama: " + array.get(i).namaf +
						"\n NISN: " + array.get(i).nisnf + "\n TTL: " + array.get(i).ttlf +
						"\n Asal Sekolah: " + array.get(i).asalsklhf + "\n Email: " + array.get(i).emailf);
				}
			} else {
			if(noutbk.equals("0009") && nama.isEmpty() && nisn.isEmpty() && ttl.isEmpty() && asalsklh.isEmpty() && email.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0009") && nama.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0009") && nisn.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0009") && ttl.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0009") && asalsklh.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0009") && email.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0009")) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TERSIMPAN");
				array.add(new coba(noutbk, nama, nisn, ttl, asalsklh, email));
			for (int i=0; i<array.size(); i++) {
					textArea1.setText ("\r\n ----------------------- \n NO. Peserta: " + array.get(i).noutbkf + "\n Nama: " + array.get(i).namaf +
						"\n NISN: " + array.get(i).nisnf + "\n TTL: " + array.get(i).ttlf +
						"\n Asal Sekolah: " + array.get(i).asalsklhf + "\n Email: " + array.get(i).emailf);
				}
			} else {
				if(noutbk.equals("0011") && nama.isEmpty() && nisn.isEmpty() && ttl.isEmpty() && asalsklh.isEmpty() && email.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0011") && nama.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0011") && nisn.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0011") && ttl.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0011") && asalsklh.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0011") && email.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0011")) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TERSIMPAN");
				array.add(new coba(noutbk, nama, nisn, ttl, asalsklh, email));
			for (int i=0; i<array.size(); i++) {
					textArea1.setText ("\r\n ----------------------- \n NO. Peserta: " + array.get(i).noutbkf + "\n Nama: " + array.get(i).namaf +
						"\n NISN: " + array.get(i).nisnf + "\n TTL: " + array.get(i).ttlf +
						"\n Asal Sekolah: " + array.get(i).asalsklhf + "\n Email: " + array.get(i).emailf);
				}
			} else {
			if(noutbk.equals("0013") && nama.isEmpty() && nisn.isEmpty() && ttl.isEmpty() && asalsklh.isEmpty() && email.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0013") && nama.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0013") && nisn.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0013") && ttl.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0013") && asalsklh.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0013") && email.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0013")) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TERSIMPAN");
				array.add(new coba(noutbk, nama, nisn, ttl, asalsklh, email));
			for (int i=0; i<array.size(); i++) {
					textArea1.setText ("\r\n ----------------------- \n NO. Peserta: " + array.get(i).noutbkf + "\n Nama: " + array.get(i).namaf +
						"\n NISN: " + array.get(i).nisnf + "\n TTL: " + array.get(i).ttlf +
						"\n Asal Sekolah: " + array.get(i).asalsklhf + "\n Email: " + array.get(i).emailf);
				}
			} else {
			if(noutbk.equals("0015") && nama.isEmpty() && nisn.isEmpty() && ttl.isEmpty() && asalsklh.isEmpty() && email.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0015") && nama.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0015") && nisn.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0015") && ttl.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0015") && asalsklh.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0015") && email.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0015")) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TERSIMPAN");
				array.add(new coba(noutbk, nama, nisn, ttl, asalsklh, email));
			for (int i=0; i<array.size(); i++) {
					textArea1.setText ("\r\n ----------------------- \n NO. Peserta: " + array.get(i).noutbkf + "\n Nama: " + array.get(i).namaf +
						"\n NISN: " + array.get(i).nisnf + "\n TTL: " + array.get(i).ttlf +
						"\n Asal Sekolah: " + array.get(i).asalsklhf + "\n Email: " + array.get(i).emailf);
				}
			} else {
			if(noutbk.equals("0017") && nama.isEmpty() && nisn.isEmpty() && ttl.isEmpty() && asalsklh.isEmpty() && email.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0017") && nama.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0017") && nisn.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0017") && ttl.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0017") && asalsklh.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0017") && email.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0017")) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TERSIMPAN");
				array.add(new coba(noutbk, nama, nisn, ttl, asalsklh, email));
			for (int i=0; i<array.size(); i++) {
					textArea1.setText ("\r\n ----------------------- \n NO. Peserta: " + array.get(i).noutbkf + "\n Nama: " + array.get(i).namaf +
						"\n NISN: " + array.get(i).nisnf + "\n TTL: " + array.get(i).ttlf +
						"\n Asal Sekolah: " + array.get(i).asalsklhf + "\n Email: " + array.get(i).emailf);
				}
			} else {
			if(noutbk.equals("0019") && nama.isEmpty() && nisn.isEmpty() && ttl.isEmpty() && asalsklh.isEmpty() && email.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0019") && nama.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0019") && nisn.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0019") && ttl.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0019") && asalsklh.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0019") && email.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA HARUS LENGKAP");
			} else {
			if(noutbk.equals("0019")) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TERSIMPAN");
				array.add(new coba(noutbk, nama, nisn, ttl, asalsklh, email));
			for (int i=0; i<array.size(); i++) {
				textArea1.setText ("\r\n ----------------------- \n NO. Peserta: " + array.get(i).noutbkf + "\n Nama: " + array.get(i).namaf +
					"\n NISN: " + array.get(i).nisnf + "\n TTL: " + array.get(i).ttlf +
					"\n Asal Sekolah: " + array.get(i).asalsklhf + "\n Email: " + array.get(i).emailf);
			}
			}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
		});
		simpan.setFont(new Font("Arial Narrow", Font.BOLD, 10));
		simpan.setBackground(new Color(255, 250, 205));
		simpan.setBounds(166, 212, 69, 20);
		contentPane.add(simpan);
		
		btnSelesai = new JButton("SELESAI");
		btnSelesai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String noutbk = utbkf.getText();
				String nama = namaf.getText();
				String nisn = nisnf.getText();
				String ttl = ttlf.getText();
				String asalsklh = asalsklhf.getText();
				String email = emailf.getText();

			if(noutbk.isEmpty() && nama.isEmpty() && nisn.isEmpty() && ttl.isEmpty() && asalsklh.isEmpty() && email.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TIDAK BOLEH KOSONG");
			} else {
			if(noutbk.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TIDAK BOLEH KOSONG");
			} else {
			if(nama.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TIDAK BOLEH KOSONG");
			} else {
			if(nisn.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TIDAK BOLEH KOSONG");
			} else {
			if(ttl.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TIDAK BOLEH KOSONG");
			} else {
			if(asalsklh.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TIDAK BOLEH KOSONG");
			} else {
			if(email.isEmpty()) {
				Akhir next1 = new Akhir();
				next1.setVisible(false);
				JOptionPane.showMessageDialog(null, "DATA TIDAK BOLEH KOSONG");
			} else {
				Akhir next1 = new Akhir();
				next1.setVisible(true);
			}}}}}}}}
		});
		btnSelesai.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		btnSelesai.setBackground(new Color(255, 250, 205));
		btnSelesai.setBounds(520, 380, 113, 29);
		contentPane.add(btnSelesai);
	}
}
