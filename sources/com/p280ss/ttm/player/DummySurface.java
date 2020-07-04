package com.p280ss.ttm.player;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;

/* renamed from: com.ss.ttm.player.DummySurface */
public final class DummySurface extends Surface {
    private static int secureMode;
    private static boolean secureModeInitialized;
    public final boolean secure;
    private final DummySurfaceThread thread;
    private boolean threadReleased;

    /* renamed from: com.ss.ttm.player.DummySurface$DummySurfaceThread */
    static class DummySurfaceThread extends HandlerThread implements Callback {
        private EGLSurfaceTexture eglSurfaceTexture;
        private Handler handler;
        private Error initError;
        private RuntimeException initException;
        private DummySurface surface;

        public DummySurfaceThread() {
            super("dummySurface");
        }

        private void releaseInternal() {
            if (this.eglSurfaceTexture != null) {
                this.eglSurfaceTexture.release();
                return;
            }
            throw new NullPointerException();
        }

        public void release() {
            if (this.handler != null) {
                this.handler.sendEmptyMessage(2);
                return;
            }
            throw new NullPointerException();
        }

        private void initInternal(int i) {
            boolean z;
            if (this.eglSurfaceTexture != null) {
                this.eglSurfaceTexture.init(i);
                SurfaceTexture surfaceTexture = this.eglSurfaceTexture.getSurfaceTexture();
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.surface = new DummySurface(this, surfaceTexture, z);
                return;
            }
            throw new NullPointerException();
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    try {
                        initInternal(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e) {
                        this.initException = e;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e2) {
                        try {
                            this.initError = e2;
                            synchronized (this) {
                                notify();
                            }
                        } catch (Throwable th) {
                            synchronized (this) {
                                notify();
                                throw th;
                            }
                        }
                    }
                    return true;
                case 2:
                    try {
                        releaseInternal();
                    } catch (Throwable th2) {
                        quit();
                        throw th2;
                    }
                    quit();
                    return true;
                default:
                    return true;
            }
        }

        public DummySurface init(int i) {
            boolean z;
            start();
            this.handler = new Handler(getLooper(), this);
            this.eglSurfaceTexture = new EGLSurfaceTexture(this.handler);
            synchronized (this) {
                z = false;
                this.handler.obtainMessage(1, i, 0).sendToTarget();
                while (this.surface == null && this.initException == null && this.initError == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            if (this.initException != null) {
                throw this.initException;
            } else if (this.initError != null) {
                throw this.initError;
            } else if (this.surface != null) {
                return this.surface;
            } else {
                throw new NullPointerException();
            }
        }
    }

    private static void assertApiLevel17OrHigher() {
        if (VERSION.SDK_INT < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    public final void release() {
        super.release();
        synchronized (this.thread) {
            if (!this.threadReleased) {
                this.thread.release();
                this.threadReleased = true;
            }
        }
    }

    public static DummySurface newInstanceV17(boolean z) {
        int i;
        assertApiLevel17OrHigher();
        DummySurfaceThread dummySurfaceThread = new DummySurfaceThread();
        if (z) {
            i = secureMode;
        } else {
            i = 0;
        }
        return dummySurfaceThread.init(i);
    }

    private static int getSecureModeV24(Context context) {
        if (VERSION.SDK_INT < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return 0;
        }
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        if (eglQueryString == null || !eglQueryString.contains("EGL_EXT_protected_content")) {
            return 0;
        }
        if (eglQueryString.contains("EGL_KHR_surfaceless_context")) {
            return 1;
        }
        return 2;
    }

    public static synchronized boolean isSecureSupported(Context context) {
        int i;
        synchronized (DummySurface.class) {
            if (!secureModeInitialized) {
                if (VERSION.SDK_INT < 24) {
                    i = 0;
                } else {
                    i = getSecureModeV24(context);
                }
                secureMode = i;
                secureModeInitialized = true;
            }
            if (secureMode != 0) {
                return true;
            }
            return false;
        }
    }

    private DummySurface(DummySurfaceThread dummySurfaceThread, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.thread = dummySurfaceThread;
        this.secure = z;
    }
}
