package br.com.fiap;

public class Imc {

    private double height;
    private double weight;

    public Imc() {
    }

    public Imc(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getAltura() {
        return this.height;
    }

    public void setAltura(double altura) {
        this.height = altura;
    }

    public double getPeso() {
        return this.weight;
    }

    public void setPeso(double weight) {
        this.weight = weight;
    }

    public void calcular() {
        double imc = this.weight / (this.height * this.height);
        System.out.printf("IMC: %.2f \n", imc);
        if(imc > 18.5 && imc < 25) {
            System.out.println("Legal, seu peso está NORMAL!!!");
        }else if(imc >= 25 && imc < 30) {
            System.out.println("Opa, você está com SOBREPESO!!!");
        }else if(imc >= 30 && imc < 35) {
            System.out.println("Amigão, e aí? OBESIDADE GRAU I!!!");
        }else if(imc >= 35 && imc < 40) {
            System.out.println("As coisas estão complicadas, você está com OBESIDADE GRAU II!!!");
        }else if(imc >= 40) {
            System.out.println("Pô, OBESIDADE GRAU III? Agora complicou muito :(");
        }else{
            System.out.println("Vamos se alimentar corretamente! Você está ABAIXO DO PESO");
        }
    }
}
