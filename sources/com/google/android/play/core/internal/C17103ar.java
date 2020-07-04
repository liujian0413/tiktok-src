package com.google.android.play.core.internal;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* renamed from: com.google.android.play.core.internal.ar */
final class C17103ar extends C17102aq {

    /* renamed from: a */
    private byte[] f47811a;

    public C17103ar(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f47811a = bArr;
    }

    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.f47811a;
    }
}
