package com.p280ss.android.ugc.aweme.sdk.p1508b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.common.utility.C6319n;
import java.net.URLDecoder;

/* renamed from: com.ss.android.ugc.aweme.sdk.b.b */
public final class C37318b {
    /* renamed from: a */
    private static boolean m119819a(String str) {
        return "1".equals(str);
    }

    /* renamed from: a */
    public static Intent m119818a(Context context, Uri uri) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (uri == null) {
            return null;
        }
        try {
            Intent intent = new Intent();
            intent.setClassName(context, "com.ss.android.ugc.aweme.app.AmeBrowserActivity");
            String queryParameter = uri.getQueryParameter("url");
            if (C6319n.m19593a(queryParameter)) {
                return null;
            }
            if (uri == null) {
                z = false;
            } else {
                z = m119819a(uri.getQueryParameter("rotate"));
            }
            if (uri == null) {
                z2 = false;
            } else {
                z2 = m119819a(uri.getQueryParameter("no_hw"));
            }
            if (uri == null) {
                z3 = false;
            } else {
                z3 = m119819a(uri.getQueryParameter("hide_more"));
            }
            if (uri == null) {
                z4 = false;
            } else {
                z4 = m119819a(uri.getQueryParameter("hide_bar"));
            }
            if (uri == null) {
                z5 = false;
            } else {
                z5 = m119819a(uri.getQueryParameter("hide_status_bar"));
            }
            if (uri == null) {
                z6 = false;
            } else {
                z6 = m119819a(uri.getQueryParameter("hide_nav_bar"));
            }
            if (uri == null) {
                z7 = false;
            } else {
                z7 = m119819a(uri.getQueryParameter("hide_more"));
            }
            if (z4 || z6) {
                intent.putExtra("hide_nav_bar", true);
            }
            if (z5) {
                intent.putExtra("hide_status_bar", true);
            }
            String queryParameter2 = uri.getQueryParameter("ad_id");
            if (!C6319n.m19593a(queryParameter2)) {
                try {
                    intent.putExtra("ad_id", Long.parseLong(queryParameter2));
                } catch (Exception unused) {
                }
            }
            String decode = URLDecoder.decode(queryParameter, "UTF-8");
            intent.setData(Uri.parse(decode));
            intent.putExtra("swipe_mode", 2);
            intent.putExtra("show_toolbar", true);
            if (z) {
                intent.putExtra("orientation", 0);
            }
            if (z2) {
                intent.putExtra("bundle_no_hw_acceleration", z2);
            }
            if (z3) {
                intent.putExtra("hide_more", z3);
            }
            if (z7) {
                intent.putExtra("hide_more", z7);
            }
            String queryParameter3 = uri.getQueryParameter("title");
            if (C6319n.m19593a(queryParameter3)) {
                queryParameter3 = Uri.parse(decode).getQueryParameter("title");
            }
            String queryParameter4 = uri.getQueryParameter("title_extra");
            if (C6319n.m19593a(queryParameter4)) {
                queryParameter4 = queryParameter3;
            }
            if (!C6319n.m19593a(queryParameter4)) {
                intent.putExtra("title", queryParameter4);
            } else {
                intent.putExtra("title", " ");
                intent.putExtra("bundle_user_webview_title", true);
            }
            String queryParameter5 = uri.getQueryParameter("gd_label");
            if (!C6319n.m19593a(queryParameter5)) {
                intent.putExtra("gd_label", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("gd_ext_json");
            if (!C6319n.m19593a(queryParameter6)) {
                intent.putExtra("gd_ext_json", queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter("webview_track_key");
            if (!C6319n.m19593a(queryParameter7)) {
                intent.putExtra("webview_track_key", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("wap_headers");
            if (!C6319n.m19593a(queryParameter8)) {
                intent.putExtra("wap_headers", queryParameter8);
            }
            return intent;
        } catch (Exception unused2) {
            return null;
        }
    }
}
