package com.p280ss.android.ugc.aweme.newfollow.util;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25072c;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.feed.p1227c.C28249j;
import com.p280ss.android.ugc.aweme.freeflowcard.p1279b.C29974c;
import com.p280ss.android.ugc.aweme.longvideo.C32752l;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.video.C43222g;
import com.p280ss.android.ugc.playerkit.videoview.C44962h;
import com.p280ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p280ss.android.ugc.playerkit.videoview.VideoViewComponent;

/* renamed from: com.ss.android.ugc.aweme.newfollow.util.d */
public final class C34199d {

    /* renamed from: a */
    public C43222g f89179a;

    /* renamed from: b */
    public String f89180b;

    /* renamed from: c */
    public boolean f89181c;

    /* renamed from: d */
    private Aweme f89182d;

    /* renamed from: e */
    private Aweme f89183e;

    /* renamed from: f */
    private C44962h f89184f;

    /* renamed from: g */
    private final C34976f f89185g;

    /* renamed from: h */
    private final C28249j f89186h;

    /* renamed from: i */
    private final C32752l f89187i;

    /* renamed from: j */
    private int f89188j;

    /* renamed from: k */
    private VideoViewComponent f89189k;

    /* renamed from: b */
    public final void mo86936b() {
        mo86941g();
    }

    /* renamed from: c */
    public final long mo86937c() {
        if (this.f89179a != null) {
            return this.f89179a.mo104910i();
        }
        return 0;
    }

    /* renamed from: d */
    public final long mo86938d() {
        if (this.f89179a != null) {
            return this.f89179a.mo104915n();
        }
        return 0;
    }

    /* renamed from: e */
    public final void mo86939e() {
        this.f89188j = 1;
        if (this.f89179a != null) {
            this.f89179a.mo104948x();
        }
    }

    /* renamed from: f */
    public final void mo86940f() {
        if (m110414p()) {
            this.f89188j = 2;
            m110411m();
        }
    }

    /* renamed from: g */
    public final void mo86941g() {
        if (m110414p()) {
            this.f89188j = 0;
            m110413o();
        }
    }

    /* renamed from: i */
    public final void mo86942i() {
        if (this.f89179a != null) {
            this.f89179a.mo104923C();
        }
    }

    /* renamed from: j */
    public final void mo86943j() {
        if (this.f89179a != null) {
            this.f89179a.mo104924D();
        }
    }

    /* renamed from: k */
    public final void mo86944k() {
        if (this.f89179a != null) {
            this.f89179a.mo104950z();
        }
    }

    /* renamed from: l */
    public final void mo86945l() {
        if (this.f89179a != null) {
            this.f89179a.mo104921A();
        }
    }

    /* renamed from: h */
    public static boolean m110410h() {
        if (C6399b.m19944t()) {
            return true;
        }
        return C6903bc.m21504w().mo76171c();
    }

    /* renamed from: p */
    private boolean m110414p() {
        if (!this.f89184f.mo107459c() || m110416r()) {
            return false;
        }
        m110407a(true);
        return true;
    }

    /* renamed from: q */
    private String m110415q() {
        String str = "";
        if (!TextUtils.isEmpty(this.f89180b)) {
            return this.f89180b;
        }
        if (this.f89186h != null) {
            return this.f89186h.mo71843n();
        }
        return str;
    }

