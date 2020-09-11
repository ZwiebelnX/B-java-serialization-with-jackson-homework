package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.annotation.PostConstruct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonVo {

  private String id;
  private Integer age;
  private String name;
  private String hobby;

  public PersonVo(String id, Integer age, String name, String hobby) {
    this.id = id;
    this.age = age == null ? 0 : age;
    this.name = name;
    this.hobby = hobby;
  }

  public void setAge(Integer age) {
    this.age = age == null ? 0 : age;
  }
}
