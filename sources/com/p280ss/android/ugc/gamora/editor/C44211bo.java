package com.p280ss.android.ugc.gamora.editor;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.editor.bo */
final /* synthetic */ class C44211bo extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114321a = new C44211bo();

    C44211bo() {
    }

    public final String getName() {
        return "votingTopMargin";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(EditStickerState.class);
    }

    public final String getSignature() {
        return "getVotingTopMargin()Ljava/lang/Integer;";
    }

    public final Object get(Object obj) {
        return ((EditStickerState) obj).getVotingTopMargin();
    }
}
