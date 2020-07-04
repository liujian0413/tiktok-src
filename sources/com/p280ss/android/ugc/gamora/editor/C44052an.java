package com.p280ss.android.ugc.gamora.editor;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.editor.an */
final /* synthetic */ class C44052an extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f113964a = new C44052an();

    C44052an() {
    }

    public final String getName() {
        return "cutMusic";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(EditMusicState.class);
    }

    public final String getSignature() {
        return "getCutMusic()Lcom/ss/android/ugc/gamora/jedi/JediIntEvent;";
    }

    public final Object get(Object obj) {
        return ((EditMusicState) obj).getCutMusic();
    }
}
