package com.bytedance.apm.agent.instrumentation.p463io;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.bytedance.apm.agent.instrumentation.io.CountingOutputStream */
public final class CountingOutputStream extends OutputStream implements StreamCompleteListenerSource {
    private long count;
    private final OutputStream impl;
    private final StreamCompleteListenerManager listenerManager = new StreamCompleteListenerManager();

    public final long getCount() {
        return this.count;
    }

    public final void close() throws IOException {
        try {
            this.impl.close();
            notifyStreamComplete();
        } catch (IOException e) {
            notifyStreamError(e);
            throw e;
        }
    }

    public final void flush() throws IOException {
        try {
            this.impl.flush();
        } catch (IOException e) {
            notifyStreamError(e);
            throw e;
        }
    }

    private void notifyStreamComplete() {
        if (!this.listenerManager.isComplete()) {
            this.listenerManager.notifyStreamComplete(new StreamCompleteEvent(this, this.count));
        }
    }

    public final void addStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        this.listenerManager.addStreamCompleteListener(streamCompleteListener);
    }

    public final void removeStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        this.listenerManager.removeStreamCompleteListener(streamCompleteListener);
    }

    public CountingOutputStream(OutputStream outputStream) {
        this.impl = outputStream;
    }

    private void notifyStreamError(Exception exc) {
        if (!this.listenerManager.isComplete()) {
            this.listenerManager.notifyStreamError(new StreamCompleteEvent(this, this.count, exc));
        }
    }

    public final void write(int i) throws IOException {
        try {
            this.impl.write(i);
            this.count++;
        } catch (IOException e) {
            notifyStreamError(e);
            throw e;
        }
    }

    public final void write(byte[] bArr) throws IOException {
        try {
            this.impl.write(bArr);
            this.count += (long) bArr.length;
        } catch (IOException e) {
            notifyStreamError(e);
            throw e;
        }
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.impl.write(bArr, i, i2);
            this.count += (long) i2;
        } catch (IOException e) {
            notifyStreamError(e);
            throw e;
        }
    }
}
