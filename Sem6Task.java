import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sem6Task {
    public Sem6Task(){
    
        class LaptopShop{
        private static List<Laptop> allLaptops = new ArrayList<>();
    
        public static void addLaptop(String name, double price, int ram, int ssd, double width){
            allLaptops.add(new Laptop(name, price, ram, ssd, width));
    }
    
    private static List Laptop> filter(String argsString){
        String[] argsList = argsString.split(" ");
        double price = Double.parseDouble(argsList[0]);
        int ram = Integer.parseInt(argsList[1]);
        int ssd = Integer.parseInt(argsList[2]);
        double width = Double.parseDouble(argsList[3]);
        return filter(price, ram, ssd, width);
    }
    
    private static List<Laptop> filter(double price, int ram, int ssd, double width){
        List<Laptop> filteredLaptops = new ArrayList<>(allLaptops);
        filteredLaptops.removeIf(o -> o.getPrice() > price);
        filteredLaptops.removeIf(o -> o.getRam() < ram);
        filteredLaptops.removeIf(o -> o.getSsd() < ssd);
        filteredLaptops.removeIf(o -> o.getWidth() < width);
        return filteredLaptops;
    }
    
    public static void run(){
        System.out.println("Welcome to the LaptopShop\n");
        
        double maxPrice = Double.MAX_VALUE;
        int minRam = 0;
        int minSsd = 0;
        double minWidth = 0;
        
        
        String command;
        List<Laptop> result;
        
        Scanner scanner = new Scanner(System.in);
        while(true){
            printMenu();
            command = scanner.next();
            if(command.equals("0")){
                result = filter(maxPrice, minRam, minSsd, minWidth);
                result.forEach(System.out::println);
                break;
            }
            System.out.println("Enter the value:");
            switch(command){
                case "1":
                    maxPrice = scanner.nextDouble();
                    break;
                case "2":
                    minRam = scanner.nextInt();
                    break;
                case "3":
                    minSsd = scanner.nextInt();
                    break;
                case "4":
                    minWidth = scanner.nextDouble();
                    break;
            }
        }    
    }
    
    private static void printMenu(){
        System.out.println("Please enter the command:");
        System.out.println("0 -> print result\n");
        System.out.println("1 -> set max price\n");
        System.out.println("2 -> set min RAM\n");
        System.out.println("3 -> set min SSD\n");
        System.out.println("4 -> set min width\n");
    }
    
    static class Laptop{
        private final String name;
        private double price;
        private final int ram;
        private final int ssd;
        private final double width;
        
        public String getName(){return name;}
        public double getPrice(){return price;}
        public void setPrice(int price){this.price = price;}
        public int getRam(){return ram;}
        public int getSsd(){return ssd;}
        public double getWidth(){return width;}
        
        public Laptop(String name, double price, int ram, int ssd, double width){
            this.name = name;
            this.price = price;
            this.ram = ram;
            this.ssd = ssd;
            this.width = width;
        }
        
        @Override
        public String toString(){
            return String.format("Name: %s, price: %.2f$, RAM: %dgb, SSD: %dgb, width: %.2f\"",
            name, price, ram, ssd, width);
        }
    }
}
}
}
