package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p022v4.view.animation.FastOutSlowInInterpolator;
import android.support.p022v4.view.animation.LinearOutSlowInInterpolator;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.C2412a.C2413a;
import com.bytedance.android.live.broadcast.api.C2412a.C2414b;
import com.bytedance.android.live.broadcast.api.model.C2438c;
import com.bytedance.android.live.broadcast.api.p127c.C2429a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.C4426ar;
import com.bytedance.android.livesdk.chatroom.interact.C4487am;
import com.bytedance.android.livesdk.chatroom.interact.LinkInRoomPkWidget;
import com.bytedance.android.livesdk.chatroom.interact.LinkInRoomVideoAnchorWidget;
import com.bytedance.android.livesdk.chatroom.interact.LinkInRoomVideoGuestWidget;
import com.bytedance.android.livesdk.chatroom.p220ui.AbsInteractionFragment.C5066c;
import com.bytedance.android.livesdk.chatroom.viewmodule.FullVideoButtonWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget.C5436a;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkCrossRoomWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkInRoomAudioWidget;
import com.bytedance.android.livesdk.commerce.C5842c;
import com.bytedance.android.livesdk.coupon.LiveCouponWidget;
import com.bytedance.android.livesdk.honor.HonorUpgradeNotifyWidget;
import com.bytedance.android.livesdk.message.model.C8497aw;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.sharedpref.Properties;
import com.bytedance.android.livesdkapi.IPropertyCache.C9283a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.Widget;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.PortraitInteractionFragment */
public class PortraitInteractionFragment extends AbsInteractionFragment implements C2413a, C2414b, C5066c {

    /* renamed from: H */
    public View f15144H;

    /* renamed from: I */
    public C4487am f15145I;

    /* renamed from: J */
    public C2429a f15146J;

    /* renamed from: K */
    public boolean f15147K;

    /* renamed from: L */
    private View f15148L;

    /* renamed from: M */
    private View f15149M;

    /* renamed from: N */
    private View f15150N;

    /* renamed from: O */
    private TextView f15151O;

    /* renamed from: P */
    private AnimationSet f15152P;

    /* renamed from: Q */
    private AnimationSet f15153Q;

    /* renamed from: R */
    private int f15154R;

    /* renamed from: S */
    private LinkControlWidget f15155S;

    /* renamed from: T */
    private FullVideoButtonWidget f15156T;

    /* renamed from: U */
    private FrameLayout f15157U;

    /* renamed from: V */
    private View f15158V;

    /* renamed from: h */
    public final View mo13131h() {
        return this.f15150N;
    }

    /* renamed from: f */
    public final void mo10484f() {
        if (mo13138o()) {
            m16720z();
        }
    }

    /* renamed from: j */
    public final void mo13133j() {
        if (this.f15155S != null) {
            this.f14470t.add(0, this.f15155S);
        }
        super.mo13133j();
    }

    public void onDestroy() {
        if (this.f15144H != null) {
            this.f15144H.clearAnimation();
        }
        super.onDestroy();
    }

    /* renamed from: g */
    public final boolean mo13130g() {
        if (getContext() == null || getContext().getResources().getConfiguration().orientation == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final void mo13220w() {
        if (this.f15158V != null) {
            this.f15158V.findViewById(R.id.nr).setVisibility(8);
        }
    }

    /* renamed from: x */
    public final void mo13400x() {
        if (this.f15158V != null) {
            this.f15158V.findViewById(R.id.nr).setVisibility(0);
        }
    }

    /* renamed from: A */
    private void m16717A() {
        if (this.f15150N != null && this.f15150N.getVisibility() == 0) {
            ((MarginLayoutParams) this.f15150N.getLayoutParams()).topMargin = this.f14457g - ((int) C9738o.m28708b(getContext(), 44.0f));
        }
    }

    /* renamed from: y */
    private void m16719y() {
        if (this.f14455e && this.f14457g > 0 && mo13138o()) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f14463m.getLayoutParams();
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = this.f14457g + ((int) C9738o.m28708b(getContext(), 40.0f));
            this.f14472v.lambda$put$1$DataCenter("cmd_update_sticker_position", new C4426ar(C9738o.m28709b(getContext()) - marginLayoutParams.topMargin));
            if (mo13138o()) {
                C8497aw awVar = new C8497aw();
                awVar.f23284a = (C9738o.m28709b(getContext()) - marginLayoutParams.topMargin) + ((int) getContext().getResources().getDimension(R.dimen.pp));
                this.f14472v.lambda$put$1$DataCenter("cmd_normal_gift_layout_bottom_margin_update", Integer.valueOf(awVar.f23284a));
                C8497aw awVar2 = new C8497aw();
                awVar2.f23284a = C9738o.m28709b(getContext()) - marginLayoutParams.topMargin;
                this.f14472v.lambda$put$1$DataCenter("cmd_enter_widget_layout_change", awVar2);
            }
            m16717A();
            StringBuilder sb = new StringBuilder("height: MATCH_PARENT, topMargin: ");
            sb.append(marginLayoutParams.topMargin);
            m16247a("update_video_direction", sb.toString());
        }
    }

    /* renamed from: z */
    private void m16720z() {
        boolean z;
        if (!mo13157q().isUsingCamera || TTLiveSDKContext.getHostService().mo22361b().mo23190b().mo22767a(Properties.HAS_SHOW_FILTER_GUIDE)) {
            z = false;
        } else {
            z = true;
        }
        if (!z || getView() == null) {
            this.f15144H.setVisibility(8);
            return;
        }
        View findViewById = getView().findViewById(R.id.eco);
        View findViewById2 = getView().findViewById(R.id.ecp);
        TTLiveSDKContext.getHostService().mo22361b().mo23190b().mo22766a((C9283a) Properties.HAS_SHOW_FILTER_GUIDE, true);
        this.f15144H.setVisibility(0);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
        }
        this.f15151O.setText(getString(R.string.fct));
        this.f15144H.setClickable(true);
        this.f15144H.setOnClickListener(new C5285dr(this, findViewById, findViewById2));
    }

