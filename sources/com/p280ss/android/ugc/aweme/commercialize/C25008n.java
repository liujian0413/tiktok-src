package com.p280ss.android.ugc.aweme.commercialize;

import com.p280ss.android.ugc.aweme.commercialize.model.C25006o;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40231c;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.n */
public final class C25008n implements C40231c {

    /* renamed from: a */
    private final String f65963a = "TaskPublishServiceExtension";

    /* renamed from: a */
    public final void mo64276a(PhotoContext photoContext, LinkedHashMap<String, String> linkedHashMap) {
        C7573i.m23587b(photoContext, "photoContext");
        C7573i.m23587b(linkedHashMap, "fieldMap");
    }

    /* renamed from: a */
    public final void mo64277a(BaseShortVideoContext baseShortVideoContext, LinkedHashMap<String, String> linkedHashMap) {
        boolean z;
        C7573i.m23587b(baseShortVideoContext, "videoContext");
        C7573i.m23587b(linkedHashMap, "fieldMap");
        String str = C25006o.m82324a(baseShortVideoContext).f65953p;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            linkedHashMap.put("task_id", str);
        }
    }
}
