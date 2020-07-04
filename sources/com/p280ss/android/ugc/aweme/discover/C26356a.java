package com.p280ss.android.ugc.aweme.discover;

import android.content.Context;
import com.p280ss.android.ugc.aweme.discover.api.p1175b.C26571a;
import com.p280ss.android.ugc.aweme.discover.hotspot.SpotChangeCallBack;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.a */
public final class C26356a implements C26573b {
    /* renamed from: a */
    public final Map<String, String> mo67868a(Context context) {
        C7573i.m23587b(context, "context");
        return SpotChangeCallBack.f70365c.mo68419a(context);
    }

    /* renamed from: a */
    public final void mo67869a(String str) {
        C7573i.m23587b(str, "uid");
        C26571a.m87328a(str);
    }
}
