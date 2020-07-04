package com.p280ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39312e;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.p280ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.p280ss.android.ugc.aweme.tools.C42135ab;
import com.p280ss.android.ugc.aweme.tools.C42152as;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42345j;
import com.p280ss.android.ugc.aweme.tools.C42568n;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42605d;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.p280ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewModel;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.y */
public final class C41711y {

    /* renamed from: a */
    static final long f108574a = C35563c.f93230L.mo93344c(Property.LongVideoThreshold);

    /* renamed from: b */
    private final C42605d f108575b;

    /* renamed from: c */
    private C39382ed f108576c;

    /* renamed from: d */
    private RecordToolbarViewModel f108577d;

    /* renamed from: d */
    private long m132825d() {
        BackgroundVideo backgroundVideo = this.f108576c.mo97964Q().f99791a.f99782r;
        if (backgroundVideo != null) {
            return backgroundVideo.getMaxDuration();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo102482a() {
        if (this.f108575b.f110761a.booleanValue()) {
            m132823b();
            return;
        }
        if (!TextUtils.isEmpty(this.f108575b.f110764d)) {
            m132824c();
        }
    }

    /* renamed from: b */
    private void m132823b() {
        if (this.f108576c != null && this.f108576c.f33526d_ != null && !this.f108576c.f33526d_.isFinishing() && this.f108576c.mo97964Q() != null) {
            ShortVideoContext shortVideoContext = this.f108576c.mo97964Q().f99791a;
            shortVideoContext.mo96146g();
            long d = m132825d();
            if (d > 0) {
                shortVideoContext.f99767c = Math.min(shortVideoContext.f99767c, d);
            }
            C42135ab abVar = new C42135ab(shortVideoContext.f99767c);
            this.f108576c.mo97963P().mo103594a((Object) this, (C42155av) abVar);
            this.f108576c.mo97896J().mo103594a((Object) this, (C42155av) abVar);
            C42345j jVar = new C42345j();
            this.f108576c.mo97963P().mo103594a((Object) this, (C42155av) jVar);
            this.f108576c.mo97896J().mo103594a((Object) this, (C42155av) jVar);
        }
    }

    /* renamed from: c */
    private void m132824c() {
        long j;
        long j2;
        long j3;
        if (this.f108576c != null && this.f108576c.f33526d_ != null && !this.f108576c.f33526d_.isFinishing()) {
            String str = this.f108575b.f110764d;
            AVMusic aVMusic = this.f108575b.f110763c;
            String str2 = this.f108575b.f110762b;
            if (this.f108576c.mo97964Q().f99791a.f99745af) {
                j = f108574a;
            } else {
                j = C40413c.f105051b;
            }
            long j4 = j;
            if (aVMusic == null || TextUtils.isEmpty(str)) {
                j2 = 0;
                j3 = j4;
            } else {
                long a = C38580ci.m123273a(aVMusic, str);
                j3 = Math.min(a, j4);
                j2 = a;
            }
            long d = m132825d();
            if (d > 0) {
                j3 = Math.min(j3, d);
            }
            if (this.f108577d == null) {
                this.f108577d = (RecordToolbarViewModel) C36113b.m116288a(this.f108576c.mo97962O()).mo91871a(RecordToolbarViewModel.class);
            }
            if (!C38579ch.m123272a()) {
                this.f108577d.mo107178a(new C42152as(true, true));
                this.f108576c.mo97964Q().f99791a.f99745af = false;
            }
            this.f108576c.mo97964Q().f99791a.f99772h = str2;
            this.f108576c.mo97964Q().f99791a.f99769e = str;
            this.f108576c.mo97964Q().f99791a.f99767c = j3;
            if (this.f108576c instanceof C39336dd) {
                ((C39336dd) this.f108576c).f102205z = C39360dw.m125725a().mo97931b();
            }
            if (aVMusic != null) {
                this.f108576c.mo97964Q().f99791a.f99732aJ = C39312e.m125621a(aVMusic);
            }
            if (C6399b.m19946v()) {
                ((RecordViewModel) C36113b.m116288a(this.f108576c.mo97962O()).mo91871a(RecordViewModel.class)).mo106829a(0);
            }
            C42568n nVar = new C42568n(aVMusic, str);
            this.f108576c.mo97963P().mo103594a((Object) this, (C42155av) nVar);
            this.f108576c.mo97896J().mo103594a((Object) this, (C42155av) nVar);
            m132822a(aVMusic, j4, j2);
            if (new C38573cd().mo96553a(j4, j2) == MaxDurationTip.MUSIC && (this.f108576c instanceof C39336dd) && this.f108575b.f110765e) {
                ((RecordChooseMusicViewModel) C36113b.m116288a(this.f108576c.mo97962O()).mo91871a(RecordChooseMusicViewModel.class)).f114733e.setValue(Integer.valueOf(1));
            }
            C42135ab abVar = new C42135ab(j3);
            this.f108576c.mo97963P().mo103594a((Object) this, (C42155av) abVar);
            this.f108576c.mo97896J().mo103594a((Object) this, (C42155av) abVar);
        }
    }

    public C41711y(C42605d dVar, C39382ed edVar) {
        this.f108575b = dVar;
        this.f108576c = edVar;
    }

    /* renamed from: a */
    private void m132822a(AVMusic aVMusic, long j, long j2) {
        if (aVMusic != null) {
            if (C35563c.f93231M.mo93305a(AVAB.Property.EnableRemove15sCapMusic)) {
                if (((long) aVMusic.shootDuration) > j || Math.abs(aVMusic.shootDuration - aVMusic.duration) >= 1000) {
                    this.f108577d.mo107187d(true);
                } else {
                    this.f108577d.mo107187d(false);
                }
            } else if (j > j2) {
                this.f108577d.mo107187d(false);
            } else {
                this.f108577d.mo107187d(true);
            }
        }
    }
}
