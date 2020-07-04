package com.p280ss.android.ugc.aweme.main.follow;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.support.p022v4.app.Fragment;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.setting.C37562ao;
import com.p280ss.android.ugc.aweme.setting.C37562ao.C37566a;
import com.p280ss.android.ugc.aweme.setting.model.AwemeSettings;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.main.follow.LiveBroadcastWarn */
public class LiveBroadcastWarn implements C0042h, C37566a {

    /* renamed from: a */
    public View f85993a;

    /* renamed from: b */
    private Context f85994b;

    /* renamed from: c */
    private boolean f85995c;

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        C37562ao.m120324a().mo94854b((C37566a) this);
    }

    @C0054q(mo125a = Event.ON_STOP)
    public void onStop() {
        mo84709a(null);
    }

    /* renamed from: b */
    private void m106662b() {
        Context context = this.f85994b;
        if (context != null) {
            this.f85993a.setVisibility(0);
            this.f85993a.setLayerType(2, null);
            Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.bp);
            loadAnimation.setRepeatMode(2);
            loadAnimation.setRepeatCount(-1);
            loadAnimation.setAnimationListener(new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    LiveBroadcastWarn.this.f85993a.setLayerType(0, null);
                }
            });
            this.f85993a.startAnimation(loadAnimation);
        }
    }

    /* renamed from: a */
    public final void mo84710a() {
        if (!((Boolean) SharePrefCache.inst().getHasAlreadyShowBubble().mo59877d()).booleanValue() && !TimeLockRuler.isInTeenagerModeNewVersion()) {
            C1592h.m7848a(2000).mo6876a((C1591g<TResult, TContinuationResult>) new C33011a<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* renamed from: a */
    public final void mo84112a(AwemeSettings awemeSettings) {
        this.f85995c = awemeSettings.newAnchorShowBubble;
        mo84710a();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public Object mo84709a(C1592h<Void> hVar) {
        if (this.f85993a != null) {
            this.f85993a.setVisibility(8);
            this.f85993a.setBackground(null);
            this.f85993a.clearAnimation();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Object mo84711b(C1592h<Void> hVar) {
        if (!((Boolean) SharePrefCache.inst().getNewAnchorShowBubble().mo59877d()).booleanValue() && !this.f85995c) {
            return null;
        }
        this.f85993a.setBackgroundResource(R.drawable.a42);
        m106662b();
        SharePrefCache.inst().getHasAlreadyShowBubble().mo59871a(Boolean.valueOf(true));
        C1592h.m7848a((long) DouPlusShareGuideExperiment.MIN_VALID_DURATION).mo6876a((C1591g<TResult, TContinuationResult>) new C33012b<TResult,TContinuationResult>(this), C1592h.f5958b);
        return null;
    }

    public LiveBroadcastWarn(Fragment fragment, View view) {
        this.f85993a = view;
        this.f85994b = fragment.getContext();
        C37562ao.m120324a().mo94851a((C37566a) this);
    }
}
