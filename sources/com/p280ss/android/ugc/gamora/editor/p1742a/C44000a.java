package com.p280ss.android.ugc.gamora.editor.p1742a;

import android.app.Activity;
import android.content.res.Resources;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.editor.a.a */
public final class C44000a {

    /* renamed from: a */
    public static final C44000a f113860a = new C44000a();

    private C44000a() {
    }

    /* renamed from: a */
    public static final boolean m139267a(Activity activity) {
        C7573i.m23587b(activity, "activity");
        Resources resources = activity.getResources();
        C7573i.m23582a((Object) resources, "activity.resources");
        if (resources.getDisplayMetrics().density <= 1.5f) {
            return true;
        }
        return false;
    }
}
