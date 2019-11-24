package rc.persistance;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rc.domain.Hotel;

import java.util.ArrayList;
import java.util.List;

@Component
public class DbInitialize implements CommandLineRunner {

    private HotelRepositry hotelrepo;

    public DbInitialize(HotelRepositry hotelrepo){

        this.hotelrepo=hotelrepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Hotel aa=new Hotel("mariot",5,true);
        Hotel bb=new Hotel("alex",4,true);
        Hotel cc=new Hotel("dmiat",3,false);
        List<Hotel> hotels =new ArrayList<>();
hotels.add(aa);
hotels.add(bb);
hotels.add(cc);

this.hotelrepo.saveAll(hotels);


    }
}
