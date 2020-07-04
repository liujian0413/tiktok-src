package com.p280ss.android.ugc.gamora.recorder.speed;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.speed.e */
final /* synthetic */ class C44733e extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f115114a = new C44733e();

    C44733e() {
    }

    public final String getName() {
        return "speed";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordSpeedGroupViewState.class);
    }

    public final String getSignature() {
        return "getSpeed()Lcom/ss/android/ugc/aweme/tools/RecordingSpeed;";
    }

    public final Object get(Object obj) {
        return ((RecordSpeedGroupViewState) obj).getSpeed();
    }
}
