package com.zerotoismail.learningspringbootmvc.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @NotBlank(message = "Please enter first Name")
    @Size(min = 3, message = "At least 3 character")
    private String firstName;

    @NotBlank(message = "Please enter last name")
    @Size(min = 3, message = "At least 3 character")
    private String lastName;

    @NotBlank(message = "Please enter email")
    @Email(message = "Invalid email please check again")
    private String email;

    @NotBlank(message = "Please select country")
    private String country;

    @NotBlank(message = "Please select gender")
    private String gender;

    @NotEmpty(message = "Please select at least 1 skill")
    private List<String> skills;
}
