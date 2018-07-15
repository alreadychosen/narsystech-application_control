//package examoke;

/*
 * GridBagLayoutDemo.java is a 1.4 application that requires no other files.
 */
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
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

public class firefly {
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
    
    private static JFrame mainframe;
    
    private static JPanel panel_Description;
    private static JLabel lbl_Description;
    
    private static JPanel panel_ServerControls;
    private static JLabel lbl_ServerControls;
    private static GridBagConstraints gbc_ServerControls;
    private static JLabel user_Interface_Control;
    private static JComboBox comboBox_YN;
    private static JLabel lbl_ServerCommand;
    private static JTextField textField_ServerCommand;
    private static JButton btn_Launch;
    private static JLabel internet_Address;
    private static JTextField textFieldInternetAddress;
    private static JLabel port;
    private static JTextField textFieldPort;
    private static JButton connect;
    
    private static JPanel panel2;
	private static JLabel controls;
	private static GridBagConstraints gbc_panel2;
	//
	private static JLabel infrastructure;
	private static JButton log_Messages;
	//
	private static JLabel construct_Project;
	private static JButton projects;
	private static JButton data;
	//
	private static JLabel define_Production;
	private static JButton production;
	//
	private static JLabel define_Reservoir;
	private static JButton reservoir;
	private static JButton permeability;
	//
	private static JLabel forecasts;
	private static JButton ppm;
	private static JButton btn_Forecasts;
	
	private static JLabel lbl_Status;
	private static JLabel nextone;
	private static JPanel panel_Status;
	

    public static void addComponentsToPane(Container pane) {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        }

        //mainframe = new JFrame();
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
		
		/*-------------------------------------------------------------------------------------------------------------------------------
		 * Top Description
		 -------------------------------------------------------------------------------------------------------------------------------*/
		//lbl_Description = new JLabel("<html>This graphical user interface is used to demonstrate the NarSysTech Python<br/>API. The controls read and write to a running version of the NarSysTech<br/>Software interogating and interacting with the currently open project. A project<br/>must be constructed, open and the python server started before the controls<br/>can be built and tested.<html>");
		lbl_Description = new JLabel("<html>This graphical user interface is used to demonstrate the NarSysTech Python API. The controls read and write to a running version of the NarSysTech Software interogating and interacting with the currently open project. A project must be constructed, open and the python server started before the controls can be built and tested.<html>");
		lbl_Description.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		/*
		GridBagConstraints gbc_lblDescription = new GridBagConstraints();
		gbc_lblDescription.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDescription.anchor = GridBagConstraints.NORTHWEST;
		*/
		panel_Description = new JPanel(new GridBagLayout());
		panel_Description.setBackground(new Color(176, 196, 222));
		panel_Description.add(lbl_Description/*, gbc_lblDescription*/);
		lbl_Description.setMinimumSize(new Dimension(500,140));
		
		GridBagConstraints gbc_lblDescription = new GridBagConstraints();
		gbc_lblDescription.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDescription.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblDescription.insets = new Insets(10, 50, 5, 40);
		gbc_lblDescription.gridx = 0;
		gbc_lblDescription.gridy = 0;
		gbc_lblDescription.gridwidth=1;
		gbc_lblDescription.gridheight=1;
		gbc_lblDescription.weightx = 0.5;
		gbc_lblDescription.weighty = 0.5;
		//gbc_lblDescription.ipadx = 500;
		//gbc_lblDescription.ipady = 0;
		lbl_Description.setMinimumSize(new Dimension(300,140));
		lbl_Description.setPreferredSize(new Dimension(600,140));
		lbl_Description.setMaximumSize(new Dimension(700,140));
		mainframe.getContentPane().add(panel_Description, gbc_lblDescription);
		
		
		GridBagConstraints c = new GridBagConstraints();
		/*
		lbl_Description = new JLabel("<html>This graphical user interface is used to demonstrate the NarSysTech Python<br/>API. The controls read and write to a running version of the NarSysTech<br/>Software interogating and interacting with the currently open project. A project<br/>must be constructed, open and the python server started before the controls<br/>can be built and tested.<html>");
		//lbl_Description = new JLabel("<html>This graphical user interface is used to demonstrate the NarSysTech Python API. The controls read and write to a running version of the NarSysTech Software interogating and interacting with the currently open project. A project must be constructed, open and the python server started before the control can be built and tested.<html>");
		
		c.anchor=GridBagConstraints.PAGE_START;
		//c.anchor=GridBagConstraints.FIRST_LINE_START;
		c.gridx = 0;
		c.gridy = 0;
		//c.fill=GridBagConstraints.HORIZONTAL;
		c.gridwidth=GridBagConstraints.REMAINDER;
		c.gridwidth=1;
		c.gridheight=1;
		c.insets = new Insets(10, 10, 0, 10);
		c.weightx=0.5;
		c.weighty=0.5;
		lbl_Description.setMinimumSize(new Dimension(600,140));
		mainframe.getContentPane().add(lbl_Description, c);
		*/
	    
		
       // JButton button;
        //pane.setLayout(new GridBagLayout());
        //GridBagConstraints c = new GridBagConstraints();
        if (shouldFill) {
            //natural height, maximum width
            c.fill = GridBagConstraints.HORIZONTAL;
        }

