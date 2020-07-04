package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.Lifecycle.Event;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.rxutils.autodispose.C3233a;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3246ae;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3384d;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.event.C4409aa;
import com.bytedance.android.livesdk.chatroom.p220ui.C5302dx;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.chatroom.utils.C5352j;
import com.bytedance.android.livesdk.chatroom.utils.C5357o;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.bytedance.android.livesdk.utils.p426b.C9057b;
import com.bytedance.android.livesdkapi.p452h.C9420h;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;
import p346io.reactivex.p347b.C7321c;

public class LiveDrawerEntranceWidget extends LiveRecyclableWidget implements C0053p<KVData> {

    /* renamed from: b */
    public static boolean f16157b = true;

    /* renamed from: f */
    private static int f16158f = 30;

    /* renamed from: a */
    public View f16159a;

    /* renamed from: c */
    public View f16160c;

    /* renamed from: d */
    private ObjectAnimator f16161d;

    /* renamed from: e */
    private LottieAnimationView f16162e;

    /* renamed from: g */
    private float f16163g;

    /* renamed from: h */
    private float f16164h;

    /* renamed from: i */
    private C7321c f16165i;

    /* renamed from: j */
    private C7321c f16166j;

    /* renamed from: k */
    private HSImageView f16167k;

    /* renamed from: l */
    private HSImageView f16168l;

    /* renamed from: m */
    private HSImageView f16169m;

    /* renamed from: n */
    private PopupWindow f16170n;

    /* renamed from: o */
    private AnimatorSet f16171o;

    /* renamed from: p */
    private boolean f16172p;

