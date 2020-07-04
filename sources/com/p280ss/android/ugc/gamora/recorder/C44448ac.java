package com.p280ss.android.ugc.gamora.recorder;

import com.p280ss.android.ugc.gamora.recorder.musiccut.RecordMusicCutViewState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.recorder.ac */
final /* synthetic */ class C44448ac extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f114711a = new C44448ac();

    C44448ac() {
    }

    public final String getName() {
        return "musicCutResult";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecordMusicCutViewState.class);
    }

    public final String getSignature() {
        return "getMusicCutResult()Lcom/ss/android/ugc/gamora/jedi/Event;";
    }

    public final Object get(Object obj) {
        return ((RecordMusicCutViewState) obj).getMusicCutResult();
    }
}
