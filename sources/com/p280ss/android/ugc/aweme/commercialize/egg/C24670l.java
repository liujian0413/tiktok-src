package com.p280ss.android.ugc.aweme.commercialize.egg;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.commercialize.model.EasterEggInfo;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.l */
public final class C24670l {

    /* renamed from: a */
    public static final C24670l f65042a = new C24670l();

    private C24670l() {
    }

    /* renamed from: a */
    public static final C24641b m80849a(EasterEggInfo easterEggInfo, boolean z) {
        String str;
        String d = C25352e.m83363d(easterEggInfo);
        if (d == null) {
            str = null;
        } else if (d != null) {
            str = C7634n.m23762b(d).toString();
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        if (easterEggInfo == null || !C25352e.m83353b(easterEggInfo) || TextUtils.isEmpty(str)) {
            return null;
        }
        C24657f fVar = new C24657f("search", "-1", "", "", easterEggInfo.getId());
        if (str == null) {
            str = "";
        }
        String sourceType = easterEggInfo.getSourceType();
        C7573i.m23582a((Object) sourceType, "rawData.sourceType");
        C24653c cVar = new C24653c(str, sourceType);
        cVar.f65008a = false;
        cVar.f65010c = fVar;
        return cVar.mo64521a();
    }
}
