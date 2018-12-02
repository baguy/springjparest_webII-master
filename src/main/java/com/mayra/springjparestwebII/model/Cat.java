package com.mayra.springjparestwebII.model;

/**
 *
 * @author Mayra1600036
 */

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Cats")
@EntityListeners(AuditingEntityListener.class)
public class Cat {
    
    	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String color;
	
	@NotBlank
	private String friendly;

//	@Temporal(TemporalType.TIMESTAMP)
//	@LastModifiedDate
//	private Date createdAt;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFriendly() {
        return friendly;
    }

    public void setFriendly(String friendly) {
        this.friendly = friendly;
    }

//    public Date getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(Date createdAt) {
//        this.createdAt = createdAt;
//    }
    
}
