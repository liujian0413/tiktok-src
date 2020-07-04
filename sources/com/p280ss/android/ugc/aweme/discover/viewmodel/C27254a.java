package com.p280ss.android.ugc.aweme.discover.viewmodel;

import android.content.Intent;
import com.p280ss.android.ugc.aweme.search.model.SearchEnterParam;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.a */
public final class C27254a {
    /* renamed from: a */
    public static final void m89271a(Intent intent, SearchEnterParam searchEnterParam) {
        C7573i.m23587b(intent, "$this$addEnterParam");
        intent.putExtra("search_enter_param", searchEnterParam);
    }
}
