package com.p280ss.android.ugc.gamora.recorder.control;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.control.o */
final /* synthetic */ class C44575o extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114871a = new C44575o();

    C44575o() {
    }

    public final String getName() {
        return "uploadVisibility";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordControlViewState.class);
    }

    public final String getSignature() {
        return "getUploadVisibility()Ljava/lang/Integer;";
    }

    public final Object get(Object obj) {
        return ((RecordControlViewState) obj).getUploadVisibility();
    }
}
