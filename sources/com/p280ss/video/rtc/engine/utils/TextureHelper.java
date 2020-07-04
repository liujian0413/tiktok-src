package com.p280ss.video.rtc.engine.utils;

import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import org.webrtc.EglBase;
import org.webrtc.EglBase$$CC;
import org.webrtc.EglBase.Context;
import org.webrtc.GlRectDrawer;
import org.webrtc.GlUtil;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame.I420Buffer;
import org.webrtc.VideoFrame.TextureBuffer;
import org.webrtc.YuvConverter;

/* renamed from: com.ss.video.rtc.engine.utils.TextureHelper */
public class TextureHelper {
    public static float[] TEX_MATRIX = new float[16];
    public final EglBase mEglBase;
    private int mFrameBufferId;
    private final Handler mHandler;
    public int mHeight;
    public boolean mIsQuitting;
    public boolean mIsTextureInUse;
    private int mTextureCnt;
    public GlRectDrawer mTextureDrawer;
    private List<Integer> mTextureFreeQueue = new LinkedList();
    private List<Integer> mTextureUsedQueue = new LinkedList();
    public int mWidth;
    public YuvConverter mYuvConverter;

    public Context getEglBaseContext() {
        if (this.mEglBase != null) {
            return this.mEglBase.getEglBaseContext();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$dispose$5$TextureHelper() {
        this.mIsQuitting = true;
        if (!this.mIsTextureInUse) {
            release();
        }
    }

    public int dequeueTexture() {
        int[] iArr = new int[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new TextureHelper$$Lambda$2(this, iArr));
        return iArr[0];
    }

    public synchronized void dispose() {
        LogUtil.m145278d("TextureHelper", "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new TextureHelper$$Lambda$5(this));
    }

    public void release() {
        if (this.mHandler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Wrong thread.");
        } else if (this.mIsTextureInUse || !this.mIsQuitting) {
            throw new IllegalStateException("Unexpected release.");
        } else {
            if (this.mYuvConverter != null) {
                this.mYuvConverter.release();
            }
            if (this.mTextureFreeQueue != null && this.mTextureFreeQueue.size() > 0) {
                for (Integer intValue : this.mTextureFreeQueue) {
                    GLES20.glDeleteTextures(1, new int[]{intValue.intValue()}, 0);
                }
            }
            this.mTextureFreeQueue.clear();
            if (this.mTextureUsedQueue != null && this.mTextureUsedQueue.size() > 0) {
                for (Integer intValue2 : this.mTextureUsedQueue) {
                    GLES20.glDeleteTextures(1, new int[]{intValue2.intValue()}, 0);
                }
            }
            this.mTextureUsedQueue.clear();
            GLES20.glDeleteFramebuffers(1, new int[]{this.mFrameBufferId}, 0);
            this.mFrameBufferId = 0;
            this.mEglBase.release();
            this.mHandler.getLooper().quit();
        }
    }

    public void post(Runnable runnable) {
        if (this.mHandler != null) {
            this.mHandler.post(runnable);
        }
    }

    public void queueTexture(int i) {
        this.mHandler.post(new TextureHelper$$Lambda$3(this, i));
    }

    public synchronized I420Buffer textureToYuv(final TextureBuffer textureBuffer) {
        final I420Buffer[] i420BufferArr;
        i420BufferArr = new I420Buffer[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                TextureHelper.this.mIsTextureInUse = true;
                if (TextureHelper.this.mYuvConverter == null) {
                    TextureHelper.this.mYuvConverter = new YuvConverter();
                }
                if (TextureHelper.this.mTextureDrawer == null) {
                    TextureHelper.this.mTextureDrawer = new GlRectDrawer();
                }
                i420BufferArr[0] = TextureHelper.this.mYuvConverter.convert(textureBuffer);
                TextureHelper.this.mIsTextureInUse = false;
                if (TextureHelper.this.mIsQuitting) {
                    TextureHelper.this.release();
                }
            }
        });
        return i420BufferArr[0];
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$queueTexture$3$TextureHelper(int i) {
        if (this.mTextureUsedQueue != null && this.mTextureUsedQueue.contains(Integer.valueOf(i))) {
            this.mTextureUsedQueue.remove(new Integer(i));
            if (this.mTextureFreeQueue != null) {
                this.mTextureFreeQueue.add(Integer.valueOf(i));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$dequeueTexture$2$TextureHelper(int[] iArr) {
        if (this.mTextureFreeQueue != null) {
            if (this.mTextureFreeQueue.size() == 0) {
                iArr[0] = generateTexture(3553, this.mWidth, this.mHeight);
                if (iArr[0] > 0) {
                    this.mTextureUsedQueue.add(Integer.valueOf(iArr[0]));
                }
            } else {
                iArr[0] = ((Integer) this.mTextureFreeQueue.get(0)).intValue();
                this.mTextureFreeQueue.remove(0);
                this.mTextureUsedQueue.add(Integer.valueOf(iArr[0]));
            }
        }
    }

    public void drawTexture(final int i, final int i2, final int i3) {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                if (TextureHelper.this.mTextureDrawer == null) {
                    TextureHelper.this.mTextureDrawer = new GlRectDrawer();
                }
                GlUtil.checkNoGLES2Error("TextureHelper construct");
                GLES20.glBindFramebuffer(36160, i3);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, i3, 0);
                switch (i) {
                    case 10:
                        TextureHelper.this.mTextureDrawer.drawRgb(i2, TextureHelper.TEX_MATRIX, TextureHelper.this.mWidth, TextureHelper.this.mHeight, 0, 0, TextureHelper.this.mWidth, TextureHelper.this.mHeight);
                        break;
                    case 11:
                        TextureHelper.this.mTextureDrawer.drawOes(i2, TextureHelper.TEX_MATRIX, TextureHelper.this.mWidth, TextureHelper.this.mHeight, 0, 0, TextureHelper.this.mWidth, TextureHelper.this.mHeight);
                        break;
                    default:
                        LogUtil.m145279e("TextureHelper", "draw texture type error");
                        break;
                }
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
                GlUtil.checkNoGLES2Error("TextureHelper drawTexture");
                TextureHelper.this.mEglBase.swapBuffers();
            }
        });
    }

    private int generateTexture(int i, int i2, int i3) {
        if (this.mTextureCnt == 4) {
            return 0;
        }
        return ((Integer) ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Callable<V>) new TextureHelper$$Lambda$4<V>(this, i, i2, i3))).intValue();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Integer lambda$generateTexture$4$TextureHelper(int i, int i2, int i3) throws Exception {
        int generateTexture = GlUtil.generateTexture(i);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, generateTexture);
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
        if (GLES20.glGetError() != 0) {
            return Integer.valueOf(0);
        }
        this.mTextureCnt++;
        return Integer.valueOf(generateTexture);
    }

    public static TextureHelper create(String str, EGLContext eGLContext, int i, int i2) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        TextureHelper$$Lambda$1 textureHelper$$Lambda$1 = new TextureHelper$$Lambda$1(eGLContext, handler, i, i2, str);
        return (TextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, (Callable<V>) textureHelper$$Lambda$1);
    }

    public static TextureHelper create(String str, javax.microedition.khronos.egl.EGLContext eGLContext, int i, int i2) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        TextureHelper$$Lambda$0 textureHelper$$Lambda$0 = new TextureHelper$$Lambda$0(eGLContext, handler, i, i2, str);
        return (TextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, (Callable<V>) textureHelper$$Lambda$0);
    }

    private TextureHelper(Object obj, Handler handler, int i, int i2) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            this.mWidth = i;
            this.mHeight = i2;
            this.mHandler = handler;
            Matrix.setIdentityM(TEX_MATRIX, 0);
            if (obj instanceof javax.microedition.khronos.egl.EGLContext) {
                this.mEglBase = EglBase$$CC.createEgl10$$STATIC$$((javax.microedition.khronos.egl.EGLContext) obj, EglBase.CONFIG_PIXEL_BUFFER);
            } else if (obj instanceof EGLContext) {
                this.mEglBase = EglBase$$CC.createEgl14$$STATIC$$((EGLContext) obj, EglBase.CONFIG_PIXEL_BUFFER);
            } else {
                StringBuilder sb = new StringBuilder("unknown shareContext:");
                sb.append(obj);
                throw new RuntimeException(sb.toString());
            }
            try {
                this.mEglBase.createPbufferSurface(this.mWidth, this.mHeight);
                this.mEglBase.makeCurrent();
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                this.mFrameBufferId = iArr[0];
                this.mTextureDrawer = new GlRectDrawer();
                GlUtil.checkNoGLES2Error("TextureHelper construct");
            } catch (RuntimeException e) {
                this.mEglBase.release();
                handler.getLooper().quit();
                throw e;
            }
        } else {
            throw new IllegalStateException("TextureHelper must be created on the handler thread");
        }
    }

    static final /* synthetic */ TextureHelper lambda$create$0$TextureHelper(javax.microedition.khronos.egl.EGLContext eGLContext, Handler handler, int i, int i2, String str) throws Exception {
        try {
            return new TextureHelper(eGLContext, handler, i, i2);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" create failure");
            LogUtil.m145280e("TextureHelper", sb.toString(), e);
            return null;
        }
    }

    static final /* synthetic */ TextureHelper lambda$create$1$TextureHelper(EGLContext eGLContext, Handler handler, int i, int i2, String str) throws Exception {
        try {
            return new TextureHelper(eGLContext, handler, i, i2);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" create failure");
            LogUtil.m145280e("TextureHelper", sb.toString(), e);
            return null;
        }
    }
}
