package com.p280ss.android.ugc.aweme.commercialize;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.commercialize.model.C25006o;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40231c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.m */
public final class C24983m implements C40231c {

    /* renamed from: a */
    private final String f65867a = "StarAtlasPublishServiceExtension";

    /* renamed from: a */
    public final void mo64276a(PhotoContext photoContext, LinkedHashMap<String, String> linkedHashMap) {
        C7573i.m23587b(photoContext, "photoContext");
        C7573i.m23587b(linkedHashMap, "fieldMap");
    }

    /* renamed from: a */
    public final void mo64277a(BaseShortVideoContext baseShortVideoContext, LinkedHashMap<String, String> linkedHashMap) {
        C7573i.m23587b(baseShortVideoContext, "videoContext");
        C7573i.m23587b(linkedHashMap, "fieldMap");
        C25006o a = C25006o.m82324a(baseShortVideoContext);
        if (C6399b.m19944t()) {
            C7573i.m23582a((Object) a, "commercePublishModel");
            if (a.f65941d) {
                Map map = linkedHashMap;
                map.put("is_star_atlas", "1");
                if (!TextUtils.isEmpty(a.f65942e)) {
                    String str = a.f65942e;
                    C7573i.m23582a((Object) str, "commercePublishModel.starAtlasContent");
                    map.put("star_atlas_content", str);
                }
            } else {
                linkedHashMap.put("is_star_atlas", "0");
            }
        } else {
            C7573i.m23582a((Object) a, "commercePublishModel");
            if (a.mo65435a() != 0) {
                linkedHashMap.put("star_atlas_order_id", String.valueOf(a.mo65435a()));
                try {
                    Object opt = new JSONObject(a.f65954q).opt("channel");
                    if (opt != null && !TextUtils.isEmpty(opt.toString())) {
                        linkedHashMap.put("star_atlas_channel", opt.toString());
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
