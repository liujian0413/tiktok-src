package com.p280ss.avframework.engine;

import com.p280ss.avframework.statics.StaticsReport;
import com.p280ss.avframework.statics.StaticsReport.StaticReportInterface;
import com.p280ss.avframework.utils.JNINamespace;
import com.p280ss.avframework.utils.TEBundle;
import java.nio.Buffer;
import java.nio.ByteBuffer;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.engine.Transport */
public abstract class Transport extends NativeObject implements StaticReportInterface {
    private EventObserver mObserver;

    /* renamed from: com.ss.avframework.engine.Transport$EventObserver */
    public interface EventObserver {
        void onTransportEvent(int i, int i2, long j, String str);
    }

    /* renamed from: com.ss.avframework.engine.Transport$FeedbackObserver */
    public abstract class FeedbackObserver {
        /* access modifiers changed from: protected */
        public abstract void onFeedback(String str);

        public FeedbackObserver() {
        }
    }

    /* renamed from: com.ss.avframework.engine.Transport$MediaPacket */
    public static class MediaPacket {
        public ByteBuffer buffer;
        public int flags;
        public boolean isVideo;
        public int offset;
        public long presentationTimeUs;
        public int size;

        public void set(ByteBuffer byteBuffer, boolean z, int i, int i2, long j, int i3) {
            this.buffer = byteBuffer;
            this.offset = i;
            this.size = i2;
            this.presentationTimeUs = j;
            this.flags = i3;
            this.isVideo = z;
        }
    }

    private native TEBundle nativeGetParameter();

    private native void nativeSetParameter(TEBundle tEBundle);

    public int addSeiField(String str, Object obj, int i) {
        return 0;
    }

    public long getInt64Value(int i) {
        return 0;
    }

    public String getLocalIP() {
        return null;
    }

    public String getRemoteIP() {
        return null;
    }

    public boolean getStaticsReport(StaticsReport staticsReport) {
        return false;
    }

    public abstract void registerFeedbackObserber(FeedbackObserver feedbackObserver);

    public void sendPacket(MediaPacket mediaPacket) {
    }

    public void sendPacket(Buffer buffer, int i) {
    }

    public int sendSeiMsg(String str) {
        return 0;
    }

    public boolean setupUrl(String str) {
        return false;
    }

    public abstract void unRegisterFeedbackObserber(FeedbackObserver feedbackObserver);

    public TEBundle getParameter() {
        return nativeGetParameter();
    }

    public void setEventObserver(EventObserver eventObserver) {
        this.mObserver = eventObserver;
    }

    public void setParameter(TEBundle tEBundle) {
        nativeSetParameter(tEBundle);
    }

    private void onEvent(int i, int i2, long j, String str) {
        if (this.mObserver != null) {
            this.mObserver.onTransportEvent(i, i2, j, str);
        }
    }
}
