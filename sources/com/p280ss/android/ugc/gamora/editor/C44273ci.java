package com.p280ss.android.ugc.gamora.editor;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.editor.ci */
final /* synthetic */ class C44273ci extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114432a = new C44273ci();

    C44273ci() {
    }

    public final String getName() {
        return "quitEvent";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(EditState.class);
    }

    public final String getSignature() {
        return "getQuitEvent()Lcom/ss/android/ugc/gamora/jedi/JediUnitEvent;";
    }

    public final Object get(Object obj) {
        return ((EditState) obj).getQuitEvent();
    }
}
