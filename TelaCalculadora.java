

package projetocalculadora;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaCalculadora extends JFrame implements WindowListener, ActionListener {
    //ATRUBUTOS
    protected JTextField txtDisplay;
    protected JButton btnUm, btnDois, btnTres, btnQuatro, btnCinco, btnSeis,
            btnSete, btnOito, btnNove, btnZero, btnSair, btnLimpar,
            btnSoma, btnSubtracao, btnMultiplicacao, btnDivisao, btnIgual;
    protected Dimension dButton, dButtonFormula, dButtonIgual, dTextField, dFrame;
    protected Formulas form;
    protected int contSomar = 0, contSubtrair = 0, contMulti = 0, contDiv = 0;
    //CONSTRUTOR
    public TelaCalculadora(){
        form = new Formulas();
        dFrame = new Dimension(420,493);
        dButton = new Dimension(57,57);
        dButtonFormula = new Dimension(127,57);
        dButtonIgual = new Dimension(396,57);
        dTextField = new Dimension(396,50);
        this.setTitle("CALCULADORA [+ - * /]");
        this.setResizable(false);
        this.setSize(dFrame);
        this.setLocation(400,200);
        this.setLayout(null);
        //Definir elementos da tela
        //Display
        txtDisplay = new JTextField("");
        txtDisplay.setEditable(false);
        txtDisplay.setSize(dTextField);
        txtDisplay.setLocation(10,5);
        this.add(txtDisplay);
       
        //Botões
        btnUm = new JButton("1");
        btnUm.setSize(dButton);
        btnUm.setLocation(10,67);
        this.add(btnUm);
        btnUm.addActionListener(this);
        
        btnDois = new JButton("2");
        btnDois.setSize(dButton);
        btnDois.setLocation(87,67);
        this.add(btnDois);
        btnDois.addActionListener(this);
        
        btnTres = new JButton("3");
        btnTres.setSize(dButton);
        btnTres.setLocation(164,67);
        this.add(btnTres);
        btnTres.addActionListener(this);
        
        btnQuatro = new JButton("4");
        btnQuatro.setSize(dButton);
        btnQuatro.setLocation(10,144);
        this.add(btnQuatro);
        btnQuatro.addActionListener(this);

        btnCinco = new JButton("5");
        btnCinco.setSize(dButton);
        btnCinco.setLocation(87,144);
        this.add(btnCinco);
        btnCinco.addActionListener(this);
        
        btnSeis = new JButton("6");
        btnSeis.setSize(dButton);
        btnSeis.setLocation(164,144);
        this.add(btnSeis);
        btnSeis.addActionListener(this);

        btnSete = new JButton("7");
        btnSete.setSize(dButton);
        btnSete.setLocation(10,221);
        this.add(btnSete);
        btnSete.addActionListener(this);

        btnOito = new JButton("8");
        btnOito.setSize(dButton);
        btnOito.setLocation(87,221);
        this.add(btnOito);
        btnOito.addActionListener(this);

        btnNove = new JButton("9");
        btnNove.setSize(dButton);
        btnNove.setLocation(164,221);
        this.add(btnNove);
        btnNove.addActionListener(this);

        btnZero = new JButton("0");
        btnZero.setSize(dButton);
        btnZero.setLocation(10,298);
        this.add(btnZero);
        btnZero.addActionListener(this);

        btnSair = new JButton("OFF");
        btnSair.setSize(dButton);
        btnSair.setLocation(87,298);
        this.add(btnSair);
        btnSair.addActionListener(this);
        
        btnLimpar = new JButton("C");
        btnLimpar.setSize(dButton);
        btnLimpar.setLocation(164,298);
        this.add(btnLimpar);
        btnLimpar.addActionListener(this);
        
        btnSoma = new JButton("+");
        btnSoma.setSize(dButtonFormula);
        btnSoma.setLocation(278,67);
        this.add(btnSoma);
        btnSoma.addActionListener(this);
        
        btnSubtracao = new JButton("-");
        btnSubtracao.setSize(dButtonFormula);
        btnSubtracao.setLocation(278,144);
        this.add(btnSubtracao);
        btnSubtracao.addActionListener(this);
        
        btnMultiplicacao = new JButton("X");
        btnMultiplicacao.setSize(dButtonFormula);
        btnMultiplicacao.setLocation(278,221);
        this.add(btnMultiplicacao);
        btnMultiplicacao.addActionListener(this);
                       
        btnDivisao = new JButton("/");
        btnDivisao.setSize(dButtonFormula);
        btnDivisao.setLocation(278,299);
        this.add(btnDivisao);
        btnDivisao.addActionListener(this);
                
        btnIgual = new JButton("=");
        btnIgual.setSize(dButtonIgual);
        btnIgual.setLocation(10,381);
        this.add(btnIgual);
        btnIgual.addActionListener(this);
        
    }

    @Override
    public void windowOpened(WindowEvent we) {
        
    }
    @Override
    public void windowClosing(WindowEvent we) {
      System.exit(0);
    }
    @Override
    public void windowClosed(WindowEvent we) {
    
    }
    @Override
    public void windowIconified(WindowEvent we) {
    
    }
    @Override
    public void windowDeiconified(WindowEvent we) {
        
    }
    @Override
    public void windowActivated(WindowEvent we) {
        
    }
    @Override
    public void windowDeactivated(WindowEvent we) {
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {           
           if(ae.getSource() == btnLimpar){
               txtDisplay.setText(null);
           }
           if(ae.getSource() == btnUm){
               txtDisplay.setText(txtDisplay.getText()+btnUm.getText());
           }
           if(ae.getSource() == btnDois){
               txtDisplay.setText(txtDisplay.getText()+btnDois.getText());
           }
           if(ae.getSource() == btnTres){
               txtDisplay.setText(txtDisplay.getText()+btnTres.getText());
           }
           if(ae.getSource() == btnQuatro){
               txtDisplay.setText(txtDisplay.getText()+btnQuatro.getText());
           }
           if(ae.getSource() == btnCinco){
               txtDisplay.setText(txtDisplay.getText()+btnCinco.getText());
           }
           if(ae.getSource() == btnSeis){
               txtDisplay.setText(txtDisplay.getText()+btnSeis.getText());
           }
           if(ae.getSource() == btnSete){
               txtDisplay.setText(txtDisplay.getText()+btnSete.getText());
           }
           if(ae.getSource() == btnOito){
               txtDisplay.setText(txtDisplay.getText()+btnOito.getText());
           }
           if(ae.getSource() == btnNove){
               txtDisplay.setText(txtDisplay.getText()+btnNove.getText());
           }
           if(ae.getSource() == btnZero){
               txtDisplay.setText(txtDisplay.getText()+btnZero.getText());
           }
           if(ae.getSource() == btnSoma){
               form.setValor1(Integer.parseInt(String.valueOf(txtDisplay.getText())));
               txtDisplay.setText("");
               contSomar = 1;
           }
           if(ae.getSource() == btnSubtracao){                             
               form.setValor1(Integer.parseInt(String.valueOf(txtDisplay.getText())));
               txtDisplay.setText("");
               contSubtrair = 1;
           }
           if(ae.getSource() == btnMultiplicacao){
               form.setValor1(Integer.parseInt(String.valueOf(txtDisplay.getText())));
               txtDisplay.setText("");
               contMulti = 1;
           }
           if(ae.getSource() == btnDivisao){
               form.setValor1(Integer.parseInt(String.valueOf(txtDisplay.getText())));
               txtDisplay.setText("");
               contDiv = 1;
           }
           if(ae.getSource() == btnIgual){ 
               form.setValor2(Integer.parseInt(String.valueOf(txtDisplay.getText())));
               if(contSomar > 0){
                   txtDisplay.setText(null);
                   txtDisplay.setText(String.valueOf(form.somar()));
                   form.setValor1(0);
                   form.setValor2(0);
                   contSomar = 0;
               }if(contSubtrair > 0){
                   txtDisplay.setText(null);
                   txtDisplay.setText(String.valueOf(form.subtrair()));
                   form.setValor1(0);
                   form.setValor2(0);
                   contSubtrair = 0;
               }if(contMulti > 0){
                   txtDisplay.setText(null);
                   txtDisplay.setText(String.valueOf(form.multiplicar()));
                   form.setValor1(0);
                   form.setValor2(0);
                   contMulti = 0;
               }if(contDiv > 0){
                   txtDisplay.setText(null);
                   txtDisplay.setText(String.valueOf(form.dividir()));
                   form.setValor1(0);
                   form.setValor2(0);
                   contDiv = 0;
               }
           }
           if(ae.getSource() == btnSair){
              JOptionPane.showConfirmDialog(null,"Fechando a calculadora?",
                      "Informação",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE);
              System.exit(0);
           }
    }
    
    
}
