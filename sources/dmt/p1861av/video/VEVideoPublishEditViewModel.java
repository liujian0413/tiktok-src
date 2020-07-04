package dmt.p1861av.video;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.LiveData;
import com.p280ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p280ss.android.ugc.aweme.effect.EffectPointModel;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.filter.model.C29321a;
import com.p280ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1562b.C39508b;
import com.p280ss.android.ugc.aweme.shortvideo.lyric.C40026b;
import java.util.ArrayList;

/* renamed from: dmt.av.video.VEVideoPublishEditViewModel */
public class VEVideoPublishEditViewModel extends C0063u {

    /* renamed from: a */
    public ArrayList<EffectPointModel> f121664a = new ArrayList<>();

    /* renamed from: b */
    private C0052o<VEPreviewParams> f121665b;

    /* renamed from: c */
    private C0052o<VEPreviewMusicParams> f121666c;

    /* renamed from: d */
    private C0052o<C29321a> f121667d;

    /* renamed from: e */
    private C47458g<C47479s> f121668e;

    /* renamed from: f */
    private C0052o<C47516v> f121669f;

    /* renamed from: g */
    private C47462j<C47520y> f121670g;

    /* renamed from: h */
    private C0052o<VEVolumeChangeOp> f121671h;

    /* renamed from: i */
    private C0052o<C47515u> f121672i;

    /* renamed from: j */
    private C0052o<Boolean> f121673j;

    /* renamed from: k */
    private C0052o<InfoStickerModel> f121674k;

    /* renamed from: l */
    private C0052o<Boolean> f121675l;

    /* renamed from: m */
    private C0052o<C47517w> f121676m;

    /* renamed from: n */
    private C0052o<C47518x> f121677n;

    /* renamed from: o */
    private C0052o<Boolean> f121678o;

    /* renamed from: p */
    private C0052o<AudioRecorderParam> f121679p;

    /* renamed from: q */
    private C47462j<C47466l> f121680q;

    /* renamed from: r */
    private C0052o<AudioEffectParam> f121681r;

    /* renamed from: s */
    private C0052o<Boolean> f121682s;

    /* renamed from: t */
    private C0052o<Boolean> f121683t;

    /* renamed from: u */
    private C0052o<C39508b> f121684u;

    /* renamed from: v */
    private C0052o<C40026b> f121685v;

    /* renamed from: i */
    public final LiveData<C29321a> mo119517i() {
        m147981v();
        return this.f121667d;
    }

    /* renamed from: j */
    public final C47458g<C47479s> mo119518j() {
        m147982w();
        return this.f121668e;
    }

    /* renamed from: k */
    public final C0052o<C47516v> mo119519k() {
        m147983x();
        return this.f121669f;
    }

    /* renamed from: l */
    public final C47462j<C47520y> mo119520l() {
        m147984y();
        return this.f121670g;
    }

    /* renamed from: m */
    public final C0052o<VEVolumeChangeOp> mo119521m() {
        m147985z();
        return this.f121671h;
    }

    /* renamed from: w */
    private void m147982w() {
        if (this.f121668e == null) {
            this.f121668e = new C47458g<>();
        }
    }

    /* renamed from: x */
    private void m147983x() {
        if (this.f121669f == null) {
            this.f121669f = new C0052o<>();
        }
    }

    /* renamed from: y */
    private void m147984y() {
        if (this.f121670g == null) {
            this.f121670g = new C47462j<>();
        }
    }

    /* renamed from: z */
    private void m147985z() {
        if (this.f121671h == null) {
            this.f121671h = new C0052o<>();
        }
    }

    /* renamed from: a */
    public final C0052o<VEPreviewParams> mo119508a() {
        if (this.f121665b == null) {
            this.f121665b = new C0052o<>();
        }
        return this.f121665b;
    }

    /* renamed from: b */
    public final C0052o<AudioRecorderParam> mo119510b() {
        if (this.f121679p == null) {
            this.f121679p = new C0052o<>();
        }
        return this.f121679p;
    }

    /* renamed from: c */
    public final C47462j<C47466l> mo119511c() {
        if (this.f121680q == null) {
            this.f121680q = new C47462j<>();
        }
        return this.f121680q;
    }

    /* renamed from: d */
    public final C0052o<AudioEffectParam> mo119512d() {
        if (this.f121681r == null) {
            this.f121681r = new C0052o<>();
        }
        return this.f121681r;
    }

    /* renamed from: e */
    public final C0052o<VEPreviewMusicParams> mo119513e() {
        if (this.f121666c == null) {
            this.f121666c = new C0052o<>();
        }
        return this.f121666c;
    }

    /* renamed from: f */
    public final C0052o<C47517w> mo119514f() {
        if (this.f121676m == null) {
            this.f121676m = new C0052o<>();
        }
        return this.f121676m;
    }

    /* renamed from: g */
    public final C0052o<C47518x> mo119515g() {
        if (this.f121677n == null) {
            this.f121677n = new C0052o<>();
        }
        return this.f121677n;
    }

    /* renamed from: h */
    public final C0052o<Boolean> mo119516h() {
        if (this.f121678o == null) {
            this.f121678o = new C0052o<>();
        }
        return this.f121678o;
    }

    /* renamed from: n */
    public final C0052o<C47515u> mo119522n() {
        if (this.f121672i == null) {
            this.f121672i = new C0052o<>();
        }
        return this.f121672i;
    }

    /* renamed from: o */
    public final C0052o<Boolean> mo119523o() {
        if (this.f121673j == null) {
            this.f121673j = new C0052o<>();
        }
        return this.f121673j;
    }

    /* renamed from: p */
    public final C0052o<InfoStickerModel> mo119524p() {
        if (this.f121674k == null) {
            this.f121674k = new C0052o<>();
        }
        return this.f121674k;
    }

    /* renamed from: q */
    public final C0052o<Boolean> mo119525q() {
        if (this.f121675l == null) {
            this.f121675l = new C0052o<>();
        }
        return this.f121675l;
    }

    /* renamed from: t */
    public final C0052o<C39508b> mo119528t() {
        if (this.f121684u == null) {
            this.f121684u = new C0052o<>();
        }
        return this.f121684u;
    }

    /* renamed from: u */
    public final C0052o<C40026b> mo119529u() {
        if (this.f121685v == null) {
            this.f121685v = new C0052o<>();
        }
        return this.f121685v;
    }

    /* renamed from: r */
    public final C0052o<Boolean> mo119526r() {
        if (this.f121682s == null) {
            this.f121682s = new C0052o<>();
            this.f121682s.setValue(Boolean.valueOf(false));
        }
        return this.f121682s;
    }

    /* renamed from: s */
    public final C0052o<Boolean> mo119527s() {
        if (this.f121683t == null) {
            this.f121683t = new C0052o<>();
            this.f121683t.setValue(Boolean.valueOf(false));
        }
        return this.f121683t;
    }

    /* renamed from: v */
    private void m147981v() {
        if (this.f121667d == null) {
            this.f121667d = new C0052o<>();
            this.f121667d.setValue(new C29321a(true, C35563c.f93224F.mo70097l().mo74949b().mo74967c()));
        }
    }

    /* renamed from: a */
    public final void mo119509a(C29296g gVar, boolean z) {
        m147981v();
        this.f121667d.setValue(new C29321a(z, gVar));
    }
}
