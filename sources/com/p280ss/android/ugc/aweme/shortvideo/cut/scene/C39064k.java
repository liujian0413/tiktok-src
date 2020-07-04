package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12629j;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C38501ax;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38750f;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39193g;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractVideoEditView;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEVideoEditViewV2;
import com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel.C39293a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.C39575f;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k */
public final class C39064k extends C12629j implements C44396a {

    /* renamed from: x */
    public static final C39065a f101359x = new C39065a(null);

    /* renamed from: i */
    public C38982av f101360i;

    /* renamed from: j */
    public C38916af f101361j;

    /* renamed from: k */
    public AbstractVideoEditView f101362k;

    /* renamed from: l */
    public TextView f101363l;

    /* renamed from: m */
    public FrameLayout f101364m;

    /* renamed from: n */
    public View f101365n;

    /* renamed from: o */
    public final C39293a f101366o = new C39293a(3, 0, SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing);

    /* renamed from: p */
    public VideoEditViewModel f101367p;

    /* renamed from: q */
    public VEVideoCutterViewModel f101368q;

    /* renamed from: r */
    public CutVideoBottomBarViewModel f101369r;

    /* renamed from: s */
    public CutVideoEditViewModel f101370s;

    /* renamed from: t */
    public CutVideoListViewModel f101371t;

    /* renamed from: u */
    public CutVideoSpeedViewModel f101372u;

    /* renamed from: v */
    public String f101373v;

    /* renamed from: w */
    public String f101374w;

    /* renamed from: y */
    private CutMultiVideoViewModel f101375y;

    /* renamed from: z */
    private CutVideoViewModel f101376z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$a */
    public static final class C39065a {
        private C39065a() {
        }

        public /* synthetic */ C39065a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$b */
    static final class C39066b<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ C39064k f101377a;

