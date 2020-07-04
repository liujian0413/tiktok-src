package com.p280ss.android.medialib.p884qr;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceHolder;
import com.bef.effectsdk.message.MessageCenter;
import com.bef.effectsdk.message.MessageCenter.C1944a;
import com.p280ss.android.medialib.camera.C19662d;
import com.p280ss.android.medialib.camera.C19663e;
import com.p280ss.android.medialib.camera.C19667g;
import com.p280ss.android.medialib.common.C19702a.C19703a;
import com.p280ss.android.medialib.model.EnigmaResult;
import com.p280ss.android.medialib.p880b.C19622b;
import com.p280ss.android.medialib.p884qr.PicScanner.C19788a;
import com.p280ss.android.medialib.presenter.C19763c;
import com.p280ss.android.medialib.presenter.C19764d;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;

/* renamed from: com.ss.android.medialib.qr.EnigmaScanner */
public class EnigmaScanner implements C1944a {
    public C19787a listener;
    private long mCameraScanRequirement = 0;
    private float mCurCameraZoom = 1.0f;
    public boolean mFailed;
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private long mLastZoomTime = 0;
    public PicScanner mPicScanner;
    public C19764d mPresenter;
    private Runnable mRunnable;
    public ScanMode mScanMode = ScanMode.CAMERA;
    public volatile boolean mStopped = false;

    /* renamed from: com.ss.android.medialib.qr.EnigmaScanner$ScanMode */
    public enum ScanMode {
        CAMERA,
        PICTURE
    }

    /* renamed from: com.ss.android.medialib.qr.EnigmaScanner$a */
    public interface C19787a {
        /* renamed from: a */
        void mo53089a(int i, int i2);

        /* renamed from: a */
        void mo53090a(EnigmaResult enigmaResult);
    }

    static {
        TENativeLibsLoader.m67988e();
    }

    public ScanMode getScanMode() {
        return this.mScanMode;
    }

    public void release() {
        MessageCenter.removeListener(this);
    }

    public void stop() {
        this.mStopped = true;
        stopCameraScan();
        stopPicScan();
    }

    public EnigmaScanner() {
        MessageCenter.addListener(this);
    }

    public void setScanMode() {
        if (this.mPicScanner != null) {
            this.mScanMode = ScanMode.PICTURE;
            if (this.mPresenter != null) {
                this.mPresenter.mo52953a(false, this.mCameraScanRequirement);
            }
        } else {
            this.mScanMode = ScanMode.CAMERA;
            if (this.mPresenter != null) {
                this.mPresenter.mo52953a(true, this.mCameraScanRequirement);
            }
        }
    }

    public synchronized void stopCameraScan() {
        this.mStopped = true;
        if (this.mPresenter != null) {
            C19667g.m64797b().mo52340m();
            this.mPresenter.mo53043l(false);
            this.mPresenter.mo53045m();
            this.mPresenter.mo52881a((C19703a) null);
            this.mPresenter = null;
        }
        setScanMode();
    }

