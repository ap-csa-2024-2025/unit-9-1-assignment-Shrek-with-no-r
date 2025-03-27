public class SpecialtyCoffee extends Coffee
{
  private String type = "type";
  private String size = "4";
  private int shots = -1;
  private Boolean isSkinny = "false";
  private String flavor = "idk";

  public specialtyCoffee()
  {
    super();
    flavor = "vanilla";
  }

  public specialtyCcoffee(String size, String type, String flavor)
  {
    super(size,false, 1, type);
    this.flavor = flavor;
  }

  public specialtyCoffee(int size, String type, String flavor, Boolean isSkinny, int shots)
  {
    super(size,type,isSkinny,shots);
    this.flavor = flavor;
  }

  public String toString()
  {
    return super.toString() + "\n" + "flavor: " + flavor + "size: " + size;
  }
}
