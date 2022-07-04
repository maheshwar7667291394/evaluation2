package Question3;

import java.util.Scanner;

public class Ticket {
    int ticketid;
    int price;


    static int availableTickets(){
      int availablatc=100;
        return 100;

    }
    public int calculateTicketCost(int nooftickets,int price){
       int amount=nooftickets*price;
       return amount;



    }
public static void main(String[] args){
    Scanner input=new Scanner(System.in);
        System.out.println("check availablity");
        System.out.println("enter no of ticket");
       int noofticket1=input.nextInt();
       if(availableTickets()>=noofticket1){
           System.out.println("Enter the ticketid:");
           int id1=input.nextInt();

           System.out.println("Enter the price:");
           int price1=input.nextInt();

           Ticket newtc=new Ticket();
           int totalcost=newtc.calculateTicketCost(noofticket1,price1);
           System.out.println(totalcost);
           int Xy=availableTickets();


       }
       else{
           System.out.println(-1);
       }





}

}

