package org.apache.commons.net.imap;

public class AuthenticatingIMAPClient extends IMAPSClient {

    public enum AUTH_METHOD {
        PLAIN("PLAIN"),
        CRAM_MD5("CRAM-MD5"),
        LOGIN("LOGIN"),
        XOAUTH("XOAUTH");
        
        private final String authName;

        public final String getAuthName() {
            return this.authName;
        }

        private AUTH_METHOD(String str) {
            this.authName = str;
        }
    }
}
