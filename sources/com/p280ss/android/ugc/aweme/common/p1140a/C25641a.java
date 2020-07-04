package com.p280ss.android.ugc.aweme.common.p1140a;

import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.common.a.a */
public final class C25641a<T> implements C25643c<String, T> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo66483a(Object obj, Type type) {
        return m84271a((String) obj, type);
    }

    /* renamed from: a */
    private static T m84271a(String str, Type type) {
        C7573i.m23587b(str, "source");
        C7573i.m23587b(type, "type");
        C6600e S = C35574k.m114859a().mo70085S();
        C6597a aVar = C6597a.get(type);
        C7573i.m23582a((Object) aVar, "TypeToken.get(type)");
        return S.mo15975a(str, aVar.type);
    }
}
