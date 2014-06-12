import java.awt.*;
import java.awt.event.*;

public class MainWindow extends Frame implements ActionListener, WindowListener
{
	private static final long serialVersionUID = 1L;
	private Label[] lLabel = new Label[5];
	private Label[] mLabel = new Label[5];
	private int[] curSamen = new int[5];
	private Button[] plusButton = new Button[4];
	private Button[] minusButton = new Button[4];
	private Button rueck, next;
	private SamenListe sl = new SamenListe();
	
	public MainWindow (String s)
	{
		super(s);
		addWindowListener(this);
		
		// Komponenten erstellen
		// linkerContainer
		Container lc = new Container();
		lc.setLayout(new GridLayout(5,1));
		add(lc, BorderLayout.LINE_START);	
		
		// Komponenten im linken Container
		// Labels
		lLabel[0] = new Label("Gesamtanzahl:");
		lLabel[1] = new Label("Spawnsamen:");
		lLabel[2] = new Label("Angriffssamen:");
		lLabel[3] = new Label("Verteidigungssamen:");
		lLabel[4] = new Label("Schadenssamen:");
		for(int i=0;i<5;i++)
		{
			lLabel[i].setForeground(Color.WHITE);
			lc.add(lLabel[i]);
		}
		
		// mittlerer Container
		Container mc = new Container();
		mc.setLayout(new GridLayout(5,1));
		add(mc, BorderLayout.CENTER);
		
		// Komponenten im mittleren Container
		// Labels
		for (int i=0;i<5;i++)
		{
			mLabel[i] = new Label("0");
			mLabel[i].setForeground(Color.WHITE);
			mc.add(mLabel[i]);
		}	
		
		// rechter Container
		Container rc = new Container();
		rc.setLayout(new GridLayout(5,2));
		add(rc, BorderLayout.LINE_END);
		
		// Komponenten im rechten Container
		// Platzhalter
		rc.add(new Label());
		rc.add(new Label());
		
		// Buttons
		for (int i=0;i<4;i++)
		{
			plusButton[i] = new Button("+");
			minusButton[i] = new Button("-");
			plusButton[i].setActionCommand("p"+String.valueOf(i+1));
			minusButton[i].setActionCommand("m"+String.valueOf(i+1));
			plusButton[i].addActionListener(this);
			minusButton[i].addActionListener(this);
			rc.add(plusButton[i]);
			rc.add(minusButton[i]);
		}
		
		
		// unterer Container
		Container uc = new Container();
		uc.setLayout(new GridLayout(1,4));
		add(uc, BorderLayout.PAGE_END);
		
		// Komponenten im unteren Container
		// Buttons
		rueck = new Button("letzte Runde");
		next = new Button("naechste Runde");
		rueck.addActionListener(this);
		next.addActionListener(this);
		uc.add(rueck);
		uc.add(next);
		
		
		// Settings
		setBackground(new Color(4223804));
		setResizable(false);
		setSize(300, 200);
		setVisible(true);
	}
	
	// Buttonaktionen
	public void actionPerformed(ActionEvent event)
	{
		String eventString = event.getActionCommand();
		if(eventString.equals("p1"))
		{
			curSamen[0]=curSamen[0]+1;
			curSamen[1]++;
		}
		else if(eventString.equals("p2"))
		{
			curSamen[0]++;
			curSamen[2]++;		
		}
		else if(eventString.equals("p3"))
		{
			curSamen[0]++;
			curSamen[3]++;
		}
		else if(eventString.equals("p4"))
		{
			curSamen[0]++;
			curSamen[4]++;
		}
		else if(eventString.equals("m1"))
		{
			curSamen[0]--;
			curSamen[1]--;
		}
		else if(eventString.equals("m2"))
		{
			curSamen[0]--;
			curSamen[2]--;
		}
		else if(eventString.equals("m3"))
		{
			curSamen[0]--;
			curSamen[3]--;
		}
		else if(eventString.equals("m4"))
		{
			curSamen[0]--;
			curSamen[4]--;
		}
		else if(eventString.equals("letzte Runde"))
		{
			curSamen = sl.stepBack();
		}
		else if(eventString.equals("naechste Runde"))
		{
			curSamen = sl.createNext(curSamen);
			sl.add(curSamen);
		}
	// Label neu beschriften	
	for (int i=0;i<5;i++)
		{
			mLabel[i].setText(String.valueOf(curSamen[i]));
		}
	}
	
	// größtenteils unbenützte Funktionen, nur da um die Implementierungen zu bedienen
    public void windowClosing(WindowEvent event) { System.exit(0); }
    public void windowClosed(WindowEvent event){}
    public void windowDeiconified(WindowEvent event){}
    public void windowIconified(WindowEvent event){}
    public void windowActivated(WindowEvent event){}
    public void windowDeactivated(WindowEvent event){}
    public void windowOpened(WindowEvent event){} 
}
