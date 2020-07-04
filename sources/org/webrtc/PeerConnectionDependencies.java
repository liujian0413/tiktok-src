package org.webrtc;

import org.webrtc.PeerConnection.Observer;

public final class PeerConnectionDependencies {
    private final Observer observer;
    private final SSLCertificateVerifier sslCertificateVerifier;

    public static class Builder {
        private Observer observer;
        private SSLCertificateVerifier sslCertificateVerifier;

        public PeerConnectionDependencies createPeerConnectionDependencies() {
            return new PeerConnectionDependencies(this.observer, this.sslCertificateVerifier);
        }

        public Builder setSSLCertificateVerifier(SSLCertificateVerifier sSLCertificateVerifier) {
            this.sslCertificateVerifier = sSLCertificateVerifier;
            return this;
        }

        private Builder(Observer observer2) {
            this.observer = observer2;
        }
    }

    /* access modifiers changed from: 0000 */
    public final Observer getObserver() {
        return this.observer;
    }

    /* access modifiers changed from: 0000 */
    public final SSLCertificateVerifier getSSLCertificateVerifier() {
        return this.sslCertificateVerifier;
    }

    public static Builder builder(Observer observer2) {
        return new Builder(observer2);
    }

    private PeerConnectionDependencies(Observer observer2, SSLCertificateVerifier sSLCertificateVerifier) {
        this.observer = observer2;
        this.sslCertificateVerifier = sSLCertificateVerifier;
    }
}
