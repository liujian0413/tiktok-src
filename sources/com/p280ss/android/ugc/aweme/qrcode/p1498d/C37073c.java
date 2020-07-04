package com.p280ss.android.ugc.aweme.qrcode.p1498d;

import android.net.Uri;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.C23060u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.qrcode.d.c */
public final class C37073c {

    /* renamed from: a */
    public static final List<String> f97028a = new ArrayList(Arrays.asList(new String[]{"v16.musical.ly", "v16.tiktokv.com", "v.douyin.com", "v.tiktok.com", "vt.tiktok.com", "vm.tiktok.com"}));

    /* renamed from: b */
    public static boolean m119202b(String str) {
        return Pattern.compile("(https?|http)://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str).find();
    }

    /* renamed from: a */
    public static boolean m119201a(String str) {
        if (m119202b(str)) {
            return m119200a(Uri.parse(str));
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m119203c(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("aweme://webview/")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m119204d(String str) {
        if (TextUtils.isEmpty(str) || (!str.startsWith("aweme://webview/") && !str.startsWith("aweme://ame/webview/"))) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m119205e(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("ttschema://view_grade_resource")) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m119206f(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("snssdk1128")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m119200a(Uri uri) {
        Set set = (Set) C23060u.m75742a().mo60082l().mo59877d();
        if (set.isEmpty()) {
            return f97028a.contains(uri.getHost());
        }
        return set.contains(uri.getHost());
    }
}
