package com.p280ss.android.ugc.gamora.editor;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.editor.f */
final /* synthetic */ class C44324f extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114533a = new C44324f();

    C44324f() {
    }

    public final String getName() {
        return "enableAutoEnhance";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(EditAutoEnhanceState.class);
    }

    public final String getSignature() {
        return "getEnableAutoEnhance()Ljava/lang/Boolean;";
    }

    public final Object get(Object obj) {
        return ((EditAutoEnhanceState) obj).getEnableAutoEnhance();
    }
}
