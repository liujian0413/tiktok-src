package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

final class akd extends SSLSocketFactory {

    /* renamed from: a */
    private SSLSocketFactory f40480a = ((SSLSocketFactory) SSLSocketFactory.getDefault());

    /* renamed from: b */
    private final /* synthetic */ akb f40481b;

    akd(akb akb) {
        this.f40481b = akb;
    }

    public final String[] getDefaultCipherSuites() {
        return this.f40480a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f40480a.getSupportedCipherSuites();
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return m46181a(this.f40480a.createSocket(socket, str, i, z));
    }

    public final Socket createSocket(String str, int i) throws IOException {
        return m46181a(this.f40480a.createSocket(str, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return m46181a(this.f40480a.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return m46181a(this.f40480a.createSocket(inetAddress, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return m46181a(this.f40480a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    /* renamed from: a */
    private final Socket m46181a(Socket socket) throws SocketException {
        if (this.f40481b.f40478q > 0) {
            socket.setReceiveBufferSize(this.f40481b.f40478q);
        }
        this.f40481b.m46172a(socket);
        return socket;
    }
}
