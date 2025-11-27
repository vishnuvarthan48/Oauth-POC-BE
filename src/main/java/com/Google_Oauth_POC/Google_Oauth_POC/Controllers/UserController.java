package com.Google_Oauth_POC.Google_Oauth_POC.Controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/api/user/me")
    public Object getCurrentUser(@AuthenticationPrincipal OAuth2User principal) {
        if (principal == null) {
            return null;
        }
        return principal.getAttributes();
    }
}
