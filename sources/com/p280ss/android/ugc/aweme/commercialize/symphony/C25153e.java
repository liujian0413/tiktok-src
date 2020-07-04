package com.p280ss.android.ugc.aweme.commercialize.symphony;

import android.content.Context;
import android.support.p022v4.app.Fragment;
import android.view.View;
import android.view.View.OnTouchListener;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p073ad.symphony.p074a.p075a.C2087d;
import com.bytedance.p073ad.symphony.p079d.p080a.C2134b;
import com.p280ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout.C25110b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.adapter.C28128aa;
import com.p280ss.android.ugc.aweme.feed.adapter.C28155b;
import com.p280ss.android.ugc.aweme.feed.event.C28306ab;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28322e;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.metrics.C33271m;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.e */
public final class C25153e extends C28155b implements C2134b, C25110b {

    /* renamed from: a */
    public final int f66355a;

    /* renamed from: b */
    public final View f66356b;

    /* renamed from: c */
    public final C28343z<C28318an> f66357c;

    /* renamed from: d */
    public final String f66358d;

    /* renamed from: e */
    public final OnTouchListener f66359e;

    /* renamed from: f */
    public final Fragment f66360f;

    /* renamed from: g */
    public final int f66361g;

    /* renamed from: k */
    private Aweme f66362k;

    /* renamed from: l */
    private boolean f66363l;

    /* renamed from: m */
    private final Context f66364m;

    public final void ar_() {
    }

    public final void as_() {
    }

    public final void at_() {
    }

    /* renamed from: d */
    public final void mo56928d() {
    }

    /* renamed from: g */
    public final int mo65710g() {
        return 3;
    }

    /* renamed from: h */
    public final Aweme mo65711h() {
        return this.f66362k;
    }

    /* renamed from: j */
    public final void mo65713j() {
        this.f66362k = null;
    }

    /* renamed from: m */
    public final C28128aa mo65716m() {
        return null;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
    }

    /* renamed from: f */
    public final int mo65709f() {
        Aweme aweme = this.f66362k;
        if (aweme != null) {
            return aweme.getAwemeType();
        }
        return 0;
    }

    /* renamed from: i */
    public final void mo65712i() {
        View view = this.f66356b;
        if (view != null) {
            ((SymphonyVideoView) view).mo64617c();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView");
    }

    /* renamed from: k */
    public final void mo65714k() {
        if (this.f66363l) {
            View view = this.f66356b;
            if (view != null) {
                C25155g.m82754a((SymphonyVideoView) view);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView");
        }
    }

    /* renamed from: l */
    public final void mo65715l() {
        this.f66363l = false;
        View view = this.f66356b;
        if (view != null) {
            SymphonyVideoView symphonyVideoView = (SymphonyVideoView) view;
            symphonyVideoView.mo65672a();
            if (C7573i.m23585a((Object) C25155g.m82753a(), (Object) symphonyVideoView)) {
                C25155g.m82754a(null);
            }
            C42961az.m136380a(new C25156h());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView");
    }

    /* renamed from: e */
    public final void mo65642e() {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (C6399b.m19947w()) {
            MobClick labelName = MobClick.obtain().setEventName("dislike").setLabelName("tap");
            Aweme aweme = this.f66362k;
            if (aweme != null) {
                str3 = aweme.getAid();
            } else {
                str3 = null;
            }
            C6907h.onEvent(labelName.setValue(str3));
        }
        C33271m a = new C33271m().mo85286a(this.f66358d);
        Aweme aweme2 = this.f66362k;
        if (aweme2 != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        C33271m b = a.mo85287b(str);
        Aweme aweme3 = this.f66362k;
        if (aweme3 != null) {
            str2 = aweme3.getAuthorUid();
        } else {
            str2 = null;
        }
        C33271m d = b.mo85288c(str2).mo85289d(this.f66358d);
        Aweme aweme4 = this.f66362k;
        if (aweme4 != null) {
            str4 = aweme4.getRequestId();
        }
        d.mo85290e(str4).mo85252e();
        C42961az.m136380a(new C28322e(this.f66362k));
    }

    /* renamed from: a */
    public final void mo65708a(Aweme aweme) {
        this.f66362k = aweme;
    }

    /* renamed from: a */
    public final void mo65707a(int i) {
        this.f66363l = true;
        View view = this.f66356b;
        if (view != null) {
            SymphonyVideoView symphonyVideoView = (SymphonyVideoView) view;
            C2087d a = SymphonyAdManager.m82664a().mo65645a(mo65711h());
            C7573i.m23582a((Object) a, "SymphonyAdManager.getInstance().getNativeAd(aweme)");
            Aweme h = mo65711h();
            String af = C25352e.m83334af(mo65711h());
            C7573i.m23582a((Object) af, "AdDataUtils.getSymphonyMusicDesc(aweme)");
            String ag = C25352e.m83335ag(mo65711h());
            C7573i.m23582a((Object) ag, "AdDataUtils.getSymphonyLabel(aweme)");
            symphonyVideoView.mo65673a(a, h, af, ag, this, this, C25352e.m83336ah(mo65711h()));
            C25155g.m82754a(symphonyVideoView);
            C42961az.m136380a(new C25156h());
            if (this.f66364m instanceof MainActivity) {
                C42961az.m136380a(new C28306ab(this.f66362k));
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView");
    }

    public C25153e(Context context, int i, View view, C28343z<C28318an> zVar, String str, OnTouchListener onTouchListener, Fragment fragment, int i2) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(onTouchListener, "tapTouchListener");
        C7573i.m23587b(fragment, "fragment");
        this.f66364m = context;
        this.f66355a = i;
        this.f66356b = view;
        this.f66357c = zVar;
        this.f66358d = str;
        this.f66359e = onTouchListener;
        this.f66360f = fragment;
        this.f66361g = i2;
    }
}
