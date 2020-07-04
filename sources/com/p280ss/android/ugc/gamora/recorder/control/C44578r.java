package com.p280ss.android.ugc.gamora.recorder.control;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.control.r */
final /* synthetic */ class C44578r extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114874a = new C44578r();

    C44578r() {
    }

    public final String getName() {
        return "recordOnlySetMode";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordControlViewState.class);
    }

    public final String getSignature() {
        return "getRecordOnlySetMode()Lcom/ss/android/ugc/gamora/jedi/Event;";
    }

    public final Object get(Object obj) {
        return ((RecordControlViewState) obj).getRecordOnlySetMode();
    }
}
