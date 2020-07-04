package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.measurement.internal.en */
final class C16923en extends SSLSocketFactory {

    /* renamed from: a */
    private final SSLSocketFactory f47325a;

    C16923en() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private C16923en(SSLSocketFactory sSLSocketFactory) {
        this.f47325a = sSLSocketFactory;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return m56015a((SSLSocket) this.f47325a.createSocket(socket, str, i, z));
    }

    public final String[] getDefaultCipherSuites() {
        return this.f47325a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f47325a.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i) throws IOException {
        return m56015a((SSLSocket) this.f47325a.createSocket(str, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return m56015a((SSLSocket) this.f47325a.createSocket(inetAddress, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return m56015a((SSLSocket) this.f47325a.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return m56015a((SSLSocket) this.f47325a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public final Socket createSocket() throws IOException {
        return m56015a((SSLSocket) this.f47325a.createSocket());
    }

    /* renamed from: a */
    private final SSLSocket m56015a(SSLSocket sSLSocket) {
        return new C16925ep(this, sSLSocket);
    }
}
