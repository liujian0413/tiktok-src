package com.p280ss.android.ugc.gamora.editor;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.editor.am */
final /* synthetic */ class C44051am extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f113963a = new C44051am();

    C44051am() {
    }

    public final String getName() {
        return "enableCutMusic";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(EditMusicState.class);
    }

    public final String getSignature() {
        return "getEnableCutMusic()Ljava/lang/Boolean;";
    }

    public final Object get(Object obj) {
        return ((EditMusicState) obj).getEnableCutMusic();
    }
}