        /*button = new JButton("Button 1");
        if (shouldWeightX) {
            c.weightx = 0.5;
        }
        c.gridx = 0;
        c.gridy = 0;
        pane.add(button, c);

        button = new JButton("Button 2");
        c.gridx = 1;
        c.gridy = 0;
        pane.add(button, c);

        button = new JButton("Button 3");
        c.gridx = 2;
        c.gridy = 0;
        pane.add(button, c);

        button = new JButton("Long-Named Button 4");
        c.ipady = 40;      //make this component tall
        c.weightx = 0.0;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(button, c);

        button = new JButton("5");
        c.ipady = 0;       //reset to default
        c.weighty = 1.0;   //request any lbl_Status vertical space
        c.anchor = GridBagConstraints.PAGE_END; //bottom of space
        c.insets = new Insets(10,0,0,0);  //top padding
        c.gridx = 1;       //aligned with button 2
        c.gridwidth = 2;   //2 columns wide
        c.gridy = 2;       //third row
        pane.add(button, c);*/
      //first panel
        
        
        /*-------------------------------------------------------------------------------------------------------------------------------
		 * ServerControl region containing UI Control, ServerCommand, and Internet Address
		 -------------------------------------------------------------------------------------------------------------------------------*/
	    panel_ServerControls = new JPanel(new GridBagLayout());
		panel_ServerControls.setBackground(new Color(255,245,238)); 
		gbc_ServerControls = new GridBagConstraints();
		// below comments are reference to useful programming statements
		//gbc_lblNewLabel.insets = new Insets(10, 10, 0, 10);
		//gbc_lblNewLabel.anchor=GridBagConstraints.FIRST_LINE_START;
		//gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 1;
		c.weightx=0.5;
		c.weighty=0.5;
		c.gridheight=1;
		c.gridwidth=5;
		c.insets = new Insets(10, 10, 0, 10);
		c.fill=GridBagConstraints.HORIZONTAL;
		
		
		mainframe.getContentPane().add(panel_ServerControls,c);
		// Server Controls label
	    lbl_ServerControls= new JLabel("Server Controls");
		gbc_ServerControls.gridx = 0;
		gbc_ServerControls.gridy = 0;
		gbc_ServerControls.gridheight=1;
		gbc_ServerControls.gridwidth=1;
		gbc_ServerControls.weightx=0.5;
		gbc_ServerControls.weighty=0.5;
		lbl_ServerControls.setFont(new Font("Times New Roman", Font.BOLD, 18));
		gbc_ServerControls.anchor=GridBagConstraints.WEST;
		gbc_ServerControls.insets = new Insets(20, 10, 0, 0);
		panel_ServerControls.add(lbl_ServerControls, gbc_ServerControls);
		//User Interface Control: label
	    user_Interface_Control= new JLabel("User Interface Control: ");
		user_Interface_Control.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		gbc_ServerControls.gridx = 0;
		gbc_ServerControls.gridy = 1;
		gbc_ServerControls.gridheight=1;
		gbc_ServerControls.gridwidth=1;
		gbc_ServerControls.weightx=0.5;
		gbc_ServerControls.weighty=0.5;
		//gbc_ServerControls.anchor=GridBagConstraints.WEST;
		gbc_ServerControls.insets = new Insets(20, 30, 20, 0);
		panel_ServerControls.add(user_Interface_Control, gbc_ServerControls);
		// Server Command: Label
	    lbl_ServerCommand= new JLabel("Server Command: ");
		lbl_ServerCommand.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		gbc_ServerControls.gridx=0;
		gbc_ServerControls.gridy=2;
		gbc_ServerControls.gridheight=1;
		gbc_ServerControls.gridwidth=1;
		gbc_ServerControls.weightx=0.5;
		gbc_ServerControls.weighty=0.5;
		gbc_ServerControls.insets = new Insets(0, 58, 20, 0);
		//gbc_ServerControls.anchor=GridBagConstraints.WEST;
		panel_ServerControls.add(lbl_ServerCommand, gbc_ServerControls);
		// Internet Address: label
		internet_Address= new JLabel("Internet Address: ");
		internet_Address.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		gbc_ServerControls.gridx=0;
		gbc_ServerControls.insets = new Insets(0, 63, 20, 0);
		gbc_ServerControls.gridy=3;
		gbc_ServerControls.gridheight=1;
		gbc_ServerControls.gridwidth=1;
		gbc_ServerControls.weightx=0.5;
		gbc_ServerControls.weighty=0.5;
		//gbc_ServerControls.anchor=GridBagConstraints.LINE_START;
		//gbc_ServerControls.insets= new Insets(0,15,0,0);
		panel_ServerControls.add(internet_Address, gbc_ServerControls);
		// yes no button
		String[] serverYN = {"Yes","No"};
		comboBox_YN = new JComboBox(serverYN);
		//comboBox_YN.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		comboBox_YN.setBackground(new Color(255, 213, 227));
		comboBox_YN.setToolTipText("<html>Commands issued through the<br/>client API can control the<br/>graphics view on the client. This<br/>is a good way to troubleshoot<br/>possible issues while writing a<br/>client application. Select Yes to<br/>control the graphics.<html>");
		gbc_ServerControls.gridx=1;
		//gbc_ServerControls.insets= new Insets(0,180,0,0);
		gbc_ServerControls.gridy=1;
		gbc_ServerControls.anchor=GridBagConstraints.LINE_START;
		comboBox_YN.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		comboBox_YN.setBackground(new Color(255,245,238));
		//gbc_ServerControls.fill=GridBagConstraints.WEST;
		//gbc_ServerControls.gridwidth=1;
		//comboBox_YN.setBounds(145, 35, 60, 25);
		gbc_ServerControls.weightx=.5;
		gbc_ServerControls.weighty=.5;
		//gbc_ServerControls.anchor=GridBagConstraints.CENTER;
		
