package com.p280ss.android.ugc.aweme.shortvideo.beauty;

import android.arch.lifecycle.C0053p;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p280ss.android.ugc.aweme.beauty.C23536f;
import com.p280ss.android.ugc.aweme.beauty.C23543l;
import com.p280ss.android.ugc.aweme.beauty.C23544m;
import com.p280ss.android.ugc.aweme.common.p1145f.C25682d;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.port.internal.C35622l;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38555b;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39374g;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39377i;
import com.p280ss.android.ugc.aweme.shortvideo.p1584n.C40189d;
import com.p280ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.beauty.e */
public final class C38521e implements C38519c {

    /* renamed from: a */
    public final C40189d f100121a;

    /* renamed from: b */
    public C39374g f100122b;

    /* renamed from: c */
    public boolean f100123c;

    /* renamed from: d */
    private int f100124d;

    /* renamed from: e */
    private int f100125e;

    /* renamed from: f */
    private int f100126f;

    /* renamed from: g */
    private int f100127g;

    /* renamed from: h */
    private int f100128h;

    /* renamed from: i */
    private boolean f100129i;

    /* renamed from: j */
    private boolean f100130j = true;

    /* renamed from: k */
    private boolean f100131k = true;

    /* renamed from: l */
    private boolean f100132l;

    /* renamed from: m */
    private boolean f100133m = true;

    /* renamed from: n */
    private C38555b f100134n;

    /* renamed from: o */
    private CameraModule f100135o;

    /* renamed from: a */
    public final int mo96490a() {
        return this.f100124d;
    }

    /* renamed from: b */
    public final int mo96499b() {
        return this.f100125e;
    }

    /* renamed from: c */
    public final int mo96504c() {
        return this.f100126f;
    }

    /* renamed from: d */
    public final int mo96508d() {
        return this.f100127g;
    }

    /* renamed from: e */
    public final int mo96510e() {
        return this.f100128h;
    }

    /* renamed from: f */
    public final boolean mo96512f() {
        return this.f100133m;
    }

    /* renamed from: g */
    public final boolean mo96513g() {
        return this.f100131k;
    }

    /* renamed from: a */
    private void m123142a(float f) {
        this.f100121a.mo99955a(f);
    }

    /* renamed from: c */
    public final void mo96506c(boolean z) {
        this.f100123c = z;
    }

    /* renamed from: b */
    public final void mo96502b(boolean z) {
        this.f100132l = z;
        if (z) {
            this.f100121a.mo99974c(0.0f, 0.0f);
            return;
        }
        if (this.f100130j) {
            this.f100121a.mo99974c(((float) this.f100127g) / 100.0f, ((float) this.f100128h) / 100.0f);
        }
    }

    /* renamed from: a */
    public final void mo96491a(int i) {
        this.f100124d = i;
        if (this.f100131k) {
            this.f100121a.mo99956a(((float) i) / 100.0f, 0.0f);
            if (C35563c.f93230L.mo93342a(Property.UserChangeSkinLevel)) {
                C35563c.f93230L.mo93338a(Property.UserSmoothSkinLevel, i);
            }
        }
    }

    /* renamed from: b */
    public final void mo96500b(int i) {
        this.f100125e = i;
        float f = ((float) this.f100126f) / 100.0f;
        float f2 = ((float) i) / 100.0f;
        if (f == 0.0f && f2 == 0.0f) {
            this.f100121a.mo99969b(0.0f, 0.0f);
        } else {
            this.f100121a.mo99969b(f, f2);
        }
        if (C35563c.f93230L.mo93342a(Property.UserChangeShapeLevel)) {
            C35563c.f93230L.mo93338a(Property.UserShapeLevel, i);
        }
    }

