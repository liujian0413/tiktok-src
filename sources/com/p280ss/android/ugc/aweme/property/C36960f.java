package com.p280ss.android.ugc.aweme.property;

import android.view.View;
import com.p280ss.android.ugc.aweme.property.PropertyStore.C36952a;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.property.f */
public final class C36960f extends C36957c {

    /* renamed from: a */
    public final String f96861a;

    /* renamed from: h */
    public final String f96862h;

    /* renamed from: i */
    public final C7562b<View, C7581n> f96863i;

    public C36960f(String str, String str2, String str3, C7562b<? super View, C7581n> bVar) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(str2, "value");
        C7573i.m23587b(str3, "owner");
        C7573i.m23587b(bVar, "onClick");
        C36952a a = C36961g.m118911a(str2, str);
        C36981p pVar = new C36981p(str3, str2, "", "", "", "");
        super(a, pVar);
        this.f96861a = str;
        this.f96862h = str2;
        this.f96863i = bVar;
    }
}
