package com.p280ss.android.ugc.gamora.recorder;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.i */
final /* synthetic */ class C44666i extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f115022a = new C44666i();

    C44666i() {
    }

    public final String getName() {
        return "filter";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordViewState.class);
    }

    public final String getSignature() {
        return "getFilter()Lcom/ss/android/ugc/gamora/jedi/JediUnitEvent;";
    }

    public final Object get(Object obj) {
        return ((RecordViewState) obj).getFilter();
    }
}
