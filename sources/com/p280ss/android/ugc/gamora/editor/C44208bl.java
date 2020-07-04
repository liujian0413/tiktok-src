package com.p280ss.android.ugc.gamora.editor;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.editor.bl */
final /* synthetic */ class C44208bl extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114318a = new C44208bl();

    C44208bl() {
    }

    public final String getName() {
        return "curLyricEffect";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(EditLyricStickerState.class);
    }

    public final String getSignature() {
        return "getCurLyricEffect()Lcom/ss/android/ugc/gamora/editor/LyricStyleModel;";
    }

    public final Object get(Object obj) {
        return ((EditLyricStickerState) obj).getCurLyricEffect();
    }
}
