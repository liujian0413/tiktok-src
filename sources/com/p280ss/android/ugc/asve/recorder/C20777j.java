package com.p280ss.android.ugc.asve.recorder;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.reflect.C7585d;

/* renamed from: com.ss.android.ugc.asve.recorder.j */
final /* synthetic */ class C20777j extends PropertyReference0 {
    C20777j(VERecorderImpl vERecorderImpl) {
        super(vERecorderImpl);
    }

    public final String getName() {
        return "cameraController";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(VERecorderImpl.class);
    }

    public final String getSignature() {
        return "getCameraController()Lcom/ss/android/ugc/asve/recorder/camera/ICameraController;";
    }

    public final Object get() {
        return ((VERecorderImpl) this.receiver).mo55846b();
    }
}
