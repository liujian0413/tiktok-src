package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.dx */
public final class C43075dx implements SchemaPageHelper {
    public final String getChannel() {
        String q = C6399b.m19941q();
        if (q == null) {
            return "";
        }
        return q;
    }

    public final Intent handleAmeWebViewBrowser(Context context, Uri uri) {
        return C22912d.f60645e.mo59885a(context, uri);
    }

    public final Intent handleAmeWebViewBrowserForDeeplink(Context context, Uri uri) {
        C7573i.m23587b(context, "context");
        return C22912d.f60645e.mo59886a(context, uri, false);
    }

    public final void startAdsAppActivity(Context context, String str) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "schema");
        C22912d.f60645e.mo59887a(context, str, "");
    }

    public final Intent handleAmeWebViewBrowserForDeeplink(String str, Context context) {
        C7573i.m23587b(str, "schema");
        C7573i.m23587b(context, "context");
        return C22912d.f60645e.mo59886a(context, Uri.parse(str), false);
    }

    public final void openCrossPlatformActivity(Context context, boolean z, boolean z2, String str) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "url");
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_load_dialog", z);
        intent.putExtra("hide_nav_bar", z2);
        intent.putExtras(bundle);
        intent.setData(Uri.parse(str));
        context.startActivity(intent);
    }

    public final boolean openAdWebUrl(Context context, String str, String str2, boolean z, Map<String, String> map) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str2, "title");
        return C25371n.m83460a(context, str, str2, z, map);
    }
}
