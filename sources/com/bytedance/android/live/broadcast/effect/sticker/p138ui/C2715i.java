package com.bytedance.android.live.broadcast.effect.sticker.p138ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.support.p022v4.view.ViewPager.C0935e;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.live.broadcast.api.C2418b;
import com.bytedance.android.live.broadcast.api.p126b.C2424d.C2426b;
import com.bytedance.android.live.broadcast.effect.sticker.C2663f;
import com.bytedance.android.live.broadcast.effect.sticker.p137a.C2653a;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C3555a;
import com.bytedance.android.live.uikit.rtl.RtlViewPager;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.log.p405b.C8439k;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.widget.LivePagerSlidingTabStrip;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43765o;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43770t;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.i */
public final class C2715i extends Dialog implements C2426b {

    /* renamed from: a */
    public final C2653a f8633a;

    /* renamed from: b */
    public LivePagerSlidingTabStrip f8634b;

    /* renamed from: c */
    public List<EffectCategoryResponse> f8635c;

    /* renamed from: d */
    private final DataCenter f8636d;

    /* renamed from: e */
    private LoadingStatusView f8637e;

    /* renamed from: f */
    private RtlViewPager f8638f;

    /* renamed from: g */
    private C2726q f8639g;

    /* renamed from: h */
    private OnDismissListener f8640h;

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.i$a */
    class C2717a implements C0935e {
        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        C2717a() {
        }

        public final void onPageSelected(int i) {
            EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) C2715i.this.f8635c.get(i);
            C2715i.this.f8633a.mo9318a(effectCategoryResponse.f113500id, effectCategoryResponse.tagsUpdateTime, (C43770t) new C2723n(this, effectCategoryResponse, i));
            HashMap hashMap = new HashMap();
            hashMap.put("tab", effectCategoryResponse.name);
            C8443c.m25663a().mo21606a("pm_live_sticker_tab_change", hashMap, new C8438j().mo21599b("live_take").mo21603f("other").mo21598a("live_take_detail"), new C8439k(), Room.class);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo9417a(EffectCategoryResponse effectCategoryResponse, final int i) {
            C2715i.this.mo9412a(effectCategoryResponse, (C43765o) new C43765o() {
                /* renamed from: a */
                public final void mo9278a() {
                    C2715i.this.f8634b.mo22457a(i);
                }

                /* renamed from: b */
                public final void mo9279b() {
                    C2715i.this.f8634b.mo22460b(i);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo8910a() {
        this.f8637e.mo10832e();
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        this.f8633a.mo8904a(C2418b.f7951b, this);
    }

    /* renamed from: b */
    private void m10985b() {
        for (final int i = 0; i < this.f8635c.size(); i++) {
            mo9412a((EffectCategoryResponse) this.f8635c.get(i), (C43765o) new C43765o() {
                /* renamed from: a */
                public final void mo9278a() {
                    C2715i.this.f8634b.mo22457a(i);
                }

                /* renamed from: b */
                public final void mo9279b() {
                    C2715i.this.f8634b.mo22460b(i);
                }
            });
        }
    }

    public final void setOnDismissListener(OnDismissListener onDismissListener) {
        this.f8640h = onDismissListener;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo9413b(View view) {
        this.f8637e.mo10830c();
        this.f8633a.mo8904a(C2418b.f7951b, this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9409a(DialogInterface dialogInterface) {
        this.f8638f.setCurrentItem(((Integer) C8946b.f24421at.mo22117a()).intValue());
        if (this.f8640h != null) {
            this.f8640h.onDismiss(dialogInterface);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9410a(View view) {
        this.f8636d.lambda$put$1$DataCenter("cmd_sticker_tip", "");
        if (this.f8639g != null) {
            this.f8639g.mo9424a(0, null);
        }
    }

    /* renamed from: b */
    private static C9355c m10984b(EffectChannelResponse effectChannelResponse) {
        for (EffectCategoryResponse effectCategoryResponse : effectChannelResponse.categoryResponseList) {
            if (effectCategoryResponse == null) {
                break;
            }
            Iterator it = effectCategoryResponse.totalEffects.iterator();
            while (true) {
                if (it.hasNext()) {
                    Effect effect = (Effect) it.next();
                    Iterator it2 = C2515f.m10417f().mo9074a().mo8884a(C2418b.f7951b).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            C9355c cVar = (C9355c) it2.next();
                            if (cVar.mo22813a(C2663f.m10852a(effect))) {
                                return cVar;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.aof, null));
        getWindow().setLayout(-1, (int) C9738o.m28708b(getContext(), 232.0f));
        getWindow().setGravity(80);
        setCanceledOnTouchOutside(true);
        this.f8637e = (LoadingStatusView) findViewById(R.id.dav);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ay3, null, false);
        inflate.setOnClickListener(new C2719j(this));
        this.f8637e.setBuilder(C3555a.m13075a(getContext()).mo10834a(getContext().getResources().getDimensionPixelSize(R.dimen.oa)).mo10839c(inflate));
        this.f8634b = (LivePagerSlidingTabStrip) findViewById(R.id.dfv);
        this.f8638f = (RtlViewPager) findViewById(R.id.db4);
        findViewById(R.id.p9).setOnClickListener(new C2720k(this));
        this.f8637e.setVisibility(0);
        this.f8634b.setVisibility(4);
        this.f8638f.setVisibility(4);
        setOnDismissListener(new C2721l(this));
    }

    /* renamed from: a */
    public final void mo8911a(EffectChannelResponse effectChannelResponse) {
        if (effectChannelResponse == null || C6311g.m19573a(effectChannelResponse.categoryResponseList)) {
            this.f8637e.mo10831d();
            return;
        }
        this.f8637e.setVisibility(4);
        this.f8634b.setVisibility(0);
        this.f8638f.setVisibility(0);
        this.f8635c = effectChannelResponse.categoryResponseList;
        if (this.f8639g == null) {
            this.f8639g = new C2726q(getContext(), m10984b(effectChannelResponse), this.f8633a);
            this.f8638f.setAdapter(this.f8639g);
            this.f8639g.mo9425a(this.f8635c);
            this.f8639g.f8661a = new C2722m(this);
            this.f8634b.setOnPageChangeListener(new C2717a());
            this.f8634b.setViewPager(this.f8638f);
        } else {
            this.f8639g.mo9425a(this.f8635c);
        }
        this.f8638f.setCurrentItem(((Integer) C8946b.f24421at.mo22117a()).intValue());
        m10985b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9411a(C9355c cVar, C9355c cVar2) {
        if (cVar2 == null) {
            this.f8636d.lambda$put$1$DataCenter("cmd_sticker_tip", "");
        } else {
            this.f8636d.lambda$put$1$DataCenter("cmd_sticker_tip", cVar2.f25584w);
        }
        C2515f.m10417f().mo9074a().mo8893a(C2418b.f7951b, cVar, cVar2);
    }

    /* renamed from: a */
    public final void mo9412a(EffectCategoryResponse effectCategoryResponse, C43765o oVar) {
        if (effectCategoryResponse == null || C6311g.m19573a(effectCategoryResponse.tags) || !effectCategoryResponse.tags.contains("new")) {
            oVar.mo9279b();
        } else {
            this.f8633a.mo9317a(effectCategoryResponse.f113500id, effectCategoryResponse.tagsUpdateTime, oVar);
        }
    }

    public C2715i(Context context, DataCenter dataCenter, C2653a aVar) {
        super(context, R.style.z4);
        this.f8633a = aVar;
        this.f8636d = dataCenter;
    }
}
