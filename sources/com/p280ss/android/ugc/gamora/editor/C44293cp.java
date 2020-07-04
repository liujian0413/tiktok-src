package com.p280ss.android.ugc.gamora.editor;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.editor.cp */
final /* synthetic */ class C44293cp extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114467a = new C44293cp();

    C44293cp() {
    }

    public final String getName() {
        return "enableEdit";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(EditVoteStickerState.class);
    }

    public final String getSignature() {
        return "getEnableEdit()Ljava/lang/Boolean;";
    }

    public final Object get(Object obj) {
        return ((EditVoteStickerState) obj).getEnableEdit();
    }
}
