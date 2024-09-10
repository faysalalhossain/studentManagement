package com.studentMaagement.entity;

public class Information {
   private String name;
   private int id;
   private long roll;

   public Information(String name,int id,long roll) {
      this.name= name;
      this.id=id;
      this.roll=roll;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public long getRoll() {
      return roll;
   }

   public void setRoll(long roll) {
      this.roll = roll;
   }
}
