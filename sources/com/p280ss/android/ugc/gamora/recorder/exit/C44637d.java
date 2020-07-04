package com.p280ss.android.ugc.gamora.recorder.exit;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.exit.d */
final /* synthetic */ class C44637d extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114980a = new C44637d();

    C44637d() {
    }

    public final String getName() {
        return "exitDrawable";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordExitState.class);
    }

    public final String getSignature() {
        return "getExitDrawable()Landroid/graphics/drawable/Drawable;";
    }

    public final Object get(Object obj) {
        return ((RecordExitState) obj).getExitDrawable();
    }
}
