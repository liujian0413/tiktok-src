package com.bytedance.android.livesdk.schema.interfaces;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.livesdk.schema.interfaces.C8932b.C8933a;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.schema.interfaces.a */
public interface C8931a extends C2324b {
    C8934c getHandler(Uri uri);

    boolean handle(Context context, Uri uri);

    boolean handle(Context context, String str);

    boolean handleWithoutHost(Context context, String str);

    boolean openRoom(Context context, C8933a aVar);

    boolean showUserProfile(long j);

    boolean showUserProfile(long j, String str, Map<String, String> map);
}
