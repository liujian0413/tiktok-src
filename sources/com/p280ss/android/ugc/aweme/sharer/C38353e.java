package com.p280ss.android.ugc.aweme.sharer;

import android.os.Bundle;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.e */
public abstract class C38353e {

    /* renamed from: a */
    private final Bundle f99563a = new Bundle();

    /* renamed from: a */
    public final C38353e mo95938a(String str, String str2) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(str2, "value");
        this.f99563a.putString(str, str2);
        return this;
    }

    /* renamed from: b */
    public final String mo95939b(String str, String str2) {
        C7573i.m23587b(str, "key");
        String string = this.f99563a.getString(str, str2);
        C7573i.m23582a((Object) string, "params.getString(key, default)");
        return string;
    }
}
