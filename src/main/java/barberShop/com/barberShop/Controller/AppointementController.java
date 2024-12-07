package barberShop.com.barberShop.Controller;

import barberShop.com.barberShop.Entity.Appointement;
import barberShop.com.barberShop.Repository.AppointementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/appointments")
public class AppointementController {
    @Autowired
    private AppointementRepository appointmentRepository;

    @PostMapping()
    public Appointement createAppointment(@RequestBody Appointement appointment) {
        return appointmentRepository.save(appointment);
    }

    @GetMapping
    public List<Appointement> getAllAppointments() {
        return appointmentRepository.findAll();
    }

}
