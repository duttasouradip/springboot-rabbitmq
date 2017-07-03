package com.sd.springbootrabbitmq.model;

public class Department {

  private String departmentName;

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Department [departmentName=");
    builder.append(departmentName);
    builder.append("]");
    return builder.toString();
  }
}
