package com.p280ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.p280ss.android.ugc.aweme.discover.viewmodel.SearchMusicListState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.c */
final /* synthetic */ class C26731c extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f70444a = new C26731c();

    C26731c() {
    }

    public final String getName() {
        return "listState";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(SearchMusicListState.class);
    }

    public final String getSignature() {
        return "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;";
    }

    public final Object get(Object obj) {
        return ((SearchMusicListState) obj).getListState();
    }
}
