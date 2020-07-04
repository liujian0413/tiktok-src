package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ak */
final /* synthetic */ class C38948ak extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f101148a = new C38948ak();

    C38948ak() {
    }

    public final String getName() {
        return "restartProgress";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(CutVideoPreviewState.class);
    }

    public final String getSignature() {
        return "getRestartProgress()Lcom/ss/android/ugc/gamora/jedi/JediUnitEvent;";
    }

    public final Object get(Object obj) {
        return ((CutVideoPreviewState) obj).getRestartProgress();
    }
}
