package org.example;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Calculadora extends JFrame {
    private JPanel Panel;
    private JPanel txtPantalla;
    private JTextField text;
    private JButton b7, b8, b9, b4, b5, b6, b1, b2, b3, b0, del, ac, div, times, sum, min, ans, equals,po;
    private JPanel nums;

    private double numero1;
    private double numero2;
    private String signo;
    private double resultado;
    private boolean equalsActive;
    private double residuo;
    public Calculadora() {

        pack();
        setTitle("Calculadora");
this.equalsActive = false;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100, 100, 650, 300);//dimensiones adecuadas, porque si no los numeros grandes se salen de la pantalla
        setBackground(new Color(224, 255, 254));
            Panel.setBorder(new EmptyBorder(5,5,5,5));// para que se centre más o menos porque si no se ve fatal
        add(Panel); // no se debe de olvidar porque luego no muestra nada
        setVisible(true);
//        text.setText("0");
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (text.getText().equalsIgnoreCase("÷") || text.getText().equalsIgnoreCase("x") || //algo innovador para que a la hora de que presione otro boton este se esfume
                        text.getText().equalsIgnoreCase("+") || text.getText().equalsIgnoreCase("-")) {
                    text.setText("");
                }
                String num = text.getText() + b0.getText(); //concatenar para simplificar
                text.setText(num);//sobreescribe el textfield
            }
        });
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (text.getText().equalsIgnoreCase("÷") || text.getText().equalsIgnoreCase("x") ||
                        text.getText().equalsIgnoreCase("+") || text.getText().equalsIgnoreCase("-")) {
                    text.setText("");
                }
                String num = text.getText() + b1.getText();
                text.setText(num);
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (text.getText().equalsIgnoreCase("÷") || text.getText().equalsIgnoreCase("x") ||
                        text.getText().equalsIgnoreCase("+") || text.getText().equalsIgnoreCase("-")) {
                    text.setText("");
                }
                String num = text.getText() + b2.getText();
                text.setText(num);
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (text.getText().equalsIgnoreCase("÷") || text.getText().equalsIgnoreCase("x") ||
                        text.getText().equalsIgnoreCase("+") || text.getText().equalsIgnoreCase("-")) {
                    text.setText("");
                }
                String num = text.getText() + b3.getText();
                text.setText(num);
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {if (text.getText().equalsIgnoreCase("÷") || text.getText().equalsIgnoreCase("x") ||
                    text.getText().equalsIgnoreCase("+") || text.getText().equalsIgnoreCase("-")) {
                text.setText("");
            }
                String num = text.getText() + b4.getText();
                text.setText(num);
            }
        });
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (text.getText().equalsIgnoreCase("÷") || text.getText().equalsIgnoreCase("x") ||
                        text.getText().equalsIgnoreCase("+") || text.getText().equalsIgnoreCase("-")) {
                    text.setText("");
                }
                String num = text.getText() + b5.getText();
                text.setText(num);
            }
        });
        b6.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (text.getText().equalsIgnoreCase("÷") || text.getText().equalsIgnoreCase("x") ||
                        text.getText().equalsIgnoreCase("+") || text.getText().equalsIgnoreCase("-")) {
                    text.setText("");
                }
                String num = text.getText() + b6.getText();
                text.setText(num);
            }
        });
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (text.getText().equalsIgnoreCase("÷") || text.getText().equalsIgnoreCase("x") ||
                        text.getText().equalsIgnoreCase("+") || text.getText().equalsIgnoreCase("-")) {
                    text.setText("");
                }
                String num = text.getText() + b7.getText();
                text.setText(num);
            }
        });
        b8.addActionListener(e -> {
            if (text.getText().equalsIgnoreCase("÷") || text.getText().equalsIgnoreCase("x") ||
                    text.getText().equalsIgnoreCase("+") || text.getText().equalsIgnoreCase("-")) {
                text.setText("");
            }
            String num = text.getText() + b8.getText();
            text.setText(num);
        });
        b9.addActionListener(e -> {
            if (equalsActive){
                text.setText("");
                equalsActive = false;
            }
            if (text.getText().equalsIgnoreCase("÷") || text.getText().equalsIgnoreCase("x") ||
                    text.getText().equalsIgnoreCase("+") || text.getText().equalsIgnoreCase("-")) {
                text.setText("");
            }
            String num = text.getText() + b9.getText();
            text.setText(num);
        });
        po.addActionListener(e -> {
            if (text.getText().equalsIgnoreCase("÷") || text.getText().equalsIgnoreCase("x") ||
                    text.getText().equalsIgnoreCase("+") || text.getText().equalsIgnoreCase("-")) {
                text.setText("");
            }

//            if (text.getText().contains(".")){
//
//            }
//            else { Ineficiente
//                    String num = text.getText()+po;
//                    text.setText(num);
//                }
            String num = text.getText();
            if(!text.getText().contains(".")){//tarde un rato en razonarlo, no me acordaba del contains
                num += po.getText();
                text.setText(num);
            }
        });
        del.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                String a = "hola como estas";
