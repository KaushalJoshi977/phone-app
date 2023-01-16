public interface Phone {
    void powerOn();
    void callNumber(String phoneNum);
    void receive(String phoneNum);
    boolean answer();
    boolean isRinging();
}
