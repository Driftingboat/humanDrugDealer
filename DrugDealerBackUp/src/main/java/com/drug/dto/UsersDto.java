package com.drug.dto;

import java.sql.Date;
import java.sql.Timestamp;

public class UsersDto {
   private String id;
   private String pw;
   private String name;
   private String email;
   private String address;
   private String phone;
   int useyn;
    Date regdate;
   
   public Date getRegdate() {
      return regdate;
   }
   public UsersDto(Date regdate) {
      super();
      this.regdate = regdate;
   }
   public void setRegdate(Date regdate) {
      this.regdate = regdate;
   }
   public UsersDto(){}
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public String getPw() {
      return pw;
   }
   @Override
   public String toString() {
      return "UsersDto [regdate=" + regdate + "]";
   }
   public UsersDto(String id, String pw, String name, String email, String address, String phone, int useyn) {
      super();
      this.id = id;
      this.pw = pw;
      this.name = name;
      this.email = email;
      this.address = address;
      this.phone = phone;
      this.useyn = useyn;
   }
   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((regdate == null) ? 0 : regdate.hashCode());
      return result;
   }
   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      UsersDto other = (UsersDto) obj;
      if (regdate == null) {
         if (other.regdate != null)
            return false;
      } else if (!regdate.equals(other.regdate))
         return false;
      return true;
   }
   public void setPw(String pw) {
      this.pw = pw;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getEmail() {
      return email;
   }
   public void setEmail(String email) {
      this.email = email;
   }
   public String getAddress() {
      return address;
   }
   public void setAddress(String address) {
      this.address = address;
   }
   public String getPhone() {
      return phone;
   }
   public void setPhone(String phone) {
      this.phone = phone;
   }
   public int getUseyn() {
      return useyn;
   }
   public void setUseyn(int useyn) {
      this.useyn = useyn;
   }
}