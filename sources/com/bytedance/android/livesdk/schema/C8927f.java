package com.bytedance.android.livesdk.schema;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.schema.interfaces.C8934c;

/* renamed from: com.bytedance.android.livesdk.schema.f */
public final class C8927f implements C8934c {
    public final boolean canHandle(Uri uri) {
        return TextUtils.equals("sign", uri.getHost());
    }

    public final boolean handle(Context context, Uri uri) {
        TTLiveSDKContext.getHostService().mo22365f().mo22050b(context, uri.getQueryParameter("url"));
        return true;
    }
}
