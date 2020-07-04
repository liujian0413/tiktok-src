package com.p280ss.texturerender;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLUtils;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.texturerender.TextureRenderer */
public abstract class TextureRenderer implements Callback {
    public static String LOG_TAG = "TextureRenderer";
    protected long mDrawingObjectId = 0;
    EGLConfig mEglConfig;
    protected EGLContext mEglContext = EGL14.EGL_NO_CONTEXT;
    protected EGLDisplay mEglDisplay = EGL14.EGL_NO_DISPLAY;
    protected EGLSurface mEglDummySurface = EGL14.EGL_NO_SURFACE;
    private OnEglErrorListener mErrorListener;
    private String mErrorReason = null;
    protected volatile Handler mHandler;
    private final Object mHandlerObject = new Object();
    private HandlerThread mHandlerThread = new HandlerThread("RendererThread");
    protected float[] mMVPMatrix = new float[16];
    protected Handler mNotifyHandler;
    protected int mProgram;
    protected float[] mSTMatrix = new float[16];
    private Object mSetupFence = new Object();
    protected volatile int mState = 0;
    private OnStateChangeListener mStateChangeListener;
    private TextureFactory mTextureFactory = new TextureFactory();
    private List<VideoSurfaceTexture> mTextureList = new ArrayList();
    protected FloatBuffer mTextureVertices;
    private final float[] mTextureVerticesData = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    protected FloatBuffer mTriangleVertices;
    private final float[] mTriangleVerticesData = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
    protected int maPositionHandle;
    protected int maTextureHandle;
    protected int muMVPMatrixHandle;
    protected int muSTMatrixHandle;

    /* renamed from: com.ss.texturerender.TextureRenderer$OnEglErrorListener */
    public interface OnEglErrorListener {
        void onError(int i, String str);
    }

    /* renamed from: com.ss.texturerender.TextureRenderer$OnStateChangeListener */
    public interface OnStateChangeListener {
        void onStateChanged(int i);
    }

    /* renamed from: com.ss.texturerender.TextureRenderer$OnTextureFocusLossListener */
    public interface OnTextureFocusLossListener {
        void onFocusLoss();
    }

    /* access modifiers changed from: protected */
    public abstract void deinitGLComponents();

    /* access modifiers changed from: protected */
    public abstract boolean draw(VideoSurfaceTexture videoSurfaceTexture);

    public String getErrorReason() {
        return this.mErrorReason;
    }

    public int getState() {
        return this.mState;
    }

    /* access modifiers changed from: protected */
    public abstract void initGLComponents();

    /* access modifiers changed from: protected */
    public abstract void onInternalStateChanged(int i);

    /* access modifiers changed from: protected */
    public abstract void updateDisplaySize(int i, int i2);

