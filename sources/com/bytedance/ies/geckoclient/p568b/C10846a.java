package com.bytedance.ies.geckoclient.p568b;

import com.google.gson.C6715r;
import com.google.gson.JsonParseException;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import com.google.gson.stream.JsonToken;
import java.io.IOException;

/* renamed from: com.bytedance.ies.geckoclient.b.a */
public final class C10846a extends C6715r<Boolean> {
    public final /* synthetic */ Object read(C6718a aVar) throws IOException {
        return m31811a(aVar);
    }

    /* renamed from: a */
    private static Boolean m31811a(C6718a aVar) throws IOException {
        boolean z;
        JsonToken f = aVar.mo16088f();
        switch (f) {
            case BOOLEAN:
                return Boolean.valueOf(aVar.mo16091i());
            case NULL:
                aVar.mo16092j();
                return null;
            case NUMBER:
                if (aVar.mo16095m() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                StringBuilder sb = new StringBuilder("Expected BOOLEAN or NUMBER but was ");
                sb.append(f);
                throw new JsonParseException(sb.toString());
        }
    }

    public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
        m31812a(bVar, (Boolean) obj);
    }

    /* renamed from: a */
    private static void m31812a(C6720b bVar, Boolean bool) throws IOException {
        if (bool == null) {
            bVar.mo16115f();
        } else {
            bVar.mo16108a(bool.booleanValue());
        }
    }
}
