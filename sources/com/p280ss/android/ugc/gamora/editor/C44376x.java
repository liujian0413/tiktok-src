package com.p280ss.android.ugc.gamora.editor;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.editor.x */
final /* synthetic */ class C44376x extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114630a = new C44376x();

    C44376x() {
    }

    public final String getName() {
        return "gestureAnimEvent";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(EditGestureState.class);
    }

    public final String getSignature() {
        return "getGestureAnimEvent()Lcom/ss/android/ugc/gamora/jedi/JediPairEvent;";
    }

    public final Object get(Object obj) {
        return ((EditGestureState) obj).getGestureAnimEvent();
    }
}
