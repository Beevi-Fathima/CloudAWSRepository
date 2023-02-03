package com.capg.ipl.entity;

import javax.persistence.*;


@Entity
@Table(name="admin")
public class Admin{
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="admin_id")
    public long adminId;
    
    @Column(name="username")
    public String username;
    
    @Column(name="password")
    public String password;
    
	    public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

		public Admin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
		

		public Admin(long adminId, String username, String password) {
			super();
			this.adminId = adminId;
			this.username = username;
			this.password = password;
		}

		public long getAdminId() {
			return adminId;
		}

		public void setAdminId(long adminId) {
			this.adminId = adminId;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "Admin [adminId=" + adminId + ", username=" + username + ", password=" + password + "]";
		}
        

		
	    
}


