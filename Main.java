import java.util.*;
class Car 
{
    private int id;
    private String brand;
    private String model;
    private int year;
    private double price;

    public Car(int id, String brand, String model, int year, double price) 
    {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public void displayCar() 
    {
        System.out.println("ID: " + id + " | Brand: " + brand + " | Model: " + model + " | Year: " + year + " | Price: $" + price);
    }
}
    private static void addSampleData() 
    {
        carList.add(new Car(nextId++, "Toyota", "Camry", 2020, 25000.00));
        carList.add(new Car(nextId++, "Honda", "Civic", 2021, 22000.00));
        carList.add(new Car(nextId++, "Ford", "Focus", 2019, 18000.00));
    }

    private static void showMenu() 
    {
        System.out.println("\n--- Car Management Menu ---");
        System.out.println("1. Add New Car");
        System.out.println("2. View All Cars");
        System.out.println("3. Update Car");
        System.out.println("4. Delete Car");
        System.out.println("5. Search Car");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }
    
    private static int getChoice() 
    {
        try 
        {
            return Integer.parseInt(input.nextLine());
        } 
        catch (NumberFormatException e) 
        {
            return -1;
        }
    }

    private static void addCar() 
    {
        System.out.println("\n Add New Car ");
        
        System.out.print("Enter car brand: ");
        String brand = input.nextLine();
        
        System.out.print("Enter car model: ");
        String model = input.nextLine();
        
        System.out.print("Enter car year: ");
        int year = Integer.parseInt(input.nextLine());
        
        System.out.print("Enter car price: ");
        double price = Double.parseDouble(input.nextLine());
        
        Car newCar = new Car(nextId++, brand, model, year, price);
        carList.add(newCar);
        
        System.out.println("Car added successfully!");
    }

    private static void viewAllCars() 
    {
        System.out.println("\n--- All Cars ---");
        
        if (carList.isEmpty()) 
        {
            System.out.println("No cars available.");
            return;
        }
        
        for (Car car : carList) 
        {
            car.displayCar();
        }
        System.out.println("Total cars: " + carList.size());
    }

    private static void updateCar() 
    {
        System.out.println("\n--- Update Car ---");
        
        if (carList.isEmpty()) 
        {
            System.out.println("No cars available to update.");
            return;
        }
        
        System.out.print("Enter car ID to update: ");
        int id = Integer.parseInt(input.nextLine());
        Car carToUpdate = findCarById(id);
        if (carToUpdate == null) 
        {
            System.out.println("Car not found!");
            return;
        }
        
        System.out.println("Current car details:");
        carToUpdate.displayCar();
        
        System.out.print("Enter new brand (current: " + carToUpdate.getBrand() + "): ");
        String brand = input.nextLine();
        if (!brand.isEmpty()) 
        {
            carToUpdate.setBrand(brand);
        }
        
        System.out.print("Enter new model (current: " + carToUpdate.getModel() + "): ");
        String model = input.nextLine();
        if (!model.isEmpty()) 
        {
            carToUpdate.setModel(model);
        }
        
        System.out.print("Enter new year (current: " + carToUpdate.getYear() + "): ");
        String yearStr = input.nextLine();
        if (!yearStr.isEmpty()) 
        {
            carToUpdate.setYear(Integer.parseInt(yearStr));
        }
        
        System.out.print("Enter new price (current: " + carToUpdate.getPrice() + "): ");
        String priceStr = input.nextLine();
        if (!priceStr.isEmpty()) 
        {
            carToUpdate.setPrice(Double.parseDouble(priceStr));
        }
        
        System.out.println("Car updated successfully!");
    }

    private static void deleteCar() 
    {
        System.out.println("\n Delete Car ");
        
        if (carList.isEmpty()) 
        {
            System.out.println("No cars available to delete.");
            return;
        }
        
        System.out.print("Enter car ID to delete: ");
        int id = Integer.parseInt(input.nextLine());
        
        Car carToDelete = findCarById(id);
        if (carToDelete == null) 
        {
            System.out.println("Car not found!");
            return;
        }
        
        System.out.println("Car to delete:");
        carToDelete.displayCar();
        
        System.out.print("Are you sure you want to delete this car? (y/n): ");
        String confirm = input.nextLine();
        
        if (confirm.equalsIgnoreCase("y") || confirm.equalsIgnoreCase("yes")) 
        {
            carList.remove(carToDelete);
            System.out.println("Car deleted successfully!");
        } 
        else 
        {
            System.out.println("Delete cancelled.");
        }
    }

    private static void searchCar() 
    {
        System.out.println("\n Search Car ");
        
        if (carList.isEmpty()) 
        {
            System.out.println("No cars available to search.");
            return;
        }
        
        System.out.print("Enter brand or model to search: ");
        String searchTerm = input.nextLine().toLowerCase();
        
        List<Car> foundCars = new ArrayList<>();
        
        for (Car car : carList) 
        {
            if (car.getBrand().toLowerCase().contains(searchTerm) || car.getModel().toLowerCase().contains(searchTerm)) 
                {
                  foundCars.add(car);
                }
        }
        
        if (foundCars.isEmpty()) 
        {
            System.out.println("No cars found matching your search.");
        }
        else 
        {
            System.out.println("Found " + foundCars.size() + " car(s):");
            for (Car car : foundCars) 
            {
                car.displayCar();
            }
        }
    }

    private static Car findCarById(int id) 
    {
        for (Car car : carList) 
        {
            if (car.getId() == id) 
            {
                return car;
            }
        }
        return null;
    }
}

public class Main 
{
    private static List<Car> carList = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    private static int nextId = 1;
    
    public static void main(String[] args) 
    {
        addSampleData();
        
        System.out.println("Welcome to Car Management System!");
        
        boolean running = true;
        while (running) 
        {
            showMenu();
            int choice = getChoice();
            
            switch (choice) 
            {
                case 1:
                    addCar();
                    break;
                case 2:
                    viewAllCars();
                    break;
                case 3:
                    updateCar();
                    break;
                case 4:
                    deleteCar();
                    break;
                case 5:
                    searchCar();
                    break;
                case 6:
                    System.out.println("Thank you for using Car Management System!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            
            if (running) 
            {
                System.out.println("\nPress Enter to continue...");
                input.nextLine();
            }
        }
    }