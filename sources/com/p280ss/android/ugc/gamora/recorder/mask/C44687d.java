package com.p280ss.android.ugc.gamora.recorder.mask;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.mask.d */
final /* synthetic */ class C44687d extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f115057a = new C44687d();

    C44687d() {
    }

    public final String getName() {
        return "showMask";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordMaskViewState.class);
    }

    public final String getSignature() {
        return "getShowMask()Ljava/lang/Boolean;";
    }

    public final Object get(Object obj) {
        return ((RecordMaskViewState) obj).getShowMask();
    }
}
