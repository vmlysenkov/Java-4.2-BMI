public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double bmiOfMyDog = service.calculate(29, 0.71);
        System.out.println("BMI:" +bmiOfMyDog);

        double bmiOfMyWife = service.calculate(50, 1.7);
        System.out.println("BMI:" +bmiOfMyWife);

        double bmiOfMyself = service.calculate(70, 1.85);
        System.out.println("BMI:" +bmiOfMyself );
    }
}
