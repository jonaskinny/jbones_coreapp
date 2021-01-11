package org.jbones.coreapp.model.vo;

public class User {
    
    private String email;
    private String username;
    private String password;
    private String activationCode;
    private boolean activated;

    public String getEmail() {
      return email;
    }
    public void setEmail(String email) {
      this.email = email;
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
    public String getActivationCode() {
      return activationCode;
    }
    public void setActivationCode(String activationCode) {
      this.activationCode = activationCode;
    }
    public boolean getActivated() {
      return activated;
    }
    public void setActivated(boolean activated) {
      this.activated = activated;
    }
}
