package group4618.pozdnyakov.lesson4.exercise1;

public interface UserView<T extends User> {
	public void sendOnConsole(List<T> listT);
}
