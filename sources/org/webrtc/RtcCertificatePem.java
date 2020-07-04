package org.webrtc;

import org.webrtc.PeerConnection.KeyType;

public class RtcCertificatePem {
    public final String certificate;
    public final String privateKey;

    private static native RtcCertificatePem nativeGenerateCertificate(KeyType keyType, long j);

    /* access modifiers changed from: 0000 */
    public String getCertificate() {
        return this.certificate;
    }

    /* access modifiers changed from: 0000 */
    public String getPrivateKey() {
        return this.privateKey;
    }

    public static RtcCertificatePem generateCertificate() {
        return nativeGenerateCertificate(KeyType.ECDSA, 2592000);
    }

    public static RtcCertificatePem generateCertificate(long j) {
        return nativeGenerateCertificate(KeyType.ECDSA, j);
    }

    public static RtcCertificatePem generateCertificate(KeyType keyType) {
        return nativeGenerateCertificate(keyType, 2592000);
    }

    public RtcCertificatePem(String str, String str2) {
        this.privateKey = str;
        this.certificate = str2;
    }

    public static RtcCertificatePem generateCertificate(KeyType keyType, long j) {
        return nativeGenerateCertificate(keyType, j);
    }
}
