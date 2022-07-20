package Models.destinations;

import Models.SignUp;

import java.util.PriorityQueue;
import java.util.Random;

public class LagosBus extends Destination{
    PriorityQueue<SignUp>   lagosBus10 = new PriorityQueue<>();
    PriorityQueue<SignUp> lagosBus15 = new PriorityQueue<>();

    @Override
    public void setPrice(int price) {
        int lagosPrice = 8000;
        super.setPrice(lagosPrice);
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
        lagosBus10.add(sp);
    }

    @Override
    public void fifthenseaterdestination(SignUp sp) {
        lagosBus15.add(sp);
    }
}
