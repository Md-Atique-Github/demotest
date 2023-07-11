package mockexam.demotest.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mockexam.demotest.Pojo.Hotal;
import mockexam.demotest.Repository.HotalRepo;

@CrossOrigin("*")
@RequestMapping("/hotal")
@RestController
public class ControllerHotal {

    @Autowired
    private HotalRepo hotalRepo;

    @PostMapping("/post")
    public void saveData(@RequestBody Hotal hotal) {
        hotalRepo.save(hotal);
    }

    @GetMapping("/get")

    public List<Hotal> getData() {
        List<Hotal> hotal = hotalRepo.findAll();
        return hotal;
    }

    @GetMapping("/get/{id}")
    public Optional<Hotal> getById(@PathVariable Integer id) {
       return hotalRepo.findById(id);
    }
     @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Integer id) {
        hotalRepo.deleteById(id);
        return ResponseEntity.ok().body("Deleted successfully");
}
}
