public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng User
        User user = new User("John Doe", 25, "john.doe@example.com");
        System.out.println("User Information:");
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Email: " + user.getEmail());

        // Chạy các phương thức của lớp Time
        System.out.println("\nTime Calculations:");
        int minutes = 90;
        System.out.println(minutes + " minutes is " + Time.convertMinutesToHours(minutes) + " hours.");

        long startTime = Time.getCurrentTime();
        try {
            Thread.sleep(2000); // Giả lập độ trễ 2 giây
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = Time.getCurrentTime();
        System.out.println("Time difference in seconds: " + Time.timeDifferenceInSeconds(startTime, endTime));

        // Chạy các phương thức của lớp Recursion
        System.out.println("\nRecursion Examples:");
        int number = 5;
        System.out.println("Factorial of " + number + " is " + Recursion.factorial(number));

        int fibIndex = 7;
        System.out.println("Fibonacci number at index " + fibIndex + " is " + Recursion.fibonacci(fibIndex));

        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Sum of array elements is " + Recursion.sumArray(array, 0));
    }
}