    /* renamed from: c */
    public final void mo96505c(int i) {
        this.f100126f = i;
        float f = ((float) i) / 100.0f;
        float f2 = ((float) this.f100125e) / 100.0f;
        if (f == 0.0f && f2 == 0.0f) {
            this.f100121a.mo99969b(0.0f, 0.0f);
        } else {
            this.f100121a.mo99969b(f, f2);
        }
        if (C35563c.f93230L.mo93342a(Property.UserChangeBigEyeLevel)) {
            C35563c.f93230L.mo93338a(Property.UserBigEyeLevel, i);
        }
    }

    /* renamed from: d */
    public final void mo96509d(int i) {
        this.f100127g = i;
        if (C35563c.f93230L.mo93342a(Property.UserChangeLipLevel)) {
            C35563c.f93230L.mo93338a(Property.UserLipLevel, i);
        }
        if (this.f100130j && !this.f100132l) {
            float f = ((float) i) / 100.0f;
            this.f100121a.mo99974c(f, ((float) this.f100128h) / 100.0f);
        }
    }

    /* renamed from: e */
    public final void mo96511e(int i) {
        this.f100128h = i;
        if (C35563c.f93230L.mo93342a(Property.UserChangeBlushLevel)) {
            C35563c.f93230L.mo93338a(Property.UserBlushLevel, i);
        }
        if (this.f100130j && !this.f100132l) {
            float f = ((float) this.f100127g) / 100.0f;
            this.f100121a.mo99974c(f, ((float) i) / 100.0f);
        }
    }

