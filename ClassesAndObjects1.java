class Movie{
    String title;
    int rating, duration;

    Movie(String title, int rating, int duration){
        this.title = title;
        this.rating = rating;
        this.duration = duration;
    }

    String getCategory(){
        if (rating >= 8){
            return "Blockbuster";
        }else if (rating >= 5){
            return "Average";
        }else{
            return "Flop";
        }
    }

}

public class ClassesAndObjects1{
    public static void main(String[] args) {
        Movie m = new Movie("Wake Up Sid", 5, 4);
        System.out.println("The category of the movie "+m.title+ " of duration " + m.duration + " hrs is " +m.getCategory());
    }
}