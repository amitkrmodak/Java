import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
public class Client1 extends Frame implements ActionListener,Runnable,KeyListener 
{
	Socket s;
	BufferedReader br;
	BufferedWriter bw;
        TextField text,name;
        Button exit,clear;
        Label label1;
        List list;
        Panel p1,p2,sp21,sp22,jp=null;
        

	public void run()
	{
		try{s.setSoTimeout(1);}catch(Exception e){}
		while (true)
		{
			try
			{
                list.add(br.readLine());
			}
			catch (Exception h){}
                                /*because after succesive typing the list get a
                                scrollbar and to view what You typed; the scroller
                                is required.Hence after item count=8 the first
                                item is removed.
                                */
            if(list.getItemCount()==7)
				list.remove(0);

		}
	}
	public static void main(String arg[])
	{
        new Client1("Client");

	}
	public Client1(String m)
	{
		super(m);
                jp=new Panel();
                p1=new Panel();
                p2=new Panel();
                sp21=new Panel();
                sp22=new Panel();

                jp.setLayout(new GridLayout(2,1));
                p1.setLayout(new GridLayout(1,1));
                p2.setLayout(new GridLayout(2,1));
                sp21.setLayout(new FlowLayout());
                sp22.setLayout(new FlowLayout());


                exit = new Button("Exit");
                clear = new Button("Clear"); 
                exit.addActionListener(this);
                clear.addActionListener(this);
                list = new List(50);
                text = new TextField(43);
                name = new TextField(10);
                label1=new Label("Enter Your Name");
                name.addKeyListener(this);
                text.addKeyListener(this);
                p1.add(list);

                sp21.add(text);
                sp21.add(exit);
                sp22.add(label1);
                sp22.add(name);
                sp22.add(clear);
                p2.add(sp21);
                p2.add(sp22);

                jp.add(p1);
                jp.add(p2);

                this.add(jp);
                setBackground(Color.orange);
                setSize(380,300);
                setLocation(400,0);
                setVisible(true);
                setResizable(false);
                name.requestFocus();


		try{
                        /*Server and Client are assumed to have the same IP here
                        if they are different enter them instead of "127.0.0.1"
                        default is 127.0.0.1 here*/

                        s = new Socket("127.0.0.1",786);
                        br = new BufferedReader(new InputStreamReader(
					s.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(
					s.getOutputStream()));
			Thread th;
			th = new Thread(this);
			th.start();

		}
		catch(Exception e){}

	}
	public void actionPerformed ( ActionEvent e)
	{
                 if (e.getSource().equals(exit))
			 System.exit(0);
                else if (e.getSource().equals(clear))
                        { name.setText(" ");
                         name.setEditable(true);
                        }
                 
        }
        public void keyPressed(KeyEvent ke)
        {        if(text.equals(ke.getSource()))
                     {
                        if(ke.getKeyCode()==KeyEvent.VK_ENTER)
                            {
                              try{
                                 bw.write(name.getText()+">>"+text.getText());
                                 bw.newLine();bw.flush();
        
                                 }catch(Exception m){}
                                 list.add(name.getText()+">>"+text.getText());
                                 text.setText("");
                             }
                       }
                  if(name.equals(ke.getSource()))
                     {
                        if(ke.getKeyCode()==KeyEvent.VK_ENTER)
                             {
                                name.setEditable(false);
                                text.requestFocus();
                               }
                      }

        }
        public void keyReleased(KeyEvent ke) { 
        }
        public void keyTyped(KeyEvent ke) { //something
        }                                                                                                                              

}