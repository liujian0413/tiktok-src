package com.p280ss.avframework.transport;

import com.p280ss.avframework.engine.Transport.FeedbackObserver;
import com.p280ss.avframework.statics.StaticsReport;
import com.p280ss.avframework.utils.AVLog;
import com.p280ss.avframework.utils.JNINamespace;
import java.nio.Buffer;
import org.json.JSONArray;
import org.json.JSONObject;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.transport.LibRTMPTransport */
public class LibRTMPTransport extends NativeTransport {
    private native int nativeAddSeiField(String str, Object obj, int i);

    private native void nativeCreateNative(boolean z, boolean z2);

    private native long nativeGetInt64Value(int i);

    private native String nativeGetLocalIP();

    private native String nativeGetRemoteIP();

    private native boolean nativeGetStaticsReport(StaticsReport staticsReport);

    private native void nativeReleaseNative();

    private native int nativeSendSeiMsg(String str);

    private native boolean nativeSetupUrl(String str);

    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    public String getLocalIP() {
        return nativeGetLocalIP();
    }

    public String getRemoteIP() {
        return nativeGetRemoteIP();
    }

    public /* bridge */ /* synthetic */ void registerFeedbackObserber(FeedbackObserver feedbackObserver) {
        super.registerFeedbackObserber(feedbackObserver);
    }

    public /* bridge */ /* synthetic */ void unRegisterFeedbackObserber(FeedbackObserver feedbackObserver) {
        super.unRegisterFeedbackObserber(feedbackObserver);
    }

    public long getInt64Value(int i) {
        return nativeGetInt64Value(i);
    }

    public boolean getStaticsReport(StaticsReport staticsReport) {
        super.getStaticsReport(staticsReport);
        return nativeGetStaticsReport(staticsReport);
    }

    public int sendSeiMsg(String str) {
        if (str == null) {
            return -2;
        }
        return nativeSendSeiMsg(str);
    }

    public boolean setupUrl(String str) {
        boolean z;
        if (str != null) {
            z = nativeSetupUrl(str);
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder("Setup url ");
        sb.append(str);
        AVLog.iod("LibRTMPTransport", sb.toString());
        StringBuilder sb2 = new StringBuilder("config:");
        sb2.append(getParameter().toString());
        AVLog.iod("LibRTMPTransport", sb2.toString());
        return z;
    }

    public /* bridge */ /* synthetic */ void sendPacket(Buffer buffer, int i) {
        super.sendPacket(buffer, i);
    }

    public LibRTMPTransport(boolean z, boolean z2) {
        nativeCreateNative(z, z2);
    }

    public int addSeiField(String str, Object obj, int i) {
        if (obj == null || (obj instanceof Boolean) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof JSONObject) || (obj instanceof JSONArray)) {
            return nativeAddSeiField(str, obj, i);
        }
        return -2;
    }
}
