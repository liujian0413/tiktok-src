package com.p280ss.android.ugc.aweme.discover.jedi.viewmodel;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.a */
final /* synthetic */ class C26729a extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f70443a = new C26729a();

    C26729a() {
    }

    public final String getName() {
        return "listState";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(SearchState.class);
    }

    public final String getSignature() {
        return "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;";
    }

    public final Object get(Object obj) {
        return ((SearchState) obj).getListState();
    }
}