    public int getLayoutId() {
        return R.layout.avo;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void mo13895c() {
        if (this.f16162e != null) {
            this.f16162e.mo7085f();
        }
        if (this.f16165i != null) {
            this.f16165i.dispose();
        }
        if (this.f16166j != null) {
            this.f16166j.dispose();
        }
    }

    /* renamed from: f */
    private void m17628f() {
        if (!TextUtils.equals((String) C8946b.f24460bn.mo22117a(), "result") && !this.f16172p) {
            C8946b.f24460bn.mo22118a("result");
            m17629g();
        }
    }

    /* renamed from: g */
    private void m17629g() {
        if (this.f16170n == null || !this.f16170n.isShowing()) {
            m17630h();
            if (this.f16160c != null) {
                m17632j();
            }
        }
    }

    /* renamed from: a */
    public final void mo13891a() {
        if (this.f16171o != null) {
            this.f16171o.cancel();
        }
        this.f16160c.clearAnimation();
        C5663dg.m18035a(this.f16170n);
    }

    public void onUnload() {
        this.dataCenter.removeObserver(this);
        mo13895c();
        if (this.f16161d != null) {
            this.f16161d.cancel();
            this.f16161d = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void mo13893b() {
        if (this.f16161d != null) {
            this.f16161d.cancel();
        }
        this.f16161d = ObjectAnimator.ofFloat(this.f16159a, "translationX", new float[]{C9051ar.m27035b(getContext(), -64.0f), this.f16163g}).setDuration((long) this.f16164h);
        this.f16161d.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationCancel(Animator animator) {
                C9738o.m28712b(LiveDrawerEntranceWidget.this.f16159a, 8);
            }

            public final void onAnimationEnd(Animator animator) {
                C9738o.m28712b(LiveDrawerEntranceWidget.this.f16159a, 8);
            }

            public final void onAnimationStart(Animator animator) {
                C9738o.m28712b(LiveDrawerEntranceWidget.this.f16159a, 0);
                LiveDrawerEntranceWidget.f16157b = false;
            }
        });
        this.f16161d.start();
    }

    /* renamed from: h */
    private void m17630h() {
        if (this.f16160c == null || this.f16170n == null) {
            this.f16160c = LayoutInflater.from(getContext()).inflate(R.layout.awr, this.containerView, false);
            this.f16160c.setVisibility(4);
            this.f16167k = (HSImageView) this.f16160c.findViewById(R.id.azc);
            this.f16168l = (HSImageView) this.f16160c.findViewById(R.id.azd);
            this.f16169m = (HSImageView) this.f16160c.findViewById(R.id.b00);
            m17631i();
            this.f16160c.setVisibility(0);
            this.f16170n = new PopupWindow(this.f16160c, -2, -2, false);
            this.f16170n.setBackgroundDrawable(null);
            this.f16170n.setFocusable(true);
            this.f16170n.setOutsideTouchable(true);
            this.f16160c.setOnClickListener(new C5661de(this));
        }
    }

    /* renamed from: i */
    private void m17631i() {
        List a = C5357o.m17074a();
        if (a != null && a.size() > 2) {
            int[] a2 = C5302dx.m16975a(0, a.size() - 1, 3);
            if (a2 != null) {
                C5343e.m17040a(this.f16167k, (String) a.get(a2[0]));
                C5343e.m17040a(this.f16168l, (String) a.get(a2[1]));
                C5343e.m17040a(this.f16169m, (String) a.get(a2[2]));
            }
        }
    }

    /* renamed from: j */
    private void m17632j() {
        if (this.f16160c != null && this.f16170n != null) {
            int b = (int) C9051ar.m27035b(getContext(), -138.0f);
            int b2 = (int) C9051ar.m27035b(getContext(), -40.0f);
            this.f16171o = new AnimatorSet();
            this.f16160c.clearAnimation();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16160c, "scaleX", new float[]{0.8f, 1.0f, 1.0f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f16160c, "scaleY", new float[]{0.8f, 1.0f, 1.0f});
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f16160c, "alpha", new float[]{0.0f, 1.0f, 1.0f});
            this.f16160c.setPivotX((float) (C3358ac.m12523c() - C3358ac.m12510a(66.0f)));
            this.f16160c.setPivotY((float) (this.f16160c.getHeight() / 2));
            this.f16171o.setDuration(300);
            this.f16171o.play(ofFloat).with(ofFloat2).with(ofFloat3);
            this.f16171o.start();
            this.f16171o.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ((C3245ad) C7492s.m23301b(LiveDrawerEntranceWidget.this).mo19320e(3000, TimeUnit.MILLISECONDS).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19297a((C7494t<T, ? extends R>) LiveDrawerEntranceWidget.this.autoDispose())).mo10183a(C5662df.f16737a, C3303k.m12377b());
                    LiveDrawerEntranceWidget.this.f16160c.setLayerType(0, null);
                }
            });
            this.f16170n.showAsDropDown(this.contentView, b, b2);
            this.f16160c.setLayerType(2, null);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m17625a(Long l) throws Exception {
        f16158f--;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (isViewValid() && kVData != null && kVData.getData() != null && "DATA_DRAWER_LAYOUT_IS_OPEN".equals(kVData.getKey()) && ((Boolean) kVData.getData()).booleanValue()) {
            f16157b = false;
            f16158f = 0;
            mo13895c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13894b(View view) {
        C9420h.m27938a(C3384d.m12589a(getContext()), Boolean.valueOf(true));
        C9097a.m27146a().mo22267a((Object) new C4409aa("button"));
        f16157b = false;
        f16158f = 0;
        mo13895c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13892a(View view) {
        if (this.f16170n != null) {
            C5663dg.m18035a(this.f16170n);
        }
        C9097a.m27146a().mo22267a((Object) new C4409aa("toast"));
        C9420h.m27938a(C3384d.m12589a(getContext()), Boolean.valueOf(true));
    }

    public void onInit(Object[] objArr) {
        this.f16163g = C9051ar.m27035b(getContext(), 100.0f) + C9051ar.m27035b(getContext(), 64.0f);
        this.f16164h = (this.f16163g * 1000.0f) / 280.0f;
        this.f16159a = this.contentView.findViewById(R.id.d7r);
        this.f16162e = (LottieAnimationView) this.contentView.findViewById(R.id.afh);
        if (objArr == null || objArr.length <= 0 || !(objArr[0] instanceof Boolean)) {
            this.f16172p = false;
        } else {
            this.f16172p = objArr[0].booleanValue();
        }
    }

    public void onLoad(Object[] objArr) {
        if (this.f16159a != null && this.f16162e != null) {
            this.f16162e.setAnimation("ttlive_dy_drawer_entrance.json");
            this.f16162e.setImageAssetsFolder("entranceimages/");
            this.dataCenter.observe("DATA_DRAWER_LAYOUT_IS_OPEN", this);
            if (C5352j.m17072a() && f16157b) {
                this.f16165i = ((C3245ad) C7492s.m23301b(this).mo19320e(DouPlusShareGuideExperiment.MIN_VALID_DURATION, TimeUnit.MILLISECONDS).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19297a((C7494t<T, ? extends R>) C3255e.m12297a((C3246ae) C3233a.m12257a(getLifecycle(), Event.ON_DESTROY)))).mo10183a(C5657da.f16732a, C3303k.m12377b());
            }
            if (C5352j.m17072a() && this.f16162e != null && f16158f > 0) {
                this.f16162e.mo7082c(true);
                this.f16162e.mo7078b();
                this.f16166j = ((C3245ad) C9057b.m27050a(0, 1, TimeUnit.SECONDS).mo19305c((long) f16158f).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19297a((C7494t<T, ? extends R>) C3255e.m12297a((C3246ae) C3233a.m12257a(getLifecycle(), Event.ON_DESTROY)))).mo10184a(C5658db.f16733a, C3303k.m12377b(), new C5659dc(this));
            }
            this.contentView.setOnClickListener(new C5660dd(this));
            m17628f();
        }
    }
}
