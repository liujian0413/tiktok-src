package com.p280ss.android.ugc.gamora.recorder.control;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.control.i */
final /* synthetic */ class C44569i extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114865a = new C44569i();

    C44569i() {
    }

    public final String getName() {
        return "recordStartAnim";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordControlViewState.class);
    }

    public final String getSignature() {
        return "getRecordStartAnim()Lcom/ss/android/ugc/gamora/jedi/JediUnitEvent;";
    }

    public final Object get(Object obj) {
        return ((RecordControlViewState) obj).getRecordStartAnim();
    }
}
