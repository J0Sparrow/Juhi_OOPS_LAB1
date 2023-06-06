public class Main {
    public static void main(String[] args) {
        String firstName = "Abhinav";
        String lastName = "Kumar";
        String department = "FullStackDeveloper";

        Employee employee = new Employee(firstName, lastName);
        String password = CredentialService.generatePassword();
        String email = CredentialService.generateEmailAddress(employee, department);

        CredentialService.showCredentials(employee, department, password, email);
    }
}