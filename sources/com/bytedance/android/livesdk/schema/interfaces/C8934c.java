package com.bytedance.android.livesdk.schema.interfaces;

import android.content.Context;
import android.net.Uri;

/* renamed from: com.bytedance.android.livesdk.schema.interfaces.c */
public interface C8934c {
    boolean canHandle(Uri uri);

    boolean handle(Context context, Uri uri);
}
