package com.p280ss.android.ugc.gamora.recorder;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.ae */
final /* synthetic */ class C44451ae extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114714a = new C44451ae();

    C44451ae() {
    }

    public final String getName() {
        return "moreCommands";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordViewState.class);
    }

    public final String getSignature() {
        return "getMoreCommands()Ljava/lang/Boolean;";
    }

    public final Object get(Object obj) {
        return ((RecordViewState) obj).getMoreCommands();
    }
}
