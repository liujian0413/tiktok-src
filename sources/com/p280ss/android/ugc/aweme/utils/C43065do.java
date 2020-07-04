package com.p280ss.android.ugc.aweme.utils;

import com.google.gson.C6715r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import com.google.gson.stream.JsonToken;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.utils.do */
public final class C43065do extends C6715r<String> {
    public final /* synthetic */ Object read(C6718a aVar) throws IOException {
        return m136623a(aVar);
    }

    /* renamed from: a */
    private static String m136623a(C6718a aVar) throws IOException {
        JsonToken f = aVar.mo16088f();
        switch (f) {
            case NULL:
                aVar.mo16092j();
                return null;
            case STRING:
                String h = aVar.mo16090h();
                if (h.contains("\r\n")) {
                    h = h.replaceAll("\r\n", "\n");
                }
                return h;
            default:
                StringBuilder sb = new StringBuilder("expect STRING, but got ");
                sb.append(f.name());
                sb.append(" at ");
                sb.append(aVar.mo16098p());
                throw new JsonSyntaxException(sb.toString());
        }
    }

    /* renamed from: a */
    private static void m136624a(C6720b bVar, String str) throws IOException {
        bVar.mo16110b(str);
    }

    public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
        m136624a(bVar, (String) obj);
    }
}
