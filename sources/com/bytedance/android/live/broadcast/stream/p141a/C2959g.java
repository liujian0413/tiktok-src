package com.bytedance.android.live.broadcast.stream.p141a;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.EGLContextFactory;
import android.opengl.GLSurfaceView.Renderer;
import android.view.Surface;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import com.p280ss.avframework.livestreamv2.effectcamera.utils.OpenGLUtils;
import com.p280ss.avframework.livestreamv2.effectcamera.utils.TextureRotationUtil;
import com.p280ss.avframework.opengl.GLThread;
import com.p280ss.avframework.utils.ThreadUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.bytedance.android.live.broadcast.stream.a.g */
public final class C2959g implements OnFrameAvailableListener, Renderer {

    /* renamed from: a */
    public C2961a f9193a;

    /* renamed from: b */
    public EGLContext f9194b;

    /* renamed from: c */
    public GLThread f9195c;

    /* renamed from: d */
    private GLSurfaceView f9196d;

    /* renamed from: e */
    private int f9197e;

    /* renamed from: f */
    private int f9198f;

    /* renamed from: g */
    private int f9199g;

    /* renamed from: h */
    private int f9200h;

    /* renamed from: i */
    private int f9201i;

    /* renamed from: j */
    private int f9202j;

    /* renamed from: k */
    private int f9203k;

    /* renamed from: l */
    private FloatBuffer f9204l;

    /* renamed from: m */
    private FloatBuffer f9205m;

    /* renamed from: n */
    private FloatBuffer f9206n;

    /* renamed from: o */
    private SurfaceTexture f9207o;

    /* renamed from: p */
    private List<C2958f> f9208p;

    /* renamed from: q */
    private int f9209q = 36197;

    /* renamed from: com.bytedance.android.live.broadcast.stream.a.g$a */
    public interface C2961a {
        /* renamed from: a */
        void mo9735a(Surface surface);
    }

    /* renamed from: a */
    public final void mo9723a() {
        this.f9196d.onResume();
    }

    /* renamed from: b */
    public final void mo9727b() {
        this.f9196d.onPause();
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        if (this.f9195c != null) {
            this.f9195c.quit();
            this.f9195c = null;
        }
        super.finalize();
    }

