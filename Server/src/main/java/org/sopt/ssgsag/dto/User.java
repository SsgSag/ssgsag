package org.sopt.ssgsag.dto;

import lombok.Data;

@Data
public class User {
    private int userIdx;
    private String name;
    private String email;
    private String profileUrl;
}
