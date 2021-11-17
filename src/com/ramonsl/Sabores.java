package com.ramonsl;

import java.util.Objects;
import java.util.Scanner;

public class Sabores {
    String sabor;
    double valor;
    boolean alergia;
    Scanner tc= new Scanner(System.in);
    public void ler(){
        System.out.println("Digite o Sabor");
        sabor=tc.next();
        System.out.println("Digite o valor");
        valor=tc.nextDouble();
        System.out.println("Contem produtos alergicos");
        String ok= tc.next();
        if(ok.equals("sim")){
            alergia= true;
        }

    }
    public Sabores(){
        System.out.println("Digite o Sabor");
        sabor=tc.next();
        System.out.println("Digite o valor");
        valor=tc.nextDouble();
        System.out.println("Contem produtos alergicos");
        String ok= tc.next();
        if(ok.equals("sim")){
            alergia= true;
        }
    }
    public Sabores(String sabor){
        this.sabor=sabor;
    }

    public void mostrar(){
        System.out.println("Sabor:"+this.sabor); //00056
        System.out.println("Valor:"+this.valor);
        if (this.alergia){
            System.out.println("Alergia : sim" );
        }else{
            System.out.println("Alergia : não" );
        }
        System.out.println("-------------------");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sabores sabores = (Sabores) o;
        return Objects.equals(sabor, sabores.sabor);
    }


}
