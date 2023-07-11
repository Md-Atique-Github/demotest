package mockexam.demotest.Pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Hotal Table")
public class Hotal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String imageLink;
    private String nameOfHotal;
    private String shortDiscription;
    private String cityOfHotal;
    private String experienceLevel;
    private Integer priceOfHotal;

    @Column(columnDefinition= "TEXT")
    private String longDiscription;
    
    private boolean pool;
    
}
