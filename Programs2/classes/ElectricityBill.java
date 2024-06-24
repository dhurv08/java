package Programs2.classes;

public class ElectricityBill {
    static class User {
        private int id;
        private String name;
        private String houseNO;

        User(int id, String name, String houseNO) {
            this.id = id;
            this.name = name;
            this.houseNO = houseNO;
        }

        void printData() {
            System.out.println("User ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("House Number: " + houseNO);
        }
    }

    public static void main(String[] args) {
        User u1 = new User(716, "dk", "jalandhar");
        User u2 = new User(727, "kd", "jalandhar");

        // Printing user data
        System.out.println("User 1:");
        u1.printData();
        System.out.println("\nUser 2:");
        u2.printData();
    }
}
