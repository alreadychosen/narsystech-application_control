import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class JavaApplicationControlRevised01 {
	
	private JFrame mainframe;
	
	private JPanel panelDescription;
	private JLabel lblDescription;
	
	private JPanel panelServerControl;
	private JLabel lblServerControls;
	private JLabel lblUserIntefaceControl;
	private JLabel lblServerCommand;
	private JLabel lblInternetAddress;
	private JComboBox comboBoxYN;
	private JButton btnX;
	private JTextField textFieldServerCommand;
	private JTextField textFieldInternetAddress;
	private JButton btnNewButton;
	private JButton btnConnect;
	private JLabel lblPort;
	private JTextField textFieldPort;
	
	private JPanel panelControls;
	private JLabel lblControls;
	private JPanel panelInfrastructure;
	private JPanel panelConstructProject;
	private JPanel panelDefineProduction;
	private JPanel panelDefineReservoir;
	private JPanel panelForecasts;
	private JLabel lblDefineProduction;
	private JButton btnProduction;
	private JLabel lblInfrastructure;
	private JLabel lblConstructProject;
	private JLabel lblDefineReservoir;
	private JLabel lblForecasts;
	private JButton btnLogMessages;
	private JButton btnProjects;
	private JButton btnData;
	private JButton btnReservoir;
	private JButton btnPermeability;
	private JButton btnPPM;
	private JButton btnForecasts;
	
	private JPanel panelStatus;
	private JLabel lblStatus;
	private JLabel lblProject;
	private JLabel lblVolume;
	private JLabel lblProjectValue;
	private JLabel lblVolumeValue;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaApplicationControlRevised01 window = new JavaApplicationControlRevised01();
					window.mainframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JavaApplicationControlRevised01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainframe = new JFrame();
		mainframe.getContentPane().setBackground(new Color(176, 196, 222));
		mainframe.setBounds(100, 100, 720, 770);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		mainframe.getContentPane().setLayout(gridBagLayout);
		
		
		
		/*-------------------------------------------------------------------------------------------------------------------------------
		 * Top Description
		 -------------------------------------------------------------------------------------------------------------------------------*/
		lblDescription = new JLabel("<html>This graphical user interface is used to demonstrate the NarSysTech Python API. The controls read and write to a running version of the NarSysTech Software interogating and interacting with the currently open project. A project must be constructed, open and the python server started before the controls can be built and tested.<html>");
		lblDescription.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		
		panelDescription = new JPanel(new GridBagLayout());
		panelDescription.setBackground(new Color(176, 196, 222));
		panelDescription.add(lblDescription);
		lblDescription.setMinimumSize(new Dimension(500,140));
		
		GridBagConstraints gbc_lblDescription = new GridBagConstraints();
		gbc_lblDescription.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDescription.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblDescription.insets = new Insets(10, 50, 10, 40);
		
		gbc_lblDescription.gridx = 0;
		gbc_lblDescription.gridy = 0;
		gbc_lblDescription.weightx = 1;
		gbc_lblDescription.weighty = 1;
		gbc_lblDescription.ipadx = 500;
		gbc_lblDescription.ipady = 0;
		mainframe.getContentPane().add(panelDescription, gbc_lblDescription);
		
		
		/*-------------------------------------------------------------------------------------------------------------------------------
		 * ServerControl region containing UI Control, ServerCommand, and Internet Address
		 -------------------------------------------------------------------------------------------------------------------------------*/
		panelServerControl = new JPanel();
		panelServerControl.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelServerControl.setBackground(new Color(255, 235, 245));
		GridBagConstraints gbc_panelServiceControl = new GridBagConstraints();
		
		mainframe.getContentPane().add(panelServerControl, gbc_panelServiceControl);
		panelServerControl.setLayout(gridBagLayout);
		
	}
}
