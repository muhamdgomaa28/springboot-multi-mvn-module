package re.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import rc.domain.Hotel;
import rc.persistance.HotelRepositry;

import java.util.List;

@RestController
public class HotelControler {
    private HotelRepositry hotelrepo;

    public HotelControler(HotelRepositry hotelrepo){
        this.hotelrepo=hotelrepo;
    }


    @RequestMapping(value = "/hotels", method = RequestMethod.GET)
    public List<Hotel> getAll(){

List<Hotel> hotels=this.hotelrepo.findAll();
return  hotels;
    }


}
