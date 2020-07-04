package com.p280ss.android.ugc.aweme.sec;

import android.app.Activity;
import android.content.Context;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p255e.C6326a;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.sec.p1509a.C37398a;
import com.p280ss.android.ugc.aweme.sec.p1509a.C37400c;
import com.p280ss.android.ugc.aweme.sec.p1510b.C37405a;
import com.p280ss.android.ugc.aweme.sec.p1511c.C37409b;
import com.p280ss.android.ugc.aweme.secapi.C37420a;
import com.p280ss.android.ugc.aweme.secapi.C37421b;
import com.p280ss.sys.ces.out.ISdk;
import com.p280ss.sys.ces.out.StcSDKFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sec.a */
public final class C37396a {

    /* renamed from: a */
    public static final C37396a f97654a = new C37396a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f97655b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static ISdk f97656c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static C37400c f97657d;

    /* renamed from: e */
    private static C37405a f97658e;

    /* renamed from: f */
    private static ArrayList<String> f97659f = new ArrayList<>();

    /* renamed from: g */
    private static String f97660g;

    /* renamed from: h */
    private static String f97661h;

    /* renamed from: i */
    private static String f97662i;

    /* renamed from: j */
    private static String f97663j;

    /* renamed from: k */
    private static boolean f97664k;

    /* renamed from: l */
    private static boolean f97665l;

    /* renamed from: com.ss.android.ugc.aweme.sec.a$a */
    static final class C37397a<TTaskResult, TContinuationResult> implements C1591g<Void, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C37421b f97666a;

        /* renamed from: b */
        final /* synthetic */ boolean f97667b;

        /* renamed from: c */
        final /* synthetic */ String f97668c;

        /* renamed from: d */
        final /* synthetic */ int f97669d;

        /* renamed from: e */
        final /* synthetic */ String f97670e;

        /* renamed from: f */
        final /* synthetic */ String f97671f;

        /* renamed from: g */
        final /* synthetic */ Context f97672g;

        C37397a(C37421b bVar, boolean z, String str, int i, String str2, String str3, Context context) {
            this.f97666a = bVar;
            this.f97667b = z;
            this.f97668c = str;
            this.f97669d = i;
            this.f97670e = str2;
            this.f97671f = str3;
            this.f97672g = context;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m120013a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120013a(C1592h<Void> hVar) {
            String str;
            String str2;
            long currentTimeMillis = System.currentTimeMillis();
            String a = this.f97666a.mo18657a();
            long currentTimeMillis2 = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder("initSCCheckUtil getSessionTime = ");
            sb.append(currentTimeMillis2 - currentTimeMillis);
            C37409b.m120035a("SecCaptcha", sb.toString());
            long currentTimeMillis3 = System.currentTimeMillis();
            ISdk a2 = C37396a.f97656c;
            if (a2 != null) {
                a2.setSession(a);
            }
            long currentTimeMillis4 = System.currentTimeMillis();
            StringBuilder sb2 = new StringBuilder("init setSessionTime = ");
            sb2.append(currentTimeMillis4 - currentTimeMillis3);
            C37409b.m120035a("DmtSec", sb2.toString());
            if (AppLog.getServerDeviceId() != null) {
                str = AppLog.getServerDeviceId();
            } else {
                str = "";
            }
            String str3 = str;
            if (AppLog.getInstallId() != null) {
                str2 = AppLog.getInstallId();
            } else {
                str2 = "";
            }
            String str4 = str2;
            if (this.f97667b) {
                String str5 = this.f97668c;
                int i = this.f97669d;
                String str6 = this.f97670e;
                C7573i.m23582a((Object) str4, "iid");
                C7573i.m23582a((Object) str3, "did");
                C37398a aVar = new C37398a(str5, i, str6, str4, str3, this.f97671f, a, 0, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, null);
                long currentTimeMillis5 = System.currentTimeMillis();
                C37396a aVar2 = C37396a.f97654a;
                Context applicationContext = this.f97672g.getApplicationContext();
                C7573i.m23582a((Object) applicationContext, "context.applicationContext");
                C37396a.f97657d = new C37400c(applicationContext, aVar);
                if (C6399b.m19944t()) {
                    C37396a.m120008b(C37396a.f97654a).mo94171b();
                }
                long currentTimeMillis6 = System.currentTimeMillis();
                StringBuilder sb3 = new StringBuilder("init createSecCaptchaTime = ");
                sb3.append(currentTimeMillis6 - currentTimeMillis5);
                C37409b.m120035a("DmtSec", sb3.toString());
            }
            C37396a.f97655b = true;
            C37396a.m120011c();
        }
    }

