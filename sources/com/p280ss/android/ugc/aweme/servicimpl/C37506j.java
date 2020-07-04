package com.p280ss.android.ugc.aweme.servicimpl;

import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.j */
final /* synthetic */ class C37506j extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f97856a = new C37506j();

    C37506j() {
    }

    public final String getName() {
        return "musicCutable";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordToolbarViewState.class);
    }

    public final String getSignature() {
        return "getMusicCutable()Lcom/ss/android/ugc/gamora/jedi/Event;";
    }

    public final Object get(Object obj) {
        return ((RecordToolbarViewState) obj).getMusicCutable();
    }
}
