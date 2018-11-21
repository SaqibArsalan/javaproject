import java.sql.Time;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;
import java.util.Scanner;


public class Flight {
    private int flightNo;                /* flight number */
    private String departureCity;               /* departure city */
    private DateTimeFormatter timeDep;                /* departure time hhmm, e.g. 623 or 1258 */
    private String arrivalCity;                 /* arrival city */
    private DateTimeFormatter timeArrival;                /* arrival time hhmm, e.g. 623 or 1258 */
    private int noPassenger;                /* number of passengers on the flight */
    Flight pFlightDep;     /* next departure node from this city */
    Flight pFlightArr;


    public Flight(int flightNo, String departureCity,  DateTimeFormatter timeDep, String arrivalCity, DateTimeFormatter timeArrival, int noPassenger,
                  Flight pFlightDep, Flight pFlightArr){
        this.flightNo = flightNo;
        this.departureCity = departureCity;
        this.timeDep = timeDep;
        this.arrivalCity = arrivalCity;
        this.timeArrival = timeArrival;
        this.noPassenger = noPassenger;
        this.pFlightDep = pFlightDep;
        this.pFlightArr = pFlightArr;
    }

   public Flight CityArrival_Lists(String City_Name) {
// return sorted lists of departures for a city
   }

    public Flight FLight_Info(int flightNo) {
        //print flight info
    }

}


 public class Cities {
    private String CityName; // city name
     Flight pFlightDep;
     Flight pFlightArr;


 }

     public class Routes {
         int Day;                        /* day of travel: mmdd */
         int hop;                        /* Number of hops (1 or 2) */
         int Flight_No1;                /* Flight number of first hop */
         int Flight_No2;                /* Flight number of second hop (if needed) */

         //public void getRoutes() {


         public void openFile() {
                 private Formatter x;
             try {
                 x = new Formatter("files.txt");

             }
             catch (exception e){
                 System.out.println("You have an error ");

             }

             System.out.println("Enter the Day of the Travel ");
             System.out.println("Enter the number of hops ");

             x.format("%d%d",Day,hop);


         }
     }

         public class Reservation_Type {
        String Fname;                /* first name of passenger */
        String  Lname;                /* last name of passenger */
        boolean wTypea;                        /* ROUNDTRIP or ONEWAY */
        Routes route1;                /* first route */
        Routes route2;                /* second route (only if ROUNDTRIP) */
        Reservation_Type pReserve;  /* next reservation in linked list */


             public void openFile() {
                 private Formatter x;
                 try {
                     x = new Formatter("files.txt");

                 }
                 catch (exception e){
                     System.out.println("You have an error ");

                 }
                 System.out.println("Enter the First name of the passenger");
                  System.out.println("Enter the Last name of the passenger ");
                 System.out.println("Press 1 if RoundTrip or else press 0 if Oneway ");

                 x.format("%s%s%d",Fname,Lname,wTypea);



         }


       Reservation_Type pReserveHead; /* head of the reservation list */

         public class Reservations {

             public void Print_Passengers() {
                 //print Passengers
             }

             public  void Print_PassengerSchedule(Flight f) {
                 //print passenger schedule
             }

             public void DeleteReservation(){
                 //delete reservation by prompting for name.
             }
         }

	
	
	

