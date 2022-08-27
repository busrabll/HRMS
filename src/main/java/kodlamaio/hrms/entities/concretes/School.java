package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

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
@Table(name="schools")
@AllArgsConstructor
@NoArgsConstructor
public class School {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="section")
	private String section;
	
	@Column(name="start_year")
	private LocalDate startYear;
	
	@Column(name="end_year")
	private LocalDate endYear;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="jobSeeker_id")
	private JobSeeker jobSeeker;
}