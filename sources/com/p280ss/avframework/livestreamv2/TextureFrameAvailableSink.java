package com.p280ss.avframework.livestreamv2;

import android.graphics.Matrix;
import com.p280ss.avframework.buffer.VideoFrame;
import com.p280ss.avframework.buffer.VideoFrame.TextureBuffer;
import com.p280ss.avframework.buffer.VideoFrame.TextureBuffer.Type;
import com.p280ss.avframework.engine.VideoSink;
import com.p280ss.avframework.livestreamv2.ILiveStream.ITextureFrameAvailableListener;
import com.p280ss.avframework.opengl.RendererCommon;
import com.p280ss.avframework.utils.AVLog;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.avframework.livestreamv2.TextureFrameAvailableSink */
public class TextureFrameAvailableSink extends VideoSink {
    private Thread mCurrentThread;
    private EGLContext mEGLContext;
    private int mHeight;
    private ITextureFrameAvailableListener mListener;
    private int mWidth;

    public void OnDiscardedFrame() {
    }

    public void setListener(ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        this.mListener = iTextureFrameAvailableListener;
    }

    public void onFrame(VideoFrame videoFrame) {
        boolean z;
        ITextureFrameAvailableListener iTextureFrameAvailableListener = this.mListener;
        if (this.mCurrentThread != Thread.currentThread()) {
            this.mCurrentThread = Thread.currentThread();
            EGL egl = EGLContext.getEGL();
            if (egl instanceof EGL10) {
                EGLContext eglGetCurrentContext = ((EGL10) egl).eglGetCurrentContext();
                StringBuilder sb = new StringBuilder("EGLContext update ");
                sb.append(this.mEGLContext);
                sb.append(" -> ");
                sb.append(eglGetCurrentContext);
                AVLog.ioi("TextureFrameAvailableSink", sb.toString());
                this.mEGLContext = eglGetCurrentContext;
            }
        }
        if (iTextureFrameAvailableListener != null && this.mEGLContext != null) {
            int rotatedWidth = videoFrame.getRotatedWidth();
            int rotatedHeight = videoFrame.getRotatedHeight();
            if (videoFrame == null || !(videoFrame.getBuffer() instanceof TextureBuffer)) {
                AVLog.m143697e("TextureFrameAvailableSink", "Unsupport format");
                return;
            }
            TextureBuffer textureBuffer = (TextureBuffer) videoFrame.getBuffer();
            Matrix transformMatrix = textureBuffer.getTransformMatrix();
            if (videoFrame.getRotation() != 0) {
                Matrix matrix = new Matrix();
                matrix.reset();
                matrix.preTranslate(0.5f, 0.5f);
                matrix.preRotate((float) (-videoFrame.getRotation()));
                matrix.preTranslate(-0.5f, -0.5f);
                if (transformMatrix != null) {
                    matrix.preConcat(transformMatrix);
                }
                transformMatrix = matrix;
            }
            float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(transformMatrix);
            int textureId = textureBuffer.getTextureId();
            if (textureBuffer.getType() == Type.OES) {
                z = true;
            } else {
                z = false;
            }
            iTextureFrameAvailableListener.onTextureFrameAvailable(this.mEGLContext, textureId, z, rotatedWidth, rotatedHeight, videoFrame.getTimestampNs(), convertMatrixFromAndroidGraphicsMatrix);
        }
    }

    public TextureFrameAvailableSink(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
    }
}
