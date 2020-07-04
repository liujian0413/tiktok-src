package com.p280ss.android.ugc.aweme.shortvideo.p1584n;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.asve.recorder.effect.composer.C20761c;
import com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p280ss.android.ugc.asve.recorder.p922b.C20676a;
import com.p280ss.android.ugc.aweme.beauty.C23533d;
import com.p280ss.android.ugc.aweme.beauty.C23544m;
import com.p280ss.android.ugc.aweme.filter.C29230az;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.filter.C29297h;
import com.p280ss.android.ugc.aweme.filter.p1246e.C29289b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.n.e */
public final class C40190e implements C40189d {

    /* renamed from: a */
    public final C20749b f104463a;

    /* renamed from: b */
    C40186a f104464b = C40186a.f104461a;

    /* renamed from: c */
    public int f104465c;

    /* renamed from: d */
    String f104466d = "";

    /* renamed from: e */
    String f104467e;

    /* renamed from: f */
    private boolean f104468f;

    /* renamed from: g */
    private int f104469g = -1;

    /* renamed from: h */
    private float f104470h;

    /* renamed from: i */
    private float f104471i;

    /* renamed from: j */
    private float f104472j;

    /* renamed from: k */
    private float f104473k;

    /* renamed from: l */
    private float f104474l;

    /* renamed from: m */
    private float f104475m;

    /* renamed from: n */
    private boolean f104476n;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.n.e$a */
    public static class C40191a {

        /* renamed from: a */
        String f104477a;

        /* renamed from: b */
        String f104478b;

        /* renamed from: c */
        String f104479c;

        /* renamed from: d */
        boolean f104480d;

        /* renamed from: e */
        C20676a f104481e;

        /* renamed from: a */
        public final C40191a mo99990a(C20676a aVar) {
            this.f104481e = aVar;
            return this;
        }

        /* renamed from: b */
        public final C40191a mo99994b(String str) {
            this.f104478b = str;
            return this;
        }

        /* renamed from: c */
        public final C40191a mo99995c(String str) {
            this.f104479c = str;
            return this;
        }

        /* renamed from: a */
        public final C40191a mo99991a(String str) {
            this.f104477a = str;
            return this;
        }

        /* renamed from: a */
        public final C40191a mo99992a(boolean z) {
            this.f104480d = z;
            return this;
        }

        /* renamed from: a */
        public final void mo99993a(C40188c cVar) {
            if (this.f104477a != null) {
                File file = new File(this.f104477a);
                if (file.exists()) {
                    file.delete();
                }
            }
            if (this.f104478b != null) {
                File file2 = new File(this.f104478b);
                if (file2.exists()) {
                    file2.delete();
                }
            }
            this.f104481e.mo55901a(this.f104477a, this.f104478b, this.f104480d, this.f104479c, "", (C7562b<? super RecorderConcatResult, C7581n>) new C40196j<Object,C7581n>(new WeakReference(cVar), cVar));
        }

        /* renamed from: a */
        static final /* synthetic */ C7581n m128474a(WeakReference weakReference, C40188c cVar, RecorderConcatResult recorderConcatResult) {
            if (((C40188c) weakReference.get()) != null) {
                new Handler(Looper.getMainLooper()).post(new C40197k(cVar, recorderConcatResult));
            }
            return C7581n.f20898a;
        }
    }

    /* renamed from: c */
    private static int m128433c(float f) {
        return f < 0.0f ? -1 : 1;
    }

    /* renamed from: a */
    public final void mo99963a(String str, float f, float f2) {
        this.f104463a.mo56049a(3, str);
        this.f104463a.mo56115f(f, f2);
    }

    /* renamed from: a */
    public final void mo99961a(String str) {
        this.f104463a.mo56118g(str);
        this.f104467e = str;
    }

    /* renamed from: a */
    public final void mo99962a(String str, float f) {
        this.f104463a.mo56088b(str, f);
        this.f104467e = str;
    }

    /* renamed from: a */
    public final void mo99985a(boolean z) {
        if (this.f104468f != z) {
            this.f104468f = z;
            if (this.f104469g != -1) {
                boolean z2 = true;
                if (this.f104469g != 1) {
                    z2 = false;
                }
                mo99988b(z2);
            }
            if (!(this.f104470h == 0.0f && this.f104471i == 0.0f)) {
                mo99969b(this.f104470h, this.f104471i);
            }
            if (this.f104472j != 0.0f || this.f104473k != 0.0f) {
                mo99974c(this.f104472j, this.f104473k);
            }
        }
    }

