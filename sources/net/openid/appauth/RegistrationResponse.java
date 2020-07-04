package net.openid.appauth;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class RegistrationResponse {

    /* renamed from: a */
    public static final Set<String> f123219a = new HashSet(Arrays.asList(new String[]{"client_id", "client_secret", "client_secret_expires_at", "registration_access_token", "registration_client_uri", "client_id_issued_at", "token_endpoint_auth_method"}));

    public static class MissingArgumentException extends Exception {
        private String mMissingField;

        public String getMissingField() {
            return this.mMissingField;
        }

        public MissingArgumentException(String str) {
            StringBuilder sb = new StringBuilder("Missing mandatory registration field: ");
            sb.append(str);
            super(sb.toString());
            this.mMissingField = str;
        }
    }
}
