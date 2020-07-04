package com.p280ss.android.ugc.gamora.editor;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.editor.au */
final /* synthetic */ class C44081au extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114016a = new C44081au();

    C44081au() {
    }

    public final String getName() {
        return "autoStartStopArbiterEvent";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(EditPreviewState.class);
    }

    public final String getSignature() {
        return "getAutoStartStopArbiterEvent()Lcom/ss/android/ugc/gamora/jedi/JediBooleanEvent;";
    }

    public final Object get(Object obj) {
        return ((EditPreviewState) obj).getAutoStartStopArbiterEvent();
    }
}