        C39066b(C39064k kVar) {
            this.f101377a = kVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            int i;
            CutVideoEditViewModel a = C39064k.m124761a(this.f101377a);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            a.f100834d = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$c */
    static final class C39067c<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C39064k f101378a;

        C39067c(C39064k kVar) {
            this.f101378a = kVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            this.f101378a.f101366o.f102020b = this.f101378a.mo30921H().getPlayingPosition();
            C39064k.m124762b(this.f101378a).mo97802a(this.f101378a.f101366o);
            C39064k.m124763c(this.f101378a).mo96955a(this.f101378a.mo30921H().getSelectedTime());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$d */
    static final class C39068d<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C39064k f101379a;

        C39068d(C39064k kVar) {
            this.f101379a = kVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            long j;
            if (this.f101379a.mo30921H() instanceof VEVideoEditViewV2) {
                C39064k.m124762b(this.f101379a).mo97802a(new C39293a(3, this.f101379a.mo30921H().getSingleSeekTime(), SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateInOut));
            } else {
                if (C39064k.m124761a(this.f101379a).f100834d == 1) {
                    j = this.f101379a.mo30921H().getMultiPlayingPosition();
                } else {
                    j = this.f101379a.mo30921H().getSinglePlayingPosition();
                }
                C38916af G = this.f101379a.mo30920G();
                C0902i playBoundary = this.f101379a.mo30921H().getPlayBoundary();
                C7573i.m23582a((Object) playBoundary, "videoEditView.playBoundary");
                G.mo97210a(playBoundary, this.f101379a.mo30921H().getMaxCutDuration());
                C39064k.m124762b(this.f101379a).mo97802a(new C39293a(3, j, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek));
            }
            C39064k.m124763c(this.f101379a).mo96955a(this.f101379a.mo30921H().getSelectedTime());
            if (C39064k.m124761a(this.f101379a).f100834d == 2) {
                C38916af G2 = this.f101379a.mo30920G();
                VideoSegment videoSegment = (VideoSegment) C39064k.m124764d(this.f101379a).mo97721n().get(C39064k.m124765e(this.f101379a).f100940e);
                F f = this.f101379a.mo30921H().getPlayBoundary().f3154a;
                if (f == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) f, "videoEditView.playBoundary.first!!");
                long longValue = ((Number) f).longValue();
                S s = this.f101379a.mo30921H().getPlayBoundary().f3155b;
                if (s == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) s, "videoEditView.playBoundary.second!!");
                G2.mo97212a(videoSegment, longValue, ((Number) s).longValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$e */
    static final class C39069e<T> implements C0053p<Float> {

        /* renamed from: a */
        final /* synthetic */ C39064k f101380a;

        C39069e(C39064k kVar) {
            this.f101380a = kVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Float f) {
            long j;
            if (f != null) {
                C38916af G = this.f101380a.mo30920G();
                int i = C39064k.m124765e(this.f101380a).f100940e;
                C7573i.m23582a((Object) f, "it");
                G.mo97205a(i, f.floatValue());
                C0902i playBoundary = this.f101380a.mo30921H().getPlayBoundary();
                if (!(playBoundary.f3154a == null || playBoundary.f3155b == null)) {
                    if (C39064k.m124761a(this.f101380a).f100834d == 1) {
                        j = this.f101380a.mo30921H().getMultiSeekTime();
                    } else {
                        j = this.f101380a.mo30921H().getSingleSeekTime();
                    }
                    C38916af G2 = this.f101380a.mo30920G();
                    C0902i playBoundary2 = this.f101380a.mo30921H().getPlayBoundary();
                    C7573i.m23582a((Object) playBoundary2, "videoEditView.playBoundary");
                    G2.mo97210a(playBoundary2, this.f101380a.mo30921H().getMaxCutDuration());
                    C39064k.m124762b(this.f101380a).mo97802a(new C39293a(3, j, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek));
                }
                C39064k.m124763c(this.f101380a).mo96955a(this.f101380a.mo30921H().getSelectedTime());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$f */
    static final class C39070f<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C39064k f101381a;

        C39070f(C39064k kVar) {
            this.f101381a = kVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            C39064k.m124762b(this.f101381a).mo97802a(new C39293a(3, this.f101381a.mo30921H().getLeftSeekingValue(), SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$g */
    static final class C39071g<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C39064k f101382a;

        C39071g(C39064k kVar) {
            this.f101382a = kVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            C39064k.m124762b(this.f101382a).mo97802a(new C39293a(3, this.f101382a.mo30921H().getLeftSeekingValue(), SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateInOut));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$h */
    static final class C39072h extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39064k f101383a;

        C39072h(C39064k kVar) {
            this.f101383a = kVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124797a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124797a(C44396a aVar, C7581n nVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            C0902i playBoundary = this.f101383a.mo30921H().getPlayBoundary();
            C38982av avVar = this.f101383a.f101360i;
            if (avVar != null && avVar.mo97280k()) {
                List<VideoSegment> n = C39064k.m124764d(this.f101383a).mo97721n();
                C7573i.m23582a((Object) n, "videoEditViewModel.originVideoList");
                long j = 0;
                for (VideoSegment videoSegment : n) {
                    if (!videoSegment.f100768j) {
                        C7573i.m23582a((Object) videoSegment, "it");
                        j += videoSegment.mo96910i() - videoSegment.mo96909h();
                    }
                }
                playBoundary = new C0902i(Long.valueOf(0), Long.valueOf(j));
            }
            C38916af G = this.f101383a.mo30920G();
            C7573i.m23582a((Object) playBoundary, "boundary");
            G.mo97210a(playBoundary, this.f101383a.mo30921H().getMaxCutDuration());
            VEVideoCutterViewModel b = C39064k.m124762b(this.f101383a);
            Long l = (Long) playBoundary.f3154a;
            if (l == null) {
                l = Long.valueOf(0);
            }
            b.mo97802a(new C39293a(3, l.longValue(), SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$i */
    static final class C39073i extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39064k f101384a;

        C39073i(C39064k kVar) {
            this.f101384a = kVar;
            super(2);
        }

        /* renamed from: a */
        private void m124798a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            this.f101384a.mo30921H().setEnabled(z);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124798a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$j */
    static final class C39074j<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C39064k f101385a;

        C39074j(C39064k kVar) {
            this.f101385a = kVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                if (!(!bool.booleanValue())) {
                    bool = null;
                }
                if (bool != null) {
                    C39064k.m124762b(this.f101385a).mo97802a(new C39293a(3, this.f101385a.mo30921H().getPlayingPosition(), SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$k */
    static final class C39075k extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39064k f101386a;

        C39075k(C39064k kVar) {
            this.f101386a = kVar;
            super(2);
        }

        /* renamed from: a */
        private void m124800a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            this.f101386a.mo30921H().mo97600a(z);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124800a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$l */
    static final class C39076l extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39064k f101387a;

        C39076l(C39064k kVar) {
            this.f101387a = kVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124801a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124801a(C44396a aVar, C7581n nVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            this.f101387a.mo30921H().mo97602d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$m */
    static final class C39077m extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39064k f101388a;

        C39077m(C39064k kVar) {
            this.f101388a = kVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124802a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124802a(C44396a aVar, boolean z) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            View f = C39064k.m124766f(this.f101388a);
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            f.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$n */
    static final class C39078n<T> implements C0053p<Float> {

        /* renamed from: a */
        final /* synthetic */ C39064k f101389a;

        C39078n(C39064k kVar) {
            this.f101389a = kVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Float f) {
            if (f != null) {
                View f2 = C39064k.m124766f(this.f101389a);
                C7573i.m23582a((Object) f, "it");
                f2.setAlpha(f.floatValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$o */
    static final class C39079o<T> implements C0053p<Long> {

        /* renamed from: a */
        final /* synthetic */ C39064k f101390a;

        C39079o(C39064k kVar) {
            this.f101390a = kVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Long l) {
            if (l != null) {
                C39064k.m124762b(this.f101390a).mo97802a(new C39293a(3, l.longValue(), SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$p */
    static final class C39080p<T> implements C0053p<Float> {

        /* renamed from: a */
        final /* synthetic */ C39064k f101391a;

        C39080p(C39064k kVar) {
            this.f101391a = kVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Float f) {
            C39064k.m124763c(this.f101391a).mo96955a(this.f101391a.mo30921H().getSelectedTime());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$q */
    static final class C39081q<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C39064k f101392a;

        C39081q(C39064k kVar) {
            this.f101392a = kVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            C39064k.m124762b(this.f101392a).mo97802a(new C39293a(3, this.f101392a.mo30921H().getLeftSeekingValue(), SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing));
            C39064k.m124763c(this.f101392a).mo96955a(this.f101392a.mo30921H().getSelectedTime());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$r */
    static final class C39082r<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C39064k f101393a;

        C39082r(C39064k kVar) {
            this.f101393a = kVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            C39064k.m124762b(this.f101393a).mo97802a(new C39293a(3, this.f101393a.mo30921H().getRightSeekingValue(), SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing));
            C39064k.m124763c(this.f101393a).mo96955a(this.f101393a.mo30921H().getSelectedTime());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$s */
    static final class C39083s<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C39064k f101394a;

        C39083s(C39064k kVar) {
            this.f101394a = kVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            C39064k.m124762b(this.f101394a).mo97802a(new C39293a(3, this.f101394a.mo30921H().getLeftSeekingValue(), SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateIn));
            C39064k.m124763c(this.f101394a).mo96955a(this.f101394a.mo30921H().getSelectedTime());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$t */
    static final class C39084t<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C39064k f101395a;

        C39084t(C39064k kVar) {
            this.f101395a = kVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            C39064k.m124762b(this.f101395a).mo97802a(new C39293a(3, this.f101395a.mo30921H().getRightSeekingValue(), SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateOut));
            C39064k.m124763c(this.f101395a).mo96955a(this.f101395a.mo30921H().getSelectedTime());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$u */
    static final class C39085u<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C39064k f101396a;

        C39085u(C39064k kVar) {
            this.f101396a = kVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            C6907h.m21524a("upload_duration_adjust", (Map) C22984d.m75611a().mo59973a("creation_id", this.f101396a.f101374w).mo59973a("shoot_way", this.f101396a.f101373v).mo59973a("enter_from", "clip_edit_page").mo59973a("content_type", "video").mo59970a("content_duration_ms", (int) (this.f101396a.mo30921H().getSelectedTime() * 1000.0f)).f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$v */
    public static final class C39086v implements C38750f {

        /* renamed from: a */
        final /* synthetic */ C39064k f101397a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$v$a */
        static final class C39087a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C39086v f101398a;

            C39087a(C39086v vVar) {
                this.f101398a = vVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TextView g = C39064k.m124767g(this.f101398a.f101397a);
                C7573i.m23582a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    g.setAlpha(((Float) animatedValue).floatValue());
                    CutVideoBottomBarViewModel c = C39064k.m124763c(this.f101398a.f101397a);
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    if (animatedValue2 != null) {
                        c.mo96957b(1.0f - ((Float) animatedValue2).floatValue());
                        CutVideoSpeedViewModel h = C39064k.m124768h(this.f101398a.f101397a);
                        Object animatedValue3 = valueAnimator.getAnimatedValue();
                        if (animatedValue3 != null) {
                            h.mo97103a(1.0f - ((Float) animatedValue3).floatValue());
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.k$v$b */
        static final class C39088b implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C39086v f101399a;

            C39088b(C39086v vVar) {
                this.f101399a = vVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TextView g = C39064k.m124767g(this.f101399a.f101397a);
                C7573i.m23582a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    g.setAlpha(((Float) animatedValue).floatValue());
                    CutVideoBottomBarViewModel c = C39064k.m124763c(this.f101399a.f101397a);
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    if (animatedValue2 != null) {
                        c.mo96957b(1.0f - ((Float) animatedValue2).floatValue());
                        CutVideoSpeedViewModel h = C39064k.m124768h(this.f101399a.f101397a);
                        Object animatedValue3 = valueAnimator.getAnimatedValue();
                        if (animatedValue3 != null) {
                            h.mo97103a(1.0f - ((Float) animatedValue3).floatValue());
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
        }

        /* renamed from: a */
        public final void mo96719a() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat.setDuration(250);
            ofFloat.addUpdateListener(new C39087a(this));
            C39064k.m124763c(this.f101397a).mo96965h(true);
            C39064k.m124769i(this.f101397a).setVisibility(8);
            ofFloat.start();
        }

        C39086v(C39064k kVar) {
            this.f101397a = kVar;
        }

        /* renamed from: b */
        public final void mo96721b(float f) {
            Locale locale = Locale.getDefault();
            C7573i.m23582a((Object) locale, "Locale.getDefault()");
            String a = C1642a.m8035a(locale, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
            C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
            C39064k.m124767g(this.f101397a).setText(this.f101397a.mo31017x().getString(R.string.cb0, new Object[]{a}));
        }

        /* renamed from: a */
        public final void mo96720a(float f) {
            mo96721b(f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.setDuration(250);
            ofFloat.addUpdateListener(new C39088b(this));
            C39064k.m124763c(this.f101397a).mo96965h(false);
            C39064k.m124769i(this.f101397a).setVisibility(0);
            ofFloat.start();
        }
    }

    /* renamed from: a */
    public final void mo97356a(C38916af afVar) {
        C7573i.m23587b(afVar, "<set-?>");
        this.f101361j = afVar;
    }

    /* renamed from: a */
    public final void mo31001a(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.mo31001a(view, bundle);
        m124755J();
        View h_ = mo31004h_(R.id.ea3);
        C7573i.m23582a((Object) h_, "requireViewById(R.id.videoEditView)");
        this.f101362k = (AbstractVideoEditView) h_;
        View h_2 = mo31004h_(R.id.d7p);
        C7573i.m23582a((Object) h_2, "requireViewById(R.id.slide_hint_txt)");
        this.f101365n = h_2;
        m124757L();
        if (C35563c.f93231M.mo93305a(Property.EnableUploadVideoSlideAutoJust)) {
            m124759N();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C44397a.m140509d(this);
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C44397a.m140511e(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C44397a.m140494a(this);
    }

    /* renamed from: G */
    public final C38916af mo30920G() {
        C38916af afVar = this.f101361j;
        if (afVar == null) {
            C7573i.m23583a("presenter");
        }
        return afVar;
    }

    /* renamed from: H */
    public final AbstractVideoEditView mo30921H() {
        AbstractVideoEditView abstractVideoEditView = this.f101362k;
        if (abstractVideoEditView == null) {
            C7573i.m23583a("videoEditView");
        }
        return abstractVideoEditView;
    }

    /* renamed from: I */
    public final void mo30922I() {
        if (C35563c.f93231M.mo93305a(Property.VEExtractFramesAfterRender)) {
            AbstractVideoEditView abstractVideoEditView = this.f101362k;
            if (abstractVideoEditView == null) {
                C7573i.m23583a("videoEditView");
            }
            abstractVideoEditView.setLoadThumbnailDirectly(true);
            AbstractVideoEditView abstractVideoEditView2 = this.f101362k;
            if (abstractVideoEditView2 == null) {
                C7573i.m23583a("videoEditView");
            }
            abstractVideoEditView2.mo97620a();
        }
    }

    /* renamed from: M */
    private final void m124758M() {
        VideoEditViewModel videoEditViewModel = this.f101367p;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        if (videoEditViewModel.mo97724q()) {
            CutVideoViewModel cutVideoViewModel = this.f101376z;
            if (cutVideoViewModel == null) {
                C7573i.m23583a("cutVideoViewModel");
            }
            if (cutVideoViewModel.mo97156h().f101009m) {
                C39193g.m125127a("prop_customized_video");
            }
            C39193g gVar = C39193g.f101577a;
            VideoEditViewModel videoEditViewModel2 = this.f101367p;
            if (videoEditViewModel2 == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            gVar.mo97483b(videoEditViewModel2.mo97721n());
            return;
        }
        CutVideoViewModel cutVideoViewModel2 = this.f101376z;
        if (cutVideoViewModel2 == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        cutVideoViewModel2.mo29069f();
    }

    /* renamed from: N */
    private final void m124759N() {
        View h_ = mo31004h_(R.id.d2p);
        C7573i.m23582a((Object) h_, "requireViewById(R.id.self_adaption_toast)");
        this.f101363l = (TextView) h_;
        View h_2 = mo31004h_(R.id.dx);
        C7573i.m23582a((Object) h_2, "requireViewById(R.id.adaption_toast_layout)");
        this.f101364m = (FrameLayout) h_2;
        CutVideoViewModel cutVideoViewModel = this.f101376z;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.mo97157i() && !C39805en.m127445a()) {
            FrameLayout frameLayout = this.f101364m;
            if (frameLayout == null) {
                C7573i.m23583a("selfAdaptionToastLayout");
            }
            LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                Activity v = mo31015v();
                C7573i.m23582a((Object) v, "requireActivity()");
                marginLayoutParams.bottomMargin = (int) C39575f.m126467a(v, 8.0f);
                FrameLayout frameLayout2 = this.f101364m;
                if (frameLayout2 == null) {
                    C7573i.m23583a("selfAdaptionToastLayout");
                }
                frameLayout2.setLayoutParams(marginLayoutParams);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        CutVideoViewModel cutVideoViewModel2 = this.f101376z;
        if (cutVideoViewModel2 == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        if (!cutVideoViewModel2.mo97157i()) {
            Drawable a = C38501ax.m123066a(0, 1459617792, 0, C23486n.m77122a(2.0d));
            TextView textView = this.f101363l;
            if (textView == null) {
                C7573i.m23583a("selfAdaptionToast");
            }
            textView.setBackground(a);
        }
        AbstractVideoEditView abstractVideoEditView = this.f101362k;
        if (abstractVideoEditView == null) {
            C7573i.m23583a("videoEditView");
        }
        if (abstractVideoEditView != null) {
            ((VEVideoEditViewV2) abstractVideoEditView).setSelfAdaptiontoastAnimListener(new C39086v(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEVideoEditViewV2");
    }

    /* renamed from: J */
    private final void m124755J() {
        Activity activity = this.f33526d_;
        if (activity != null) {
            C0063u a = C0069x.m159a((FragmentActivity) activity).mo147a(VideoEditViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ditViewModel::class.java]");
            this.f101367p = (VideoEditViewModel) a;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                C0063u a2 = C0069x.m159a((FragmentActivity) activity2).mo147a(VEVideoCutterViewModel.class);
                C7573i.m23582a((Object) a2, "ViewModelProviders.of(ac…terViewModel::class.java]");
                this.f101368q = (VEVideoCutterViewModel) a2;
                Activity activity3 = this.f33526d_;
                if (activity3 != null) {
                    JediViewModel a3 = C36113b.m116288a((FragmentActivity) activity3).mo91871a(CutVideoBottomBarViewModel.class);
                    C7573i.m23582a((Object) a3, "JediViewModelProviders.o…BarViewModel::class.java)");
                    this.f101369r = (CutVideoBottomBarViewModel) a3;
                    Activity activity4 = this.f33526d_;
                    if (activity4 != null) {
                        JediViewModel a4 = C36113b.m116288a((FragmentActivity) activity4).mo91871a(CutVideoViewModel.class);
                        C7573i.m23582a((Object) a4, "JediViewModelProviders.o…deoViewModel::class.java)");
                        this.f101376z = (CutVideoViewModel) a4;
                        Activity activity5 = this.f33526d_;
                        if (activity5 != null) {
                            C0063u a5 = C0069x.m159a((FragmentActivity) activity5).mo147a(CutMultiVideoViewModel.class);
                            C7573i.m23582a((Object) a5, "ViewModelProviders.of(ac…deoViewModel::class.java]");
                            this.f101375y = (CutMultiVideoViewModel) a5;
                            Activity activity6 = this.f33526d_;
                            if (activity6 != null) {
                                JediViewModel a6 = C36113b.m116288a((FragmentActivity) activity6).mo91871a(CutVideoEditViewModel.class);
                                C7573i.m23582a((Object) a6, "JediViewModelProviders.o…ditViewModel::class.java]");
                                this.f101370s = (CutVideoEditViewModel) a6;
                                Activity activity7 = this.f33526d_;
                                if (activity7 != null) {
                                    JediViewModel a7 = C36113b.m116288a((FragmentActivity) activity7).mo91871a(CutVideoListViewModel.class);
                                    C7573i.m23582a((Object) a7, "JediViewModelProviders.o…istViewModel::class.java)");
                                    this.f101371t = (CutVideoListViewModel) a7;
                                    Activity activity8 = this.f33526d_;
                                    if (activity8 != null) {
                                        JediViewModel a8 = C36113b.m116288a((FragmentActivity) activity8).mo91871a(CutVideoSpeedViewModel.class);
                                        C7573i.m23582a((Object) a8, "JediViewModelProviders.o…eedViewModel::class.java)");
                                        this.f101372u = (CutVideoSpeedViewModel) a8;
                                        return;
                                    }
                                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                }
                                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: K */
    private final void m124756K() {
        VideoEditViewModel videoEditViewModel = this.f101367p;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        C0043i iVar = this;
        videoEditViewModel.f101836a.observe(iVar, new C39066b(this));
        VideoEditViewModel videoEditViewModel2 = this.f101367p;
        if (videoEditViewModel2 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel2.f101837b.observe(iVar, new C39074j(this));
        VideoEditViewModel videoEditViewModel3 = this.f101367p;
        if (videoEditViewModel3 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel3.f101839d.observe(iVar, new C39079o(this));
        VideoEditViewModel videoEditViewModel4 = this.f101367p;
        if (videoEditViewModel4 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel4.f101838c.observe(iVar, new C39080p(this));
        VideoEditViewModel videoEditViewModel5 = this.f101367p;
        if (videoEditViewModel5 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel5.f101841f.observe(iVar, new C39081q(this));
        VideoEditViewModel videoEditViewModel6 = this.f101367p;
        if (videoEditViewModel6 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel6.f101840e.observe(iVar, new C39082r(this));
        VideoEditViewModel videoEditViewModel7 = this.f101367p;
        if (videoEditViewModel7 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel7.f101842g.observe(iVar, new C39083s(this));
        VideoEditViewModel videoEditViewModel8 = this.f101367p;
        if (videoEditViewModel8 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel8.f101845j.observe(iVar, new C39084t(this));
        VideoEditViewModel videoEditViewModel9 = this.f101367p;
        if (videoEditViewModel9 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel9.f101854s.observe(iVar, new C39085u(this));
        VideoEditViewModel videoEditViewModel10 = this.f101367p;
        if (videoEditViewModel10 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel10.f101846k.observe(iVar, new C39067c(this));
        VideoEditViewModel videoEditViewModel11 = this.f101367p;
        if (videoEditViewModel11 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel11.f101847l.observe(iVar, new C39068d(this));
        VideoEditViewModel videoEditViewModel12 = this.f101367p;
        if (videoEditViewModel12 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel12.f101848m.observe(iVar, new C39069e(this));
        VideoEditViewModel videoEditViewModel13 = this.f101367p;
        if (videoEditViewModel13 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel13.f101843h.observe(iVar, new C39070f(this));
        VideoEditViewModel videoEditViewModel14 = this.f101367p;
        if (videoEditViewModel14 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel14.f101844i.observe(iVar, new C39071g(this));
        CutVideoEditViewModel cutVideoEditViewModel = this.f101370s;
        if (cutVideoEditViewModel == null) {
            C7573i.m23583a("cutVideoEditViewModel");
        }
        mo91869c(cutVideoEditViewModel, C39089l.f101400a, new C11672v(), new C39072h(this));
        CutVideoEditViewModel cutVideoEditViewModel2 = this.f101370s;
        if (cutVideoEditViewModel2 == null) {
            C7573i.m23583a("cutVideoEditViewModel");
        }
        mo91868b(cutVideoEditViewModel2, C39090m.f101401a, new C11672v(), new C39073i(this));
        CutVideoEditViewModel cutVideoEditViewModel3 = this.f101370s;
        if (cutVideoEditViewModel3 == null) {
            C7573i.m23583a("cutVideoEditViewModel");
        }
        mo91869c(cutVideoEditViewModel3, C39091n.f101402a, new C11672v(), new C39075k(this));
        CutVideoEditViewModel cutVideoEditViewModel4 = this.f101370s;
        if (cutVideoEditViewModel4 == null) {
            C7573i.m23583a("cutVideoEditViewModel");
        }
        mo91869c(cutVideoEditViewModel4, C39092o.f101403a, new C11672v(), new C39076l(this));
        CutVideoEditViewModel cutVideoEditViewModel5 = this.f101370s;
        if (cutVideoEditViewModel5 == null) {
            C7573i.m23583a("cutVideoEditViewModel");
        }
        mo91868b(cutVideoEditViewModel5, C39093p.f101404a, new C11672v(), new C39077m(this));
        CutVideoEditViewModel cutVideoEditViewModel6 = this.f101370s;
        if (cutVideoEditViewModel6 == null) {
            C7573i.m23583a("cutVideoEditViewModel");
        }
        cutVideoEditViewModel6.mo96985h().observe(iVar, new C39078n(this));
    }

    /* renamed from: L */
    private final void m124757L() {
        boolean z;
        CutVideoViewModel cutVideoViewModel = this.f101376z;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        C38892aa h = cutVideoViewModel.mo97156h();
        String str = h.f100998b;
        ArrayList<MediaModel> arrayList = h.f100997a;
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence) || !arrayList.isEmpty()) {
            if (C6399b.m19946v()) {
                AbstractVideoEditView abstractVideoEditView = this.f101362k;
                if (abstractVideoEditView == null) {
                    C7573i.m23583a("videoEditView");
                }
                abstractVideoEditView.setMaxVideoLength(60000);
            }
            if (h.f100999c) {
                AbstractVideoEditView abstractVideoEditView2 = this.f101362k;
                if (abstractVideoEditView2 == null) {
                    C7573i.m23583a("videoEditView");
                }
                abstractVideoEditView2.setMinVideoLength(1000);
                AbstractVideoEditView abstractVideoEditView3 = this.f101362k;
                if (abstractVideoEditView3 == null) {
                    C7573i.m23583a("videoEditView");
                }
                abstractVideoEditView3.setMaxVideoLength(10000);
            }
            if (h.f101009m) {
                AbstractVideoEditView abstractVideoEditView4 = this.f101362k;
                if (abstractVideoEditView4 == null) {
                    C7573i.m23583a("videoEditView");
                }
                abstractVideoEditView4.setMaxVideoLength(h.f101010n);
            }
            AbstractVideoEditView abstractVideoEditView5 = this.f101362k;
            if (abstractVideoEditView5 == null) {
                C7573i.m23583a("videoEditView");
            }
            abstractVideoEditView5.setExtractFramesInRoughMode(true);
            if (!TextUtils.isEmpty(charSequence)) {
                AbstractVideoEditView abstractVideoEditView6 = this.f101362k;
                if (abstractVideoEditView6 == null) {
                    C7573i.m23583a("videoEditView");
                }
                Activity activity = this.f33526d_;
                if (activity != null) {
                    FragmentActivity fragmentActivity = (FragmentActivity) activity;
                    CutMultiVideoViewModel cutMultiVideoViewModel = this.f101375y;
                    if (cutMultiVideoViewModel == null) {
                        C7573i.m23583a("cutMultiVideoViewModel");
                    }
                    z = abstractVideoEditView6.mo97632a(fragmentActivity, cutMultiVideoViewModel, str);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
            } else {
                AbstractVideoEditView abstractVideoEditView7 = this.f101362k;
                if (abstractVideoEditView7 == null) {
                    C7573i.m23583a("videoEditView");
                }
                Activity activity2 = this.f33526d_;
                if (activity2 != null) {
                    FragmentActivity fragmentActivity2 = (FragmentActivity) activity2;
                    CutMultiVideoViewModel cutMultiVideoViewModel2 = this.f101375y;
                    if (cutMultiVideoViewModel2 == null) {
                        C7573i.m23583a("cutMultiVideoViewModel");
                    }
                    z = abstractVideoEditView7.mo97633a(fragmentActivity2, cutMultiVideoViewModel2, (List<MediaModel>) arrayList);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
            }
            if (!z) {
                CutVideoViewModel cutVideoViewModel2 = this.f101376z;
                if (cutVideoViewModel2 == null) {
                    C7573i.m23583a("cutVideoViewModel");
                }
                cutVideoViewModel2.mo29069f();
                return;
            }
            CutVideoEditViewModel cutVideoEditViewModel = this.f101370s;
            if (cutVideoEditViewModel == null) {
                C7573i.m23583a("cutVideoEditViewModel");
            }
            AbstractVideoEditView abstractVideoEditView8 = this.f101362k;
            if (abstractVideoEditView8 == null) {
                C7573i.m23583a("videoEditView");
            }
            cutVideoEditViewModel.f100834d = abstractVideoEditView8.getEditState();
            CutVideoViewModel cutVideoViewModel3 = this.f101376z;
            if (cutVideoViewModel3 == null) {
                C7573i.m23583a("cutVideoViewModel");
            }
            if (!cutVideoViewModel3.mo97157i()) {
                m124758M();
            }
            this.f101374w = h.f101011o;
            this.f101373v = h.f101008l;
            return;
        }
        CutVideoViewModel cutVideoViewModel4 = this.f101376z;
        if (cutVideoViewModel4 == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        cutVideoViewModel4.mo29069f();
    }

    /* renamed from: a */
    public static final /* synthetic */ CutVideoEditViewModel m124761a(C39064k kVar) {
        CutVideoEditViewModel cutVideoEditViewModel = kVar.f101370s;
        if (cutVideoEditViewModel == null) {
            C7573i.m23583a("cutVideoEditViewModel");
        }
        return cutVideoEditViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ VEVideoCutterViewModel m124762b(C39064k kVar) {
        VEVideoCutterViewModel vEVideoCutterViewModel = kVar.f101368q;
        if (vEVideoCutterViewModel == null) {
            C7573i.m23583a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ CutVideoBottomBarViewModel m124763c(C39064k kVar) {
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = kVar.f101369r;
        if (cutVideoBottomBarViewModel == null) {
            C7573i.m23583a("bottomBarViewModel");
        }
        return cutVideoBottomBarViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ VideoEditViewModel m124764d(C39064k kVar) {
        VideoEditViewModel videoEditViewModel = kVar.f101367p;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ CutVideoListViewModel m124765e(C39064k kVar) {
        CutVideoListViewModel cutVideoListViewModel = kVar.f101371t;
        if (cutVideoListViewModel == null) {
            C7573i.m23583a("cutVideoListViewModel");
        }
        return cutVideoListViewModel;
    }

    /* renamed from: f */
    public static final /* synthetic */ View m124766f(C39064k kVar) {
        View view = kVar.f101365n;
        if (view == null) {
            C7573i.m23583a("slideHintView");
        }
        return view;
    }

    /* renamed from: g */
    public static final /* synthetic */ TextView m124767g(C39064k kVar) {
        TextView textView = kVar.f101363l;
        if (textView == null) {
            C7573i.m23583a("selfAdaptionToast");
        }
        return textView;
    }

    /* renamed from: h */
    public static final /* synthetic */ CutVideoSpeedViewModel m124768h(C39064k kVar) {
        CutVideoSpeedViewModel cutVideoSpeedViewModel = kVar.f101372u;
        if (cutVideoSpeedViewModel == null) {
            C7573i.m23583a("speedViewModel");
        }
        return cutVideoSpeedViewModel;
    }

    /* renamed from: i */
    public static final /* synthetic */ FrameLayout m124769i(C39064k kVar) {
        FrameLayout frameLayout = kVar.f101364m;
        if (frameLayout == null) {
            C7573i.m23583a("selfAdaptionToastLayout");
        }
        return frameLayout;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        m124756K();
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140496a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        if (C35563c.f93231M.mo93305a(Property.EnableUploadVideoSlideAutoJust)) {
            View inflate = layoutInflater.inflate(R.layout.ai2, viewGroup, false);
            C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…o_just, container, false)");
            return inflate;
        }
        View inflate2 = layoutInflater.inflate(R.layout.ai1, viewGroup, false);
        C7573i.m23582a((Object) inflate2, "inflater.inflate(R.layou…o_edit, container, false)");
        return inflate2;
    }

    /* renamed from: b */
    public final <S extends C11670t, A> void mo91868b(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectNonNullSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140501a(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11670t, A> void mo91869c(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44403b<? extends A>> lVar, C11672v<C11675y<C44403b<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140504b(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11670t, A> void mo91870d(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44413i<? extends A>> lVar, C11672v<C11675y<C44413i<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeMultiEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140507c(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140510d(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(qVar, "subscriber");
        return C44397a.m140498a(this, jediViewModel, lVar, lVar2, vVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C44397a.m140497a((C44396a) this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B, C, D> C7321c mo29065a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(lVar3, "prop3");
        C7573i.m23587b(lVar4, "prop4");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(sVar, "subscriber");
        return C44397a.m140499a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
    }
}
