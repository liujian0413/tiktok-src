package com.p280ss.android.ttve.model;

import android.media.Image.Plane;
import android.opengl.EGLContext;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.ttve.model.VEFrame */
public class VEFrame {
    protected ETEPixelFormat format = ETEPixelFormat.TEPixFmt_Count;
    protected boolean fromFrontCamera;
    protected int height;
    protected FrameBase mInternalFrame;
    protected int rotation;
    protected long timeStamp;
    protected int width;

    /* renamed from: com.ss.android.ttve.model.VEFrame$ByteArrayFrame */
    public static class ByteArrayFrame extends FrameBase {
        byte[] byteArray;

        public byte[] getByteArray() {
            return this.byteArray;
        }

        public ByteArrayFrame(byte[] bArr) {
            this.byteArray = bArr;
        }
    }

    /* renamed from: com.ss.android.ttve.model.VEFrame$ByteBufferFrame */
    public static class ByteBufferFrame extends FrameBase {
        ByteBuffer byteBuffer;

        public ByteBuffer getByteBuffer() {
            return this.byteBuffer;
        }

        public ByteBufferFrame(ByteBuffer byteBuffer2) {
            this.byteBuffer = byteBuffer2;
        }
    }

    /* renamed from: com.ss.android.ttve.model.VEFrame$ETEPixelFormat */
    public enum ETEPixelFormat {
        TEPixFmt_YUV420P,
        TEPixFmt_YUYV422,
        TEPixFmt_YUV422P,
        TEPixFmt_UYVY422,
        TEPixFmt_NV12,
        TEPixFmt_NV21,
        TEPixFmt_GRAY8,
        TEPixFmt_RGB8,
        TEPixFmt_BGR8,
        TEPixFmt_RGB233,
        TEPixFmt_BGR233,
        TEPixFmt_ARGB8,
        TEPixFmt_RGBA8,
        TEPixFmt_BGRA8,
        TEPixFmt_OpenGL_RGB8,
        TEPixFmt_OpenGL_RGBA8,
        TEPIXEL_FORMAT_JPEG,
        TEPIXEL_FORMAT_YUV420,
        TEPixFmt_Count
    }

    /* renamed from: com.ss.android.ttve.model.VEFrame$FrameBase */
    public static class FrameBase {
    }

    /* renamed from: com.ss.android.ttve.model.VEFrame$IntArrayFrame */
    public static class IntArrayFrame extends FrameBase {
        int[] intArray;

        public int[] getIntArray() {
            return this.intArray;
        }

        public IntArrayFrame(int[] iArr) {
            this.intArray = iArr;
        }
    }

    /* renamed from: com.ss.android.ttve.model.VEFrame$Operation */
    public enum Operation {
        OP_SCALE,
        OP_ROTATION,
        OP_CONVERT
    }

    /* renamed from: com.ss.android.ttve.model.VEFrame$YUVPlansFrame */
    public static class YUVPlansFrame extends FrameBase {
        C20466f planes;

        public Plane[] getPlanes() {
            return this.planes.f55294a;
        }

        public YUVPlansFrame(C20466f fVar) {
            this.planes = fVar;
        }
    }

    /* renamed from: com.ss.android.ttve.model.VEFrame$a */
    public static class C20460a extends FrameBase {

        /* renamed from: a */
        public EGLContext f55265a;

        /* renamed from: b */
        public int f55266b;

        public C20460a(EGLContext eGLContext, int i) {
            this.f55265a = eGLContext;
            this.f55266b = i;
        }
    }

    public ETEPixelFormat getFormat() {
        return this.format;
    }

    public FrameBase getFrame() {
        return this.mInternalFrame;
    }

    public int getHeight() {
        return this.height;
    }

    public int getRotation() {
        return this.rotation;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isFromFrontCamera() {
        return this.fromFrontCamera;
    }

    public int getFormatOrdinal() {
        return this.format.ordinal();
    }

    public void setFromFrontCamera(boolean z) {
        this.fromFrontCamera = z;
    }

    public VEFrame(int i, int i2, int i3, long j, ETEPixelFormat eTEPixelFormat) {
        this.width = i;
        this.height = i2;
        this.rotation = i3;
        this.timeStamp = j;
        this.format = eTEPixelFormat;
    }

    public static VEFrame createByteArrayFrame(byte[] bArr, int i, int i2, int i3, long j, ETEPixelFormat eTEPixelFormat) {
        VEFrame vEFrame = new VEFrame(i, i2, i3, j, eTEPixelFormat);
        vEFrame.mInternalFrame = new ByteArrayFrame(bArr);
        return vEFrame;
    }

    public static VEFrame createByteBufferFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j, ETEPixelFormat eTEPixelFormat) {
        VEFrame vEFrame = new VEFrame(i, i2, i3, j, eTEPixelFormat);
        vEFrame.mInternalFrame = new ByteBufferFrame(byteBuffer);
        return vEFrame;
    }

    public static VEFrame createIntArrayFrame(int[] iArr, int i, int i2, int i3, long j, ETEPixelFormat eTEPixelFormat) {
        VEFrame vEFrame = new VEFrame(i, i2, i3, j, eTEPixelFormat);
        vEFrame.mInternalFrame = new IntArrayFrame(iArr);
        return vEFrame;
    }

    public static VEFrame createYUVPlanFrame(C20466f fVar, int i, int i2, int i3, long j, ETEPixelFormat eTEPixelFormat) {
        VEFrame vEFrame = new VEFrame(i, i2, i3, j, eTEPixelFormat);
        vEFrame.mInternalFrame = new YUVPlansFrame(fVar);
        return vEFrame;
    }

    public static VEFrame createTextureFrame(EGLContext eGLContext, int i, int i2, int i3, int i4, long j, ETEPixelFormat eTEPixelFormat) {
        VEFrame vEFrame = new VEFrame(i2, i3, i4, j, eTEPixelFormat);
        vEFrame.mInternalFrame = new C20460a(eGLContext, i);
        return vEFrame;
    }
}
