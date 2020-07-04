package com.p280ss.android.ugc.aweme.app.api.p1024c;

import android.text.TextUtils;
import com.bytedance.retrofit2.mime.TypedInput;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.app.api.c.c */
final class C22822c {
    /* renamed from: a */
    static C22823d m75256a(C22820a aVar, TypedInput typedInput) {
        Type type = aVar.f60536b;
        if (!(type == null || type != FeedItemList.class || typedInput == null)) {
            String mimeType = typedInput.mimeType();
            int i = 1;
            boolean z = !TextUtils.isEmpty(mimeType) && mimeType.contains("json");
            C6857a e = C6857a.m21312e();
            if (!z) {
                i = 2;
            }
            e.mo16819a(i);
        }
        return aVar.mo59835a(typedInput);
    }
}
