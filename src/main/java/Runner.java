public class Runner {

    public static void main(String[] args) {
        rectangleDemo();
        computerDemo();
        shoppingTrolleyDemo();
    }

    public static void rectangleDemo(){
        System.out.println("----------");
        System.out.println("Running rectangle tasks...");

        // 1. Create a new rectangle object
//        Rectangle rectangle = <INSTANTIATE A NEW RECTANGLE OBJECT HERE>
        Rectangle rectangle = new Rectangle(200, 300);
        Rectangle rectangle2 = new Rectangle(200, 200);

        // 2. Calculate the rectangle's area and store it in a variable
//        int area = <CALL YOUR METHOD HERE>;
        int area = rectangle.getAreaRectangle();
        System.out.println("The rectangle had an area of " + area);


//        System.out.println("The rectangle has an area of " + area);


        // 3. Check if your rectangle is actually a square
//        boolean isRectangle = <CALL YOUR METHOD HERE>
//        System.out.println("Object is a square (true/false): " + isRectangle);
        boolean isRectangle = rectangle2.isRectangleSquare();
        System.out.println("Object is a square: " + isRectangle);

    }

    public static void computerDemo(){
        System.out.println("----------");
        System.out.println("Running computer tasks...");

        // 1. Create a new computer object
//        Computer computer = <INSTANTIATE A NEW COMPUTER OBJECT HERE>
        Computer computer = new Computer(100, null);

        // 2. Use a getter to find out how much storage the computer has
//        int currentStorage = <CALL YOUR METHOD HERE>;
//        System.out.println("Computer has " + currentStorage + "GB storage");

        int currentStorage = computer.getStorage();
        System.out.println("Computer has " + currentStorage + "GB storage");


        // 3. Add more storage to the computer
//        <CALL YOUR METHOD HERE>;
        // We use the getter again to check that the amount of storage has been updated
//        int newStorage = computer.getStorage();
//        System.out.println("Computer now has " + newStorage + "GB storage");

        // 4. Use a setter to update the computer's printer property
//        <CALL YOUR METHOD HERE>
        // Write a getter and use it below to check that the setter worked
//        String currentPrinter = <GETTER>;
//        System.out.println("Computer currently has a " + currentPrinter + " printer connected.");

        // 5. Write a method to print a message.
        // To test this works *without* a printer too you can comment out the code for question 4
//        computer.printMessage("Hello World!");
    }

    public static void shoppingTrolleyDemo(){
        System.out.println("----------");
        System.out.println("Running shopping trolley tasks...");

        // 1. Create a new shopping trolley
//        ShoppingTrolley trolley = <INSTANTIATE A NEW SHOPPINGTROLLEY OBJECT HERE>;

        // 2. Add an item to the trolley
//        <CALL YOUR METHOD HERE>;

        // 3. Count items in the trolley
//        int itemCount = <CALL YOUR METHOD HERE>;
//        System.out.println("The trolley contains " + itemCount + " items.");

        // 4. Check if an item is in the trolley
//        boolean itemInTrolley = <CALL YOUR METHOD HERE>;
//        System.out.println("Object is a square (true/false): " + itemInTrolley);
    }


}
