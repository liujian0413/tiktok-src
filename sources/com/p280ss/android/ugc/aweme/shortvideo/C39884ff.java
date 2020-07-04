package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.gamora.recorder.RecordViewState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ff */
final /* synthetic */ class C39884ff extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f103630a = new C39884ff();

    C39884ff() {
    }

    public final String getName() {
        return "recordContentShow";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordViewState.class);
    }

    public final String getSignature() {
        return "getRecordContentShow()Ljava/lang/Boolean;";
    }

    public final Object get(Object obj) {
        return ((RecordViewState) obj).getRecordContentShow();
    }
}
