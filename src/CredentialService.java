import java.util.Random;

public class CredentialService {
    private static final String COMPANY_NAME = "company.com";
    private static final String[] DEPARTMENTS = {"Technical", "Admin", "Human Resource", "Legal"};

    public static String generatePassword() {
        String passwordCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+";
        StringBuilder password = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(passwordCharacters.length());
            password.append(passwordCharacters.charAt(index));
        }

        return password.toString();
    }

    public static String generateEmailAddress(Employee employee, String department) {
        String email = employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase() +
                "@" + department.toLowerCase() + "." + COMPANY_NAME;
        return email;
    }

    public static void showCredentials(Employee employee, String department, String password, String email) {
        System.out.println("Credentials for " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Department: " + department);
    }
}