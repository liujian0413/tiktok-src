package com.p280ss.android.ugc.gamora.editor;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.editor.q */
final /* synthetic */ class C44349q extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114571a = new C44349q();

    C44349q() {
    }

    public final String getName() {
        return "currentFilter";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(EditFilterIndicatorState.class);
    }

    public final String getSignature() {
        return "getCurrentFilter()Lcom/ss/android/ugc/aweme/filter/FilterBean;";
    }

    public final Object get(Object obj) {
        return ((EditFilterIndicatorState) obj).getCurrentFilter();
    }
}
