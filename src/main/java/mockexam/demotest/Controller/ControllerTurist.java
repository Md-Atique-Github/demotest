package mockexam.demotest.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mockexam.demotest.Pojo.Hotal;
import mockexam.demotest.Pojo.Turist;
import mockexam.demotest.Repository.HotalRepo;
import mockexam.demotest.Repository.TuristRepo;


@CrossOrigin("*")
@RequestMapping("/turist")
@RestController
public class ControllerTurist {
    
    @Autowired
    private TuristRepo turistRepo;

    @PostMapping("/post")
    public void saveData(@RequestBody Turist turist) {
        turistRepo.save(turist);
    }

    @GetMapping("/get")

    public List<Turist> getData() {
        List<Turist> turist = turistRepo.findAll();
        return turist;
    }

    @GetMapping("/get/{id}")
    public Optional<Turist> getById(@PathVariable Integer id) {
         return turistRepo.findById(id);
    }
}
