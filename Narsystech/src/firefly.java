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
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class firefly {
	
	/*-------------------------------------------------------------------------------------------------------------------------------
	 * Variables
	 -------------------------------------------------------------------------------------------------------------------------------*/
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
    
    private static JFrame mainframe;
    
    private static JPanel panel_Description;
    private static JLabel lbl_Description;
    
    /*
     * ServerControls Panel
     */
    private static JPanel panel_ServerControls;
    private static JLabel lbl_ServerControls;
    private static GridBagConstraints gbc_ServerControls;
    //
    private static JLabel lbl_UIControl;
    private static JComboBox comboBox_YN;
    //
    private static JLabel lbl_ServerCommand;
    private static JTextField textField_ServerCommand;
    private static JButton btn_Launch;
    //
    private static JLabel lbl_InternetAddress;
    private static JTextField textField_InternetAddress;
    //
    private static JLabel lbl_Port;
    private static JTextField textField_Port;
    private static JButton btn_Connect;
    
    /*
     * Controls Panel
     */
    private static JPanel panel_Controls;
	private static JLabel lbl_Controls;
	private static GridBagConstraints gbc_Controls;
	//
	private static JPanel panel_Infrastructure;
	private static GridBagConstraints gbc_Infrastructure;
	private static JLabel lbl_Infrastructure;
	private static JButton btn_LogMessages;
	//
	private static JPanel panel_ConstructProject;
	private static GridBagConstraints gbc_ConstructProject;
	private static JLabel lbl_ConstructProject;
	private static JButton btn_Projects;
	private static JButton btn_Data;
	//
	private static JPanel panel_DefineProduction;
	private static GridBagConstraints gbc_DefineProduction;
	private static JLabel lbl_DefineProduction;
	private static JButton btn_Production;
	//
	private static JPanel panel_DefineReservoir;
	private static GridBagConstraints gbc_DefineReservoir;
	private static JLabel lbl_DefineReservoir;
	private static JButton btn_Reservoir;
	private static JButton btn_Permeability;
	//
	private static JPanel panel_Forecasts;
	private static GridBagConstraints gbc_Forecasts;
	private static JLabel lbl_Forecasts;
	private static JButton btn_PPM;
	private static JButton btn_Forecasts;
	
	/*
	 * Status Panel
	 */
	private static JPanel panel_Status;
	private static JLabel lbl_Status;
	//
	private static JLabel lbl_Project;
	private static JLabel lbl_ProjectValue;
	//
	private static JLabel lbl_Volume;
	private static JLabel lbl_VolumeValue;
	
	
	/*-------------------------------------------------------------------------------------------------------------------------------
	 * beginning of code
	 -------------------------------------------------------------------------------------------------------------------------------*/
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
		gbc_lblDescription.insets = new Insets(0, 50, 5, 40);
		gbc_lblDescription.gridx = 0;
		gbc_lblDescription.gridy = 0;
		gbc_lblDescription.gridheight=1;
		gbc_lblDescription.gridwidth=5;
		gbc_lblDescription.weightx = 0.5;
		gbc_lblDescription.weighty = 0.5;
		//gbc_lblDescription.ipadx = 500;
		//gbc_lblDescription.ipady = 0;
		lbl_Description.setMinimumSize(new Dimension(300,120));
		lbl_Description.setPreferredSize(new Dimension(600,120));
		lbl_Description.setMaximumSize(new Dimension(700,120));
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
	    panel_ServerControls.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
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
		
		lbl_ServerControls= new JLabel("Server Controls");
		gbc_ServerControls.gridx = 0;
		gbc_ServerControls.gridy = 0;
		gbc_ServerControls.gridheight=1;
		gbc_ServerControls.gridwidth=1;
		gbc_ServerControls.weightx=0.5;
		gbc_ServerControls.weighty=0.5;
		lbl_ServerControls.setFont(new Font("Times New Roman", Font.BOLD, 20));
		gbc_ServerControls.anchor=GridBagConstraints.WEST;
		gbc_ServerControls.insets = new Insets(5, 10, 0, 0);
		panel_ServerControls.add(lbl_ServerControls, gbc_ServerControls);
		
		/*/////////////////////////////////////////////
		 * UI Control
		 /////////////////////////////////////////////*/
	    lbl_UIControl= new JLabel("User Interface Control: ");
		lbl_UIControl.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gbc_ServerControls.gridx = 0;
		gbc_ServerControls.gridy = 1;
		gbc_ServerControls.gridheight=1;
		gbc_ServerControls.gridwidth=1;
		gbc_ServerControls.weightx=0.5;
		gbc_ServerControls.weighty=0.5;
		//gbc_ServerControls.anchor=GridBagConstraints.WEST;
		gbc_ServerControls.insets = new Insets(20, 15, 20, 0);
		panel_ServerControls.add(lbl_UIControl, gbc_ServerControls);
		
		/*
		 * Yes/No Combo Box
		 */
		String[] serverYN = {"Yes","No"};
		comboBox_YN = new JComboBox(serverYN);
		comboBox_YN.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		comboBox_YN.setBackground(new Color(255, 213, 227));
		comboBox_YN.setToolTipText("<html>Commands issued through the<br/>client API can control the<br/>graphics view on the client. This<br/>is a good way to troubleshoot<br/>possible issues while writing a<br/>client application. Select Yes to<br/>control the graphics.<html>");
		gbc_ServerControls.gridx=0;
		gbc_ServerControls.gridy=1;
		gbc_ServerControls.anchor=GridBagConstraints.LINE_START;
		comboBox_YN.setFont(new Font("Calibri", Font.PLAIN, 13));
		comboBox_YN.setBackground(new Color(255,245,238));
		//gbc_ServerControls.fill=GridBagConstraints.WEST;
		//gbc_ServerControls.gridwidth=1;
		//comboBox_YN.setBounds(145, 35, 60, 25);
		gbc_ServerControls.weightx=0.5;
		gbc_ServerControls.weighty=0.5;
		gbc_ServerControls.ipadx = 15;
		gbc_ServerControls.ipady = 0;
		gbc_ServerControls.insets= new Insets(0,160,0,0);
		//gbc_ServerControls.anchor=GridBagConstraints.CENTER;
		panel_ServerControls.add(comboBox_YN,gbc_ServerControls);
		
		gbc_ServerControls.ipadx = 0;
		gbc_ServerControls.ipady = 0;
		
		/*/////////////////////////////////////////////
		 * Server Command
		 /////////////////////////////////////////////*/
	    lbl_ServerCommand= new JLabel("Server Command: ");
		lbl_ServerCommand.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gbc_ServerControls.gridx=0;
		gbc_ServerControls.gridy=2;
		gbc_ServerControls.gridheight=1;
		gbc_ServerControls.gridwidth=1;
		gbc_ServerControls.weightx=0.5;
		gbc_ServerControls.weighty=0.5;
		gbc_ServerControls.insets = new Insets(0, 47, 20, 0);
		//gbc_ServerControls.anchor=GridBagConstraints.WEST;
		panel_ServerControls.add(lbl_ServerCommand, gbc_ServerControls);
		
		/*
		 * Server Command Text Field
		 */
		textField_ServerCommand = new JTextField();
		textField_ServerCommand.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		gbc_ServerControls.fill=GridBagConstraints.HORIZONTAL;
		gbc_ServerControls.gridx=0;
		gbc_ServerControls.gridy=2;
		gbc_ServerControls.weightx=1;
		gbc_ServerControls.weighty=0.5;
		gbc_ServerControls.ipadx = 0;
		gbc_ServerControls.ipady = 5;
		gbc_ServerControls.gridwidth = 2;
		gbc_ServerControls.insets= new Insets(0,160,20,0);
		textField_ServerCommand.setToolTipText("<html>Input a command that will be<br/>executed from a DOS command<br/>line. Servers can be launched this<br/>way. Make sure sure each<br/>instance has a different port<br/>number to make sure your client<br/>application is connected to the<br/>correct project.<html>");
		textField_ServerCommand.setText("C:/Program Files/NarSysTech/ActiveModel/ActiveModel.exe");
		//textField_ServerCommand.setBounds(145, 73, 445, 20);
	    //gbc_ServerControls.fill=GridBagConstraints.RELATIVE;
		panel_ServerControls.add(textField_ServerCommand,gbc_ServerControls);
		
		gbc_ServerControls.ipadx = 0;
		gbc_ServerControls.ipady = 0;
					
		/*
		 * Launch Button
		 */
		btn_Launch = new JButton("Launch");
		btn_Launch.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_Launch.setFont(new Font("Calibri", Font.PLAIN, 13));
		btn_Launch.setBackground(new Color(255, 213, 227));
		btn_Launch.setToolTipText("<html>Open a command prompt and<br/>execute the supplied command.<html>");
		gbc_ServerControls.gridx=3;
		gbc_ServerControls.gridy=2;
		gbc_ServerControls.weightx=0.1;
		gbc_ServerControls.weighty=0;
		//gbc_ServerControls.ipadx = 10;
		gbc_ServerControls.ipady = 5;
		gbc_ServerControls.insets= new Insets(0,10,20,10);
		panel_ServerControls.add(btn_Launch, gbc_ServerControls);
		
		gbc_ServerControls.ipadx = 0;
		gbc_ServerControls.ipady = 0;
		
		/*/////////////////////////////////////////////
		 * Internet Address
		 /////////////////////////////////////////////*/
		lbl_InternetAddress= new JLabel("Internet Address: ");
		lbl_InternetAddress.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gbc_ServerControls.gridx=0;
		gbc_ServerControls.insets = new Insets(0, 51, 5, 0);
		gbc_ServerControls.gridy=3;
		gbc_ServerControls.gridheight=1;
		gbc_ServerControls.gridwidth=1;
		gbc_ServerControls.weightx=0.5;
		gbc_ServerControls.weighty=0.5;
		//gbc_ServerControls.anchor=GridBagConstraints.LINE_START;
		//gbc_ServerControls.insets= new Insets(0,15,0,0);
		panel_ServerControls.add(lbl_InternetAddress, gbc_ServerControls);
		
		/*
		 * Internet Address Text Field
		 */
		textField_InternetAddress = new JTextField();
		textField_InternetAddress.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_InternetAddress.setToolTipText("<html>Enter the LAN address where the<br/>servers are running.<html>");
		textField_InternetAddress.setText("127.0.0.1");
		gbc_ServerControls.gridx=0;
		gbc_ServerControls.insets= new Insets(0,160,5,0);
		gbc_ServerControls.gridy=3;
		gbc_ServerControls.weightx=0.5;
		gbc_ServerControls.weighty=.5;
		gbc_ServerControls.ipadx = 150;
		gbc_ServerControls.ipady = 5;
		panel_ServerControls.add(textField_InternetAddress, gbc_ServerControls);
		
		gbc_ServerControls.ipadx = 0;
		gbc_ServerControls.ipady = 0;
		
		/*/////////////////////////////////////////////
		 * Port
		 /////////////////////////////////////////////*/
	    lbl_Port = new JLabel("Port: ");
		gbc_ServerControls.insets= new Insets(0,10,5,0);
		gbc_ServerControls.gridx=1;
		gbc_ServerControls.gridy=3;
		gbc_ServerControls.weightx=0.5;
		gbc_ServerControls.weighty=.5;
		lbl_Port.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		panel_ServerControls.add(lbl_Port, gbc_ServerControls);
		
		/*
		 *  Port Text Field
		 */
		textField_Port = new JTextField();
		textField_Port.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_Port.setToolTipText("<html>Enter the port number for the<br/>server instance that you wish to<br/>connect to.<html>");
		textField_Port.setText("25322");
		gbc_ServerControls.gridx=1;
		gbc_ServerControls.insets= new Insets(0,40,5,0);
		gbc_ServerControls.gridy=3;
		gbc_ServerControls.weightx=0.5;
		gbc_ServerControls.weighty=0.5;
		gbc_ServerControls.ipadx = 0;
		gbc_ServerControls.ipady = 5;
		panel_ServerControls.add(textField_Port, gbc_ServerControls);
		
		gbc_ServerControls.ipadx = 0;
		gbc_ServerControls.ipady = 0;
		
		/*
		 *  Connect Button
		 */
		btn_Connect= new JButton("Connect");
		btn_Connect.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_Connect.setToolTipText("<html>Establish a connection to the<br/>server running on the supplied IP<br/>address, with the supplied port<br/>number. The server must already<br/>be running and setup to connect<br/>on the same port number.<br/>Multiple servers can be<br/>connected to but they must each<br/>have a unique port number.<html>");
		btn_Connect.setBackground(new Color(255, 213, 227));
		btn_Connect.setFont(new Font("Calibri", Font.PLAIN, 13));
		gbc_ServerControls.gridx=4;
		gbc_ServerControls.insets= new Insets(0,10,5,10);
		gbc_ServerControls.gridy=3;
		gbc_ServerControls.weightx=0.1;
		gbc_ServerControls.weighty=0;
		gbc_ServerControls.ipadx = 10;
		gbc_ServerControls.ipady = 5;
		panel_ServerControls.add(btn_Connect, gbc_ServerControls);
		
		gbc_ServerControls.ipadx = 0;
		gbc_ServerControls.ipady = 0;
		
		
		/*-------------------------------------------------------------------------------------------------------------------------------
		 * SET 1 SET 1 SET 1 SET 1 SET 1 SET 1 SET 1 SET 1 SET 1 SET 1 SET 1 SET 1 SET 1 SET 1 SET 1 SET 1 SET 1 SET 1 
		 * 
		 * Controls region for Infrastructure, Project, Production, Reservoir, Forecasts
		 -------------------------------------------------------------------------------------------------------------------------------*/
		panel_Controls= new JPanel(new GridBagLayout());
		panel_Controls.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_Controls.setBackground(new Color(240,255,240)); 
		gbc_Controls = new GridBagConstraints();
		/*
		 *  below comments are reference to useful programming statements
		 *  //gbc_lblNewLabel.insets = new Insets(10, 10, 0, 10);
		 *	//gbc_lblNewLabel.anchor=GridBagConstraints.FIRST_LINE_START;
		 *	//gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		 *	//c.anchor=GridBagConstraints.CENTER;
		 */
		c.weightx=0.5;
		c.weighty=0.5;
		c.gridheight=1;
		c.gridwidth=5;
		c.gridx = 0;
		c.gridy = 2;
		//c.insets= new Insets(0,0,210,0);
		c.fill=GridBagConstraints.BOTH;
		mainframe.getContentPane().add(panel_Controls,c);
		
		/*
		 * Controls label
		 */
		lbl_Controls= new JLabel("Controls");
		lbl_Controls.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
		gbc_Controls.gridx = 0;
		gbc_Controls.gridy = 0;
		gbc_Controls.fill = GridBagConstraints.BOTH;
		gbc_Controls.anchor = GridBagConstraints.NORTHWEST;
		gbc_Controls.gridheight=1;
		gbc_Controls.gridwidth=1;
		gbc_Controls.weightx=0.5;
		gbc_Controls.weighty=0.5;
		gbc_Controls.insets = new Insets(5, 10, 0, 0);
		//gbc_Controls.anchor=GridBagConstraints.WEST;
		//gbc_Controls.insets = new Insets(0, 0, 0, 220);
		panel_Controls.add(lbl_Controls, gbc_Controls);
		
		gbc_Controls.insets = new Insets(0, 0, 0, 0);
		
		
		/*/////////////////////////////////////////////
		 * Infrastructure
		 /////////////////////////////////////////////*/
		panel_Infrastructure = new JPanel();
		panel_Infrastructure.setBackground(new Color(240,255,240)); 
		panel_Infrastructure.setBorder(new LineBorder(new Color(0, 0, 0)));
		gbc_Controls.fill = GridBagConstraints.BOTH;
		gbc_Controls.anchor = GridBagConstraints.FIRST_LINE_START;
		gbc_Controls.gridy = 1;
		gbc_Controls.weightx = 1;
		gbc_Controls.insets = new Insets(10,5,5,5);
		panel_Controls.add(panel_Infrastructure,gbc_Controls);
		
		gbc_Infrastructure = new GridBagConstraints();
		
		lbl_Infrastructure = new JLabel("Infrastructure:");
		lbl_Infrastructure.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gbc_Infrastructure.anchor=GridBagConstraints.LINE_START; //does not work
		gbc_Infrastructure.gridx = 0;
		gbc_Infrastructure.gridy=0;
		gbc_Infrastructure.insets = new Insets(5,5,5,5); 
		panel_Infrastructure.add(lbl_Infrastructure, gbc_Infrastructure);
		
		btn_LogMessages = new JButton("Log Messages");
		btn_LogMessages.setToolTipText("<html>Access all server logs and test. It<br/>is important to note that the<br/>server and client-side should use<br/>the same logging system to allow<br/>efficient troubleshooting.<html>");
		btn_LogMessages.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_LogMessages.setBackground(new Color(180, 255, 255));
		gbc_Infrastructure.anchor=GridBagConstraints.NORTHWEST;
		gbc_Infrastructure.gridx = 1;
		gbc_Infrastructure.ipadx = 5;//does not work
		gbc_Infrastructure.ipady = 5;//does not work
		gbc_Infrastructure.insets = new Insets(5,5,5,5);
		panel_Infrastructure.add(btn_LogMessages, gbc_Infrastructure);
		
		/*
		 * i am excluding the stuff that doesn't work so the answer can be added
		 * fix the infrastructure first and do the rest
		 */
		
		
		/*/////////////////////////////////////////////
		 * Construct Project
		 /////////////////////////////////////////////*/
		panel_ConstructProject = new JPanel();
		panel_ConstructProject.setBackground(new Color(240,255,240)); 
		panel_ConstructProject.setBorder(new LineBorder(new Color(0, 0, 0)));
		gbc_Controls.fill = GridBagConstraints.BOTH;
		gbc_Controls.anchor = GridBagConstraints.FIRST_LINE_START;
		gbc_Controls.gridy = 2;
		gbc_Controls.weightx = 1;
		gbc_Controls.insets = new Insets(5,5,5,5);
		panel_Controls.add(panel_ConstructProject,gbc_Controls);
		
		gbc_ConstructProject = new GridBagConstraints();
		
		lbl_ConstructProject = new JLabel("Construct Project:");
		lbl_ConstructProject.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gbc_ConstructProject.gridx = 0;
		gbc_ConstructProject.insets = new Insets(5, 5, 5, 5);
		panel_ConstructProject.add(lbl_ConstructProject, gbc_ConstructProject);
		
		btn_Projects = new JButton("Projects");
		btn_Projects.setToolTipText("<html>Define new projects, edit existing<br/>projects and control which<br/>projects are opena and therefore<br/>accessible. When a connection to<br/>a server is initially made, the<br/>project is automatically set to<br/>whatever project is currently<br/>open on the server side.<html>");
		btn_Projects.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_Projects.setBackground(new Color(255, 235, 245));
		gbc_ConstructProject.gridx = 1;
		gbc_ConstructProject.insets = new Insets(5, 5, 5, 5);
		panel_ConstructProject.add(btn_Projects, gbc_ConstructProject);
		
		btn_Data = new JButton("Data");
		btn_Data.setToolTipText("<html>Load, review and edit all the<br/>various data types needed to<br/>build and update a Production<br/>Potential Model.<html>");
		btn_Data.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_Data.setBackground(new Color(255, 213, 227));
		gbc_ConstructProject.gridx = 2;
		gbc_ConstructProject.insets = new Insets(5, 5, 5, 5);
		panel_ConstructProject.add(btn_Data, gbc_ConstructProject);
		
		
		/*/////////////////////////////////////////////
		 * Define Production
		 /////////////////////////////////////////////*/
		panel_DefineProduction = new JPanel();
		panel_DefineProduction.setBackground(new Color(240,255,240)); 
		panel_DefineProduction.setBorder(new LineBorder(new Color(0, 0, 0)));
		gbc_Controls.fill = GridBagConstraints.BOTH;
		gbc_Controls.anchor = GridBagConstraints.FIRST_LINE_START;
		gbc_Controls.gridy = 3;
		gbc_Controls.weightx = 1;
		gbc_Controls.insets = new Insets(5,5,5,5);
		panel_Controls.add(panel_DefineProduction,gbc_Controls);
		
		gbc_DefineProduction = new GridBagConstraints();
		
		lbl_DefineProduction = new JLabel("Define Production:");
		lbl_DefineProduction.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gbc_DefineProduction.gridx = 0;
		gbc_DefineProduction.insets = new Insets(5, 5, 5, 5);
		panel_DefineProduction.add(lbl_DefineProduction, gbc_DefineProduction);
		
		btn_Production = new JButton("Production");
		btn_Production.setToolTipText("<html>Load, review, edit and delete<br/>production related information<br/>that is used to compute drainage<br/>and assign production to each<br/>well.<html>");
		btn_Production.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_Production.setBackground(new Color(152, 251, 152));
		gbc_DefineProduction.gridx = 1;
		gbc_DefineProduction.insets = new Insets(5, 5, 5, 5);
		panel_DefineProduction.add(btn_Production, gbc_DefineProduction);
		
		
		/*/////////////////////////////////////////////
		 * Define Reservoir
		 /////////////////////////////////////////////*/
		panel_DefineReservoir = new JPanel();
		panel_DefineReservoir.setBackground(new Color(240,255,240)); 
		panel_DefineReservoir.setBorder(new LineBorder(new Color(0, 0, 0)));
		gbc_Controls.fill = GridBagConstraints.BOTH;
		gbc_Controls.anchor = GridBagConstraints.FIRST_LINE_START;
		gbc_Controls.gridy = 4;
		gbc_Controls.weightx = 1;
		gbc_Controls.insets = new Insets(5,5,5,5);
		panel_Controls.add(panel_DefineReservoir,gbc_Controls);
		
		gbc_DefineReservoir = new GridBagConstraints();
		
		lbl_DefineReservoir = new JLabel("Define Reservoir:");
		lbl_DefineReservoir.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gbc_DefineReservoir.gridx = 0;
		gbc_DefineReservoir.insets = new Insets(5, 5, 5, 5);
		panel_DefineReservoir.add(lbl_DefineReservoir, gbc_DefineReservoir);
		
		btn_Reservoir = new JButton("Reservoir");
		btn_Reservoir.setToolTipText("<html>Define the bounds of the<br/>reservoir.<html>");
		btn_Reservoir.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_Reservoir.setBackground(new Color(255, 218, 185));
		gbc_DefineReservoir.gridx = 1;
		gbc_DefineReservoir.insets = new Insets(5, 5, 5, 5);
		panel_DefineReservoir.add(btn_Reservoir, gbc_DefineReservoir);
		
		btn_Permeability = new JButton("Permeability");
		btn_Permeability.setToolTipText("<html>Define how permeabilities are<br/>distributed within the reservoir<br/>and how the native<br/>permeabilities are impacted by<br/>wells and stimulations and<br/>associated data sets like DFN's<html>");
		btn_Permeability.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_Permeability.setBackground(new Color(255, 246, 143));
		gbc_DefineReservoir.gridx = 2;
		gbc_DefineReservoir.insets = new Insets(5, 5, 5, 5);
		panel_DefineReservoir.add(btn_Permeability, gbc_DefineReservoir);
		
		
		/*/////////////////////////////////////////////
		 * Forecasts
		 /////////////////////////////////////////////*/
		panel_Forecasts = new JPanel();
		panel_Forecasts.setBackground(new Color(240,255,240)); 
		panel_Forecasts.setBorder(new LineBorder(new Color(0, 0, 0)));
		gbc_Controls.fill = GridBagConstraints.BOTH;
		gbc_Controls.anchor = GridBagConstraints.FIRST_LINE_START;
		gbc_Controls.gridy = 5;
		gbc_Controls.weightx = 1;
		gbc_Controls.insets = new Insets(5,5,5,5);
		panel_Controls.add(panel_Forecasts,gbc_Controls);
		
		gbc_Forecasts  = new GridBagConstraints();
		
		lbl_Forecasts = new JLabel("Forecasts:");
		lbl_Forecasts.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gbc_Forecasts.gridx = 0;
		gbc_Forecasts.insets = new Insets(5, 5, 5, 5);
		panel_Forecasts.add(lbl_Forecasts, gbc_Forecasts);
		
		btn_PPM = new JButton("PPM");
		btn_PPM.setToolTipText("<html>Define how properties and<br/>compute the production<br/>potential model.<html>");
		btn_PPM.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_PPM.setBackground(new Color(216, 191, 216));
		gbc_Forecasts.gridx = 1;
		gbc_Forecasts.insets = new Insets(5, 5, 5, 5);
		panel_Forecasts.add(btn_PPM, gbc_Forecasts);
		
		btn_Forecasts = new JButton("Forecasts");
		btn_Forecasts.setToolTipText("<html>Read slices of data from data<br/>volumes contained in a project<br/>and review in 2D window. This<br/>will include the PPM volumes<br/>which can also be accessed vai<br/>the PPM Controls.<html>");
		btn_Forecasts.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_Forecasts.setBackground(new Color(230,230,250));
		gbc_Forecasts.gridx = 2;
		gbc_Forecasts.insets = new Insets(5, 5, 5, 5);
		panel_Forecasts.add(btn_Forecasts, gbc_Forecasts);
		
		
		/*
		lbl_Infrastructure= new JLabel("Infrastructure: ");
		gbc_Controls.gridx = 0;
		gbc_Controls.gridy = 1;
		gbc_Controls.gridheight=1;
		gbc_Controls.gridwidth=1;
		gbc_Controls.weightx=0.5;
		gbc_Controls.weighty=0.5;
		lbl_Infrastructure.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		//gbc_Controls.insets = new Insets(20, 0, 0, 0);
		//gbc_Controls.anchor=GridBagConstraints.WEST;
		//gbc_Controls.insets = new Insets(100, 0, 0, 220);
		panel_Controls.add(lbl_Infrastructure, gbc_Controls);
		//Construct Project label
		lbl_ConstructProject= new JLabel("Construct Project: ");
		gbc_Controls.gridx = 0;
		gbc_Controls.gridy = 2;
		gbc_Controls.gridheight=1;
		gbc_Controls.gridwidth=1;
		gbc_Controls.weightx=0.5;
		gbc_Controls.weighty=0.5;
		lbl_Infrastructure.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		//gbc_Controls.insets = new Insets(20, 0, 0, 0);
		//gbc_Controls.anchor=GridBagConstraints.WEST;
		//gbc_Controls.insets = new Insets(100, 0, 0, 220);
		panel_Controls.add(lbl_ConstructProject, gbc_Controls);
		//Define Production Label
		lbl_DefineProduction= new JLabel("Define Production: ");
		gbc_Controls.gridx = 0;
		gbc_Controls.gridy = 3;
		gbc_Controls.gridheight=1;
		gbc_Controls.gridwidth=1;
		gbc_Controls.weightx=0.5;
		gbc_Controls.weighty=0.5;
		lbl_Infrastructure.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		//gbc_Controls.insets = new Insets(20, 0, 0, 0);
		//gbc_Controls.anchor=GridBagConstraints.WEST;
		//gbc_Controls.insets = new Insets(100, 0, 0, 220);
		panel_Controls.add(lbl_DefineProduction, gbc_Controls);
		//Define Reservoir
		lbl_DefineReservoir= new JLabel("Define Reservoir: ");
		gbc_Controls.gridx = 0;
		gbc_Controls.gridy = 4;
		gbc_Controls.gridheight=1;
		gbc_Controls.gridwidth=1;
		gbc_Controls.weightx=0.5;
		gbc_Controls.weighty=0.5;
		lbl_Infrastructure.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		//gbc_Controls.insets = new Insets(20, 0, 0, 0);
		//gbc_Controls.anchor=GridBagConstraints.WEST;
		//gbc_Controls.insets = new Insets(100, 0, 0, 220);
		panel_Controls.add(lbl_DefineReservoir, gbc_Controls);
		//Forecasts Label
		lbl_Forecasts= new JLabel("Forecasts: ");
		gbc_Controls.gridx = 0;
		gbc_Controls.gridy = 5;
		gbc_Controls.gridheight=1;
		gbc_Controls.gridwidth=1;
		gbc_Controls.weightx=0.5;
		gbc_Controls.weighty=0.5;
		lbl_Infrastructure.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		//gbc_Controls.insets = new Insets(20, 0, 0, 0);
		//gbc_Controls.anchor=GridBagConstraints.WEST;
		//gbc_Controls.insets = new Insets(100, 0, 0, 220);
		panel_Controls.add(lbl_Forecasts, gbc_Controls);
		gbc_Controls.fill= GridBagConstraints.NONE;
		// Log Messages button
		btn_LogMessages= new JButton("Log Messages");
		btn_LogMessages.setToolTipText("<html>Access all server logs and test. It<br/>is important to note that the<br/>server and client-side should use<br/>the same logging system to allow<br/>efficient troubleshooting.<html>");
		gbc_Controls.gridx=1;
		gbc_Controls.gridy=1;
		gbc_Controls.gridheight=1;
		gbc_Controls.gridwidth=1;
		gbc_Controls.weightx=0.5;
		gbc_Controls.weighty=0.5;
		//btn_LogMessages.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_LogMessages.setBackground(new Color(180, 255, 255));
		//btn_LogMessages.setBounds(130, 4, 110, 23);
		panel_Controls.add(btn_LogMessages,gbc_Controls);
		//Projects Label
		btn_Projects= new JButton("Projects");
		btn_Projects.setToolTipText("<html>Define new projects, edit existing<br/>projects and control which<br/>projects are opena and therefore<br/>accessible. When a connection to<br/>a server is initially made, the<br/>project is automatically set to<br/>whatever project is currently<br/>open on the server side.<html>");
		gbc_Controls.gridx=1;
		gbc_Controls.gridy=2;
		gbc_Controls.gridheight=1;
		gbc_Controls.gridwidth=1;
		gbc_Controls.weightx=0.5;
		gbc_Controls.weighty=0.5;
		//btn_LogMessages.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_Projects.setBackground(new Color(255, 235, 245));
		//btn_LogMessages.setBounds(130, 4, 110, 23);
		panel_Controls.add(btn_Projects,gbc_Controls);
		//data button
		btn_Data= new JButton("Data");
		btn_Data.setToolTipText("<html>Load, review and edit all the<br/>various data types needed to<br/>build and update a Production<br/>Potential Model.<html>");
		gbc_Controls.gridx=2;
		gbc_Controls.gridy=2;
		gbc_Controls.gridheight=1;
		gbc_Controls.gridwidth=1;
		gbc_Controls.weightx=0.5;
		gbc_Controls.weighty=0.5;
		//btn_LogMessages.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_Data.setBackground(new Color(255, 213, 227));
		//btn_LogMessages.setBounds(130, 4, 110, 23);
		panel_Controls.add(btn_Data,gbc_Controls);
		//production button
		btn_Production= new JButton("Production");
		btn_Production.setToolTipText("<html>Load, review, edit and delete<br/>production related information<br/>that is used to compute drainage<br/>and assign production to each<br/>well.<html>");
		gbc_Controls.gridx=1;
		gbc_Controls.gridy=3;
		gbc_Controls.gridheight=1;
		gbc_Controls.gridwidth=1;
		gbc_Controls.weightx=0.5;
		gbc_Controls.weighty=0.5;
		//btn_LogMessages.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_Production.setBackground(new Color(152, 251, 152));
		//btn_LogMessages.setBounds(130, 4, 110, 23);
		panel_Controls.add(btn_Production,gbc_Controls);
		// reservoir button
		btn_Reservoir= new JButton("Reservoir");
		btn_Reservoir.setToolTipText("<html>Define the bounds of the<br/>reservoir.<html>");
		gbc_Controls.gridx=1;
		gbc_Controls.gridy=4;
		gbc_Controls.gridheight=1;
		gbc_Controls.gridwidth=1;
		gbc_Controls.weightx=0.5;
		gbc_Controls.weighty=0.5;
		//btn_LogMessages.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_Reservoir.setBackground(new Color(255, 218, 185));
		//btn_LogMessages.setBounds(130, 4, 110, 23);
		panel_Controls.add(btn_Reservoir,gbc_Controls);
		//permeability button
		btn_Permeability= new JButton("Permeability");
		btn_Permeability.setToolTipText("<html>Define how permeabilities are<br/>distributed within the reservoir<br/>and how the native<br/>permeabilities are impacted by<br/>wells and stimulations and<br/>associated data sets like DFN's<html>");
		gbc_Controls.gridx=2;
		gbc_Controls.gridy=4;
		gbc_Controls.gridheight=1;
		gbc_Controls.gridwidth=1;
		gbc_Controls.weightx=0.5;
		gbc_Controls.weighty=0.5;
		//btn_LogMessages.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_Permeability.setBackground(new Color(255, 246, 143));
		//btn_LogMessages.setBounds(130, 4, 110, 23);
		panel_Controls.add(btn_Permeability,gbc_Controls);
		//PPM button
		btn_PPM= new JButton("PPM");
		btn_PPM.setToolTipText("<html>Define how properties and<br/>compute the production<br/>potential model.<html>");
		gbc_Controls.gridx=1;
		gbc_Controls.gridy=5;
		gbc_Controls.gridheight=1;
		gbc_Controls.gridwidth=1;
		gbc_Controls.weightx=0.5;
		gbc_Controls.weighty=0.5;
		//btn_LogMessages.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_PPM.setBackground(new Color(216, 191, 216));
		//btn_LogMessages.setBounds(130, 4, 110, 23);
		panel_Controls.add(btn_PPM,gbc_Controls);
		//Forecasts button
		btn_Forecasts= new JButton("Forecasts");
		btn_Forecasts.setToolTipText("<html>Read slices of data from data<br/>volumes contained in a project<br/>and review in 2D window. This<br/>will include the PPM volumes<br/>which can also be accessed vai<br/>the PPM Controls.<html>");
		gbc_Controls.gridx=2;
		gbc_Controls.gridy=5;
		gbc_Controls.gridheight=1;
		gbc_Controls.gridwidth=1;
		gbc_Controls.weightx=0.5;
		gbc_Controls.weighty=0.5;
		//btn_LogMessages.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_Forecasts.setBackground(new Color(230,230,250));
		//btn_LogMessages.setBounds(130, 4, 110, 23);
		panel_Controls.add(btn_Forecasts,gbc_Controls);
		*/
		
		/*-------------------------------------------------------------------------------------------------------------------------------
		 * Status region for Project and Volume
		 -------------------------------------------------------------------------------------------------------------------------------*/
		panel_Status= new JPanel(new GridBagLayout());
		panel_Status.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_Status.setBackground(new Color(230,230,250)); 
		GridBagConstraints gbc_Status = new GridBagConstraints();
		// below comments are reference to useful programming statements
		//gbc_lblNewLabel.insets = new Insets(10, 10, 0, 10);
		//gbc_lblNewLabel.anchor=GridBagConstraints.FIRST_LINE_START;
		//gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		//c.anchor=GridBagConstraints.BASELINE;
		c.fill= GridBagConstraints.BOTH;
		c.weightx=0.5;
		c.weighty=0.5;
		c.gridheight=1;
		c.gridwidth=5;
		c.gridx = 0;
		c.gridy = 3;
		//c.anchor= GridBagConstraints.PAGE_END;
		c.insets= new Insets(10,10,550,10);
		mainframe.getContentPane().add(panel_Status,c);
		
		/*
		 * Status label
		 */
		lbl_Status = new JLabel("Status");
		lbl_Status.setFont(new Font("Times New Roman", Font.BOLD, 20));
		gbc_Status.anchor=GridBagConstraints.NORTHWEST;
		gbc_Status.gridx=0;
		gbc_Status.gridy=0;
		gbc_Status.weightx=0.5;
		gbc_Status.weighty=0.5;
		gbc_Status.insets = new Insets(5,10,10,10);
		panel_Status.add(lbl_Status,gbc_Status);
		
		lbl_Project = new JLabel("Project:");
		lbl_Project.setFont(new Font("Times New Roman", Font.BOLD, 15));
		gbc_Status.gridx=0;
		gbc_Status.gridy=1;
		gbc_Status.weightx=0.5;
		gbc_Status.weighty=0.5;
		gbc_Status.insets = new Insets(0,22,10,10);
		panel_Status.add(lbl_Project,gbc_Status);
		
		lbl_ProjectValue = new JLabel("<none>");
		gbc_Status.anchor = GridBagConstraints.LINE_START;
		gbc_Status.gridx = 0;
		gbc_Status.gridy = 1;
		gbc_Status.weightx=0;
		gbc_Status.weighty=0.5;
		gbc_Status.insets = new Insets(0,90,10,10);
		panel_Status.add(lbl_ProjectValue,gbc_Status);
		
		lbl_Volume = new JLabel("Volume:");
		lbl_Volume.setFont(new Font("Times New Roman", Font.BOLD, 15));
		gbc_Status.gridx=0;
		gbc_Status.gridy=2;
		gbc_Status.weightx=0.5;
		gbc_Status.weighty=0.5;
		gbc_Status.insets = new Insets(0,20,10,10);
		panel_Status.add(lbl_Volume,gbc_Status);
		
		lbl_VolumeValue = new JLabel("<none>");
		gbc_Status.anchor = GridBagConstraints.LINE_START;
		gbc_Status.gridx = 0;
		gbc_Status.gridy = 2;
		gbc_Status.weightx=0;
		gbc_Status.weighty=0.5;
		gbc_Status.insets = new Insets(0,90,10,10);
		panel_Status.add(lbl_VolumeValue,gbc_Status);
		
		
    }

    
    /*-------------------------------------------------------------------------------------------------------------------------------
	 * End of code/rest of it
	 -------------------------------------------------------------------------------------------------------------------------------*/
    
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
