package com.bytedance.android.livesdk.schema;

import android.content.Context;
import android.net.Uri;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3384d;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.browser.p193c.C3972b;
import com.bytedance.android.livesdk.browser.p193c.C3972b.C3974a;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.schema.interfaces.C8934c;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.ttm.player.MediaPlayer;

/* renamed from: com.bytedance.android.livesdk.schema.m */
public final class C8939m implements C8934c {
    /* renamed from: b */
    private static boolean m26748b(Uri uri) {
        if (uri == null) {
            return false;
        }
        return TextUtils.equals(uri.getQueryParameter("__live_platform__"), "webcast");
    }

    public final boolean canHandle(Uri uri) {
        if (TextUtils.equals("webcast_webview", uri.getHost()) || m26748b(uri)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static String m26746a(Uri uri) {
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("url");
        if (C6319n.m19593a(queryParameter)) {
            return null;
        }
        Uri parse = Uri.parse(queryParameter);
        String queryParameter2 = uri.getQueryParameter("status_bar_height");
        if (!C6319n.m19593a(queryParameter2)) {
            parse = parse.buildUpon().appendQueryParameter("status_bar_height", queryParameter2).build();
        }
        return parse.toString();
    }

    public final boolean handle(Context context, Uri uri) {
        String a = m26746a(uri);
        if (C6319n.m19593a(a)) {
            return false;
        }
        if (mo22086a(context, uri) != null) {
            return true;
        }
        return m26749c(a, context, uri);
    }

    /* renamed from: a */
    public final BaseDialogFragment mo22086a(Context context, Uri uri) {
        String a = m26746a(uri);
        if (C6319n.m19593a(a)) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("type");
        if (queryParameter == null) {
            queryParameter = "";
        }
        char c = 65535;
        int hashCode = queryParameter.hashCode();
        if (hashCode != 106852524) {
            if (hashCode == 110066619 && queryParameter.equals("fullscreen")) {
                c = 1;
            }
        } else if (queryParameter.equals("popup")) {
            c = 0;
        }
        if (c != 0) {
            return null;
        }
        if (TextUtils.equals("bottom", uri.getQueryParameter("gravity"))) {
            return m26745a(a, context, uri);
        }
        return m26747b(a, context, uri);
    }

    /* renamed from: a */
    private static int m26744a(Uri uri, String str, int i) {
        try {
            String queryParameter = uri.getQueryParameter(str);
            queryParameter.getClass();
            return Integer.parseInt(queryParameter);
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: a */
    private static BaseDialogFragment m26745a(String str, Context context, Uri uri) {
        BaseDialogFragment a = C9178j.m27302j().mo22374c().mo11533a(C3979c.m13951a(str).mo11556a(m26744a(uri, "radius", 8), m26744a(uri, "radius", 8), 0, 0).mo11560b(m26744a(uri, "height", (int) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL)).mo11555a((int) C3358ac.m12527e(C3358ac.m12523c())).mo11566e(80));
        FragmentActivity b = C3384d.m12590b(context);
        if (b == null) {
            return null;
        }
        BaseDialogFragment.m12686a(b, (DialogFragment) a);
        return a;
    }

    /* renamed from: b */
    private static BaseDialogFragment m26747b(String str, Context context, Uri uri) {
        boolean z = false;
        if (m26744a(uri, "mask_click_disable", 0) == 0) {
            z = true;
        }
        BaseDialogFragment a = C9178j.m27302j().mo22374c().mo11533a(C3979c.m13951a(str).mo11564d(m26744a(uri, "radius", 8)).mo11560b(m26744a(uri, "height", (int) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL)).mo11555a(m26744a(uri, "width", (int) C34943c.f91128x)).mo11567e(z).mo11566e(17));
        FragmentActivity b = C3384d.m12590b(context);
        if (b == null) {
            return null;
        }
        BaseDialogFragment.m12686a(b, (DialogFragment) a);
        return a;
    }

    /* renamed from: c */
    private static boolean m26749c(String str, Context context, Uri uri) {
        boolean z;
        String str2;
        String str3;
        C3972b c = C9178j.m27302j().mo22374c();
        C3974a b = C3979c.m13952b(str);
        boolean z2 = false;
        if (m26744a(uri, "hide_nav_bar", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        C3974a a = b.mo11551a(z);
        if (uri != null) {
            str2 = uri.getQueryParameter("status_bar_color");
        } else {
            str2 = "";
        }
        C3974a b2 = a.mo11552b(str2);
        if (uri != null) {
            str3 = uri.getQueryParameter("status_bar_bg_color");
        } else {
            str3 = "";
        }
        C3974a c2 = b2.mo11554c(str3);
        if (m26744a(uri, "hide_status_bar", 0) == 1) {
            z2 = true;
        }
        c.mo11535a(context, c2.mo11553b(z2));
        return true;
    }
}
