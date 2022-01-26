package guru.springframework.springrestclientexamples.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Card {

  private String type;
  private String number;
  private ExpirationDate expiration_date;
  private String iban;
  private String swift;
}
