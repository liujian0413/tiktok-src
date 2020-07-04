package com.p280ss.android.ugc.aweme.commercialize;

import com.p280ss.android.ugc.aweme.commercialize.model.C25006o;
import com.p280ss.android.ugc.aweme.miniapp.anchor.C33336b;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40231c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.a */
public final class C24503a implements C40231c {
    /* renamed from: a */
    public final void mo64276a(PhotoContext photoContext, LinkedHashMap<String, String> linkedHashMap) {
        C7573i.m23587b(photoContext, "photoContext");
        C7573i.m23587b(linkedHashMap, "fieldMap");
        C25006o a = C25006o.m82323a(photoContext);
        Map map = linkedHashMap;
        map.put("anchor", C33336b.m107782a(Integer.valueOf(a.f65945h), a.f65944g, a.f65946i));
        map.put("anchor_business_type", String.valueOf(a.f65945h));
        String str = "anchor_content";
        String str2 = a.f65946i;
        if (str2 == null) {
            str2 = "";
        }
        map.put(str, str2);
    }

    /* renamed from: a */
    public final void mo64277a(BaseShortVideoContext baseShortVideoContext, LinkedHashMap<String, String> linkedHashMap) {
        C7573i.m23587b(baseShortVideoContext, "videoContext");
        C7573i.m23587b(linkedHashMap, "fieldMap");
        C25006o a = C25006o.m82324a(baseShortVideoContext);
        Map map = linkedHashMap;
        map.put("anchor", C33336b.m107782a(Integer.valueOf(a.f65945h), a.f65944g, a.f65946i));
        map.put("anchor_business_type", String.valueOf(a.f65945h));
        String str = "anchor_content";
        String str2 = a.f65946i;
        if (str2 == null) {
            str2 = "";
        }
        map.put(str, str2);
    }
}
