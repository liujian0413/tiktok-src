package com.bytedance.apm.agent.instrumentation.p463io;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.apm.agent.instrumentation.io.StreamCompleteListenerManager */
class StreamCompleteListenerManager {
    private boolean streamComplete;
    private ArrayList<StreamCompleteListener> streamCompleteListeners = new ArrayList<>();

    public boolean isComplete() {
        boolean z;
        synchronized (this) {
            z = this.streamComplete;
        }
        return z;
    }

    StreamCompleteListenerManager() {
    }

    private boolean checkComplete() {
        boolean isComplete;
        synchronized (this) {
            isComplete = isComplete();
            if (!isComplete) {
                this.streamComplete = true;
            }
        }
        return isComplete;
    }

    private List<StreamCompleteListener> getStreamCompleteListeners() {
        ArrayList arrayList;
        synchronized (this.streamCompleteListeners) {
            arrayList = new ArrayList(this.streamCompleteListeners);
            this.streamCompleteListeners.clear();
        }
        return arrayList;
    }

    public void addStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        synchronized (this.streamCompleteListeners) {
            this.streamCompleteListeners.add(streamCompleteListener);
        }
    }

    public void removeStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        synchronized (this.streamCompleteListeners) {
            this.streamCompleteListeners.remove(streamCompleteListener);
        }
    }

    public void notifyStreamComplete(StreamCompleteEvent streamCompleteEvent) {
        if (!checkComplete()) {
            for (StreamCompleteListener streamComplete2 : getStreamCompleteListeners()) {
                streamComplete2.streamComplete(streamCompleteEvent);
            }
        }
    }

    public void notifyStreamError(StreamCompleteEvent streamCompleteEvent) {
        if (!checkComplete()) {
            for (StreamCompleteListener streamError : getStreamCompleteListeners()) {
                streamError.streamError(streamCompleteEvent);
            }
        }
    }
}
