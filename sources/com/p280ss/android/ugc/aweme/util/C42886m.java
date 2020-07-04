package com.p280ss.android.ugc.aweme.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C22766ac;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ugc.aweme.util.m */
public final class C42886m {

    /* renamed from: a */
    private static final boolean f111391a;

    static {
        boolean z;
        if (C7163a.m22363a() || C6399b.m19928c()) {
            z = true;
        } else {
            z = false;
        }
        f111391a = z;
    }

    /* renamed from: a */
    private static boolean m136180a(Activity activity) {
        if (!f111391a || activity == null) {
            return false;
        }
        try {
            String num = Integer.toString(C6399b.m19935k());
            String str = "";
            Class cls = Class.forName("com.ss.android.module.verify_applog.AppLogVerifyClient");
            Method declaredMethod = cls.getDeclaredMethod("init", new Class[]{String.class, String.class, Boolean.TYPE});
            Method declaredMethod2 = cls.getDeclaredMethod("getUserOrNull", new Class[]{Context.class});
            Method declaredMethod3 = cls.getDeclaredMethod("beginVerifyAppLog", new Class[]{Activity.class, String.class});
            Method declaredMethod4 = cls.getDeclaredMethod("inst", new Class[0]);
            Method declaredMethod5 = cls.getDeclaredMethod("tryInit", new Class[]{Context.class, String.class, String.class});
            declaredMethod.invoke(null, new Object[]{num, str, Boolean.valueOf(true)});
            declaredMethod3.invoke(null, new Object[]{activity, (String) declaredMethod2.invoke(null, new Object[]{activity})});
            declaredMethod5.invoke(declaredMethod4.invoke(null, new Object[0]), new Object[]{activity, num, str});
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static void m136182b(String str, Activity activity) {
        Uri parse = Uri.parse(str);
        StringBuilder sb = new StringBuilder();
        sb.append(parse.getHost());
        sb.append(parse.getPath());
        String sb2 = sb.toString();
        if (sb2.charAt(sb2.length() - 1) == '/') {
            sb2 = sb2.substring(0, sb2.length() - 1);
        }
        m136179a(sb2, (Context) activity);
    }

    /* renamed from: a */
    public static void m136179a(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            C22766ac.m75145a().mo59818a(str);
            C7285c.m22838a(context, "test_data", 0).edit().putString("host", str).apply();
            C10761a.m31409e(context.getApplicationContext(), (int) R.string.b2h).mo25750a();
            return;
        }
        C22766ac.m75145a().mo59818a("");
        C7285c.m22838a(context, "test_data", 0).edit().putString("host", "").apply();
        C10761a.m31409e(context.getApplicationContext(), (int) R.string.b2e).mo25750a();
    }

    /* renamed from: a */
    public static boolean m136181a(String str, Activity activity) {
        if (!C7163a.m22363a()) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (10304 == parse.getPort() && "/bytedance/log/".equals(parse.getPath())) {
                StringBuilder sb = new StringBuilder();
                sb.append(parse.getHost());
                sb.append(":");
                sb.append(parse.getPort());
                m136179a(sb.toString(), (Context) activity);
                activity.finish();
                return true;
            } else if (!TextUtils.equals("/aweme/commercialize/debug/start_app_log_verify_client", parse.getPath()) || !m136180a(activity)) {
                return false;
            } else {
                return true;
            }
        } catch (Exception unused) {
        }
    }
}
