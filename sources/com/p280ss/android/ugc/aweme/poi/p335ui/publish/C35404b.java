package com.p280ss.android.ugc.aweme.poi.p335ui.publish;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40231c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.publish.b */
public final class C35404b implements C40231c {

    /* renamed from: a */
    private final String f92874a = "PoiPublishServiceExtension";

    /* renamed from: a */
    public final void mo64276a(PhotoContext photoContext, LinkedHashMap<String, String> linkedHashMap) {
        PoiContext poiContext;
        C7573i.m23587b(photoContext, "photoContext");
        C7573i.m23587b(linkedHashMap, "fieldMap");
        String str = photoContext.mPoiId;
        if (str != null) {
            poiContext = PoiContext.unserializeFromJson(str);
        } else {
            poiContext = null;
        }
        if (poiContext != null) {
            m114364a(poiContext, linkedHashMap);
            return;
        }
        if (!TextUtils.isEmpty(photoContext.mPoiId)) {
            String str2 = photoContext.mPoiId;
            C7573i.m23582a((Object) str2, "photoContext.mPoiId");
            linkedHashMap.put("poi_id", str2);
        }
        if (!TextUtils.isEmpty(photoContext.mPoiName)) {
            String str3 = photoContext.mPoiName;
            C7573i.m23582a((Object) str3, "photoContext.mPoiName");
            linkedHashMap.put("poi_name", str3);
        }
    }

    /* renamed from: a */
    private static void m114364a(PoiContext poiContext, LinkedHashMap<String, String> linkedHashMap) {
        if (!TextUtils.isEmpty(poiContext.mPoiRateId)) {
            String str = poiContext.mPoiRateId;
            C7573i.m23582a((Object) str, "poiContext.mPoiRateId");
            linkedHashMap.put("poi_rate_id", str);
        }
        if (poiContext.mPoiActivity != null) {
            Map map = linkedHashMap;
            map.put("activity_id", poiContext.mPoiActivity.getId());
            if (!TextUtils.isEmpty(poiContext.mShootPoiId)) {
                String str2 = poiContext.mShootPoiId;
                C7573i.m23582a((Object) str2, "poiContext.mShootPoiId");
                map.put("poi_id", str2);
            }
            if (!TextUtils.isEmpty(poiContext.mShootPoiName)) {
                String str3 = poiContext.mShootPoiName;
                C7573i.m23582a((Object) str3, "poiContext.mShootPoiName");
                map.put("poi_name", str3);
            }
        } else {
            if (!TextUtils.isEmpty(poiContext.mSelectPoiId)) {
                String str4 = poiContext.mSelectPoiId;
                C7573i.m23582a((Object) str4, "poiContext.mSelectPoiId");
                linkedHashMap.put("poi_id", str4);
            }
            if (!TextUtils.isEmpty(poiContext.mSelectPoiName)) {
                String str5 = poiContext.mSelectPoiName;
                C7573i.m23582a((Object) str5, "poiContext.mSelectPoiName");
                linkedHashMap.put("poi_name", str5);
            }
        }
    }

    /* renamed from: a */
    public final void mo64277a(BaseShortVideoContext baseShortVideoContext, LinkedHashMap<String, String> linkedHashMap) {
        PoiContext poiContext;
        C7573i.m23587b(baseShortVideoContext, "videoContext");
        C7573i.m23587b(linkedHashMap, "fieldMap");
        String str = baseShortVideoContext.poiId;
        if (str != null) {
            poiContext = PoiContext.unserializeFromJson(str);
        } else {
            poiContext = null;
        }
        if (poiContext != null) {
            m114364a(poiContext, linkedHashMap);
            return;
        }
        if (!TextUtils.isEmpty(baseShortVideoContext.poiId)) {
            String str2 = baseShortVideoContext.poiId;
            C7573i.m23582a((Object) str2, "videoContext.poiId");
            linkedHashMap.put("poi_id", str2);
        }
        if (!TextUtils.isEmpty(baseShortVideoContext.poiName)) {
            String str3 = baseShortVideoContext.poiName;
            C7573i.m23582a((Object) str3, "videoContext.poiName");
            linkedHashMap.put("poi_name", str3);
        }
    }
}
