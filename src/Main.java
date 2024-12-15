public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87; //рост, м
        double weight = 98; //вес, кг
        double bmi = service.calculate(height, weight);
        System.out.println(bmi);
    }
}