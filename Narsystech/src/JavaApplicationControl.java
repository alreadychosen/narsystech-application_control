import java.awt.Color;
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

public class JavaApplicationControl {

	private JFrame mainframe;
	private JLabel lblNewLabel;
	private JPanel panel1;
	private JLabel server_Controls;
	private JLabel user_Interface_Control;
	private JLabel server_Command;
	private JLabel internet_Address;
	private JComboBox comboBoxYN;
	private JTextField textFieldServerCommand;
	private JButton launch;
	private JTextField textFieldInternetAddress;
	private JLabel port;
	private JTextField textFieldPort;
	private JButton connect;
	private JPanel panel2;
	private JLabel controls;
	private JLabel infrastructure;
	private JPanel panel3;
	private GridBagConstraints gbc_panel2;
	private GridBagConstraints gbc_panel1;
	private JButton log_Messages;
	private JLabel construct_Project;
	private JLabel define_Production;
	private JLabel define_Reservoir;
	private JLabel forecasts;
	private JButton projects;
	private JButton data;
	private JButton production;
	private JButton reservoir;
	private JButton permeability;
	private JButton ppm;
	private JButton btn_Forecasts;
	
	
	
	
	
	
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaApplicationControl window = new JavaApplicationControl();
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
	public JavaApplicationControl() {
		initialize();
	}

	// Creates Window
	private void initialize() {
		mainframe = new JFrame();
		mainframe.getContentPane().setBackground(new Color(176, 196, 222));
		mainframe.setTitle("NarSysTech Java Server");
		mainframe.setBounds(100, 100, 715, 760);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 591};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		mainframe.getContentPane().setLayout(gridBagLayout);
		
		// top description
		lblNewLabel = new JLabel("<html>This graphical user interface is used to demonstrate the NarSysTech Python API. The controls read and write to a running version of the NarSysTech Software interogating and interacting with the currently open project. A project must be constructed, open and the python server started before the controls can be built and tested.<html>");
		GridBagConstraints c = new GridBagConstraints();
		c.anchor=GridBagConstraints.PAGE_START;
		c.anchor=GridBagConstraints.FIRST_LINE_START;
		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth=GridBagConstraints.REMAINDER;
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridheight=1;
		c.insets = new Insets(10, 10, 0, 10);
		c.weightx=0.5;
		c.weighty=0.5;
		mainframe.getContentPane().add(lblNewLabel, c);
		
	    //first panel
	    panel1 = new JPanel(new GridBagLayout());
		panel1.setBackground(new Color(255,245,238)); 
		gbc_panel1 = new GridBagConstraints();
		// below comments are reference to useful programming statements
		//gbc_lblNewLabel.insets = new Insets(10, 10, 0, 10);
		//gbc_lblNewLabel.anchor=GridBagConstraints.FIRST_LINE_START;
		//gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 1;
		c.weightx=0.5;
		c.weighty=0.5;
		c.gridheight=5;
		c.gridwidth=4;
		c.fill=GridBagConstraints.HORIZONTAL;
		
