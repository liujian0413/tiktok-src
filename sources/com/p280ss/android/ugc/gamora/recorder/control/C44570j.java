package com.p280ss.android.ugc.gamora.recorder.control;

import com.p280ss.android.ugc.gamora.recorder.RecordViewState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.control.j */
final /* synthetic */ class C44570j extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114866a = new C44570j();

    C44570j() {
    }

    public final String getName() {
        return "relayout";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordViewState.class);
    }

    public final String getSignature() {
        return "getRelayout()Lcom/ss/android/ugc/gamora/jedi/MultiEvent;";
    }

    public final Object get(Object obj) {
        return ((RecordViewState) obj).getRelayout();
    }
}
