public class avaliacao01{

    public static void main(String[] args) {

        double n1 = 8.5;
        double n2 = 5.4;
        double n3 = 7.7;
        double n4 = 10.5;
        double n5 = 4.0;
        double n6 = 6.9;
        double n7 = 8.8;
        double n8 = 9.9;

        double mediaBimestre1 = (n1 + n2) / 2;
        double mediaBimestre2 = (n3 + n4) / 2;
        double mediaBimestre3 = (n5 + n6) / 2;
        double mediaBimestre4 = (n7 + n8) / 2;


        double semestre1 = (mediaBimestre1 + mediaBimestre2) / 2;
        double semestre2 = (mediaBimestre3 + mediaBimestre4) / 2;
        System.out.println("Resultado Escolar");
        System.out.printf(" 1ª Bimestre: %.2f/n", mediaBimestre1);
        System.out.printf(" 2º Bimestre: %.2f/n", mediaBimestre2);
        System.out.printf(" 1° semestre: %.2f/n", semestre1);


        System.out.printf(" 3º Bimestre: %.2f/n", mediaBimestre3);
        System.out.printf(" 4º Bimestre: %.2f/n", mediaBimestre4);
        System.out.printf(" 2º Semestre: %.2f/n", semestre2);

    }

}