    /* renamed from: a */
    public final void mo96492a(final FragmentActivity fragmentActivity) {
        if (C23536f.m77298a()) {
            C35574k.m114859a().mo70099n().mo61327b().mo104730a(fragmentActivity, new C0053p<List<ComposerInfo>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onChanged(List<ComposerInfo> list) {
                    if (!C38521e.this.f100123c) {
                        if (list == null) {
                            list = new ArrayList<>();
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (ComposerInfo composerInfo : list) {
                            arrayList.add(composerInfo.f56036a);
                            arrayList2.add(composerInfo.f56037b);
                        }
                        int indexOf = arrayList.indexOf("EFFECT_ID_TYPE_FILTER");
                        if (indexOf < 0 || indexOf >= list.size() || C35574k.m114859a().mo70091f().mo93342a(Property.DisableFilter)) {
                            C38521e.this.f100121a.mo99972b(list, (int) VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                            return;
                        }
                        List subList = list.subList(0, indexOf);
                        final List subList2 = list.subList(indexOf + 1, list.size());
                        C38521e.this.f100121a.mo99972b(subList, (int) VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                            public final void run() {
                                C38521e.this.mo96519b(fragmentActivity);
                                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                                    public final void run() {
                                        C38521e.this.f100121a.mo99965a(subList2, (int) VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                                    }
                                }, 50);
                            }
                        }, 250);
                    }
                }
            });
            C35574k.m114859a().mo70099n().mo61328c().mo104730a(fragmentActivity, new C0053p<List<ComposerInfo>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onChanged(List<ComposerInfo> list) {
                    if (list != null && !list.isEmpty() && !C38521e.this.f100123c) {
                        C38521e.this.f100121a.mo99965a(list, (int) VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo96519b(FragmentActivity fragmentActivity) {
        final int a = this.f100134n.mo96542a(this.f100135o.mo100087f());
        if (a == -1) {
            C35563c.f93230L.mo93341a(Property.DisableFilter, true);
        }
        if (C35563c.m114837d().mo74818a().getValue() == null || ((List) C35563c.m114837d().mo74818a().getValue()).size() <= a) {
            C35563c.m114837d().mo74818a().observe(fragmentActivity, new C0053p<List<C29296g>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onChanged(List<C29296g> list) {
                    if (list != null && list.size() > a) {
                        C29296g a = C35563c.f93224F.mo70097l().mo74949b().mo74962a(a);
                        a.f77276k = false;
                        ((C39377i) C38521e.this.f100122b.mo74909j()).mo74899b(a);
                        ((C39377i) C38521e.this.f100122b.mo74909j()).mo74890a(((C39377i) C38521e.this.f100122b.mo74909j()).mo74906g());
                        ((C39377i) C38521e.this.f100122b.mo74909j()).mo74907h();
                        C35563c.m114837d().mo74818a().removeObserver(this);
                    }
                }
            });
            return;
        }
        C29296g a2 = C35563c.f93224F.mo70097l().mo74949b().mo74962a(a);
        a2.f77276k = false;
        ((C39377i) this.f100122b.mo74909j()).mo74899b(a2);
        ((C39377i) this.f100122b.mo74909j()).mo74890a(((C39377i) this.f100122b.mo74909j()).mo74906g());
        ((C39377i) this.f100122b.mo74909j()).mo74907h();
    }

    /* renamed from: a */
    public final void mo96496a(boolean z) {
        if (!C23536f.m77298a() && !C6399b.m19946v()) {
            C23543l lVar = new C23543l();
            lVar.mo61332a();
            mo96491a(lVar.f62136c[0]);
            mo96500b(lVar.f62136c[1]);
            mo96505c(lVar.f62136c[2]);
            if (this.f100129i) {
                mo96509d(lVar.f62136c[3]);
                mo96511e(lVar.f62136c[4]);
            }
            if (C35563c.f93230L.mo93342a(Property.EnableBeautySharpen)) {
                C35622l lVar2 = (C35622l) C25682d.m84426a(C35563c.f93238a, C35622l.class);
                if (!C35563c.f93230L.mo93342a(Property.UlikeBeautyDownloadEnable) || lVar2.mo60356a(-1.0f) == -1.0f || !C23544m.m77321a("0", "2")) {
                    m123142a(C35563c.f93230L.mo93345d(Property.UlikeSharpenDefaultValue));
                } else {
                    m123142a(lVar2.mo60356a(-1.0f));
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo96501b(List<ComposerInfo> list, int i) {
        this.f100121a.mo99975c(list, (int) VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
    }

    /* renamed from: a */
    public final void mo96494a(List<ComposerInfo> list, int i) {
        this.f100121a.mo99965a(list, i);
    }

    /* renamed from: c */
    public final void mo96507c(boolean z, boolean z2) {
        if (this.f100130j != z) {
            this.f100130j = z;
            if (!this.f100132l) {
                if (z) {
                    mo96511e(this.f100128h);
                    mo96509d(this.f100127g);
                    return;
                }
                this.f100121a.mo99974c(0.0f, 0.0f);
            }
        }
    }

    /* renamed from: b */
    public final void mo96503b(boolean z, boolean z2) {
        if (this.f100131k != z) {
            this.f100131k = z;
            if (!this.f100131k || C6399b.m19946v()) {
                this.f100121a.mo99956a(0.0f, 0.0f);
            } else {
                mo96491a(this.f100124d);
            }
        }
    }

    /* renamed from: a */
    public final void mo96497a(boolean z, boolean z2) {
        this.f100133m = z;
        if (!this.f100133m || C6399b.m19946v()) {
            this.f100121a.mo99969b(0.0f, 0.0f);
        } else {
            mo96500b(this.f100125e);
        }
    }

    /* renamed from: a */
    public final int[] mo96498a(String str, String str2) {
        return this.f100121a.mo99967a(str, str2);
    }

    /* renamed from: a */
    public final void mo96493a(String str, String str2, float f) {
        this.f100121a.mo99964a(str, str2, f);
    }

    /* renamed from: a */
    public final void mo96495a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        this.f100121a.mo99966a(list, list2, i);
    }

    public C38521e(C40189d dVar, boolean z, C39374g gVar, C38555b bVar, CameraModule cameraModule) {
        this.f100121a = dVar;
        this.f100129i = z;
        this.f100122b = gVar;
        this.f100134n = bVar;
        this.f100135o = cameraModule;
    }
}
