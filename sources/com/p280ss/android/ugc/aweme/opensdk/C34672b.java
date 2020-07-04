package com.p280ss.android.ugc.aweme.opensdk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.opensdk.b */
public final class C34672b {
    /* renamed from: a */
    public static void m111967a(Context context, Aweme aweme) {
        if (context != null && aweme != null && aweme.getOpenPlatformStruct() != null && aweme.getOpenPlatformStruct().getRawData() != null && aweme.getOpenPlatformStruct().getRawData().getAnchor() != null && !TextUtils.isEmpty(aweme.getOpenPlatformStruct().getRawData().getAnchor().getUrl())) {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            intent.setData(Uri.parse(aweme.getOpenPlatformStruct().getRawData().getAnchor().getUrl()));
            intent.putExtra("use_webview_title", true);
            context.startActivity(intent);
        }
    }
}
