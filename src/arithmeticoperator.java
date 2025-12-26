public class arithmeticoperator {
    public static void main(String[] args) {

        double maria = 10.10;
        double joao = 15.30;
        double pedro = 25.60;
        double severina = 25.76;
        double estevao = 55.91;
        int monthlyValue = 30;
        double descont = 32;
        double installments = 2;

        double texPayers = maria + joao + pedro + severina + estevao;
        double totalMonthlyValue = texPayers * monthlyValue;
        double totalDescont = texPayers - descont;
        double totalValueToPay = totalDescont / installments;

        System.out.println("Total of Texpayers $ = " + texPayers );
        System.out.println("Total Monthly Value $ = " + totalMonthlyValue);
        System.out.println("Value after Desconts $ = " + totalDescont);
        System.out.println("Total Value to Pay $ = " + totalValueToPay);



    }
}
