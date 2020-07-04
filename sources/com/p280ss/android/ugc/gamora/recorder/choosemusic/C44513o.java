package com.p280ss.android.ugc.gamora.recorder.choosemusic;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.o */
final /* synthetic */ class C44513o extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114797a = new C44513o();

    C44513o() {
    }

    public final String getName() {
        return "chooseMusicVisible";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordChooseMusicState.class);
    }

    public final String getSignature() {
        return "getChooseMusicVisible()Z";
    }

    public final Object get(Object obj) {
        return Boolean.valueOf(((RecordChooseMusicState) obj).getChooseMusicVisible());
    }
}
