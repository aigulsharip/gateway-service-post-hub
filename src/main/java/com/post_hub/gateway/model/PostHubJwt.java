package com.post_hub.gateway.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PostHubJwt {
    private JwtType type;
    private String jwt;

}
