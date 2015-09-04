//make a program with the given data to print the # of minutes and counts for each trip
//also print the distance of each in miles and the two trips combined
public class Cyclometer{
    public static void main(String[] args){
        //need to create variables to store the # of seconds and the # of counts for each trip
        int secsTrip1=480;
        int secsTrip2=3220;
        int countsTrip1=1561;
        int countsTrip2=9037;
        //next set of variables are for constants and storing various distances
        double wheelDiameter=27.0, // 
        PI=3.14159, //
        feetPerMile=5280, //
        inchesPerFoot=12,  //
        secondsPerMinute=60;  //
        double distanceTrip1, distanceTrip2,totalDistance;
        System.out.println("Trip 1 took "+ secsTrip1/secondsPerMinute +" minutes and had "+ 
        countsTrip1+" counts.");
        System.out.println("Trip 2 took "+ secsTrip2/secondsPerMinute +" minutes and had "+
        countsTrip2+" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //This is to get the distance of Trip #1 by multiplying the count, wheel diameter, and PI
        //there is backslash for line 24
        distanceTrip1/=inchesPerFoot*feetPerMile;
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance= distanceTrip1+distanceTrip2;
        //Time to print out the final data
        System.out.println("Trip 1 was "+distanceTrip1+" miles.");
        System.out.println("Trip 2 was "+distanceTrip2+" miles.");
        System.out.println("The total distance was "+ totalDistance+" miles.");
        
    }
}