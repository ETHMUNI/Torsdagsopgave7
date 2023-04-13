package opg1;

public class Tv {

    private int channel;
    private int volume;
    private boolean isTv;

    public Tv() {
        channel = 1;
        volume = 0;
        isTv = false;

    }

    public void setChannel(int channel) {
        if(turnOn()) {
            this.channel = channel;
            System.out.println("Du er på kanal: " + channel);
        } else if(turnOff()) {
            System.out.println("Tv'et er ikke tændt");
        }
    }

    public void channelUp() {
        if(turnOn()) {
            channel++;
        } else if(turnOff()) {
            System.out.println("Tv'et er ikke tændt");
        }
    }

    public void channelDown() {
        if(turnOn()) {
            channel--;
        } else if(turnOff()) {
            System.out.println("Tv'et er ikke tændt");
        }
    }

    public void volumeUp() {
        if(turnOn()) {
            volume++;
        } else if(turnOff()) {
            System.out.println("Tv'et er ikke tændt");
        }
    }

    public void volumeDown() {
        if(turnOn()) {
            volume--;
        } else if(turnOff()) {
            System.out.println("Tv'et er ikke tændt");
        }
    }

    public void setVolume(int volume) {
        if(turnOn()) {
            this.volume = volume;
            System.out.println("Lyden er på " + volume);
        } else if(turnOff()){
            System.out.println("Tv'et er ikke tændt");
        }
    }

    public boolean turnOn() {
        isTv = true;
        return isTv;
    }
    public boolean turnOff() {
        isTv = false;
        return isTv;
    }
}
