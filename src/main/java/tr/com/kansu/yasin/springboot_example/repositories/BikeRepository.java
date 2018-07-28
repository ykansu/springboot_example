package tr.com.kansu.yasin.springboot_example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.com.kansu.yasin.springboot_example.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {
}
