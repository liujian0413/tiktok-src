package com.p280ss.android.ugc.gamora.editor;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.editor.cl */
final /* synthetic */ class C44282cl extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114447a = new C44282cl();

    C44282cl() {
    }

    public final String getName() {
        return "voiceTitle";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(EditVolumeState.class);
    }

    public final String getSignature() {
        return "getVoiceTitle()Ljava/lang/String;";
    }

    public final Object get(Object obj) {
        return ((EditVolumeState) obj).getVoiceTitle();
    }
}
