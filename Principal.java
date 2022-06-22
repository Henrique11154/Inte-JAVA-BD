package br.edu.iftm.javaempresaX.Teste;

import br.edu.iftm.javaempresaX.classes.Departamento;
import br.edu.iftm.javaempresaX.classes.Empregado;
import br.edu.iftm.javaempresaX.classes.Projeto;

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

        Empregado[] vetorEmp = new Empregado[5];

        Departamento[] vetordep = new Departamento[5];
        
        int countProjetos = 0;

        int countEmp = 0;

        int countDep = 0;



        int opcao = 0;
        do {
            System.out.println("Menu");
            System.out.println("1 - Cadastrar Projetos");
            System.out.println("2 - Imprimir Todos os Projetos");
            System.out.println("3 - Cadastrar empregado");
            System.out.println("4 - Imprimir Todos os empregados ");
            System.out.println("5 - Cadastrar departamento");
            System.out.println("6 - Imprimir Todos os departamentos");
            System.out.println("0 - Sair");
            System.out.print("Digite uma opcao: ");
            opcao = teclado.nextInt();

            switch (opcao){
                case 1:
                if(countProjetos < 5){
                    System.out.println("Digite o codigo do Projeto: ");
                    int codigo = teclado.nextInt();
                    System.out.println("Digite o nome do Projeto: ");
                    String nome = teclado.next();
                    Projeto p = new Projeto(codigo, nome, null);
                    vetorDeProjetos[countProjetos] = p;
                    //vetorDeProjetos[countProjetos] = new Projeto(codigo,nome,null);
                    countProjetos++;
                }else{
                    System.out.println("Vetor de projeto está cheio");
                }
                    break;
                case 2:
                    for (Projeto obj: vetorDeProjetos) {
                        if(obj != null){
                            System.out.println(obj);
                        }  
                    }
                    break;
                case 3:
                    if(countEmp < 5){
                        System.out.println("Digite o codigo do empregado: ");
                        int codigoEmp = teclado.nextInt();
                        System.out.print("Digite o nome do empregado: ");
                        String nomeEmp = teclado.next();
                        //System.out.println("Digite a data do empregado");
                        //Data dataEmp = teclado.ne();
                        System.out.println("Digite o endereço: ");
                        String enderecoEmp = teclado.next();
                        System.out.println("Digite o sexo: ");
                        String sexoEmp = teclado.next();
                        System.out.print("Digite o salario: ");
                        Double salarioEmp = teclado.nextDouble();
                        System.out.print("Digite o codigo do supervisor");
                        int codSuper = teclado.nextInt();
                        System.out.print("Digite codigo do departamento");
                        int codDep = teclado.nextInt();
                        Empregado e = new Empregado(codigoEmp, nomeEmp, new Date(), enderecoEmp, sexoEmp, salarioEmp, codSuper, null);
                        vetorEmp[countEmp] = e;
                        countEmp++;
                    }else{
                        System.out.println("Vetor de empregado está cheio");
                    }
                        break;
                case 4:
                    for (Empregado emp: vetorEmp) {
                        if(emp != null){
                            System.out.println(emp);
                        }
                    }
                    break;
                case 5:
                if(countDep < 5){
                    System.out.println("Digite o codigo do departamento: ");
                    int coddep = teclado.nextInt();
                    System.out.println("Digite o nome do departamento: ");
                    String nomedep = teclado.next();
                    System.out.println("Digite o codigo do gerente: ");
                    int codgerente = teclado.nextInt();
                    //System.out.println("Digite a data do gerente: ");
                    //int datagerente = teclado.nextInt();
                    Departamento d = new Departamento(coddep,nomedep, codgerente, new Date());
                    vetordep[countDep] = d;
                    countDep++;
                }else{
                    System.out.println("Vetor de departamento está cheio");
                }
                    break;
                case 6:
                    for (Departamento dep: vetordep) {
                        if(dep != null){
                            System.out.println(dep);
                        }
                        
                    }
                }

        } while (opcao != 0);

    teclado.close();
    }
    
}
