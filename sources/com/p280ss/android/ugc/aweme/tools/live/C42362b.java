package com.p280ss.android.ugc.aweme.tools.live;

import com.p280ss.android.ugc.gamora.recorder.RecordViewState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.tools.live.b */
final /* synthetic */ class C42362b extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f110177a = new C42362b();

    C42362b() {
    }

    public final String getName() {
        return "onActivityResult";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordViewState.class);
    }

    public final String getSignature() {
        return "getOnActivityResult()Lcom/ss/android/ugc/gamora/jedi/Event;";
    }

    public final Object get(Object obj) {
        return ((RecordViewState) obj).getOnActivityResult();
    }
}
