package com.ramonsl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int op=0;
        ArrayList<Sabores> arraySabores= new ArrayList<>();
                 /// 00056
        Scanner tc = new Scanner(System.in);

        do {
            System.out.println("Sabores cadastrados: "+arraySabores.size());
            System.out.println("1: Cadastrar sabores");
            System.out.println("2: Exibir sabores");
            System.out.println("3: Encontrar sabores");
            System.out.println("4: Atualizar sabores");
            System.out.println("5: Listar sabores sem alergia");
            System.out.println("6: Remover sabores");
            op= tc.nextInt();


            switch (op){
                 case 1: {
                     Sabores sabor= new Sabores();
                     if(arraySabores.add(sabor)){//00056
                         System.out.println("sabor cadastrado");
                         sabor.mostrar();
                     }else{
                         System.out.println("sabor não cadastrado");
                     }
                     break;
                 }
                 case 2:{
                     if(arraySabores.isEmpty()){
                         System.out.println("sabores não cadastrados");
                     }else{
                         for (int i=0;i<arraySabores.size();i++){
                             arraySabores.get(i).mostrar();
                            // Sabores s = arraySabores.get(i);
                           //  s.mostrar();
                         }
                     }

                     break;
                 }
                 case 3: {
                     String sabor=tc.next();
                     Sabores busca = new Sabores(sabor);
                     if (arraySabores.contains(busca)) {
                         System.out.println("Sabor já cadastrado");
                         System.out.println("Posição:"+arraySabores.indexOf(busca));
                     }else{
                         System.out.println("Sabor não encontrado");
                     }
                     break;
                 }

                case 4: {
                    String sabor=tc.next();
                    Sabores busca = new Sabores(sabor); //0065
                    if (arraySabores.contains(busca)) {
                        busca.mostrar();
                        int i=arraySabores.indexOf(busca);
                        busca = arraySabores.get(i);//0070
                        //busca= //0070
                        busca.mostrar();
                        busca.ler();
                         //arraySabores.set(i,busca);
                    }else{
                        System.out.println("Sabor não encontrado");
                    }
                    break;
                }
                case 5: {
                    for (int i = 0; i < arraySabores.size(); i++) {
                        if (!arraySabores.get(i).alergia){
                            arraySabores.get(i).mostrar();
                        }
                    }

                }
                case 6: {
                    String sabor=tc.next();
                    Sabores busca = new Sabores(sabor);
                    if (arraySabores.contains(busca)) {
                      arraySabores.remove(busca);
                      System.out.println(busca.sabor+" removido");
                    }else{
                        System.out.println("Sabor não encontrado");
                    }
                    break;
                }
             }


        }while(op!=99);
    }
}
