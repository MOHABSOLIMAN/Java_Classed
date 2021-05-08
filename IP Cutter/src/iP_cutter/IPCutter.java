package iP_cutter;

public class IPCutter {

    public String IPadress;

    public IPCutter(String IPadress) {

        this.IPadress=IPadress;
    }


        public String doOperation() {
            String[] parts = IPadress.split("\\.");

            if (parts.length != 4) {
                return "Error in input";
            } else {

                System.out.print(parts[0] + "\n" + parts[1] + "\n" + parts[2] + "\n" + parts[3]);
            }

            return " \nIPAdress splitted successfully";

        }
}