package com.xworkz.institute;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor

@Data
public class TraineeDto {
   private int traineeId;
   private String traineeName;
   private String address;
   private int age;
}
