package com.p280ss.android.ugc.gamora.editor;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.editor.ba */
final /* synthetic */ class C44165ba extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114232a = new C44165ba();

    C44165ba() {
    }

    public final String getName() {
        return "editPrepareDone";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(EditPreviewState.class);
    }

    public final String getSignature() {
        return "getEditPrepareDone()Lcom/ss/android/ugc/gamora/jedi/JediUnitEvent;";
    }

    public final Object get(Object obj) {
        return ((EditPreviewState) obj).getEditPrepareDone();
    }
}
