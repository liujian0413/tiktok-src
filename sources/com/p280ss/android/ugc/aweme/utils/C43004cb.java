package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.taobao.android.dexposed.ClassUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.utils.cb */
public final class C43004cb {
    /* renamed from: a */
    private static boolean m136501a(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    /* renamed from: b */
    private static boolean m136504b(String str) {
        if (str == null || !str.toLowerCase().contains("tiktok")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m136502a(String str, Context context) {
        if (!C6399b.m19944t()) {
            if (str == null || str.length() < 4) {
                C10761a.m31399c(context, (int) R.string.bfp).mo25750a();
                return false;
            }
        } else if (str == null || str.length() < 2) {
            C10761a.m31409e(context, (int) R.string.dn2).mo25750a();
            return false;
        }
        if (C6399b.m19944t() && str != null && str.length() > 24) {
            C10761a.m31409e(context, (int) R.string.dn3).mo25750a();
            return false;
        } else if (!str.matches("[0-9A-Za-z_.]*")) {
            if (!C6399b.m19944t()) {
                C10761a.m31399c(context, (int) R.string.bfq).mo25750a();
            } else {
                C10761a.m31409e(context, (int) R.string.dmz).mo25750a();
            }
            return false;
        } else if (m136501a(str)) {
            if (!C6399b.m19944t()) {
                C10761a.m31399c(context, (int) R.string.bfw).mo25750a();
            } else {
                C10761a.m31409e(context, (int) R.string.dn0).mo25750a();
            }
            return false;
        } else if (C6399b.m19944t() || !str.startsWith(ClassUtils.PACKAGE_SEPARATOR)) {
            return true;
        } else {
            C10761a.m31399c(context, (int) R.string.bfx).mo25750a();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m136503a(String str, String str2, String str3, Context context) {
        if (m136504b(str3) || TextUtils.equals(str, "2062")) {
            C10761a.m31399c(context, (int) R.string.bfv).mo25750a();
            return false;
        } else if (TextUtils.equals(str, "2064")) {
            if (!C6399b.m19944t()) {
                C10761a.m31399c(context, (int) R.string.bfs).mo25750a();
            } else {
                C10761a.m31409e(context, (int) R.string.dn1).mo25750a();
            }
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            return true;
        } else {
            C10761a.m31410e(context, str2).mo25750a();
            return false;
        }
    }
}
