package com.p280ss.android.ugc.aweme.p759ac;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;

/* renamed from: com.ss.android.ugc.aweme.ac.d */
public class C15461d {

    /* renamed from: a */
    private static volatile boolean f39788a;

    /* renamed from: b */
    private static final String[] f39789b = {"iid", "device_id", "channel", "aid", "app_name", "version_code", "version_name", "device_platform", "language", "openudid", "update_version_code", "_rticket"};

    /* renamed from: c */
    private static final String[] f39790c = {"X-Gorgon", "X-Khronos"};

    /* renamed from: d */
    private static boolean f39791d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static boolean f39792e;

    /* renamed from: f */
    private static AtomicBoolean f39793f = new AtomicBoolean(false);

    /* renamed from: g */
    private static Handler f39794g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private static int f39795h = -1;

    /* renamed from: d */
    private static boolean m45278d() {
        return C7163a.m22363a();
    }

    /* renamed from: b */
    private static void m45274b() {
        if (f39793f.compareAndSet(false, true)) {
            f39794g.postDelayed(C15462e.f39796a, 250000);
        }
    }

    /* renamed from: c */
    private static boolean m45277c() {
        if (f39791d || f39792e) {
            return true;
        }
        Context a = C6399b.m19921a();
        synchronized (C15461d.class) {
            if (f39795h < 0 && C15464g.m45280a(a)) {
                SharedPreferences a2 = C7285c.m22838a(a, "ttnet_lancet", 0);
                int i = a2.getInt("ttnet_lancet_check_first_user", 0);
                f39795h = i;
                if (i <= 0) {
                    Editor edit = a2.edit();
                    edit.putInt("ttnet_lancet_check_first_user", 1);
                    edit.commit();
                }
            }
        }
        if (f39795h <= 0) {
            return f39792e;
        }
        f39791d = true;
        return true;
    }

    /* renamed from: c */
    private static void m45276c(String str) {
        f39794g.post(new C15463f(str));
    }

    /* renamed from: a */
    public static void m45272a(String str) {
        String[] strArr;
        if (m45278d() && !f39788a) {
            f39788a = true;
            m45274b();
            HttpUrl parse = HttpUrl.parse(str);
            for (String str2 : f39789b) {
                if (C6319n.m19593a(parse.queryParameter(str2))) {
                    if (m45277c()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(f39792e);
                        sb.append(",");
                        sb.append(f39791d);
                        sb.append(",");
                        sb.append(f39795h);
                        sb.append(",url通用参数");
                        sb.append(str2);
                        sb.append("不能为空,如果有疑问请联系易进，url=");
                        sb.append(str);
                        m45276c(sb.toString());
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m45273a(String str, Map<String, String> map) {
        if (!m45278d() || !C6776h.m20947b(C6399b.m19921a())) {
            return;
        }
        if (map == null) {
            StringBuilder sb = new StringBuilder("header通用参数不能为空,url=");
            sb.append(str);
            m45276c(sb.toString());
            return;
        }
        String[] strArr = f39790c;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str2 = strArr[i];
            if (!TextUtils.isEmpty((CharSequence) map.get(str2)) || Uri.parse(str).getPath().equals("/v2/r")) {
                i++;
            } else {
                StringBuilder sb2 = new StringBuilder("header通用参数");
                sb2.append(str2);
                sb2.append("不能为空,url=");
                sb2.append(str);
                m45276c(sb2.toString());
                return;
            }
        }
    }
}
