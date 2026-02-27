package com.unionbank;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountOpenEvent {
  private Long accountNumber;
  private String name;
  private BigDecimal balance; 
}
