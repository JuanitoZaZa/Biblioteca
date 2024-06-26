package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CategoriaView extends JFrame{

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textIDEliminarCategoria;
	public JTable table;
	public DefaultTableModel modelo;
	public JButton btnMostrarCategoria;
	public JButton btnCrearCategoria;
	public JButton btnEliminarCategoria;
	public JButton btnModificarCategoria;
	public JButton btnVolverCategoria;

	/**
	 * Create the frame.
	 * @param conexion 
	 */
	public CategoriaView() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 348);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModificarCategoria = new JLabel("CATEGORIAS");
		lblModificarCategoria.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblModificarCategoria.setForeground(new Color(0, 0, 0));
		lblModificarCategoria.setBounds(232, 0, 113, 29);
		contentPane.add(lblModificarCategoria);
		
		btnCrearCategoria = new JButton("CREAR Categoria");
		btnCrearCategoria.setBackground(new Color(255, 255, 255));
		btnCrearCategoria.setBounds(298, 265, 271, 36);
		contentPane.add(btnCrearCategoria);
		
		JLabel lblEliminarCategoria = new JLabel("Ingresar el ID de la categoria que deseas eliminar:");
		lblEliminarCategoria.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblEliminarCategoria.setBounds(10, 216, 398, 14);
		contentPane.add(lblEliminarCategoria);
		
		btnEliminarCategoria = new JButton("ELIMINAR");
		btnEliminarCategoria.setBackground(new Color(255, 128, 128));
		btnEliminarCategoria.setBounds(418, 231, 151, 23);
		contentPane.add(btnEliminarCategoria);
		
		textIDEliminarCategoria = new JTextField();
		textIDEliminarCategoria.setColumns(10);
		textIDEliminarCategoria.setBounds(10, 231, 398, 23);
		contentPane.add(textIDEliminarCategoria);
		
		btnMostrarCategoria = new JButton("Mostrar categorias existentes");
		btnMostrarCategoria.setBackground(new Color(255, 255, 255));
		btnMostrarCategoria.setBounds(148, 36, 271, 23);
		contentPane.add(btnMostrarCategoria);
		
		btnModificarCategoria = new JButton("MODIFICAR categoria");
		btnModificarCategoria.setBackground(new Color(255, 255, 255));
		btnModificarCategoria.setBounds(10, 265, 271, 36);
		contentPane.add(btnModificarCategoria);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 61, 559, 144);
		contentPane.add(scrollPane);
		
		table = new JTable();
		modelo = new DefaultTableModel();
		table.setModel(modelo);
		
		modelo.addColumn("ID");
		modelo.addColumn("Nombre");
	
		scrollPane.setViewportView(table);
		
		btnVolverCategoria = new JButton("VOLVER");
		btnVolverCategoria.setBackground(Color.GREEN);
		btnVolverCategoria.setBounds(10, 11, 89, 23);
		contentPane.add(btnVolverCategoria);
	}

}
