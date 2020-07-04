package com.bytedance.p073ad.symphony.p074a.p075a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.p073ad.symphony.C2114c;
import com.bytedance.p073ad.symphony.C2140e;
import com.bytedance.p073ad.symphony.p074a.C2081a;
import com.bytedance.p073ad.symphony.p076b.p077a.C2109g;
import com.bytedance.p073ad.symphony.p078c.C2129h;
import com.bytedance.p073ad.symphony.p079d.p080a.C2133a;
import com.bytedance.p073ad.symphony.p079d.p080a.C2134b;
import com.bytedance.p073ad.symphony.p081e.p082a.C2142a;
import com.bytedance.p073ad.symphony.p081e.p082a.C2143b;
import com.bytedance.p073ad.symphony.p086i.C2162a;
import com.bytedance.p073ad.symphony.util.SafeConcurrentHashMap;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ad.symphony.a.a.a */
public abstract class C2082a extends C2081a implements C2087d {

    /* renamed from: h */
    public boolean f7174h;

    /* renamed from: i */
    protected List<View> f7175i = new ArrayList();

    /* renamed from: j */
    public C2133a f7176j = new C2133a() {
        /* renamed from: a */
        public final void mo7763a() {
            if (!C2082a.this.f7171e.f7238a) {
                C2082a.this.f7171e.mo7811a();
                C2129h.m9341a("ad_show", C2082a.this);
            }
        }
    };

    /* renamed from: k */
    public C2134b f7177k;

    /* renamed from: l */
    protected ViewGroup f7178l;

    /* renamed from: m */
    protected View f7179m;

    /* renamed from: n */
    public String f7180n;

    /* renamed from: o */
    protected volatile boolean f7181o = false;

    /* renamed from: p */
    protected C2088e f7182p;

    /* renamed from: a */
    public void mo7753a(ViewGroup viewGroup, int i) {
    }

    /* renamed from: a */
    public void mo7757a(ViewGroup[] viewGroupArr) {
    }

    /* renamed from: f */
    public final C2088e mo7762f() {
        return this.f7182p;
    }

    /* renamed from: a_ */
    public final void mo7759a_() {
        C2129h.m9341a("ad_sdk_click", this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c_ */
    public final boolean mo7761c_() {
        boolean z = this.f7181o;
        return this.f7181o;
    }

    /* renamed from: b_ */
    public final void mo7760b_() {
        mo7772l();
        C2129h.m9341a("ad_sdk_show", this);
    }

    /* renamed from: l */
    private static boolean mo7772l() {
        if (C2114c.m9313a().f7224c instanceof C2109g) {
            return C2114c.m9313a().f7224c.f7216j;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo7755a(C2134b bVar) {
        this.f7177k = bVar;
    }

    /* renamed from: a */
    private static C2162a m9184a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (viewGroup.getChildAt(i) instanceof C2162a) {
                return (C2162a) viewGroup.getChildAt(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m9185b(View view) {
        if (mo7772l() && (view instanceof ViewGroup) && !this.f7174h) {
            ViewGroup viewGroup = (ViewGroup) view;
            C2162a a = m9184a(viewGroup);
            if (a == null) {
                a = new C2162a(viewGroup.getContext(), viewGroup);
                a.setListener(new C2133a() {
                    /* renamed from: a */
                    public final void mo7763a() {
                        if (C2082a.this.f7176j != null) {
                            C2082a.this.f7176j.mo7763a();
                        }
                        C2082a.this.f7174h = true;
                    }
                });
                viewGroup.addView(a);
            }
            a.setNeedCheckingShow(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7752a(View view) {
        if (view != null) {
            view.setOnClickListener(null);
            view.setClickable(false);
            view.setLongClickable(false);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    mo7752a(viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo7756a(Map<String, Object> map) {
        ConcurrentHashMap a = this.f7172f.mo7829a();
        if (a == null) {
            a = new SafeConcurrentHashMap();
        }
        if (map != null) {
            try {
                a.putAll(map);
            } catch (ConcurrentModificationException e) {
                C2140e.m9360a((Exception) e);
                return;
            }
        }
        a.put("sdk_title", mo7764c());
        a.put("sdk_description", mo7765d());
        a.put("sdk_image_url", mo7766e());
        String g = mo7767g();
        String str = "sdk_icon_url";
        if (g == null) {
            g = "'";
        }
        a.put(str, URLEncoder.encode(g));
        a.put("sdk_cta", mo7769i());
        a.put("sdk_advertiser", mo7768h());
        a.put("sdk_click_url", this.f7180n);
    }

    /* renamed from: a */
    public boolean mo7758a(boolean z) {
        if (mo7761c_()) {
            return false;
        }
        this.f7181o = !z;
        if (this.f7178l != null) {
            if (mo7772l()) {
                C2162a a = m9184a(this.f7178l);
                if (a != null) {
                    a.setNeedCheckingShow(false);
                }
            }
            if (!z) {
                this.f7178l = null;
            }
        }
        if (this.f7179m != null) {
            this.f7179m.setOnClickListener(null);
            this.f7179m = null;
        }
        this.f7182p = null;
        return true;
    }

    /* renamed from: a */
    public void mo7754a(ViewGroup viewGroup, View view, List<View> list) {
        if (!mo7761c_()) {
            m9185b(viewGroup);
            this.f7178l = viewGroup;
            this.f7179m = view;
        }
    }

    public C2082a(Context context, C2142a aVar, C2143b bVar, String str) {
        super(context, aVar, bVar, str);
    }
}
