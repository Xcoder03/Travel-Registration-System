package Models.destinations;

import Models.SignUp;

import java.util.PriorityQueue;
import java.util.Random;

public class PortHarcourtBus extends  Destination {
    PriorityQueue<SignUp> ph10 = new PriorityQueue<>();
    PriorityQueue<SignUp> ph15 = new PriorityQueue<>();

    @Override
    public void setPrice(int price) {
        int phPrice = 8000;
        super.setPrice(phPrice);
    }

    @Override
    public void setTicket(String ticket) {
        Random rand = new Random();
        int id_random = rand.nextInt(200);
        int id_random2 = rand.nextInt(250);
        String ticketID = "MK"+id_random+id_random2;
        super.setTicket(ticketID);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String getTicket() {
        return super.getTicket();
    }

    @Override
    public void tenseaterdestination(SignUp sp) {
        ph10.add(sp);
    }

    @Override
    public void fifthenseaterdestination(SignUp sp) {
         ph15.add(sp);
    }
}
