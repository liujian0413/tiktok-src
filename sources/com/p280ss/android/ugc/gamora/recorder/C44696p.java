package com.p280ss.android.ugc.gamora.recorder;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.p */
final /* synthetic */ class C44696p extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f115072a = new C44696p();

    C44696p() {
    }

    public final String getName() {
        return "musicCut";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordViewState.class);
    }

    public final String getSignature() {
        return "getMusicCut()Ljava/lang/Boolean;";
    }

    public final Object get(Object obj) {
        return ((RecordViewState) obj).getMusicCut();
    }
}