    private EGLDisplay getDefaultDisplay() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            notifyEGLError(0, "egl get display failed");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            return eglGetDisplay;
        }
        notifyEGLError(0, "eglInitialize failed");
        return null;
    }

    private int[] getRGB565Attributes() {
        return new int[]{12352, 4, 12324, 5, 12323, 6, 12322, 5, 12344};
    }

    private int[] getRGB888Attributes() {
        return new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12344};
    }

    public VideoSurface genOffscreenSurface() {
        if (this.mState <= 0) {
            return null;
        }
        VideoSurfaceTexture surfaceTexture = getSurfaceTexture();
        if (surfaceTexture != null) {
            return surfaceTexture.getOffScreenSurface();
        }
        return null;
    }

    public void handleDeinit() {
        changeState(0, true);
        deleteTextures();
        deinitGLComponents();
        deinitEGL();
        this.mHandler = null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.mState     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0017
            android.os.Handler r0 = r2.mHandler     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x000a
            goto L_0x0017
        L_0x000a:
            android.os.Handler r0 = r2.mHandler     // Catch:{ all -> 0x0019 }
            r1 = 3
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0019 }
            android.os.HandlerThread r0 = r2.mHandlerThread     // Catch:{ Exception -> 0x0015 }
            r0.quitSafely()     // Catch:{ Exception -> 0x0015 }
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            return
        L_0x0017:
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            return
        L_0x0019:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.texturerender.TextureRenderer.release():void");
    }

    private EGLConfig chooseEglConfig() {
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[][] iArr2 = {getRGB888Attributes(), getRGB565Attributes()};
        for (int i = 0; i < 2; i++) {
            if (EGL14.eglChooseConfig(this.mEglDisplay, iArr2[0], 0, eGLConfigArr, 0, 1, iArr, 0) && iArr[0] > 0) {
                return eGLConfigArr[0];
            }
        }
        notifyEGLError(0, "eglChooseConfig failed");
        return null;
    }

    private void deinitEGL() {
        if (this.mEglDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplay = this.mEglDisplay;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            if (this.mEglDummySurface != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.mEglDisplay, this.mEglDummySurface);
                this.mEglDummySurface = EGL14.EGL_NO_SURFACE;
            }
            if (this.mEglContext != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.mEglDisplay, this.mEglContext);
                this.mEglContext = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglTerminate(this.mEglDisplay);
            this.mEglDisplay = EGL14.EGL_NO_DISPLAY;
        }
    }

    private void deleteTextures() {
        synchronized (this.mTextureList) {
            if (this.mTextureList.size() > 0) {
                Iterator it = this.mTextureList.iterator();
                while (it.hasNext()) {
                    ((VideoSurfaceTexture) it.next()).release();
                    it.remove();
                }
            }
            this.mTextureFactory.release();
        }
    }

    private ITexture getTexture() {
        Message obtainMessage = this.mHandler.obtainMessage(9);
        Message message = new Message();
        obtainMessage.obj = message;
        try {
            synchronized (message) {
                this.mHandler.sendMessageAtFrontOfQueue(obtainMessage);
                message.wait(1000);
            }
            if (message.obj == null) {
                if (this.mHandler.hasMessages(9)) {
                    this.mErrorReason = "The handler is busy for other operation timeout";
                } else {
                    this.mErrorReason = "Try modify the wait timeOut";
                }
            }
            return (ITexture) message.obj;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.p280ss.texturerender.VideoSurfaceTexture getSurfaceTexture() {
        /*
            r6 = this;
            java.util.List<com.ss.texturerender.VideoSurfaceTexture> r0 = r6.mTextureList
            monitor-enter(r0)
            java.util.List<com.ss.texturerender.VideoSurfaceTexture> r1 = r6.mTextureList     // Catch:{ all -> 0x0062 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0062 }
            r2 = 0
            r3 = r2
        L_0x000b:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x0062 }
            if (r4 == 0) goto L_0x003f
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0062 }
            com.ss.texturerender.VideoSurfaceTexture r3 = (com.p280ss.texturerender.VideoSurfaceTexture) r3     // Catch:{ all -> 0x0062 }
            boolean r4 = r3.isRelease()     // Catch:{ all -> 0x0062 }
            if (r4 != 0) goto L_0x003d
            boolean r4 = r3.isAlive()     // Catch:{ all -> 0x0062 }
            if (r4 != 0) goto L_0x003d
            android.os.Looper r4 = android.os.Looper.myLooper()     // Catch:{ all -> 0x0062 }
            boolean r4 = r3.canReuse(r4)     // Catch:{ all -> 0x0062 }
            if (r4 == 0) goto L_0x0036
            r1 = 0
            r3.pause(r1, r1)     // Catch:{ all -> 0x0062 }
            r3.getOffScreenSurface()     // Catch:{ all -> 0x0062 }
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            return r3
        L_0x0036:
            r3.release()     // Catch:{ all -> 0x0062 }
            r1.remove()     // Catch:{ all -> 0x0062 }
            goto L_0x000b
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            return r2
        L_0x003f:
            com.ss.texturerender.ITexture r1 = r6.getTexture()     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0060
            com.ss.texturerender.VideoSurfaceTexture r3 = new com.ss.texturerender.VideoSurfaceTexture     // Catch:{ all -> 0x0062 }
            android.os.Handler r2 = r6.mHandler     // Catch:{ all -> 0x0062 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0062 }
            android.opengl.EGLContext r2 = r6.mEglContext     // Catch:{ all -> 0x0062 }
            android.opengl.EGLDisplay r4 = r6.mEglDisplay     // Catch:{ all -> 0x0062 }
            android.opengl.EGLConfig r5 = r6.mEglConfig     // Catch:{ all -> 0x0062 }
            r3.bindEGLEnv(r2, r4, r5)     // Catch:{ all -> 0x0062 }
            r1.decRef()     // Catch:{ all -> 0x0062 }
            r3.getOffScreenSurface()     // Catch:{ all -> 0x0062 }
            java.util.List<com.ss.texturerender.VideoSurfaceTexture> r1 = r6.mTextureList     // Catch:{ all -> 0x0062 }
            r1.add(r3)     // Catch:{ all -> 0x0062 }
        L_0x0060:
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            return r3
        L_0x0062:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.texturerender.TextureRenderer.getSurfaceTexture():com.ss.texturerender.VideoSurfaceTexture");
    }

    public void checkExpired() {
        if (this.mHandler != null) {
            synchronized (this.mTextureList) {
                if (!this.mHandler.hasMessages(8)) {
                    if (!this.mHandler.hasMessages(9)) {
                        if (this.mTextureList.size() == 0) {
                            release();
                            return;
                        }
                        boolean z = false;
                        Iterator it = this.mTextureList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            VideoSurfaceTexture videoSurfaceTexture = (VideoSurfaceTexture) it.next();
                            if (videoSurfaceTexture.isRelease() || (!videoSurfaceTexture.isAlive() && videoSurfaceTexture.couldForceRelease())) {
                            }
                        }
                        z = true;
                        if (!z) {
                            release();
                            return;
                        } else {
                            this.mHandler.sendEmptyMessageDelayed(11, 120000);
                            return;
                        }
                    }
                }
                this.mHandler.sendEmptyMessageDelayed(11, 120000);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x009d, code lost:
        throw new java.lang.RuntimeException("EGL initial timeout");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0096 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextureRenderer() {
        /*
            r4 = this;
            r4.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.mHandlerObject = r0
            r0 = 12
            float[] r0 = new float[r0]
            r0 = {-1082130432, -1082130432, 0, 1065353216, -1082130432, 0, -1082130432, 1065353216, 0, 1065353216, 1065353216, 0} // fill-array
            r4.mTriangleVerticesData = r0
            r0 = 8
            float[] r0 = new float[r0]
            r0 = {0, 0, 1065353216, 0, 0, 1065353216, 1065353216, 1065353216} // fill-array
            r4.mTextureVerticesData = r0
            r0 = 16
            float[] r1 = new float[r0]
            r4.mMVPMatrix = r1
            float[] r0 = new float[r0]
            r4.mSTMatrix = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.mSetupFence = r0
            r0 = 0
            r4.mState = r0
            r0 = 0
            r4.mErrorReason = r0
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            r4.mEglDummySurface = r0
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            r4.mEglContext = r0
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            r4.mEglDisplay = r0
            r0 = 0
            r4.mDrawingObjectId = r0
            com.ss.texturerender.TextureFactory r0 = new com.ss.texturerender.TextureFactory
            r0.<init>()
            r4.mTextureFactory = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.mTextureList = r0
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "RendererThread"
            r0.<init>(r1)
            r4.mHandlerThread = r0
            android.os.HandlerThread r0 = r4.mHandlerThread
            r0.start()
            com.ss.texturerender.TextureRenderer$1 r0 = new com.ss.texturerender.TextureRenderer$1
            android.os.HandlerThread r1 = r4.mHandlerThread
            android.os.Looper r1 = r1.getLooper()
            r0.<init>(r1)
            r4.mHandler = r0
            android.os.Handler r0 = r4.mHandler
            r1 = 1
            android.os.Message r0 = r0.obtainMessage(r1)
            java.lang.Object r1 = r4.mSetupFence
            r0.obj = r1
            java.lang.Object r1 = r4.mSetupFence
            monitor-enter(r1)
            r0.sendToTarget()     // Catch:{ all -> 0x009e }
            java.lang.Object r0 = r4.mSetupFence     // Catch:{ InterruptedException -> 0x0096 }
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.wait(r2)     // Catch:{ InterruptedException -> 0x0096 }
            monitor-exit(r1)     // Catch:{ all -> 0x009e }
            android.os.Handler r0 = r4.mHandler
            r1 = 11
            android.os.Message r0 = r0.obtainMessage(r1)
            android.os.Handler r1 = r4.mHandler
            r2 = 120000(0x1d4c0, double:5.9288E-319)
            r1.sendMessageDelayed(r0, r2)
            return
        L_0x0096:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x009e }
            java.lang.String r2 = "EGL initial timeout"
            r0.<init>(r2)     // Catch:{ all -> 0x009e }
            throw r0     // Catch:{ all -> 0x009e }
        L_0x009e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x009e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.texturerender.TextureRenderer.<init>():void");
    }

    private void initEGL() {
        this.mEglDisplay = getDefaultDisplay();
        if (this.mEglDisplay != null) {
            this.mEglConfig = chooseEglConfig();
            if (this.mEglConfig != null) {
                this.mEglContext = createContext(this.mEglDisplay, this.mEglConfig);
                if (this.mEglContext != EGL14.EGL_NO_CONTEXT) {
                    this.mEglDummySurface = EGL14.eglCreatePbufferSurface(this.mEglDisplay, this.mEglConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
                    try {
                        if (this.mEglDummySurface == null || this.mEglDummySurface == EGL14.EGL_NO_SURFACE) {
                            notifyEGLError(0, "create eglCreatePbufferSurface failed");
                        }
                        if (!EGL14.eglMakeCurrent(this.mEglDisplay, this.mEglDummySurface, this.mEglDummySurface, this.mEglContext)) {
                            notifyEGLError(0, "eglMakeCurrent failed");
                        }
                        this.mTriangleVertices = ByteBuffer.allocateDirect(this.mTriangleVerticesData.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                        this.mTriangleVertices.put(this.mTriangleVerticesData).position(0);
                        this.mTextureVertices = ByteBuffer.allocateDirect(this.mTextureVerticesData.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                        this.mTextureVertices.put(this.mTextureVerticesData).position(0);
                    } catch (Exception unused) {
                        notifyEGLError(0, "create dummy env failed");
                    }
                }
            }
        }
    }

    public void handleFrameAvailable(VideoSurfaceTexture videoSurfaceTexture) {
        handleDraw(videoSurfaceTexture);
    }

    public void setOnErrorListener(OnEglErrorListener onEglErrorListener) {
        this.mErrorListener = onEglErrorListener;
    }

    public void setOnStateChangedListener(OnStateChangeListener onStateChangeListener) {
        this.mStateChangeListener = onStateChangeListener;
    }

    private void handleDraw(VideoSurfaceTexture videoSurfaceTexture) {
        if (draw(videoSurfaceTexture)) {
            videoSurfaceTexture.render();
        }
    }

    public void handleChangeActiveTexture(VideoSurfaceTexture videoSurfaceTexture) {
        if (videoSurfaceTexture != null && !videoSurfaceTexture.isCurrentObject(this.mDrawingObjectId)) {
            videoSurfaceTexture.makeCurrent();
            this.mDrawingObjectId = videoSurfaceTexture.getOjbectId();
        }
    }

    public void handleGenTexture(Message message) {
        message.obj = this.mTextureFactory.createTexture();
        synchronized (message) {
            message.notify();
        }
    }

    public void handleInit(Object obj) {
        initEGL();
        if (this.mState != -1) {
            initGLComponents();
            if (this.mState != -1) {
                changeState(1, true);
                synchronized (obj) {
                    obj.notify();
                }
            }
        }
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 6:
                if (this.mErrorListener != null) {
                    this.mErrorListener.onError(message.arg1, message.obj.toString());
                    break;
                }
                break;
            case 7:
                if (this.mStateChangeListener != null) {
                    this.mStateChangeListener.onStateChanged(message.arg1);
                    if (message.arg1 == 0) {
                        this.mNotifyHandler.removeCallbacksAndMessages(null);
                        this.mNotifyHandler = null;
                        break;
                    }
                }
                break;
            case 8:
                int i = message.arg1;
                VideoSurfaceTexture videoSurfaceTexture = (VideoSurfaceTexture) message.obj;
                if (videoSurfaceTexture != null) {
                    videoSurfaceTexture.notifyRenderFrame(i);
                    break;
                }
                break;
        }
        return true;
    }

    public void handleSetSurface(Message message) {
        Bundle data = message.getData();
        if (data != null) {
            VideoSurfaceTexture videoSurfaceTexture = (VideoSurfaceTexture) data.getSerializable("texture");
            if (videoSurfaceTexture != null) {
                boolean z = true;
                if (this.mDrawingObjectId != 0 && !videoSurfaceTexture.isCurrentObject(this.mDrawingObjectId)) {
                    z = false;
                }
                if (videoSurfaceTexture.handleSurfaceChange(z, this.mEglDummySurface) && !videoSurfaceTexture.isPaused()) {
                    this.mDrawingObjectId = videoSurfaceTexture.getOjbectId();
                }
                Object obj = message.obj;
                if (obj != null) {
                    synchronized (obj) {
                        obj.notify();
                    }
                    return;
                }
                return;
            }
            throw new RuntimeException("update surface but missing texture");
        }
        throw new RuntimeException("update surface but missing bundle?");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void changeState(int r3, boolean r4) {
        /*
            r2 = this;
            int r0 = r2.mState
            if (r0 != r3) goto L_0x0005
            return
        L_0x0005:
            int r0 = r2.mState
            r1 = -1
            if (r0 != r1) goto L_0x000d
            if (r3 == 0) goto L_0x000d
            return
        L_0x000d:
            r2.mState = r3
            if (r4 != 0) goto L_0x0012
            return
        L_0x0012:
            java.lang.Object r4 = r2.mHandlerObject
            monitor-enter(r4)
            com.ss.texturerender.TextureRenderer$OnStateChangeListener r0 = r2.mStateChangeListener     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x002c
            android.os.Handler r0 = r2.mNotifyHandler     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x001e
            goto L_0x002c
        L_0x001e:
            android.os.Handler r0 = r2.mNotifyHandler     // Catch:{ all -> 0x002e }
            r1 = 7
            android.os.Message r0 = r0.obtainMessage(r1)     // Catch:{ all -> 0x002e }
            r0.arg1 = r3     // Catch:{ all -> 0x002e }
            r0.sendToTarget()     // Catch:{ all -> 0x002e }
            monitor-exit(r4)     // Catch:{ all -> 0x002e }
            return
        L_0x002c:
            monitor-exit(r4)     // Catch:{ all -> 0x002e }
            return
        L_0x002e:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.texturerender.TextureRenderer.changeState(int, boolean):void");
    }

    private EGLContext createContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        if (eglCreateContext == EGL14.EGL_NO_CONTEXT) {
            notifyEGLError(0, "eglcreateContext failed");
        }
        return eglCreateContext;
    }

    /* access modifiers changed from: protected */
    public void notifyEGLError(int i, String str) {
        synchronized (this.mHandlerObject) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(", reason = ");
            sb.append(GLUtils.getEGLErrorString(EGL14.eglGetError()));
            this.mErrorReason = sb.toString();
            changeState(-1, false);
            if (this.mErrorListener != null) {
                Message obtainMessage = this.mNotifyHandler.obtainMessage(6);
                obtainMessage.arg1 = i;
                StringBuilder sb2 = new StringBuilder("EGL fail = ");
                sb2.append(str);
                sb2.append(", reason = ");
                sb2.append(GLUtils.getEGLErrorString(EGL14.eglGetError()));
                obtainMessage.obj = sb2.toString();
                obtainMessage.sendToTarget();
            }
        }
    }
}