    /* renamed from: c */
    private int m11500c() {
        GLES20.glBindFramebuffer(36160, this.f9202j);
        this.f9206n.position(0);
        GLES20.glVertexAttribPointer(this.f9200h, 2, 5126, false, 0, this.f9206n);
        GLES20.glEnableVertexAttribArray(this.f9200h);
        GLES20.glDrawArrays(5, 0, 4);
        OpenGLUtils.checkGlError("ImageCapture");
        GLES20.glBindFramebuffer(36160, 0);
        return this.f9203k;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f9196d.requestRender();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9725a(Surface surface) {
        if (this.f9193a != null) {
            this.f9193a.mo9735a(surface);
        }
    }

    /* renamed from: a */
    public final void mo9724a(int i) {
        if (i == 36197 || i == 3553) {
            this.f9209q = i;
            return;
        }
        throw new RuntimeException("format is not support");
    }

    /* renamed from: a */
    public final synchronized void mo9726a(C2958f fVar) {
        if (this.f9208p == null) {
            this.f9208p = new ArrayList();
        }
        this.f9208p.add(fVar);
    }

    public C2959g(GLSurfaceView gLSurfaceView) {
        this.f9196d = gLSurfaceView;
        this.f9196d.setEGLContextClientVersion(2);
        this.f9196d.setPreserveEGLContextOnPause(true);
        this.f9196d.setEGLContextFactory(new EGLContextFactory() {
            /* renamed from: a */
            static final /* synthetic */ void m11506a(EGLContext[] eGLContextArr) {
                EGL egl = EGLContext.getEGL();
                if (egl instanceof EGL10) {
                    eGLContextArr[0] = ((EGL10) egl).eglGetCurrentContext();
                }
            }

            public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
                if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                    StringBuilder sb = new StringBuilder("eglDestroyContext");
                    sb.append(egl10.eglGetError());
                    throw new RuntimeException(sb.toString());
                } else if (C2959g.this.f9195c != null) {
                    C2959g.this.f9195c.quit();
                    C2959g.this.f9195c = null;
                }
            }

            public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
                int[] iArr = {12440, 2, 12344};
                EGLContext[] eGLContextArr = {null};
                if (C2959g.this.f9195c == null) {
                    C2959g.this.f9195c = new GLThread("ImageCaptureThread");
                    C2959g.this.f9195c.start();
                }
                ThreadUtils.invokeAtFrontUninterruptibly(C2959g.this.f9195c.getHandler(), (Runnable) new C2963i(eGLContextArr));
                if (eGLContextArr[0] == null) {
                    eGLContextArr[0] = EGL10.EGL_NO_CONTEXT;
                }
                C2959g.this.f9194b = egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContextArr[0], iArr);
                return C2959g.this.f9194b;
            }
        });
        this.f9196d.setRenderer(this);
        this.f9196d.setRenderMode(0);
        this.f9204l = ByteBuffer.allocateDirect(TextureRotationUtil.CUBE.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f9204l.put(TextureRotationUtil.CUBE).position(0);
        this.f9205m = ByteBuffer.allocateDirect(TextureRotationUtil.TEXTURE_NO_ROTATION.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f9205m.put(TextureRotationUtil.TEXTURE_NO_ROTATION).position(0);
        float[] rotation = TextureRotationUtil.getRotation(NormalGiftView.ALPHA_180, true, false);
        this.f9206n = ByteBuffer.allocateDirect(rotation.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f9206n.put(rotation).position(0);
    }

    public final void onDrawFrame(GL10 gl10) {
        this.f9207o.updateTexImage();
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.f9197e);
        this.f9204l.position(0);
        GLES20.glVertexAttribPointer(this.f9198f, 2, 5126, false, 0, this.f9204l);
        GLES20.glEnableVertexAttribArray(this.f9198f);
        this.f9205m.position(0);
        GLES20.glVertexAttribPointer(this.f9200h, 2, 5126, false, 0, this.f9205m);
        GLES20.glEnableVertexAttribArray(this.f9200h);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f9201i);
        GLES20.glUniform1i(this.f9199g, 0);
        GLES20.glDrawArrays(5, 0, 4);
        OpenGLUtils.checkGlError("ImageCapture");
        int i = this.f9201i;
        if (3553 == this.f9209q) {
            i = m11500c();
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, 0);
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            if (this.f9208p != null) {
                for (C2958f onFrameAvailable : this.f9208p) {
                    onFrameAvailable.onFrameAvailable(this.f9194b, i, this.f9209q, this.f9196d.getWidth(), this.f9196d.getHeight(), currentTimeMillis);
                }
            }
        }
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.f9197e = OpenGLUtils.loadProgram("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nvarying vec2 textureCoordinate;\n\nvoid main()\n{\n   textureCoordinate = inputTextureCoordinate.xy;\n   gl_Position = position;\n}", "#extension GL_OES_EGL_image_external : require\n\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES inputImageTexture;\n\nvoid main()\n{\n gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        new StringBuilder("onSurfaceCreated: OES programId=").append(this.f9197e);
        this.f9198f = GLES20.glGetAttribLocation(this.f9197e, "position");
        this.f9199g = GLES20.glGetUniformLocation(this.f9197e, "inputImageTexture");
        this.f9200h = GLES20.glGetAttribLocation(this.f9197e, "inputTextureCoordinate");
        this.f9201i = OpenGLUtils.getExternalOESTextureID();
        new StringBuilder("onSurfaceCreated: OES textureId=").append(this.f9201i);
        OpenGLUtils.checkGlError("ImageCapture");
        if (3553 == this.f9209q) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f9202j = iArr[0];
            new StringBuilder("onSurfaceCreated: frameBuffer=").append(this.f9202j);
            int[] iArr2 = new int[1];
            GLES20.glGenTextures(1, iArr2, 0);
            this.f9203k = iArr2[0];
            new StringBuilder("onSurfaceCreated: frameBufferTextureId=").append(this.f9203k);
            m11499a(this.f9203k, this.f9202j, this.f9196d.getWidth(), this.f9196d.getHeight());
        }
        this.f9207o = new SurfaceTexture(this.f9201i);
        this.f9207o.setDefaultBufferSize(this.f9196d.getWidth(), this.f9196d.getHeight());
        this.f9207o.setOnFrameAvailableListener(this);
        this.f9196d.post(new C2962h(this, new Surface(this.f9207o)));
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    /* renamed from: a */
    private static void m11499a(int i, int i2, int i3, int i4) {
        GLES20.glBindTexture(3553, i);
        GLES20.glTexImage2D(3553, 0, 6408, i3, i4, 0, 6408, 5121, null);
        GLES20.glTexParameterf(3553, VideoPreloadSizeExperiment.DEFAULT, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glBindFramebuffer(36160, i2);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }
}
