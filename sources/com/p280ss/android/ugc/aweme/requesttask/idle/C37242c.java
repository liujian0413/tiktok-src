package com.p280ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.statisticlogger.C10981a;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.applog.TeaAgent;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.lego.C7152c;
import com.p280ss.android.ugc.aweme.lego.RequestType;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.c */
public final class C37242c implements C7152c {

    /* renamed from: a */
    public static final String f97361a = f97361a;

    /* renamed from: b */
    public static final String f97362b = f97362b;

    /* renamed from: c */
    public static final String f97363c = f97363c;

    /* renamed from: d */
    public static final String f97364d = f97364d;

    /* renamed from: e */
    public static final String f97365e = f97365e;

    /* renamed from: f */
    public static final C37243a f97366f = new C37243a(null);

    /* renamed from: com.ss.android.ugc.aweme.requesttask.idle.c$a */
    public static final class C37243a {
        private C37243a() {
        }

        public /* synthetic */ C37243a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final RequestType mo18606a() {
        if (C6399b.m19944t()) {
            return RequestType.NORMAL;
        }
        boolean z = true;
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            z = true ^ a.getDisableDelayAppAlertRequest().booleanValue();
        } catch (Exception unused) {
        }
        if (!m119685b() || !z) {
            return RequestType.NORMAL;
        }
        return RequestType.IDLE;
    }

    /* renamed from: b */
    private static boolean m119685b() {
        String a = C6887b.m21436b().mo16896a(AwemeApplication.m21341a(), f97362b);
        String a2 = C6887b.m21436b().mo16896a(AwemeApplication.m21341a(), f97363c);
        String a3 = C6887b.m21436b().mo16896a(AwemeApplication.m21341a(), f97364d);
        String a4 = C6887b.m21436b().mo16896a(AwemeApplication.m21341a(), f97365e);
        if (!TextUtils.equals(C6399b.m19934j(), a) || !TextUtils.equals(C6399b.m19941q(), a2) || !TextUtils.equals(C10981a.m32174d(), a3) || !TextUtils.equals(C10981a.m32170b(), a4)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static void m119686c() {
        C6887b.m21436b().mo16901a((Context) AwemeApplication.m21341a(), f97362b, C6399b.m19934j());
        C6887b.m21436b().mo16901a((Context) AwemeApplication.m21341a(), f97363c, C6399b.m19941q());
        C6887b.m21436b().mo16901a((Context) AwemeApplication.m21341a(), f97364d, AppLog.getServerDeviceId());
        C6887b.m21436b().mo16901a((Context) AwemeApplication.m21341a(), f97365e, AppLog.getInstallId());
    }

    /* renamed from: a */
    public final void mo18607a(Context context, boolean z) {
        C7573i.m23587b(context, "context");
        TeaAgent.activeUser(AwemeApplication.m21341a());
        m119686c();
        C19282c.m63183a(context, "monitor", "app_alert", 0, 0);
    }
}
