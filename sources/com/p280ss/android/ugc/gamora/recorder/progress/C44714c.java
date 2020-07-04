package com.p280ss.android.ugc.gamora.recorder.progress;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.progress.c */
final /* synthetic */ class C44714c extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f115092a = new C44714c();

    C44714c() {
    }

    public final String getName() {
        return "retakeState";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordMode.class);
    }

    public final String getSignature() {
        return "getRetakeState()I";
    }

    public final Object get(Object obj) {
        return Integer.valueOf(((RecordMode) obj).getRetakeState());
    }
}
