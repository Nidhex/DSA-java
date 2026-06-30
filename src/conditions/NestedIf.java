package conditions;

public class NestedIf {
    public static void main(String[] args) {

        int age = 20;
        boolean hasLicense = true;

        if(age >= 18) {

            if(hasLicense) {
                System.out.println("Can Drive");
            }
            else {
                System.out.println("Get License First");
            }

        }
        else {
            System.out.println("Too Young");
        }
    }
}