		mainframe.getContentPane().add(panel1,c);
		// Server Controls label
	    server_Controls= new JLabel("Server Controls");
		gbc_panel1.gridx = 0;
		gbc_panel1.gridy = 0;
		gbc_panel1.gridheight=1;
		gbc_panel1.gridwidth=1;
		gbc_panel1.weightx=0.5;
		gbc_panel1.weighty=0.5;
		server_Controls.setFont(new Font("Times New Roman", Font.BOLD, 18));
		gbc_panel1.anchor=GridBagConstraints.WEST;
		gbc_panel1.insets = new Insets(20, 10, 0, 0);
		panel1.add(server_Controls, gbc_panel1);
		//User Interface Control: label
	    user_Interface_Control= new JLabel("User Interface Control: ");
		user_Interface_Control.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		gbc_panel1.gridx = 0;
		gbc_panel1.gridy = 1;
		gbc_panel1.gridheight=1;
		gbc_panel1.gridwidth=1;
		gbc_panel1.weightx=0.5;
		gbc_panel1.weighty=0.5;
		//gbc_panel1.anchor=GridBagConstraints.WEST;
		gbc_panel1.insets = new Insets(20, 30, 20, 0);
		panel1.add(user_Interface_Control, gbc_panel1);
		// Server Command: Label
	    server_Command= new JLabel("Server Command: ");
		server_Command.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		gbc_panel1.gridx=0;
		gbc_panel1.gridy=2;
		gbc_panel1.gridheight=1;
		gbc_panel1.gridwidth=1;
		gbc_panel1.weightx=0.5;
		gbc_panel1.weighty=0.5;
		gbc_panel1.insets = new Insets(0, 58, 20, 0);
		//gbc_panel1.anchor=GridBagConstraints.WEST;
		panel1.add(server_Command, gbc_panel1);
		// Internet Address: label
		internet_Address= new JLabel("Internet Address: ");
		internet_Address.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		gbc_panel1.gridx=0;
		gbc_panel1.insets = new Insets(0, 63, 20, 0);
		gbc_panel1.gridy=3;
		gbc_panel1.gridheight=1;
		gbc_panel1.gridwidth=1;
		gbc_panel1.weightx=0.5;
		gbc_panel1.weighty=0.5;
		//gbc_panel1.anchor=GridBagConstraints.LINE_START;
		//gbc_panel1.insets= new Insets(0,15,0,0);
		panel1.add(internet_Address, gbc_panel1);
		// yes no button
		String[] serverYN = {"Yes","No"};
		comboBoxYN = new JComboBox(serverYN);
		//comboBoxYN.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		comboBoxYN.setBackground(new Color(255, 213, 227));
		comboBoxYN.setToolTipText("<html>Commands issued through the<br/>client API can control the<br/>graphics view on the client. This<br/>is a good way to troubleshoot<br/>possible issues while writing a<br/>client application. Select Yes to<br/>control the graphics.<html>");
		gbc_panel1.gridx=1;
		//gbc_panel1.insets= new Insets(0,180,0,0);
		gbc_panel1.gridy=1;
		gbc_panel1.anchor=GridBagConstraints.LINE_START;
		comboBoxYN.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		comboBoxYN.setBackground(new Color(255,245,238));
		//gbc_panel1.fill=GridBagConstraints.WEST;
		//gbc_panel1.gridwidth=1;
		//comboBoxYN.setBounds(145, 35, 60, 25);
		gbc_panel1.weightx=.5;
		gbc_panel1.weighty=.5;
		//gbc_panel1.anchor=GridBagConstraints.CENTER;
		
		panel1.add(comboBoxYN,gbc_panel1);
		// server command textfield
		textFieldServerCommand = new JTextField();
		gbc_panel1.gridx=1;
		gbc_panel1.insets= new Insets(0,0,20,0);
		gbc_panel1.gridy=2;
		gbc_panel1.weightx=0.5;
		gbc_panel1.weighty=.5;
		gbc_panel1.fill=GridBagConstraints.HORIZONTAL;
		textFieldServerCommand.setToolTipText("<html>Input a command that will be<br/>executed from a DOS command<br/>line. Servers can be launched this<br/>way. Make sure sure each<br/>instance has a different port<br/>number to make sure your client<br/>application is connected to the<br/>correct project.<html>");
		textFieldServerCommand.setText("C:/Program Files/NarSysTech/ActiveModel/ActiveModel.exe");
		//textFieldServerCommand.setBounds(145, 73, 445, 20);
	    //gbc_panel1.fill=GridBagConstraints.RELATIVE;
		panel1.add(textFieldServerCommand,gbc_panel1);
		//Launch Button
		launch = new JButton("Launch");
		launch.setToolTipText("<html>Open a command prompt and<br/>execute the supplied command.<html>");
		gbc_panel1.gridx=2;
		gbc_panel1.insets= new Insets(0,0,20,0);
		launch.setBackground(new Color(255,245,238));
		launch.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		gbc_panel1.gridy=2;
		gbc_panel1.weightx=0.5;
		gbc_panel1.weighty=.5;
		panel1.add(launch, gbc_panel1);
		// Internet Address Textfield
		textFieldInternetAddress = new JTextField();
		textFieldInternetAddress.setToolTipText("<html>Enter the LAN address where the<br/>servers are running.<html>");
		textFieldInternetAddress.setText("127.0.0.1");
		gbc_panel1.gridx=1;
		gbc_panel1.insets= new Insets(0,0,20,0);
		gbc_panel1.gridy=3;
		gbc_panel1.weightx=0.5;
		gbc_panel1.weighty=.5;
		panel1.add(textFieldInternetAddress, gbc_panel1);
		//Port label
	    port= new JLabel("Port: ");
		gbc_panel1.gridx=2;
		gbc_panel1.insets= new Insets(0,0,20,0);
		gbc_panel1.gridy=3;
		gbc_panel1.weightx=0.5;
		gbc_panel1.weighty=.5;
		port.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		panel1.add(port, gbc_panel1);
		// Port textfield
		textFieldPort = new JTextField();
		textFieldPort.setToolTipText("<html>Enter the port number for the<br/>server instance that you wish to<br/>connect to.<html>");
		textFieldPort.setText("25322");
		gbc_panel1.gridx=3;
		gbc_panel1.insets= new Insets(0,0,20,0);
		gbc_panel1.gridy=3;
		gbc_panel1.weightx=0.5;
		gbc_panel1.weighty=.5;
		panel1.add(textFieldPort, gbc_panel1);
		// connect button
		connect= new JButton("Connect");
		connect.setToolTipText("<html>Establish a connection to the<br/>server running on the supplied IP<br/>address, with the supplied port<br/>number. The server must already<br/>be running and setup to connect<br/>on the same port number.<br/>Multiple servers can be<br/>connected to but they must each<br/>have a unique port number.<html>");
		connect.setBackground(new Color(255,245,238));
		connect.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		gbc_panel1.gridx=4;
		gbc_panel1.insets= new Insets(0,0,20,0);
		gbc_panel1.gridy=3;
		gbc_panel1.weightx=0.5;
		gbc_panel1.weighty=.5;
		panel1.add(connect, gbc_panel1);
		
		
		
		
		
		
		
