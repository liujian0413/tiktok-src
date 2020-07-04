package com.p280ss.android.ugc.gamora.recorder.control;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.control.d */
final /* synthetic */ class C44564d extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114860a = new C44564d();

    C44564d() {
    }

    public final String getName() {
        return "recordEnable";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordControlViewState.class);
    }

    public final String getSignature() {
        return "getRecordEnable()Ljava/lang/Boolean;";
    }

    public final Object get(Object obj) {
        return ((RecordControlViewState) obj).getRecordEnable();
    }
}
