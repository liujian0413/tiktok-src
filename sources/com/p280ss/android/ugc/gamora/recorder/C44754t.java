package com.p280ss.android.ugc.gamora.recorder;

import com.p280ss.android.ugc.gamora.recorder.exit.RecordExitState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.t */
final /* synthetic */ class C44754t extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f115165a = new C44754t();

    C44754t() {
    }

    public final String getName() {
        return "closeVisible";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordExitState.class);
    }

    public final String getSignature() {
        return "getCloseVisible()Z";
    }

    public final Object get(Object obj) {
        return Boolean.valueOf(((RecordExitState) obj).getCloseVisible());
    }
}