		//second panel
		panel2= new JPanel(new GridBagLayout());
		panel2.setBackground(new Color(240,255,240)); 
		gbc_panel2 = new GridBagConstraints();
		// below comments are reference to useful programming statements
		//gbc_lblNewLabel.insets = new Insets(10, 10, 0, 10);
		//gbc_lblNewLabel.anchor=GridBagConstraints.FIRST_LINE_START;
		//gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		c.anchor=GridBagConstraints.CENTER;
		c.weightx=0.5;
		c.weighty=0.5;
		c.gridheight=5;
		c.gridwidth=4;
		c.gridx = 0;
		c.gridy = 1;
		//c.insets= new Insets(0,0,210,0);
		c.fill=GridBagConstraints.HORIZONTAL;
		mainframe.getContentPane().add(panel2,c);
		//Controls label
		controls= new JLabel("Controls");
		gbc_panel2.gridx = 0;
		gbc_panel2.gridy = 0;
		gbc_panel2.fill = GridBagConstraints.BOTH;
		gbc_panel2.anchor = GridBagConstraints.NORTHWEST;
		gbc_panel2.gridheight=1;
		gbc_panel2.gridwidth=1;
		gbc_panel2.weightx=0.5;
		gbc_panel2.weighty=0.5;
		controls.setFont(new Font("Times New Roman", Font.BOLD, 18));
		gbc_panel2.insets = new Insets(0, 40, 0, 0);
		//gbc_panel2.anchor=GridBagConstraints.WEST;
		//gbc_panel2.insets = new Insets(0, 0, 0, 220);
		panel2.add(controls, gbc_panel2);
		//Infrastructure label
		infrastructure= new JLabel("Infrastructure: ");
		gbc_panel2.gridx = 0;
		gbc_panel2.gridy = 1;
		gbc_panel2.gridheight=1;
		gbc_panel2.gridwidth=1;
		gbc_panel2.weightx=0.5;
		gbc_panel2.weighty=0.5;
		infrastructure.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		//gbc_panel2.insets = new Insets(20, 0, 0, 0);
		//gbc_panel2.anchor=GridBagConstraints.WEST;
		//gbc_panel2.insets = new Insets(100, 0, 0, 220);
		panel2.add(infrastructure, gbc_panel2);
		//Construct Project label
		construct_Project= new JLabel("Construct Project: ");
		gbc_panel2.gridx = 0;
		gbc_panel2.gridy = 2;
		gbc_panel2.gridheight=1;
		gbc_panel2.gridwidth=1;
		gbc_panel2.weightx=0.5;
		gbc_panel2.weighty=0.5;
		infrastructure.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		//gbc_panel2.insets = new Insets(20, 0, 0, 0);
		//gbc_panel2.anchor=GridBagConstraints.WEST;
		//gbc_panel2.insets = new Insets(100, 0, 0, 220);
		panel2.add(construct_Project, gbc_panel2);
		//Define Production Label
		define_Production= new JLabel("Define Production: ");
		gbc_panel2.gridx = 0;
		gbc_panel2.gridy = 3;
		gbc_panel2.gridheight=1;
		gbc_panel2.gridwidth=1;
		gbc_panel2.weightx=0.5;
		gbc_panel2.weighty=0.5;
		infrastructure.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		//gbc_panel2.insets = new Insets(20, 0, 0, 0);
		//gbc_panel2.anchor=GridBagConstraints.WEST;
		//gbc_panel2.insets = new Insets(100, 0, 0, 220);
		panel2.add(define_Production, gbc_panel2);
		//Define Reservoir
		define_Reservoir= new JLabel("Define Reservoir: ");
		gbc_panel2.gridx = 0;
		gbc_panel2.gridy = 4;
		gbc_panel2.gridheight=1;
		gbc_panel2.gridwidth=1;
		gbc_panel2.weightx=0.5;
		gbc_panel2.weighty=0.5;
		infrastructure.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		//gbc_panel2.insets = new Insets(20, 0, 0, 0);
		//gbc_panel2.anchor=GridBagConstraints.WEST;
		//gbc_panel2.insets = new Insets(100, 0, 0, 220);
		panel2.add(define_Reservoir, gbc_panel2);
		//Forecasts Label
		forecasts= new JLabel("Forecasts: ");
		gbc_panel2.gridx = 0;
		gbc_panel2.gridy = 5;
		gbc_panel2.gridheight=1;
		gbc_panel2.gridwidth=1;
		gbc_panel2.weightx=0.5;
		gbc_panel2.weighty=0.5;
		infrastructure.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		//gbc_panel2.insets = new Insets(20, 0, 0, 0);
		//gbc_panel2.anchor=GridBagConstraints.WEST;
		//gbc_panel2.insets = new Insets(100, 0, 0, 220);
		panel2.add(forecasts, gbc_panel2);
		gbc_panel2.fill= GridBagConstraints.NONE;
		// Log Messages button
		log_Messages= new JButton("Log Messages");
		log_Messages.setToolTipText("<html>Access all server logs and test. It<br/>is important to note that the<br/>server and client-side should use<br/>the same logging system to allow<br/>efficient troubleshooting.<html>");
		gbc_panel2.gridx=1;
		gbc_panel2.gridy=1;
		gbc_panel2.gridheight=1;
		gbc_panel2.gridwidth=1;
		gbc_panel2.weightx=0.5;
		gbc_panel2.weighty=0.5;
		//log_Messages.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		log_Messages.setBackground(new Color(180, 255, 255));
		//log_Messages.setBounds(130, 4, 110, 23);
		panel2.add(log_Messages,gbc_panel2);
		//Projects Label
		projects= new JButton("Projects");
		projects.setToolTipText("<html>Define new projects, edit existing<br/>projects and control which<br/>projects are opena and therefore<br/>accessible. When a connection to<br/>a server is initially made, the<br/>project is automatically set to<br/>whatever project is currently<br/>open on the server side.<html>");
		gbc_panel2.gridx=1;
		gbc_panel2.gridy=2;
		gbc_panel2.gridheight=1;
		gbc_panel2.gridwidth=1;
		gbc_panel2.weightx=0.5;
		gbc_panel2.weighty=0.5;
		//log_Messages.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		projects.setBackground(new Color(255, 235, 245));
		//log_Messages.setBounds(130, 4, 110, 23);
		panel2.add(projects,gbc_panel2);
		//data button
		data= new JButton("Data");
		data.setToolTipText("<html>Load, review and edit all the<br/>various data types needed to<br/>build and update a Production<br/>Potential Model.<html>");
		gbc_panel2.gridx=2;
		gbc_panel2.gridy=2;
		gbc_panel2.gridheight=1;
		gbc_panel2.gridwidth=1;
		gbc_panel2.weightx=0.5;
		gbc_panel2.weighty=0.5;
		//log_Messages.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		data.setBackground(new Color(255, 213, 227));
		//log_Messages.setBounds(130, 4, 110, 23);
		panel2.add(data,gbc_panel2);
		//production button
		production= new JButton("Production");
		production.setToolTipText("<html>Load, review, edit and delete<br/>production related information<br/>that is used to compute drainage<br/>and assign production to each<br/>well.<html>");
		gbc_panel2.gridx=1;
		gbc_panel2.gridy=3;
		gbc_panel2.gridheight=1;
		gbc_panel2.gridwidth=1;
		gbc_panel2.weightx=0.5;
		gbc_panel2.weighty=0.5;
		//log_Messages.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		production.setBackground(new Color(152, 251, 152));
		//log_Messages.setBounds(130, 4, 110, 23);
		panel2.add(production,gbc_panel2);
		// reservoir button
		reservoir= new JButton("Reservoir");
		reservoir.setToolTipText("<html>Define the bounds of the<br/>reservoir.<html>");
		gbc_panel2.gridx=1;
		gbc_panel2.gridy=4;
		gbc_panel2.gridheight=1;
		gbc_panel2.gridwidth=1;
		gbc_panel2.weightx=0.5;
		gbc_panel2.weighty=0.5;
		//log_Messages.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		reservoir.setBackground(new Color(255, 218, 185));
		//log_Messages.setBounds(130, 4, 110, 23);
		panel2.add(reservoir,gbc_panel2);
		//permeability button
		permeability= new JButton("Permeability");
		permeability.setToolTipText("<html>Define how permeabilities are<br/>distributed within the reservoir<br/>and how the native<br/>permeabilities are impacted by<br/>wells and stimulations and<br/>associated data sets like DFN's<html>");
		gbc_panel2.gridx=2;
		gbc_panel2.gridy=4;
		gbc_panel2.gridheight=1;
		gbc_panel2.gridwidth=1;
		gbc_panel2.weightx=0.5;
		gbc_panel2.weighty=0.5;
		//log_Messages.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		permeability.setBackground(new Color(255, 246, 143));
		//log_Messages.setBounds(130, 4, 110, 23);
		panel2.add(permeability,gbc_panel2);
		//PPM button
		ppm= new JButton("PPM");
		ppm.setToolTipText("<html>Define how properties and<br/>compute the production<br/>potential model.<html>");
		gbc_panel2.gridx=1;
		gbc_panel2.gridy=5;
		gbc_panel2.gridheight=1;
		gbc_panel2.gridwidth=1;
		gbc_panel2.weightx=0.5;
		gbc_panel2.weighty=0.5;
		//log_Messages.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		ppm.setBackground(new Color(216, 191, 216));
		//log_Messages.setBounds(130, 4, 110, 23);
		panel2.add(ppm,gbc_panel2);
		//Forecasts button
		btn_Forecasts= new JButton("Forecasts");
		btn_Forecasts.setToolTipText("<html>Read slices of data from data<br/>volumes contained in a project<br/>and review in 2D window. This<br/>will include the PPM volumes<br/>which can also be accessed vai<br/>the PPM Controls.<html>");
		gbc_panel2.gridx=2;
		gbc_panel2.gridy=5;
		gbc_panel2.gridheight=1;
		gbc_panel2.gridwidth=1;
		gbc_panel2.weightx=0.5;
		gbc_panel2.weighty=0.5;
		//log_Messages.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_Forecasts.setBackground(new Color(230,230,250));
		//log_Messages.setBounds(130, 4, 110, 23);
		panel2.add(btn_Forecasts,gbc_panel2);
		
		
		
		
		
		
		
		
		
		
		//third panel
		panel3= new JPanel();
		panel3.setBackground(Color.RED); 
		GridBagConstraints gbc_panel3 = new GridBagConstraints();
		// below comments are reference to useful programming statements
		//gbc_lblNewLabel.insets = new Insets(10, 10, 0, 10);
		//gbc_lblNewLabel.anchor=GridBagConstraints.FIRST_LINE_START;
		//gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		//c.anchor=GridBagConstraints.BASELINE;
		c.anchor=GridBagConstraints.CENTER;
		c.weightx=0.5;
		c.weighty=0.5;
		c.gridheight=4;
		c.gridwidth=5;
		c.gridx = 0;
		c.gridy = 2;
		c.fill=GridBagConstraints.HORIZONTAL;
		//c.insets= new Insets(0,0,125,0);
		mainframe.getContentPane().add(panel3,c);
		
		
		
		
	}

}
