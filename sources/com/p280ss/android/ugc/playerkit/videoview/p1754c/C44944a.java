package com.p280ss.android.ugc.playerkit.videoview.p1754c;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34974d;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1747b.C44879e;
import com.p280ss.android.ugc.playerkit.session.C44925a;
import com.p280ss.android.ugc.playerkit.session.C44926b;
import com.p280ss.android.ugc.playerkit.session.Session;
import com.p280ss.android.ugc.playerkit.videoview.p1753b.C44938a;
import com.p280ss.android.ugc.playerkit.videoview.p1753b.C44939b;
import com.p280ss.android.ugc.playerkit.videoview.p1753b.C44940c;
import com.p280ss.android.ugc.playerkit.videoview.p1753b.C44942e;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44949c;

/* renamed from: com.ss.android.ugc.playerkit.videoview.c.a */
public final class C44944a {

    /* renamed from: c */
    private static C44944a f115609c = new C44944a();

    /* renamed from: a */
    public C44940c f115610a;

    /* renamed from: b */
    public C44939b f115611b;

    /* renamed from: d */
    private final C44938a f115612d = new C44942e();

    /* renamed from: a */
    public static C44944a m141816a() {
        return f115609c;
    }

    private C44944a() {
    }

    /* renamed from: a */
    public final void mo107447a(String str) {
        C44926b g = m141817g(str);
        if (g != null) {
            g.f115570a = System.currentTimeMillis();
        }
    }

    /* renamed from: b */
    public final void mo107449b(String str) {
        C44926b g = m141817g(str);
        if (g != null) {
            g.f115573d = true;
        }
    }

    /* renamed from: c */
    public final void mo107450c(String str) {
        C44926b g = m141817g(str);
        if (g != null) {
            g.f115574e = true;
        }
    }

    /* renamed from: d */
    public final C34974d mo107451d(String str) {
        return this.f115612d.mo107445a(m141817g(str));
    }

    /* renamed from: e */
    public final C44879e mo107452e(String str) {
        return this.f115611b.mo104827a(m141817g(str));
    }

    /* renamed from: f */
    public final C44949c mo107453f(String str) {
        return this.f115610a.mo104828a(m141817g(str));
    }

    /* renamed from: g */
    private C44926b m141817g(String str) {
        C44926b bVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Session b = C44925a.m141730a().mo107408b(str);
        if (b != null) {
            if (b.state == null) {
                synchronized (this) {
                    if (b.state == null) {
                        C44926b bVar2 = new C44926b();
                        b.state = bVar2;
                        bVar = bVar2;
                    }
                }
            } else {
                bVar = b.state;
            }
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo107448a(String str, int i, int i2) {
        C44926b g = m141817g(str);
        if (g != null) {
            g.f115571b = i;
            g.f115572c = i2;
        }
    }
}
