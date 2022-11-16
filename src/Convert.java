import java.util.Scanner;

class Convert {
    public static void main(String[] args) {
        System.out.println("__________________welcome_______________");
        System.out.println("_____________Celsius-Fahrenheit/Fahrenheit-Celsius converter________");
        Scanner sc = new Scanner(System.in);
        System.out.println("choose the conversion mode:");
        System.out.println("1- Celsius-Fahrenheit");
        System.out.println("2- Fahrenheit-Celsius");
        int num = sc.nextInt();
        if ( num == 1 ){
            System.out.println("Please enter the temperature to convert:");
            double C = sc.nextDouble();
            double value_C = (C * 9/5) + 32;
            System.out.println("value °C --------> value °F");
            System.out.println(value_C);

        }

        else if ( num == 2) {
            System.out.println("please enter the temperature to convert");
            double F = sc.nextDouble();
            double value_F = ( F - 32) * 5/9;
            System.out.print("value °F --------> value °C");
            System.out.print(value_F);

        } else { System.out.print("error not a valid choice");



    }
}
}

