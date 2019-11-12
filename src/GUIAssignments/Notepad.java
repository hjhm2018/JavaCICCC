package GUIAssignments;

import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Notepad {

	private JFrame frmNotepad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notepad window = new Notepad();
					window.frmNotepad.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Notepad() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNotepad = new JFrame();
		frmNotepad.setTitle("Notepad");
		frmNotepad.setBounds(100, 100, 450, 300);
		frmNotepad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea textArea = new JTextArea();
		frmNotepad.getContentPane().add(textArea);
		
		JMenuBar menuBar = new JMenuBar();
		frmNotepad.setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuBar.add(menuFile);
		
		JMenuItem fileNew = new JMenuItem("New");
		fileNew.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		menuFile.add(fileNew);
		
		JMenuItem fileOpen = new JMenuItem("Open");
		fileOpen.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JFileChooser fc=new JFileChooser();    
			    int i=fc.showOpenDialog(frmNotepad);    
			    if(i==JFileChooser.APPROVE_OPTION){    
			        File f=fc.getSelectedFile();    
			        String filepath=f.getPath();    
			        try{  
			        BufferedReader br=new BufferedReader(new FileReader(filepath));    
			        String s1="",s2="";                         
			        while((s1=br.readLine())!=null){    
			        s2+=s1+"\n";    
			        }    
			        textArea.setText(s2);    
			        br.close();    
			        }catch (Exception ex) {ex.printStackTrace();  }                 
			    }    
			}
		});
		menuFile.add(fileOpen);
		
		JMenuItem fileSave = new JMenuItem("Save");
		fileSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		menuFile.add(fileSave);
		
		JMenuItem fileSaveAs = new JMenuItem("Save As");
		fileSaveAs.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		menuFile.add(fileSaveAs);
		
		JMenuItem filePageSetup = new JMenuItem("Page Setup");
		filePageSetup.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		menuFile.add(filePageSetup);
		
		JMenuItem filePrint = new JMenuItem("Print");
		filePrint.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		menuFile.add(filePrint);
		
		JMenuItem fileExit = new JMenuItem("Exit");
		fileExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
                    	frmNotepad.dispose();
      
			}
		});
		menuFile.add(fileExit);
		
		JMenu menuEdit = new JMenu("Edit");
		
		menuBar.add(menuEdit);
		
		JMenuItem editUndo = new JMenuItem("Undo");
		editUndo.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		menuEdit.add(editUndo);
		
		JMenuItem editCut = new JMenuItem("Cut");
		editCut.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textArea.cut();
			}
		});
		
		menuEdit.add(editCut);
		
		JMenuItem editCopy = new JMenuItem("Copy");
		editCopy.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textArea.copy();
			}
		});
		menuEdit.add(editCopy);
		
		JMenuItem editPaste = new JMenuItem("Paste");
		editPaste.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textArea.paste();
			}
		});
		menuEdit.add(editPaste);
		
		JMenuItem editDelete = new JMenuItem("Delete");
		editDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		menuEdit.add(editDelete);
		
		JMenuItem editSelectAll = new JMenuItem("Select All");
		editSelectAll.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textArea.selectAll();
			}
		});
		menuEdit.add(editSelectAll);
		
		JMenu menuFormat = new JMenu("Format");
		menuBar.add(menuFormat);
		
		JMenuItem formatWordWrap = new JMenuItem("Word Wrap");
		formatWordWrap.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("Hello");
			}
		});
		menuFormat.add(formatWordWrap);
		
		JMenuItem formatFont = new JMenuItem("Font");
		formatFont.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("I work!");
			}
		});
		menuFormat.add(formatFont);
		
		JMenu menuView = new JMenu("View");
		menuBar.add(menuView);
		
		JMenuItem viewZoom = new JMenuItem("Zoom");
		menuView.add(viewZoom);
		
		JMenuItem viewStatusBar = new JMenuItem("Status Bar");
		menuView.add(viewStatusBar);
		
		JMenu menuHelp = new JMenu("Help");
		menuBar.add(menuHelp);
		
		JMenuItem helpViewHelp = new JMenuItem("View Help");
		menuHelp.add(helpViewHelp);
		
		JMenuItem helpAbout = new JMenuItem("About Notepad");
		menuHelp.add(helpAbout);
		frmNotepad.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		
	}
}
