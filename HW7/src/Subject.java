public interface Subject {
    public void registerObserver(StringObserver o);
    public void removeObserver(StringObserver o);
    public void notifyObserver();
}