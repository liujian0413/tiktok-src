package com.snapchat.kit.sdk.core.networking;

public interface AuthTokenManager {
    boolean hasAccessToScope(String str);

    boolean isUserLoggedIn();

    void revokeToken();

    void startTokenGrant();
}
