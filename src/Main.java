public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int bmiOfMyDog = service.calculate(29, 0.71);
        System.out.println("BMI:" +bmiOfMyDog);

        int bmiOfMyWife = service.calculate(50, 1.7);
        System.out.println("BMI:" +bmiOfMyWife);

        int bmiOfMyself = service.calculate(70, 1.85);
        System.out.println("BMI:" +bmiOfMyself);
    }
}
