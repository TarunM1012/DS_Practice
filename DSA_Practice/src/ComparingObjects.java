import java.util.Arrays;

public class ComparingObjects {
    static class Cricketer implements Comparable<Cricketer> {
        String name;
        int totalRuns, wickets;

        Cricketer(String name, int totalRuns, int wickets) {
            this.name = name;
            this.totalRuns = totalRuns;
            this.wickets = wickets;

        }

        public String toString() {
            return this.name + " " + this.totalRuns + " " + this.wickets;
        }

        @Override
        public int compareTo(Cricketer o) {
           // return this.name.compareTo(o.name); // (Alphabetical order)
           // return o.totalRuns - this.totalRuns; // (Decreasing Runs)
            if(this.totalRuns == o.totalRuns){
                return o.wickets - this.wickets;
            }
            else {
                return this.totalRuns;
            }

        }
    }

    public static void main(String[] args){
        Cricketer[] arr = new Cricketer[3];

        arr[0] = new Cricketer("Rohit Sharma", 20000, 100);
        arr[1] = new Cricketer("Virat Kohli", 20000, 50);
        arr[2] = new Cricketer("Jasprit Bumrah", 25000, 10);

        Arrays.sort(arr);
        System.out.println(arr[0] + "\n " + arr[1] + "\n " + arr[2]);

    }
}
