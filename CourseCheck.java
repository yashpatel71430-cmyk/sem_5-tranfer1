// Custom Exception class
class InvalidCourseException extends Exception {
    public InvalidCourseException(String message) {
        super(message);
    }
}

public class CourseCheck {
    public static void main(String[] args) {

        // Allowed courses
        String[] allowedCourses = {"BCA", "MCA", "BBA", "MBA", "OTHER"};

        try {
            // Check if exactly 5 arguments are provided
            if (args.length != 5) {
                throw new Exception("Please provide exactly 5 command-line arguments");
            }

            // Validate each argument
            for (String course : args) {
                boolean valid = false;

                for (String allowed : allowedCourses) {
                    if (course.equals(allowed)) {
                        valid = true;
                        break;
                    }
                }

                if (!valid) {
                    throw new InvalidCourseException("Invalid course found: " + course);
                }
            }

            System.out.println("All command-line arguments are valid.");

        } catch (InvalidCourseException e) {
            System.out.println("Custom Exception Raised: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
