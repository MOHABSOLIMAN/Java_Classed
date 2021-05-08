package iP_cutter;

public class Main {

    public static void main(String[] args) {

        String IPadress = "163.121.12.30";
        IPCutter cut = new IPCutter(IPadress);
        System.out.println(cut.doOperation());



    }
}
