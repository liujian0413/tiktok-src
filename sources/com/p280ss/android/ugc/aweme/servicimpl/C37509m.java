package com.p280ss.android.ugc.aweme.servicimpl;

import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.m */
final /* synthetic */ class C37509m extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f97859a = new C37509m();

    C37509m() {
    }

    public final String getName() {
        return "frontRear";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordToolbarViewState.class);
    }

    public final String getSignature() {
        return "getFrontRear()Lcom/ss/android/ugc/gamora/jedi/Event;";
    }

    public final Object get(Object obj) {
        return ((RecordToolbarViewState) obj).getFrontRear();
    }
}
