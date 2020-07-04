package com.p280ss.android.ugc.gamora.recorder;

import com.p280ss.android.ugc.gamora.recorder.progress.RecordProgressState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.o */
final /* synthetic */ class C44695o extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f115071a = new C44695o();

    C44695o() {
    }

    public final String getName() {
        return "progressSegmentVisible";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordProgressState.class);
    }

    public final String getSignature() {
        return "getProgressSegmentVisible()Z";
    }

    public final Object get(Object obj) {
        return Boolean.valueOf(((RecordProgressState) obj).getProgressSegmentVisible());
    }
}
