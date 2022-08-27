package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="jobSeekers")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker extends User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="birth_of_year")
	private int birthOfYear;
	
	@Column(name="national_id")
	private String nationalId;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "jobSeeker")
	private List<ForeignLanguage> foreignLanguages;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "jobSeeker")
	private List<JobExperience> jobExperiences;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "jobSeeker")
	private List<Link> links;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "jobSeeker")
	private List<School> schools;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "jobSeeker")
	private List<Skill> skills;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "jobSeeker")
	private List<CoverLetter> coverLetters;
	
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "image_id", referencedColumnName = "id")
    private Image image;

}