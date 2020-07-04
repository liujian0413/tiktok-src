package com.p280ss.android.ugc.gamora.recorder;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.s */
final /* synthetic */ class C44721s extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f115099a = new C44721s();

    C44721s() {
    }

    public final String getName() {
        return "showLiveTag";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordViewState.class);
    }

    public final String getSignature() {
        return "getShowLiveTag()Ljava/lang/Integer;";
    }

    public final Object get(Object obj) {
        return ((RecordViewState) obj).getShowLiveTag();
    }
}
