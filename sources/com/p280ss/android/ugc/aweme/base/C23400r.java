package com.p280ss.android.ugc.aweme.base;

import com.bytedance.lighten.core.p610a.C12092a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.util.Collections;

/* renamed from: com.ss.android.ugc.aweme.base.r */
public final class C23400r {
    /* renamed from: a */
    public static C12092a m76741a(UrlModel urlModel) {
        if (urlModel == null) {
            return new C23355m("", Collections.emptyList());
        }
        return new C23355m(urlModel.getUri(), urlModel.getUrlList());
    }
}
