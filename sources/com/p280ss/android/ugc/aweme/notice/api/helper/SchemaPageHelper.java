package com.p280ss.android.ugc.aweme.notice.api.helper;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper */
public interface SchemaPageHelper {
    String getChannel();

    Intent handleAmeWebViewBrowser(Context context, Uri uri);

    Intent handleAmeWebViewBrowserForDeeplink(Context context, Uri uri);

    Intent handleAmeWebViewBrowserForDeeplink(String str, Context context);

    boolean openAdWebUrl(Context context, String str, String str2, boolean z, Map<String, String> map);

    void openCrossPlatformActivity(Context context, boolean z, boolean z2, String str);

    void startAdsAppActivity(Context context, String str);
}
