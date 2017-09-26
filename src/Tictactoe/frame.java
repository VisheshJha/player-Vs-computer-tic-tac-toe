/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tictactoe;

import java.awt.Color;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class frame extends javax.swing.JFrame {

    /**
     * Creates new form frame
     */
    private String turn= "X";
    private String Player1="Player 1";
    private String Player2="Player 2";
    int player1sc=0;
    int player2sc=0;
    private int e_count;
    public frame() {
        initComponents();
       
  
    }
    
    private void turn_determination()
    {
        if(turn.equalsIgnoreCase("O")) 
        {
            turn="X";
           
        }
        else
        {
            turn="O";
        }
    }
    private int win_determination()
    {
        int flag=0;
        String box1 = jButton3.getText();
        String box2 = jButton4.getText();
        String box3 = jButton5.getText();
        String box4 = jButton6.getText();
        String box5 = jButton7.getText();
        String box6 = jButton8.getText();
        String box7 = jButton9.getText();
        String box8 = jButton10.getText();
        String box9 = jButton11.getText();
    
    
    if(box1==box2 && box1==box3)  //check for equality then sign and then declare winner
    {
        if(box1.equalsIgnoreCase("X"))
        {
        Xwins();
        }
        if(box1.equalsIgnoreCase("O"))
        {
            OWins();
            flag=1;
        }
    }
    
     if(box4==box5 && box4==box6)  //check for equality then sign and then declare winner
    {
        if(box4.equalsIgnoreCase("X"))
        {
        Xwins();
        }
        if(box4.equalsIgnoreCase("O"))
        {
            OWins();
            flag=1;
        }
    }
     if(box7==box8 && box7==box9)  //check for equality then sign and then declare winner
    {
        if(box7.equalsIgnoreCase("X"))
        {
        Xwins();
        }
        if(box7.equalsIgnoreCase("O"))
        {
            OWins();
            flag=1;
        }
    }
     
      if(box1==box4 && box1==box7)  //check for equality then sign and then declare winner
    {
        if(box1.equalsIgnoreCase("X"))
        {
        Xwins();
        }
        if(box1.equalsIgnoreCase("O"))
        {
            OWins();
            flag=1;
        }
    }
       if(box2==box5 && box2==box8)  //check for equality then sign and then declare winner
    {
        if(box2.equalsIgnoreCase("X"))
        {
        Xwins();
        }
        if(box2.equalsIgnoreCase("O"))
        {
            OWins();
            flag=1;
        }
    }
        if(box3==box6 && box3==box9)  //check for equality then sign and then declare winner
    {
        if(box3.equalsIgnoreCase("X"))
        {
        Xwins();
        }
        if(box3.equalsIgnoreCase("O"))
        {
            OWins();
            flag=1;
        }
    }
         if(box1==box5 && box1==box9)  //check for equality then sign and then declare winner
    {
        if(box1.equalsIgnoreCase("X"))
        {
        Xwins();
        }
        if(box1.equalsIgnoreCase("O"))
        {
            OWins();
            flag=1;
        }
    }
          if(box3==box5 && box3==box7)  //check for equality then sign and then declare winner
    {
        if(box3.equalsIgnoreCase("X"))
        {
        Xwins();
        }
        if(box3.equalsIgnoreCase("O"))
        {
            OWins();
            flag=1;
        }
    }
          return flag;
    }
    
   /* void Smartmove()
    {
        String box1 = jButton3.getText();
        String box2 = jButton4.getText();
        String box3 = jButton5.getText();
        String box4 = jButton6.getText();
        String box5 = jButton7.getText();
        String box6 = jButton8.getText();
        String box7 = jButton9.getText();
        String box8 = jButton10.getText();
        String box9 = jButton11.getText();
        
        int res=0, blink=0;
       //checking for win
        if(box1!="X" || box1!="O")
        {
            jButton3.setText("O");
          res= win_determination();
           if(res==1)
           {
               box1="O";
               jButton3.setText("O");
               //turn="O";
               blink = 1;
           }
            else
           {
           jButton3.setText("");}
        }
        
         if(box2!="X" || box2!="O")
        {
            jButton4.setText("O");
          res= win_determination();
           if(res==1)
           {
               box2="O";
               jButton4.setText("O");
             //  turn="O";
               blink =1;
           }
           else{jButton4.setText("");}
            
        }
        if(box3!="X" || box3!="O")
        {
           jButton5.setText("O");
          res= win_determination();
           if(res==1)
           {
               box3="O";
               jButton5.setText("O");
              // turn="O";
               blink =1;
           }
           else{jButton5.setText("O");}
            
        }
         if(box4!="X" || box4!="O")
        {
            jButton6.setText("O");
          res= win_determination();
           if(res==1)
           {
               box4="O";
               jButton6.setText("O");
              // turn="O";
               blink =1;
           }
           else{jButton6.setText("");}
            
        }
         if(box5!="X" || box5!="O")
        {
           jButton7.setText("O");
          res= win_determination();
           if(res==1)
           {
               box5="O";
               jButton7.setText("O");
              // turn="O";
               blink =1;
           }
           else{jButton7.setText("");}
        
       }
        
         if(box6!="X" || box6!="O")
        {
          jButton8.setText("O");
          res= win_determination();
           if(res==1)
           {
               box6="O";
               jButton8.setText("O");
             //  turn="O";
               blink =1;
           }
           else{jButton8.setText("");}
            
        }
         if(box7!="X" || box7!="O")
        {
            jButton9.setText("O");
          res= win_determination();
           if(res==1)
           {
               box7="O";
               jButton9.setText("O");
             //  turn="O";
               blink =1;
           }
           else{jButton9.setText("");}
            
        } if(box8!="X" || box8!="O")
        {
            jButton10.setText("O");
          res= win_determination();
           if(res==1)
           {
               box8="O";
               jButton10.setText("O");
             //  turn="O";
               blink =1;
           }
           else
           {jButton10.setText("");}
            
        } if(box9!="X" || box9!="O")
        {
            jButton10.setText("O");
          res= win_determination();
           if(res==1)
           {
               box1="O";
               jButton11.setText("O");
             //  turn="O";
               blink =1;
           }
           else{jButton10.setText("");}
            
        }
        
        
        //checking for tie
      if(blink==0)
      {
             if(box1!="X" || box1!="O")
        {
             jButton3.setText("O");
          res= Tie();
           if(res==1)
           {
               box1="O";
               jButton3.setText("O");
               //turn="O";
              
           }
           else
           { jButton3.setText("");}
            
        }
        
        if(box2!="X" || box2!="O")
        {
             jButton4.setText("O");
          res= Tie();
           if(res==1)
           {
               box2="O";
               jButton4.setText("O");
              // turn="O";
           }else{ jButton4.setText("");}
            
        }
         if(box3!="X" || box3!="O")
        {
             jButton5.setText("O");
          res= Tie();
           if(res==1)
           {
               box3="O";
               jButton5.setText("O");
               //turn="O";
              
           }
           else{ jButton5.setText("O");}
            
        }
        if(box4!="X" || box4!="O")
        {
            jButton6.setText("O");
          res= Tie();
           if(res==1)
           {
               box4="O";
               jButton6.setText("O");
             //  turn="O";
           }
           else{
           jButton6.setText("");}
        }
         if(box5!="X" || box5!="O")
        {
            jButton7.setText("O");
          res= Tie();
           if(res==1)
           {
               box5="O";
               jButton7.setText("O");
              // turn="O";
           }
           else{jButton7.setText("");}
        
       }
        
         if(box6!="X" || box6!="O")
        {
          jButton8.setText("O");
          res= Tie();
           if(res==1)
           {
               box6="O";
               jButton8.setText("O");
             //  turn="O";
           }
           else{jButton8.setText("");}
        }
         if(box7!="X" || box7!="O")
        {
            jButton9.setText("O");
          res= Tie();
           if(res==1)
           {
               box7="O";
               jButton9.setText("O");
             //turn="O";
           }
           else{jButton9.setText("");}
            
        } if(box8!="X" || box8!="O")
        {
            jButton10.setText("O");
          res= Tie();
           if(res==1)
           {
               box8="O";
               jButton10.setText("O");
              // turn="O";
           }
           else{jButton10.setText("");}
            
        } if(box9!="X" || box9!="O")
        {
            jButton11.setText("O");
          res= Tie();
           if(res==1)
           {
               box1="O";
               jButton11.setText("O");
             // turn="O"; 
           }
           else{ jButton11.setText("");}
            
        }
    }
      if(res==0)
      {
          int a;
          int randomNum=ThreadLocalRandom.current().nextInt(1,9);
          System.out.print(randomNum);
          switch(randomNum)
          {
              case 1: if(box1.equals(""))
                     { jButton3.setText("O");
                     turn="O";}
                     else
                    { a=0;}
              break;
              case 2: if(box2.equals(""))
                     { jButton4.setText("O");//turn="O";
                     
                     }
                     else
                    { a=0;}
              break;
               case 3: if(box3.equals(""))
                     { jButton5.setText("O");//turn="O";
                     }
                     else
                    { a=0;}
              break;
               case 4: if(box4.equals(""))
                     { jButton6.setText("O");//turn="O";
                     }
                     else
                    { a=0;}
              break;
               case 5: if(box5.equals(""))
                     { jButton7.setText("O");//turn="O";
                     }
                     else
                    { a=0;}
              break;
               case 6: if(box6.equals(""))
                     { jButton8.setText("O");//turn="O";
                     }
                     else
                    { a=0;}
              break;
               case 7: if(box7.equals(""))
                     { jButton9.setText("O");//turn="O";}
                     
                     }
                     else
                    { a=0;}
              break;
               case 8: if(box8.equals(""))
                     { jButton10.setText("O");//turn="O";}
                     
                     }
                     else
                    { a=0;}
              break;
               case 9: if(box9.equals(""))
                     { jButton11.setText("O");//turn="O";}
                     
                     }
                     else
                    { a=0;}
              break;
          }
         
      
          
          
      }
    }
    */
    
    /* void Smartmove()
    {
    String box1 = jButton3.getText();
    String box2 = jButton4.getText();
    String box3 = jButton5.getText();
    String box4 = jButton6.getText();
    String box5 = jButton7.getText();
    String box6 = jButton8.getText();
    String box7 = jButton9.getText();
    String box8 = jButton10.getText();
    String box9 = jButton11.getText();
    
    
    if(box1!="X" && box1!="O")
    {
    System.out.println(e_count);
    
    e_count++;
    }
    if(box2!="X" && box2!="O")
    {System.out.println(e_count);
    e_count++;
    }
    if(box3!="X" && box3!="O")
    {System.out.println(e_count);
    e_count++;
    }
    if(box4!="X" && box4!="O")
    {System.out.println(e_count);
    e_count++;
    }
    if(box5!="X" && box5!="O")
    {System.out.println(e_count);
    e_count++;
    }
    if(box6!="X" && box6!="O")
    {System.out.println(e_count);
    e_count++;
    }
    if(box7!="X" && box7!="O")
    {System.out.println(e_count);
    e_count++;
    }
    if(box8!="X" && box8!="O")
    {System.out.println(e_count);
    e_count++;
    }
    if(box9!="X" && box9!="O")
    {System.out.println(e_count);
    e_count++;
    }
    System.out.println("E_count"+e_count);
    if(e_count>7)
    {
    int randomNum=ThreadLocalRandom.current().nextInt(1,9);
    System.out.print(randomNum);
    switch(randomNum)
    {
    case 1: if(box1 !="X" && box1 != "O")
    System.out.println("case1");
    { jButton3.setText("O");//turn="X";
    jButton3.setForeground(Color.black);
    }
    
    break;
    case 2: if(box2 !="X" && box2 != "O")
    { jButton4.setText(turn);//turn="X";
    jButton3.setForeground(Color.black);
    jButton4.setForeground(Color.black);
    System.out.println("case2");
    }
    
    break;
    case 3: if(box3 !="X" && box3 != "O")
    { jButton5.setText(turn);//turn="O";
    jButton5.setForeground(Color.black);
    System.out.println("case3");
    }
    
    break;
    case 4: if(box4 !="X" && box4 != "O")
    { jButton6.setText(turn);//turn="O";
    jButton6.setForeground(Color.black);
    System.out.println("case4");
    }
    
    break;
    case 5: if(box5 !="X" && box5 != "O")
    {     System.out.println("case5");
    jButton7.setText(turn);
    jButton7.setForeground(Color.black);
    }
    
    break;
    case 6: if(box6 !="X" && box6 != "O")
    { jButton8.setText(turn);//turn="O";
    jButton8.setForeground(Color.black);
    System.out.println("case6");
    }
    
    break;
    case 7: if(box7 !="X" && box7 != "O")
    { jButton9.setText(turn);//turn="O";}
    jButton9.setForeground(Color.black);
    System.out.println("case7");
    }
    
    break;
    case 8: if(box8 !="X" && box8 != "O")
    { jButton10.setText(turn);//turn="O";}
    jButton10.setForeground(Color.black);
    System.out.println("case8");
    }
    
    break;
    case 9: if(box9 !="X" && box9 != "O")
    { jButton11.setText("O");//turn="O";}
    jButton11.setForeground(Color.black);
    System.out.println("case9");
    }
    
    break;
    }
    
    
    }
    
    
    int res=0;
    int blink=0;
    if(e_count<7)
    {//CHECKINNG FOR WIN
    
    
    
    }
    if(box1!="X" && box1!="O")
    {
    jButton3.setText("O");
    res= win_determination();
    if(res==1)
    {
    box1="O";
    jButton3.setText("O");
    //turn="O";
    blink=1;
    
    }
    else
    {
    jButton3.setText("");}
    }
    if(box2!="X" && box2!="O")
    {
    jButton4.setText("O");
    res= win_determination();
    if(res==1)
    {
    box1="O";
    jButton4.setText("O");
    //turn="O";
    blink=1;
    
    }
    else
    {
    jButton4.setText("");}
    }
    if(box3!="X" && box3!="O")
    {
    jButton5.setText("O");
    res= win_determination();
    if(res==1)
    {
    box1="O";
    jButton5.setText("O");
    //turn="O";
    blink=1;
    
    }
    else
    {
    jButton5.setText("");}
    }
    if(box4!="X" && box4!="O")
    {
    jButton6.setText("O");
    res= win_determination();
    if(res==1)
    {
    box1="O";
    jButton6.setText("O");
    //turn="O";
    blink=1;
    }
    else
    {
    jButton6.setText("");}
    }
    
    if(box5!="X" && box5!="O")
    {
    jButton7.setText("O");
    res= win_determination();
    if(res==1)
    {
    box1="O";
    jButton7.setText("O");
    //turn="O";
    blink=1;
    }
    else
    {
    jButton7.setText("");}
    }
    if(box6!="X" && box6!="O")
    {
    jButton8.setText("O");
    res= win_determination();
    if(res==1)
    {
    box1="O";
    jButton8.setText("O");
    //turn="O";
    blink=1;
    }
    else
    {
    jButton8.setText("");}
    }
    if(box7!="X" && box7!="O")
    {
    jButton9.setText("O");
    res= win_determination();
    if(res==1)
    {
    box1="O";
    jButton9.setText("O");
    //turn="O";
    blink=1;
    }
    else
    {
    jButton9.setText("");}
    }
    if(box8!="X" && box8!="O")
    {
    jButton10.setText("O");
    res= win_determination();
    if(res==1)
    {
    box1="O";
    jButton10.setText("O");
    //turn="O";
    blink=1;
    }
    else
    {
    jButton10.setText("");}
    }
    if(box9!="X" && box9!="O")
    {
    jButton11.setText("O");
    res= win_determination();
    if(res==1)
    {
    box1="O";
    jButton11.setText("O");
    //turn="O";
    blink=1;
    }
    else
    {
    jButton11.setText("");}
    }
    
    
    //CHECKING FOR TIE
    if(blink==0)
    {
    if(box1!="X" && box1!="O")
    {
    jButton3.setText("O");
    res= Tie();
    if(res==1)
    {
    box1="O";
    jButton3.setText("O");
    //turn="O";
    blink=1;
    
    }
    else
    {
    jButton3.setText("");}
    }
    if(box2!="X" && box2!="O")
    {
    jButton4.setText("O");
    res= Tie();
    if(res==1)
    {
    box1="O";
    jButton4.setText("O");
    //turn="O";
    blink=1;
    
    }
    else
    {
    jButton4.setText("");}
    }
    if(box3!="X" && box3!="O")
    {
    jButton5.setText("O");
    res= Tie();
    if(res==1)
    {
    box1="O";
    jButton5.setText("O");
    //turn="O";
    blink=1;
    
    }
    else
    {
    jButton5.setText("");}
    }
    if(box4!="X" && box4!="O")
    {
    jButton6.setText("O");
    res= Tie();
    if(res==1)
    {
    box1="O";
    jButton6.setText("O");
    //turn="O";
    blink=1;
    }
    else
    {
    jButton6.setText("");}
    }
    
    if(box5!="X" && box5!="O")
    {
    jButton7.setText("O");
    res= Tie();
    if(res==1)
    {
    box1="O";
    jButton7.setText("O");
    //turn="O";
    blink=1;
    }
    else
    {
    jButton7.setText("");}
    }
    if(box6!="X" && box6!="O")
    {
    jButton8.setText("O");
    res= Tie();
    if(res==1)
    {
    box1="O";
    jButton8.setText("O");
    //turn="O";
    blink=1;
    }
    else
    {
    jButton8.setText("");}
    }
    if(box7!="X" && box7!="O")
    {
    jButton9.setText("O");
    res= Tie();
    if(res==1)
    {
    box1="O";
    jButton9.setText("O");
    //turn="O";
    blink=1;
    }
    else
    {
    jButton9.setText("");}
    }
    if(box8!="X" && box8!="O")
    {
    jButton10.setText("O");
    res= Tie();
    if(res==1)
    {
    box1="O";
    jButton10.setText("O");
    //turn="O";
    blink=1;
    }
    else
    {
    jButton10.setText("");}
    }
    if(box9!="X" && box9!="O")
    {
    jButton11.setText("O");
    res=Tie();
    if(res==1)
    {
    box1="O";
    jButton11.setText("O");
    //turn="O";
    blink=1;
    }
    else
    {
    jButton11.setText("");}
    
    }
    }
    e_count=0;
    
    }
    */
    
    void Smartmove()
    {
        
    }
    
    
    
    
    void Xwins()
    {
      JOptionPane.showMessageDialog(this,"X Wins!");  
      player1sc++;
      Reset();
     
      
    }
    void OWins()
    {
      JOptionPane.showMessageDialog(this,"O Wins!");  
     player2sc++;
      Reset();
      
      
    }
    int Tie()
    {
        int res=0;
        String box1 = jButton3.getText();
        String box2 = jButton4.getText();
        String box3 = jButton5.getText();
        String box4 = jButton6.getText();
        String box5 = jButton7.getText();
        String box6 = jButton8.getText();
        String box7 = jButton9.getText();
        String box8 = jButton10.getText();
        String box9 = jButton11.getText();
        
        if(box1 !="" && box2 !="" && box3 !="" && box4 !="" && box5 !="" && box6 !="" && box7 !="" && box8 !="" && box9 !="" )
        {
            JOptionPane.showMessageDialog(this, "It's a Tie!");
            
            res=1;
            Reset();
        }
        return res;
    
    }
    void scdisplay()
    {
        score.setText(Player1+":  " +String.valueOf(player1sc)+"  \t  Vishesh:" + String.valueOf(player2sc));
    }
    void Reset()
    {
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        jButton10.setText("");
        jButton11.setText("");
        turn="X";
        scdisplay();
        e_count=0;
        turn="X";
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        score = new javax.swing.JLabel();
        jPanel_base_holder = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        Panel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        Panel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        Panel4 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        Panel5 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        Panel6 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        Panel7 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        Panel8 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        Panel9 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic_Tac_Toe");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new java.awt.BorderLayout());

        score.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        score.setText("Score");
        jPanel1.add(score, java.awt.BorderLayout.PAGE_START);

        jPanel_base_holder.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_base_holder.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        Panel1.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 80)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Panel1.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel_base_holder.add(Panel1);

        Panel2.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 80)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Panel2.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel_base_holder.add(Panel2);

        Panel3.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 80)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Panel3.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel_base_holder.add(Panel3);

        Panel4.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 80)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Panel4.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel_base_holder.add(Panel4);

        Panel5.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 80)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Panel5.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel_base_holder.add(Panel5);

        Panel6.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 80)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Panel6.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel_base_holder.add(Panel6);

        Panel7.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 80)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        Panel7.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel_base_holder.add(Panel7);

        Panel8.setLayout(new java.awt.BorderLayout());

        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 80)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        Panel8.add(jButton10, java.awt.BorderLayout.CENTER);

        jPanel_base_holder.add(Panel8);

        Panel9.setLayout(new java.awt.BorderLayout());

        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 80)); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        Panel9.add(jButton11, java.awt.BorderLayout.CENTER);

        jPanel_base_holder.add(Panel9);

        jPanel1.add(jPanel_base_holder, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       jButton3.setText(turn);
       if(turn.equalsIgnoreCase("X"))
       { 
           jButton3.setForeground(Color.white);
       }
      else
       {
          jButton3.setForeground(Color.black);
       }
     
       turn_determination();
       win_determination();
       Tie();
        Smartmove();
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.setText(turn);
          if(turn.equalsIgnoreCase("X"))
       { jButton4.setForeground(Color.white);
       }
       else
      {
        jButton4.setForeground(Color.black);
      }
        
       turn_determination();
       win_determination();
       Tie();Smartmove(); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jButton5.setText(turn);
          if(turn.equalsIgnoreCase("X"))
       { jButton5.setForeground(Color.white);
       }
          else
          {
          jButton5.setForeground(Color.black);
          }
          
       turn_determination();
       win_determination();
       Tie();Smartmove();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jButton6.setText(turn);
          if(turn.equalsIgnoreCase("X"))
       { jButton6.setForeground(Color.white);
       }
           else
          {
          jButton6.setForeground(Color.black);
          }
          Smartmove();
       turn_determination();
       win_determination();
       Tie();Smartmove();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jButton7.setText(turn);
          if(turn.equalsIgnoreCase("X"))
       { jButton7.setForeground(Color.white);
       }
          else
          {
          jButton7.setForeground(Color.black);
          }
          
       turn_determination();
       win_determination();
       Tie();Smartmove();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButton8.setText(turn);
          if(turn.equalsIgnoreCase("X"))
       { jButton8.setForeground(Color.white);
       }
           else
          {
          jButton8.setForeground(Color.black);
          }
         
       turn_determination();
       win_determination();
       Tie();Smartmove();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jButton9.setText(turn);
          if(turn.equalsIgnoreCase("X"))
       { jButton9.setForeground(Color.white);
       }
           else
          {
          jButton9.setForeground(Color.black);
          }
           
       turn_determination();
       win_determination();
       Tie();Smartmove();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        jButton10.setText(turn);
          if(turn.equalsIgnoreCase("X"))
       { jButton10.setForeground(Color.white);
       }
           else
          {
          jButton10.setForeground(Color.black);
          }
           
       turn_determination();
       win_determination();
       Tie();Smartmove();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        jButton11.setText(turn);
          if(turn.equalsIgnoreCase("X"))
       { jButton11.setForeground(Color.white);
      // System.out.print(turn);
       }
           else
          {
          jButton11.setForeground(Color.black);
          }
          
       turn_determination();
       win_determination();
       Tie();Smartmove();
    }//GEN-LAST:event_jButton11ActionPerformed

    /**
     * @param args the command line arguments
     */
     public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
          public void run() {
              new frame().setVisible(true);
            }
        }); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel5;
    private javax.swing.JPanel Panel6;
    private javax.swing.JPanel Panel7;
    private javax.swing.JPanel Panel8;
    private javax.swing.JPanel Panel9;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_base_holder;
    private javax.swing.JLabel score;
    // End of variables declaration//GEN-END:variables


}
