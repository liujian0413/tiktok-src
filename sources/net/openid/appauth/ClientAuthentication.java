package net.openid.appauth;

import java.util.Map;

public interface ClientAuthentication {

    public static class UnsupportedAuthenticationMethod extends Exception {
        private String mAuthMethod;

        public String getUnsupportedAuthenticationMethod() {
            return this.mAuthMethod;
        }

        public UnsupportedAuthenticationMethod(String str) {
            StringBuilder sb = new StringBuilder("Unsupported client authentication method: ");
            sb.append(str);
            super(sb.toString());
            this.mAuthMethod = str;
        }
    }

    /* renamed from: a */
    Map<String, String> mo120611a(String str);
}
