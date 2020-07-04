package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.models.C46950g;
import java.util.List;

/* renamed from: com.twitter.sdk.android.tweetui.ac */
public final class C47008ac {

    /* renamed from: a */
    public final Long f120631a;

    /* renamed from: b */
    public final Long f120632b;

    C47008ac(List<? extends C46950g> list) {
        Long l;
        Long l2 = null;
        if (list.size() > 0) {
            l = Long.valueOf(((C46950g) list.get(list.size() - 1)).getId());
        } else {
            l = null;
        }
        this.f120631a = l;
        if (list.size() > 0) {
            l2 = Long.valueOf(((C46950g) list.get(0)).getId());
        }
        this.f120632b = l2;
    }
}
