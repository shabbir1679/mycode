class groovytut{
    static void main(args) {
        println("hello groovy");

        def randString = "Random";

        println("A $randString string");

        printf("A %s string \n", randString);

        printf("%-10s %d %.2f %10s \n",
        ['stuff', 10, 1.2, 'Random']);

        print("whats your name");
        def fname = System.console().readLine();
        println("Hello " + fname);


        print("Enter a number ");
        def num1 = 
        System.console().readLine().toDouble();
        print("Enter a number ");
        def num2 = 
        System.console().readLine().toDouble();

        printf("%.2f + %.2f = %.2f \n", [num1, num2, (num1 + num2)]);
    }
}