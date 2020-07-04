package com.p280ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.p280ss.android.ugc.aweme.port.p1479in.C35546al;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41548c;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl */
public final class VideoRecordEntranceServiceImpl implements IVideoRecordEntranceService {
    public static final Companion Companion = new Companion(null);
    public static final C7541d INSTANCE$delegate = C7546e.m23569a(VideoRecordEntranceServiceImpl$Companion$INSTANCE$2.INSTANCE);

    /* renamed from: com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl$Companion */
    public static final class Companion {
        static final /* synthetic */ C7595j[] $$delegatedProperties = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(Companion.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/ugc/aweme/services/video/VideoRecordEntranceServiceImpl;"))};

        private Companion() {
        }

        public static /* synthetic */ void INSTANCE$annotations() {
        }

        public final VideoRecordEntranceServiceImpl getINSTANCE() {
            return (VideoRecordEntranceServiceImpl) VideoRecordEntranceServiceImpl.INSTANCE$delegate.getValue();
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }
    }

    private VideoRecordEntranceServiceImpl() {
    }

    public static final VideoRecordEntranceServiceImpl getINSTANCE() {
        return Companion.getINSTANCE();
    }

    public /* synthetic */ VideoRecordEntranceServiceImpl(C7571f fVar) {
        this();
    }

    public final void startSuperEntranceRecordActivity(Activity activity, Intent intent) {
        C7573i.m23587b(activity, "activity");
        C41548c.m132317a(activity, intent);
    }

    public final void startToolPermissionActivity(Context context, Intent intent) {
        C35563c.f93228J.mo90366a(context, true, new VideoRecordEntranceServiceImpl$startToolPermissionActivity$2(context, intent));
    }

    public final void startToolPermissionActivity(Activity activity, Intent intent) {
        C35563c.f93228J.mo90366a(activity, true, new VideoRecordEntranceServiceImpl$startToolPermissionActivity$1(activity, intent));
    }

    public final void notifyToolPermissionActivity(Context context, Intent intent, boolean z, boolean z2, boolean z3) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(intent, "intent");
        C35546al alVar = C35563c.f93228J;
        VideoRecordEntranceServiceImpl$notifyToolPermissionActivity$1 videoRecordEntranceServiceImpl$notifyToolPermissionActivity$1 = new VideoRecordEntranceServiceImpl$notifyToolPermissionActivity$1(context, intent, z, z2, z3);
        alVar.mo90366a(context, true, videoRecordEntranceServiceImpl$notifyToolPermissionActivity$1);
    }

    public final void startToolPermissionActivity(Activity activity, Intent intent, boolean z, boolean z2, boolean z3) {
        C7573i.m23587b(activity, "context");
        C7573i.m23587b(intent, "intent");
        C35546al alVar = C35563c.f93228J;
        Context context = activity;
        VideoRecordEntranceServiceImpl$startToolPermissionActivity$3 videoRecordEntranceServiceImpl$startToolPermissionActivity$3 = new VideoRecordEntranceServiceImpl$startToolPermissionActivity$3(activity, intent, z, z2, z3);
        alVar.mo90366a(context, true, videoRecordEntranceServiceImpl$startToolPermissionActivity$3);
    }
}
