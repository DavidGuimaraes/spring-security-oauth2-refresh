package co.davidguimaraes.oauthrefreshjwtdemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hello {

    private BigInteger id;
    private String message;
}
