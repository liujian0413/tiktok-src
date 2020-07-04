package com.bytedance.android.live.broadcast.effect;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.live.broadcast.api.model.C2437b;
import com.bytedance.android.live.broadcast.api.model.C2439d;
import com.bytedance.android.live.broadcast.effect.C2624k.C2629a;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.broadcast.stream.p141a.C2947a;
import com.bytedance.android.live.broadcast.stream.p141a.p142a.C2948a;
import com.bytedance.android.live.broadcast.stream.p141a.p142a.C2949b;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdkapi.host.C9439a;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.live.broadcast.effect.g */
public final class C2619g implements C2629a {

    /* renamed from: a */
    public List<FilterModel> f8404a = C2624k.m10736a().f8419b;

    /* renamed from: b */
    public C2949b f8405b;

    /* renamed from: c */
    private ValueAnimator f8406c;

    /* renamed from: a */
    public final void mo9248a(String str, HashMap<String, String> hashMap) {
        if (!this.f8404a.isEmpty()) {
            int b = mo9250b();
            int i = b + 1;
            if (i >= this.f8404a.size()) {
                i = 0;
            }
            FilterModel filterModel = (FilterModel) this.f8404a.get(i);
            if (!C2624k.m10736a().mo9269b(filterModel)) {
                if (!C2624k.m10736a().mo9271c(filterModel)) {
                    C2624k.m10736a().mo9262a(filterModel);
                }
                return;
            }
            if (!C6319n.m19593a(filterModel.getFilterId()) && !filterModel.getFilterId().equals("0")) {
                hashMap.put("filter_id", filterModel.getFilterId());
                C8443c.m25663a().mo21606a("live_take_filter_select", hashMap, new C8438j().mo21599b("live_take").mo21598a(str).mo21604g("draw").mo21603f("click"));
            }
            m10721a(true, b, i, 1);
        }
    }

