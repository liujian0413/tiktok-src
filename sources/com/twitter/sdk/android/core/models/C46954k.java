package com.twitter.sdk.android.core.models;

import java.util.Collections;
import java.util.List;

/* renamed from: com.twitter.sdk.android.core.models.k */
public final class C46954k {
    /* renamed from: a */
    public static <T> List<T> m146830a(List<T> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }
}
