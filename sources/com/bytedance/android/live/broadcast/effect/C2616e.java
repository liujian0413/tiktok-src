package com.bytedance.android.live.broadcast.effect;

import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.android.live.broadcast.effect.adapter.LiveFilterAdapter.C2585a;
import com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyDialogFragment;
import com.bytedance.android.live.broadcast.effect.sticker.p137a.C2655b;
import com.bytedance.android.live.broadcast.p132c.C2508d.C2511b;
import com.bytedance.android.live.broadcast.p132c.C2508d.C2511b.C2512a;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.livesdk.LiveDialogFragment;

/* renamed from: com.bytedance.android.live.broadcast.effect.e */
public final class C2616e implements C2588b {

    /* renamed from: a */
    private LiveBeautyFilterDialogFragment f8398a;

    /* renamed from: b */
    private LiveSmallItemBeautyDialogFragment f8399b;

    /* renamed from: c */
    private C2655b f8400c;

    /* renamed from: d */
    private C2636q f8401d;

    /* renamed from: e */
    private C2619g f8402e;

    /* renamed from: com.bytedance.android.live.broadcast.effect.e$a */
    public static final class C2617a implements C2511b<C2588b> {
        /* renamed from: a */
        public final C2512a<C2588b> mo8847a(C2512a<C2588b> aVar) {
            return aVar.mo9081a(new C2616e()).mo9080a();
        }
    }

    /* renamed from: a */
    public final C2655b mo9212a() {
        if (this.f8400c == null) {
            this.f8400c = new C2655b();
        }
        return this.f8400c;
    }

    /* renamed from: b */
    public final C2636q mo9214b() {
        if (this.f8401d == null) {
            this.f8401d = new C2636q();
        }
        return this.f8401d;
    }

    /* renamed from: c */
    public final C2619g mo9215c() {
        if (this.f8402e == null) {
            this.f8402e = new C2619g();
        }
        return this.f8402e;
    }

    /* renamed from: d */
    public final void mo9216d() {
        if (this.f8399b != null) {
            if (this.f8399b.mo11345g()) {
                try {
                    this.f8399b.dismissAllowingStateLoss();
                } catch (Exception e) {
                    C3166a.m11963b("LiveEffectService", (Throwable) e);
                }
            }
            this.f8399b = null;
        }
        if (this.f8398a != null) {
            if (this.f8398a.mo11345g()) {
                try {
                    this.f8398a.dismissAllowingStateLoss();
                } catch (Exception e2) {
                    C3166a.m11963b("LiveEffectService", (Throwable) e2);
                }
            }
            this.f8398a = null;
        }
        if (this.f8400c != null) {
            this.f8400c.mo8903a();
        }
        if (this.f8401d != null) {
            this.f8401d.mo9311a();
            this.f8401d = null;
        }
        if (this.f8402e != null) {
            this.f8402e.mo9256g();
            this.f8402e = null;
        }
    }

    /* renamed from: a */
    public final LiveBeautyFilterDialogFragment mo9211a(FragmentActivity fragmentActivity, C2585a aVar) {
        Fragment a = fragmentActivity.getSupportFragmentManager().mo2644a("LiveBeautyFilterDialogFragment");
        if (a != null && a.isAdded() && (a instanceof LiveBeautyFilterDialogFragment)) {
            return (LiveBeautyFilterDialogFragment) a;
        }
        if (this.f8398a == null) {
            this.f8398a = LiveBeautyFilterDialogFragment.m10558a(aVar);
        }
        if (!this.f8398a.mo11345g()) {
            this.f8398a.show(fragmentActivity.getSupportFragmentManager(), "LiveBeautyFilterDialogFragment");
        }
        return this.f8398a;
    }

    /* renamed from: a */
    public final LiveDialogFragment mo9213a(FragmentActivity fragmentActivity, Boolean bool) {
        Fragment a = fragmentActivity.getSupportFragmentManager().mo2644a("LiveSmallItemBeautyDialogFragment");
        if (a != null && a.isAdded() && (a instanceof LiveDialogFragment)) {
            return (LiveDialogFragment) a;
        }
        if (this.f8399b == null) {
            this.f8399b = LiveSmallItemBeautyDialogFragment.m10668a(bool.booleanValue());
        }
        if (!this.f8399b.mo11345g()) {
            this.f8399b.show(fragmentActivity.getSupportFragmentManager(), "LiveSmallItemBeautyDialogFragment");
        }
        return this.f8399b;
    }
}
