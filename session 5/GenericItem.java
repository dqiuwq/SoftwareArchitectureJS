public class GenericItem<X>
{
  private X data;
  public GenericItem(X anInstance)
  {
    this.data = anInstance;
  }
  public X get()
  {
    return data;
  }
  // More methods to make this class useful
}