package org.apache.commons.net.pop3;

public class ExtendedPOP3Client extends POP3SClient {

    public enum AUTH_METHOD {
        PLAIN("PLAIN"),
        CRAM_MD5("CRAM-MD5");
        
        private final String methodName;

        public final String getAuthName() {
            return this.methodName;
        }

        private AUTH_METHOD(String str) {
            this.methodName = str;
        }
    }
}
