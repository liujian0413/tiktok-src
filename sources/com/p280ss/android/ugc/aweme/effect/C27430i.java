package com.p280ss.android.ugc.aweme.effect;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.graphics.Bitmap;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.effect.p1200d.C27424c;
import com.p280ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.gamora.editor.EditPreviewViewModel;
import com.p280ss.android.ugc.gamora.editor.EditViewModel;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import dmt.p1861av.video.C47458g;
import dmt.p1861av.video.C47462j;
import dmt.p1861av.video.C47479s;
import dmt.p1861av.video.C47516v;
import dmt.p1861av.video.C47518x;
import dmt.p1861av.video.C47520y;
import dmt.p1861av.video.VEVideoPublishEditViewModel;
import java.util.ArrayList;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.effect.i */
public final class C27430i implements C27424c {

    /* renamed from: a */
    private final VEVideoPublishEditViewModel f72346a;

    /* renamed from: b */
    private final EditViewModel f72347b;

    /* renamed from: c */
    private final EditPreviewViewModel f72348c;

    /* renamed from: d */
    private final FragmentActivity f72349d;

    /* renamed from: a */
    public final FragmentActivity mo70534a() {
        return this.f72349d;
    }

    /* renamed from: b */
    public final VideoPublishEditModel mo70535b() {
        return this.f72347b.mo29069f();
    }

    /* renamed from: c */
    public final C0052o<Boolean> mo70536c() {
        return this.f72348c.mo106323h();
    }

    /* renamed from: d */
    public final C0052o<Bitmap> mo70537d() {
        return this.f72348c.mo106324i();
    }

    /* renamed from: e */
    public final C0052o<C15389d> mo70538e() {
        return this.f72347b.mo106448i();
    }

    /* renamed from: n */
    public final C0052o<Boolean> mo70547n() {
        return this.f72347b.mo106449j();
    }

    /* renamed from: f */
    public final C0052o<VEVolumeChangeOp> mo70539f() {
        C0052o<VEVolumeChangeOp> m = this.f72346a.mo119521m();
        C7573i.m23582a((Object) m, "publishEditViewModel.volumeChangeOpLiveData");
        return m;
    }

    /* renamed from: g */
    public final C0052o<Boolean> mo70540g() {
        C0052o<Boolean> h = this.f72346a.mo119516h();
        C7573i.m23582a((Object) h, "publishEditViewModel.reverseReadyLiveData");
        return h;
    }

    /* renamed from: h */
    public final ArrayList<EffectPointModel> mo70541h() {
        ArrayList<EffectPointModel> arrayList = this.f72346a.f121664a;
        C7573i.m23582a((Object) arrayList, "publishEditViewModel.effectPointModelStack");
        return arrayList;
    }

    /* renamed from: i */
    public final C47458g<C47479s> mo70542i() {
        C47458g<C47479s> j = this.f72346a.mo119518j();
        C7573i.m23582a((Object) j, "publishEditViewModel.filterEffectOpLiveData");
        return j;
    }

    /* renamed from: j */
    public final C0052o<C47516v> mo70543j() {
        C0052o<C47516v> k = this.f72346a.mo119519k();
        C7573i.m23582a((Object) k, "publishEditViewModel.previewControlLiveData");
        return k;
    }

    /* renamed from: k */
    public final C0052o<Boolean> mo70544k() {
        C0052o<Boolean> o = this.f72346a.mo119523o();
        C7573i.m23582a((Object) o, "publishEditViewModel.reverseLiveData");
        return o;
    }

    /* renamed from: l */
    public final C0052o<C47518x> mo70545l() {
        C0052o<C47518x> g = this.f72346a.mo119515g();
        C7573i.m23582a((Object) g, "publishEditViewModel.videoPreviewScaleOpChangeV2");
        return g;
    }

    /* renamed from: m */
    public final C47462j<C47520y> mo70546m() {
        C47462j<C47520y> l = this.f72346a.mo119520l();
        C7573i.m23582a((Object) l, "publishEditViewModel.timeEffectOpLiveData");
        return l;
    }

    public C27430i(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "activity");
        this.f72349d = fragmentActivity;
        C0063u a = C0069x.m159a(this.f72349d).mo147a(VEVideoPublishEditViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ditViewModel::class.java)");
        this.f72346a = (VEVideoPublishEditViewModel) a;
        JediViewModel a2 = C36113b.m116288a(this.f72349d).mo91871a(EditViewModel.class);
        C7573i.m23582a((Object) a2, "JediViewModelProviders.o…ditViewModel::class.java)");
        this.f72347b = (EditViewModel) a2;
        JediViewModel a3 = C36113b.m116288a(this.f72349d).mo91871a(EditPreviewViewModel.class);
        C7573i.m23582a((Object) a3, "JediViewModelProviders.o…iewViewModel::class.java)");
        this.f72348c = (EditPreviewViewModel) a3;
    }
}
