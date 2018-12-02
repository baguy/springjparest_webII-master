package com.mayra.springjparestwebII.model;
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
@Table(name="Clients")
@EntityListeners(AuditingEntityListener.class)

public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@NotBlank
	private String name;

	@NotBlank
	private String coffee;

	@NotBlank
	private String cat;

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

  public String getCoffee() {
    return coffee;
  }

  public void setCoffee(String coffee) {
    this.coffee = coffee;
  }

  public String getCat() {
    return cat;
  }

  public void setCat(String cat) {
    this.cat = cat;
  }

}
