public class GenericItem<T> {
	private T data;
	
	public GenericItem(T anInstance) {
		this.data = anInstance;
	}
	
	public T get() {
		return data;
	}
	
	public void set(T anInstance) {
		this.data = anInstance;
	}
}