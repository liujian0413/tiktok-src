package com.p280ss.avframework.transport;

import android.util.AndroidRuntimeException;
import com.p280ss.avframework.engine.Transport;
import com.p280ss.avframework.engine.Transport.FeedbackObserver;
import java.nio.Buffer;

/* renamed from: com.ss.avframework.transport.NativeTransport */
class NativeTransport extends Transport {
    public synchronized void release() {
        super.release();
    }

    private static boolean isNativeTransportInstence(Object obj) {
        return obj instanceof NativeTransport;
    }

    public void registerFeedbackObserber(FeedbackObserver feedbackObserver) {
        throw new AndroidRuntimeException("Should not be here");
    }

    public void unRegisterFeedbackObserber(FeedbackObserver feedbackObserver) {
        throw new AndroidRuntimeException("Should not be here");
    }

    public void sendPacket(Buffer buffer, int i) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
