public class Landline implements Phone{
    String myNumber;
    private boolean isRinging;
    private static boolean isPowerOn;

    public Landline(String myNumber) {
        this.myNumber = myNumber;
        this.isRinging = false;
        this.isPowerOn = true;
    }

    public String getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(String myNumber) {
        this.myNumber = myNumber;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn = true;
    }

    @Override
    public void callNumber(String phoneNum) {
        if(isPowerOn==true){
            System.out.println("you are dialing" + phoneNum);
        }
        else {
            System.out.println("your landline is off");
        }
    }

    @Override
    public void receive(String phoneNum) {
        if(isPowerOn && myNumber.equals(phoneNum)){
            this.isRinging = true;
            System.out.println("receiving call from to " + myNumber);
        }else System.out.println("no call");
    }

    @Override
    public boolean answer() {
        if(isRinging==true){
            System.out.println("call answered");
            this.isRinging = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
