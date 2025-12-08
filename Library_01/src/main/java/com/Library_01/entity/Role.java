package com.Library_01.entity;


	import java.util.List;

	import com.fasterxml.jackson.annotation.JsonManagedReference;

	import jakarta.persistence.CascadeType;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.OneToMany;
	import jakarta.persistence.Table;

	@Entity
	@Table(name = "role")
	public class Role {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int roleId;
	    private String roleName;

	    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
	    @JsonManagedReference("role-users")
	    private List<User> users;

	    public List<User> getUser() {
	        return users;
	    }

	    public void setUser(List<User> user) {
	        this.users = user;
	    }
	
	public int getRoleId() {
	    return roleId;
	}

	public void setRoleId(int roleId) {
	    this.roleId = roleId;
	}

	public String getRoleName() {
	    return roleName;
	}

	public void setRoleName(String roleName) {
	    this.roleName = roleName;
	}

}
