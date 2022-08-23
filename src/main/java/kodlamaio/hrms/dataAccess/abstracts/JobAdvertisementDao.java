package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
	JobAdvertisement getById(int id);

	@Query("From JobAdvertisement where isActive = true")
    List<JobAdvertisement> getByJobAdvertisement();
    
    @Query("From JobAdvertisement where isActive = true")
    List<JobAdvertisement> getByJobAdvertisementAndCompanyName(String companyName);
    
    @Query("From JobAdvertisement where isActive = true and employer_id=:id")
    List<JobAdvertisement> getByJobAdvertisementAndEmployer(int id);
}