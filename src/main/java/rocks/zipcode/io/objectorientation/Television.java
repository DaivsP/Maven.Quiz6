package rocks.zipcode.io.objectorientation;

public class Television {

    private TVChannel tvChannel;
    private Boolean turnedOn;

    public Television(){
        tvChannel = null;
        turnedOn = false;
    }

    public void turnOn() {
        turnedOn = true;
    }

    public void setChannel(Integer channel) {
        if (turnedOn == true) {
            tvChannel = TVChannel.getByOrdinal(channel);
        }
        else throw new IllegalStateException();
    }

    public TVChannel getChannel() {
        return tvChannel;
    }
}
