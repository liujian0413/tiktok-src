package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: com.google.android.gms.measurement.internal.ep */
final class C16925ep extends SSLSocket {

    /* renamed from: a */
    private final SSLSocket f47355a;

    C16925ep(C16923en enVar, SSLSocket sSLSocket) {
        this.f47355a = sSLSocket;
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null && Arrays.asList(strArr).contains("SSLv3")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.f47355a.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        this.f47355a.setEnabledProtocols(strArr);
    }

    public final String[] getSupportedCipherSuites() {
        return this.f47355a.getSupportedCipherSuites();
    }

    public final String[] getEnabledCipherSuites() {
        return this.f47355a.getEnabledCipherSuites();
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.f47355a.setEnabledCipherSuites(strArr);
    }

    public final String[] getSupportedProtocols() {
        return this.f47355a.getSupportedProtocols();
    }

    public final String[] getEnabledProtocols() {
        return this.f47355a.getEnabledProtocols();
    }

    public final SSLSession getSession() {
        return this.f47355a.getSession();
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f47355a.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f47355a.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void startHandshake() throws IOException {
        this.f47355a.startHandshake();
    }

    public final void setUseClientMode(boolean z) {
        this.f47355a.setUseClientMode(z);
    }

    public final boolean getUseClientMode() {
        return this.f47355a.getUseClientMode();
    }

    public final void setNeedClientAuth(boolean z) {
        this.f47355a.setNeedClientAuth(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.f47355a.setWantClientAuth(z);
    }

    public final boolean getNeedClientAuth() {
        return this.f47355a.getNeedClientAuth();
    }

    public final boolean getWantClientAuth() {
        return this.f47355a.getWantClientAuth();
    }

    public final void setEnableSessionCreation(boolean z) {
        this.f47355a.setEnableSessionCreation(z);
    }

    public final boolean getEnableSessionCreation() {
        return this.f47355a.getEnableSessionCreation();
    }

    public final void bind(SocketAddress socketAddress) throws IOException {
        this.f47355a.bind(socketAddress);
    }

    public final synchronized void close() throws IOException {
        this.f47355a.close();
    }

    public final void connect(SocketAddress socketAddress) throws IOException {
        this.f47355a.connect(socketAddress);
    }

    public final void connect(SocketAddress socketAddress, int i) throws IOException {
        this.f47355a.connect(socketAddress, i);
    }

    public final SocketChannel getChannel() {
        return this.f47355a.getChannel();
    }

    public final InetAddress getInetAddress() {
        return this.f47355a.getInetAddress();
    }

    public final InputStream getInputStream() throws IOException {
        return this.f47355a.getInputStream();
    }

    public final boolean getKeepAlive() throws SocketException {
        return this.f47355a.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.f47355a.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.f47355a.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.f47355a.getLocalSocketAddress();
    }

    public final boolean getOOBInline() throws SocketException {
        return this.f47355a.getOOBInline();
    }

    public final OutputStream getOutputStream() throws IOException {
        return this.f47355a.getOutputStream();
    }

    public final int getPort() {
        return this.f47355a.getPort();
    }

    public final synchronized int getReceiveBufferSize() throws SocketException {
        return this.f47355a.getReceiveBufferSize();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.f47355a.getRemoteSocketAddress();
    }

    public final boolean getReuseAddress() throws SocketException {
        return this.f47355a.getReuseAddress();
    }

    public final synchronized int getSendBufferSize() throws SocketException {
        return this.f47355a.getSendBufferSize();
    }

    public final int getSoLinger() throws SocketException {
        return this.f47355a.getSoLinger();
    }

    public final synchronized int getSoTimeout() throws SocketException {
        return this.f47355a.getSoTimeout();
    }

    public final boolean getTcpNoDelay() throws SocketException {
        return this.f47355a.getTcpNoDelay();
    }

    public final int getTrafficClass() throws SocketException {
        return this.f47355a.getTrafficClass();
    }

    public final boolean isBound() {
        return this.f47355a.isBound();
    }

    public final boolean isClosed() {
        return this.f47355a.isClosed();
    }

    public final boolean isConnected() {
        return this.f47355a.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.f47355a.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.f47355a.isOutputShutdown();
    }

    public final void sendUrgentData(int i) throws IOException {
        this.f47355a.sendUrgentData(i);
    }

    public final void setKeepAlive(boolean z) throws SocketException {
        this.f47355a.setKeepAlive(z);
    }

    public final void setOOBInline(boolean z) throws SocketException {
        this.f47355a.setOOBInline(z);
    }

    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.f47355a.setPerformancePreferences(i, i2, i3);
    }

    public final synchronized void setReceiveBufferSize(int i) throws SocketException {
        this.f47355a.setReceiveBufferSize(i);
    }

    public final void setReuseAddress(boolean z) throws SocketException {
        this.f47355a.setReuseAddress(z);
    }

    public final synchronized void setSendBufferSize(int i) throws SocketException {
        this.f47355a.setSendBufferSize(i);
    }

    public final void setSoLinger(boolean z, int i) throws SocketException {
        this.f47355a.setSoLinger(z, i);
    }

    public final synchronized void setSoTimeout(int i) throws SocketException {
        this.f47355a.setSoTimeout(i);
    }

    public final void setTcpNoDelay(boolean z) throws SocketException {
        this.f47355a.setTcpNoDelay(z);
    }

    public final void setTrafficClass(int i) throws SocketException {
        this.f47355a.setTrafficClass(i);
    }

    public final void shutdownInput() throws IOException {
        this.f47355a.shutdownInput();
    }

    public final void shutdownOutput() throws IOException {
        this.f47355a.shutdownOutput();
    }

    public final String toString() {
        return this.f47355a.toString();
    }

    public final boolean equals(Object obj) {
        return this.f47355a.equals(obj);
    }
}
