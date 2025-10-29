public class CompanySign {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error: Please provide exactly two arguments.");
            System.out.println("Usage: java CompanySign <CompanyName> <City>");
            return;
        }

        String company = args[0];
        String city = args[1];

        System.out.println(company + " Technologies " + city);
    }
}
