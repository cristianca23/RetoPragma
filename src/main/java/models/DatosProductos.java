package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosProductos(
        @JsonProperty("nombre") String nombre,
        @JsonProperty("valor") String valor
) {
}
