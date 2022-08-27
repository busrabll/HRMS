package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CoverLetterService;
import kodlamaio.hrms.business.abstracts.ForeignLanguageService;
import kodlamaio.hrms.business.abstracts.ImageService;
import kodlamaio.hrms.business.abstracts.JobExperienceService;
import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.business.abstracts.LinkService;
import kodlamaio.hrms.business.abstracts.SchoolService;
import kodlamaio.hrms.business.abstracts.SkillService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concretes.JobSeeker;
import kodlamaio.hrms.entities.dtos.JobSeekerCvDto;

@Service
public class JobSeekerManager implements JobSeekerService {

	private JobSeekerDao jobSeekerDao;
	
	private CoverLetterService coverLetterService;
	private ForeignLanguageService foreignLanguageService;
	private ImageService imageService;
	private JobExperienceService jobExperienceService;
	private LinkService linkService;
	private SchoolService schoolService;
	private SkillService skillService;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao, CoverLetterService coverLetterService,
			ForeignLanguageService foreignLanguageService, ImageService imageService,
			JobExperienceService jobExperienceService, LinkService linkService, SchoolService schoolService,
			SkillService skillService) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.coverLetterService = coverLetterService;
		this.foreignLanguageService = foreignLanguageService;
		this.imageService = imageService;
		this.jobExperienceService = jobExperienceService;
		this.linkService = linkService;
		this.schoolService = schoolService;
		this.skillService = skillService;
	}
	
	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>
		(this.jobSeekerDao.findAll());
	}

	@Override
	public Result add(JobSeeker jobSeeker){
			this.jobSeekerDao.save(jobSeeker);
			return new SuccessResult("Job seeker added.");
	}

	@Override
	public DataResult<JobSeekerCvDto> getByJobSeekerCvId(int id) {
		JobSeeker jobSeeker = this.jobSeekerDao.getById(id);
		
		JobSeekerCvDto jobSeekerCv = new JobSeekerCvDto();
		
		jobSeekerCv.setCoverLetters(jobSeeker.getCoverLetters());
		jobSeekerCv.setForeignLanguages(jobSeeker.getForeignLanguages());
		jobSeekerCv.setImage(jobSeeker.getImage());
		jobSeekerCv.setJobExperiences(jobSeeker.getJobExperiences());
		jobSeekerCv.setLinks(jobSeeker.getLinks());
		jobSeekerCv.setSchools(jobSeeker.getSchools());
		jobSeekerCv.setSkills(jobSeeker.getSkills());
		
		return new SuccessDataResult<JobSeekerCvDto>(jobSeekerCv);
	}
	
}