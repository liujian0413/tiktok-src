package com.p280ss.android.newmedia.p892b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import java.net.URLDecoder;

/* renamed from: com.ss.android.newmedia.b.a */
public final class C19926a {
    /* renamed from: a */
    public static String m65746a() {
        if (!C6399b.m19946v()) {
            StringBuilder sb = new StringBuilder(C22909c.f60638b);
            sb.append(C6399b.m19935k());
            return sb.toString();
        } else if (TextUtils.isEmpty(C6399b.f18694b.mo15329x())) {
            return "musically";
        } else {
            return C6399b.f18694b.mo15329x();
        }
    }

    /* renamed from: c */
    private static boolean m65750c(String str) {
        if (C6319n.m19593a(str)) {
            return false;
        }
        return "1".equals(str);
    }

    /* renamed from: b */
    private static boolean m65749b(String str) {
        if (C6319n.m19593a(str)) {
            return false;
        }
        if (C22909c.f60637a.equals(str)) {
            return true;
        }
        String a = m65746a();
        if (C6319n.m19593a(a) || !a.equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m65747a(String str) {
        if (C6319n.m19593a(str)) {
            return str;
        }
        try {
            String scheme = Uri.parse(str).getScheme();
            String a = m65746a();
            if (C22909c.f60637a.equals(scheme) || C22909c.f60639c.equals(scheme)) {
                str = str.replace(scheme, a);
            }
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: a */
    private static Intent m65745a(Context context, Uri uri) {
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
            intent.setClassName(context, "com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity");
            String queryParameter = uri.getQueryParameter("url");
            if (C6319n.m19593a(queryParameter)) {
                return null;
            }
            if (uri == null) {
                z = false;
            } else {
                z = m65750c(uri.getQueryParameter("rotate"));
            }
            if (uri == null) {
                z2 = false;
            } else {
                z2 = m65750c(uri.getQueryParameter("no_hw"));
            }
            if (uri == null) {
                z3 = false;
            } else {
                z3 = m65750c(uri.getQueryParameter("hide_more"));
            }
            if (uri == null) {
                z4 = false;
            } else {
                z4 = m65750c(uri.getQueryParameter("hide_bar"));
            }
            if (uri == null) {
                z5 = false;
            } else {
                z5 = m65750c(uri.getQueryParameter("hide_status_bar"));
            }
            if (uri == null) {
                z6 = false;
            } else {
                z6 = m65750c(uri.getQueryParameter("hide_nav_bar"));
            }
            if (uri == null) {
                z7 = false;
            } else {
                z7 = m65750c(uri.getQueryParameter("hide_more"));
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
            String queryParameter3 = uri.getQueryParameter("log_extra");
            if (!C6319n.m19593a(queryParameter3)) {
                intent.putExtra("bundle_download_app_log_extra", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("download_url");
            if (!C6319n.m19593a(queryParameter4)) {
                intent.putExtra("bundle_download_url", queryParameter4);
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
            String queryParameter5 = uri.getQueryParameter("title");
            if (C6319n.m19593a(queryParameter5)) {
                queryParameter5 = Uri.parse(decode).getQueryParameter("title");
            }
            String queryParameter6 = uri.getQueryParameter("title_extra");
            if (C6319n.m19593a(queryParameter6)) {
                queryParameter6 = queryParameter5;
            }
            if (!C6319n.m19593a(queryParameter6)) {
                intent.putExtra("title", queryParameter6);
            } else {
                intent.putExtra("title", " ");
                intent.putExtra("use_webview_title", true);
            }
            String queryParameter7 = uri.getQueryParameter("gd_label");
            if (!C6319n.m19593a(queryParameter7)) {
                intent.putExtra("gd_label", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("gd_ext_json");
            if (!C6319n.m19593a(queryParameter8)) {
                intent.putExtra("gd_ext_json", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("webview_track_key");
            if (!C6319n.m19593a(queryParameter9)) {
                intent.putExtra("webview_track_key", queryParameter9);
            }
            String queryParameter10 = uri.getQueryParameter("wap_headers");
            if (!C6319n.m19593a(queryParameter10)) {
                intent.putExtra("wap_headers", queryParameter10);
            }
            intent.putExtra("bundle_auto_play_audio", m65750c(uri.getQueryParameter("auto_play_bgm")));
            intent.putExtra("show_load_dialog", !m65750c(uri.getQueryParameter("hide_loading")));
            return intent;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m65748a(Context context, String str, String str2) {
        boolean z = false;
        if (context == null) {
            return false;
        }
        try {
            if (!C6319n.m19593a(str)) {
                Uri parse = Uri.parse(str);
                if (C19929d.m65759a(str)) {
                    try {
                        Intent intent = new Intent(context, CrossPlatformActivity.class);
                        intent.setData(parse);
                        intent.putExtra("swipe_mode", 2);
                        context.startActivity(intent);
                        return true;
                    } catch (Exception unused) {
                        z = true;
                    }
                } else {
                    String scheme = parse.getScheme();
                    boolean b = m65749b(scheme);
                    String host = parse.getHost();
                    if (b && C22912d.f60641a.equals(host)) {
                        Intent a = m65745a(context, parse);
                        a.putExtra("swipe_mode", 2);
                        if (a != null) {
                            context.startActivity(a);
                        }
                        return true;
                    } else if (b) {
                        Intent intent2 = new Intent();
                        intent2.setClassName(context, "com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity");
                        intent2.setData(parse);
                        intent2.putExtra(C22912d.f60643c, true);
                        context.startActivity(intent2);
                        return true;
                    } else {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(parse);
                        if (C6776h.m20944a(context, intent3)) {
                            intent3.putExtra(C22912d.f60642b, str);
                            context.startActivity(intent3);
                            return true;
                        } else if (scheme.startsWith(C22909c.f60638b)) {
                            StringBuilder sb = new StringBuilder(C22912d.f60644d);
                            sb.append(scheme);
                            Intent intent4 = new Intent(sb.toString());
                            if (C6776h.m20944a(context, intent4)) {
                                intent4.putExtra(C22912d.f60642b, str);
                                context.startActivity(intent4);
                                return true;
                            }
                        }
                    }
                }
            }
            if (!C6319n.m19593a((String) null) && C6776h.m20948b(context, null)) {
                context.startActivity(C6776h.m20941a(context, (String) null));
                return true;
            }
        } catch (Exception unused2) {
        }
        return z;
    }
}
