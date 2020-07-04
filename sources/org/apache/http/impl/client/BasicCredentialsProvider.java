package org.apache.http.impl.client;

import java.util.HashMap;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.client.CredentialsProvider;

public class BasicCredentialsProvider implements CredentialsProvider {
    private final HashMap<AuthScope, Credentials> credMap = new HashMap<>();

    public String toString() {
        return this.credMap.toString();
    }

    public synchronized Credentials getCredentials(AuthScope authScope) {
        if (authScope != null) {
        } else {
            throw new IllegalArgumentException("Authentication scope may not be null");
        }
        return matchCredentials(this.credMap, authScope);
    }

    private static Credentials matchCredentials(HashMap<AuthScope, Credentials> hashMap, AuthScope authScope) {
        Credentials credentials = (Credentials) hashMap.get(authScope);
        if (credentials != null) {
            return credentials;
        }
        int i = -1;
        AuthScope authScope2 = null;
        for (AuthScope authScope3 : hashMap.keySet()) {
            int match = authScope.match(authScope3);
            if (match > i) {
                authScope2 = authScope3;
                i = match;
            }
        }
        if (authScope2 != null) {
            return (Credentials) hashMap.get(authScope2);
        }
        return credentials;
    }
}
