package kodlamaio.hrms.entities.dtos;

import java.util.List;

import kodlamaio.hrms.entities.concretes.CoverLetter;
import kodlamaio.hrms.entities.concretes.ForeignLanguage;
import kodlamaio.hrms.entities.concretes.Image;
import kodlamaio.hrms.entities.concretes.JobExperience;
import kodlamaio.hrms.entities.concretes.JobSeeker;
import kodlamaio.hrms.entities.concretes.Link;
import kodlamaio.hrms.entities.concretes.School;
import kodlamaio.hrms.entities.concretes.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekerCvDto {
	
	private JobSeeker jobSeeker;
	private List<CoverLetter> coverLetters;
	private List<ForeignLanguage> foreignLanguages;
	private Image image;
	private List<JobExperience> jobExperiences;
	private List<Link> links;
	private List<School> schools;
	private List<Skill> skills;
}
