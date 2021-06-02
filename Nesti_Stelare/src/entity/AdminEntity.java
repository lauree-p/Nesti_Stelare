package entity;

public class AdminEntity extends BaseEntity {
	
	private String pseudo;
	private boolean isSuperAdmin;
	private String password;
	/**
	 * @return the name
	 */
	public String getPseudo() {
		return pseudo;
	}
	/**
	 * @param name the name to set
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	/**
	 * @return the isSuperAdmin
	 */
	public boolean isSuperAdmin() {
		return isSuperAdmin;
	}
	/**
	 * @param isSuperAdmin the isSuperAdmin to set
	 */
	public void setSuperAdmin(boolean isSuperAdmin) {
		this.isSuperAdmin = isSuperAdmin;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}