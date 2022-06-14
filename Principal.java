package br.edu.iftm.javaempresax.testes;

import br.edu.iftm.javaempresax.classes.Departamento;
import br.edu.iftm.javaempresax.classes.Empregado;
import br.edu.iftm.javaempresax.classes.Projeto;

import java.util.Date;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        /*Empregado empregado01 = new Empregado();
        empregado01.setCodigo(1);
        empregado01.setNome("Mariana");
        empregado01.setSexo('F');

        Date dataInicio = new Date();

        Departamento d = new Departamento(1,"Pesquisa",1, dataInicio);

        empregado01.setDepartamento(d);

        Projeto p = new Projeto(1,"Transmogrifador", d);

        System.out.println(empregado01);
        System.out.println(p);*/

        Scanner teclado = new Scanner(System.in);

        Projeto[] vetorDeProjetos = new Projeto[5];
        
        Departamento[] vetorDeDepto = new Departamento[5];

        Empregado[] vetorEmp = new Empregado[5];

        int countProjetos = 0;

        int contDepto = 0;

        int contadorEmp = 0;

        int opcao = 0;
        do {
            System.out.println("\nMenu");
            System.out.println("1 - Cadastrar Projetos");
            System.out.println("2 - Imprimir Todos os Projetos");
            System.out.println("3 - Cadrastrar funcionario");
            System.out.println("4 - Imprimir Funcionario");
            System.out.println("5 - Cadastrar Departamento");
            System.out.println("6 - Imprimir Departamento");;
            System.out.println("0 - Sair");
            System.out.print("Digite uma opcao: ");
            opcao = teclado.nextInt();

            switch (opcao){
                case 1:
                    if(countProjetos <= 5){

                    
                        System.out.print("Digite o codigo do Projeto: ");
                        int codigoProj = teclado.nextInt();
                        System.out.print("Digite o nome do Projeto: ");
                        String nomeProj = teclado.next();
                        
                        Projeto p = new Projeto(codigoProj,nomeProj, null);
                        vetorDeProjetos[countProjetos] = p;
                        countProjetos++;
                        break;
                    }else{
                        System.out.println("Vetor de projeto esta cheio");
                    }

                case 2:
                    for(Projeto obj : vetorDeProjetos){
                        if (obj != null){
                            System.out.println(obj);
                        }
                    }
                    break;

                case 3:
                    if (contadorEmp < 5) {
                        System.out.print("Digite o codigo do empregado: ");
                        int codiogoEmp = teclado.nextInt();
                        System.out.print("Digite o nome do empregado: ");
                        String nomeEmp = teclado.next();
                        //System.out.println("Digite a data de nascimento do funcionario: ");
                       //String dataNasc = teclado.next();
                        System.out.println("Digite o endereço do empregado: ");
                        String endereco = teclado.next();
                        System.out.println("Digite o sexo do empregado: ");
                        char sexo = teclado.nextLine().charAt(0);
                        System.out.println("Digite o salário do empregado: ");
                        Double salario = teclado.nextDouble();
                        System.out.println("Digite Codigo do Supervisor: ");
                        int codSuperv = teclado.nextInt();
                        System.out.println("Digite Codigo do departamento: ");
                        int codDepto = teclado.nextInt();

                        Empregado emp = new Empregado(codiogoEmp ,nomeEmp, new Date(), endereco, sexo, 
                        salario, codSuperv, codDepto, null);

                        vetorEmp[contadorEmp] = emp;
                        contadorEmp++; 

                    }else{
                        System.out.println("Vetor empregado esta cheio");
                    }
                    break;
            
                case 4:
                    for(Empregado emp : vetorEmp){
                        if (emp != null) {
                            System.out.println(emp);
                        }
                    }

                case 5:
                    System.out.println("Digite o codigo do departamento: ");
                    int CodDepto = teclado.nextInt();
                    System.out.println("Digite o nome do departamento: ");
                    String NomeDepto = teclado.next();
            
            
            
            
            
            
            
            
            
            }



        } 

        while (opcao != 0);

    }
}