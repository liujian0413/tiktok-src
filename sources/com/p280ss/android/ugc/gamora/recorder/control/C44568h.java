package com.p280ss.android.ugc.gamora.recorder.control;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.control.h */
final /* synthetic */ class C44568h extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114864a = new C44568h();

    C44568h() {
    }

    public final String getName() {
        return "recordStartAnimation";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordControlViewState.class);
    }

    public final String getSignature() {
        return "getRecordStartAnimation()Landroid/view/animation/Animation;";
    }

    public final Object get(Object obj) {
        return ((RecordControlViewState) obj).getRecordStartAnimation();
    }
}
