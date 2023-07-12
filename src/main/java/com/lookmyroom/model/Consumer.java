/**
 * 
 */
package com.lookmyroom.model;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author shekhar_t
 *
 */
@Entity
@Table(name="consumer",indexes= {@Index(columnList="email",name="IX_EMAIL"),@Index(columnList="email_verified",name="IX_EMAIL_VERIFIED")})
public class Consumer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="consumer_id",unique=true,nullable=false,columnDefinition="BIGINT")
	private BigInteger consumerId;
	
	@Column(name="email", nullable=true,length=300)
	private String email;
	
	@Column(name="cuid",unique=true,nullable=false,length=200)
	private String cuid;
	
	@Column(name="email_verified",nullable=false)
	private byte emailVerified;
	
	@Column(name="is_active",nullable=false)
	private byte isActive;
	
	@Column(name="is_logged_in",nullable=false)
	private byte isLoggedin;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date",nullable=false)
	private Date createdDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="modified_date",nullable=false)
	private Date modifiedDate;

	/**
	 * @return the id
	 */
	public BigInteger getConsumerId() {
		return consumerId;
	}

	/**
	 * @param id the id to set
	 */
	public void setConsumerId(BigInteger consumerId) {
		this.consumerId = consumerId;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the cuid
	 */
	public String getCuid() {
		return cuid;
	}

	/**
	 * @param cuid the cuid to set
	 */
	public void setCuid(String cuid) {
		this.cuid = cuid;
	}

	/**
	 * @return the emailVerified
	 */
	public byte getEmailVerified() {
		return emailVerified;
	}

	/**
	 * @param emailVerified the emailVerified to set
	 */
	public void setEmailVerified(byte emailVerified) {
		this.emailVerified = emailVerified;
	}

	/**
	 * @return the isActive
	 */
	public byte getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the isLoggedin
	 */
	public byte getIsLoggedin() {
		return isLoggedin;
	}

	/**
	 * @param isLoggedin the isLoggedin to set
	 */
	public void setIsLoggedin(byte isLoggedin) {
		this.isLoggedin = isLoggedin;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	
}
