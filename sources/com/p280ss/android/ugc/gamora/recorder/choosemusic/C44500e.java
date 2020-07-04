package com.p280ss.android.ugc.gamora.recorder.choosemusic;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.e */
final /* synthetic */ class C44500e extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114783a = new C44500e();

    C44500e() {
    }

    public final String getName() {
        return "ivChooseMusicVisible";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordChooseMusicState.class);
    }

    public final String getSignature() {
        return "getIvChooseMusicVisible()Z";
    }

    public final Object get(Object obj) {
        return Boolean.valueOf(((RecordChooseMusicState) obj).getIvChooseMusicVisible());
    }
}
