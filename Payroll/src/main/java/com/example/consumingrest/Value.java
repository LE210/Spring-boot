package com.example.consumingrest;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private Long id;
    private String quote;

    public Value() {}

    @Override
    public String toString() {
        return "Value{ id=" + id + ", quote='" + quote + "\' }";
    }
}
