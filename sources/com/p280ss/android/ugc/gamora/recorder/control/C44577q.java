package com.p280ss.android.ugc.gamora.recorder.control;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.control.q */
final /* synthetic */ class C44577q extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114873a = new C44577q();

    C44577q() {
    }

    public final String getName() {
        return "recordMode";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordControlViewState.class);
    }

    public final String getSignature() {
        return "getRecordMode()Lkotlin/Pair;";
    }

    public final Object get(Object obj) {
        return ((RecordControlViewState) obj).getRecordMode();
    }
}
