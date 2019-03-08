package naveen.perera.io.shipwreck.Controller;

import naveen.perera.io.shipwreck.Model.Shipwreck;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class ShipWreckController {

    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
      public List<Shipwreck> list(){
        return ShipwreckStub.list();
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
        public Shipwreck get(@PathVariable long id){
        return ShipwreckStub.get(id);
    }

    @RequestMapping(value = "shipwrecks" , method = RequestMethod.POST)
        public Shipwreck create(@RequestBody Shipwreck shipwreck){
        return  ShipwreckStub.create(shipwreck);
    }

    @RequestMapping(value = "shipwrecks/{id}" , method = RequestMethod.DELETE)
        public Shipwreck delete(@PathVariable("id") long identification){
            return ShipwreckStub.delete(identification);
    }


    }



