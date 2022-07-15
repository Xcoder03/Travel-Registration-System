package Models.destinations;

import Models.SignUp;

import java.util.PriorityQueue;
import java.util.Random;

public class AbujaBus extends Destination{
   PriorityQueue<SignUp> abj10 = new PriorityQueue<>();
    PriorityQueue<SignUp> abj15 = new PriorityQueue<>();

    @Override
    public void setPrice(int price) {
        int abjPrice = 8000;
        super.setPrice(abjPrice);
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
       abj10.add(sp);
    }

    @Override
    public void fifthenseaterdestination(SignUp sp) {
        abj15.add(sp);
    }
}
