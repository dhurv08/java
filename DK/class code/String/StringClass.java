class StringClass {

    public static void main(String args[]) {

        Integer i = new Integer(10);
        

        System.out.println(i);
        System.out.println(i.toString());

        StringClass q = new StringClass();
        System.out.println(q);

        String z = q.toString();
        System.out.println(z);

        int a = 10;
        int b = 20;

        // String Interpolation
        System.out.println(a + b);
        System.out.println(a + b + "Value of a + b = ");
        System.out.println("Value of a + b = " + a + b);
        System.out.println("Value of a + b = " + (a + b));
    }

    public String toString() {
        return "HAHAHHA,";
    }
}