    /* renamed from: r */
    private boolean m110416r() {
        if (this.f89182d == null || this.f89182d.getStatus() == null || !this.f89182d.getStatus().isDelete()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo86931a() {
        if (this.f89179a != null && this.f89179a.mo104942b(this.f89185g)) {
            this.f89179a.mo104939a((C34976f) null);
        }
    }

    /* renamed from: m */
    private void m110411m() {
        if (m110412n() != null && this.f89179a != null) {
            this.f89179a.mo104939a(this.f89185g);
            this.f89179a.mo104930a(this.f89184f.mo107457b());
            this.f89179a.mo104934a(this.f89187i.mo84248a(this.f89182d), true);
        }
    }

    /* renamed from: n */
    private VideoUrlModel m110412n() {
        Aweme aweme;
        Video a = this.f89187i.mo84248a(this.f89182d);
        if (a == null) {
            return null;
        }
        VideoUrlModel properPlayAddr = a.getProperPlayAddr();
        if (properPlayAddr == null) {
            return null;
        }
        if (this.f89183e == null) {
            aweme = this.f89182d;
        } else {
            aweme = this.f89183e;
        }
        a.setRationAndSourceId(aweme.getAid());
        return properPlayAddr;
    }

    /* renamed from: o */
    private void m110413o() {
        if (m110412n() != null && this.f89179a != null) {
            this.f89179a.mo104939a(this.f89185g);
            this.f89179a.mo104930a(this.f89184f.mo107457b());
            this.f89179a.mo104932a(this.f89187i.mo84248a(this.f89182d), this.f89185g);
        }
    }

    /* renamed from: a */
    public final void mo86932a(float f) {
        if (this.f89179a != null) {
            this.f89179a.mo104928a(f);
        }
    }

    /* renamed from: a */
    private boolean m110407a(boolean z) {
        boolean z2;
        if (C6399b.m19944t()) {
            return true;
        }
        C29974c w = C6903bc.m21504w();
        if (C25329c.m83231n(this.f89182d) || C25072c.m82575a(this.f89182d)) {
            z2 = true;
        } else {
            z2 = false;
        }
        w.mo76169a(z2, m110415q());
        return true;
    }

    /* renamed from: b */
    private void m110408b(int i) {
        if (m110412n() != null && this.f89179a != null) {
            this.f89179a.mo104939a(this.f89185g);
            this.f89179a.mo104930a(this.f89184f.mo107457b());
            this.f89179a.mo104935a(this.f89187i.mo84248a(this.f89182d), true, i);
        }
    }

    /* renamed from: c */
    private void m110409c(int i) {
        if (m110412n() != null && this.f89179a != null) {
            this.f89179a.mo104939a(this.f89185g);
            this.f89179a.mo104930a(this.f89184f.mo107457b());
            this.f89179a.mo104933a(this.f89187i.mo84248a(this.f89182d), this.f89185g, i);
        }
    }

    /* renamed from: a */
    public final void mo86933a(int i) {
        if (m110414p()) {
            this.f89188j = 2;
            m110408b(i);
        }
    }

    /* renamed from: a */
    public final void mo86934a(Aweme aweme) {
        if (aweme != null) {
            if (aweme.getAwemeType() == 13) {
                this.f89183e = aweme;
                this.f89182d = aweme.getForwardItem();
                return;
            }
            this.f89183e = null;
            this.f89182d = aweme;
        }
    }

    /* renamed from: a */
    public final boolean mo86935a(boolean z, int i) {
        if (!this.f89184f.mo107459c() || m110416r()) {
            return false;
        }
        this.f89188j = 0;
        if (z) {
            m110408b(i);
        } else {
            m110409c(i);
        }
        return true;
    }

    public C34199d(KeepSurfaceTextureView keepSurfaceTextureView, C34976f fVar, C28249j jVar) {
        this(keepSurfaceTextureView, fVar, (C28249j) null, C32752l.f85393a);
    }

    private C34199d(KeepSurfaceTextureView keepSurfaceTextureView, C34976f fVar, C28249j jVar, C32752l lVar) {
        this(C44962h.m141885a(keepSurfaceTextureView), fVar, jVar, lVar);
    }

    public C34199d(VideoViewComponent videoViewComponent, C34976f fVar, C28249j jVar, C32752l lVar) {
        this.f89189k = videoViewComponent;
        this.f89184f = this.f89189k.f115582b;
        this.f89185g = fVar;
        this.f89186h = null;
        this.f89187i = lVar;
    }

    public C34199d(C44962h hVar, C34976f fVar, C28249j jVar, C32752l lVar) {
        this.f89184f = hVar;
        this.f89185g = fVar;
        this.f89186h = jVar;
        this.f89187i = lVar;
    }
}
