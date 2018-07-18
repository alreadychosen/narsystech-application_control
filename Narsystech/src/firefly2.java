import java.awt.Graphics;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class firefly3 {
	
	/*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	 * Variables
	 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
    
    private static JFrame mainframe;
    
    private static JPanel panel_Description;
    private static GridBagConstraints gbc_lblDescription;
    private static JLabel lbl_Description;
    
    /*
     * ServerControls Panel
     */
    private static JPanel panel_ServerControls;
    private static JLabel lbl_ServerControls;
    private static GridBagConstraints gbc_ServerControls;
    private static JPanel subPanel_Infrastructure=new JPanel();
    private static JPanel subPanel_ConstructProject=new JPanel();
    private static JPanel subPanel_DefineProduction=new JPanel();
    private static JPanel subPanel_DefineReservoir=new JPanel();
    private static JPanel subPanel_Forecasts=new JPanel();
    //
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
	private static JLabel filler1;
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
	private static JLabel filler2;
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
	
	/*
	 * "Button functionality" and "Border for Controls" variables on line 640, NEAR the bottom
	 */
	
	
	/*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	 * Code to put into mainframe
	 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    public static void addComponentsToPane(Container pane) {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        }

		mainframe.getContentPane().setBackground(new Color(176, 196, 222));
		mainframe.setTitle("NarSysTech Java Server");
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 591};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		mainframe.getContentPane().setLayout(gridBagLayout);
		
		/*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		 * Top Description
		 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
		//lbl_Description = new JLabel("<html>This graphical user interface is used to demonstrate the NarSysTech Python<br/>API. The controls read and write to a running version of the NarSysTech<br/>Software interogating and interacting with the currently open project. A project<br/>must be constructed, open and the python server started before the controls<br/>can be built and tested.<html>");
		/*
		 * the code here works
		 * can decrease and then increase in size without problem, and vice versa
		 * nikhil the orignal code you uploaded didnt work when going out of being compressed
		 */
		lbl_Description = new JLabel("<html>This graphical user interface is used to demonstrate the NarSysTech Python API. The controls read and write to a running version of the NarSysTech Software interogating and interacting with the currently open project. A project must be constructed, open and the python server started before the controls can be built and tested.<html>");
		lbl_Description.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lbl_Description.setMinimumSize(new Dimension(300,120));
		lbl_Description.setPreferredSize(new Dimension(600,120));
		
		panel_Description = new JPanel(new GridBagLayout());
		panel_Description.setBackground(new Color(176, 196, 222));
		panel_Description.add(lbl_Description);
		
		gbc_lblDescription = new GridBagConstraints();
		gbc_lblDescription.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDescription.anchor = GridBagConstraints.PAGE_START;
		gbc_lblDescription.insets = new Insets(0, 50, 5, 40);
		gbc_lblDescription.gridx = 0;
		gbc_lblDescription.gridy = 0;
		gbc_lblDescription.gridheight=1;
		gbc_lblDescription.gridwidth=5;
		gbc_lblDescription.weightx = 0.5;
		gbc_lblDescription.weighty = 0.5;
		mainframe.getContentPane().add(panel_Description, gbc_lblDescription);
		
		GridBagConstraints c = new GridBagConstraints();
		
        if (shouldFill) {
        	//natural height, maximum width
        	c.fill = GridBagConstraints.HORIZONTAL;
        }
        
        
        /*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		 * ServerControl - UI Control, ServerCommand, and Internet Address
		 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
	    panel_ServerControls = new JPanel(new GridBagLayout());
	    panel_ServerControls.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_ServerControls.setBackground(new Color(255,245,238)); 
		c.fill=GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.PAGE_START;
		c.gridx = 0;
		c.gridy = 1;
		c.weightx=0.5;
		c.weighty=0.5;
		c.gridheight=1;
		c.gridwidth=5;
		c.insets = new Insets(10, 10, 0, 10);
		mainframe.getContentPane().add(panel_ServerControls,c);

		gbc_ServerControls = new GridBagConstraints();
		
		/*-------------------------------------------------------------------------------------------------------------------------------
		 * Server Controls
		 -------------------------------------------------------------------------------------------------------------------------------*/
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
		
		/*-------------------------------------------------------------------------------------------------------------------------------
		 * UI Control
		 -------------------------------------------------------------------------------------------------------------------------------*/
	    lbl_UIControl= new JLabel("User Interface Control: ");
		lbl_UIControl.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gbc_ServerControls.gridx = 0;
		gbc_ServerControls.gridy = 1;
		gbc_ServerControls.gridheight=1;
		gbc_ServerControls.gridwidth=1;
		gbc_ServerControls.weightx=0.5;
		gbc_ServerControls.weighty=0.5;
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
		gbc_ServerControls.weightx=0.5;
		gbc_ServerControls.weighty=0.5;
		gbc_ServerControls.ipadx = 15;
		gbc_ServerControls.ipady = 0;
		gbc_ServerControls.insets= new Insets(0,160,0,0);
		panel_ServerControls.add(comboBox_YN,gbc_ServerControls);
		
		gbc_ServerControls.ipadx = 0;
		gbc_ServerControls.ipady = 0;
		
		/*-------------------------------------------------------------------------------------------------------------------------------
		 * Server Command
		 -------------------------------------------------------------------------------------------------------------------------------*/
	    lbl_ServerCommand= new JLabel("Server Command: ");
		lbl_ServerCommand.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gbc_ServerControls.gridx=0;
		gbc_ServerControls.gridy=2;
		gbc_ServerControls.gridheight=1;
		gbc_ServerControls.gridwidth=1;
		gbc_ServerControls.weightx=0.5;
		gbc_ServerControls.weighty=0.5;
		gbc_ServerControls.insets = new Insets(0, 47, 20, 0);
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
		gbc_ServerControls.ipady = 5;
		gbc_ServerControls.insets= new Insets(0,10,20,10);
		panel_ServerControls.add(btn_Launch, gbc_ServerControls);
		
		gbc_ServerControls.ipadx = 0;
		gbc_ServerControls.ipady = 0;
		
		/*-------------------------------------------------------------------------------------------------------------------------------
		 * Internet Address
		 -------------------------------------------------------------------------------------------------------------------------------*/
		lbl_InternetAddress= new JLabel("Internet Address: ");
		lbl_InternetAddress.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gbc_ServerControls.gridx=0;
		gbc_ServerControls.insets = new Insets(0, 51, 5, 0);
		gbc_ServerControls.gridy=3;
		gbc_ServerControls.gridheight=1;
		gbc_ServerControls.gridwidth=1;
		gbc_ServerControls.weightx=0.5;
		gbc_ServerControls.weighty=0.5;
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
		
		/*-------------------------------------------------------------------------------------------------------------------------------
		 * Port
		 -------------------------------------------------------------------------------------------------------------------------------*/
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
		
		
		/*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		 * Controls - Infrastructure, Project, Production, Reservoir, Forecasts
		 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
		panel_Controls= new JPanel(new GridBagLayout());
		panel_Controls.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_Controls.setBackground(new Color(240,255,240)); 
		c.anchor = GridBagConstraints.PAGE_START;
		c.fill=GridBagConstraints.HORIZONTAL;
		c.weightx=0.5;
		c.weighty=0.5;
		c.gridheight=1;
		c.gridwidth=5;
		c.gridx = 0;
		c.gridy = 2;
		mainframe.getContentPane().add(panel_Controls,c);
		
		/*
		 * add sub panels
		 */
		gbc_Controls = new GridBagConstraints();
		sub_Panel(subPanel_Infrastructure, gridBagLayout, gbc_Controls, 1);
		sub_Panel(subPanel_ConstructProject, gridBagLayout, gbc_Controls, 2);
		sub_Panel(subPanel_DefineProduction, gridBagLayout, gbc_Controls, 3);
		sub_Panel(subPanel_DefineReservoir, gridBagLayout, gbc_Controls, 4);
		sub_Panel(subPanel_Forecasts, gridBagLayout, gbc_Controls, 5);
		
		/*
		 * Controls label
		 */
		lbl_Controls= new JLabel("Controls");
		lbl_Controls.setFont(new Font("Times New Roman", Font.BOLD, 18)); 
		gbc_Controls.gridx = 0;
		gbc_Controls.gridy = 0;
		gbc_Controls.fill = GridBagConstraints.HORIZONTAL;
		gbc_Controls.anchor = GridBagConstraints.NORTHWEST;
		gbc_Controls.gridheight=1;
		gbc_Controls.gridwidth=1;
		gbc_Controls.weightx=0.5;
		gbc_Controls.weighty=0.5;
		gbc_Controls.insets = new Insets(5, 10, 5, 0);
		panel_Controls.add(lbl_Controls, gbc_Controls);
		
		gbc_Controls.insets = new Insets(0, 0, 0, 0);
		
		
		/*-------------------------------------------------------------------------------------------------------------------------------
		 * Infrastructure
		 -------------------------------------------------------------------------------------------------------------------------------*/
		gbc_Infrastructure = new GridBagConstraints();
		
		lbl_Infrastructure = new JLabel("Infrastructure:");
		lbl_Infrastructure.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gbc_Controls.anchor=GridBagConstraints.LINE_START;
		gbc_Controls.gridx = 0;
		gbc_Controls.insets = new Insets(5,42,5,5); 
		subPanel_Infrastructure.add(lbl_Infrastructure, gbc_Controls);
		
		btn_LogMessages = new JButton("Log Messages");
		btn_LogMessages.setToolTipText("<html>Access all server logs and test. It<br/>is important to note that the<br/>server and client-side should use<br/>the same logging system to allow<br/>efficient troubleshooting.<html>");
		btn_LogMessages.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_LogMessages.setBackground(new Color(180, 255, 255));
		gbc_Controls.fill = GridBagConstraints.HORIZONTAL;
		gbc_Controls.anchor=GridBagConstraints.LINE_START;
		gbc_Controls.gridx = 0;
		gbc_Controls.ipady = 5;
		gbc_Controls.insets = new Insets(5,134,5,5);
		subPanel_Infrastructure.add(btn_LogMessages, gbc_Controls);
		
		filler1 = new JLabel("                             ");
		filler1.setOpaque(false);
		gbc_Controls.fill = GridBagConstraints.HORIZONTAL;
		gbc_Controls.anchor=GridBagConstraints.LINE_START;
		gbc_Controls.gridx = 1;
		gbc_Controls.ipady = 5;
		gbc_Controls.insets = new Insets(5,6,5,5);
		subPanel_Infrastructure.add(filler1, gbc_Controls);
		
		/*-------------------------------------------------------------------------------------------------------------------------------
		 * Construct Project
		 -------------------------------------------------------------------------------------------------------------------------------*/
		gbc_ConstructProject = new GridBagConstraints();
		
		lbl_ConstructProject = new JLabel("Construct Project:");
		lbl_ConstructProject.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gbc_Controls.anchor=GridBagConstraints.LINE_START;
		gbc_Controls.gridx = 0;
		gbc_Controls.insets = new Insets(5, 21, 5, 5);
		subPanel_ConstructProject.add(lbl_ConstructProject, gbc_Controls);
		
		btn_Projects = new JButton("Projects");
		btn_Projects.setToolTipText("<html>Define new projects, edit existing<br/>projects and control which<br/>projects are open and therefore<br/>accessible. When a connection to<br/>a server is initially made, the<br/>project is automatically set to<br/>whatever project is currently<br/>open on the server side.<html>");
		btn_Projects.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_Projects.setBackground(new Color(255, 235, 245));
		gbc_Controls.fill = GridBagConstraints.HORIZONTAL;
		gbc_Controls.anchor=GridBagConstraints.LINE_START;
		gbc_Controls.gridx = 0;
		gbc_Controls.insets = new Insets(5,134,5,5);
		subPanel_ConstructProject.add(btn_Projects, gbc_Controls);
		
		btn_Data = new JButton("    Data    ");
		btn_Data.setToolTipText("<html>Load, review and edit all the<br/>various data types needed to<br/>build and update a Production<br/>Potential Model.<html>");
		btn_Data.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_Data.setBackground(new Color(255, 213, 227));
		gbc_Controls.fill = GridBagConstraints.HORIZONTAL;
		gbc_Controls.anchor=GridBagConstraints.LINE_START;
		gbc_Controls.gridx = 1;
		gbc_Controls.insets = new Insets(5,5,5,5);
		subPanel_ConstructProject.add(btn_Data, gbc_Controls);
		
		
		/*-------------------------------------------------------------------------------------------------------------------------------
		 * Define Production
		 -------------------------------------------------------------------------------------------------------------------------------*/
		lbl_DefineProduction = new JLabel("Define Production:");
		lbl_DefineProduction.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gbc_Controls.anchor = GridBagConstraints.LINE_START;
		gbc_Controls.gridx = 0;
		gbc_Controls.insets = new Insets(5, 19, 5, 5);
		subPanel_DefineProduction.add(lbl_DefineProduction, gbc_Controls);
		
		btn_Production = new JButton("Production");
		btn_Production.setToolTipText("<html>Load, review, edit and delete<br/>production related information<br/>that is used to compute drainage<br/>and assign production to each<br/>well.<html>");
		btn_Production.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_Production.setBackground(new Color(152, 251, 152));
		gbc_Controls.fill = GridBagConstraints.HORIZONTAL;
		gbc_Controls.anchor=GridBagConstraints.LINE_START;
		gbc_Controls.ipady = 5;
		gbc_Controls.insets = new Insets(5,134,5,5);
		subPanel_DefineProduction.add(btn_Production, gbc_Controls);
		
		filler2 = new JLabel("                      ");
		filler2.setOpaque(false);
		gbc_Controls.fill = GridBagConstraints.HORIZONTAL;
		gbc_Controls.anchor=GridBagConstraints.LINE_START;
		gbc_Controls.gridx = 1;
		gbc_Controls.ipady = 5;
		gbc_Controls.insets = new Insets(5,5,5,5);
		subPanel_DefineProduction.add(filler2, gbc_Controls);
		
		
		/*-------------------------------------------------------------------------------------------------------------------------------
		 * Define Reservoir
		 -------------------------------------------------------------------------------------------------------------------------------*/
		gbc_DefineReservoir = new GridBagConstraints();
		
		lbl_DefineReservoir = new JLabel("Define Reservoir:");
		lbl_DefineReservoir.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gbc_Controls.anchor = GridBagConstraints.LINE_START;
		gbc_Controls.gridx = 0;
		gbc_Controls.insets = new Insets(5, 25, 5, 5);
		subPanel_DefineReservoir.add(lbl_DefineReservoir, gbc_Controls);
		
		btn_Reservoir = new JButton("  Reservoir   ");
		btn_Reservoir.setToolTipText("<html>Define the bounds of the<br/>reservoir.<html>");
		btn_Reservoir.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_Reservoir.setBackground(new Color(255, 218, 185));
		gbc_Controls.fill = GridBagConstraints.HORIZONTAL;
		gbc_Controls.anchor=GridBagConstraints.LINE_START;
		gbc_Controls.gridx = 0;
		gbc_Controls.ipady = 5;
		gbc_Controls.insets = new Insets(5,134,5,5);
		subPanel_DefineReservoir.add(btn_Reservoir, gbc_Controls);
		
		btn_Permeability = new JButton("Permeability");
		btn_Permeability.setToolTipText("<html>Define how permeabilities are<br/>distributed within the reservoir<br/>and how the native<br/>permeabilities are impacted by<br/>wells and stimulations and<br/>associated data sets like DFN's<html>");
		btn_Permeability.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_Permeability.setBackground(new Color(255, 246, 143));
		gbc_Controls.fill = GridBagConstraints.HORIZONTAL;
		gbc_Controls.gridx = 1;
		gbc_Controls.ipady = 5;
		gbc_Controls.insets = new Insets(5, 5, 5, 5);
		subPanel_DefineReservoir.add(btn_Permeability, gbc_Controls);
		
		
		/*-------------------------------------------------------------------------------------------------------------------------------
		 * Forecasts
		 -------------------------------------------------------------------------------------------------------------------------------*/
		lbl_Forecasts = new JLabel("Forecasts:");
		lbl_Forecasts.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		gbc_Controls.anchor = GridBagConstraints.LINE_START;
		gbc_Controls.gridx = 0;
		gbc_Controls.gridy = 5;
		gbc_Controls.insets = new Insets(5, 69, 5, 5);
		subPanel_Forecasts.add(lbl_Forecasts, gbc_Controls);
		
		btn_PPM = new JButton("     PPM     ");
		btn_PPM.setToolTipText("<html>Define how properties and<br/>compute the production<br/>potential model.<html>");
		btn_PPM.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_PPM.setBackground(new Color(216, 191, 216));
		gbc_Controls.fill = GridBagConstraints.HORIZONTAL;
		gbc_Controls.anchor=GridBagConstraints.LINE_START;
		gbc_Controls.gridx = 0;
		gbc_Controls.gridy = 5;
		gbc_Controls.insets = new Insets(5,134,5,5);
		subPanel_Forecasts.add(btn_PPM, gbc_Controls);
		
		btn_Forecasts = new JButton("Forecasts");
		btn_Forecasts.setToolTipText("<html>Read slices of data from data<br/>volumes contained in a project<br/>and review in 2D window. This<br/>will include the PPM volumes<br/>which can also be accessed via<br/>the PPM Controls.<html>");
		btn_Forecasts.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		gbc_Controls.fill = GridBagConstraints.HORIZONTAL;
		gbc_Controls.anchor=GridBagConstraints.LINE_START;
		btn_Forecasts.setBackground(new Color(230,230,250));
		gbc_Controls.gridx = 1;
		gbc_Controls.insets = new Insets(5, 5, 5, 5);
		subPanel_Forecasts.add(btn_Forecasts, gbc_Controls);
		
		
		/*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		 * Status - Project and Volume
		 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
		panel_Status= new JPanel(new GridBagLayout());
		panel_Status.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_Status.setBackground(new Color(230,230,250)); 
		c.anchor = GridBagConstraints.PAGE_START;
		c.fill= GridBagConstraints.HORIZONTAL;
		c.weightx=0.5;
		c.weighty=0.5;
		c.gridheight=1;
		c.gridwidth=5;
		c.gridx = 0;
		c.gridy = 3;
		mainframe.getContentPane().add(panel_Status,c);
		GridBagConstraints gbc_Status = new GridBagConstraints();
		
		
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
		
		
		/*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		 * Button Functionality
		 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
		
		/*-------------------------------------------------------------------------------------------------------------------------------
		 * "Server Control" - "Connect" button - Action Listener method
		 -------------------------------------------------------------------------------------------------------------------------------*/
		btn_Connect.addActionListener(new ActionListener() {
			JFrame frame_ConnectFail;
	    	GridBagConstraints gbc_ConnectFail;
	    	JPanel filler;
	    	
	    	JLabel lbl_Failed;
	    	JButton btn_Okay;
	    	
	    	public void actionPerformed(ActionEvent e)
		    {
	    		frame_ConnectFail = new JFrame("Connection Failed");
	    		frame_ConnectFail.getContentPane().setLayout(new GridBagLayout());
	    		frame_ConnectFail.getContentPane().setBackground(new Color(152,251,152));
	    		frame_ConnectFail.setVisible(true);
	    		frame_ConnectFail.setMinimumSize(new Dimension(640, 165));
	    		gbc_ConnectFail= new GridBagConstraints();
	    		/*
	    		 * lbl error
	    		 */
	    		lbl_Failed = new JLabel("<html><center><br>Gateway established, but unable to access project.<br><br>"+"<center>Exception=An error occured while trying to connect to the Java server (127.0.0.1:25322)<br/><br/><html>");
	    		lbl_Failed.setFont(new Font("Times New Roman", Font.BOLD, 14));
	    		gbc_ConnectFail.gridx=0;
	    		gbc_ConnectFail.gridy=0; 
	    		gbc_ConnectFail.weightx=0.5;
	    		gbc_ConnectFail.weighty=0.5;
	    		gbc_ConnectFail.anchor=GridBagConstraints.NORTH;
	    		gbc_ConnectFail.anchor=GridBagConstraints.CENTER;
	    		frame_ConnectFail.add(lbl_Failed, gbc_ConnectFail);
	    		/*
	    		 * okay button 
	    		 */
	    		btn_Okay=new JButton("Okay");
	    		btn_Okay.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	    		btn_Okay.setBackground(new Color(136,226,126));
	    		btn_Okay.setFont(new Font("Calibri", Font.PLAIN, 15));
	    		gbc_ConnectFail.gridx=0;
	    		gbc_ConnectFail.gridy=1;
	    		gbc_ConnectFail.weightx=0.5;
	    		gbc_ConnectFail.weighty=0.5;
	    		gbc_ConnectFail.ipadx = 10;
	    		gbc_ConnectFail.ipady = 5;
	    		gbc_ConnectFail.anchor=GridBagConstraints.NORTH;
	    		frame_ConnectFail.add(btn_Okay, gbc_ConnectFail);
	    		btn_Okay.addActionListener(new ActionListener() {
	    		    public void actionPerformed(ActionEvent e)
	    		    {
	    		    	frame_ConnectFail.dispose();
	    		    }
	    		});
	    		/*
	    		 * filler panel to force components in the right place
	    		 */
	    		gbc_ConnectFail.gridx=1;
	    		gbc_ConnectFail.gridy=2;
	    		gbc_ConnectFail.weightx=0;
	    		gbc_ConnectFail.weighty=1;
	    		filler= new JPanel();
	    		filler.setOpaque(false);
	    		frame_ConnectFail.add(filler,gbc_ConnectFail);
		    }
		    
		});
		

		/*-------------------------------------------------------------------------------------------------------------------------------
		 * "Controls" buttons - calls "ButtonControlsPanel"
		 -------------------------------------------------------------------------------------------------------------------------------*/
		btn_LogMessages.addActionListener(new ButtonControlsPanel());
		btn_Projects.addActionListener(new ButtonControlsPanel());
		btn_Data.addActionListener(new ButtonControlsPanel());
		btn_Production.addActionListener(new ButtonControlsPanel());
		btn_Reservoir.addActionListener(new ButtonControlsPanel());
		btn_Permeability.addActionListener(new ButtonControlsPanel());
		btn_PPM.addActionListener(new ButtonControlsPanel());
		btn_Forecasts.addActionListener(new ButtonControlsPanel());
    }
    
    
    /*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	 * Methods
	 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
	
    /*-------------------------------------------------------------------------------------------------------------------------------
	 * "Controls" - all buttons - Action listener method
	 -------------------------------------------------------------------------------------------------------------------------------*/
    static class ButtonControlsPanel implements ActionListener{
    	JFrame frame_ConnectError;
    	JPanel filler;
    	GridBagConstraints gbc_ConnectError;
    	
    	JLabel lbl_Error;
    	JButton btn_Okay;
    	
    	public void actionPerformed (ActionEvent e) {
    		frame_ConnectError = new JFrame("Connection Error");
    		frame_ConnectError.getContentPane().setLayout(new GridBagLayout());
    		frame_ConnectError.getContentPane().setBackground(new Color(240,128,128));
    		frame_ConnectError.setVisible(true);
    		frame_ConnectError.setMinimumSize(new Dimension(375,125));
    		gbc_ConnectError = new GridBagConstraints();
    		/*
    		 * lbl error
    		 */
    		lbl_Error = new JLabel("<html><br/>Must establish connection to Java application first<br/><br/><html>");
    		lbl_Error.setFont(new Font("Times New Roman", Font.BOLD, 15));
    		gbc_ConnectError.anchor=GridBagConstraints.NORTH;
    		gbc_ConnectError.anchor=GridBagConstraints.CENTER;
    		gbc_ConnectError.gridx=0;
    		gbc_ConnectError.gridy=0;
    		frame_ConnectError.add(lbl_Error, gbc_ConnectError);
    		/*
    		 * okay button
    		 */
    		btn_Okay=new JButton("Okay");
    		btn_Okay.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
    		btn_Okay.setBackground(new Color(234,84,84));
    		btn_Okay.setFont(new Font("Times New Roman", Font.PLAIN, 15));
    		gbc_ConnectError.anchor=GridBagConstraints.NORTH;
    		gbc_ConnectError.gridx=0;
    		gbc_ConnectError.gridy=1;
    		gbc_ConnectError.ipadx = 10;
    		gbc_ConnectError.ipady = 5;
    		btn_Okay.addActionListener(new ActionListener() {
    		    public void actionPerformed(ActionEvent e)
    		    {
    		    	frame_ConnectError.dispose();
    		    }
    		});
    		frame_ConnectError.add(btn_Okay,gbc_ConnectError);
    		/*
    		 * filler panel to force components in the right place
    		 */
    		gbc_ConnectError.gridx=1;
    		gbc_ConnectError.gridy=2;
    		gbc_ConnectError.weightx=0;
    		gbc_ConnectError.weighty=1;
    		filler= new JPanel();
    		filler.setOpaque(false);
    		frame_ConnectError.add(filler,gbc_ConnectError);
    	}
    	
    }
    
    
    /*-------------------------------------------------------------------------------------------------------------------------------
	 * creates sub panels for  control panel
	 -------------------------------------------------------------------------------------------------------------------------------*/
    public  static void sub_Panel( JPanel pan, GridBagLayout L, GridBagConstraints cons, int y ) {
		pan.setLayout(new GridBagLayout());
		pan.setBackground(new Color(240,255,240));
		pan.setBorder(BorderFactory.createEtchedBorder(Color.BLACK,new Color(240,255,240)));
		cons.fill=GridBagConstraints.HORIZONTAL;
		cons.weightx=0.5;
		cons.weighty=0.5;
		cons.gridheight=1;
		cons.gridwidth=2;
		cons.gridx=0;
		cons.gridy=y;
		cons.insets = new Insets(0,10,5,10);
		panel_Controls.add(pan,cons);
	}
    
    
    
    /*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	 * Call for the window
	 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
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
  
