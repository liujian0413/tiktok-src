package com.p280ss.android.ttvecamera;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.p022v4.content.C0683b;
import com.p280ss.android.ttvecamera.C20604f.C20605a;
import com.p280ss.android.ttvecamera.C20604f.C20606b;
import com.p280ss.android.ttvecamera.C20604f.C20607c;
import com.p280ss.android.ttvecamera.C20621g.C20622a;
import com.p280ss.android.ttvecamera.C20621g.C20624c;
import com.p280ss.android.ttvecamera.C20632i.C20633a;
import com.p280ss.android.ttvecamera.C20632i.C20634b;
import com.p280ss.android.ttvecamera.C20632i.C20636d;
import com.p280ss.android.ttvecamera.C20632i.C20638f;
import com.p280ss.android.ttvecamera.C20632i.C20639g;
import com.p280ss.android.ttvecamera.C20632i.C20640h;
import com.p280ss.android.ttvecamera.C20632i.C20641i;
import com.p280ss.android.ttvecamera.p919f.C20610b;
import com.p280ss.android.ttvecamera.p919f.C20613c;
import com.p280ss.android.ttvecamera.p919f.C20613c.C20614a;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;

/* renamed from: com.ss.android.ttvecamera.TECameraServer */
public enum TECameraServer {
    INSTANCE;
    
    public long mBeginTime;
    public C20621g mCameraClient;
    private C20605a mCameraEvent;
    public C20604f mCameraInstance;
    public C20622a mCameraObserver;
    public C20632i mCameraSettings;
    public ConditionVariable mCondofClose;
    public int mCurrentCameraState;
    private float mCurrentZoom;
    private Handler mHandler;
    private volatile boolean mHandlerDestroyed;
    private HandlerThread mHandlerThread;
    private volatile boolean mIsCameraProviderChanged;
    public boolean mIsFirstFrame;
    private volatile boolean mIsInitialized;
    private Object mLock;
    public long mOpenTime;
    public C20624c mPictureSizeCallback;
    C20613c mProviderManager;
    private C20614a mProviderSettings;
    public int mRetryCnt;
    public C20639g mSATZoomCallback;
    public final Object mStateLock;
    private C20606b pictureSizeCallBack;
    private volatile int sClientCount;
    private C20607c satZoomCallback;

    public final void changeCaptureFormat() {
    }

    public final int getCameraState() {
        int i;
        synchronized (this.mStateLock) {
            i = this.mCurrentCameraState;
        }
        return i;
    }

    private synchronized int decreaseClientCount() {
        this.sClientCount--;
        StringBuilder sb = new StringBuilder("sClientCount = ");
        sb.append(this.sClientCount);
        C20652m.m68435b("TECameraServer", sb.toString());
        if (this.sClientCount < 0) {
            StringBuilder sb2 = new StringBuilder("Invalid ClientCount = ");
            sb2.append(this.sClientCount);
            C20652m.m68436c("TECameraServer", sb2.toString());
            this.sClientCount = 0;
        }
        return this.sClientCount;
    }

    private synchronized int destroy() {
        C20652m.m68434a("TECameraServer", "destroy...");
        this.mIsInitialized = false;
        if (this.mHandlerThread != null) {
            if (VERSION.SDK_INT >= 18) {
                this.mHandlerThread.quitSafely();
            } else {
                this.mHandlerThread.quit();
            }
            this.mHandlerThread = null;
            this.mHandlerDestroyed = true;
            this.mHandler = null;
        }
        C20610b bVar = this.mProviderManager.f55676b;
        if (bVar != null) {
            bVar.mo55752d();
        }
        this.mCameraObserver = C20623b.m68366a();
        return 0;
    }

    private synchronized int increaseClientCount() {
        this.sClientCount++;
        StringBuilder sb = new StringBuilder("sClientCount = ");
        sb.append(this.sClientCount);
        C20652m.m68435b("TECameraServer", sb.toString());
        return this.sClientCount;
    }

