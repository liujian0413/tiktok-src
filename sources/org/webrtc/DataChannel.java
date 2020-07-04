package org.webrtc;

import java.nio.ByteBuffer;

public class DataChannel {
    private long nativeDataChannel;
    private long nativeObserver;

    public static class Buffer {
        public final boolean binary;
        public final ByteBuffer data;

        public Buffer(ByteBuffer byteBuffer, boolean z) {
            this.data = byteBuffer;
            this.binary = z;
        }
    }

    public static class Init {

        /* renamed from: id */
        public int f123505id = -1;
        public int maxRetransmitTimeMs = -1;
        public int maxRetransmits = -1;
        public boolean negotiated;
        public boolean ordered = true;
        public String protocol = "";

        /* access modifiers changed from: 0000 */
        public int getId() {
            return this.f123505id;
        }

        /* access modifiers changed from: 0000 */
        public int getMaxRetransmitTimeMs() {
            return this.maxRetransmitTimeMs;
        }

        /* access modifiers changed from: 0000 */
        public int getMaxRetransmits() {
            return this.maxRetransmits;
        }

        /* access modifiers changed from: 0000 */
        public boolean getNegotiated() {
            return this.negotiated;
        }

        /* access modifiers changed from: 0000 */
        public boolean getOrdered() {
            return this.ordered;
        }

        /* access modifiers changed from: 0000 */
        public String getProtocol() {
            return this.protocol;
        }
    }

    public interface Observer {
        void onBufferedAmountChange(long j);

        void onMessage(Buffer buffer);

        void onStateChange();
    }

    public enum State {
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED;

        static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    private native long nativeBufferedAmount();

    private native void nativeClose();

    private native int nativeId();

    private native String nativeLabel();

    private native long nativeRegisterObserver(Observer observer);

    private native boolean nativeSend(byte[] bArr, boolean z);

    private native State nativeState();

    private native void nativeUnregisterObserver(long j);

    /* access modifiers changed from: 0000 */
    public long getNativeDataChannel() {
        return this.nativeDataChannel;
    }

    public long bufferedAmount() {
        checkDataChannelExists();
        return nativeBufferedAmount();
    }

    public void close() {
        checkDataChannelExists();
        nativeClose();
    }

    /* renamed from: id */
    public int mo122383id() {
        checkDataChannelExists();
        return nativeId();
    }

    public String label() {
        checkDataChannelExists();
        return nativeLabel();
    }

    public State state() {
        checkDataChannelExists();
        return nativeState();
    }

    public void dispose() {
        checkDataChannelExists();
        JniCommon.nativeReleaseRef(this.nativeDataChannel);
        this.nativeDataChannel = 0;
    }

    public void unregisterObserver() {
        checkDataChannelExists();
        nativeUnregisterObserver(this.nativeObserver);
    }

    private void checkDataChannelExists() {
        if (this.nativeDataChannel == 0) {
            throw new IllegalStateException("DataChannel has been disposed.");
        }
    }

    public DataChannel(long j) {
        this.nativeDataChannel = j;
    }

    public void registerObserver(Observer observer) {
        checkDataChannelExists();
        if (this.nativeObserver != 0) {
            nativeUnregisterObserver(this.nativeObserver);
        }
        this.nativeObserver = nativeRegisterObserver(observer);
    }

    public boolean send(Buffer buffer) {
        checkDataChannelExists();
        byte[] bArr = new byte[buffer.data.remaining()];
        buffer.data.get(bArr);
        return nativeSend(bArr, buffer.binary);
    }
}
