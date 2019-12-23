public interface Channel {
    void addSubscribe(Subscribe subscriber);
    void removeSubscribe(Subscribe subscriber);
    void notifySubscribers();
    Object getUpdate(Subscribe subscriber);
}