    public final boolean isCameraPermitted() {
        try {
            if (C0683b.m2909b(this.mCameraSettings.f55723b, "android.permission.CAMERA") == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("test camera permission failed!: ");
            sb.append(e.toString());
            C20652m.m68437d("TECameraServer", sb.toString());
            return true;
        }
    }

    private C20604f createCameraInstance() {
        if (VERSION.SDK_INT < 24) {
            return C20573c.m68100a(this.mCameraSettings.f55723b, this.mCameraEvent, this.mHandler, this.pictureSizeCallBack);
        }
        if (this.mCameraSettings.f55724c == 1) {
            return C20573c.m68100a(this.mCameraSettings.f55723b, this.mCameraEvent, this.mHandler, this.pictureSizeCallBack);
        }
        if (this.mCameraSettings.f55724c != 6 || VERSION.SDK_INT <= 28) {
            return C20599e.m68205a(this.mCameraSettings.f55724c, this.mCameraSettings.f55723b, this.mCameraEvent, this.mHandler, this.pictureSizeCallBack);
        }
        C20652m.m68436c("TECameraServer", "Not support CameraKit, fallback to Camera2");
        this.mCameraSettings.f55724c = 2;
        return C20562b.m68071a(this.mCameraSettings, this.mCameraEvent, this.mHandler, this.pictureSizeCallBack);
    }

    public final int close() {
        if (this.mHandlerDestroyed || Looper.myLooper() == this.mHandler.getLooper()) {
            C20652m.m68435b("TECameraServer", "close...");
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 0) {
                    StringBuilder sb = new StringBuilder("No need switch state: ");
                    sb.append(this.mCurrentCameraState);
                    sb.append(" ==> 0");
                    C20652m.m68436c("TECameraServer", sb.toString());
                } else {
                    this.mCurrentCameraState = 0;
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.mo55686e();
                    }
                }
                this.mCameraInstance = null;
            }
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            this.mCondofClose.close();
            this.mHandler.post(new Runnable() {
                public final void run() {
                    C20630h.m68390a("te_record_camera_push_close_task_time", System.currentTimeMillis() - currentTimeMillis);
                    TECameraServer.this.close();
                    TECameraServer.this.mCondofClose.open();
                    C20630h.m68390a("te_record_camera_close_cost", System.currentTimeMillis() - currentTimeMillis);
                }
            });
            this.mCondofClose.block(DouPlusShareGuideExperiment.MIN_VALID_DURATION);
            StringBuilder sb2 = new StringBuilder("Camera close cost: ");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append("ms");
            C20652m.m68436c("TECameraServer", sb2.toString());
        }
        return 0;
    }

    public final void setSATZoomCallback(C20639g gVar) {
        this.mSATZoomCallback = gVar;
    }

    public final C20633a getCameraECInfo(C20621g gVar) {
        if (assertClient(gVar) && this.mCameraInstance != null) {
            return this.mCameraInstance.mo55741t();
        }
        return null;
    }

    public final boolean isSupportWhileBalance(C20621g gVar) {
        boolean z = false;
        if (!assertClient(gVar)) {
            return false;
        }
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null && this.mCameraInstance.mo55691j()) {
                z = true;
            }
        }
        return z;
    }

    public final boolean isTorchSupported(C20621g gVar) {
        if (!assertClient(gVar)) {
            return false;
        }
        C20604f fVar = this.mCameraInstance;
        if (fVar == null || !fVar.mo55692k()) {
            return false;
        }
        return true;
    }

    private boolean assertClient(C20621g gVar) {
        synchronized (this.mLock) {
            if (this.mCameraClient == gVar) {
                return true;
            }
            if (this.mCameraClient == null) {
                C20652m.m68436c("TECameraServer", "Internal CameraClient is null. Must call connect first!");
            } else {
                StringBuilder sb = new StringBuilder("Invalid CameraClient, need : ");
                sb.append(this.mCameraClient);
                C20652m.m68436c("TECameraServer", sb.toString());
            }
            return false;
        }
    }

    private synchronized void init(boolean z) {
        C20652m.m68434a("TECameraServer", "init...");
        if (!this.mIsInitialized) {
            this.mHandler = createHandler(z);
            this.mHandlerDestroyed = false;
            this.mProviderManager = new C20613c();
            this.mIsInitialized = true;
            this.mCurrentZoom = 0.0f;
        }
    }

    public final int cancelFocus(final C20621g gVar) {
        if (!assertClient(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public final void run() {
                    TECameraServer.this.cancelFocus(gVar);
                }
            });
        } else {
            C20652m.m68435b("TECameraServer", "cancelFocus...");
            synchronized (this.mStateLock) {
                this.mCameraInstance.mo55690i();
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (decreaseClientCount() != 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        return destroy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int disConnect(com.p280ss.android.ttvecamera.C20621g r4) {
        /*
            r3 = this;
            java.lang.String r0 = "TECameraServer"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "disConnect with client: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.p280ss.android.ttvecamera.C20652m.m68434a(r0, r1)
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            com.ss.android.ttvecamera.g r1 = r3.mCameraClient     // Catch:{ all -> 0x003b }
            if (r1 != r4) goto L_0x0037
            com.ss.android.ttvecamera.g r4 = r3.mCameraClient     // Catch:{ all -> 0x003b }
            if (r4 == 0) goto L_0x0037
            r4 = 0
            r3.mCameraClient = r4     // Catch:{ all -> 0x003b }
            android.os.Handler r1 = r3.mHandler     // Catch:{ all -> 0x003b }
            r1.removeCallbacksAndMessages(r4)     // Catch:{ all -> 0x003b }
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            r3.close()
            int r4 = r3.decreaseClientCount()
            if (r4 != 0) goto L_0x0035
            int r4 = r3.destroy()
            return r4
        L_0x0035:
            r4 = 0
            return r4
        L_0x0037:
            r4 = -100
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return r4
        L_0x003b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ttvecamera.TECameraServer.disConnect(com.ss.android.ttvecamera.g):int");
    }

    public final int getExposureCompensation(C20621g gVar) {
        if (assertClient(gVar)) {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    int u = this.mCameraInstance.mo55742u();
                    return u;
                }
                C20622a aVar = this.mCameraObserver;
                StringBuilder sb = new StringBuilder("Can not get ec on state : ");
                sb.append(this.mCurrentCameraState);
                aVar.onError(-105, sb.toString());
                return -105;
            }
        }
        throw new RuntimeException("Client is not connected!!!");
    }

    public final boolean isSupportedExposureCompensation(C20621g gVar) {
        if (!assertClient(gVar)) {
            return false;
        }
        synchronized (this.mStateLock) {
            if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                boolean s = this.mCameraInstance.mo55740s();
                return s;
            }
            StringBuilder sb = new StringBuilder("Can not set ec on state : ");
            sb.append(this.mCurrentCameraState);
            C20652m.m68436c("TECameraServer", sb.toString());
            return false;
        }
    }

    public final int removeCameraProvider(final C20621g gVar) {
        if (!assertClient(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public final void run() {
                    TECameraServer.this.removeCameraProvider(gVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                this.mProviderManager.mo55757a();
            }
        }
        return 0;
    }

    private Handler createHandler(boolean z) {
        Looper looper;
        if (z) {
            try {
                if (this.mHandlerThread != null) {
                    this.mHandlerThread.quit();
                }
                this.mHandlerThread = new HandlerThread("TECameraServer");
                this.mHandlerThread.start();
                return new Handler(this.mHandlerThread.getLooper());
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("CreateHandler failed!: ");
                sb.append(e.toString());
                C20652m.m68437d("TECameraServer", sb.toString());
            }
        }
        if (Looper.myLooper() != null) {
            looper = Looper.myLooper();
        } else {
            looper = Looper.getMainLooper();
        }
        return new Handler(looper);
    }

    private boolean shouldReOpenCamera(C20632i iVar) {
        if (this.mCameraSettings == null || (this.mCameraSettings.f55724c == iVar.f55724c && this.mCameraSettings.f55731j.f55535a == iVar.f55731j.f55535a && this.mCameraSettings.f55731j.f55536b == iVar.f55731j.f55536b && this.mCameraSettings.f55726e == iVar.f55726e && this.mCameraSettings.f55747z == iVar.f55747z && this.mCameraSettings.f55720A == iVar.f55720A && this.mCameraSettings.f55739r == iVar.f55739r && this.mCameraSettings.f55734m == iVar.f55734m && this.mCameraSettings.f55736o == iVar.f55736o)) {
            return false;
        }
        return true;
    }

    public final boolean couldForwardState(int i) {
        if (i == this.mCurrentCameraState) {
            C20652m.m68436c("TECameraServer", "No need this");
        }
        switch (i) {
            case 0:
                return true;
            case 1:
                if (this.mCurrentCameraState != 0) {
                    StringBuilder sb = new StringBuilder("No need open camera again, state = ");
                    sb.append(this.mCurrentCameraState);
                    C20652m.m68436c("TECameraServer", sb.toString());
                }
                return true;
            case 2:
            case 3:
                if (this.mCurrentCameraState == 1) {
                    return true;
                }
                return false;
            default:
                StringBuilder sb2 = new StringBuilder("Invalidate camera state = ");
                sb2.append(i);
                C20652m.m68437d("TECameraServer", sb2.toString());
                return false;
        }
    }

    public final void downExposureCompensation(final C20621g gVar) {
        if (assertClient(gVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new Runnable() {
                    public final void run() {
                        TECameraServer.this.downExposureCompensation(gVar);
                    }
                });
                return;
            }
            C20652m.m68435b("TECameraServer", "downExposureCompensation...");
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    C20633a t = this.mCameraInstance.mo55741t();
                    if (t == null) {
                        this.mCameraObserver.onError(-112, "downExposureCompensation get ec info failed");
                    } else {
                        this.mCameraInstance.mo55681b(t.f55749b - 1);
                    }
                } else {
                    C20622a aVar = this.mCameraObserver;
                    StringBuilder sb = new StringBuilder("Can not set ec on state : ");
                    sb.append(this.mCurrentCameraState);
                    aVar.onError(-105, sb.toString());
                }
            }
        }
    }

    public final int startCameraFaceDetect(final C20621g gVar) {
        if (!assertClient(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public final void run() {
                    TECameraServer.this.startCameraFaceDetect(gVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState != 3) {
                    C20622a aVar = this.mCameraObserver;
                    StringBuilder sb = new StringBuilder("Can not start face detect on state : ");
                    sb.append(this.mCurrentCameraState);
                    aVar.onError(-105, sb.toString());
                    return -105;
                }
                this.mCameraInstance.mo55683c();
            }
        }
        return 0;
    }

    public final int stopCameraFaceDetect(final C20621g gVar) {
        if (!assertClient(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public final void run() {
                    TECameraServer.this.stopCameraFaceDetect(gVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState != 3) {
                    C20622a aVar = this.mCameraObserver;
                    StringBuilder sb = new StringBuilder("Can not stop face detect on state : ");
                    sb.append(this.mCurrentCameraState);
                    aVar.onError(-105, sb.toString());
                    return -105;
                }
                this.mCameraInstance.mo55685d();
            }
        }
        return 0;
    }

    public final void upExposureCompensation(final C20621g gVar) {
        if (assertClient(gVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new Runnable() {
                    public final void run() {
                        TECameraServer.this.upExposureCompensation(gVar);
                    }
                });
                return;
            }
            C20652m.m68435b("TECameraServer", "upExposureCompensation...");
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    C20633a t = this.mCameraInstance.mo55741t();
                    if (t == null) {
                        this.mCameraObserver.onError(-112, "upExposureCompensation get ec info failed");
                    } else {
                        this.mCameraInstance.mo55681b(t.f55749b + 1);
                    }
                } else {
                    C20622a aVar = this.mCameraObserver;
                    StringBuilder sb = new StringBuilder("Can not set ec on state : ");
                    sb.append(this.mCurrentCameraState);
                    aVar.onError(-105, sb.toString());
                }
            }
        }
    }

    public final int start(final C20621g gVar) {
        StringBuilder sb = new StringBuilder("start: client");
        sb.append(gVar);
        C20652m.m68434a("TECameraServer", sb.toString());
        if (!assertClient(gVar)) {
            return -108;
        }
        if (this.mCameraSettings == null || this.mCameraSettings.f55723b == null) {
            C20652m.m68437d("TECameraServer", "mCameraSettings has some error");
            return -100;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public final void run() {
                    TECameraServer.this.start(gVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3) {
                    StringBuilder sb2 = new StringBuilder("No need switch state: ");
                    sb2.append(this.mCurrentCameraState);
                    sb2.append(" ==> 3");
                    C20652m.m68436c("TECameraServer", sb2.toString());
                    if (!this.mIsCameraProviderChanged) {
                        return 0;
                    }
                    this.mCameraInstance.mo55680b();
                    this.mCurrentCameraState = 2;
                    this.mIsCameraProviderChanged = false;
                }
                if (this.mCurrentCameraState != 2) {
                    C20622a aVar = this.mCameraObserver;
                    StringBuilder sb3 = new StringBuilder("Invalidate state: ");
                    sb3.append(this.mCurrentCameraState);
                    sb3.append(" ==> 3");
                    aVar.onError(-105, sb3.toString());
                    return -105;
                }
                this.mCurrentCameraState = 3;
                this.mCameraInstance.mo55667a();
                C20630h.m68390a("te_record_camera_type", (long) this.mCameraInstance.mo55687f());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.mCameraSettings.f55731j.f55535a);
                sb4.append("*");
                sb4.append(this.mCameraSettings.f55731j.f55536b);
                C20630h.m68391a("te_preview_camera_resolution", sb4.toString());
                C20630h.m68389a("te_record_camera_frame_rate", (double) this.mCameraSettings.f55725d.f55776b);
                C20630h.m68390a("te_record_camera_direction", (long) this.mCameraSettings.f55726e);
            }
        }
        return 0;
    }

    public final int stop(final C20621g gVar) {
        StringBuilder sb = new StringBuilder("stop: client");
        sb.append(gVar);
        C20652m.m68434a("TECameraServer", sb.toString());
        if (!assertClient(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public final void run() {
                    TECameraServer.this.stop(gVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 2) {
                    StringBuilder sb2 = new StringBuilder("No need switch state: ");
                    sb2.append(this.mCurrentCameraState);
                    sb2.append(" ==> 2");
                    C20652m.m68436c("TECameraServer", sb2.toString());
                    return 0;
                } else if (this.mCurrentCameraState != 3) {
                    C20622a aVar = this.mCameraObserver;
                    StringBuilder sb3 = new StringBuilder("Invalidate state: ");
                    sb3.append(this.mCurrentCameraState);
                    sb3.append(" ==> 2");
                    aVar.onError(-105, sb3.toString());
                    return -105;
                } else {
                    this.mCurrentCameraState = 2;
                    this.mCameraInstance.mo55680b();
                }
            }
        }
        return 0;
    }

    public final int process(final C20621g gVar, final C20636d dVar) {
        if (!assertClient(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public final void run() {
                    TECameraServer.this.process(gVar, dVar);
                }
            });
        } else {
            C20652m.m68435b("TECameraServer", "setFeatureParameters...");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo55738a(dVar);
                }
            }
        }
        return 0;
    }

    public final float queryShaderZoomStep(final C20621g gVar, final C20640h hVar) {
        if (!assertClient(gVar)) {
            return -108.0f;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public final void run() {
                    TECameraServer.this.queryShaderZoomStep(gVar, hVar);
                }
            });
        } else {
            C20652m.m68435b("TECameraServer", "queryShaderZoomStep...");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo55675a(hVar);
                }
            }
        }
        return 0.0f;
    }

    public final int queryZoomAbility(final C20621g gVar, final C20641i iVar) {
        if (!assertClient(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public final void run() {
                    TECameraServer.this.queryZoomAbility(gVar, iVar);
                }
            });
        } else {
            C20652m.m68435b("TECameraServer", "queryZoomAbility...");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo55676a(iVar);
                }
            }
        }
        return 0;
    }

    public final int setFeatureParameters(final C20621g gVar, final Bundle bundle) {
        if (!assertClient(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public final void run() {
                    TECameraServer.this.setFeatureParameters(gVar, bundle);
                }
            });
        } else {
            C20652m.m68435b("TECameraServer", "setFeatureParameters...");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo55613a(bundle);
                }
            }
        }
        return 0;
    }

    public final int stopZoom(final C20621g gVar, final C20641i iVar) {
        if (!assertClient(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public final void run() {
                    TECameraServer.this.stopZoom(gVar, iVar);
                }
            });
        } else {
            C20652m.m68435b("TECameraServer", "stopZoom...");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo55682b(iVar);
                }
            }
        }
        return 0;
    }

    public final int zoomV2(final C20621g gVar, final float f) {
        if (!assertClient(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public final void run() {
                    TECameraServer.this.zoomV2(gVar, f);
                }
            });
        } else {
            C20652m.m68435b("TECameraServer", "zoomV2...");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo55668a(f);
                }
            }
        }
        return 0;
    }

    public final int addCameraProvider(final C20621g gVar, final C20614a aVar) {
        if (!assertClient(gVar)) {
            return -108;
        }
        if (this.mHandlerDestroyed || Looper.myLooper() == this.mHandler.getLooper()) {
            synchronized (this.mStateLock) {
                if (this.mCameraInstance == null) {
                    this.mCameraObserver.onError(-100, "Invalidate Camera Instance!!");
                    return -100;
                }
                if (!(this.mProviderSettings == null || this.mCameraInstance.f55654n == null)) {
                    if (this.mProviderSettings == null || this.mProviderSettings.mo55765a(aVar)) {
                        this.mIsCameraProviderChanged = false;
                    }
                }
                this.mProviderManager.mo55758a(aVar, this.mCameraInstance);
                this.mIsCameraProviderChanged = true;
                this.mProviderSettings = aVar;
            }
        } else {
            this.mHandler.post(new Runnable() {
                public final void run() {
                    TECameraServer.this.addCameraProvider(gVar, aVar);
                }
            });
        }
        return 0;
    }

    public final int focusAtPoint(final C20621g gVar, final C20650k kVar) {
        if (!assertClient(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public final void run() {
                    TECameraServer.this.focusAtPoint(gVar, kVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    this.mCameraInstance.mo55677a(kVar);
                } else {
                    C20622a aVar = this.mCameraObserver;
                    StringBuilder sb = new StringBuilder("Can not set focus on state : ");
                    sb.append(this.mCurrentCameraState);
                    aVar.onError(-105, sb.toString());
                    return -105;
                }
            }
        }
        return 0;
    }

    public final float[] getFOV(final C20621g gVar, final C20634b bVar) {
        float[] fArr = new float[2];
        if (!assertClient(gVar)) {
            return new float[]{-2.0f, -2.0f};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public final void run() {
                    float[] fov = TECameraServer.this.getFOV(gVar, bVar);
                    if (bVar != null) {
                        bVar.mo55813a(fov);
                    }
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState != 3) {
                    C20622a aVar = this.mCameraObserver;
                    StringBuilder sb = new StringBuilder("Can not getFOV on state : ");
                    sb.append(this.mCurrentCameraState);
                    aVar.onError(-105, sb.toString());
                    float[] fArr2 = {-2.0f, -2.0f};
                    return fArr2;
                }
                fArr = this.mCameraInstance.mo55689h();
            }
        }
        return fArr;
    }

    public final void setExposureCompensation(final C20621g gVar, final int i) {
        if (assertClient(gVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new Runnable() {
                    public final void run() {
                        TECameraServer.this.setExposureCompensation(gVar, i);
                    }
                });
                return;
            }
            StringBuilder sb = new StringBuilder("setExposureCompensation: ");
            sb.append(i);
            C20652m.m68435b("TECameraServer", sb.toString());
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    this.mCameraInstance.mo55681b(i);
                    return;
                }
                C20622a aVar = this.mCameraObserver;
                StringBuilder sb2 = new StringBuilder("Can not set ec on state : ");
                sb2.append(this.mCurrentCameraState);
                aVar.onError(-105, sb2.toString());
            }
        }
    }

    public final int switchCameraMode(final C20621g gVar, final int i) {
        if (!assertClient(gVar)) {
            return -108;
        }
        if (gVar.f55697a.f55724c == 1 || (i != 1 && i != 0)) {
            return -100;
        }
        if (gVar.f55697a.f55737p == i) {
            return 0;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public final void run() {
                    TECameraServer.this.switchCameraMode(gVar, i);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState != 3) {
                    C20622a aVar = this.mCameraObserver;
                    StringBuilder sb = new StringBuilder("Invalidate state: ");
                    sb.append(this.mCurrentCameraState);
                    sb.append(" ==> 3");
                    aVar.onError(-105, sb.toString());
                    return -105;
                }
                this.mCameraInstance.mo55670a(i);
            }
        }
        return 0;
    }

    public final int switchFlashMode(final C20621g gVar, final int i) {
        if (!assertClient(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public final void run() {
                    TECameraServer.this.switchFlashMode(gVar, i);
                }
            });
        } else {
            StringBuilder sb = new StringBuilder("switchFlashMode: ");
            sb.append(i);
            C20652m.m68435b("TECameraServer", sb.toString());
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo55684c(i);
                }
                C20652m.m68437d("TECameraServer", "switchFlashMode: camera instance null");
            }
        }
        return 0;
    }

    public final int toggleTorch(final C20621g gVar, final boolean z) {
        if (!assertClient(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public final void run() {
                    TECameraServer.this.toggleTorch(gVar, z);
                }
            });
        } else {
            StringBuilder sb = new StringBuilder("toggleTorch: ");
            sb.append(z);
            C20652m.m68435b("TECameraServer", sb.toString());
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo55678a(z);
                }
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int open(com.p280ss.android.ttvecamera.C20621g r10, com.p280ss.android.ttvecamera.C20632i r11) {
        /*
            r9 = this;
            boolean r0 = r9.assertClient(r10)
            if (r0 != 0) goto L_0x0009
            r10 = -108(0xffffffffffffff94, float:NaN)
            return r10
        L_0x0009:
            android.os.Handler r0 = r9.mHandler
            if (r0 != 0) goto L_0x0017
            java.lang.String r10 = "TECameraServer"
            java.lang.String r11 = "mHandler is null!"
            com.p280ss.android.ttvecamera.C20652m.m68437d(r10, r11)
            r10 = -112(0xffffffffffffff90, float:NaN)
            return r10
        L_0x0017:
            boolean r0 = r9.mHandlerDestroyed
            r1 = 0
            if (r0 != 0) goto L_0x003c
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r2 = r9.mHandler
            android.os.Looper r2 = r2.getLooper()
            if (r0 == r2) goto L_0x003c
            long r5 = java.lang.System.currentTimeMillis()
            android.os.Handler r0 = r9.mHandler
            com.ss.android.ttvecamera.TECameraServer$1 r2 = new com.ss.android.ttvecamera.TECameraServer$1
            r3 = r2
            r4 = r9
            r7 = r10
            r8 = r11
            r3.<init>(r5, r7, r8)
            r0.post(r2)
            goto L_0x00bc
        L_0x003c:
            r9.mCameraSettings = r11
            r10 = 0
            r9.mCurrentZoom = r10
            int r10 = r9.mRetryCnt
            if (r10 >= 0) goto L_0x0049
            int r10 = r11.f55735n
            r9.mRetryCnt = r10
        L_0x0049:
            java.lang.Object r10 = r9.mStateLock
            monitor-enter(r10)
            int r11 = r9.mCurrentCameraState     // Catch:{ all -> 0x00bd }
            r0 = 1
            if (r11 == 0) goto L_0x0073
            java.lang.String r11 = "TECameraServer"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = "No need open camera again, state = "
            r2.<init>(r3)     // Catch:{ all -> 0x00bd }
            int r3 = r9.mCurrentCameraState     // Catch:{ all -> 0x00bd }
            r2.append(r3)     // Catch:{ all -> 0x00bd }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00bd }
            com.p280ss.android.ttvecamera.C20652m.m68436c(r11, r2)     // Catch:{ all -> 0x00bd }
            int r11 = r9.mCurrentCameraState     // Catch:{ all -> 0x00bd }
            if (r11 == r0) goto L_0x0071
            com.ss.android.ttvecamera.g$a r11 = r9.mCameraObserver     // Catch:{ all -> 0x00bd }
            java.lang.String r2 = "Camera features is ready"
            r11.onInfo(r0, r1, r2)     // Catch:{ all -> 0x00bd }
        L_0x0071:
            monitor-exit(r10)     // Catch:{ all -> 0x00bd }
            return r1
        L_0x0073:
            r9.mCurrentCameraState = r0     // Catch:{ all -> 0x00bd }
            com.ss.android.ttvecamera.f r11 = r9.mCameraInstance     // Catch:{ all -> 0x00bd }
            if (r11 != 0) goto L_0x0098
            com.ss.android.ttvecamera.f r11 = r9.createCameraInstance()     // Catch:{ all -> 0x00bd }
            r9.mCameraInstance = r11     // Catch:{ all -> 0x00bd }
            com.ss.android.ttvecamera.f r11 = r9.mCameraInstance     // Catch:{ all -> 0x00bd }
            com.ss.android.ttvecamera.f$c r0 = r9.satZoomCallback     // Catch:{ all -> 0x00bd }
            r11.mo55737a(r0)     // Catch:{ all -> 0x00bd }
            com.ss.android.ttvecamera.f r11 = r9.mCameraInstance     // Catch:{ all -> 0x00bd }
            if (r11 != 0) goto L_0x0098
            r9.mCurrentCameraState = r1     // Catch:{ all -> 0x00bd }
            com.ss.android.ttvecamera.g$a r11 = r9.mCameraObserver     // Catch:{ all -> 0x00bd }
            r0 = -100
            java.lang.String r1 = "open : mCameraInstance is null."
            r11.onError(r0, r1)     // Catch:{ all -> 0x00bd }
            r11 = -1
            monitor-exit(r10)     // Catch:{ all -> 0x00bd }
            return r11
        L_0x0098:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00bd }
            r9.mBeginTime = r2     // Catch:{ all -> 0x00bd }
            com.ss.android.ttvecamera.f r11 = r9.mCameraInstance     // Catch:{ all -> 0x00bd }
            com.ss.android.ttvecamera.i r0 = r9.mCameraSettings     // Catch:{ all -> 0x00bd }
            int r11 = r11.mo55665a(r0)     // Catch:{ all -> 0x00bd }
            if (r11 == 0) goto L_0x00bb
            java.lang.String r0 = "TECameraServer"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = "Open camera failed, ret = "
            r2.<init>(r3)     // Catch:{ all -> 0x00bd }
            r2.append(r11)     // Catch:{ all -> 0x00bd }
            java.lang.String r11 = r2.toString()     // Catch:{ all -> 0x00bd }
            com.p280ss.android.ttvecamera.C20652m.m68436c(r0, r11)     // Catch:{ all -> 0x00bd }
        L_0x00bb:
            monitor-exit(r10)     // Catch:{ all -> 0x00bd }
        L_0x00bc:
            return r1
        L_0x00bd:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00bd }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ttvecamera.TECameraServer.open(com.ss.android.ttvecamera.g, com.ss.android.ttvecamera.i):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        r0 = r7.keySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r0.hasNext() == false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        r1 = (java.lang.String) r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r6.containsKey(r1) == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        r2 = com.p280ss.android.ttvecamera.C20632i.C20635c.m68398a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r2 != java.lang.Boolean.class) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        r7.putBoolean(r1, r6.getBoolean(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r2 != java.lang.Integer.class) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        r7.putInt(r1, r6.getInt(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r2 != java.lang.Long.class) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        r7.putLong(r1, r6.getLong(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r2 != java.lang.Float.class) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        r7.putFloat(r1, r6.getFloat(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        if (r2 != java.lang.Double.class) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006b, code lost:
        r7.putDouble(r1, r6.getDouble(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0075, code lost:
        if (r2 != java.lang.String.class) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        r7.putString(r1, r6.getString(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0081, code lost:
        if (r2 != java.util.ArrayList.class) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0083, code lost:
        r7.putParcelableArrayList(r1, r6.getParcelableArrayList(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008d, code lost:
        if (r2 != com.p280ss.android.ttvecamera.TEFrameSizei.class) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008f, code lost:
        r7.putParcelable(r1, r6.getParcelable(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0099, code lost:
        if (r2 != com.p280ss.android.ttvecamera.TEFocusParameters.class) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009b, code lost:
        r7.putParcelable(r1, r6.getParcelable(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a4, code lost:
        r3 = new java.lang.StringBuilder("Not supported key:");
        r3.append(r1);
        com.p280ss.android.ttvecamera.C20652m.m68436c("TECameraServer", r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void queryFeatures(java.lang.String r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.mStateLock
            monitor-enter(r0)
            com.ss.android.ttvecamera.f r1 = r5.mCameraInstance     // Catch:{ all -> 0x00c3 }
            if (r1 == 0) goto L_0x00ba
            com.ss.android.ttvecamera.f r1 = r5.mCameraInstance     // Catch:{ all -> 0x00c3 }
            android.os.Bundle r6 = r1.mo55736a(r6)     // Catch:{ all -> 0x00c3 }
            if (r6 != 0) goto L_0x0018
            java.lang.String r6 = "TECameraServer"
            java.lang.String r7 = "queryFeatures: getFeatures is null"
            com.p280ss.android.ttvecamera.C20652m.m68437d(r6, r7)     // Catch:{ all -> 0x00c3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
            return
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0021:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00b9
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r6.containsKey(r1)
            if (r2 == 0) goto L_0x0021
            java.lang.Class r2 = com.p280ss.android.ttvecamera.C20632i.C20635c.m68398a(r1)
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            if (r2 != r3) goto L_0x0043
            boolean r2 = r6.getBoolean(r1)
            r7.putBoolean(r1, r2)
            goto L_0x0021
        L_0x0043:
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            if (r2 != r3) goto L_0x004f
            int r2 = r6.getInt(r1)
            r7.putInt(r1, r2)
            goto L_0x0021
        L_0x004f:
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            if (r2 != r3) goto L_0x005b
            long r2 = r6.getLong(r1)
            r7.putLong(r1, r2)
            goto L_0x0021
        L_0x005b:
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            if (r2 != r3) goto L_0x0067
            float r2 = r6.getFloat(r1)
            r7.putFloat(r1, r2)
            goto L_0x0021
        L_0x0067:
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
            if (r2 != r3) goto L_0x0073
            double r2 = r6.getDouble(r1)
            r7.putDouble(r1, r2)
            goto L_0x0021
        L_0x0073:
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r2 != r3) goto L_0x007f
            java.lang.String r2 = r6.getString(r1)
            r7.putString(r1, r2)
            goto L_0x0021
        L_0x007f:
            java.lang.Class<java.util.ArrayList> r3 = java.util.ArrayList.class
            if (r2 != r3) goto L_0x008b
            java.util.ArrayList r2 = r6.getParcelableArrayList(r1)
            r7.putParcelableArrayList(r1, r2)
            goto L_0x0021
        L_0x008b:
            java.lang.Class<com.ss.android.ttvecamera.TEFrameSizei> r3 = com.p280ss.android.ttvecamera.TEFrameSizei.class
            if (r2 != r3) goto L_0x0097
            android.os.Parcelable r2 = r6.getParcelable(r1)
            r7.putParcelable(r1, r2)
            goto L_0x0021
        L_0x0097:
            java.lang.Class<com.ss.android.ttvecamera.TEFocusParameters> r3 = com.p280ss.android.ttvecamera.TEFocusParameters.class
            if (r2 != r3) goto L_0x00a4
            android.os.Parcelable r2 = r6.getParcelable(r1)
            r7.putParcelable(r1, r2)
            goto L_0x0021
        L_0x00a4:
            java.lang.String r2 = "TECameraServer"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Not supported key:"
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.p280ss.android.ttvecamera.C20652m.m68436c(r2, r1)
            goto L_0x0021
        L_0x00b9:
            return
        L_0x00ba:
            java.lang.String r6 = "TECameraServer"
            java.lang.String r7 = "queryFeatures: camera instance null"
            com.p280ss.android.ttvecamera.C20652m.m68437d(r6, r7)     // Catch:{ all -> 0x00c3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
            return
        L_0x00c3:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ttvecamera.TECameraServer.queryFeatures(java.lang.String, android.os.Bundle):void");
    }

    public final int switchCamera(final C20621g gVar, final int i) {
        StringBuilder sb = new StringBuilder("switchCamera: ");
        sb.append(i);
        C20652m.m68434a("TECameraServer", sb.toString());
        if (!assertClient(gVar)) {
            return -108;
        }
        if (this.mCameraSettings.f55726e == i) {
            return -423;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public final void run() {
                    TECameraServer.this.switchCamera(gVar, i);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 1) {
                    this.mCameraObserver.onError(-105, "Camera is opening, ignore this switch request.");
                    return -105;
                }
                this.mCameraSettings.f55726e = i;
                this.mCurrentZoom = 0.0f;
                if (this.mCameraInstance == null) {
                    this.mCameraInstance = createCameraInstance();
                }
                if (this.mCurrentCameraState != 0) {
                    this.mCameraInstance.mo55686e();
                    this.mCurrentCameraState = 0;
                }
                this.mCurrentCameraState = 1;
                if (this.mRetryCnt < 0) {
                    this.mRetryCnt = this.mCameraSettings.f55735n;
                }
                this.mBeginTime = System.currentTimeMillis();
                int a = this.mCameraInstance.mo55665a(this.mCameraSettings);
                if (a != 0) {
                    C20622a aVar = this.mCameraObserver;
                    StringBuilder sb2 = new StringBuilder("Switch camera failed @");
                    sb2.append(this.mCameraSettings.f55724c);
                    sb2.append(",face:");
                    sb2.append(this.mCameraSettings.f55726e);
                    sb2.append(" ");
                    sb2.append(this.mCameraSettings.f55731j.toString());
                    aVar.onError(a, sb2.toString());
                }
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c7, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c9, code lost:
        close();
        open(r6, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int switchCamera(final com.p280ss.android.ttvecamera.C20621g r6, final com.p280ss.android.ttvecamera.C20632i r7) {
        /*
            r5 = this;
            java.lang.String r0 = "TECameraServer"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "switchCamera: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.p280ss.android.ttvecamera.C20652m.m68434a(r0, r1)
            boolean r0 = r5.assertClient(r6)
            if (r0 != 0) goto L_0x001c
            r6 = -108(0xffffffffffffff94, float:NaN)
            return r6
        L_0x001c:
            boolean r0 = r5.shouldReOpenCamera(r7)
            if (r0 != 0) goto L_0x0025
            r6 = -423(0xfffffffffffffe59, float:NaN)
            return r6
        L_0x0025:
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r1 = r5.mHandler
            android.os.Looper r1 = r1.getLooper()
            r2 = 0
            if (r0 == r1) goto L_0x003e
            android.os.Handler r0 = r5.mHandler
            com.ss.android.ttvecamera.TECameraServer$34 r1 = new com.ss.android.ttvecamera.TECameraServer$34
            r1.<init>(r6, r7)
            r0.post(r1)
            goto L_0x00cf
        L_0x003e:
            java.lang.Object r0 = r5.mStateLock
            monitor-enter(r0)
            int r1 = r5.mCurrentCameraState     // Catch:{ all -> 0x00d0 }
            r3 = 1
            if (r1 != r3) goto L_0x0051
            com.ss.android.ttvecamera.g$a r6 = r5.mCameraObserver     // Catch:{ all -> 0x00d0 }
            java.lang.String r7 = "Camera is opening, ignore this switch request."
            r1 = -105(0xffffffffffffff97, float:NaN)
            r6.onError(r1, r7)     // Catch:{ all -> 0x00d0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d0 }
            return r1
        L_0x0051:
            com.ss.android.ttvecamera.i r1 = r5.mCameraSettings     // Catch:{ all -> 0x00d0 }
            int r1 = r1.f55724c     // Catch:{ all -> 0x00d0 }
            int r4 = r7.f55724c     // Catch:{ all -> 0x00d0 }
            if (r1 != r4) goto L_0x00c8
            com.ss.android.ttvecamera.f r6 = r5.mCameraInstance     // Catch:{ all -> 0x00d0 }
            if (r6 != 0) goto L_0x006a
            com.ss.android.ttvecamera.f r6 = r5.createCameraInstance()     // Catch:{ all -> 0x00d0 }
            r5.mCameraInstance = r6     // Catch:{ all -> 0x00d0 }
            com.ss.android.ttvecamera.f r6 = r5.mCameraInstance     // Catch:{ all -> 0x00d0 }
            com.ss.android.ttvecamera.f$c r1 = r5.satZoomCallback     // Catch:{ all -> 0x00d0 }
            r6.mo55737a(r1)     // Catch:{ all -> 0x00d0 }
        L_0x006a:
            int r6 = r5.mCurrentCameraState     // Catch:{ all -> 0x00d0 }
            if (r6 == 0) goto L_0x0075
            com.ss.android.ttvecamera.f r6 = r5.mCameraInstance     // Catch:{ all -> 0x00d0 }
            r6.mo55686e()     // Catch:{ all -> 0x00d0 }
            r5.mCurrentCameraState = r2     // Catch:{ all -> 0x00d0 }
        L_0x0075:
            r5.mCameraSettings = r7     // Catch:{ all -> 0x00d0 }
            r5.mCurrentCameraState = r3     // Catch:{ all -> 0x00d0 }
            int r6 = r5.mRetryCnt     // Catch:{ all -> 0x00d0 }
            if (r6 >= 0) goto L_0x0083
            com.ss.android.ttvecamera.i r6 = r5.mCameraSettings     // Catch:{ all -> 0x00d0 }
            int r6 = r6.f55735n     // Catch:{ all -> 0x00d0 }
            r5.mRetryCnt = r6     // Catch:{ all -> 0x00d0 }
        L_0x0083:
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d0 }
            r5.mBeginTime = r6     // Catch:{ all -> 0x00d0 }
            com.ss.android.ttvecamera.f r6 = r5.mCameraInstance     // Catch:{ all -> 0x00d0 }
            com.ss.android.ttvecamera.i r7 = r5.mCameraSettings     // Catch:{ all -> 0x00d0 }
            int r6 = r6.mo55665a(r7)     // Catch:{ all -> 0x00d0 }
            if (r6 == 0) goto L_0x00c6
            com.ss.android.ttvecamera.g$a r7 = r5.mCameraObserver     // Catch:{ all -> 0x00d0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
            java.lang.String r3 = "Switch camera failed @"
            r1.<init>(r3)     // Catch:{ all -> 0x00d0 }
            com.ss.android.ttvecamera.i r3 = r5.mCameraSettings     // Catch:{ all -> 0x00d0 }
            int r3 = r3.f55724c     // Catch:{ all -> 0x00d0 }
            r1.append(r3)     // Catch:{ all -> 0x00d0 }
            java.lang.String r3 = ",face:"
            r1.append(r3)     // Catch:{ all -> 0x00d0 }
            com.ss.android.ttvecamera.i r3 = r5.mCameraSettings     // Catch:{ all -> 0x00d0 }
            int r3 = r3.f55726e     // Catch:{ all -> 0x00d0 }
            r1.append(r3)     // Catch:{ all -> 0x00d0 }
            java.lang.String r3 = " "
            r1.append(r3)     // Catch:{ all -> 0x00d0 }
            com.ss.android.ttvecamera.i r3 = r5.mCameraSettings     // Catch:{ all -> 0x00d0 }
            com.ss.android.ttvecamera.TEFrameSizei r3 = r3.f55731j     // Catch:{ all -> 0x00d0 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00d0 }
            r1.append(r3)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00d0 }
            r7.onError(r6, r1)     // Catch:{ all -> 0x00d0 }
        L_0x00c6:
            monitor-exit(r0)     // Catch:{ all -> 0x00d0 }
            return r2
        L_0x00c8:
            monitor-exit(r0)     // Catch:{ all -> 0x00d0 }
            r5.close()
            r5.open(r6, r7)
        L_0x00cf:
            return r2
        L_0x00d0:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d0 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ttvecamera.TECameraServer.switchCamera(com.ss.android.ttvecamera.g, com.ss.android.ttvecamera.i):int");
    }

    public final int takePicture(final C20621g gVar, final C20638f fVar) {
        if (!assertClient(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public final void run() {
                    TECameraServer.this.takePicture(gVar, fVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState != 3) {
                    C20622a aVar = this.mCameraObserver;
                    StringBuilder sb = new StringBuilder("Can not takePicture on state : ");
                    sb.append(this.mCurrentCameraState);
                    aVar.onError(-105, sb.toString());
                    return -105;
                }
                this.mCurrentCameraState = 2;
                this.mCameraInstance.mo55674a(fVar);
            }
        }
        return 0;
    }

    public final TEFrameSizei getBestPreviewSize(C20621g gVar, float f, TEFrameSizei tEFrameSizei) {
        if (!assertClient(gVar) || this.mCurrentCameraState == 0 || this.mCurrentCameraState == 1) {
            return null;
        }
        return this.mCameraInstance.mo55666a(f, tEFrameSizei);
    }

    public final void setWhileBalance(final C20621g gVar, final boolean z, final String str) {
        if (assertClient(gVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new Runnable() {
                    public final void run() {
                        TECameraServer.this.setWhileBalance(gVar, z, str);
                    }
                });
                return;
            }
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo55679a(z, str);
                }
            }
        }
    }

    public final int startZoom(final C20621g gVar, final float f, final C20641i iVar) {
        if (!assertClient(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C20604f fVar = this.mCameraInstance;
            if (fVar == null) {
                C20652m.m68436c("TECameraServer", "camera is null, no need to start zoom");
                return -105;
            }
            float abs = Math.abs(f - this.mCurrentZoom);
            if (Math.abs(f - fVar.f55658r) < 0.1f) {
                f = fVar.f55658r;
            } else if (Math.abs(f) < 0.1f) {
                f = 0.0f;
            } else if (abs < 0.1f) {
                return 0;
            }
            this.mCurrentZoom = f;
            this.mHandler.post(new Runnable() {
                public final void run() {
                    TECameraServer.this.startZoom(gVar, f, iVar);
                }
            });
        } else {
            C20652m.m68435b("TECameraServer", "startZoom...");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.mo55669a(f, iVar);
                }
            }
        }
        return 0;
    }

    public final int takePicture(final C20621g gVar, final int i, final C20638f fVar) {
        if (!assertClient(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new Runnable() {
                public final void run() {
                    TECameraServer.this.takePicture(gVar, i, fVar);
                }
            });
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState != 3) {
                    C20622a aVar = this.mCameraObserver;
                    StringBuilder sb = new StringBuilder("Can not takePicture on state : ");
                    sb.append(this.mCurrentCameraState);
                    aVar.onError(-105, sb.toString());
                    return -105;
                }
                this.mCurrentCameraState = 2;
                this.mCameraInstance.mo55673a(i, fVar);
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        increaseClientCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r1 == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        com.p280ss.android.ttvecamera.C20652m.m68434a("TECameraServer", "reopen camera.");
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        return open(r5, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int connect(com.p280ss.android.ttvecamera.C20621g r5, com.p280ss.android.ttvecamera.C20621g.C20622a r6, com.p280ss.android.ttvecamera.C20632i r7, com.p280ss.android.ttvecamera.C20621g.C20624c r8) {
        /*
            r4 = this;
            java.lang.String r0 = "TECameraServer"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "connect with client: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.p280ss.android.ttvecamera.C20652m.m68434a(r0, r1)
            if (r5 == 0) goto L_0x0067
            if (r6 == 0) goto L_0x005f
            if (r7 == 0) goto L_0x0057
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            boolean r1 = r4.shouldReOpenCamera(r7)     // Catch:{ all -> 0x0054 }
            com.ss.android.ttvecamera.g r2 = r4.mCameraClient     // Catch:{ all -> 0x0054 }
            r3 = 0
            if (r5 != r2) goto L_0x0030
            if (r1 != 0) goto L_0x0030
            java.lang.String r5 = "TECameraServer"
            java.lang.String r6 = "No need reconnect."
            com.p280ss.android.ttvecamera.C20652m.m68436c(r5, r6)     // Catch:{ all -> 0x0054 }
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            return r3
        L_0x0030:
            boolean r2 = r4.mIsInitialized     // Catch:{ all -> 0x0054 }
            if (r2 != 0) goto L_0x0039
            r1 = 1
            r4.init(r1)     // Catch:{ all -> 0x0054 }
            r1 = 0
        L_0x0039:
            r4.mCameraClient = r5     // Catch:{ all -> 0x0054 }
            r4.mCameraObserver = r6     // Catch:{ all -> 0x0054 }
            r4.mPictureSizeCallback = r8     // Catch:{ all -> 0x0054 }
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            r4.increaseClientCount()
            if (r1 == 0) goto L_0x004f
            java.lang.String r6 = "TECameraServer"
            java.lang.String r8 = "reopen camera."
            com.p280ss.android.ttvecamera.C20652m.m68434a(r6, r8)
            r4.close()
        L_0x004f:
            int r5 = r4.open(r5, r7)
            return r5
        L_0x0054:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            throw r5
        L_0x0057:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "mParams must not be null"
            r5.<init>(r6)
            throw r5
        L_0x005f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "observer must not be null"
            r5.<init>(r6)
            throw r5
        L_0x0067:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "client must not be null"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ttvecamera.TECameraServer.connect(com.ss.android.ttvecamera.g, com.ss.android.ttvecamera.g$a, com.ss.android.ttvecamera.i, com.ss.android.ttvecamera.g$c):int");
    }

    public final int takePicture(C20621g gVar, int i, int i2, C20638f fVar) {
        if (!assertClient(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            Handler handler = this.mHandler;
            final C20621g gVar2 = gVar;
            final int i3 = i;
            final int i4 = i2;
            final C20638f fVar2 = fVar;
            C205404 r1 = new Runnable() {
                public final void run() {
                    TECameraServer.this.takePicture(gVar2, i3, i4, fVar2);
                }
            };
            handler.post(r1);
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState != 3) {
                    C20622a aVar = this.mCameraObserver;
                    StringBuilder sb = new StringBuilder("Can not takePicture on state : ");
                    sb.append(this.mCurrentCameraState);
                    aVar.onError(-105, sb.toString());
                    return -105;
                }
                this.mCurrentCameraState = 2;
                this.mCameraInstance.mo55672a(i, i2, fVar);
            }
        }
        return 0;
    }

    public final int focusAtPoint(C20621g gVar, int i, int i2, float f, int i3, int i4) {
        if (!assertClient(gVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            Handler handler = this.mHandler;
            final C20621g gVar2 = gVar;
            final int i5 = i;
            final int i6 = i2;
            final float f2 = f;
            final int i7 = i3;
            final int i8 = i4;
            C205448 r1 = new Runnable() {
                public final void run() {
                    TECameraServer.this.focusAtPoint(gVar2, i5, i6, f2, i7, i8);
                }
            };
            handler.post(r1);
        } else {
            StringBuilder sb = new StringBuilder("focusAtPoint: [");
            sb.append(i3);
            sb.append(", ");
            sb.append(i4);
            sb.append("]");
            C20652m.m68435b("TECameraServer", sb.toString());
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    this.mCameraInstance.mo55671a(i, i2, f, i3, i4);
                } else {
                    C20622a aVar = this.mCameraObserver;
                    StringBuilder sb2 = new StringBuilder("Can not set focus on state : ");
                    sb2.append(this.mCurrentCameraState);
                    aVar.onError(-105, sb2.toString());
                    return -105;
                }
            }
        }
        return 0;
    }
}