    /* renamed from: a */
    public final void mo99984a(C40186a aVar, float f, C29230az azVar) {
        int i;
        int c = m128433c(f);
        int i2 = aVar.f104462b;
        if (c == -1) {
            int i3 = i2 - 1;
            if (i3 < 0) {
                i3 = 0;
            }
            int i4 = i2;
            i2 = i3;
            i = i4;
        } else {
            int size = C35563c.f93224F.mo70097l().mo74949b().mo74966b().size();
            int i5 = i2 + 1;
            i = i5 >= size ? size - 1 : i5;
        }
        C29289b a = C35563c.f93224F.mo70097l().mo74948a();
        String a2 = a.mo74956a(i2);
        String a3 = a.mo74956a(i);
        if (this.f104465c == 2) {
            if (i2 == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(C39810eq.f103482r);
                sb.append("beautify_filter");
                a2 = sb.toString();
            }
            if (i == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C39810eq.f103482r);
                sb2.append("beautify_filter");
                a3 = sb2.toString();
            }
        }
        String str = a3;
        String str2 = a2;
        float abs = f < 0.0f ? Math.abs(f) : 1.0f - f;
        this.f104464b = aVar;
        C29296g gVar = (C29296g) C35563c.f93224F.mo70097l().mo74949b().mo74966b().get(i2);
        C29296g gVar2 = (C29296g) C35563c.f93224F.mo70097l().mo74949b().mo74966b().get(i);
        C20749b bVar = this.f104463a;
        C20749b bVar2 = this.f104463a;
        bVar2.getClass();
        float a4 = C29297h.m96116a(gVar, azVar, C40192f.m128482a(bVar2));
        C20749b bVar3 = this.f104463a;
        bVar3.getClass();
        bVar.mo56066a(str2, str, abs, a4, C29297h.m96116a(gVar2, azVar, C40193g.m128484a(bVar3)));
    }

    /* renamed from: a */
    public final void mo99983a(C40186a aVar, float f) {
        int i;
        int c = m128433c(f);
        int i2 = aVar.f104462b;
        if (c == -1) {
            int i3 = i2 - 1;
            if (i3 < 0) {
                i3 = 0;
            }
            int i4 = i2;
            i2 = i3;
            i = i4;
        } else {
            int size = C35563c.f93224F.mo70097l().mo74949b().mo74966b().size();
            int i5 = i2 + 1;
            i = i5 >= size ? size - 1 : i5;
        }
        C29289b a = C35563c.f93224F.mo70097l().mo74948a();
        String a2 = a.mo74956a(i2);
        String a3 = a.mo74956a(i);
        if (this.f104465c == 2) {
            if (i2 == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(C39810eq.f103482r);
                sb.append("beautify_filter");
                a2 = sb.toString();
            }
            if (i == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C39810eq.f103482r);
                sb2.append("beautify_filter");
                a3 = sb2.toString();
            }
        }
        float abs = f < 0.0f ? Math.abs(f) : 1.0f - f;
        this.f104464b = aVar;
        this.f104463a.mo56065a(a2, a3, abs);
    }

    /* renamed from: a */
    public final void mo99964a(String str, String str2, float f) {
        if (this.f104463a != null) {
            C20761c d = this.f104463a.mo56102d();
            d.mo56140a(str, str2, f);
            d.mo56144a();
        }
    }

    /* renamed from: a */
    public final int[] mo99967a(String str, String str2) {
        return this.f104463a.mo56099c(str, str2);
    }

    /* renamed from: a */
    public final void mo99965a(List<ComposerInfo> list, int i) {
        if (this.f104463a != null) {
            this.f104463a.mo56068a(list, i);
        }
    }

    /* renamed from: a */
    public final void mo99966a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        if (this.f104463a != null) {
            this.f104463a.mo56069a(list, list2, i);
        }
    }

    /* renamed from: f */
    public static C40191a m128435f() {
        return new C40191a();
    }

    /* renamed from: g */
    private int m128436g() {
        String str;
        if (this.f104468f) {
            str = "1";
        } else {
            str = "2";
        }
        if (C23544m.m77321a(str, "1")) {
            return 3;
        }
        int b = C35563c.f93230L.mo93343b(Property.BeautyModel);
        if (b == 0) {
            b = 1;
        }
        return b;
    }

    /* renamed from: b */
    public final float mo99968b() {
        int i;
        if (C23544m.m77321a("2", "3")) {
            i = C35563c.f93230L.mo93343b(Property.UserBlushLevel);
        } else {
            i = 0;
        }
        return (((float) i) * 1.0f) / 100.0f;
    }

    /* renamed from: c */
    public final float mo99973c() {
        return (((float) C35563c.f93230L.mo93343b(Property.UserBigEyeLevel)) * 1.0f) / 100.0f;
    }

    /* renamed from: d */
    public final float mo99976d() {
        return (((float) C35563c.f93230L.mo93343b(Property.UserShapeLevel)) * 1.0f) / 100.0f;
    }

    /* renamed from: e */
    public final float mo99978e() {
        return (((float) C35563c.f93230L.mo93343b(Property.UserSmoothSkinLevel)) * 1.0f) / 100.0f;
    }

    /* renamed from: a */
    public final float mo99954a() {
        int i;
        if (C23544m.m77321a("2", "3")) {
            i = C35563c.f93230L.mo93343b(Property.UserLipLevel);
        } else {
            i = 0;
        }
        return (((float) i) * 1.0f) / 100.0f;
    }

    /* renamed from: h */
    private void m128437h() {
        C29289b a = C35563c.f93224F.mo70097l().mo74948a();
        if (((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).isKorean()) {
            C20749b bVar = this.f104463a;
            StringBuilder sb = new StringBuilder();
            sb.append(a.mo74959c());
            sb.append("beautify_filter_korean/");
            bVar.mo56118g(sb.toString());
            return;
        }
        C20749b bVar2 = this.f104463a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a.mo74959c());
        sb2.append("beautify_filter/");
        bVar2.mo56118g(sb2.toString());
    }

    /* renamed from: a */
    public static C40190e m128431a(C20749b bVar) {
        return new C40190e(bVar);
    }

    /* renamed from: b */
    public final float mo99986b(String str) {
        return this.f104463a.mo56120h(str);
    }

    /* renamed from: a */
    public final void mo99955a(float f) {
        this.f104463a.mo56034a(9, f);
    }

    /* renamed from: b */
    public final void mo99987b(float f) {
        this.f104463a.mo56081b(f);
    }

    private C40190e(C20749b bVar) {
        this.f104463a = bVar;
        this.f104476n = C35563c.f93231M.mo93305a(AVAB.Property.EnableFilterIntensityJust);
    }

    /* renamed from: a */
    private void m128432a(C40186a aVar) {
        this.f104464b = aVar;
        if (aVar.f104462b == 0 && this.f104465c == 2) {
            m128437h();
            return;
        }
        this.f104463a.mo56118g(aVar.mo99951a());
    }

    /* renamed from: a */
    public final void mo99958a(int i) {
        m128432a(new C40186a(i));
    }

    /* renamed from: c */
    public final void mo99989c(boolean z) {
        if (this.f104463a != null) {
            this.f104463a.mo56127n(true);
        }
    }

    /* renamed from: b */
    public final void mo99988b(boolean z) {
        int i;
        String str;
        String str2;
        String str3;
        this.f104469g = z ? 1 : 0;
        int g = m128436g();
        if (z) {
            i = g;
        } else {
            i = 0;
        }
        this.f104465c = i;
        C29289b a = C35563c.f93224F.mo70097l().mo74948a();
        I18nManagerService i18nManagerService = (I18nManagerService) ServiceManager.get().getService(I18nManagerService.class);
        if (VERSION.SDK_INT > 18) {
            if (this.f104468f) {
                str2 = "1";
            } else {
                str2 = "2";
            }
            if (C23544m.m77321a(str2, "1")) {
                if (this.f104468f) {
                    str3 = "1";
                } else {
                    str3 = "2";
                }
                this.f104466d = C23544m.m77322b(str3, "1");
                this.f104463a.mo56115f(this.f104474l, this.f104475m);
            } else if (!C6399b.m19944t()) {
                this.f104466d = C35563c.f93224F.mo70097l().mo74948a().mo74957b();
                this.f104463a.mo56115f(this.f104474l, this.f104475m);
            } else if (i18nManagerService != null && i18nManagerService.isIndonesiaByMcc()) {
                this.f104466d = a.mo74958b(g);
                this.f104463a.mo56115f(0.35f, 0.75f);
            } else if (i18nManagerService == null || !i18nManagerService.isKorean()) {
                this.f104466d = a.mo74958b(g);
                this.f104463a.mo56115f(0.35f, 0.35f);
            } else {
                this.f104466d = a.mo74960c(g);
                this.f104463a.mo56115f(0.35f, 0.45f);
            }
        }
        this.f104463a.mo56049a(i, this.f104466d);
        if (C35563c.f93230L.mo93343b(Property.FaceDetectInterval) > 0) {
            this.f104463a.mo56095c(C35563c.f93230L.mo93343b(Property.FaceDetectInterval));
        }
        if (i18nManagerService != null && i18nManagerService.isKorean()) {
            if (this.f104468f) {
                str = "1";
            } else {
                str = "2";
            }
            if (!C23544m.m77321a(str, "1")) {
                if (z) {
                    C20749b bVar = this.f104463a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(a.mo74961d());
                    sb.append("facereshape_v2/");
                    bVar.mo56038a(sb.toString(), 0.2f, 0.2f);
                    return;
                }
                mo99969b(0.0f, 0.0f);
            }
        }
    }

    /* renamed from: d */
    public final void mo99977d(float f, float f2) {
        if (this.f104463a != null) {
            this.f104463a.mo56044a(f, f2);
        }
    }

    /* renamed from: e */
    public final void mo99979e(float f, float f2) {
        if (this.f104463a != null) {
            this.f104463a.mo56082b(f, f2);
        }
    }

    /* renamed from: f */
    public final void mo99980f(float f, float f2) {
        if (this.f104463a != null) {
            this.f104463a.mo56094c(f, 3.0f);
        }
    }

    /* renamed from: g */
    public final void mo99981g(float f, float f2) {
        if (this.f104463a != null) {
            this.f104463a.mo56103d(f, 6.0f);
        }
    }

    /* renamed from: h */
    public final void mo99982h(float f, float f2) {
        if (this.f104463a != null) {
            this.f104463a.mo56110e(f, f2);
        }
    }

    /* renamed from: c */
    public final void mo99975c(List<ComposerInfo> list, int i) {
        if (this.f104463a != null) {
            this.f104463a.mo56097c(list, i);
        }
    }

    /* renamed from: a */
    public final void mo99956a(float f, float f2) {
        String str;
        String str2;
        this.f104474l = f;
        this.f104475m = f2;
        if (this.f104468f) {
            str = "1";
        } else {
            str = "2";
        }
        if (C23544m.m77321a(str, "1")) {
            if (this.f104468f) {
                str2 = "1";
            } else {
                str2 = "2";
            }
            float b = C23533d.m77293b(0, str2);
            if (b >= 0.0f) {
                f *= b;
            }
        }
        this.f104463a.mo56115f(f, f2);
        if (f - 0.0f < 0.001f) {
            this.f104463a.mo56049a(0, "");
        } else {
            this.f104463a.mo56049a(m128436g(), this.f104466d);
        }
    }

    /* renamed from: b */
    public final void mo99969b(float f, float f2) {
        String str;
        String str2;
        String str3;
        String str4;
        this.f104470h = f;
        this.f104471i = f2;
        if (f - 0.0f >= 0.001f || f2 - 0.0f >= 0.001f) {
            if (this.f104468f) {
                str = "1";
            } else {
                str = "2";
            }
            if (C23544m.m77321a(str, "2")) {
                if (this.f104468f) {
                    str2 = "1";
                } else {
                    str2 = "2";
                }
                String b = C23544m.m77322b(str2, "2");
                if (this.f104468f) {
                    str3 = "1";
                } else {
                    str3 = "2";
                }
                float b2 = C23533d.m77293b(1, str3);
                if (b2 >= 0.0f) {
                    f2 *= b2;
                }
                if (this.f104468f) {
                    str4 = "1";
                } else {
                    str4 = "2";
                }
                float b3 = C23533d.m77293b(2, str4);
                if (b3 >= 0.0f) {
                    f *= b3;
                }
                m128434c(b, f, f2);
                return;
            }
            this.f104463a.mo56038a(C35563c.f93224F.mo70097l().mo74948a().mo74955a(), f, f2);
            return;
        }
        this.f104463a.mo56038a("", 0.0f, 0.0f);
    }

    /* renamed from: c */
    public final void mo99974c(float f, float f2) {
        String str;
        String str2;
        String str3;
        String str4;
        this.f104472j = f;
        this.f104473k = f2;
        String str5 = "";
        if (this.f104468f) {
            str = "1";
        } else {
            str = "2";
        }
        if (C23544m.m77321a(str, "3")) {
            if (this.f104468f) {
                str2 = "1";
            } else {
                str2 = "2";
            }
            str5 = C23544m.m77322b(str2, "3");
            if (this.f104468f) {
                str3 = "1";
            } else {
                str3 = "2";
            }
            float b = C23533d.m77293b(3, str3);
            if (b >= 0.0f) {
                f *= b;
            }
            if (this.f104468f) {
                str4 = "1";
            } else {
                str4 = "2";
            }
            float b2 = C23533d.m77293b(4, str4);
            if (b >= 0.0f) {
                f2 *= b2;
            }
        }
        this.f104463a.mo56076b(str5, f, f2);
    }

    /* renamed from: b */
    public final void mo99972b(List<ComposerInfo> list, int i) {
        if (this.f104463a != null) {
            this.f104463a.mo56105d(list, VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
        }
    }

    /* renamed from: b */
    public final void mo99971b(String str, float f, float f2) {
        this.f104463a.mo56038a(str, f, f2);
    }

    /* renamed from: c */
    private void m128434c(String str, float f, float f2) {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(4), Float.valueOf(f));
        hashMap.put(Integer.valueOf(5), Float.valueOf(f2));
        hashMap.put(Integer.valueOf(30), Float.valueOf(f2));
        hashMap.put(Integer.valueOf(21), Float.valueOf(f2));
        hashMap.put(Integer.valueOf(24), Float.valueOf(f2));
        hashMap.put(Integer.valueOf(26), Float.valueOf(f2));
        hashMap.put(Integer.valueOf(29), Float.valueOf(f2));
        this.f104463a.mo56067a(str, (Map<Integer, Float>) hashMap);
    }

    /* renamed from: b */
    public final void mo99970b(int i, List<C29296g> list, float f) {
        int i2;
        float f2;
        if (m128433c(f) == -1) {
            int i3 = i - 1;
            if (i3 < 0) {
                i3 = 0;
            }
            int i4 = i3;
            i2 = i;
            i = i4;
        } else {
            i2 = i + 1;
            if (i2 >= list.size()) {
                i2 = list.size() - 1;
            }
        }
        String b = ((C29296g) list.get(i)).mo74978b();
        String b2 = ((C29296g) list.get(i2)).mo74978b();
        if (f < 0.0f) {
            f2 = Math.abs(f);
        } else {
            f2 = 1.0f - f;
        }
        C20749b bVar = this.f104463a;
        C29296g gVar = (C29296g) list.get(i);
        C20749b bVar2 = this.f104463a;
        bVar2.getClass();
        float b3 = C29297h.m96119b(gVar, C40194h.m128486a(bVar2));
        C29296g gVar2 = (C29296g) list.get(i2);
        C20749b bVar3 = this.f104463a;
        bVar3.getClass();
        bVar.mo56066a(b, b2, f2, b3, C29297h.m96119b(gVar2, C40195i.m128488a(bVar3)));
    }

    /* renamed from: a */
    public final void mo99960a(int i, List<C29296g> list, float f) {
        int i2;
        float f2;
        if (m128433c(f) == -1) {
            int i3 = i - 1;
            if (i3 < 0) {
                i3 = 0;
            }
            int i4 = i3;
            i2 = i;
            i = i4;
        } else {
            i2 = i + 1;
            if (i2 >= list.size()) {
                i2 = list.size() - 1;
            }
        }
        String b = ((C29296g) list.get(i)).mo74978b();
        String b2 = ((C29296g) list.get(i2)).mo74978b();
        if (f < 0.0f) {
            f2 = Math.abs(f);
        } else {
            f2 = 1.0f - f;
        }
        this.f104463a.mo56065a(b, b2, f2);
    }

    /* renamed from: a */
    public final void mo99959a(int i, float f, float f2, int i2) {
        if (this.f104463a != null) {
            this.f104463a.mo56047a(i, f, f2, i2);
        }
    }

    /* renamed from: a */
    public final void mo99957a(float f, float f2, float f3, float f4, float f5) {
        if (this.f104463a != null) {
            this.f104463a.mo56045a(f, f2, f3, f4, 1.0f);
        }
    }
}
