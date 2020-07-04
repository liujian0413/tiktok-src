package com.p280ss.android.ugc.aweme.commercialize;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.commercialize.model.C25006o;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40231c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.g */
public final class C24751g implements C40231c {
    /* renamed from: a */
    public final void mo64276a(PhotoContext photoContext, LinkedHashMap<String, String> linkedHashMap) {
        String str;
        C7573i.m23587b(photoContext, "photoContext");
        C7573i.m23587b(linkedHashMap, "fieldMap");
        Map map = linkedHashMap;
        String str2 = "commerce_ad_link";
        if (C25006o.m82323a(photoContext).f65938a) {
            str = "1";
        } else {
            str = "0";
        }
        map.put(str2, str);
    }

    /* renamed from: a */
    public final void mo64277a(BaseShortVideoContext baseShortVideoContext, LinkedHashMap<String, String> linkedHashMap) {
        C7573i.m23587b(baseShortVideoContext, "videoContext");
        C7573i.m23587b(linkedHashMap, "fieldMap");
        C25006o a = C25006o.m82324a(baseShortVideoContext);
        if (a.f65938a) {
            Map map = linkedHashMap;
            map.put("commerce_ad_link", "1");
            if (!TextUtils.isEmpty(a.f65939b)) {
                String str = "commerce_ad_link_tags";
                String str2 = a.f65939b;
                if (str2 == null) {
                    str2 = "";
                }
                map.put(str, str2);
            }
        } else {
            linkedHashMap.put("commerce_ad_link", "0");
        }
    }
}