    /* renamed from: a */
    public final void mo9247a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                C3166a.m11961b("LiveFilterHelper", "FilterEffect unset");
                this.f8405b.mo9688a();
                return;
            }
            StringBuilder sb = new StringBuilder("FilterEffect update file:");
            sb.append(str);
            C3166a.m11961b("LiveFilterHelper", sb.toString());
            this.f8405b.mo9689a(str);
        } catch (FileNotFoundException e) {
            C3166a.m11963b("LiveFilterHelper", (Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo9249a(boolean z) {
        if (z) {
            this.f8404a = C2624k.m10736a().f8419b;
            if (!C6307b.m19566a((Collection<T>) this.f8404a) && ((Integer) C8946b.f24361M.mo22117a()).intValue() > 0 && ((Integer) C8946b.f24361M.mo22117a()).intValue() < this.f8404a.size() && this.f8405b != null) {
                mo9244a(((Integer) C8946b.f24361M.mo22117a()).intValue());
            }
        }
    }

    /* renamed from: g */
    public final void mo9256g() {
        C2624k.m10736a().mo9268b((C2629a) this);
    }

    /* renamed from: e */
    public final void mo9254e() {
        mo9248a("live_take_page", new HashMap<>());
    }

    /* renamed from: f */
    public final void mo9255f() {
        mo9251b("live_take_page", new HashMap());
    }

    protected C2619g() {
        C2624k.m10736a().mo9267b();
        C2624k.m10736a().mo9261a((C2629a) this);
    }

    /* renamed from: b */
    public final int mo9250b() {
        int intValue = ((Integer) C8946b.f24361M.mo22117a()).intValue();
        if (intValue >= this.f8404a.size() || intValue < 0) {
            return 0;
        }
        return intValue;
    }

    /* renamed from: c */
    public final String mo9252c() {
        if (this.f8404a.isEmpty()) {
            return "0";
        }
        return ((FilterModel) this.f8404a.get(mo9250b())).getFilterId();
    }

    /* renamed from: d */
    public final String mo9253d() {
        if (this.f8404a.isEmpty()) {
            return "";
        }
        return ((FilterModel) this.f8404a.get(mo9250b())).getName();
    }

    /* renamed from: a */
    public final String mo9243a() {
        if (mo9250b() == 0 || this.f8404a.isEmpty()) {
            return "";
        }
        return ((FilterModel) this.f8404a.get(mo9250b())).getFilterPath();
    }

    /* renamed from: a */
    public final void mo9246a(C2947a aVar) {
        this.f8405b = new C2949b();
        aVar.mo9677a((C2948a) this.f8405b);
        mo9247a(mo9243a());
    }

    /* renamed from: a */
    public static void m10719a(long j) {
        String str;
        C3596c.m13172a(C9439a.class);
        int intValue = ((Integer) C8946b.f24361M.mo22117a()).intValue();
        if (intValue < C2624k.m10736a().f8419b.size()) {
            boolean a = C2515f.m10417f().mo9078e().mo8845a();
            String str2 = "";
            if (C6307b.m19566a((Collection<T>) C2624k.m10736a().f8419b) || intValue >= C2624k.m10736a().f8419b.size() || C2624k.m10736a().f8419b.get(intValue) == null) {
                str = str2;
            } else {
                str = ((FilterModel) C2624k.m10736a().f8419b.get(intValue)).getName();
            }
            C2515f.m10417f().mo9076c().mo9169d().uploadBeautyParams(j, str, (int) (((Float) C8946b.f24362N.mo22117a()).floatValue() * 100.0f), (int) (((Float) C8946b.f24363O.mo22117a()).floatValue() * 100.0f), (int) (((Float) C8946b.f24364P.mo22117a()).floatValue() * 100.0f), (int) (((Float) C8946b.f24365Q.mo22117a()).floatValue() * 100.0f), a).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a(C2622i.f8413a, C2623j.f8414a);
            C9097a.m27146a().mo22267a((Object) new C2437b(a));
        }
    }

    /* renamed from: a */
    public final void mo9244a(int i) {
        int i2;
        int b = mo9250b();
        if (i >= 0 && i < this.f8404a.size()) {
            if (!C2624k.m10736a().mo9269b((FilterModel) this.f8404a.get(i))) {
                if (!C2624k.m10736a().mo9271c((FilterModel) this.f8404a.get(i))) {
                    C2624k.m10736a().mo9262a((FilterModel) this.f8404a.get(i));
                }
                return;
            }
            if (i > b) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            m10721a(true, b, i, i2);
        }
    }

    /* renamed from: a */
    public static float m10718a(List<FilterModel> list, int i) {
        if (!C6311g.m19573a(list) && i >= 0 && i < list.size()) {
            FilterModel filterModel = (FilterModel) list.get(i);
            if (filterModel.getTags() != null) {
                for (String split : filterModel.getTags()) {
                    String[] split2 = split.split(":");
                    if (split2.length == 2 && split2[0].equals("white")) {
                        try {
                            return (float) Integer.valueOf(split2[1]).intValue();
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        return 100.0f;
    }

    /* renamed from: b */
    public final void mo9251b(String str, HashMap<String, String> hashMap) {
        if (!this.f8404a.isEmpty()) {
            int b = mo9250b();
            int i = b - 1;
            if (i < 0) {
                i = this.f8404a.size() - 1;
            }
            FilterModel filterModel = (FilterModel) this.f8404a.get(i);
            if (!C2624k.m10736a().mo9269b(filterModel)) {
                if (!C2624k.m10736a().mo9271c(filterModel)) {
                    C2624k.m10736a().mo9262a(filterModel);
                }
                return;
            }
            hashMap.put("filter_id", filterModel.getFilterId());
            if (!C6319n.m19593a(filterModel.getFilterId()) && !filterModel.getFilterId().equals("0")) {
                C8443c.m25663a().mo21606a("live_take_filter_select", hashMap, new C8438j().mo21599b("live_take").mo21598a(str).mo21604g("draw").mo21603f("click"));
            }
            m10721a(true, b, i, 0);
        }
    }

    /* renamed from: a */
    private void m10721a(boolean z, int i, final int i2, int i3) {
        if (i < this.f8404a.size() && i2 < this.f8404a.size()) {
            if (this.f8406c != null && this.f8406c.isRunning()) {
                this.f8406c.cancel();
            }
            this.f8406c = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f8406c.setDuration(600);
            this.f8406c.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f8406c.addUpdateListener(new C2621h(this, i3, i2, i));
            this.f8406c.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    if (i2 == 0) {
                        C3166a.m11961b("LiveFilterHelper", "FilterEffect unset");
                        C2619g.this.f8405b.mo9688a();
                        return;
                    }
                    StringBuilder sb = new StringBuilder("FilterEffect update file:");
                    sb.append(((FilterModel) C2619g.this.f8404a.get(i2)).getFilterPath());
                    C3166a.m11961b("LiveFilterHelper", sb.toString());
                    C2619g.this.mo9247a(((FilterModel) C2619g.this.f8404a.get(i2)).getFilterPath());
                }
            });
            C8946b.f24361M.mo22118a(Integer.valueOf(i2));
            C9097a.m27146a().mo22267a((Object) new C2439d(i2));
            this.f8406c.start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9245a(int i, int i2, int i3, ValueAnimator valueAnimator) {
        if (i == 0) {
            String str = "LiveFilterHelper";
            try {
                StringBuilder sb = new StringBuilder("FilterEffect update left file:");
                sb.append(((FilterModel) this.f8404a.get(i2)).getFilterPath());
                sb.append(" right file:");
                sb.append(((FilterModel) this.f8404a.get(i3)).getFilterPath());
                sb.append(" pos:");
                sb.append((Float) valueAnimator.getAnimatedValue());
                C3166a.m11961b(str, sb.toString());
                this.f8405b.mo9687a(((FilterModel) this.f8404a.get(i2)).getFilterPath(), ((FilterModel) this.f8404a.get(i3)).getFilterPath(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
            } catch (FileNotFoundException unused) {
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("FilterEffect update left file:");
        sb2.append(((FilterModel) this.f8404a.get(i3)).getFilterPath());
        sb2.append(" right file:");
        sb2.append(((FilterModel) this.f8404a.get(i2)).getFilterPath());
        sb2.append(" pos:");
        sb2.append(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
        C3166a.m11961b("LiveFilterHelper", sb2.toString());
        this.f8405b.mo9687a(((FilterModel) this.f8404a.get(i3)).getFilterPath(), ((FilterModel) this.f8404a.get(i2)).getFilterPath(), 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
