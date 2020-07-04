package com.bytedance.ies.bullet.core.monitor;

import android.net.Uri;
import com.bytedance.ies.bullet.core.common.C10350d;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.bullet.core.monitor.f */
public final class C10428f implements C10426d {

    /* renamed from: e */
    public static final C10429a f28174e = new C10429a(null);

    /* renamed from: a */
    public final C10427e f28175a = new C10427e(this.f28178d, "referrer");

    /* renamed from: b */
    public C10427e f28176b;

    /* renamed from: c */
    public Uri f28177c;

    /* renamed from: d */
    public final Uri f28178d;

    /* renamed from: com.bytedance.ies.bullet.core.monitor.f$a */
    public static final class C10429a {
        private C10429a() {
        }

        public /* synthetic */ C10429a(C7571f fVar) {
            this();
        }
    }

    public final JSONObject getFormatData() {
        JSONObject jSONObject = new JSONObject();
        C10350d.m30638a(jSONObject, this.f28176b.getFormatData());
        C10350d.m30638a(jSONObject, this.f28175a.getFormatData());
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo25213a(Uri uri) {
        C7573i.m23587b(uri, "value");
        this.f28177c = uri;
        this.f28176b = new C10427e(this.f28177c, "page");
    }

    public C10428f(Uri uri, Uri uri2) {
        C7573i.m23587b(uri, "referrerUri");
        C7573i.m23587b(uri2, "pageUri");
        this.f28178d = uri;
        this.f28176b = new C10427e(uri2, "page");
        this.f28177c = uri2;
    }
}
