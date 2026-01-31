package org.example.backend.security;

import org.example.backend.user.User;
import org.example.backend.user.UserRepository;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

@Service
public class CustomOAuth2UserService extends DefaultOAuth2UserService {

    private final UserRepository userRepository;

    public CustomOAuth2UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public OAuth2User loadUser(OAuth2UserRequest request) throws OAuth2AuthenticationException {
        OAuth2User oAuth2User = super.loadUser(request);

        String provider = request.getClientRegistration().getRegistrationId();
        String providerId = oAuth2User.getAttribute("sub");

        User user = userRepository.findByOAuthProviderAndOauthProviderId(provider,providerId).orElseGet(() -> {
            User newUser = new User();
            newUser.setOauthProvider(provider);
            newUser.setOauthProvider(providerId);
            return userRepository.save(newUser);
        });

        return new UserPrincipal(user,oAuth2User.getAttributes());
    }
}
