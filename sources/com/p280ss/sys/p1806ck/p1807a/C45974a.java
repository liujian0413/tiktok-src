package com.p280ss.sys.p1806ck.p1807a;

import android.content.Context;
import com.p280ss.p811a.p812a.C18875a;
import com.p280ss.p811a.p812a.C18876b;
import com.p280ss.sys.p1806ck.C45987b;

/* renamed from: com.ss.sys.ck.a.a */
public final class C45974a extends C18876b {

    /* renamed from: b */
    private Context f117499b;

    public C45974a(Context context, String str, String str2) {
        super(context, str);
        this.f117499b = context;
        if (str2 == null || str2.length() <= 0) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C18875a.m61613c(0));
        sb.append("/v.s");
        sb.append(str2);
        this.f50878a = sb.toString();
    }

    /* renamed from: a */
    public final boolean mo50247a(int i, byte[] bArr) {
        if (i != 200 || bArr == null) {
            return false;
        }
        try {
            if (bArr.length > 0) {
                return C45987b.m144182a(new String(bArr));
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
