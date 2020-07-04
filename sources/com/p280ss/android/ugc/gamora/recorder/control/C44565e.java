package com.p280ss.android.ugc.gamora.recorder.control;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.control.e */
final /* synthetic */ class C44565e extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114861a = new C44565e();

    C44565e() {
    }

    public final String getName() {
        return "recordReset";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordControlViewState.class);
    }

    public final String getSignature() {
        return "getRecordReset()Lcom/ss/android/ugc/gamora/jedi/JediUnitEvent;";
    }

    public final Object get(Object obj) {
        return ((RecordControlViewState) obj).getRecordReset();
    }
}
