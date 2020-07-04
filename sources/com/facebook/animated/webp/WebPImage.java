package com.facebook.animated.webp;

import com.facebook.common.internal.C13307g;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo.BlendOperation;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo.DisposalMethod;
import com.facebook.imagepipeline.animated.base.C13541d;
import com.facebook.imagepipeline.animated.p712a.C13521c;
import com.facebook.imagepipeline.nativecode.C13838d;
import java.nio.ByteBuffer;

public class WebPImage implements C13521c, C13541d {
    private long mNativeContext;

    public WebPImage() {
    }

    private static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native WebPFrame nativeGetFrame(int i);

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
        return true;
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

    public int getLoopCount() {
        return nativeGetLoopCount();
    }

    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    public int getWidth() {
        return nativeGetWidth();
    }

    WebPImage(long j) {
        this.mNativeContext = j;
    }

    public WebPFrame getFrame(int i) {
        return nativeGetFrame(i);
    }

    public static WebPImage create(ByteBuffer byteBuffer) {
        C13838d.m40862a();
        byteBuffer.rewind();
        return nativeCreateFromDirectByteBuffer(byteBuffer);
    }

    public C13541d decode(ByteBuffer byteBuffer) {
        return create(byteBuffer);
    }

    public static WebPImage create(byte[] bArr) {
        C13838d.m40862a();
        C13307g.m38940a(bArr);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        return nativeCreateFromDirectByteBuffer(allocateDirect);
    }

    public AnimatedDrawableFrameInfo getFrameInfo(int i) {
        BlendOperation blendOperation;
        DisposalMethod disposalMethod;
        WebPFrame frame = getFrame(i);
        try {
            int d = frame.mo32255d();
            int e = frame.mo32256e();
            int b = frame.mo32253b();
            int c = frame.mo32254c();
            if (frame.mo32275g()) {
                blendOperation = BlendOperation.BLEND_WITH_PREVIOUS;
            } else {
                blendOperation = BlendOperation.NO_BLEND;
            }
            BlendOperation blendOperation2 = blendOperation;
            if (frame.mo32273f()) {
                disposalMethod = DisposalMethod.DISPOSE_TO_BACKGROUND;
            } else {
                disposalMethod = DisposalMethod.DISPOSE_DO_NOT;
            }
            AnimatedDrawableFrameInfo animatedDrawableFrameInfo = new AnimatedDrawableFrameInfo(i, d, e, b, c, blendOperation2, disposalMethod);
            return animatedDrawableFrameInfo;
        } finally {
            frame.mo32251a();
        }
    }

    public C13541d decode(long j, int i) {
        return create(j, i);
    }

    public static WebPImage create(long j, int i) {
        boolean z;
        C13838d.m40862a();
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        return nativeCreateFromNativeMemory(j, i);
    }
}
