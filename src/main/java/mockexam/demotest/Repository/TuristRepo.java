package mockexam.demotest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mockexam.demotest.Pojo.Turist;

public interface TuristRepo extends JpaRepository<Turist,Integer> {
    
}
