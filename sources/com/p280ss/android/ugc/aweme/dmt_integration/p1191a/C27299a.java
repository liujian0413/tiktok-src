package com.p280ss.android.ugc.aweme.dmt_integration.p1191a;

import com.google.gson.C6715r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import com.google.gson.stream.JsonToken;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.a.a */
public final class C27299a extends C6715r<Integer> {
    public final /* synthetic */ Object read(C6718a aVar) {
        return m89397a(aVar);
    }

    /* renamed from: a */
    private static Integer m89397a(C6718a aVar) {
        C7573i.m23587b(aVar, "in");
        JsonToken f = aVar.mo16088f();
        if (f != null) {
            switch (C27300b.f71920a[f.ordinal()]) {
                case 1:
                    if (aVar.mo16091i()) {
                        return Integer.valueOf(1);
                    }
                    return Integer.valueOf(0);
                case 2:
                    aVar.mo16092j();
                    return null;
                case 3:
                    try {
                        return Integer.valueOf(aVar.mo16095m());
                    } catch (NumberFormatException e) {
                        throw new JsonSyntaxException((Throwable) e);
                    }
                case 4:
                    if (Boolean.parseBoolean(aVar.mo16090h())) {
                        return Integer.valueOf(1);
                    }
                    return Integer.valueOf(0);
            }
        }
        StringBuilder sb = new StringBuilder("Expected BOOLEAN or NUMBER but was ");
        sb.append(f);
        throw new IllegalStateException(sb.toString());
    }

    public final /* synthetic */ void write(C6720b bVar, Object obj) {
        m89398a(bVar, (Integer) obj);
    }

    /* renamed from: a */
    private static void m89398a(C6720b bVar, Integer num) {
        C7573i.m23587b(bVar, "out");
        if (num == null) {
            bVar.mo16115f();
        } else {
            bVar.mo16106a((Number) num);
        }
    }
}
