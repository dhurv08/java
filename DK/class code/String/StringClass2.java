class StringClass2 {

    public static void main(String args[]) {

        String a = "Hello";
        // System.out.println(a.hashCode());
        // a = a + "World";
        // System.out.println(a.hashCode());
        // System.identityHashCode();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i <10000; i++) {
            a = a + "World";
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + "ms");

        startTime = System.currentTimeMillis();
        //String Buffer-Synchronized - operations step by step
        StringBuffer sb = new StringBuffer("Hello");
        for (int i=0; i<10000; i++) { 
            sb.append("World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by Concating with StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");

        startTime = System.currentTimeMillis();
        //String Builder-Asynchronized - operations side by side
        StringBuilder sbb = new StringBuilder("Hello");
        for (int i=0; i<10000; i++){ 
            sbb.append("World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by Concating with StringBuilder: "+(System.currentTimeMillis()-startTime)+"ms");
    }
}