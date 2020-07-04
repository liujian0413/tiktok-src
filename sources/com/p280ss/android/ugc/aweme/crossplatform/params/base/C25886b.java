package com.p280ss.android.ugc.aweme.crossplatform.params.base;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25883a;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25884b;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25896d;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25897e;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25898f;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25888c.C25890b;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.params.base.b */
public class C25886b {

    /* renamed from: a */
    public C25883a f68473a;

    /* renamed from: b */
    public C25884b f68474b;

    /* renamed from: c */
    public C25896d f68475c;

    /* renamed from: d */
    public C25897e f68476d;

    /* renamed from: e */
    public C25898f f68477e;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.params.base.b$a */
    public static final class C25887a {
        /* renamed from: a */
        public static C25886b m85153a(Bundle bundle) {
            return C25890b.m85158a(bundle);
        }

        /* renamed from: a */
        public static C25886b m85152a(Intent intent) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            if (TextUtils.isEmpty(extras.getString("url"))) {
                if (intent.getData() != null && !TextUtils.isEmpty(intent.getData().toString())) {
                    extras.putString("url", intent.getData().toString());
                }
                if (TextUtils.isEmpty(extras.getString("url")) && !TextUtils.isEmpty(extras.getString("rn_schema"))) {
                    extras.putString("url", extras.getString("rn_schema"));
                }
            }
            try {
                if (!TextUtils.isEmpty(extras.getString("url"))) {
                    Uri parse = Uri.parse(extras.getString("url"));
                    extras.putString("hybrid_report_source", parse.getQueryParameter("hybrid_report_source"));
                    String queryParameter = parse.getQueryParameter("has_adinfojson");
                    extras.putString("has_ad_info_json", queryParameter);
                    if (TextUtils.equals(queryParameter, "1")) {
                        extras.putString("ad_info_json", Uri.parse(extras.getString("url")).getQueryParameter("adinfojson"));
                    }
                }
                String string = extras.getString("hide_nav_bar", "-1");
                if (!TextUtils.equals(string, "-1")) {
                    m85155a(extras, "hide_nav_bar", string);
                }
                if (!TextUtils.equals(extras.getString("hide_status_bar", "-1"), "-1")) {
                    m85155a(extras, "hide_status_bar", string);
                }
                if (!TextUtils.equals(extras.getString("hide_more", "-1"), "-1")) {
                    m85155a(extras, "hide_more", string);
                }
            } catch (Exception unused) {
            }
            return C25890b.m85158a(extras);
        }

        /* renamed from: a */
        public static C25886b m85154a(String str, String str2) {
            Intent intent = new Intent();
            intent.putExtra("fallback_url", Uri.parse(Uri.parse(str).getQueryParameter("url")).buildUpon().appendQueryParameter("reactId", str2).build().toString());
            if (Uri.parse(str).getQueryParameter("rn_schema") != null) {
                Uri parse = Uri.parse(Uri.parse(str).getQueryParameter("rn_schema"));
                intent.putExtra("channel_name", parse.getQueryParameter("channel_name"));
                intent.putExtra("bundle_name", parse.getQueryParameter("bundle_name"));
                intent.putExtra("module_name", parse.getQueryParameter("module_name"));
                intent.putExtra("force_h5", parse.getQueryParameter("force_h5"));
                intent.putExtra("dev", parse.getQueryParameter("dev"));
                intent.putExtra("rn_schema", parse.toString());
                intent.putExtra("dynamic", parse.getQueryParameter("dynamic"));
                intent.putExtra("bundle", parse.getQueryParameter("bundle"));
                intent.putExtra("channel", parse.getQueryParameter("channel"));
                intent.putExtra("url", Uri.parse(str).getQueryParameter("rn_schema"));
                intent.putExtra("need_share_bridge", parse.getQueryParameter("need_share_bridge"));
            } else {
                intent.putExtra("force_h5", "1");
            }
            return m85152a(intent);
        }

        /* renamed from: a */
        private static void m85155a(Bundle bundle, String str, String str2) {
            if (TextUtils.equals("1", str2)) {
                bundle.putBoolean(str, true);
            } else if (TextUtils.equals("true", str2)) {
                bundle.putBoolean(str, true);
            } else if (TextUtils.equals("0", str2)) {
                bundle.putBoolean(str, false);
            } else {
                if (TextUtils.equals("false", str2)) {
                    bundle.putBoolean(str, false);
                }
            }
        }
    }
}
