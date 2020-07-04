package com.p280ss.android.ugc.gamora.recorder.progress;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.progress.g */
final /* synthetic */ class C44718g extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f115096a = new C44718g();

    C44718g() {
    }

    public final String getName() {
        return "progressClipAnchors";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordMode.class);
    }

    public final String getSignature() {
        return "getProgressClipAnchors()Lkotlin/Pair;";
    }

    public final Object get(Object obj) {
        return ((RecordMode) obj).getProgressClipAnchors();
    }
}
