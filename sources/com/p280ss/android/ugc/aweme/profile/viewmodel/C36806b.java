package com.p280ss.android.ugc.aweme.profile.viewmodel;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.b */
final /* synthetic */ class C36806b extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f96553a = new C36806b();

    C36806b() {
    }

    public final String getName() {
        return "listState";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(MediaMixListState.class);
    }

    public final String getSignature() {
        return "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;";
    }

    public final Object get(Object obj) {
        return ((MediaMixListState) obj).getListState();
    }
}
