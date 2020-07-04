package com.bytedance.ies.ugc.aweme.network;

import android.os.Build.VERSION;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.bytedance.ies.ugc.aweme.network.i */
public final class C10964i extends SSLSocketFactory {

    /* renamed from: a */
    static String[] f29668a;

    /* renamed from: b */
    static String[] f29669b;

    /* renamed from: c */
    private SSLSocketFactory f29670c;

    public final String[] getDefaultCipherSuites() {
        return f29669b;
    }

    public final String[] getSupportedCipherSuites() {
        return f29669b;
    }

    static {
        String[] supportedProtocols;
        try {
            SSLSocket sSLSocket = (SSLSocket) SSLSocketFactory.getDefault().createSocket();
            if (sSLSocket != null) {
                LinkedList linkedList = new LinkedList();
                for (String str : sSLSocket.getSupportedProtocols()) {
                    if (!str.toUpperCase().contains("SSL")) {
                        linkedList.add(str);
                    }
                }
                f29668a = (String[]) linkedList.toArray(new String[linkedList.size()]);
                if (VERSION.SDK_INT < 21) {
                    List asList = Arrays.asList(new String[]{"TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECHDE_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA"});
                    List asList2 = Arrays.asList(sSLSocket.getSupportedCipherSuites());
                    HashSet hashSet = new HashSet(asList);
                    hashSet.retainAll(asList2);
                    hashSet.addAll(new HashSet(Arrays.asList(sSLSocket.getEnabledCipherSuites())));
                    f29669b = (String[]) hashSet.toArray(new String[hashSet.size()]);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public C10964i(X509TrustManager x509TrustManager) {
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(null, new X509TrustManager[]{x509TrustManager}, null);
            this.f29670c = instance.getSocketFactory();
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private static void m32147a(SSLSocket sSLSocket) {
        if (f29668a != null) {
            sSLSocket.setEnabledProtocols(f29668a);
        }
        if (VERSION.SDK_INT < 21 && f29669b != null) {
            sSLSocket.setEnabledCipherSuites(f29669b);
        }
    }

    public final Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        Socket createSocket = this.f29670c.createSocket(str, i);
        if (createSocket instanceof SSLSocket) {
            m32147a((SSLSocket) createSocket);
        }
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket createSocket = this.f29670c.createSocket(inetAddress, i);
        if (createSocket instanceof SSLSocket) {
            m32147a((SSLSocket) createSocket);
        }
        return createSocket;
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        Socket createSocket = this.f29670c.createSocket(str, i, inetAddress, i2);
        if (createSocket instanceof SSLSocket) {
            m32147a((SSLSocket) createSocket);
        }
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket createSocket = this.f29670c.createSocket(inetAddress, i, inetAddress2, i2);
        if (createSocket instanceof SSLSocket) {
            m32147a((SSLSocket) createSocket);
        }
        return createSocket;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.f29670c.createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            m32147a((SSLSocket) createSocket);
        }
        return createSocket;
    }
}
