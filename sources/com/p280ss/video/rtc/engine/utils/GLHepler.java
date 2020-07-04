package com.p280ss.video.rtc.engine.utils;

import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import java.nio.FloatBuffer;
import java.util.concurrent.Callable;
import org.webrtc.EglBase;
import org.webrtc.EglBase$$CC;
import org.webrtc.GlShader;
import org.webrtc.GlTextureFrameBuffer;
import org.webrtc.GlUtil;
import org.webrtc.ThreadUtils;
import org.webrtc.ThreadUtils.ThreadChecker;
import org.webrtc.VideoFrame.TextureBuffer.Type;

/* renamed from: com.ss.video.rtc.engine.utils.GLHepler */
public class GLHepler {
    private static final FloatBuffer DEVICE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer TEXTURE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private final String TAG;
    private int frameBufferId;
    private Handler handler;
    private boolean mBInit;
    private EglBase mEglBase;
    private final String mFragmentShader;
    private GlShader mGlShader;
    private final String mVertorShader;
    private boolean released;
    private GlShader shader;
    private Type shaderTextureType;
    private GlTextureFrameBuffer textureFrameBuffer;
    private final ThreadChecker threadChecker;

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.released = true;
        if (this.shader != null) {
            this.shader.release();
        }
        this.textureFrameBuffer.release();
    }

    private void initShader(Type type) {
        if (this.shader != null) {
            this.shader.release();
        }
        if (!this.mBInit) {
            this.mBInit = true;
            this.shaderTextureType = type;
            this.shader = new GlShader("attribute vec4 vPosition;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\n\nvoid main(){gl_Position = vPosition;\ntextureCoordinate = inputTextureCoordinate;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES s_texture;\nvoid main() {  gl_FragColor = texture2D( s_texture, textureCoordinate );\n}");
            this.shader.useProgram();
            GLES20.glUniform1i(this.shader.getUniformLocation("s_texture"), 0);
            GlUtil.checkNoGLES2Error("Initialize fragment shader uniform values.");
            this.shader.setVertexAttribArray("vPosition", 2, DEVICE_RECTANGLE);
            this.shader.setVertexAttribArray("inputTextureCoordinate", 2, TEXTURE_RECTANGLE);
        }
    }

    public static GLHepler create(final String str, final EGLContext eGLContext) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler2 = new Handler(handlerThread.getLooper());
        return (GLHepler) ThreadUtils.invokeAtFrontUninterruptibly(handler2, (Callable<V>) new Callable<GLHepler>() {
            public GLHepler call() {
                try {
                    return new GLHepler(eGLContext, handler2);
                } catch (RuntimeException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" create failure");
                    LogUtil.m145280e("TextureHelper", sb.toString(), e);
                    return null;
                }
            }
        });
    }

    private GLHepler(EGLContext eGLContext, Handler handler2) {
        this.TAG = "GLHepler";
        this.mVertorShader = "attribute vec4 vPosition;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\n\nvoid main(){gl_Position = vPosition;\ntextureCoordinate = inputTextureCoordinate;\n}\n";
        this.mFragmentShader = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES s_texture;\nvoid main() {  gl_FragColor = texture2D( s_texture, textureCoordinate );\n}";
        this.threadChecker = new ThreadChecker();
        this.released = false;
        this.handler = handler2;
        this.mEglBase = EglBase$$CC.createEgl14$$STATIC$$(eGLContext, EglBase.CONFIG_PIXEL_BUFFER);
        try {
            this.mEglBase.createDummyPbufferSurface();
            this.mEglBase.makeCurrent();
            new GlTextureFrameBuffer(6408);
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.frameBufferId = iArr[0];
            this.threadChecker.detachThread();
        } catch (RuntimeException e) {
            this.mEglBase.release();
            handler2.getLooper().quit();
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$deliverToTexture2D$0$GLHepler(int i, int i2, int i3, int i4) {
        long currentTimeMillis = System.currentTimeMillis();
        this.threadChecker.checkIsOnValidThread();
        if (!this.released) {
            if (!this.mBInit) {
                initShader(Type.OES);
                this.shader.useProgram();
                GLES20.glBindFramebuffer(36160, this.frameBufferId);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
            }
            this.shader.useProgram();
            GLES20.glBindFramebuffer(36160, this.frameBufferId);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i2);
            GLES20.glViewport(0, 0, i3, i4);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glBindTexture(36197, 0);
            StringBuilder sb = new StringBuilder("usetime:");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            LogUtil.m145281i("opnngl ToTexture2D", sb.toString());
            return;
        }
        throw new IllegalStateException("YuvConverter.convert called on released object");
    }

    public void deliverToTexture2D(int i, int i2, int i3, int i4, float[] fArr) {
        Handler handler2 = this.handler;
        GLHepler$$Lambda$0 gLHepler$$Lambda$0 = new GLHepler$$Lambda$0(this, i4, i3, i, i2);
        ThreadUtils.invokeAtFrontUninterruptibly(handler2, (Runnable) gLHepler$$Lambda$0);
    }
}
