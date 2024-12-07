package barberShop.com.barberShop.Repository;

import barberShop.com.barberShop.Entity.Appointement;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AppointementRepository extends JpaRepository<Appointement, Long> {

}
