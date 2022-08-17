package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobTitles;

public interface JobTitlesDao extends JpaRepository<JobTitles,Integer> {

}
