package com.p280ss.android.ugc.aweme.servicimpl;

import com.p280ss.android.ugc.gamora.recorder.RecordViewState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.x */
final /* synthetic */ class C37522x extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f97873a = new C37522x();

    C37522x() {
    }

    public final String getName() {
        return "beauty";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordViewState.class);
    }

    public final String getSignature() {
        return "getBeauty()Z";
    }

    public final Object get(Object obj) {
        return Boolean.valueOf(((RecordViewState) obj).getBeauty());
    }
}
