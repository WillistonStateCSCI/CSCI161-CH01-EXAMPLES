package EX01_07;

public class EX01_07{
    public static void main(String[] args) {

        double [] example = {1.2, 2.3, 4.5, 9.8, 12.3};
        sum(example);
        max(example);
        
    }

    public static double sum(double[] data){
        double total = 0;
        for(int j = 0; j< data.length;j++){ // note the use of length
            total+=data[j];
        }
        return total;
    }

    public static double max(double[] data){
        double currentMax = data[0]; // assume first is biggest (for now)
        for(int j=1;j<data.length;j++){ // consider all other entries
            if(data[j]>currentMax){ // if data[j] is biggest thus far...
                currentMax = data[j]; // record it as the current max
            }
        }
        return currentMax;
    }
}