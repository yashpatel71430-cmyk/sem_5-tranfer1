class UpperCaseCheck {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            boolean isUpper = true;

            for (int j = 0; j < s.length(); j++) {
                if (!Character.isUpperCase(s.charAt(j))) {
                    isUpper = false;
                    break;
                }
            }

            if (isUpper) {
                System.out.println(s);
            } else {
                break;  // lowercase milte hi stop
            }
        }
    }
}