package com.p280ss.android.ugc.gamora.editor;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.editor.cm */
final /* synthetic */ class C44283cm extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114448a = new C44283cm();

    C44283cm() {
    }

    public final String getName() {
        return "musicVolume";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(EditVolumeState.class);
    }

    public final String getSignature() {
        return "getMusicVolume()Ljava/lang/Integer;";
    }

    public final Object get(Object obj) {
        return ((EditVolumeState) obj).getMusicVolume();
    }
}
