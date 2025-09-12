import myFolder.FolderClass;

class Access extends FolderClass {
    public static void main(String args[]) {
        Access obj = new Access();
        obj.functionInFolderClass();

        ABC obj1 = new ABC();
        obj1.functionInABC();

        FinalKeyword obj3 = new FinalKeyword();
        obj3.finalNycFunction();
    }
}

class ABC {
    private void functionInABC() {
        System.out.println("Inside ABC");
    }
}