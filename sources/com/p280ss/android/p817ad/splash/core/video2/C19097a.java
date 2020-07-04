package com.p280ss.android.p817ad.splash.core.video2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import com.p280ss.android.p817ad.splash.p836g.C19139p;
import com.p280ss.android.p817ad.splash.p836g.C19139p.C19140a;
import com.p280ss.ttvideoengine.C46033aa;
import com.p280ss.ttvideoengine.C46035ac;
import com.p280ss.ttvideoengine.TTVideoEngine;
import com.p280ss.ttvideoengine.p1816i.C46117c;
import com.p280ss.ttvideoengine.p1816i.C46123h;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ad.splash.core.video2.a */
public final class C19097a implements C19103d, C19105f, C19140a, C46033aa, C46035ac {

    /* renamed from: a */
    protected Context f51654a;

    /* renamed from: b */
    protected C19104e f51655b;

    /* renamed from: c */
    protected TTVideoEngine f51656c;

    /* renamed from: d */
    protected C19139p f51657d = new C19139p(this);

    /* renamed from: e */
    private C19099b f51658e;

    /* renamed from: f */
    private boolean f51659f;

    /* renamed from: g */
    private ArrayList<Runnable> f51660g = new ArrayList<>();

    /* renamed from: h */
    private boolean f51661h;

    /* renamed from: i */
    private boolean f51662i = false;

    /* renamed from: a */
    public final void mo50406a(Message message) {
    }

    public final void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
    }

    public final void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    public final void onPrepare(TTVideoEngine tTVideoEngine) {
    }

    public final void onPrepared(TTVideoEngine tTVideoEngine) {
    }

    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
    }

    public final void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    public final void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
    }

    /* renamed from: f */
    private int m62592f() {
        if (this.f51656c != null) {
            return this.f51656c.mDuration;
        }
        return 0;
    }

    /* renamed from: b */
    public final boolean mo50790b() {
        if (this.f51656c == null || this.f51656c.mPlaybackState != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final int mo50791c() {
        if (this.f51656c != null) {
            return this.f51656c.getCurrentPlaybackTime();
        }
        return 0;
    }

    /* renamed from: e */
    public final void mo50793e() {
        try {
            this.f51656c.setLooping(false);
            this.f51656c.play();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo50784a() {
        if (this.f51656c != null && !this.f51662i) {
            this.f51656c.stop();
            this.f51662i = true;
            this.f51658e.mo50431a(mo50791c(), m62592f());
        }
    }

    /* renamed from: d */
    public final void mo50792d() {
        if (this.f51655b != null) {
            this.f51655b.mo50773a(false);
        }
        if (this.f51656c != null) {
            this.f51656c.release();
            this.f51656c = null;
        }
    }

    /* renamed from: g */
    private void m62593g() {
        if (this.f51656c != null) {
            this.f51656c.release();
        }
        this.f51656c = new TTVideoEngine(this.f51654a, 0);
        this.f51656c.setIsMute(true);
        this.f51656c.mVideoEngineListener = this;
        this.f51656c.mVideoInfoListener = this;
        this.f51656c.setIntOption(4, 2);
    }

    /* renamed from: h */
    private void m62594h() {
        if (!this.f51661h && !this.f51660g.isEmpty()) {
            this.f51661h = true;
            Iterator it = new ArrayList(this.f51660g).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f51660g.clear();
            this.f51661h = false;
        }
    }

    /* renamed from: a */
    public final void mo50787a(C19099b bVar) {
        this.f51658e = bVar;
    }

    /* renamed from: a */
    private void m62591a(Runnable runnable) {
        if (this.f51659f) {
            runnable.run();
        } else {
            this.f51660g.add(runnable);
        }
    }

    public final void onCompletion(TTVideoEngine tTVideoEngine) {
        if (this.f51658e != null) {
            this.f51658e.mo50430a(m62592f());
        }
    }

    public final void onError(C46117c cVar) {
        if (this.f51658e != null) {
            this.f51658e.mo50432b();
        }
    }

    public final void onVideoStatusException(int i) {
        if (this.f51658e != null) {
            this.f51658e.mo50432b();
        }
    }

    public C19097a(C19104e eVar) {
        if (eVar != null) {
            C46123h.m144544a(1, 1);
            this.f51655b = eVar;
            this.f51655b.setVideoViewCallback(this);
            this.f51654a = this.f51655b.getApplicationContext();
            return;
        }
        throw new IllegalArgumentException("IBDASplashVideoView can not be null");
    }

    /* renamed from: a */
    public final void mo50788a(boolean z) {
        if (this.f51656c != null) {
            this.f51656c.setIsMute(z);
        }
    }

    /* renamed from: a */
    public final boolean mo50789a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        m62593g();
        this.f51656c.setLocalURL(str);
        this.f51656c.setStartTime(0);
        Surface surface = this.f51655b.getSurface();
        if (surface == null || !surface.isValid()) {
            this.f51655b.setSurfaceViewVisibility(0);
            m62591a((Runnable) new Runnable() {
                public final void run() {
                    C19097a.this.mo50793e();
                }
            });
        } else {
            this.f51656c.setSurface(surface);
            mo50793e();
        }
        this.f51662i = false;
        return true;
    }

    public final void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        if (i == 1 && this.f51658e != null) {
            this.f51658e.mo50429a();
        }
    }

    /* renamed from: a */
    public final void mo50785a(float f, float f2) {
        if (this.f51656c != null) {
            this.f51656c.setVolume(f, f2);
        }
    }

    /* renamed from: a */
    public final void mo50786a(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f51659f = true;
        Surface surface = this.f51655b.getSurface();
        if (surface == null) {
            surface = new Surface(surfaceTexture);
        }
        if (this.f51656c != null) {
            this.f51656c.setSurface(surface);
            m62594h();
        }
    }
}
