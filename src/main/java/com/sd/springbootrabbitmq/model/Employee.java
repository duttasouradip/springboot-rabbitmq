package com.sd.springbootrabbitmq.model;

public class Employee {

  private String name;
  private Address address;
  private Department department;

  public Employee(String name, Address address, Department department) {
    super();
    this.name = name;
    this.address = address;
    this.department = department;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Employee [name=");
    builder.append(name);
    builder.append(", address=");
    builder.append(address);
    builder.append(", department=");
    builder.append(department);
    builder.append("]");
    return builder.toString();
  }

}
