package com.p280ss.android.ugc.gamora.recorder;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.r */
final /* synthetic */ class C44720r extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f115098a = new C44720r();

    C44720r() {
    }

    public final String getName() {
        return "commerceTag";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordViewState.class);
    }

    public final String getSignature() {
        return "getCommerceTag()Lcom/ss/android/ugc/aweme/tools/CommerceGoodsTagEvent;";
    }

    public final Object get(Object obj) {
        return ((RecordViewState) obj).getCommerceTag();
    }
}
