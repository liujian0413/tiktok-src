package com.p280ss.android.ugc.aweme.login.p1372b;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.common.applog.TeaAgent;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.C21650aj;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.utils.C43173w;
import java.util.Map;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.login.b.a */
public final class C32650a {

    /* renamed from: a */
    public static final C32650a f85105a = new C32650a();

    /* renamed from: b */
    private static final boolean f85106b = C7163a.m22363a();

    /* renamed from: com.ss.android.ugc.aweme.login.b.a$a */
    static final class C32651a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f85107a;

        /* renamed from: b */
        final /* synthetic */ ContentValues f85108b;

        C32651a(String str, ContentValues contentValues) {
            this.f85107a = str;
            this.f85108b = contentValues;
        }

        public final void run() {
            ContentResolver contentResolver = C6399b.m19921a().getContentResolver();
            if (contentResolver != null) {
                Uri parse = Uri.parse("content://com.smartisanos.keyguard.provider/aweme");
                StringBuilder sb = new StringBuilder("Transmitting data to [");
                sb.append(parse);
                sb.append(']');
                C6921a.m21555a(sb.toString());
                C22984d a = new C22984d().mo59973a("source", this.f85107a);
                try {
                    contentResolver.insert(parse, this.f85108b);
                    a.mo59972a("is_success", (Object) Boolean.valueOf(true));
                } catch (Exception e) {
                    C6921a.m21559a((Throwable) e);
                    a.mo59972a("is_success", (Object) Boolean.valueOf(false));
                    a.mo59973a("error_desc", e.toString());
                }
                C6907h.m21524a("smartisan_data_transmission", (Map) a.f60753a);
            }
        }
    }

    private C32650a() {
    }

    /* renamed from: a */
    public static final void m105730a() {
        if (C6399b.m19945u()) {
            Intent intent = new Intent("com.ss.android.ugc.aweme.logout");
            intent.setPackage("com.smartisanos.keyguard");
            Activity g = C6405d.m19984g();
            if (g != null) {
                g.sendBroadcast(intent);
            }
        }
    }

    /* renamed from: c */
    private static boolean m105734c() {
        Boolean bool;
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            bool = a.getSmartisanDataSharingSwitch();
            C7573i.m23582a((Object) bool, "SettingsReader.get().smartisanDataSharingSwitch");
        } catch (NullValueException unused) {
            bool = Boolean.valueOf(false);
        }
        return bool.booleanValue();
    }

    /* renamed from: b */
    public static final void m105733b() {
        if (f85105a.m105735d()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("session_id", "");
            contentValues.put("install_id", "");
            m105731a(contentValues, "log_out");
        }
    }

    /* renamed from: d */
    private final boolean m105735d() {
        boolean z;
        String str;
        String str2 = Build.MANUFACTURER;
        C7573i.m23582a((Object) str2, "Build.MANUFACTURER");
        if (C7634n.m23717a(str2, "smartisan", true) || C7634n.m23717a(str2, "deltainno", true)) {
            z = true;
        } else {
            z = false;
        }
        boolean b = C6776h.m20948b(C6399b.m19921a(), "com.smartisanos.keyguard");
        if (f85106b) {
            StringBuilder sb = new StringBuilder("Data sharing ");
            if (m105734c()) {
                str = "enabled";
            } else {
                str = "disabled";
            }
            sb.append(str);
        }
        if (!m105734c() || !z || !b) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final void m105732a(String str) {
        C7573i.m23587b(str, "source");
        if (f85105a.m105735d()) {
            C21650aj dataService = C6861a.m21332a().dataService();
            ContentValues contentValues = new ContentValues();
            contentValues.put("session_id", dataService.getSessionKey());
            contentValues.put("install_id", TeaAgent.getInstallId());
            m105731a(contentValues, str);
        }
    }

    /* renamed from: a */
    private static void m105731a(ContentValues contentValues, String str) {
        C43173w.m136925a((Runnable) new C32651a(str, contentValues), "SmartisanManager");
    }
}
