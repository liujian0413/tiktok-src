package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dy */
public final class C39362dy {

    /* renamed from: a */
    private final Object f102258a;

    public C39362dy(Object obj) {
        C7573i.m23587b(obj, "publisher");
        this.f102258a = obj;
    }

    /* renamed from: a */
    public final void mo97948a(String str) {
        C7573i.m23587b(str, "text");
        C7163a.m22363a();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f102258a);
        sb.append(' ');
        sb.append(str);
        C41530am.m132285d(sb.toString());
    }
}
