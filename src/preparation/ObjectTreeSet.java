package preparation;

import java.util.*;

public class ObjectTreeSet {

    static class movieComparator implements Comparator<Movie>{


        @Override
        public int compare(Movie o1, Movie o2) {
            if (o1.rating>o2.rating)
                    return 1;
            else if(o1.rating<o2.rating)
                return -1;
            else return (o1.name.compareTo(o2.name));
        }
    }

    static TreeSet<Movie> ts = new TreeSet<Movie>(new movieComparator());
    static class Movie {
        String name;
        double rating;

        public Movie(String name, double rating){
            this.name = name;
            this.rating = rating;
        }
    }

    public static void main(String[] args) {
        Movie m1 = new Movie("Thor:Ragnarok", 8.2);
        Movie m2 = new Movie("Justice League", 6.6);
        Movie m3 = new Movie("Lady Bird", 8.4);
        Movie m4 = new Movie("Some random movie", 6.6);
        ts.add(m1);
        ts.add(m2);
        ts.add(m3);
        ts.add(m4);
        for(Movie m : ts)
            System.out.println(m.name+" "+m.rating);
    }

}
