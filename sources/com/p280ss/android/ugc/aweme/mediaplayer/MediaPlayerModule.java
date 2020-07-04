package com.p280ss.android.ugc.aweme.mediaplayer;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import bolts.C1591g;
import bolts.C1592h;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.mediaplayer.MediaPlayerModule */
public class MediaPlayerModule implements C0042h, SurfaceTextureListener {

    /* renamed from: a */
    public String f86356a;

    /* renamed from: b */
    public C33187a f86357b;

    /* renamed from: c */
    public C0052o<C33195i> f86358c = new C0052o<>();

    /* renamed from: d */
    private boolean f86359d;

    /* renamed from: e */
    private boolean f86360e;

    /* renamed from: f */
    private boolean f86361f;

    /* renamed from: g */
    private C33194h f86362g;

    /* renamed from: h */
    private SurfaceTextureListener f86363h;

    /* renamed from: b */
    public final void mo84926b() {
        m107034g();
    }

    /* renamed from: c */
    public final void mo84927c() {
        m107033f();
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        m107036i();
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_PAUSE)
    public void onPause() {
        m107034g();
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
        m107033f();
    }

    /* renamed from: g */
    private void m107034g() {
        this.f86357b.mo84938a();
        this.f86358c.postValue(C33195i.m107078c(true));
    }

    /* renamed from: h */
    private void m107035h() {
        this.f86357b.mo84947c();
        this.f86358c.postValue(C33195i.m107080e(true));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ Integer mo84928d() throws Exception {
        return Integer.valueOf(m107030a(this.f86356a));
    }

    /* renamed from: f */
    private void m107033f() {
        if (!this.f86359d && !this.f86360e) {
            this.f86357b.mo84944b();
            this.f86358c.postValue(C33195i.m107079d(true));
        }
    }

    /* renamed from: i */
    private void m107036i() {
        this.f86357b.mo84938a();
        this.f86357b.mo84947c();
        this.f86357b.mo84948d();
        this.f86358c.postValue(C33195i.m107081f(true));
    }

    /* renamed from: e */
    private void m107032e() {
        if (this.f86362g.f86375d >= 0 && this.f86362g.f86376e - this.f86362g.f86375d > 0) {
            this.f86357b.mo84940a(this.f86362g.f86375d, this.f86362g.f86376e);
        }
        this.f86357b.mo84941a(this.f86362g.f86374c);
        this.f86357b.mo84945b((double) this.f86362g.f86372a);
        this.f86357b.mo84939a((double) this.f86362g.f86373b);
    }

    /* renamed from: a */
    public final void mo84922a() {
        if (this.f86360e) {
            this.f86359d = true;
            m107034g();
            return;
        }
        this.f86359d = false;
        m107033f();
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f86363h != null) {
            this.f86363h.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    /* renamed from: a */
    private int m107030a(String str) {
        if (this.f86361f) {
            return 0;
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        int a = this.f86357b.mo84937a(str);
        if (a < 0) {
            return a;
        }
        m107032e();
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Integer mo84925b(C1592h hVar) throws Exception {
        boolean z;
        int intValue = ((Integer) hVar.mo6890e()).intValue();
        C0052o<C33195i> oVar = this.f86358c;
        if (intValue >= 0) {
            z = true;
        } else {
            z = false;
        }
        oVar.setValue(C33195i.m107076a(z));
        return Integer.valueOf(intValue);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
        m107035h();
        if (this.f86363h != null) {
            return this.f86363h.onSurfaceTextureDestroyed(surfaceTexture);
        }
        return false;
    }

    /* renamed from: a */
    private void m107031a(SurfaceTexture surfaceTexture) {
        C1592h.m7853a((Callable<TResult>) new C33190d<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C33191e<TResult,TContinuationResult>(this), C1592h.f5958b).mo6875a((C1591g<TResult, TContinuationResult>) new C33192f<TResult,TContinuationResult>(this, surfaceTexture)).mo6876a((C1591g<TResult, TContinuationResult>) new C33193g<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo84921a(C1592h hVar) throws Exception {
        this.f86358c.setValue(C33195i.m107077b(((Boolean) hVar.mo6890e()).booleanValue()));
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo84924a(C33195i iVar) {
        if (iVar != null) {
            switch (iVar.f86378b) {
                case 1:
                    if (iVar.f86377a) {
                        this.f86361f = true;
                        return;
                    }
                    break;
                case 2:
                case 4:
                    this.f86360e = true;
                    return;
                case 3:
                case 5:
                    this.f86360e = false;
                    return;
                case 6:
                    this.f86361f = false;
                    this.f86360e = false;
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo84923a(TextureView textureView, boolean z) {
        this.f86363h = textureView.getSurfaceTextureListener();
        textureView.setSurfaceTextureListener(this);
    }

    public MediaPlayerModule(C33187a aVar, C33194h hVar) {
        this.f86357b = aVar;
        this.f86362g = hVar;
        this.f86358c.observeForever(new C33189c(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Boolean mo84920a(SurfaceTexture surfaceTexture, C1592h hVar) throws Exception {
        if (hVar.mo6889d() || hVar.mo6887c() || ((Integer) hVar.mo6890e()).intValue() < 0) {
            return null;
        }
        Surface surface = new Surface(surfaceTexture);
        boolean a = this.f86357b.mo84942a(surface);
        surface.release();
        return Boolean.valueOf(a);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f86363h != null) {
            this.f86363h.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
        m107031a(surfaceTexture);
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f86363h != null) {
            this.f86363h.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }
}
