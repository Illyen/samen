import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MainWindow extends Frame implements ActionListener, WindowListener
{
	private static final long serialVersionUID = 1L;
	private ArrayList<SamenArray> sAL = new ArrayList<SamenArray>();
	public MainWindow (String s)
	{
		super(s);
		addWindowListener(this);
		setBackground(new Color(4223804));
		Container c = new Container();
		c.setLayout(new GridLayout(5,1));
		add(c, BorderLayout.NORTH);
		c.add(new Label("1"));
		c.add(new Label("2"));
		c.add(new Label("3"));
		c.add(new Label("4"));
		c.add(new Label("5"));
		this.setSize(200, 200);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event){}
    public void windowClosing(WindowEvent event) { System.exit(0); }
    public void windowClosed(WindowEvent event){}
    public void windowDeiconified(WindowEvent event){}
    public void windowIconified(WindowEvent event){}
    public void windowActivated(WindowEvent event){}
    public void windowDeactivated(WindowEvent event){}
    public void windowOpened(WindowEvent event){} 
}
