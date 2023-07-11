package mockexam.demotest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mockexam.demotest.Pojo.Hotal;

public interface HotalRepo extends JpaRepository <Hotal,Integer> {
    
}
