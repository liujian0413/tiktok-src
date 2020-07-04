package com.p280ss.android.ugc.aweme.servicimpl;

import com.p280ss.android.ugc.gamora.recorder.control.RecordControlViewState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.ab */
final /* synthetic */ class C37459ab extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f97765a = new C37459ab();

    C37459ab() {
    }

    public final String getName() {
        return "takePhoto";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordControlViewState.class);
    }

    public final String getSignature() {
        return "getTakePhoto()Lcom/ss/android/ugc/gamora/jedi/JediUnitEvent;";
    }

    public final Object get(Object obj) {
        return ((RecordControlViewState) obj).getTakePhoto();
    }
}
