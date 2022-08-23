package kodlamaio.hrms.entities.concretes;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="jobAdvertisements")
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="job_description")
	private String jobDescription;
	
	@Column(name="min_salary")
	private int minSalary;
	
	@Column(name="max_salary")
	private int maxSalary;
	
	@Column(name="open_position_count")
	private int openPositionCount;
	
	@Column(name="release_date")
	private LocalDateTime releaseDate = LocalDateTime.now();
	
	@Column(name="application_deadline")
	private Date applicationDeadline;
	
	@Column(name="is_active", columnDefinition = "boolean default true")
	private boolean isActive;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="job_position_id")
	private JobPosition jobPosition;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="city_id")
	private City city;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="employer_id")
	private Employer employer;

}