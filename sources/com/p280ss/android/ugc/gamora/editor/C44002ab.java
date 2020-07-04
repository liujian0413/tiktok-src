package com.p280ss.android.ugc.gamora.editor;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.editor.ab */
final /* synthetic */ class C44002ab extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f113862a = new C44002ab();

    C44002ab() {
    }

    public final String getName() {
        return "resetVideoLengthEvent";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(EditInfoStickerState.class);
    }

    public final String getSignature() {
        return "getResetVideoLengthEvent()Lcom/ss/android/ugc/gamora/jedi/JediIntEvent;";
    }

    public final Object get(Object obj) {
        return ((EditInfoStickerState) obj).getResetVideoLengthEvent();
    }
}
