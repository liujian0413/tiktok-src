package com.bytedance.frameworks.baselib.network.http.p512a.p513a;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.bytedance.frameworks.baselib.network.http.a.a.h */
public final class C10120h extends SSLSocketFactory {

    /* renamed from: b */
    private static final String[] f27550b = {"TLSv1.2"};

    /* renamed from: a */
    final SSLSocketFactory f27551a;

    public final String[] getDefaultCipherSuites() {
        return this.f27551a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f27551a.getSupportedCipherSuites();
    }

    public C10120h(SSLSocketFactory sSLSocketFactory) {
        this.f27551a = sSLSocketFactory;
    }

    /* renamed from: a */
    private static Socket m30043a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(f27550b);
        }
        return socket;
    }

    public final Socket createSocket(String str, int i) throws IOException {
        return m30043a(this.f27551a.createSocket(str, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return m30043a(this.f27551a.createSocket(inetAddress, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return m30043a(this.f27551a.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return m30043a(this.f27551a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return m30043a(this.f27551a.createSocket(socket, str, i, z));
    }
}
