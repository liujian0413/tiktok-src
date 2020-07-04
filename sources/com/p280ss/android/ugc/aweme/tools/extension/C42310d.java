package com.p280ss.android.ugc.aweme.tools.extension;

/* renamed from: com.ss.android.ugc.aweme.tools.extension.d */
public final class C42310d implements C42309c {

    /* renamed from: a */
    final C42309c f110071a;

    public C42310d(C42309c cVar) {
        this.f110071a = cVar;
    }

    /* renamed from: a */
    public final String mo103788a(String str, Scene scene, Scene scene2) {
        if (str == null || str.length() <= 5000) {
            return this.f110071a.mo103788a(str, scene, scene2);
        }
        StringBuilder sb = new StringBuilder("Struct in tools line is too long! MAX_LENGTH is 5000, while input.length() is ");
        sb.append(str.length());
        sb.append("!");
        throw new IllegalArgumentException(sb.toString());
    }
}
