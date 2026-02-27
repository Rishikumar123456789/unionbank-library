package com.unionbank;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountOpenRequest {
   private String name;
   private Integer age;
   private String gender;
   private String accountType;
   private String branchCode;
   private BigDecimal minimumBalance;

   
   
}
