package SpeedHomeJTE;

public class Car
{
    private final String manufacturer;
    private final String name;

    public Car(String manufacturer, String name)
    {
        this.manufacturer = manufacturer;
        this.name = name;
    }


    public String getManufacturer()
    {
        return manufacturer;
    }

    public String getName()
    {
        return name;
    }
}
