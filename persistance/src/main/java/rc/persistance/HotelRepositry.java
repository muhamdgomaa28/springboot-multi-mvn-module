package rc.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import rc.domain.Hotel;

public interface HotelRepositry extends JpaRepository<Hotel,Long> {
}
