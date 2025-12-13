class Movie{
    String title;
    int rating, duration;

    //  parameterized constructor of the class
    public Movie(String title, int rating, int duration){
        this.title = title;
        this.rating = rating;
        this.duration = duration;
    }

    // a method that returns String data type 
    public String getCategory(){
        if (rating >= 8){
            return "Blockbuster";
        }else if (rating >= 5){
            return "Average";
        }else{
            return "Flop";
        }
    }
}

// the main class of the program
public class ClassesAndObjects1{
    public static void main(String[] args) {
        
        // creating object of the class Movie ans passing the arguments
        Movie m = new Movie("Wake Up Sid", 5, 4);
        System.out.println("The category of the movie "+m.title+ " of duration " + m.duration + " hrs is " +m.getCategory());
    }

}

