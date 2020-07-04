package com.p280ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.jedi.arch.ext.list.C11583n;
import com.p280ss.android.ugc.aweme.discover.model.SearchApiResult;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.e */
public final class C26733e extends C11583n {

    /* renamed from: c */
    public final String f70445c;

    /* renamed from: d */
    public final SearchApiResult f70446d;

    public C26733e() {
        this(null, false, 0, null, 15, null);
    }

    public C26733e(String str, boolean z, int i, SearchApiResult searchApiResult) {
        C7573i.m23587b(str, "searchId");
        super(z, i);
        this.f70445c = str;
        this.f70446d = searchApiResult;
    }

    public /* synthetic */ C26733e(String str, boolean z, int i, SearchApiResult searchApiResult, int i2, C7571f fVar) {
        this("", true, 0, null);
    }
}
