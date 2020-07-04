package com.bytedance.polaris.model;

import android.net.Uri;
import com.bytedance.polaris.depend.C12421b;
import java.net.URLDecoder;

/* renamed from: com.bytedance.polaris.model.b */
public final class C12436b implements C12421b {

    /* renamed from: a */
    private final Uri f33029a;

    /* renamed from: a */
    public final String mo30304a() {
        if (this.f33029a != null) {
            return URLDecoder.decode(this.f33029a.getQueryParameter("fallback"));
        }
        return null;
    }

    public C12436b(Uri uri) {
        this.f33029a = uri;
    }
}
