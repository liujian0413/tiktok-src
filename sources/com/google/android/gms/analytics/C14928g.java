package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.gms.analytics.g */
public final class C14928g implements C14939o {

    /* renamed from: a */
    private static final Uri f38600a;

    /* renamed from: b */
    private final LogPrinter f38601b = new LogPrinter(4, "GA/LogCatTransport");

    /* renamed from: a */
    public final Uri mo37986a() {
        return f38600a;
    }

    /* renamed from: a */
    public final void mo37987a(C14930i iVar) {
        ArrayList arrayList = new ArrayList(iVar.mo37994b());
        Collections.sort(arrayList, new C14929h(this));
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String obj2 = ((C14931j) obj).toString();
            if (!TextUtils.isEmpty(obj2)) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(obj2);
            }
        }
        this.f38601b.println(sb.toString());
    }

    static {
        Builder builder = new Builder();
        builder.scheme("uri");
        builder.authority("local");
        f38600a = builder.build();
    }
}
