package desafio.itau.springboot.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

public record TransactionRequest(
        @NotNull
        Double valor,
        @NotNull
        OffsetDateTime dataHora) {

}
