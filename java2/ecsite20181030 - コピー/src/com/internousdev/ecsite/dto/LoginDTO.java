package com.internousdev.ecsite.dto;


public class LoginDTO{
  private String loginId;
  private String loginPass;
  private String userName;
  private boolean loginFlg=false;

  public String getLoginId(){
    return loginId;
}
  public void setLoginId(String loginId){
    this.loginId=loginId;
  }
  public String getLoginPass(){
    return loginPass;
}
  public void setLoginPass(String loginPass){
    this.loginPass=loginPass;
  }
  public String getuseName(){
    return userName;
}
  public void setUserName(String UserName){
    this.userName=loginPass;
  }
  public boolean getLoginFlg(){
    return loginFlg;
  }
  public void setLoginFlg(boolean loginFlg){
    this.loginFlg=loginFlg;
  }
}
