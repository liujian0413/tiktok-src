package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.z */
final /* synthetic */ class C39103z extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f101414a = new C39103z();

    C39103z() {
    }

    public final String getName() {
        return "deleteSegEvent";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(CutVideoListState.class);
    }

    public final String getSignature() {
        return "getDeleteSegEvent()Lcom/ss/android/ugc/gamora/jedi/JediUnitEvent;";
    }

    public final Object get(Object obj) {
        return ((CutVideoListState) obj).getDeleteSegEvent();
    }
}