    private C37396a() {
    }

    /* renamed from: a */
    public static final void m120000a() {
        C37409b.m120035a("DmtSec", "loadSo");
    }

    /* renamed from: d */
    public static String m120012d() {
        ISdk iSdk = f97656c;
        if (iSdk != null) {
            return iSdk.onEvent();
        }
        return null;
    }

    static {
        C6326a.m19641a("cms");
    }

    /* renamed from: b */
    public static void m120009b() {
        String str;
        String str2;
        if (C6399b.m19928c()) {
            C37409b.m120035a("SecDialog", "setParams return ");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (AppLog.getServerDeviceId() != null) {
            str = AppLog.getServerDeviceId();
        } else {
            str = "";
        }
        if (AppLog.getInstallId() != null) {
            str2 = AppLog.getInstallId();
        } else {
            str2 = "";
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        ISdk iSdk = f97656c;
        if (iSdk != null) {
            iSdk.setParams(str, str2);
        }
        StringBuilder sb = new StringBuilder("init setParamsTime = ");
        sb.append(currentTimeMillis2 - currentTimeMillis);
        C37409b.m120035a("DmtSec", sb.toString());
    }

    /* renamed from: c */
    public static final void m120011c() {
        if (f97664k || f97665l) {
            String str = f97660g;
            if (str == null) {
                C7573i.m23583a("currentDid");
            }
            String str2 = f97661h;
            if (str2 == null) {
                C7573i.m23583a("currentIid");
            }
            if (f97664k) {
                str = f97662i;
                if (str == null) {
                    C7573i.m23583a("targetDid");
                }
                f97664k = false;
            }
            if (f97665l) {
                str2 = f97663j;
                if (str2 == null) {
                    C7573i.m23583a("targetIid");
                }
                f97665l = false;
            }
            m120006a(str, str2);
        }
        synchronized (f97654a) {
            ArrayList<String> arrayList = f97659f;
            if (!(!f97659f.isEmpty())) {
                arrayList = null;
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    C7573i.m23582a((Object) str3, "report");
                    m120005a(str3);
                }
            }
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ C37400c m120008b(C37396a aVar) {
        C37400c cVar = f97657d;
        if (cVar == null) {
            C7573i.m23583a("captcha");
        }
        return cVar;
    }

    /* renamed from: b */
    public static final boolean m120010b(String str) {
        C7573i.m23587b(str, "url");
        if (!f97655b) {
            return false;
        }
        if (f97657d == null) {
            C7573i.m23583a("captcha");
        }
        return C37400c.m120019a(str);
    }

    /* renamed from: a */
    public static final synchronized void m120005a(String str) {
        synchronized (C37396a.class) {
            C7573i.m23587b(str, "scene");
            StringBuilder sb = new StringBuilder("report .... scene = ");
            sb.append(str);
            sb.append(", initSuccess = ");
            sb.append(f97655b);
            C37409b.m120035a("DmtSec", sb.toString());
            if (f97655b) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!C6399b.m19944t()) {
                    if (!str.equals("cold_start")) {
                        C37405a aVar = f97658e;
                        if (aVar == null) {
                            C7573i.m23583a("report");
                        }
                        aVar.mo94174a(str);
                    }
                } else if (C6399b.m19944t()) {
                    C37405a aVar2 = f97658e;
                    if (aVar2 == null) {
                        C7573i.m23583a("report");
                    }
                    aVar2.mo94174a(str);
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder("report time = ");
                sb2.append(currentTimeMillis2 - currentTimeMillis);
                C37409b.m120035a("DmtSec", sb2.toString());
                return;
            }
            f97659f.add(str);
        }
    }

    /* renamed from: a */
    public static final boolean m120007a(int i) {
        if (!f97655b) {
            return false;
        }
        if (f97657d == null) {
            C7573i.m23583a("captcha");
        }
        return C37400c.m120018a(i);
    }

    /* renamed from: a */
    public static final void m120006a(String str, String str2) {
        C7573i.m23587b(str, "deviceId");
        C7573i.m23587b(str2, "iid");
        if (f97655b) {
            f97660g = str;
            f97661h = str2;
            long currentTimeMillis = System.currentTimeMillis();
            if (!C6399b.m19928c()) {
                ISdk iSdk = f97656c;
                if (iSdk != null) {
                    iSdk.setParams(str, str2);
                }
            } else {
                C37409b.m120035a("SecDialog", "updateDeviceIdAndInstallId setParams else ");
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder("updateDeviceIdAndInstallId setParamsTime = ");
            sb.append(currentTimeMillis2 - currentTimeMillis);
            sb.append(", deviceId = ");
            sb.append(str);
            sb.append(", iid = ");
            sb.append(str2);
            C37409b.m120035a("DmtSec", sb.toString());
            C37400c cVar = f97657d;
            if (cVar == null) {
                C7573i.m23583a("captcha");
            }
            cVar.mo94170a(str, str2);
            return;
        }
        f97663j = str2;
        f97662i = str;
        f97665l = true;
        f97664k = true;
    }

    /* renamed from: a */
    public static final void m120001a(int i, Activity activity, C37420a aVar) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(aVar, "listener");
        if (f97655b) {
            long currentTimeMillis = System.currentTimeMillis();
            C37400c cVar = f97657d;
            if (cVar == null) {
                C7573i.m23583a("captcha");
            }
            cVar.mo94169a(i, activity, aVar);
            long currentTimeMillis2 = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder("popCaptcha time = ");
            sb.append(currentTimeMillis2 - currentTimeMillis);
            C37409b.m120035a("DmtSec", sb.toString());
        }
    }

    /* renamed from: a */
    public static final void m120002a(Context context, String str, int i, String str2, String str3, boolean z, C37421b bVar) {
        Context context2 = context;
        String str4 = str;
        int i2 = i;
        String str5 = str2;
        String str6 = str3;
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str4, "language");
        C7573i.m23587b(str5, "appName");
        C7573i.m23587b(str6, "channel");
        C7573i.m23587b(bVar, "secService");
        StringBuilder sb = new StringBuilder("init language = ");
        sb.append(str4);
        sb.append(", aid = ");
        sb.append(i2);
        sb.append(", appName = ");
        sb.append(str5);
        sb.append(", channel= ");
        sb.append(str6);
        C37409b.m120035a("DmtSec", sb.toString());
        long currentTimeMillis = System.currentTimeMillis();
        long currentTimeMillis2 = System.currentTimeMillis();
        f97656c = StcSDKFactory.getSDK(context, (long) i2);
        long currentTimeMillis3 = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("init getSdkTime = ");
        sb2.append(currentTimeMillis3 - currentTimeMillis2);
        C37409b.m120035a("DmtSec", sb2.toString());
        long currentTimeMillis4 = System.currentTimeMillis();
        if (!C6399b.m19944t()) {
            ISdk iSdk = f97656c;
            if (iSdk != null) {
                iSdk.SetRegionType(0);
            }
        } else if (C6399b.m19946v()) {
            ISdk iSdk2 = f97656c;
            if (iSdk2 != null) {
                iSdk2.SetRegionType(3);
            }
        } else if (C6399b.m19947w()) {
            ISdk iSdk3 = f97656c;
            if (iSdk3 != null) {
                iSdk3.SetRegionType(2);
            }
        }
        long currentTimeMillis5 = System.currentTimeMillis();
        StringBuilder sb3 = new StringBuilder("init setRegionTime = ");
        sb3.append(currentTimeMillis5 - currentTimeMillis4);
        C37409b.m120035a("DmtSec", sb3.toString());
        f97658e = new C37405a(f97656c);
        C1592h a = C1592h.m7848a(1000);
        C37397a aVar = new C37397a(bVar, z, str, i, str2, str3, context);
        a.mo6876a((C1591g<TResult, TContinuationResult>) aVar, (Executor) C1592h.f5957a);
        long currentTimeMillis6 = System.currentTimeMillis();
        StringBuilder sb4 = new StringBuilder("init Time = ");
        sb4.append(currentTimeMillis6 - currentTimeMillis);
        C37409b.m120035a("DmtSec", sb4.toString());
    }
}
