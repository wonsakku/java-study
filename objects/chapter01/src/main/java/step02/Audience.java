package step02;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

//    public Bag getBag() {
//        return this.bag;
//    }

    public Long buy(Ticket ticket){

        if(bag.hasInvitation()){
            bag.setTicket(ticket);
            return 0L;
        }

        bag.setTicket(ticket);
        bag.minusAmount(ticket.getFee());
        return ticket.getFee();
    }
}
