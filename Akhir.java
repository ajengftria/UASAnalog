import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class Akhir extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Akhir frame = new Akhir();
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
	public Akhir() {
		setTitle("REKAYASA SISTEM KOMPUTER UNTAN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 459);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 215, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTextArea txtrAaaa = new JTextArea();
		txtrAaaa.setBackground(new Color(255, 250, 205));
		txtrAaaa.setEditable(false);
		txtrAaaa.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtrAaaa.setText("                                               Persyaratan Daftar Ulang Mahasiswa Baru FMIPA UNTAN\r\n" + 
				"                                                               Tahun Ajaran 2021/2022 JALUR SBMPTN.\r\n"
				+ "                                                -------------------------------------------------------------------------------\r\n"
				+ "        Mahasiswa Baru yang telah berhasil melakukan proses\r\n"
				+ "    konfirmasi kelulusan jalur SBMPTN PRODI SISKOM UNTAN 2021,\r\n"
				+ "    diwajibkan untuk melakukan proses daftar ulang. Persyaratan Daftar Ulang, antara lain:\r\n"
				+ "\r\n"
				+ " 1.  1 lembar fotokopi Kartu Tanda Mahasiswa (KTM)\r\n"
				+ " 2.  Kwitansi pembayaran UKT asli (warna merah) atau\r\n"
				+ "      Surat keterangan dari BAK. Untan untuk penerima beasiswa BIDIKMISI\r\n"
				+ " 3.  2 lembar pasfoto berwarna ukuran 3x4\r\n"
				+ " 4.  1 lembar Biodata mahasiswa/i yang telah diisi secara online melalui SIAKAD UNTAN\r\n"
				+ " 5.  1 lembar fotokopi SKHU, Ijazah, Kartu Keluarga, Akte Kelahiran, KTP\r\n"
				+ " 6.  1 lembar Surat Pernyataan bebas (Narkoba/Napza) yang telah diisi secara online melalui SIAKAD UNTAN\r\n"
				+ " 7.  1 lembar Keterangan Bebas Narkoba dari Laboratorium/Klinik Pratama Untan/Fasilitas Kesehatan lain\r\n"
				+ " 8.  1 Lembar surat keterangan bebas buta warna dari dokter\r\n"
				+ "\r\n"
				+ "Semua persyaratan diatas harus dikirim dalam bentuk hardcopy (Berkas) ke Gedung FMIPA UNTAN.\r\n"
				+ "Mengingat kondisi saat ini masih belum sepenuhnya kondusif dikarenakan Covid-19,\r\n"
				+ "maka proses pengiriman persyaratan tersebut wajib menggunakan jasa pengiriman pos\r\n"
				+ "(untuk menghindari kerumunan serta memutus mata rantai penyebaran covid-19).");
		
		JLabel lblAndaTelahMelakukan = new JLabel("ANDA TELAH MELAKUKAN PROSES KONFIRMASI KELULUSAN");
		lblAndaTelahMelakukan.setHorizontalAlignment(SwingConstants.CENTER);
		lblAndaTelahMelakukan.setFont(new Font("Georgia", Font.BOLD, 18));
		
		JLabel lblJalurSbmptnProgram = new JLabel("JALUR SBMPTN PROGRAM STUDI REKAYASA SISTEM KOMPUTER.");
		lblJalurSbmptnProgram.setHorizontalAlignment(SwingConstants.CENTER);
		lblJalurSbmptnProgram.setFont(new Font("Georgia", Font.BOLD, 17));
		
		JButton btnSelesai = new JButton("SELESAI");
		btnSelesai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Depan next1 = new Depan();
				next1.setVisible(true);
			}
		});
		btnSelesai.setFont(new Font("Arial Narrow", Font.BOLD, 13));
		btnSelesai.setBackground(new Color(255, 250, 205));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lblAndaTelahMelakukan, GroupLayout.PREFERRED_SIZE, 616, GroupLayout.PREFERRED_SIZE)
							.addGap(7))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lblJalurSbmptnProgram, GroupLayout.PREFERRED_SIZE, 616, GroupLayout.PREFERRED_SIZE)
							.addGap(4))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnSelesai, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtrAaaa, GroupLayout.PREFERRED_SIZE, 587, GroupLayout.PREFERRED_SIZE))
							.addGap(18))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAndaTelahMelakukan)
					.addGap(4)
					.addComponent(lblJalurSbmptnProgram, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtrAaaa)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSelesai, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(14))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
