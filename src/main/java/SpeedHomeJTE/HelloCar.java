package SpeedHomeJTE;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloCar
{
    @RequestMapping("/hello2")
    public String index ()
    {
        String manufacturer = "Honda";
        String carname = "City";
        return manufacturer+" "+carname;
    }

    @RequestMapping("/hello")
    public Car car_api(@RequestParam(value="name", defaultValue="City") String name,
                        @RequestParam(value="manufacturer", defaultValue="Honda") String manufacturer)
    {
        return new Car(manufacturer, name);
    }


}
