package guru.springframework.springrestclientexamples.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ExpirationDate {

  private LocalDateTime date;
  private int timezone_type;
  private String timezone;
}
