class PascalTriangle {

    // run the pascal
    public static void printPascal(int n) {
        // spacing
        for (int line = 1; line <= n; line++) {
            for (int j = 0; j <= n - line; j++) {

                // spacing
                System.out.print("  ");
            }

			// used to represent C (line, i)
			int choose = 1;
			for (int i = 1; i <= line; i++) {

                // The first value in a line is always 1
                System.out.print(choose + "   ");
                choose = choose * (line - i) / i;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // initialize n var
        int n;

        // while loop to repeat input
        while (true) {
            System.out.println("How many rows do you want to print out (max 20, -1 to exit)?");
            n = In.getInt();

            // if over 20, or break
            if (n > 20) {
                System.out.println("That number is over 20, please try again.");
            } else if (n == -1){
                System.out.println("Exiting...");
                break;
            } else {
                // method
                printPascal(n);
            }
        }
	}
}
