import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Dicegame extends JFrame implements ActionListener {
	
	
	Dice dice;
	int state;
	private Player p1;
	private Player p2;
	JTextField playerTf1;
	JTextField playerTf2;
	JButton btnStart = new JButton("start");
	JButton btnCancel = new JButton("Cancel");
	Yoot yoot;
	
	public Dicegame(){
		
		
		startG();
		
	}
	
	
	

	public void startG(){
		JPanel panel = new JPanel(new GridLayout(3,2)); 
		getContentPane().add(panel);
		
		
		state=0;
		JLabel label1 = new JLabel("player 1");
	    JLabel label2 = new JLabel("player 2");
	    
	    playerTf1= new JTextField(10);
	    playerTf2= new JTextField(10);
	    
	    btnStart.addActionListener(this);
	    btnCancel.addActionListener(this);
	    
	    panel.add(label1);	
	    panel.add(playerTf1);
	    panel.add(label2);
	    panel.add(playerTf2);
	    
	    panel.add(btnStart);
	    panel.add(btnCancel);
	    
	    pack();
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public String startGame(){
		
		
		p1= new Player(playerTf1.getText());
		p2= new Player(playerTf2.getText());
		String str1=p1.play(); //주사위 던지기
		String str2=p2.play();
		String str3 = p1.getName()+str1+"\n"+p2.getName()+str2+"\n";
		if(p1.getNum() > p2.getNum()){
			state=1;
			
			return str3+p1.getName()+ " won" ;
			//System.out.println(p1.getName()+ " won!");
		} else if (p1.getNum()== p2.getNum()){
			state=-1;

			return str3+"draw";
			//System.out.println("draw!!");
		} else {
			state=2;
	
			return str3+p2.getName()+ " won" ;
			//System.out.println(p2.getName() + " won!");
		}
		
		
	}
	


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(btnStart)){
			JOptionPane.showMessageDialog(this, startGame());
			yoot=new Yoot(p1.getName(),p2.getName(),state);
			
		}else {
			
			

		}
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			new Dicegame();
		
	}

}
