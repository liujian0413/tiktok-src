package com.p280ss.android.ugc.aweme.tools.mvtemplate;

import com.p280ss.android.ugc.gamora.recorder.RecordViewState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.l */
final /* synthetic */ class C42551l extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f110625a = new C42551l();

    C42551l() {
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
