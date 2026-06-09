// User-defined Exception
class EmployeeNotFoundException extends Exception {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}

class EmployeeCheck1 {
    public static void main(String[] args) {

        String[] employees = {"RAM", "SHYAM", "MOHAN", "RITA"};
        String searchEmployee = "ANITA";   // name to check
        boolean found = false;

        try {
            for (String emp : employees) {
                if (emp.equals(searchEmployee)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                throw new EmployeeNotFoundException(
                    "Employee not found in the list!"
                );
            }

            System.out.println("Employee exists in the list.");

        } catch (EmployeeNotFoundException e) {
            System.out.println("Exception Caught: " + e.getMessage());

        } finally {
            System.out.println("Employee search operation completed.");
        }
    }
}