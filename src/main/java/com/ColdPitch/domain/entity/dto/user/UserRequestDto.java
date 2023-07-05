package com.ColdPitch.domain.entity.dto.user;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class UserRequestDto {
    @NotNull
    @NotBlank
    private String nickname;
    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @NotBlank
    private String password;
    @NotNull
    @Email
    @NotBlank
    private String email;

    private String phoneNumber;
    @NotNull
    @NotBlank
    private String userType;

}
