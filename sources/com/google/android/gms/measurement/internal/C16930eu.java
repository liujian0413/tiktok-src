package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.p749d.C15176d;
import com.google.android.gms.common.util.C15322e;
import com.google.android.gms.common.util.C15335r;
import com.google.android.gms.measurement.internal.C16942h.C16943a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.measurement.internal.eu */
public final class C16930eu extends C16848bu {

    /* renamed from: a */
    public C16932ew f47356a = C16931ev.f47359a;

    /* renamed from: b */
    private Boolean f47357b;

    /* renamed from: c */
    private Boolean f47358c;

    C16930eu(C16825ay ayVar) {
        super(ayVar);
        C16942h.m56209a(ayVar);
    }

    /* renamed from: d */
    static String m56087d() {
        return (String) C16942h.f47441i.mo44132a();
    }

    /* renamed from: a */
    public final int mo44046a(String str) {
        return mo44049b(str, C16942h.f47455w);
    }

    /* renamed from: e */
    public final boolean mo44055e() {
        if (this.f47358c == null) {
            synchronized (this) {
                if (this.f47358c == null) {
                    ApplicationInfo applicationInfo = mo43581m().getApplicationInfo();
                    String a = C15335r.m44607a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f47358c = Boolean.valueOf(str != null && str.equals(a));
                    }
                    if (this.f47358c == null) {
                        this.f47358c = Boolean.TRUE;
                        mo43585q().f47487a.mo44160a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f47358c.booleanValue();
    }

    /* renamed from: a */
    public final long mo44047a(String str, C16943a<Long> aVar) {
        if (str == null) {
            return ((Long) aVar.mo44132a()).longValue();
        }
        String a = this.f47356a.mo43629a(str, aVar.f47459a);
        if (TextUtils.isEmpty(a)) {
            return ((Long) aVar.mo44132a()).longValue();
        }
        try {
            return ((Long) aVar.mo44133a(Long.valueOf(Long.parseLong(a)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) aVar.mo44132a()).longValue();
        }
    }

    /* renamed from: b */
    public final int mo44049b(String str, C16943a<Integer> aVar) {
        if (str == null) {
            return ((Integer) aVar.mo44132a()).intValue();
        }
        String a = this.f47356a.mo43629a(str, aVar.f47459a);
        if (TextUtils.isEmpty(a)) {
            return ((Integer) aVar.mo44132a()).intValue();
        }
        try {
            return ((Integer) aVar.mo44133a(Integer.valueOf(Integer.parseInt(a)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) aVar.mo44132a()).intValue();
        }
    }

    /* renamed from: c */
    public final boolean mo44052c(String str, C16943a<Boolean> aVar) {
        if (str == null) {
            return ((Boolean) aVar.mo44132a()).booleanValue();
        }
        String a = this.f47356a.mo43629a(str, aVar.f47459a);
        if (TextUtils.isEmpty(a)) {
            return ((Boolean) aVar.mo44132a()).booleanValue();
        }
        return ((Boolean) aVar.mo44133a(Boolean.valueOf(Boolean.parseBoolean(a)))).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo44054d(String str, C16943a<Boolean> aVar) {
        return mo44052c(str, aVar);
    }

    /* renamed from: a */
    public final boolean mo44048a(C16943a<Boolean> aVar) {
        return mo44052c(null, aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Boolean mo44050b(String str) {
        C15267r.m44386a(str);
        try {
            if (mo43581m().getPackageManager() == null) {
                mo43585q().f47487a.mo44160a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = C15176d.m44159a(mo43581m()).mo38462a(mo43581m().getPackageName(), (int) PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            if (a == null) {
                mo43585q().f47487a.mo44160a("Failed to load metadata: ApplicationInfo is null");
                return null;
            } else if (a.metaData == null) {
                mo43585q().f47487a.mo44160a("Failed to load metadata: Metadata bundle is null");
                return null;
            } else if (!a.metaData.containsKey(str)) {
                return null;
            } else {
                return Boolean.valueOf(a.metaData.getBoolean(str));
            }
        } catch (NameNotFoundException e) {
            mo43585q().f47487a.mo44161a("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* renamed from: f */
    public final boolean mo44057f() {
        Boolean b = mo44050b("firebase_analytics_collection_deactivated");
        return b != null && b.booleanValue();
    }

    /* renamed from: g */
    public final Boolean mo44059g() {
        return mo44050b("firebase_analytics_collection_enabled");
    }

    /* renamed from: h */
    public static long m56088h() {
        return ((Long) C16942h.f47391L.mo44132a()).longValue();
    }

    /* renamed from: i */
    public static long m56089i() {
        return ((Long) C16942h.f47444l.mo44132a()).longValue();
    }

    /* renamed from: j */
    public final String mo44063j() {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{"debug.firebase.analytics.app", ""});
        } catch (ClassNotFoundException e) {
            mo43585q().f47487a.mo44161a("Could not find SystemProperties class", e);
            return "";
        } catch (NoSuchMethodException e2) {
            mo43585q().f47487a.mo44161a("Could not find SystemProperties.get() method", e2);
            return "";
        } catch (IllegalAccessException e3) {
            mo43585q().f47487a.mo44161a("Could not access SystemProperties.get()", e3);
            return "";
        } catch (InvocationTargetException e4) {
            mo43585q().f47487a.mo44161a("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    /* renamed from: t */
    public static boolean m56090t() {
        return ((Boolean) C16942h.f47440h.mo44132a()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo44051c(String str) {
        return "1".equals(this.f47356a.mo43629a(str, "gaia_collection_enabled"));
    }

    /* renamed from: d */
    public final boolean mo44053d(String str) {
        return "1".equals(this.f47356a.mo43629a(str, "measurement.event_sampling_enabled"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo44056e(String str) {
        return mo44052c(str, C16942h.f47401V);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo44058f(String str) {
        return mo44052c(str, C16942h.f47403X);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo44060g(String str) {
        return mo44052c(str, C16942h.f47404Y);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo44061h(String str) {
        return mo44052c(str, C16942h.f47395P);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final boolean mo44062i(String str) {
        return mo44052c(str, C16942h.f47405Z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final boolean mo44064j(String str) {
        return mo44052c(str, C16942h.f47408aa);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final boolean mo44065k(String str) {
        return mo44052c(str, C16942h.f47410ac);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final boolean mo44066l(String str) {
        return mo44052c(str, C16942h.f47411ad);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final boolean mo44067m(String str) {
        return mo44052c(str, C16942h.f47412ae);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final boolean mo44068n(String str) {
        return mo44052c(str, C16942h.f47414ag);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final boolean mo44075u() {
        if (this.f47357b == null) {
            this.f47357b = mo44050b("app_measurement_lite");
            if (this.f47357b == null) {
                this.f47357b = Boolean.valueOf(false);
            }
        }
        if (this.f47357b.booleanValue() || !this.f47095q.f47008d) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final boolean mo44069o(String str) {
        return mo44052c(str, C16942h.f47413af);
    }

    /* renamed from: v */
    static boolean m56091v() {
        return ((Boolean) C16942h.f47415ah.mo44132a()).booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final boolean mo44070p(String str) {
        return mo44052c(str, C16942h.f47416ai);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final boolean mo44071q(String str) {
        return mo44052c(str, C16942h.f47417aj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final boolean mo44072r(String str) {
        return mo44052c(str, C16942h.f47418ak);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final boolean mo44073s(String str) {
        return mo44052c(str, C16942h.f47419al);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public final boolean mo44074t(String str) {
        return mo44052c(str, C16942h.f47421an);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo43566a() {
        super.mo43566a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo43569b() {
        super.mo43569b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo43571c() {
        super.mo43571c();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C16827b mo43579k() {
        return super.mo43579k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C15322e mo43580l() {
        return super.mo43580l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo43581m() {
        return super.mo43581m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C16951p mo43582n() {
        return super.mo43582n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C16922em mo43583o() {
        return super.mo43583o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C16820at mo43584p() {
        return super.mo43584p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C16953r mo43585q() {
        return super.mo43585q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C16806af mo43586r() {
        return super.mo43586r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C16930eu mo43587s() {
        return super.mo43587s();
    }
}
