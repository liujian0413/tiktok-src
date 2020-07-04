package com.p280ss.avframework.processor;

import android.content.res.AssetManager;
import android.graphics.Matrix;
import com.p280ss.avframework.buffer.GlTextureFrameBuffer;
import com.p280ss.avframework.buffer.TextureBufferImpl;
import com.p280ss.avframework.buffer.TextureBufferImpl.ToI420Interface;
import com.p280ss.avframework.buffer.VideoFrame;
import com.p280ss.avframework.buffer.VideoFrame.Buffer;
import com.p280ss.avframework.buffer.VideoFrame.I420Buffer;
import com.p280ss.avframework.buffer.VideoFrame.TextureBuffer;
import com.p280ss.avframework.buffer.VideoFrame.TextureBuffer.Type;
import com.p280ss.avframework.buffer.VideoFrame.stRoiInfo;
import com.p280ss.avframework.capture.audio.AudioCapturer;
import com.p280ss.avframework.effect.IVideoEffectProcessor;
import com.p280ss.avframework.effect.IVideoEffectProcessor.EffectMsgListener;
import com.p280ss.avframework.effect.IVideoEffectProcessor.FaceDetectListener;
import com.p280ss.avframework.effect.IVideoEffectProcessor.MicrophoneDetectListener;
import com.p280ss.avframework.opengl.GLThread;
import com.p280ss.avframework.opengl.RendererCommon;
import com.p280ss.avframework.opengl.YuvConverter;
import com.p280ss.avframework.utils.JNINamespace;
import com.p280ss.avframework.utils.ThreadUtils;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.processor.VideoEffectProcessor */
class VideoEffectProcessor extends NativeVideoProcessor implements ToI420Interface, IVideoEffectProcessor {
    private GLThread mGLThread = new GLThread("VideoEffectThread");
    public GlTextureFrameBuffer mTextureFrameBuffer;
    public YuvConverter mYuvConverter;
    public TextureBuffer outTex;

    private native void nativeConfigEffect(String str, String str2, boolean z);

    private native void nativeCreate();

    private native int nativeProcess(long j, int i, boolean z, int i2, int i3, float[] fArr, int i4);

    private native void nativeRelease();

    private native int nativeSetBeautify(String str, float f, float f2);

    private native void nativeSetEffect(String str, float f);

    private native void nativeSetFaceAttribute(boolean z);

    private native int nativeSetFilter(String str, float f);

    private native int nativeSetReshape(String str, float f, float f2);

    private native int nativeSetTwoFilter(String str, String str2, float f);

    public int composerAppendNodes(String[] strArr) {
        return 0;
    }

    public int composerReloadNodes(String[] strArr, int i) {
        return 0;
    }

    public int composerRemoveNodes(String[] strArr) {
        return 0;
    }

    public int composerSetMode(int i, int i2) {
        return 0;
    }

    public int composerSetNodes(String[] strArr, int i) {
        return 0;
    }

    public int composerUpdateNode(String str, String str2, float f) {
        return 0;
    }

    public void configEffect(int i, int i2, String str, String str2, boolean z, boolean z2) {
    }

    public int enableMockFace(boolean z) {
        return 0;
    }

    public AudioCapturer getEffectAudioSource() {
        return null;
    }

    public String getEffectVersion() {
        return "";
    }

    public String name() {
        return "";
    }

    public int pauseEffect() {
        return 0;
    }

    public int process(int i, int i2, int i3, int i4, int i5, long j, boolean z) {
        return 0;
    }

    public int process(int i, int i2, int i3, int i4, int i5, stRoiInfo stroiinfo, long j, boolean z) {
        return 0;
    }

    public void processDoubleClickEvent(float f, float f2) {
    }

    public void processLongPressEvent(float f, float f2) {
    }

    public void processPanEvent(float f, float f2, float f3, float f4, float f5) {
    }

    public void processRotationEvent(float f, float f2) {
    }

    public void processScaleEvent(float f, float f2) {
    }

    public void processTouchDownEvent(float f, float f2, int i) {
    }

    public void processTouchEvent(float f, float f2) {
    }

    public void processTouchUpEvent(float f, float f2, int i) {
    }

    public int resumeEffect() {
        return 0;
    }

    public int sendEffectMsg(int i, int i2, int i3, String str) {
        return 0;
    }

    public void setAlgorithmAB(boolean z) {
    }

    public int setAssetManager(AssetManager assetManager) {
        return 0;
    }

    public int setBeautify(String str, float f, float f2, float f3) {
        return 0;
    }

