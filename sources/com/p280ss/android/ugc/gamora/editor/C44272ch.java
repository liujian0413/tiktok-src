package com.p280ss.android.ugc.gamora.editor;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.editor.ch */
final /* synthetic */ class C44272ch extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114431a = new C44272ch();

    C44272ch() {
    }

    public final String getName() {
        return "nextStepEvent";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(EditState.class);
    }

    public final String getSignature() {
        return "getNextStepEvent()Lcom/ss/android/ugc/gamora/jedi/JediUnitEvent;";
    }

    public final Object get(Object obj) {
        return ((EditState) obj).getNextStepEvent();
    }
}
