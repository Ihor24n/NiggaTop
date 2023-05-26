public class Stadium {
    private String name;
    private String location;
    private int capacity;
    ////////////////////////////
    public Stadium(String name, String location, int capacity, int numberOfSeats){
        this.name = name;
        this.location = location;
        this.capacity = capacity;

    }
    public void displayStadiumInfo(){
        System.out.println("Stadium name : "+name);
        System.out.println("Location: " + location);
        System.out.println("Capacity: " + capacity);
    }
    public void checkAviability(int numberOfTickets){
        if (numberOfTickets<=capacity){
            System.out.println("Tickets are available for " + numberOfTickets + " people.");
        }else{
            System.out.println("Sorry, the stadium is not large enough to accommodate " + numberOfTickets + " people.");
        }

        }
    }
