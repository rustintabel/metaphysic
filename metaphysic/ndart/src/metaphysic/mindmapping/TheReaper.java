package metaphysic.mindmapping;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.List;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import edu.stanford.ejalbert.BrowserLauncher;
import javax.swing.event.*;
import javax.imageio.*;
import java.io.File;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import del.icio.us.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import javax.swing.JPopupMenu;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.JMenuItem;
import javax.swing.*;
import javax.swing.JTextArea;
import java.util.jar.Attributes;
import org.jrdf.graph.Graph;
import org.jrdf.graph.GraphElementFactory;
import org.jrdf.graph.mem.GraphImpl;
import org.jgraph.JGraph;
import org.jgraph.graph.*;




//import org.mozilla.jrex.*;
//import org.mozilla.jrex.window.*;

//import org.jdesktop.jdic.browser.*;
import java.net.URL;
import java.net.MalformedURLException;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author justin
 */
public class TheReaper extends JPanel implements ActionListener,
HyperlinkListener,MouseListener,ProcessorMessageListener,
ProcessorThreadStateChangedListener{
	private JButton updateButton;
	private JButton openCurrentUsersBookmarks;
	private JButton openCurrentBookmarkButton;
	private JButton allUsersButton;
	private JButton categoryUsersButton;
	private JButton recommendBookmarkButton;
	private JButton addNodeButton;
	private JButton removeNodeButton;
	private JButton saveNodeButton;
	//private JButton categoryBookmarksButton;

    private	JTextField	usernameTextField;
    private	JTextField	passwordTextField;
    private	JTextField	processingBookmark;
    static final long serialVersionUID=1L;
    private List userBookmarksInCommon;
    private List genres;
    private	JTextField	currentUsersBookmarksField;
    private	JTextField	currentRelationshipField;
    private	JTextField	minUsersPerGroupTextField;
    private JEditorPane editorPane;
    private JScrollPane editorScrollPane;
    private BrowserLauncher launcher;
    private int spaceBetweenComponents=60;
    private Processor currentProcessor;
    private Label userListLabel;
    private Label mindmapInstructionsLabel;
    private Label currentRelationshipLabel;
    private Label genresLabel;
    private Label userBookmarksInCommonLabel;
    private Label todaysBookmarksLabel;
    private Label userNameLabel;
    private Label passwordLabel;
    private Label minUsersPerGroupLabel;
    private JButton autoGenerateMindMapsButton;
    private JTable usernameTabel;
    private JScrollPane usernamescroller;
    private JScrollPane mindmapScroller;
    private JScrollPane mindmapNodeScroller;
    private JTextArea mindmapNodeText;
    private JScrollPane userBookmarksScroller;
    private JScrollPane genresScroller;
    DefaultTableModel usernameTableModel;
    private Delicious del;
    private String[][] userNameTableData;
    private ProcessorThread processorThread;
    private JGraph jgraph;
    private Attributes mindmapNotes;
    //private Graph currentGraph = new GraphImpl();
    //private GraphElementFactory elementFactory = currentGraph.getElementFactory();
    private JPopupMenu popup;
    
    
    private GraphModel model;
    private GraphLayoutCache view;
    
    Connection conn;
    private java.util.List<URLSet> sets;
    private static final Color DEFAULT_BG_COLOR = Color.decode("#FFFFFF");
    private static final Dimension DEFAULT_SIZE = new Dimension(500, 500);
    //private WebBrowser webBrowser;

    private ProcessorThread.ProcessorThreadState currentProcessingState=ProcessorThread.ProcessorThreadState.STOPPED;

    /**
     *
     */
    public TheReaper() {

    	currentProcessor=new Processor(this,this);
    	this.setBackground(Color.WHITE);

    	try{
			Class.forName("org.hsqldb.jdbcDriver");
        	conn = DriverManager.getConnection("jdbc:hsqldb:Processor","sa","");
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	mindmapNotes=new Attributes();
    	
        popup = new JPopupMenu();

        JMenuItem deleteThisPopupItem = new JMenuItem("Delete");
        deleteThisPopupItem.setActionCommand("RemoveMindMapNode");
        deleteThisPopupItem.addActionListener(this);
        popup.add(deleteThisPopupItem);
    	
        JMenuItem addNodePopupItem = new JMenuItem("Add node");
        addNodePopupItem.setActionCommand("AddMindMapNode");
        addNodePopupItem.addActionListener(this);
        popup.add(addNodePopupItem);
        /*
        JMenuItem displayContentPopupItem = new JMenuItem("Display in notes tab");
        displayContentPopupItem.setActionCommand("DisplayNodeContent");
        displayContentPopupItem.addActionListener(this);
        popup.add(displayContentPopupItem);
        
        JMenuItem displayContentPopupItem = new JMenuItem("Save mindmap");
        displayContentPopupItem.setActionCommand("DisplayNodeContent");
        displayContentPopupItem.addActionListener(this);
        popup.add(displayContentPopupItem);
        
        JMenuItem displayContentPopupItem = new JMenuItem("Delete mindmap");
        displayContentPopupItem.setActionCommand("DisplayNodeContent");
        displayContentPopupItem.addActionListener(this);
        popup.add(displayContentPopupItem);
        
        JMenuItem displayContentPopupItem = new JMenuItem("Open existing mindmap");
        displayContentPopupItem.setActionCommand("DisplayNodeContent");
        displayContentPopupItem.addActionListener(this);
        popup.add(displayContentPopupItem);
        
        JMenuItem displayContentPopupItem = new JMenuItem("Connect selected nodes");
        displayContentPopupItem.setActionCommand("DisplayNodeContent");
        displayContentPopupItem.addActionListener(this);
        popup.add(displayContentPopupItem);
        
        
    	*/
    	GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1;

		JTabbedPane tabbedPane = new JTabbedPane();
		//tabbedPane.setPreferredSize(new Dimension(700,400));

		javax.swing.JPanel mainPanel= new javax.swing.JPanel();
    	mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));

		javax.swing.JPanel browserPanel= new javax.swing.JPanel();
    	browserPanel.setLayout(new GridBagLayout());

    	javax.swing.JPanel userPanel= new javax.swing.JPanel();
    	userPanel.setLayout(new GridBagLayout());

    	javax.swing.JPanel bookmarksPanel= new javax.swing.JPanel();
    	bookmarksPanel.setLayout(new GridBagLayout());

    	javax.swing.JPanel urlPanel= new javax.swing.JPanel();
    	urlPanel.setLayout(new GridBagLayout());

    	javax.swing.JPanel genresPanel= new javax.swing.JPanel();
    	genresPanel.setLayout(new GridBagLayout());
    	
    	javax.swing.JPanel mindmapPanel= new javax.swing.JPanel();
    	mindmapPanel.setLayout(new GridBagLayout());

    	javax.swing.JPanel mindmapNodePanel= new javax.swing.JPanel();
    	mindmapNodePanel.setLayout(new GridBagLayout());

	    try{
	    	launcher= new BrowserLauncher();
	    }
	    catch(Exception e) {
	    }

		/*editorPane = new JEditorPane();
        editorPane.setEditable(false);
        java.net.URL helpURL=null;
        try{
        	//This will be set to apphive.com/thereaper/  + usernameTextField.GetText();
        	helpURL =new java.net.URL("http://www.apphive.com");
        }
        catch(java.net.MalformedURLException e)
        {

        }
        if (helpURL != null) {
            try {
                editorPane.setPage(helpURL);

            } catch (Exception e) {
				e.printStackTrace();
                System.err.println("Attempted to read a bad URL: " + helpURL);
            }
        } else {
            System.err.println("Couldn't find file: TextSamplerDemoHelp.html");
        }

        editorScrollPane = new JScrollPane(editorPane);
        editorScrollPane.setVerticalScrollBarPolicy(
                        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        editorScrollPane.setPreferredSize(new Dimension(750, 100));
        editorScrollPane.setMinimumSize(new Dimension(10, 10));
        editorPane.addHyperlinkListener(this);*/

		//c.gridx = 0;
        //c.gridy = 0;
        //browserPanel.add(editorScrollPane,c);

		/* START: User Panel */
		//The username textFieldLabel

    	userNameLabel= new Label("Delicious Username",Label.CENTER);
    	c.gridx = 0;
        c.gridy = 0;
        userPanel.add(userNameLabel,c);

		//The field in which to enter the users username.
        usernameTextField=new JTextField(currentProcessor.getLastUser(conn));
        usernameTextField.setColumns(25);
        usernameTextField.setVisible(true);
        usernameTextField.addActionListener(this);
        c.gridx = 0;
        c.gridy = 1;
        userPanel.add(usernameTextField,c);

        //The field in which to enter the users password.
    	passwordTextField=new JTextField("p1ssword");
    	passwordTextField.setVisible(false);
    	passwordTextField.addActionListener(this);

        //The button to update the system.
        updateButton = new JButton("Get Bookmarks!");
        updateButton.setVerticalTextPosition(AbstractButton.CENTER);
        updateButton.setHorizontalTextPosition(AbstractButton.LEADING);
        updateButton.setActionCommand("Get Bookmarks");
        updateButton.setToolTipText("Download the bookmars of people with similar sets of bookmarks and categorize them.");
        updateButton.addActionListener(this);
        c.gridx = 0;
        c.gridy = 2;
        userPanel.add(updateButton,c);
        
        
        
    	minUsersPerGroupLabel= new Label("Minimum number of users per group.",Label.CENTER);
    	c.gridx = 0;
        c.gridy = 3;
        userPanel.add(minUsersPerGroupLabel,c);
        
        

		//The field in which to enter the users username.
        minUsersPerGroupTextField=new JTextField("2");
        minUsersPerGroupTextField.setColumns(25);
        minUsersPerGroupTextField.setVisible(true);
        minUsersPerGroupTextField.addActionListener(this);
        c.gridx = 0;
        c.gridy = 4;
        userPanel.add(minUsersPerGroupTextField); 
        
        
        c.gridx = 0;
        c.gridy = 5;
        autoGenerateMindMapsButton = new JButton("Autogenerate Mind Maps");
        autoGenerateMindMapsButton.setVerticalTextPosition(AbstractButton.CENTER);
        autoGenerateMindMapsButton.setHorizontalTextPosition(AbstractButton.LEADING);
        autoGenerateMindMapsButton.setActionCommand("Autogenerate Mind Maps");
        autoGenerateMindMapsButton.setToolTipText("Autogenerate mindmaps based on groups.");
        autoGenerateMindMapsButton.addActionListener(this);
        userPanel.add(autoGenerateMindMapsButton); 
        
		/* END: User Panel */

		/* START: Bookmark Panel */
		//The user list textFieldLabel
    	userListLabel= new Label("Delicious Users Similar To You",Label.LEFT);
    	c.gridx = 0;
        c.gridy = 0;
        bookmarksPanel.add(userListLabel,c);

        //current users bookmarks in common with user.
        userBookmarksInCommon= new List(10, false);
        userBookmarksInCommon.setBackground(Color.WHITE);
        userBookmarksInCommon.addActionListener(this);
        userBookmarksInCommon.setPreferredSize(new Dimension(600, 50));
        userBookmarksScroller= new javax.swing.JScrollPane(userBookmarksInCommon);
		c.gridx = 1;
        c.gridy = 1;
        bookmarksPanel.add(userBookmarksScroller,c);

	    userNameTableData=new String[20][2];
	    String[] userNameTableColumnNames= {"Users with the same bookmarks",
	    		"Number of shared bookmarks"};

		//The user bookmarks in common textFieldLabel
    	userBookmarksInCommonLabel= new Label("Bookmarks you share with the current user.",Label.LEFT);
    	c.gridx = 1;
        c.gridy = 0;
        bookmarksPanel.add(userBookmarksInCommonLabel,c);

	    usernameTableModel= new DefaultTableModel(userNameTableColumnNames,10);
	    usernameTabel = new JTable();
	    usernameTabel.setModel(usernameTableModel);
	    usernameTabel.setPreferredScrollableViewportSize(new Dimension(300, 150));
	    usernameTabel.setRowSelectionAllowed(true);
	    usernameTabel.setColumnSelectionAllowed(false);
	    usernameTabel.setBackground(Color.WHITE);
	    usernameTabel.setSize(new Dimension(300, 150));
	    usernameTabel.setMaximumSize(new Dimension(300, 150));
	    usernameTabel.addMouseListener(this);

	    usernamescroller = new javax.swing.JScrollPane(usernameTabel);

	    
	    
	    c.gridx = 0;
        c.gridy = 1;
        bookmarksPanel.add(usernamescroller,c);

		c.gridx = 0;
        c.gridy = 2;
		bookmarksPanel.add(Box.createRigidArea(new Dimension(0,10)),c);

		//Todays bookmarks label.
    	todaysBookmarksLabel= new Label("The currently selected users bookmarks.",Label.LEFT);
    	c.gridx = 0;
        c.gridy = 3;
        bookmarksPanel.add(todaysBookmarksLabel,c);

        currentUsersBookmarksField=new JTextField("");
        currentUsersBookmarksField.setColumns(30);
        currentUsersBookmarksField.setVisible(true);
        currentUsersBookmarksField.addActionListener(this);
        c.gridx = 1;
        c.gridy = 3;
        bookmarksPanel.add(currentUsersBookmarksField,c);

        javax.swing.JPanel urlButtonsPanel= new javax.swing.JPanel();
    	urlButtonsPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        allUsersButton = new JButton("Show All Users");
        allUsersButton.setVerticalTextPosition(AbstractButton.CENTER);
        allUsersButton.setHorizontalTextPosition(AbstractButton.LEADING);
        allUsersButton.setActionCommand("ShowAllUsers");
        allUsersButton.setToolTipText("Show all the users in all the categories.");
        allUsersButton.addActionListener(this);
        allUsersButton.setSize(50, 10);
        urlButtonsPanel.add(allUsersButton);

        openCurrentUsersBookmarks = new JButton("Open Users Bookmarks");
        openCurrentUsersBookmarks.setVerticalTextPosition(AbstractButton.CENTER);
        openCurrentUsersBookmarks.setHorizontalTextPosition(AbstractButton.LEADING);
        openCurrentUsersBookmarks.setActionCommand("OpenThisUsersBookmarks");
        openCurrentUsersBookmarks.setToolTipText("Open the currently selected users bookmars in a web browser.");
        openCurrentUsersBookmarks.addActionListener(this);
        openCurrentUsersBookmarks.setSize(50, 10);
        urlButtonsPanel.add(openCurrentUsersBookmarks);

        openCurrentBookmarkButton = new JButton("Open Bookmark");
        openCurrentBookmarkButton.setVerticalTextPosition(AbstractButton.CENTER);
        openCurrentBookmarkButton.setHorizontalTextPosition(AbstractButton.LEADING);
        openCurrentBookmarkButton.setActionCommand("OpenBookmark");
        openCurrentBookmarkButton.setToolTipText("Open the currently selected bookmark in a web browser.");
        openCurrentBookmarkButton.addActionListener(this);
        openCurrentBookmarkButton.setSize(50, 10);
        urlButtonsPanel.add(openCurrentBookmarkButton);
        
        recommendBookmarkButton = new JButton("Recommend Bookmarks");
        recommendBookmarkButton.setVerticalTextPosition(AbstractButton.CENTER);
        recommendBookmarkButton.setHorizontalTextPosition(AbstractButton.LEADING);
        recommendBookmarkButton.setActionCommand("RecommendBookmark");
        recommendBookmarkButton.setToolTipText("Recommend the next most highly ranked bookmark and add it to the map.");
        recommendBookmarkButton.addActionListener(this);
        urlButtonsPanel.add(recommendBookmarkButton,c);

        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        bookmarksPanel.add(urlButtonsPanel,c);
        /* END: Url Panel */


        /* START: Genres Panel */
		genresLabel= new Label("Automatically determined categories your bookmarks fall into",Label.LEFT);
		c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        genresPanel.add(genresLabel,c);

        Dimension genresListSize= new Dimension();
        genresListSize.setSize(750, 150);
        genres= new List(10, false);
        genres.setBackground(Color.WHITE);

        genres.addActionListener(this);
        genresScroller= new javax.swing.JScrollPane(genres);
        genresScroller.setMaximumSize(genresListSize);
        c.gridx = 0;
        c.gridy = 1;
        genresPanel.add(genresScroller,c);

        categoryUsersButton = new JButton("Show Users For Category");
        categoryUsersButton.setVerticalTextPosition(AbstractButton.CENTER);
        categoryUsersButton.setHorizontalTextPosition(AbstractButton.LEADING);
        categoryUsersButton.setActionCommand("ShowCategoryUsers");
        categoryUsersButton.setToolTipText("Show all the users in the selected category.");
        categoryUsersButton.addActionListener(this);
        c.gridx = 0;
        c.gridy = 2;
        c.fill = GridBagConstraints.NONE;
		c.weightx = 0;
        genresPanel.add(categoryUsersButton,c);
		/* END: Genres Panel */
        
        /*Start mindmap panel */
        
        mindmapInstructionsLabel= new Label("Right mouse click on map to creat your mind map.",Label.CENTER);
    	c.gridx = 0;
        c.gridy = 0;
        mindmapPanel.add(mindmapInstructionsLabel,c);

        
    	currentRelationshipLabel= new Label("Enter relationship type for new node here.",Label.LEFT);
    	c.gridx = 0;
        c.gridy = 1;
        mindmapPanel.add(currentRelationshipLabel,c);

        currentRelationshipField=new JTextField("");
        currentRelationshipField.setColumns(30);
        currentRelationshipField.setVisible(true);
        currentRelationshipField.addActionListener(this);
        c.gridx = 1;
        c.gridy = 1;
        mindmapPanel.add(currentRelationshipField,c);
        
        
        model = new DefaultGraphModel();
        view = new GraphLayoutCache(model, new DefaultCellViewFactory());
        
        
        jgraph = new JGraph(model, view);
        jgraph.setEditable(true);
        jgraph.setEditClickCount(2);
        jgraph.setSizeable(true); 
        jgraph.setSelectionEnabled(true); 
        //jgraph.setMoveBelowZero(true);
        jgraph.setPortsVisible(true); 
        jgraph.setMoveable(true); 
        jgraph.setEdgeLabelsMovable(true); 
        jgraph.setDropEnabled(true); 
        jgraph.setDragEnabled(true); 
        //jgraph.setDisconnectable(true); 
        jgraph.setConnectable(true); 
        //jgraph.setCloneable(true); 
        jgraph.setBendable(true); 
        jgraph.addMouseListener(this);
        jgraph.setAutoResizeGraph(true);
        
        jgraph.setPreferredSize( DEFAULT_SIZE );
        
        Color  mindmapBackground = DEFAULT_BG_COLOR;

        jgraph.setBackground( mindmapBackground );
        
		DefaultGraphCell cell = new DefaultGraphCell("first");

		
		GraphConstants.setBounds(cell.getAttributes(),
				new Rectangle2D.Double(DEFAULT_SIZE.width/2, 
						DEFAULT_SIZE.height/2, 50, 50));

		GraphConstants.setGradientColor(
				cell.getAttributes(), Color.orange);
			GraphConstants.setOpaque(
				cell.getAttributes(), true);

			GraphConstants.setBorderColor(
					cell.getAttributes(), Color.black);
			
		// Add a Port
		DefaultPort port = new DefaultPort();
		cell.addPort();
		//cell.add(port);
		//port.setParent(cell);

		jgraph.getGraphLayoutCache().insert(cell);
		int nodeIndex =jgraph.getModel().getIndexOfRoot(cell);
		mindmapNotes.putValue(Integer.toString(nodeIndex), "");
        
        
        //jgraph.add(minUsersPerGroupTextField);
        mindmapScroller = new javax.swing.JScrollPane(jgraph);
        //mindmapScroller.setSize(500,500);
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 3;
        mindmapPanel.add(mindmapScroller,c);
        /*END Mindmap Panel*/
        
        
        
        
        /*START Mindmap Node Panel*/
        
        mindmapNodeText =new JTextArea(30,60);
        //mindmapNodeText.setSize(DEFAULT_SIZE);
        mindmapNodeScroller= new javax.swing.JScrollPane(mindmapNodeText);
        c.gridx = 0;
        c.gridy = 0;

        mindmapNodePanel.add(mindmapNodeScroller,c);
        
        saveNodeButton = new JButton("Save text");
        saveNodeButton.setVerticalTextPosition(AbstractButton.CENTER);
        saveNodeButton.setHorizontalTextPosition(AbstractButton.LEADING);
        saveNodeButton.setActionCommand("SaveMindMapNode");
        saveNodeButton.setToolTipText("To the save your content for this node click here.");
        saveNodeButton.addActionListener(this);
        c.gridx = 0;
        c.gridy = 1;
        mindmapNodePanel.add(saveNodeButton,c);
        /*End mindmap Node Panel*/
        
        
        
		/* START: Bottom Panel */
		processingBookmark=new JTextField("");
    	processingBookmark.setVisible(true);
		/* END: Buttons Panel */
        tabbedPane.addTab("Mindmap", null, mindmapPanel);
        tabbedPane.addTab("Current Mindmap Node", null, mindmapNodePanel);
        tabbedPane.addTab("Bookmarks", null, bookmarksPanel);
        tabbedPane.addTab("Sets", null, genresPanel);
        tabbedPane.addTab("Profile", null, userPanel);

        

        
        mainPanel.add(tabbedPane,BorderLayout.CENTER);
        mainPanel.add(processingBookmark,BorderLayout.SOUTH);
        mainPanel.add(Box.createRigidArea(new Dimension(0,10)));

        this.add(mainPanel);

        validate();

        loadUsers(conn);

        loadSets(conn);

        try{
        conn.close();
        }catch(Exception e)
        {
        	e.printStackTrace();
        }
    }
    

    

    /**
     *
     * @param conn
     */
    public void loadUsers(Connection conn)
    {
    	if(!currentProcessor.getLastUser(conn).equalsIgnoreCase(""))
    	{
	    	try{
	    		HashMap<Integer,User> users= currentProcessor.getUsers(conn);
	    		Collection<User> tempUsers=users.values();
	    		Iterator<User> tempUsersIterator=tempUsers.iterator();

	    		((DefaultTableModel)usernameTabel.getModel()).getDataVector().setSize(tempUsers.size());
	    		((DefaultTableModel)usernameTabel.getModel()).setNumRows(tempUsers.size());
	    		for(int i=0;i<tempUsers.size();i++)
	    		{
	    			User currentUser=tempUsersIterator.next();

					Vector tempVector= new Vector(2);
					tempVector.add("");
					tempVector.add("");
					((Vector)((DefaultTableModel)usernameTabel.getModel()).getDataVector()).set(i, tempVector);

	    			if(currentUser.getUsername().equals(usernameTextField.getText()))
	    			{
	    				continue;
	    			}

	    			((Vector)((DefaultTableModel)usernameTabel.getModel()).getDataVector().elementAt(i)).set(0, currentUser.getUsername());
	    			((Vector)((DefaultTableModel)usernameTabel.getModel()).getDataVector().elementAt(i)).set(1, currentUser.getCount());

	    		}
	        	}catch(Exception e)
	        	{
	        		e.printStackTrace();
	        	}
	        // Sort all the rows in descending order based on the
	        // values in the second column of the model
        	if(((DefaultTableModel)usernameTabel.getModel()).getDataVector().size()>0)
        	{
        		sortAllRowsBy((DefaultTableModel)usernameTabel.getModel(), 1, false);
        	}

    	}
    }

    /**
     *
     * @param id
     */
    public void loadBookmarkSetUsers(int id)
    {
    	HashMap<Integer,User> users= currentProcessor.getUsers(conn);

    	URLSet set= sets.get(id);

    	try{

    		((DefaultTableModel)usernameTabel.getModel()).getDataVector().setSize(set.getUserIDs().size());
    		((DefaultTableModel)usernameTabel.getModel()).setNumRows(set.getUserIDs().size());

    		for(int i=0;i<set.getUserIDs().size();i++)
    		{

				Vector tempVector= new Vector(2);
				tempVector.add("");
				tempVector.add("");
				((Vector)((DefaultTableModel)usernameTabel.getModel()).getDataVector()).set(i, tempVector);

    			if(users.get(set.getUserIDs().get(i)).getUsername().equals(usernameTextField.getText()))
    			{
    				continue;
    			}

    			((Vector)((DefaultTableModel)usernameTabel.getModel()).getDataVector().elementAt(i)).set(0, users.get(set.getUserIDs().get(i)).getUsername());
    			((Vector)((DefaultTableModel)usernameTabel.getModel()).getDataVector().elementAt(i)).set(1, users.get(set.getUserIDs().get(i)).getUrls().size());

    		}
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        	}

        	if(((DefaultTableModel)usernameTabel.getModel()).getDataVector().size()>0)
        	{
        		sortAllRowsBy((DefaultTableModel)usernameTabel.getModel(), 1, false);
        	}

        	userBookmarksInCommon.removeAll();
    		for(int i=0;i<set.getURLCount();i++)
    		{

    			userBookmarksInCommon.add(currentProcessor.getURLs(conn).get(set.getUrlIDs().get(i)).getUrl());
    		}

    }

    /**
     *
     * @param conn
     */
    public void loadSets(Connection conn)
    {

    	if(!currentProcessor.getLastUser(conn).equalsIgnoreCase(""))
    	{
    		HashMap<Integer,URLSet> setsHashMap= currentProcessor.getSets(conn);
    		Collection<URLSet> tempSets=setsHashMap.values();
    		Iterator<URLSet> tempSetsIterator=tempSets.iterator();

    		this.sets= new ArrayList<URLSet>();
    		while(tempSetsIterator.hasNext())
    		{
    			this.sets.add(tempSetsIterator.next());
    		}

    		//sortSetsByRank();

    		HashMap<Integer,Url> urls = currentProcessor.getURLs(conn);
        	try{

	    		genres.removeAll();

	    		for(int i=0;i<sets.size();i++)
	    		{
	    			String currentGenreBookmarks="";
	    			int minUsersPerGroup=0;
	    			boolean showThisGroup=false;
	    			try{
	    				minUsersPerGroup=Integer.parseInt(minUsersPerGroupTextField.getText());
	    				
	    			}catch(NumberFormatException ne)
	    			{
	    				
	    			}

	    			if(sets.get(i).getUrlIDs().size()>=minUsersPerGroup){
		    			for(int j=0;j<sets.get(i).getUrlIDs().size();j++)
		    			{
		    				currentGenreBookmarks+=urls.get(sets.get(i).getUrlIDs().get(j)).getUrl();
		    				if(j<sets.get(i).getUrlIDs().size()-1)
		    				{
		    					currentGenreBookmarks+=" | ";
		    				}
		    			}
		    			genres.add(currentGenreBookmarks);
	    			}
	    		}

            	}catch(Exception e)
            	{
            		e.printStackTrace();
            	}
    	}

    }

    /**
     *
     */
    public void sortSetsByRank()
    {
    	URLSetComparator compare= new URLSetComparator();
    	Collections.sort(sets, compare);
    }

    // Regardless of sort order (ascending or descending), null values always appear last.
    // colIndex specifies a column in model.
    /**
     *
     * @param model
     * @param colIndex
     * @param ascending
     */
    public void sortAllRowsBy(DefaultTableModel model, int colIndex, boolean ascending) {
        Vector data = model.getDataVector();
        Collections.sort(data, new ColumnSorter(colIndex, ascending));
        model.fireTableStructureChanged();
    }

    
	/**
     *
     * @param name
     * @param x
     * @param y
     * @param w
     * @param h
     * @param bg
     * @param raised
     * @return
     */
    public static DefaultGraphCell createVertex(String name, double x,
			double y, double w, double h, Color bg, boolean raised) {

			// Create vertex with the given name
			DefaultGraphCell cell = new DefaultGraphCell(name);

			// Set bounds
			GraphConstants.setBounds(cell.getAttributes(),
					new Rectangle2D.Double(x, y, w, h));


			GraphConstants.setBorderColor(
					cell.getAttributes(), Color.black);


			// Add a Port
			DefaultPort port = new DefaultPort();
			cell.add(port);
			port.setParent(cell);

			return cell;
		}

    
    /**
     *
     * @param e
     */
    public void actionPerformed(ActionEvent e) {

    	if(e.getActionCommand().equals("AddMindMapNode"))
    	{
    		
    		Object[] selection=jgraph.getSelectionModel().getSelectionCells();
    		
    		if(jgraph.getSelectionCount()==1)
    		{

        		DefaultGraphCell[] cellsToInsert= new DefaultGraphCell[3];

        		
    			DefaultGraphCell cell = new DefaultGraphCell();
    			
    			Rectangle2D selectedCellBounds=GraphConstants.getBounds(jgraph.getModel().getAttributes(selection[0]));
    			double selectedCellBoundsX=selectedCellBounds.getX();
    			double selectedCellBoundsY=selectedCellBounds.getY();
    			double selectedCellBoundsH=selectedCellBounds.getHeight();
    			double selectedCellBoundsW=selectedCellBounds.getWidth();
    			
    			GraphConstants.setBounds(cell.getAttributes(),
    					new Rectangle2D.Double(selectedCellBoundsX+5, 
    							selectedCellBoundsY+5, selectedCellBoundsW, selectedCellBoundsH));
    			

    			GraphConstants.setBorderColor(
    					cell.getAttributes(), Color.black);


    			// Add a Port
    			DefaultPort port = new DefaultPort();
    			cell.add(port);
    			port.setParent(cell);
    			cellsToInsert[0] =cell;
    			
    			

        		DefaultEdge edge = new DefaultEdge(currentRelationshipField.getText());
        		edge.setSource(cellsToInsert[0].getChildAt(0));
        		edge.setTarget(jgraph.getModel().getChild(selection[0],0));
        		cellsToInsert[1] = edge;
        		cellsToInsert[2]=(DefaultGraphCell)selection[0];
        		jgraph.getGraphLayoutCache().insert(cellsToInsert);
        		
        		int nodeIndex =jgraph.getModel().getIndexOfRoot(cell);
        		mindmapNotes.putValue(Integer.toString(nodeIndex), "");

    		}


    	}
    	
    	
    	if(e.getActionCommand().equals("RemoveMindMapNode"))
    	{
    		Object[] selection=jgraph.getSelectionCells();
    		if(selection.length==1)
    		{
    			
    			if(!jgraph.getModel().isEdge(selection[0]))
    			{
        			int selectedNode =jgraph.getModel().getIndexOfRoot(selection[0]);
        			mindmapNotes.remove(new Attributes.Name(Integer.toString(selectedNode)));
    			}

    			jgraph.getGraphLayoutCache().remove(selection);

    		}
    		
    	}
    	
    	
    	if(e.getActionCommand().equals("SaveMindMapNode"))
    	{
    		Object[] selection=jgraph.getSelectionCells();
    		if(selection.length==1)
    		{
    			int selectedNode =jgraph.getModel().getIndexOfRoot(selection[0]);
    			mindmapNotes.put(new Attributes.Name(Integer.toString(selectedNode)),mindmapNodeText.getText());

    		}
    		
    	}
    	
    	
    	if(e.getActionCommand().equals("DisplayNodeContent"))
    	{
    		Object[] selection=jgraph.getSelectionCells();
    		if(selection.length==1)
    		{
    			int selectedNode =jgraph.getModel().getIndexOfRoot(selection[0]);
    			mindmapNodeText.setText(mindmapNotes.getValue(Integer.toString(selectedNode)));
    		}
    		
    	}
    	

    	if(e.getSource().equals(userBookmarksInCommon))
    	{
    		launcher.openURLinBrowser(e.getActionCommand());
    	}

    	if(e.getActionCommand().equals("ShowAllUsers"))
    	{
        	try{
    		Class.forName("org.hsqldb.jdbcDriver");
            conn = DriverManager.getConnection("jdbc:hsqldb:Processor","sa","");
        	}
        	catch(Exception ex)
        	{
        		ex.printStackTrace();
        	}

            	loadUsers(conn);

			try{
				conn.close();
            }catch(Exception ex)
            {
            	ex.printStackTrace();
            }

    	}

    	if(e.getActionCommand().equals("ShowCategoryBookmarks"))
    	{
    		if(currentProcessingState==ProcessorThread.ProcessorThreadState.STOPPED)
    		{
            	try
            	{

            		processorThread = new ProcessorThread(currentProcessor,usernameTextField.getText(),genres.getSelectedIndex(),false);
            	}
            	catch(Exception ex)
            	{
            		ex.printStackTrace();
            	}

    		}
    		else
    		{
    			processingBookmark.setText("Don't push that button!");
    		}
    	}


    	if(genres.getSelectedIndex()!=-1&&e.getSource().equals(genres))
    	{
    		try
    		{
    			loadBookmarkSetUsers(genres.getSelectedIndex());
    		}
    		catch(NumberFormatException numE)
    		{
    			numE.printStackTrace();
    		}

    	}

    	if(e.getActionCommand().equals("OpenThisUsersBookmarks")&& !currentUsersBookmarksField.getText().equals(""))
    	{

    		//launcher.openURLinBrowser(currentUsersBookmarksField.getText());
    		launcher.openURLinBrowser("http://www.apphive.com/Redirect.php?forward_to="+currentUsersBookmarksField.getText());
    	}

    	if(genres.getSelectedIndex()!=-1&&e.getActionCommand().equals("ShowCategoryUsers"))
    	{
    		loadBookmarkSetUsers(genres.getSelectedIndex());
    	}

    	if(userBookmarksInCommon.getSelectedItem()!=null&&e.getActionCommand().equals("OpenBookmark"))
    	{

    		//launcher.openURLinBrowser(userBookmarksInCommon.getSelectedItem());
    		launcher.openURLinBrowser("http://www.apphive.com/Redirect.php?forward_to="+userBookmarksInCommon.getSelectedItem());
    	}

    	if((e.getSource().equals(usernameTextField)&& !usernameTextField.getText().equals(""))||
    			("Get Bookmarks".equals(e.getActionCommand()) && !usernameTextField.getText().equals("")))
    	{
    		if(currentProcessingState==ProcessorThread.ProcessorThreadState.STOPPED)
    		{
            	try
            	{
            		//Processor newProcessor= new Processor(this,this);
            		processorThread = new ProcessorThread(currentProcessor,usernameTextField.getText(),0,true);
            	}
            	catch(Exception ex)
            	{
            		ex.printStackTrace();
            	}

    		}
    		else
    		{
    			processingBookmark.setText("Don't push that button!");
    		}

    	}


    }

    
    
    
    /**
     *
     * @param e
     */
    public void mouseClicked(MouseEvent e){
    	try{
			Class.forName("org.hsqldb.jdbcDriver");
	        conn = DriverManager.getConnection("jdbc:hsqldb:Processor","sa","");
    	}
    	catch(Exception ex)
    	{
    		ex.printStackTrace();
    	}

        if (!e.getComponent().equals(jgraph)&&(e.getClickCount() == 2 || e.getClickCount() == 1)){
           int selectedRow=usernameTabel.getSelectedRow();
           String currentUsername=(String)usernameTabel.getValueAt(selectedRow, 0);
		        try
		    	{
		        	HashMap<Integer,User> users= currentProcessor.getUsers(conn);
		        	HashMap<Integer,Url> urls= currentProcessor.getURLs(conn);
		        	User user=currentProcessor.getUser(currentUsername);

	    			userBookmarksInCommon.removeAll();

		    		for(int i=0;i<user.getUrls().size();i++)
		    		{
		    			userBookmarksInCommon.add(urls.get(user.getUrls().get(i)).getUrl());
		    		}

		    		currentUsersBookmarksField.setText("http://del.icio.us/"+currentUsername);

		    	}
		    	catch(Exception ex)
		    	{

		    	}
           }

		try{
			conn.close();
        }catch(Exception ex)
        {
        	ex.printStackTrace();
        }
    }

    /**
     *
     * @param e
     */
    public void mouseEntered(MouseEvent e){

        }

    /**
     *
     * @param e
     */
    public void mouseExited(MouseEvent e){

        }

    /**
     *
     * @param e
     */
    public void mousePressed(MouseEvent e){
        if (e.isPopupTrigger()) {
            popup.show(e.getComponent(),
                       e.getX(), e.getY());
        }
        }

    /**
     *
     * @param e
     */
    public void mouseReleased(MouseEvent e){
        if (e.isPopupTrigger()) {
            popup.show(e.getComponent(),
                       e.getX(), e.getY());
        }
        }

    /**
     *
     * @param he
     */
    public void hyperlinkUpdate(HyperlinkEvent he)
    {
        if (HyperlinkEvent.EventType.ACTIVATED.equals(he.getEventType())  )
        {

        	try
        	{
        		launcher.openURLinBrowser(he.getURL().toURI().toString());

        	}
        	catch(Exception ex)
        	{

        	}

        }

    }

	/**
     *
     * @param e
     */
    public void messageSent(ProcessorMessageEvent e)
	{
		processingBookmark.setText(e.message);
	}



	/**
     *
     * @param e
     */
    public void processorThreadstateChanged(ProcessorThreadStateChangedEvent e)
	{
		currentProcessingState=e.state;
    	try{
    		Class.forName("org.hsqldb.jdbcDriver");
            conn = DriverManager.getConnection("jdbc:hsqldb:Processor","sa","");
        	}
        	catch(Exception ex)
        	{
        		ex.printStackTrace();
        	}

			if(e.state==ProcessorThread.ProcessorThreadState.FINISHEDPROCESSINGUSERS)
			{
				loadUsers(conn);
				processingBookmark.setText("");

			}
			else if(e.state==ProcessorThread.ProcessorThreadState.FINISHEDPROCESSINGUSER)
			{
				loadUsers(conn);
			}
			else if(e.state==ProcessorThread.ProcessorThreadState.FINISHEDPROCESSINGSET)
			{
				loadSets(conn);
			}
			else if(e.state==ProcessorThread.ProcessorThreadState.FINISHEDPROCESSINGSETS)
			{
				loadSets(conn);
				processingBookmark.setText("");
			}
			/**
			else if(e.state==ProcessorThread.ProcessorThreadState.FINISHEDPROCESSINGRECOMMENDATIONS)
			{
				java.util.List<String> recommendation=currentProcessor.getRecommedation();
    			userBookmarksInCommon.removeAll();

	    		for(int i=0;i<recommendation.size();i++)
	    		{
	    			userBookmarksInCommon.add(recommendation.get(i));
	    		}

			}
			**/

			try{
				conn.close();
            }catch(Exception ex)
            {
            	ex.printStackTrace();
            }

	}

    private static void createGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("The Reaper");

        File icon=new File("TheReaperIcon.png");
        Image iconImage=null;
        try{
        	iconImage=ImageIO.read(icon);
        }
        catch(Exception e)
        {
        	System.out.print(e.getMessage());
        }
        frame.setIconImage(iconImage);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TheReaper theReaper = new TheReaper();
        theReaper.setOpaque(true);
        frame.setContentPane(theReaper);
        frame.pack();
        frame.setVisible(true);
        //frame.setSize(750, 700);
        frame.setResizable(false);
    }


    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }
}


