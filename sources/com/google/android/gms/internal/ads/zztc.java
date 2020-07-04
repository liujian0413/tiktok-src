package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

public final class zztc extends Surface {

    /* renamed from: a */
    private static boolean f45761a;

    /* renamed from: b */
    private static boolean f45762b;

    /* renamed from: c */
    private final boolean f45763c;

    /* renamed from: d */
    private final bsm f45764d;

    /* renamed from: e */
    private boolean f45765e;

    /* renamed from: a */
    public static synchronized boolean m53209a(Context context) {
        boolean z;
        synchronized (zztc.class) {
            if (!f45762b) {
                if (bsf.f43399a >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (!(bsf.f43399a == 24 && (bsf.f43402d.startsWith("SM-G950") || bsf.f43402d.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) {
                            z2 = true;
                        }
                    }
                    f45761a = z2;
                }
                f45762b = true;
            }
            z = f45761a;
        }
        return z;
    }

    /* renamed from: a */
    public static zztc m53208a(Context context, boolean z) {
        if (bsf.f43399a >= 17) {
            brr.m49873b(!z || m53209a(context));
            return new bsm().mo41249a(z);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    private zztc(bsm bsm, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f45764d = bsm;
        this.f45763c = z;
    }

    public final void release() {
        super.release();
        synchronized (this.f45764d) {
            if (!this.f45765e) {
                this.f45764d.mo41250a();
                this.f45765e = true;
            }
        }
    }
}
