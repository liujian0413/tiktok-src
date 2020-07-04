package org.webrtc;

public final class CryptoOptions {
    private final SFrame sframe;
    private final Srtp srtp;

    public static class Builder {
        private boolean enableAes128Sha1_32CryptoCipher;
        private boolean enableEncryptedRtpHeaderExtensions;
        private boolean enableGcmCryptoSuites;
        private boolean requireFrameEncryption;

        private Builder() {
        }

        public CryptoOptions createCryptoOptions() {
            CryptoOptions cryptoOptions = new CryptoOptions(this.enableGcmCryptoSuites, this.enableAes128Sha1_32CryptoCipher, this.enableEncryptedRtpHeaderExtensions, this.requireFrameEncryption);
            return cryptoOptions;
        }

        public Builder setEnableAes128Sha1_32CryptoCipher(boolean z) {
            this.enableAes128Sha1_32CryptoCipher = z;
            return this;
        }

        public Builder setEnableEncryptedRtpHeaderExtensions(boolean z) {
            this.enableEncryptedRtpHeaderExtensions = z;
            return this;
        }

        public Builder setEnableGcmCryptoSuites(boolean z) {
            this.enableGcmCryptoSuites = z;
            return this;
        }

        public Builder setRequireFrameEncryption(boolean z) {
            this.requireFrameEncryption = z;
            return this;
        }
    }

    public final class SFrame {
        private final boolean requireFrameEncryption;

        public final boolean getRequireFrameEncryption() {
            return this.requireFrameEncryption;
        }

        private SFrame(boolean z) {
            this.requireFrameEncryption = z;
        }
    }

    public final class Srtp {
        private final boolean enableAes128Sha1_32CryptoCipher;
        private final boolean enableEncryptedRtpHeaderExtensions;
        private final boolean enableGcmCryptoSuites;

        public final boolean getEnableAes128Sha1_32CryptoCipher() {
            return this.enableAes128Sha1_32CryptoCipher;
        }

        public final boolean getEnableEncryptedRtpHeaderExtensions() {
            return this.enableEncryptedRtpHeaderExtensions;
        }

        public final boolean getEnableGcmCryptoSuites() {
            return this.enableGcmCryptoSuites;
        }

        private Srtp(boolean z, boolean z2, boolean z3) {
            this.enableGcmCryptoSuites = z;
            this.enableAes128Sha1_32CryptoCipher = z2;
            this.enableEncryptedRtpHeaderExtensions = z3;
        }
    }

    public final SFrame getSFrame() {
        return this.sframe;
    }

    public final Srtp getSrtp() {
        return this.srtp;
    }

    public static Builder builder() {
        return new Builder();
    }

    private CryptoOptions(boolean z, boolean z2, boolean z3, boolean z4) {
        Srtp srtp2 = new Srtp(z, z2, z3);
        this.srtp = srtp2;
        this.sframe = new SFrame(z4);
    }
}
