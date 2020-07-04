package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7525m;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.o */
public final class C35987o {
    /* renamed from: a */
    public static final List<Aweme> m115949a(List<? extends Aweme> list) {
        if (list == null) {
            return C7525m.m23461a();
        }
        Iterable<Aweme> iterable = list;
        Collection arrayList = new ArrayList();
        for (Aweme clone : iterable) {
            arrayList.add(clone.clone());
        }
        return (List) arrayList;
    }
}