		panel_ServerControls.add(comboBox_YN,gbc_ServerControls);
		// server command textfield
		textField_ServerCommand = new JTextField();
		gbc_ServerControls.gridx=1;
		gbc_ServerControls.insets= new Insets(0,0,20,0);
		gbc_ServerControls.gridy=2;
		gbc_ServerControls.weightx=0.5;
		gbc_ServerControls.weighty=.5;
		gbc_ServerControls.fill=GridBagConstraints.HORIZONTAL;
		textField_ServerCommand.setToolTipText("<html>Input a command that will be<br/>executed from a DOS command<br/>line. Servers can be launched this<br/>way. Make sure sure each<br/>instance has a different port<br/>number to make sure your client<br/>application is connected to the<br/>correct project.<html>");
		textField_ServerCommand.setText("C:/Program Files/NarSysTech/ActiveModel/ActiveModel.exe");
		//textField_ServerCommand.setBounds(145, 73, 445, 20);
	    //gbc_ServerControls.fill=GridBagConstraints.RELATIVE;
		panel_ServerControls.add(textField_ServerCommand,gbc_ServerControls);
		//Launch Button
		btn_Launch = new JButton("Launch");
		btn_Launch.setToolTipText("<html>Open a command prompt and<br/>execute the supplied command.<html>");
		gbc_ServerControls.gridx=2;
		gbc_ServerControls.insets= new Insets(0,0,20,0);
		btn_Launch.setBackground(new Color(255,245,238));
		btn_Launch.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		gbc_ServerControls.gridy=2;
		gbc_ServerControls.weightx=0.5;
		gbc_ServerControls.weighty=.5;
		panel_ServerControls.add(btn_Launch, gbc_ServerControls);
		// Internet Address Textfield
		textFieldInternetAddress = new JTextField();
		textFieldInternetAddress.setToolTipText("<html>Enter the LAN address where the<br/>servers are running.<html>");
		textFieldInternetAddress.setText("127.0.0.1");
		gbc_ServerControls.gridx=1;
		gbc_ServerControls.insets= new Insets(0,0,20,0);
		gbc_ServerControls.gridy=3;
		gbc_ServerControls.weightx=0.5;
		gbc_ServerControls.weighty=.5;
		panel_ServerControls.add(textFieldInternetAddress, gbc_ServerControls);
		//Port label
	    port= new JLabel("Port: ");
		gbc_ServerControls.gridx=2;
		gbc_ServerControls.insets= new Insets(0,0,20,0);
		gbc_ServerControls.gridy=3;
		gbc_ServerControls.weightx=0.5;
		gbc_ServerControls.weighty=.5;
		port.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		panel_ServerControls.add(port, gbc_ServerControls);
		// Port textfield
		textFieldPort = new JTextField();
		textFieldPort.setToolTipText("<html>Enter the port number for the<br/>server instance that you wish to<br/>connect to.<html>");
		textFieldPort.setText("25322");
		gbc_ServerControls.gridx=3;
		gbc_ServerControls.insets= new Insets(0,0,20,0);
		gbc_ServerControls.gridy=3;
		gbc_ServerControls.weightx=0.5;
		gbc_ServerControls.weighty=.5;
		panel_ServerControls.add(textFieldPort, gbc_ServerControls);
		// connect button
		connect= new JButton("Connect");
		connect.setToolTipText("<html>Establish a connection to the<br/>server running on the supplied IP<br/>address, with the supplied port<br/>number. The server must already<br/>be running and setup to connect<br/>on the same port number.<br/>Multiple servers can be<br/>connected to but they must each<br/>have a unique port number.<html>");
		connect.setBackground(new Color(255,245,238));
		connect.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		gbc_ServerControls.gridx=4;
		gbc_ServerControls.insets= new Insets(0,0,20,0);
		gbc_ServerControls.gridy=3;
		gbc_ServerControls.weightx=0.5;
		gbc_ServerControls.weighty=.5;
		panel_ServerControls.add(connect, gbc_ServerControls);
		
		
		/*-------------------------------------------------------------------------------------------------------------------------------
		 * Controls region for Infra, Contruct Project, Production, Reservoir, Forecasts
		 -------------------------------------------------------------------------------------------------------------------------------*/
		panel2= new JPanel(new GridBagLayout());
		panel2.setBackground(new Color(240,255,240)); 
		gbc_panel2 = new GridBagConstraints();
		// below comments are reference to useful programming statements
		//gbc_lblNewLabel.insets = new Insets(10, 10, 0, 10);
		//gbc_lblNewLabel.anchor=GridBagConstraints.FIRST_LINE_START;
		//gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		//c.anchor=GridBagConstraints.CENTER;
		c.weightx=0.5;
		c.weighty=0.5;
		c.gridheight=1;
		c.gridwidth=5;
		c.gridx = 0;
		c.gridy = 2;
		//c.insets= new Insets(0,0,210,0);
		c.fill=GridBagConstraints.BOTH;
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
		
		
		/*-------------------------------------------------------------------------------------------------------------------------------
		 * Status region for Project and Volume
		 -------------------------------------------------------------------------------------------------------------------------------*/
		panel_Status= new JPanel(new GridBagLayout());
		panel_Status.setBackground(new Color(230,230,250)); 
		GridBagConstraints gbc_panel_Status = new GridBagConstraints();
		// below comments are reference to useful programming statements
		//gbc_lblNewLabel.insets = new Insets(10, 10, 0, 10);
		//gbc_lblNewLabel.anchor=GridBagConstraints.FIRST_LINE_START;
		//gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		//c.anchor=GridBagConstraints.BASELINE;
		c.fill= GridBagConstraints.HORIZONTAL;
		c.weightx=0.5;
		c.weighty=0.5;
		c.gridheight=1;
		c.gridwidth=5;
		c.gridx = 0;
		c.gridy = 3;
		//c.anchor= GridBagConstraints.PAGE_END;
		c.insets= new Insets(5,10,550,10);
		mainframe.getContentPane().add(panel_Status,c);
		//lbl_Status label on top so rest of them show
		lbl_Status = new JLabel("Status");
		lbl_Status.setFont(new Font("Times New Roman", Font.BOLD, 20));
		gbc_panel_Status.anchor=GridBagConstraints.NORTHWEST;
		gbc_panel_Status.gridx=0;
		gbc_panel_Status.gridy=0;
		gbc_panel_Status.weightx=0.5;
		gbc_panel_Status.weighty=0.5;
		panel_Status.add(lbl_Status,gbc_panel_Status);
		/*
		nextone=new JLabel("name it [pls");
		gbc_panel_Status.gridx=0;
		gbc_panel_Status.gridy=1;
		panel_Status.add(nextone,gbc_panel_Status);
		*/
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);

        //Create and set up the window.
        mainframe = new JFrame();
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        addComponentsToPane(mainframe.getContentPane());

        //Display the window.
        mainframe.pack();
        mainframe.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}