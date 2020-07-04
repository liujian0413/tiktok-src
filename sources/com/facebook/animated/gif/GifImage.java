package com.facebook.animated.gif;

import com.facebook.common.internal.C13307g;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo.BlendOperation;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo.DisposalMethod;
import com.facebook.imagepipeline.animated.base.C13541d;
import com.facebook.imagepipeline.animated.p712a.C13521c;
import com.facebook.imageutils.C6492b;
import java.nio.ByteBuffer;

public class GifImage implements C13521c, C13541d {
    private static volatile boolean sInitialized;
    private long mNativeContext;

    public GifImage() {
    }

    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native GifImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native GifFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    public void dispose() {
        nativeDispose();
    }

    public boolean doesRenderSupportScaling() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        nativeFinalize();
    }

    public int getDuration() {
        return nativeGetDuration();
    }

    public int getFrameCount() {
        return nativeGetFrameCount();
    }

    public int[] getFrameDurations() {
        return nativeGetFrameDurations();
    }

    public int getHeight() {
        return nativeGetHeight();
    }

    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    public int getWidth() {
        return nativeGetWidth();
    }

    private static synchronized void ensure() {
        synchronized (GifImage.class) {
            if (!sInitialized) {
                sInitialized = true;
                C6492b.m20177a("gifimage");
            }
        }
    }

    public int getLoopCount() {
        int nativeGetLoopCount = nativeGetLoopCount();
        switch (nativeGetLoopCount) {
            case -1:
                return 1;
            case 0:
                return 0;
            default:
                return nativeGetLoopCount + 1;
        }
    }

    GifImage(long j) {
        this.mNativeContext = j;
    }

    public GifFrame getFrame(int i) {
        return nativeGetFrame(i);
    }

    public static GifImage create(ByteBuffer byteBuffer) {
        ensure();
        byteBuffer.rewind();
        return nativeCreateFromDirectByteBuffer(byteBuffer);
    }

    public C13541d decode(ByteBuffer byteBuffer) {
        return create(byteBuffer);
    }

    private static DisposalMethod fromGifDisposalMethod(int i) {
        if (i == 0) {
            return DisposalMethod.DISPOSE_DO_NOT;
        }
        if (i == 1) {
            return DisposalMethod.DISPOSE_DO_NOT;
        }
        if (i == 2) {
            return DisposalMethod.DISPOSE_TO_BACKGROUND;
        }
        if (i == 3) {
            return DisposalMethod.DISPOSE_TO_PREVIOUS;
        }
        return DisposalMethod.DISPOSE_DO_NOT;
    }

    public static GifImage create(byte[] bArr) {
        ensure();
        C13307g.m38940a(bArr);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        return nativeCreateFromDirectByteBuffer(allocateDirect);
    }

    public AnimatedDrawableFrameInfo getFrameInfo(int i) {
        GifFrame frame = getFrame(i);
        try {
            AnimatedDrawableFrameInfo animatedDrawableFrameInfo = new AnimatedDrawableFrameInfo(i, frame.mo32255d(), frame.mo32256e(), frame.mo32253b(), frame.mo32254c(), BlendOperation.BLEND_WITH_PREVIOUS, fromGifDisposalMethod(frame.mo32257f()));
            return animatedDrawableFrameInfo;
        } finally {
            frame.mo32251a();
        }
    }

    public C13541d decode(long j, int i) {
        return create(j, i);
    }

    public static GifImage create(long j, int i) {
        boolean z;
        ensure();
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        return nativeCreateFromNativeMemory(j, i);
    }
}
