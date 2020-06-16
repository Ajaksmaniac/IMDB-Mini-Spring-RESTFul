package com.Ajaksmaniac.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "movie_id")
	private Integer id;

	@Column(name = "name")
	private String name;
	@Column(name = "image_url")
	private String image_url;

	@Column(name = "date_of_release")
	private String dateOfRelease;

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	@Column(name = "rating")
	private int rating;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfRelease() {
		return dateOfRelease;
	}

	public void setDateOfRelease(String dateOfRelease) {
		this.dateOfRelease = dateOfRelease;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

// getter-setters


	@Override
	public String toString() {
		return "Movie{" +
				"id=" + id +
				", name='" + name + '\'' +
				", image_url='" + image_url + '\'' +
				", dateOfRelease='" + dateOfRelease + '\'' +
				", rating=" + rating +
				'}';
	}
}