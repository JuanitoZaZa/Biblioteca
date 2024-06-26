package view;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class ModificarLibroView extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textModificarTituloLibro;
	public JTextField textModificarAutorLibro;
	public JTextField textModificarEditorialLibro;
	public JTextField textModificarAnioPublicacionLibro;
	public JTextField textModificarISBNLibro;
	public JTextField textIDBuscarLibro;
	public JButton btnGuardarModificacionLibro;
	public JButton btnBuscarIDLibro;
	public JButton btnVolverModificarLibro;
	/**
	 * Create the frame.
	 */
	public ModificarLibroView() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 420);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblParaCrearEl = new JLabel("MODIFICAR LIBROS EXISTENTES");
		lblParaCrearEl.setForeground(new Color(0, 0, 0));
		lblParaCrearEl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblParaCrearEl.setBounds(140, 11, 209, 47);
		contentPane.add(lblParaCrearEl);
		
		JLabel lblNewLabel_1 = new JLabel("Titulo:");
		lblNewLabel_1.setBounds(10, 120, 225, 14);
		contentPane.add(lblNewLabel_1);
		
		textModificarTituloLibro = new JTextField();
		textModificarTituloLibro.setColumns(10);
		textModificarTituloLibro.setBounds(10, 134, 304, 20);
		contentPane.add(textModificarTituloLibro);
		
		JLabel lblNewLabel_1_1 = new JLabel("Autor:");
		lblNewLabel_1_1.setBounds(10, 172, 225, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textModificarAutorLibro = new JTextField();
		textModificarAutorLibro.setColumns(10);
		textModificarAutorLibro.setBounds(10, 185, 304, 20);
		contentPane.add(textModificarAutorLibro);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Editorial:");
		lblNewLabel_1_1_1.setBounds(10, 228, 225, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		textModificarEditorialLibro = new JTextField();
		textModificarEditorialLibro.setColumns(10);
		textModificarEditorialLibro.setBounds(10, 241, 304, 20);
		contentPane.add(textModificarEditorialLibro);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Año de publicacion del libro:");
		lblNewLabel_1_1_1_1.setBounds(10, 281, 304, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textModificarAnioPublicacionLibro = new JTextField();
		textModificarAnioPublicacionLibro.setColumns(10);
		textModificarAnioPublicacionLibro.setBounds(10, 293, 304, 20);
		contentPane.add(textModificarAnioPublicacionLibro);
		
		JLabel lblNewLabel_1_2 = new JLabel("ISBN:");
		lblNewLabel_1_2.setBounds(10, 324, 225, 14);
		contentPane.add(lblNewLabel_1_2);
		
		textModificarISBNLibro = new JTextField();
		textModificarISBNLibro.setColumns(10);
		textModificarISBNLibro.setBounds(10, 338, 304, 20);
		contentPane.add(textModificarISBNLibro);
		
		btnGuardarModificacionLibro = new JButton("MODIFICAR");
		btnGuardarModificacionLibro.setBounds(324, 184, 100, 77);
		contentPane.add(btnGuardarModificacionLibro);
		
		JLabel lblNewLabel_1_3 = new JLabel("Ingresa el id del libro que desea modificar:");
		lblNewLabel_1_3.setBounds(10, 75, 268, 14);
		contentPane.add(lblNewLabel_1_3);
		
		textIDBuscarLibro = new JTextField();
		textIDBuscarLibro.setColumns(10);
		textIDBuscarLibro.setBounds(10, 89, 304, 20);
		contentPane.add(textIDBuscarLibro);
		
		btnBuscarIDLibro = new JButton("BUSCAR");
		btnBuscarIDLibro.setBounds(324, 88, 100, 23);
		contentPane.add(btnBuscarIDLibro);
		
		btnVolverModificarLibro = new JButton("ATRAS");
		btnVolverModificarLibro.setBackground(new Color(0, 255, 0));
		btnVolverModificarLibro.setBounds(10, 25, 89, 23);
		contentPane.add(btnVolverModificarLibro);
	
	}
}