//                StringBuilder f = new StringBuilder(a);
//                int i = a.length()-1;
//                f.deleteCharAt(i);
//                a = f.toString();
//                System.out.println(a);
                String num = text.getText();
                StringBuilder numcon = new StringBuilder(num);//La segunda vez utilizandolo y no se como se utiliza exactamente, pero funciona
                int i = num.length()-1;//Se intento con un for, pero era redundante y me eliminaba todo
                numcon.deleteCharAt(i);//Un metodo que curiosamente elimina el caracter que quieras
                num = numcon.toString();
                text.setText(num);
            }
        });
        ac.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text.setText(""); //elimina todo
            }
        });
        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(text.getText());
                if (text.getText().equalsIgnoreCase("x") ||
                        text.getText().equalsIgnoreCase("+") || text.getText().equalsIgnoreCase("-")) {
                    text.setText("");
                }
                signo = "÷";// se guarda para el switch case
                text.setText("÷");
            }
        });
        times.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                numero1 = Double.parseDouble(text.getText());
                if (text.getText().equalsIgnoreCase("÷") || text.getText().equalsIgnoreCase("x") ||
                        text.getText().equalsIgnoreCase("-")) {
                    text.setText("");
                }
                signo = "x";
            text.setText("x");
            }
        });
        sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(text.getText());
                if (text.getText().equalsIgnoreCase("÷") || text.getText().equalsIgnoreCase("x") ||
                        text.getText().equalsIgnoreCase("-")) {
                    text.setText("");
                }
                signo = "+";
                         text.setText("+");}
        });
        min.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1 = Double.parseDouble(text.getText());

                if (text.getText().equalsIgnoreCase("÷") || text.getText().equalsIgnoreCase("x") ||
                        text.getText().equalsIgnoreCase("+" ))  {
                    text.setText("");
                }
                signo = "-";
                text.setText("-");
            }
        });
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (signo){//Sé que podría haber utilizado un enumerador, pero aún no me queda claro
                    case "÷" -> {
                        numero2 = Double.parseDouble(text.getText());
                        resultado = numero1 /numero2;
                        if (String.valueOf(resultado).length()>8) {
                            DecimalFormat format = new DecimalFormat("############.######");//Lo busque en internet para averiguar si se podía reducir decimales,
                            double resultadoF = Double.parseDouble(format.format(resultado));// y con ayuda de chatgpt
                            text.setText(String.valueOf(resultadoF));
                            equalsActive = true;
                        }else {
                        text.setText(String.valueOf(resultado));
                    }}


                    case "x" -> //No sé porque me sugirió ponerle una flecha lambda, pero funciona
                         {
                        numero2 = Double.parseDouble(text.getText());
                        if (String.valueOf(resultado).length()>8) {
                            DecimalFormat format = new DecimalFormat("############.######");
                            double resultadoF = Double.parseDouble(format.format(resultado));
                            text.setText(String.valueOf(resultadoF));
                            equalsActive = true;
                        } else{
                        resultado = numero1 *numero2;
                        text.setText(String.valueOf(resultado));

                    }}

                    case "+" ->{
                        numero2 = Double.parseDouble(text.getText());
                        resultado = numero2 +numero1;
                        if (String.valueOf(resultado).length()>8) {
                            DecimalFormat format = new DecimalFormat("############.######");
                            double resultadoF = Double.parseDouble(format.format(resultado));
                            text.setText(String.valueOf(resultadoF));
                            equalsActive = true;
                        }else {
                        text.setText(String.valueOf(resultado));
                        equalsActive = true;
                    }}
                    case "-" ->{
                        numero2 = Double.parseDouble(text.getText());
                        resultado = numero1 -numero2;
                        if (String.valueOf(resultado).length()>8) {
                            DecimalFormat format = new DecimalFormat("############.######");
                            double resultadoF = Double.parseDouble(format.format(resultado));
                            text.setText(String.valueOf(resultadoF));
                            equalsActive = true;
                        }else {
                        text.setText(String.valueOf(resultado));
                    }}



                }

            }
        });
        ans.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(String.valueOf(resultado));//Este esta chistoson
            }
        });

    }



    public static void main(String[] args) {
    new Calculadora();
    }
}
