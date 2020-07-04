package com.p280ss.android.ugc.aweme.crossplatform.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.p480a.C9700a;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.app.p1028c.C22911a;
import com.p280ss.android.ugc.aweme.commercialize.abtest.WebviewProgressBarExperiment;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b;
import com.p280ss.android.ugc.aweme.utils.C43097ei;
import com.p280ss.android.ugc.aweme.utils.C43098ej;
import com.p280ss.android.ugc.aweme.web.C43442e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.base.a */
public abstract class C25832a {
    /* renamed from: a */
    private static <T> T m84952a(Object obj) {
        return obj;
    }

    /* renamed from: a */
    public static String m84953a(int i) {
        switch (i) {
            case 1:
                return C22912d.f60641a;
            case 2:
                return "react-native";
            case 3:
                return "webview_back";
            default:
                return "unknown";
        }
    }

    /* renamed from: a */
    public static String m84955a(String str, int i) {
        if (str == null || !C19929d.m65759a(str)) {
            return str;
        }
        try {
            if (!C43442e.f112516a.contains(Uri.parse(str).getHost())) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str);
            if (!str.contains("?")) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            StringBuilder sb2 = new StringBuilder("status_bar_height=");
            sb2.append(i);
            sb.append(sb2.toString());
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static void m84957a(Activity activity, String str) {
        if (!C6319n.m19593a(str)) {
            try {
                Intent intent = new Intent();
                intent.setData(Uri.parse(str));
                intent.setAction("android.intent.action.VIEW");
                activity.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m84958a(View view, int i) {
        if (view != null) {
            view.setVisibility(0);
            LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = (int) C9738o.m28708b(view.getContext(), 44.0f);
            layoutParams.width = (int) C9738o.m28708b(view.getContext(), 44.0f);
            ((MarginLayoutParams) layoutParams).topMargin = (int) C9738o.m28708b(view.getContext(), 5.5f);
            view.setBackgroundResource(R.drawable.xr);
        }
    }

    /* renamed from: a */
    public static boolean m84961a(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        return charSequence2.startsWith(WebKitApi.SCHEME_HTTP) || charSequence2.startsWith(WebKitApi.SCHEME_HTTPS) || charSequence2.startsWith("about:");
    }

    /* renamed from: a */
    public static List<String> m84956a() {
        return Arrays.asList(new String[]{"iesdouyin.com", "douyincdn.com", "douyin.com", "snssdk.com", "amemv.com"});
    }

    /* renamed from: a */
    public static boolean m84959a(Uri uri, Bundle bundle, String str, boolean z) {
        if (uri == null || uri.getQueryParameter(str) == null) {
            return bundle != null ? bundle.getBoolean(str, z) : z;
        }
        return TextUtils.equals(uri.getQueryParameter(str), "1");
    }

    /* renamed from: a */
    public static String m84954a(Uri uri, Bundle bundle, String str) {
        if (uri != null && !TextUtils.isEmpty(uri.getQueryParameter(str))) {
            return uri.getQueryParameter(str);
        }
        if (bundle == null || TextUtils.isEmpty(bundle.getString(str))) {
            return null;
        }
        return bundle.getString(str);
    }

    /* renamed from: a */
    public static boolean m84962a(String str) {
        return !C6319n.m19593a(str) && "1".equals(str);
    }

    /* renamed from: a */
    public static boolean m84960a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("webview_progress_bar", C6384b.m19835a().mo15292a(WebviewProgressBarExperiment.class, true, "webview_progress_bar", C6384b.m19835a().mo15295d().webview_progress_bar, false));
    }

    /* renamed from: a */
    public static int m84943a(Activity activity) {
        if (C43098ej.m136712a()) {
            return ImmersionBar.getStatusBarHeight(activity);
        }
        return 0;
    }

    /* renamed from: b */
    public static Uri m84964b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Uri.parse(str);
    }

    /* renamed from: b */
    public static void m84965b(Activity activity, String str) {
        if (!C6319n.m19593a(str)) {
            C9700a.m28636a(activity, "", str);
            C9738o.m28694a((Context) activity, (int) R.drawable.zf, (int) R.string.e_4);
        }
    }

    /* renamed from: c */
    public static void m84968c(Activity activity, String str) {
        if (!TextUtils.isEmpty(str)) {
            activity.startActivity(C25833b.m84945a((Context) activity, Uri.parse("").buildUpon().appendQueryParameter("url", str).build()));
        }
    }

    /* renamed from: a */
    public static Intent m84946a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (!str.startsWith("https://") && !str.startsWith("http://")) {
            return null;
        }
        try {
            sb.append("aweme://ame/webview/?url=");
            sb.append(URLEncoder.encode(str, "ISO-8859-1"));
        } catch (Exception unused) {
        }
        return C25833b.m84945a(context, Uri.parse(sb.toString()));
    }

    /* renamed from: a */
    public static ImmersionBar m84947a(C25886b bVar, Activity activity) {
        if (!C43098ej.m136712a()) {
            return null;
        }
        if (bVar.f68473a.f68428a.intValue() != 2) {
            activity.findViewById(R.id.a5c).setPadding(0, C43098ej.m136713b(), 0, 0);
        }
        int statusBarColor = activity.getWindow().getStatusBarColor();
        C43098ej.m136711a(activity.getWindow());
        ImmersionBar keyboardEnable = ImmersionBar.with(activity).keyboardEnable(true, 32);
        keyboardEnable.init();
        if (bVar.f68476d.f68520o) {
            activity.findViewById(R.id.a5c).setPadding(0, 0, 0, 0);
            bVar.f68476d.f68521p = true;
        }
        if (bVar.f68476d.f68521p) {
            C43098ej.m136710a(activity, 0);
        }
        C43097ei.f111719a.mo104758a(activity, activity.getWindow(), bVar.f68476d.f68506a);
        if (bVar.f68476d.f68522q && (bVar.f68476d.f68520o || !C22911a.m75401a(activity))) {
            activity.findViewById(R.id.a5c).setPadding(0, 0, 0, 0);
            C43098ej.m136709a(activity);
            bVar.f68476d.f68523r = activity.getWindow().getStatusBarColor();
        } else if (!bVar.f68476d.f68520o) {
            if (bVar.f68476d.f68523r != -2) {
                C43098ej.m136710a(activity, bVar.f68476d.f68523r);
            } else {
                bVar.f68476d.f68523r = statusBarColor;
            }
        }
        return keyboardEnable;
    }

    /* renamed from: a */
    public static Intent m84945a(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            String queryParameter = uri.getQueryParameter("url");
            if (C6319n.m19593a(queryParameter)) {
                return null;
            }
            boolean a = C25833b.m84962a(uri.getQueryParameter("no_hw"));
            boolean a2 = C25833b.m84962a(uri.getQueryParameter("hide_more"));
            boolean a3 = C25833b.m84962a(uri.getQueryParameter("hide_bar"));
            boolean a4 = C25833b.m84962a(uri.getQueryParameter("hide_status_bar"));
            boolean a5 = C25833b.m84962a(uri.getQueryParameter("hide_nav_bar"));
            boolean a6 = C25833b.m84962a(uri.getQueryParameter("hide_more"));
            if (a3 || a5) {
                intent.putExtra("hide_nav_bar", true);
            }
            if (a4) {
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
            if (a) {
                intent.putExtra("bundle_no_hw_acceleration", true);
            }
            if (a2) {
                intent.putExtra("hide_more", true);
            }
            if (!a6) {
                intent.putExtra("hide_more", a6);
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
                intent.putExtra("use_webview_title", true);
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

    /* renamed from: b */
    public static int m84963b(Uri uri, Bundle bundle, String str) {
        if (uri == null) {
            return -1;
        }
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter == null) {
            return -1;
        }
        try {
            return Integer.parseInt(queryParameter);
        } catch (NumberFormatException unused) {
            if (bundle != null) {
                return bundle.getInt(str);
            }
            return -1;
        }
    }

    /* renamed from: a */
    public static int m84944a(Uri uri, Bundle bundle, int i) {
        String str;
        String str2 = "bundle_webview_background";
        if (bundle != null) {
            i = bundle.getInt(str2, i);
        }
        if (uri == null || uri.getQueryParameter(str2) == null) {
            str = null;
        } else {
            str = uri.getQueryParameter(str2);
        }
        try {
            if (TextUtils.isEmpty(str) || str.contains("#")) {
                return i;
            }
            StringBuilder sb = new StringBuilder("#");
            sb.append(str);
            return Color.parseColor(sb.toString());
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: c */
    public static int m84967c(Uri uri, Bundle bundle, String str) {
        String str2 = null;
        if (uri != null) {
            try {
                if (uri.getQueryParameter(str) != null) {
                    str2 = uri.getQueryParameter(str);
                }
            } catch (Exception unused) {
                return -2;
            }
        }
        if (!(!TextUtils.isEmpty(str2) || bundle == null || bundle.getString(str) == null)) {
            str2 = bundle.getString(str);
        }
        if (!TextUtils.isEmpty(str2) && !str2.contains("#")) {
            StringBuilder sb = new StringBuilder("#");
            sb.append(str2);
            str2 = sb.toString();
        }
        if (!TextUtils.isEmpty(str2)) {
            return Color.parseColor(str2);
        }
        return -2;
    }

    /* renamed from: a */
    private static Object m84950a(Uri uri, String str, Class cls) {
        try {
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter == null) {
                return null;
            }
            if (cls == String.class) {
                return queryParameter;
            }
            if (cls == Integer.class) {
                return Integer.valueOf(Integer.parseInt(queryParameter));
            }
            if (cls == Long.class) {
                return Long.valueOf(Long.parseLong(queryParameter));
            }
            if (cls == Boolean.class) {
                return Boolean.valueOf(Boolean.parseBoolean(queryParameter));
            }
            if (cls == Float.class) {
                return Float.valueOf(Float.parseFloat(queryParameter));
            }
            if (cls == Double.class) {
                return Double.valueOf(Double.parseDouble(queryParameter));
            }
            return null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static <T> T m84951a(Uri uri, String str, Class<T> cls, T t) {
        if (uri == null) {
            return t;
        }
        T a = m84952a(m84950a(uri, str, (Class) cls));
        if (a != null) {
            return a;
        }
        return t;
    }

    /* renamed from: b */
    public static boolean m84966b(Uri uri, Bundle bundle, String str, boolean z) {
        if (uri == null || TextUtils.isEmpty(uri.getQueryParameter(str))) {
            if (bundle != null) {
                return bundle.getBoolean(str, false);
            }
            return false;
        } else if (uri.getQueryParameter(str).equals("1") || uri.getQueryParameter(str).equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static <T> T m84948a(Uri uri, String str, Bundle bundle, String str2, Class<T> cls) {
        if (uri != null) {
            try {
                if (!TextUtils.isEmpty(str) && uri.getQueryParameter(str) != null) {
                    Object a = m84950a(uri, str, (Class) cls);
                    if (cls.isInstance(a)) {
                        return m84952a(a);
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (bundle != null && !TextUtils.isEmpty(str2)) {
            return m84952a(bundle.get(str2));
        }
        return null;
    }

    /* renamed from: a */
    public static <T> T m84949a(Uri uri, String str, Bundle bundle, String str2, Class<T> cls, T t) {
        T a = m84948a(uri, str, bundle, str2, cls);
        if (a != null) {
            return a;
        }
        return t;
    }
}
