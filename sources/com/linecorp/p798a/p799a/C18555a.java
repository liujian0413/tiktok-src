package com.linecorp.p798a.p799a;

import android.os.Build.VERSION;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.linecorp.a.a.a */
public final class C18555a extends SSLSocketFactory {

    /* renamed from: a */
    private static final String[] f50158a = {"RC4", "DES", "PSK", "_DHE_"};

    /* renamed from: b */
    private final SSLSocketFactory f50159b;

    /* renamed from: c */
    private boolean f50160c;

    /* renamed from: d */
    private Class<?> f50161d;

    /* renamed from: e */
    private Method f50162e;

    /* renamed from: com.linecorp.a.a.a$a */
    static class C18556a extends SSLSocket {

        /* renamed from: a */
        protected final SSLSocket f50163a;

        public SocketChannel getChannel() {
            return this.f50163a.getChannel();
        }

        public boolean getEnableSessionCreation() {
            return this.f50163a.getEnableSessionCreation();
        }

        public String[] getEnabledCipherSuites() {
            return this.f50163a.getEnabledCipherSuites();
        }

        public String[] getEnabledProtocols() {
            return this.f50163a.getEnabledProtocols();
        }

        public InetAddress getInetAddress() {
            return this.f50163a.getInetAddress();
        }

        public InputStream getInputStream() {
            return this.f50163a.getInputStream();
        }

        public boolean getKeepAlive() {
            return this.f50163a.getKeepAlive();
        }

        public InetAddress getLocalAddress() {
            return this.f50163a.getLocalAddress();
        }

        public int getLocalPort() {
            return this.f50163a.getLocalPort();
        }

        public SocketAddress getLocalSocketAddress() {
            return this.f50163a.getLocalSocketAddress();
        }

        public boolean getNeedClientAuth() {
            return this.f50163a.getNeedClientAuth();
        }

        public boolean getOOBInline() {
            return this.f50163a.getOOBInline();
        }

        public OutputStream getOutputStream() {
            return this.f50163a.getOutputStream();
        }

        public int getPort() {
            return this.f50163a.getPort();
        }

        public SocketAddress getRemoteSocketAddress() {
            return this.f50163a.getRemoteSocketAddress();
        }

        public boolean getReuseAddress() {
            return this.f50163a.getReuseAddress();
        }

        public SSLSession getSession() {
            return this.f50163a.getSession();
        }

        public int getSoLinger() {
            return this.f50163a.getSoLinger();
        }

        public String[] getSupportedCipherSuites() {
            return this.f50163a.getSupportedCipherSuites();
        }

        public String[] getSupportedProtocols() {
            return this.f50163a.getSupportedProtocols();
        }

        public boolean getTcpNoDelay() {
            return this.f50163a.getTcpNoDelay();
        }

        public int getTrafficClass() {
            return this.f50163a.getTrafficClass();
        }

        public boolean getUseClientMode() {
            return this.f50163a.getUseClientMode();
        }

        public boolean getWantClientAuth() {
            return this.f50163a.getWantClientAuth();
        }

        public boolean isBound() {
            return this.f50163a.isBound();
        }

        public boolean isClosed() {
            return this.f50163a.isClosed();
        }

        public boolean isConnected() {
            return this.f50163a.isConnected();
        }

        public boolean isInputShutdown() {
            return this.f50163a.isInputShutdown();
        }

        public boolean isOutputShutdown() {
            return this.f50163a.isOutputShutdown();
        }

        public void shutdownInput() {
            this.f50163a.shutdownInput();
        }

        public void shutdownOutput() {
            this.f50163a.shutdownOutput();
        }

        public void startHandshake() {
            this.f50163a.startHandshake();
        }

        public String toString() {
            return this.f50163a.toString();
        }

        public synchronized void close() {
            this.f50163a.close();
        }

        public synchronized int getReceiveBufferSize() {
            return this.f50163a.getReceiveBufferSize();
        }

        public synchronized int getSendBufferSize() {
            return this.f50163a.getSendBufferSize();
        }

        public synchronized int getSoTimeout() {
            return this.f50163a.getSoTimeout();
        }

        C18556a(SSLSocket sSLSocket) {
            this.f50163a = sSLSocket;
        }

        public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
            this.f50163a.addHandshakeCompletedListener(handshakeCompletedListener);
        }

        public void bind(SocketAddress socketAddress) {
            this.f50163a.bind(socketAddress);
        }

        public void connect(SocketAddress socketAddress) {
            this.f50163a.connect(socketAddress);
        }

        public boolean equals(Object obj) {
            return this.f50163a.equals(obj);
        }

