import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

public class BottonieInterfaccia {

private String a = null;
private JTextField label;
private String primoNumero ="";
private String secondoNumero ="";
private String risultato ="";
private char x;



public BottonieInterfaccia(){


    JFrame interfaccia = new JFrame();
    interfaccia.setSize(500,500);
    interfaccia.setTitle("Calcolatrice");
    interfaccia.setVisible(true);
    interfaccia.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



    JPanel pannelloNumeri = new JPanel();
    pannelloNumeri.setBackground(Color.WHITE);
    pannelloNumeri.setLayout(new GridLayout(4,4,10,40));



    JPanel pannelloSchermo = new JPanel();
    pannelloSchermo.setBackground(Color.GRAY);




    JButton numero0 = new JButton("0");
    JButton numero1 = new JButton("1");
    JButton numero2 = new JButton("2");
    JButton numero3 = new JButton("3");
    JButton numero4 = new JButton("4");
    JButton numero5 = new JButton("5");
    JButton numero6 = new JButton("6");
    JButton numero7 = new JButton("7");
    JButton numero8 = new JButton("8");
    JButton numero9 = new JButton("9");
    JButton addizione = new JButton("+");
    JButton sottrazione = new JButton("-");
    JButton divisone = new JButton("÷");
    JButton moltiplicazione = new JButton("X");
    JButton uguale = new JButton("=");
    JButton virgola = new JButton(".");

    label = new JTextField(a,20);
    label.setEditable(false);

numero0.addActionListener(new InserimentoNumero());
numero1.addActionListener(new InserimentoNumero());
numero2.addActionListener(new InserimentoNumero());
numero3.addActionListener(new InserimentoNumero());
numero4.addActionListener(new InserimentoNumero());
numero5.addActionListener(new InserimentoNumero());
numero6.addActionListener(new InserimentoNumero());
numero7.addActionListener(new InserimentoNumero());
numero8.addActionListener(new InserimentoNumero());
numero9.addActionListener(new InserimentoNumero());
addizione.addActionListener(new InserimentoNumero());
sottrazione.addActionListener(new InserimentoNumero());
divisone.addActionListener(new InserimentoNumero());
moltiplicazione.addActionListener(new InserimentoNumero());
uguale.addActionListener(new InserimentoNumero());






    pannelloNumeri.add(numero7);
    pannelloNumeri.add(numero8);
    pannelloNumeri.add(numero9);
    pannelloNumeri.add(divisone);
    pannelloNumeri.add(numero4);
    pannelloNumeri.add(numero5);
    pannelloNumeri.add(numero6);
    pannelloNumeri.add(moltiplicazione);
    pannelloNumeri.add(numero1);
    pannelloNumeri.add(numero2);
    pannelloNumeri.add(numero3);
    pannelloNumeri.add(sottrazione);
    pannelloNumeri.add(virgola);
    pannelloNumeri.add(numero0);
    pannelloNumeri.add(uguale);
    pannelloNumeri.add(addizione);


    pannelloSchermo.add(label);


    interfaccia.add(pannelloSchermo, BorderLayout.NORTH);
    interfaccia.add(pannelloNumeri, BorderLayout.CENTER);

}
    private class InserimentoNumero implements ActionListener {

    public void actionPerformed(ActionEvent e) {

            String actionCommand = e.getActionCommand();
            char c = actionCommand.toCharArray()[0];

            if (c>='0' && c <= '9' || c=='.') {

                if (a == null) {
                    primoNumero += e.getActionCommand();
                    label.setText(primoNumero);
                } else{
                    secondoNumero += e.getActionCommand();
                    label.setText(secondoNumero);
                }
            }
            if (c == '+' || c == '-' || c == 'X' || c == '/'){
                a="a";
                x = c;
                label.setText("");

            }
            if (c == '=') {
                int primo = Integer.parseInt(primoNumero);
                int secondo =Integer.parseInt(secondoNumero);
                switch (x){
                    case '+':{risultato=String.valueOf(primo+secondo);}break;
                    case '-':{risultato=String.valueOf(primo-secondo);}break;
                    case 'X':{risultato=String.valueOf(primo*secondo);}break;
                    case '/':{risultato=String.valueOf(primo/secondo);}break;
                }
                label.setText(risultato);
                primoNumero=risultato;
                secondoNumero="";



            }






        }
    }

        public static void main(String[] args) {
            BottonieInterfaccia win = new BottonieInterfaccia();

        }
    }





