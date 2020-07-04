package com.zego.zegoavkit2.videofilter;

import android.graphics.SurfaceTexture;
import java.nio.ByteBuffer;

public abstract class ZegoVideoFilter {

    public interface Client {
        int dequeueInputBuffer(int i, int i2, int i3);

        void destroy();

        ByteBuffer getInputBuffer(int i);

        SurfaceTexture getSurfaceTexture();

        void onProcessCallback(int i, int i2, int i3, long j);

        void queueInputBuffer(int i, int i2, int i3, int i4, long j);
    }

    /* access modifiers changed from: protected */
    public abstract void allocateAndStart(Client client);

    /* access modifiers changed from: protected */
    public abstract int dequeueInputBuffer(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract ByteBuffer getInputBuffer(int i);

    /* access modifiers changed from: protected */
    public abstract SurfaceTexture getSurfaceTexture();

    /* access modifiers changed from: protected */
    public abstract void onProcessCallback(int i, int i2, int i3, long j);

    /* access modifiers changed from: protected */
    public abstract void queueInputBuffer(int i, int i2, int i3, int i4, long j);

    /* access modifiers changed from: protected */
    public abstract void stopAndDeAllocate();

    /* access modifiers changed from: protected */
    public abstract int supportBufferType();
}