        public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
            this.f50163a.removeHandshakeCompletedListener(handshakeCompletedListener);
        }

        public void sendUrgentData(int i) {
            this.f50163a.sendUrgentData(i);
        }

        public void setEnableSessionCreation(boolean z) {
            this.f50163a.setEnableSessionCreation(z);
        }

        public void setEnabledCipherSuites(String[] strArr) {
            this.f50163a.setEnabledCipherSuites(strArr);
        }

        public void setEnabledProtocols(String[] strArr) {
            this.f50163a.setEnabledProtocols(strArr);
        }

        public void setKeepAlive(boolean z) {
            this.f50163a.setKeepAlive(z);
        }

        public void setNeedClientAuth(boolean z) {
            this.f50163a.setNeedClientAuth(z);
        }

        public void setOOBInline(boolean z) {
            this.f50163a.setOOBInline(z);
        }

        public void setReuseAddress(boolean z) {
            this.f50163a.setReuseAddress(z);
        }

        public void setTcpNoDelay(boolean z) {
            this.f50163a.setTcpNoDelay(z);
        }

        public void setTrafficClass(int i) {
            this.f50163a.setTrafficClass(i);
        }

        public void setUseClientMode(boolean z) {
            this.f50163a.setUseClientMode(z);
        }

        public void setWantClientAuth(boolean z) {
            this.f50163a.setWantClientAuth(z);
        }

        public synchronized void setReceiveBufferSize(int i) {
            this.f50163a.setReceiveBufferSize(i);
        }

        public synchronized void setSendBufferSize(int i) {
            this.f50163a.setSendBufferSize(i);
        }

        public synchronized void setSoTimeout(int i) {
            this.f50163a.setSoTimeout(i);
        }

        public void setSoLinger(boolean z, int i) {
            this.f50163a.setSoLinger(z, i);
        }

        public void connect(SocketAddress socketAddress, int i) {
            this.f50163a.connect(socketAddress, i);
        }

        public void setPerformancePreferences(int i, int i2, int i3) {
            this.f50163a.setPerformancePreferences(i, i2, i3);
        }
    }

    /* renamed from: com.linecorp.a.a.a$b */
    static class C18557b extends C18556a {
        private C18557b(SSLSocket sSLSocket) {
            super(sSLSocket);
        }

        public final void setEnabledProtocols(String[] strArr) {
            if (strArr != null && strArr.length == 1 && "SSLv3".equals(strArr[0])) {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.f50163a.getEnabledProtocols()));
                if (arrayList.size() > 1) {
                    arrayList.remove("SSLv3");
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            super.setEnabledProtocols(strArr);
        }

        /* synthetic */ C18557b(SSLSocket sSLSocket, byte b) {
            this(sSLSocket);
        }
    }

    public final Socket createSocket() {
        return m60963a(this.f50159b.createSocket());
    }

    public final String[] getDefaultCipherSuites() {
        if (this.f50160c) {
            return m60965a(this.f50159b.getDefaultCipherSuites());
        }
        return this.f50159b.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        if (this.f50160c) {
            return m60965a(this.f50159b.getSupportedCipherSuites());
        }
        return this.f50159b.getSupportedCipherSuites();
    }

    public C18555a(SSLSocketFactory sSLSocketFactory) {
        this(sSLSocketFactory, 0);
    }

    /* renamed from: a */
    private Socket m60963a(Socket socket) {
        if (!(socket instanceof SSLSocket)) {
            return socket;
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        sSLSocket.setEnabledProtocols(VERSION.SDK_INT < 16 ? new String[]{"TLSv1"} : new String[]{"TLSv1.2"});
        if (this.f50160c) {
            sSLSocket.setEnabledCipherSuites(m60965a(sSLSocket.getEnabledCipherSuites()));
        }
        return new C18557b(sSLSocket, 0);
    }

    /* renamed from: a */
    private static String[] m60965a(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        for (String str : strArr) {
            for (String contains : f50158a) {
                if (str.contains(contains)) {
                    arrayList.remove(str);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.f50159b.createSocket(str, i);
        m60964a(createSocket, str);
        return m60963a(createSocket);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:? A[ExcHandler: NoSuchMethodException (unused java.lang.NoSuchMethodException), SYNTHETIC, Splitter:B:1:0x000c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C18555a(javax.net.ssl.SSLSocketFactory r4, byte r5) {
        /*
            r3 = this;
            r3.<init>()
            r5 = 1
            r3.f50160c = r5
            r3.f50159b = r4
            r3.f50160c = r5
            java.lang.String r4 = "com.android.org.conscrypt.OpenSSLSocketImpl"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x0013, NoSuchMethodException -> 0x002d }
            r3.f50161d = r4     // Catch:{ ClassNotFoundException -> 0x0013, NoSuchMethodException -> 0x002d }
            goto L_0x001b
        L_0x0013:
            java.lang.String r4 = "org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x002e, NoSuchMethodException -> 0x002d }
            r3.f50161d = r4     // Catch:{ ClassNotFoundException -> 0x002e, NoSuchMethodException -> 0x002d }
        L_0x001b:
            java.lang.Class<?> r4 = r3.f50161d     // Catch:{ ClassNotFoundException -> 0x002e, NoSuchMethodException -> 0x002d }
            java.lang.String r0 = "setHostname"
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x002e, NoSuchMethodException -> 0x002d }
            r1 = 0
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r5[r1] = r2     // Catch:{ ClassNotFoundException -> 0x002e, NoSuchMethodException -> 0x002d }
            java.lang.reflect.Method r4 = r4.getMethod(r0, r5)     // Catch:{ ClassNotFoundException -> 0x002e, NoSuchMethodException -> 0x002d }
            r3.f50162e = r4     // Catch:{ ClassNotFoundException -> 0x002e, NoSuchMethodException -> 0x002d }
            return
        L_0x002d:
            return
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.linecorp.p798a.p799a.C18555a.<init>(javax.net.ssl.SSLSocketFactory, byte):void");
    }

    /* renamed from: a */
    private void m60964a(Socket socket, String str) {
        if (this.f50161d.isInstance(socket) && this.f50162e != null) {
            try {
                this.f50162e.invoke(socket, new Object[]{str});
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        return m60963a(this.f50159b.createSocket(inetAddress, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.f50159b.createSocket(str, i, inetAddress, i2);
        m60964a(createSocket, str);
        return m60963a(createSocket);
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return m60963a(this.f50159b.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.f50159b.createSocket(socket, str, i, z);
        m60964a(createSocket, str);
        return m60963a(createSocket);
    }
}
