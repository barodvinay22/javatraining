package AssignmentSep17;

    public static void CalculatorMain(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 1 and 2         : " + calc.add(1, 2));
        System.out.println("Sum of 1, 2 and 3      : " + calc.add(1, 2, 3));
        System.out.println("Sum of 1, 2, 3 and 4   : " + calc.add(1, 2, 3, 4));
    }
}

