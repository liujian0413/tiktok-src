package com.p280ss.android.ugc.aweme.qrcode.p1497c;

import android.content.Context;
import android.view.SurfaceHolder;
import com.p280ss.android.medialib.camera.C19663e;
import com.p280ss.android.medialib.camera.C19667g;
import com.p280ss.android.medialib.model.EnigmaResult;
import com.p280ss.android.medialib.p884qr.EnigmaScanner;
import com.p280ss.android.medialib.p884qr.EnigmaScanner.C19787a;
import com.p280ss.android.medialib.p884qr.ScanSettings;
import com.p280ss.android.ugc.aweme.qrcode.p1497c.C37058b.C37059a;

/* renamed from: com.ss.android.ugc.aweme.qrcode.c.a */
public final class C37056a implements C37058b {

    /* renamed from: a */
    public C37059a f97012a;

    /* renamed from: b */
    private EnigmaScanner f97013b;

    /* renamed from: c */
    private C19667g f97014c = C19667g.m64797b();

    /* renamed from: c */
    public final void mo93517c() {
        this.f97013b.stopPicScan();
    }

    public C37056a() {
        m119145f();
    }

    /* renamed from: a */
    public final void mo93510a() {
        if (this.f97014c != null) {
            this.f97014c.mo52319a(true);
        }
    }

    /* renamed from: b */
    public final void mo93516b() {
        if (this.f97014c != null) {
            this.f97014c.mo52319a(false);
        }
    }

    /* renamed from: d */
    public final void mo93518d() {
        m119145f();
        this.f97013b.stop();
    }

    /* renamed from: e */
    public final void mo93519e() {
        m119145f();
        this.f97013b.release();
        this.f97013b = null;
    }

    /* renamed from: f */
    private void m119145f() {
        if (this.f97013b == null) {
            this.f97013b = new EnigmaScanner();
        }
        this.f97013b.setListener(new C19787a() {
            /* renamed from: a */
            public final void mo53090a(EnigmaResult enigmaResult) {
                if (C37056a.this.f97012a != null) {
                    C37056a.this.f97012a.mo93521a(enigmaResult);
                }
            }

            /* renamed from: a */
            public final void mo53089a(int i, int i2) {
                if (C37056a.this.f97012a != null) {
                    C37056a.this.f97012a.mo93520a(i);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo93513a(C37059a aVar) {
        m119145f();
        this.f97012a = aVar;
    }

    /* renamed from: a */
    public final void mo93511a(float f) {
        if (this.f97014c != null) {
            this.f97014c.mo52310a(f);
        }
    }

    /* renamed from: a */
    public final void mo93515a(boolean z, long j) {
        m119145f();
        this.f97013b.enableCameraScanWithRequirement(true, j);
    }

    /* renamed from: a */
    public final void mo93514a(String str, ScanSettings scanSettings, long j) {
        m119145f();
        this.f97013b.startScan(str, scanSettings, 1000);
    }

    /* renamed from: a */
    public final void mo93512a(Context context, C19663e eVar, SurfaceHolder surfaceHolder, ScanSettings scanSettings) {
        m119145f();
        this.f97013b.startScan(context, eVar, surfaceHolder, scanSettings);
    }
}