    /* renamed from: a */
    public final void mo10475a(C2429a aVar) {
        this.f15146J = aVar;
    }

    /* renamed from: a */
    public final void mo10476a(C4487am amVar) {
        this.f15145I = amVar;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m16717A();
    }

    /* renamed from: a */
    public final void mo13399a(String str) {
        if (this.f15155S != null) {
            this.f15155S.mo13809a(str);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15154R = C3358ac.m12523c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo13121b(float f) {
        if (f > 0.0f) {
            if (mo13157q().isUsingCamera) {
                C9097a.m27146a().mo22267a((Object) new C2438c(1));
            }
        } else if (mo13157q().isUsingCamera) {
            C9097a.m27146a().mo22267a((Object) new C2438c(2));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13112a(View view) {
        super.mo13112a(view);
        this.f15158V = view;
        if (this.f15147K) {
            mo13220w();
        } else {
            mo13400x();
        }
        view.findViewById(R.id.byb).setVisibility(0);
        this.f15148L = view.findViewById(R.id.dw);
        this.f15144H = view.findViewById(R.id.akn);
        this.f15149M = view.findViewById(R.id.brj);
        this.f15151O = (TextView) view.findViewById(R.id.ako);
        this.f14463m = view.findViewById(R.id.byb);
        this.f15150N = view.findViewById(R.id.apq);
        this.f15157U = (FrameLayout) view.findViewById(R.id.a04);
    }

    /* renamed from: e */
    private AnimationSet m16718e(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int width = (this.f15154R - this.f15151O.getWidth()) / 2;
        AnimationSet animationSet = new AnimationSet(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new LinearOutSlowInInterpolator());
        alphaAnimation.setDuration(300);
        if (z) {
            f = (float) (-width);
        } else {
            f = (float) width;
        }
        float f6 = 50.0f;
        if (z) {
            f2 = -50.0f;
        } else {
            f2 = 50.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(f, f2, 0.0f, 0.0f);
        translateAnimation.setInterpolator(new LinearOutSlowInInterpolator());
        translateAnimation.setDuration(300);
        if (z) {
            f3 = -50.0f;
        } else {
            f3 = 50.0f;
        }
        if (z) {
            f4 = 50.0f;
        } else {
            f4 = -50.0f;
        }
        TranslateAnimation translateAnimation2 = new TranslateAnimation(f3, f4, 0.0f, 0.0f);
        translateAnimation2.setInterpolator(new LinearInterpolator());
        translateAnimation2.setStartOffset(300);
        translateAnimation2.setDuration(200);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setStartOffset(500);
        alphaAnimation2.setInterpolator(new FastOutSlowInInterpolator());
        alphaAnimation2.setDuration(300);
        if (!z) {
            f6 = -50.0f;
        }
        if (z) {
            f5 = (float) width;
        } else {
            f5 = (float) (-width);
        }
        TranslateAnimation translateAnimation3 = new TranslateAnimation(f6, f5, 0.0f, 0.0f);
        translateAnimation3.setStartOffset(500);
        translateAnimation3.setInterpolator(new FastOutSlowInInterpolator());
        translateAnimation3.setDuration(300);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(translateAnimation2);
        animationSet.addAnimation(alphaAnimation2);
        animationSet.addAnimation(translateAnimation3);
        animationSet.setAnimationListener(new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                PortraitInteractionFragment.this.f15144H.setVisibility(4);
            }

            public final void onAnimationStart(Animation animation) {
                PortraitInteractionFragment.this.f15144H.setVisibility(0);
            }
        });
        return animationSet;
    }

    /* renamed from: a */
    public final void mo8870a(boolean z) {
        int i;
        View view = this.f15149M;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo13174a(long j, long j2) {
        if (mo13137n() == null || mo13137n().getStreamType() != LiveMode.AUDIO) {
            mo10474a((float) j);
        } else {
            mo10474a((float) j2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13113a(final View view, Bundle bundle) {
        if (mo13157q() == LiveMode.VIDEO || mo13157q() == LiveMode.AUDIO) {
            this.f15155S = new LinkControlWidget(new C5436a() {
                /* renamed from: a */
                public final void mo13402a(Widget widget) {
                    PortraitInteractionFragment.this.f14475y.unload(widget);
                }

                /* renamed from: a */
                public final Widget mo13401a(int i) {
                    switch (i) {
                        case 0:
                            LinkInRoomVideoAnchorWidget linkInRoomVideoAnchorWidget = new LinkInRoomVideoAnchorWidget(PortraitInteractionFragment.this.f15145I);
                            if (PortraitInteractionFragment.this.f14453c && C9290a.f25466a) {
                                linkInRoomVideoAnchorWidget.f12974d = PortraitInteractionFragment.this;
                            }
                            PortraitInteractionFragment.this.f14475y.load(R.id.c52, linkInRoomVideoAnchorWidget, false);
                            return linkInRoomVideoAnchorWidget;
                        case 1:
                            LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget = new LinkInRoomVideoGuestWidget((FrameLayout) view.findViewById(R.id.b27));
                            PortraitInteractionFragment.this.f14475y.load(R.id.c52, linkInRoomVideoGuestWidget, false);
                            return linkInRoomVideoGuestWidget;
                        case 2:
                            LinkCrossRoomWidget linkCrossRoomWidget = new LinkCrossRoomWidget(PortraitInteractionFragment.this.f15145I, (FrameLayout) view.findViewById(R.id.b27));
                            if (PortraitInteractionFragment.this.f14453c && C9290a.f25466a) {
                                linkCrossRoomWidget.f16033a = PortraitInteractionFragment.this;
                            }
                            PortraitInteractionFragment.this.f14475y.load(R.id.cbw, linkCrossRoomWidget, false);
                            return linkCrossRoomWidget;
                        case 3:
                            LinkInRoomAudioWidget linkInRoomAudioWidget = new LinkInRoomAudioWidget(PortraitInteractionFragment.this.f15146J, PortraitInteractionFragment.this.mo13158r());
                            if (PortraitInteractionFragment.this.f14453c && C9290a.f25466a) {
                                linkInRoomAudioWidget.f16064f = PortraitInteractionFragment.this;
                            }
                            PortraitInteractionFragment.this.f14475y.load(R.id.c52, linkInRoomAudioWidget, false);
                            return linkInRoomAudioWidget;
                        case 4:
                            LinkInRoomPkWidget linkInRoomPkWidget = new LinkInRoomPkWidget();
                            PortraitInteractionFragment.this.f14475y.load(R.id.b22, linkInRoomPkWidget, false);
                            return linkInRoomPkWidget;
                        default:
                            return null;
                    }
                }
            });
        }
        this.f14475y.load(R.id.b2a, this.f15155S);
        Bundle arguments = getArguments();
        if (arguments != null && !arguments.getBoolean("live.intent.extra.EXTRA_NO_FULL_VIDEO_BTN", false)) {
            if (!mo13156p() && mo13137n() != null && !mo13137n().isStar() && (mo13137n().isThirdParty || mo13137n().isScreenshot)) {
                this.f15156T = new FullVideoButtonWidget();
                this.f15150N.setVisibility(0);
            }
            this.f14475y.load(R.id.apq, this.f15156T);
        }
        this.f14475y.load((int) R.id.aw5, HonorUpgradeNotifyWidget.class);
        if (C5842c.m18302a(this.f14378a) && !mo13156p()) {
            C9738o.m28712b(view.findViewById(R.id.bo1), 0);
            this.f14475y.load((int) R.id.bo1, LiveCouponWidget.class);
        }
        if (this.f14378a != null) {
            this.f14378a.isOfficial();
        }
    }

    /* renamed from: a */
    public final void mo8871a(String str, boolean z) {
        if (mo13138o() && !TextUtils.isEmpty(str)) {
            this.f15151O.setText(str);
            if (z) {
                if (this.f15152P == null) {
                    this.f15152P = m16718e(true);
                } else {
                    this.f15144H.clearAnimation();
                }
                this.f15144H.startAnimation(this.f15152P);
                return;
            }
            if (this.f15153Q == null) {
                this.f15153Q = m16718e(false);
            } else {
                this.f15144H.clearAnimation();
            }
            this.f15144H.startAnimation(this.f15153Q);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13119a(boolean z, int i) {
        super.mo13119a(z, i);
        if (this.f14462l != null && z) {
            mo13134k();
        }
        if (this.f14463m != null) {
            m16719y();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LayoutInflater.from(getContext()).inflate(R.layout.aqo, viewGroup, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13398a(View view, View view2, View view3) {
        this.f15144H.setVisibility(8);
        if (view != null) {
            view.setVisibility(8);
        }
        if (view2 != null) {
            view2.setVisibility(8);
        }
        this.f15144H.setClickable(false);
    }
}
