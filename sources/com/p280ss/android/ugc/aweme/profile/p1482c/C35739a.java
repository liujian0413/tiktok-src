package com.p280ss.android.ugc.aweme.profile.p1482c;

import com.google.gson.C18373n;
import com.google.gson.C6709k;
import com.google.gson.C6715r;
import com.google.gson.internal.C6700i;
import com.google.gson.internal.bind.C6649j;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.profile.c.a */
public final class C35739a extends C6715r<String> {
    public final /* synthetic */ Object read(C6718a aVar) throws IOException {
        return m115466a(aVar);
    }

    /* renamed from: a */
    private static String m115466a(C6718a aVar) throws IOException {
        C6709k a = C6700i.m20725a(aVar);
        if (a != null) {
            return a.toString();
        }
        return null;
    }

    public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
        m115467a(bVar, (String) obj);
    }

    /* renamed from: a */
    private static void m115467a(C6720b bVar, String str) throws IOException {
        C6649j.f19095X.write(bVar, new C18373n().mo47346a(str));
    }
}
