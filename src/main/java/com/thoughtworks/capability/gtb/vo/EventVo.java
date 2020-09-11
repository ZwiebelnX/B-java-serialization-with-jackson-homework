package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventVo {

  private String id;
  private String name;
  private EventType type;
  private Date time;
  @JsonUnwrapped
  private UserVo user;

  public long getTime() {
    return this.time.getTime();
  }

  public String getType() {
    return type.getCode();
  }
}
