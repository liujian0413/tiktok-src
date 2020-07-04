package com.p280ss.android.ugc.aweme.p313im.sdk.videofileplay;

import android.content.Context;
import android.view.Surface;
import com.p280ss.ttvideoengine.C46033aa;
import com.p280ss.ttvideoengine.C46164s;
import com.p280ss.ttvideoengine.Resolution;
import com.p280ss.ttvideoengine.TTVideoEngine;
import com.p280ss.ttvideoengine.p1816i.C46117c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.b */
public final class C31942b implements C46033aa, C46164s {

    /* renamed from: a */
    public int f83443a;

    /* renamed from: b */
    public int f83444b;

    /* renamed from: c */
    private TTVideoEngine f83445c;

    /* renamed from: d */
    private List<C31943a> f83446d;

    /* renamed from: e */
    private Context f83447e;

    /* renamed from: f */
    private boolean f83448f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.b$a */
    public interface C31943a {
        /* renamed from: a */
        void mo82775a(C31942b bVar);

        /* renamed from: a */
        void mo82776a(C31942b bVar, int i);

        /* renamed from: a */
        void mo82777a(String str);

        /* renamed from: b */
        void mo82778b(C31942b bVar);

        /* renamed from: b */
        void mo82779b(C31942b bVar, int i);

        /* renamed from: c */
        void mo82780c(C31942b bVar);

        /* renamed from: d */
        void mo82781d(C31942b bVar);
    }

    public final void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    /* renamed from: b */
    public final void mo82768b() {
        this.f83445c.pause();
    }

    /* renamed from: c */
    public final void mo82770c() {
        this.f83445c.stop();
    }

    /* renamed from: d */
    public final void mo82772d() {
        if (this.f83448f) {
            this.f83445c.release();
        }
    }

    /* renamed from: e */
    public final boolean mo82773e() {
        if (this.f83445c.mPlaybackState == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m103750f() {
        this.f83445c = new TTVideoEngine(this.f83447e.getApplicationContext(), 0);
        this.f83445c.setIntOption(4, 1);
        m103748a(2);
        this.f83445c.mVideoEngineListener = this;
    }

    /* renamed from: a */
    public final void mo82764a() {
        this.f83445c.play();
        this.f83448f = true;
    }

    /* renamed from: a */
    public final void mo82765a(Surface surface) {
        this.f83445c.setSurface(surface);
    }

    /* renamed from: a */
    private void m103748a(int i) {
        this.f83445c.configResolution(m103749b(2));
    }

    /* renamed from: b */
    public final void mo82769b(String str) {
        this.f83445c.setDirectURL(str);
    }

    /* renamed from: c */
    public final void mo82771c(String str) {
        this.f83445c.setLocalURL(str);
    }

    public C31942b(Context context) {
        if (context != null) {
            this.f83447e = context;
            m103750f();
            this.f83446d = new ArrayList();
            return;
        }
        throw new RuntimeException("context can not be null!");
    }

    /* renamed from: b */
    private static Resolution m103749b(int i) {
        switch (i) {
            case 0:
                return Resolution.Standard;
            case 1:
                return Resolution.High;
            case 2:
                return Resolution.SuperHigh;
            default:
                return Resolution.Standard;
        }
    }

    public final void onCompletion(TTVideoEngine tTVideoEngine) {
        for (C31943a aVar : this.f83446d) {
            if (aVar != null) {
                aVar.mo82781d(this);
            }
        }
    }

    public final void onError(C46117c cVar) {
        for (C31943a aVar : this.f83446d) {
            if (aVar != null) {
                aVar.mo82777a(cVar.f118007d);
            }
        }
    }

    public final void onPrepare(TTVideoEngine tTVideoEngine) {
        for (C31943a aVar : this.f83446d) {
            if (aVar != null) {
                aVar.mo82775a(this);
            }
        }
    }

    public final void onPrepared(TTVideoEngine tTVideoEngine) {
        for (C31943a aVar : this.f83446d) {
            if (aVar != null) {
                aVar.mo82778b(this);
            }
        }
    }

    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
        for (C31943a aVar : this.f83446d) {
            if (aVar != null) {
                aVar.mo82780c(this);
            }
        }
    }

    public final void onVideoStatusException(int i) {
        Iterator it = this.f83446d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    public final void mo82766a(C31943a aVar) {
        this.f83446d.add(aVar);
    }

    public final void onCompletion(boolean z) {
        Iterator it = this.f83446d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    public final void mo82767a(String str) {
        this.f83445c.setDecryptionKey(str);
    }

    public final void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
        Iterator it = this.f83446d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
        switch (i) {
            case 0:
                this.f83444b = 0;
                break;
            case 1:
                this.f83444b = 1;
                break;
            case 2:
                this.f83444b = 2;
                break;
            case 3:
                this.f83444b = 3;
                break;
        }
        for (C31943a aVar : this.f83446d) {
            if (aVar != null) {
                aVar.mo82779b(this, this.f83444b);
            }
        }
    }

    public final void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        switch (i) {
            case 0:
                this.f83443a = 0;
                break;
            case 1:
                this.f83443a = 1;
                break;
            case 2:
                this.f83443a = 2;
                break;
            case 3:
                this.f83443a = 3;
                break;
        }
        for (C31943a aVar : this.f83446d) {
            if (aVar != null) {
                aVar.mo82776a(this, this.f83443a);
            }
        }
    }

    public final void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
        Iterator it = this.f83446d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
