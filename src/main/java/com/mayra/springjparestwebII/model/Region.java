package com.mayra.springjparestwebII.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Regions")
@EntityListeners(AuditingEntityListener.class)

public class Region {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@NotBlank
	private String name;

//	@NotBlank
//  @ManyToMany(mappedBy="region")
//	private List<Region> bean;

  public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//		public List getBeans() {
//				return bean;
//		}
//
//		public void setBeans(List bean) {
//				this.bean = bean;
//		}


}