    public synchronized void stopPicScan() {
        this.mStopped = true;
        if (this.mRunnable != null) {
            this.mHandler.removeCallbacks(this.mRunnable);
        }
        if (this.mPicScanner != null) {
            this.mPicScanner.stop();
            this.mPicScanner.release();
            this.mPicScanner = null;
        }
        setScanMode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0082, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0084, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void onResult() {
        /*
            r7 = this;
            monitor-enter(r7)
            com.ss.android.medialib.qr.EnigmaScanner$ScanMode r0 = r7.mScanMode     // Catch:{ all -> 0x0085 }
            com.ss.android.medialib.qr.EnigmaScanner$ScanMode r1 = com.p280ss.android.medialib.p884qr.EnigmaScanner.ScanMode.PICTURE     // Catch:{ all -> 0x0085 }
            if (r0 != r1) goto L_0x0016
            com.ss.android.medialib.qr.PicScanner r0 = r7.mPicScanner     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0016
            boolean r0 = r7.mFailed     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x0016
            com.ss.android.medialib.qr.PicScanner r0 = r7.mPicScanner     // Catch:{ all -> 0x0085 }
            com.ss.android.medialib.model.EnigmaResult r0 = r0.getEnigmaResult()     // Catch:{ all -> 0x0085 }
            goto L_0x0026
        L_0x0016:
            com.ss.android.medialib.qr.EnigmaScanner$ScanMode r0 = r7.mScanMode     // Catch:{ all -> 0x0085 }
            com.ss.android.medialib.qr.EnigmaScanner$ScanMode r1 = com.p280ss.android.medialib.p884qr.EnigmaScanner.ScanMode.CAMERA     // Catch:{ all -> 0x0085 }
            if (r0 != r1) goto L_0x0083
            com.ss.android.medialib.presenter.d r0 = r7.mPresenter     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0083
            com.ss.android.medialib.presenter.d r0 = r7.mPresenter     // Catch:{ all -> 0x0085 }
            com.ss.android.medialib.model.EnigmaResult r0 = r0.mo53060t()     // Catch:{ all -> 0x0085 }
        L_0x0026:
            if (r0 == 0) goto L_0x0081
            com.ss.android.medialib.model.Enigma[] r1 = r0.getResult()     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x003d
            android.os.Handler r1 = r7.mHandler     // Catch:{ all -> 0x0085 }
            com.ss.android.medialib.qr.EnigmaScanner$4 r2 = new com.ss.android.medialib.qr.EnigmaScanner$4     // Catch:{ all -> 0x0085 }
            r2.<init>(r0)     // Catch:{ all -> 0x0085 }
            r1.post(r2)     // Catch:{ all -> 0x0085 }
            r0 = 1
            r7.mStopped = r0     // Catch:{ all -> 0x0085 }
            monitor-exit(r7)
            return
        L_0x003d:
            com.ss.android.medialib.qr.EnigmaScanner$ScanMode r1 = r7.mScanMode     // Catch:{ all -> 0x0085 }
            com.ss.android.medialib.qr.EnigmaScanner$ScanMode r2 = com.p280ss.android.medialib.p884qr.EnigmaScanner.ScanMode.CAMERA     // Catch:{ all -> 0x0085 }
            if (r1 != r2) goto L_0x0081
            com.ss.android.medialib.camera.g r1 = com.p280ss.android.medialib.camera.C19667g.m64797b()     // Catch:{ all -> 0x0085 }
            if (r1 != 0) goto L_0x004b
            monitor-exit(r7)
            return
        L_0x004b:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0085 }
            long r4 = r7.mLastZoomTime     // Catch:{ all -> 0x0085 }
            r6 = 0
            long r2 = r2 - r4
            r4 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0081
            float r2 = r7.mCurCameraZoom     // Catch:{ all -> 0x0085 }
            float r0 = r0.zoomFactor     // Catch:{ all -> 0x0085 }
            float r2 = r2 * r0
            r0 = 1084227584(0x40a00000, float:5.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x006a
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0070
        L_0x006a:
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r0 = r2
        L_0x0070:
            float r2 = r7.mCurCameraZoom     // Catch:{ all -> 0x0085 }
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0081
            r1.mo52310a(r0)     // Catch:{ all -> 0x0085 }
            r7.mCurCameraZoom = r0     // Catch:{ all -> 0x0085 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0085 }
            r7.mLastZoomTime = r0     // Catch:{ all -> 0x0085 }
        L_0x0081:
            monitor-exit(r7)
            return
        L_0x0083:
            monitor-exit(r7)
            return
        L_0x0085:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.p884qr.EnigmaScanner.onResult():void");
    }

    public void setListener(C19787a aVar) {
        this.listener = aVar;
    }

    public void enableCameraScan(boolean z) {
        enableCameraScanWithRequirement(z, this.mCameraScanRequirement);
    }

    public void enableCameraScanWithRequirement(boolean z, long j) {
        this.mCameraScanRequirement = j;
        if (this.mPresenter != null) {
            this.mPresenter.mo52953a(z, j);
            if (z) {
                this.mStopped = false;
            }
        }
    }

    public void startScan(String str, ScanSettings scanSettings, long j) {
        stopPicScan();
        this.mPicScanner = new PicScanner();
        this.mPicScanner.setListener(new C19788a() {
            /* renamed from: a */
            public final void mo53086a(boolean z) {
                if (!z && EnigmaScanner.this.listener != null) {
                    EnigmaScanner.this.listener.mo53089a(-2001, -1);
                }
            }
        });
        setScanMode();
        this.mFailed = false;
        int start = this.mPicScanner.start(str, scanSettings);
        if (start >= 0 || this.listener == null) {
            this.mRunnable = new Runnable() {

                /* renamed from: a */
                final PicScanner f53706a = EnigmaScanner.this.mPicScanner;

                /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
                    return;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r4 = this;
                        com.ss.android.medialib.qr.EnigmaScanner r0 = com.p280ss.android.medialib.p884qr.EnigmaScanner.this
                        monitor-enter(r0)
                        com.ss.android.medialib.qr.PicScanner r1 = r4.f53706a     // Catch:{ all -> 0x0041 }
                        if (r1 == 0) goto L_0x003f
                        com.ss.android.medialib.qr.PicScanner r1 = r4.f53706a     // Catch:{ all -> 0x0041 }
                        boolean r1 = r1.isValid()     // Catch:{ all -> 0x0041 }
                        if (r1 == 0) goto L_0x003f
                        com.ss.android.medialib.qr.PicScanner r1 = r4.f53706a     // Catch:{ all -> 0x0041 }
                        com.ss.android.medialib.qr.EnigmaScanner r2 = com.p280ss.android.medialib.p884qr.EnigmaScanner.this     // Catch:{ all -> 0x0041 }
                        com.ss.android.medialib.qr.PicScanner r2 = r2.mPicScanner     // Catch:{ all -> 0x0041 }
                        if (r1 == r2) goto L_0x0018
                        goto L_0x003f
                    L_0x0018:
                        com.ss.android.medialib.qr.EnigmaScanner r1 = com.p280ss.android.medialib.p884qr.EnigmaScanner.this     // Catch:{ all -> 0x0041 }
                        com.ss.android.medialib.qr.EnigmaScanner$ScanMode r1 = r1.mScanMode     // Catch:{ all -> 0x0041 }
                        com.ss.android.medialib.qr.EnigmaScanner$ScanMode r2 = com.p280ss.android.medialib.p884qr.EnigmaScanner.ScanMode.PICTURE     // Catch:{ all -> 0x0041 }
                        if (r1 != r2) goto L_0x003d
                        com.ss.android.medialib.qr.PicScanner r1 = r4.f53706a     // Catch:{ all -> 0x0041 }
                        boolean r1 = r1.isSuccess()     // Catch:{ all -> 0x0041 }
                        if (r1 != 0) goto L_0x003d
                        com.ss.android.medialib.qr.EnigmaScanner r1 = com.p280ss.android.medialib.p884qr.EnigmaScanner.this     // Catch:{ all -> 0x0041 }
                        com.ss.android.medialib.qr.EnigmaScanner$a r1 = r1.listener     // Catch:{ all -> 0x0041 }
                        if (r1 == 0) goto L_0x003d
                        com.ss.android.medialib.qr.EnigmaScanner r1 = com.p280ss.android.medialib.p884qr.EnigmaScanner.this     // Catch:{ all -> 0x0041 }
                        com.ss.android.medialib.qr.EnigmaScanner$a r1 = r1.listener     // Catch:{ all -> 0x0041 }
                        r2 = -2002(0xfffffffffffff82e, float:NaN)
                        r3 = -1
                        r1.mo53089a(r2, r3)     // Catch:{ all -> 0x0041 }
                        com.ss.android.medialib.qr.EnigmaScanner r1 = com.p280ss.android.medialib.p884qr.EnigmaScanner.this     // Catch:{ all -> 0x0041 }
                        r2 = 1
                        r1.mFailed = r2     // Catch:{ all -> 0x0041 }
                    L_0x003d:
                        monitor-exit(r0)     // Catch:{ all -> 0x0041 }
                        return
                    L_0x003f:
                        monitor-exit(r0)     // Catch:{ all -> 0x0041 }
                        return
                    L_0x0041:
                        r1 = move-exception
                        monitor-exit(r0)     // Catch:{ all -> 0x0041 }
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.p884qr.EnigmaScanner.C197853.run():void");
                }
            };
            this.mHandler.postDelayed(this.mRunnable, j);
            this.mStopped = false;
            return;
        }
        this.listener.mo53089a(-2000, start);
    }

    public void onMessageReceived(int i, int i2, int i3, String str) {
        if (i != 24) {
            return;
        }
        if (!this.mStopped || this.mScanMode == ScanMode.PICTURE) {
            onResult();
        }
    }

    public void startScan(final Context context, C19663e eVar, final SurfaceHolder surfaceHolder, ScanSettings scanSettings) {
        stopCameraScan();
        this.mPresenter = new C19764d();
        this.mCameraScanRequirement = scanSettings.detectRequirement;
        final C19667g b = C19667g.m64797b();
        if (b.f53285i) {
            b.mo52333f();
        }
        b.mo52317a(eVar);
        if (b.f53285i) {
            b.mo52318a((C19763c) this.mPresenter);
            int a = this.mPresenter.mo52898a(scanSettings);
            if (a >= 0 || this.listener == null) {
                b.mo52323a((C19662d) new C19662d() {
                    /* renamed from: a */
                    public final void mo52271a(int i) {
                        b.mo52312a(context);
                        EnigmaScanner.this.setScanMode();
                        EnigmaScanner.this.mPresenter.mo52937a((C19622b) new C19622b() {
                            /* renamed from: a */
                            public final void mo52205a(int i, int i2) {
                            }

                            /* renamed from: a */
                            public final void mo52204a(int i) {
                                if (EnigmaScanner.this.listener != null) {
                                    if (i == 0) {
                                        EnigmaScanner.this.mPresenter.mo52924a(((float) b.mo52328c()) / ((float) b.mo52330d()), b.mo52328c(), b.mo52330d());
                                        return;
                                    }
                                    EnigmaScanner.this.listener.mo53089a(-2001, i);
                                }
                            }
                        });
                        EnigmaScanner.this.mPresenter.mo52894a(surfaceHolder.getSurface(), Build.DEVICE);
                        EnigmaScanner.this.mStopped = false;
                    }

                    /* renamed from: a */
                    public final void mo52272a(int i, int i2, String str) {
                        if (EnigmaScanner.this.listener != null) {
                            EnigmaScanner.this.listener.mo53089a(-1000, i);
                        }
                    }
                });
            } else {
                this.listener.mo53089a(-2000, a);
            }
        }
    }
}