    public int setCustomEffect(String str, String str2) {
        return 0;
    }

    public int setEffect(String str, boolean z) {
        return 0;
    }

    public void setEffectMsgListener(EffectMsgListener effectMsgListener) {
    }

    public int setFaceAttribute(boolean z) {
        return 0;
    }

    public void setFaceDetectListener(FaceDetectListener faceDetectListener) {
    }

    public void setMicrophoneDetectListener(MicrophoneDetectListener microphoneDetectListener) {
    }

    public int setResourceFinder(Object obj) {
        return 0;
    }

    public int startEffectAudio() {
        return 0;
    }

    public int stopEffectAudio() {
        return 0;
    }

    public boolean valid() {
        return false;
    }

    public VideoEffectProcessor() {
        nativeCreate();
        this.mGLThread.start();
    }

    public synchronized void release() {
        if (this.mGLThread != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mGLThread.getHandler(), (Runnable) new Runnable() {
                public void run() {
                    if (VideoEffectProcessor.this.mYuvConverter != null) {
                        VideoEffectProcessor.this.mYuvConverter.release();
                        VideoEffectProcessor.this.mYuvConverter = null;
                    }
                    if (VideoEffectProcessor.this.mTextureFrameBuffer != null) {
                        VideoEffectProcessor.this.mTextureFrameBuffer.release();
                        VideoEffectProcessor.this.mTextureFrameBuffer = null;
                    }
                }
            });
            this.mGLThread.quit();
            this.mGLThread = null;
        }
        nativeRelease();
    }

    public int setEffect(String str) {
        nativeSetEffect(str, 1.0f);
        return 0;
    }

    public VideoFrame process(final VideoFrame videoFrame) {
        final VideoFrame[] videoFrameArr = new VideoFrame[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mGLThread.getHandler(), (Runnable) new Runnable() {
            public void run() {
                videoFrameArr[0] = VideoEffectProcessor.this.processInternal(videoFrame);
            }
        });
        return videoFrameArr[0];
    }

    public I420Buffer toI420(final TextureBuffer textureBuffer) {
        final I420Buffer[] i420BufferArr = new I420Buffer[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mGLThread.getHandler(), (Runnable) new Runnable() {
            public void run() {
                if (VideoEffectProcessor.this.mYuvConverter == null) {
                    VideoEffectProcessor.this.mYuvConverter = new YuvConverter();
                }
                i420BufferArr[0] = VideoEffectProcessor.this.mYuvConverter.convert(textureBuffer);
            }
        });
        return i420BufferArr[0];
    }

    public VideoFrame processInternal(VideoFrame videoFrame) {
        boolean z;
        if (this.outTex == null) {
            this.mTextureFrameBuffer = new GlTextureFrameBuffer(6408);
            this.mTextureFrameBuffer.setSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
            int textureId = this.mTextureFrameBuffer.getTextureId();
            Matrix matrix = new Matrix();
            matrix.reset();
            TextureBufferImpl textureBufferImpl = new TextureBufferImpl(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), Type.RGB, textureId, matrix, (ToI420Interface) this, (Runnable) new Runnable() {
                public void run() {
                    VideoEffectProcessor.this.outTex.retain();
                }
            });
            this.outTex = textureBufferImpl;
        }
        Buffer buffer = videoFrame.getBuffer();
        if (buffer instanceof TextureBuffer) {
            TextureBuffer textureBuffer = (TextureBuffer) buffer;
            float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBuffer.getTransformMatrix());
            long j = this.mNativeObj;
            int textureId2 = textureBuffer.getTextureId();
            if (textureBuffer.getType() == Type.OES) {
                z = true;
            } else {
                z = false;
            }
            if (nativeProcess(j, textureId2, z, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), convertMatrixFromAndroidGraphicsMatrix, this.outTex.getTextureId()) >= 0) {
                return new VideoFrame(this.outTex, 0, videoFrame.getTimestampNs());
            }
            videoFrame.retain();
        }
        return videoFrame;
    }

    public int setFilter(String str, float f) {
        return nativeSetFilter(str, f);
    }

    public void setEffect(String str, float f) {
        nativeSetEffect(str, f);
    }

    public void configEffect(String str, String str2, boolean z) {
        nativeConfigEffect(str, str2, z);
    }

    public int setBeautify(String str, float f, float f2) {
        return nativeSetBeautify(str, f, f2);
    }

    public int setReshape(String str, float f, float f2) {
        return nativeSetReshape(str, f, f2);
    }

    public int setFilter(String str, String str2, float f) {
        return nativeSetTwoFilter(str, str2, f);
    }
}
