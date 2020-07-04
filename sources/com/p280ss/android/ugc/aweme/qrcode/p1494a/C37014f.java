package com.p280ss.android.ugc.aweme.qrcode.p1494a;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.qrcode.C37055c;
import com.p280ss.android.ugc.aweme.qrcode.p1494a.C37004a.C37005a;
import com.p280ss.android.ugc.aweme.qrcode.p1498d.C37070a;
import com.p280ss.android.ugc.aweme.router.C37286v;

/* renamed from: com.ss.android.ugc.aweme.qrcode.a.f */
public final class C37014f extends C37004a {
    public C37014f(C37005a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final boolean mo59069a(String str, int i) {
        int i2;
        String b = C37286v.m119759b(str, "schema_type");
        String b2 = C37286v.m119759b(str, "object_id");
        if (TextUtils.isEmpty(b) || TextUtils.isEmpty(b2)) {
            return false;
        }
        try {
            i2 = Integer.parseInt(b);
        } catch (NumberFormatException unused) {
            i2 = 0;
        }
        this.f96938a = C37055c.m119144b(i2, b2);
        return this.f96939b.mo93444a(i2, b2, str, i, C37070a.m119196a(str));
    }
}
