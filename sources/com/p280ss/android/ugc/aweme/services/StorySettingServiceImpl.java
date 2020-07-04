package com.p280ss.android.ugc.aweme.services;

import com.p280ss.android.ugc.aweme.services.story.IStorySettingService;
import com.p280ss.android.ugc.aweme.story.shootvideo.publish.p1659a.C42023d;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.services.StorySettingServiceImpl */
public final class StorySettingServiceImpl implements IStorySettingService {
    public static final Companion Companion = new Companion(null);
    public static final C7541d INSTANCE$delegate = C7546e.m23569a(StorySettingServiceImpl$Companion$INSTANCE$2.INSTANCE);

    /* renamed from: com.ss.android.ugc.aweme.services.StorySettingServiceImpl$Companion */
    public static final class Companion {
        static final /* synthetic */ C7595j[] $$delegatedProperties = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(Companion.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/ugc/aweme/services/StorySettingServiceImpl;"))};

        private Companion() {
        }

        public static /* synthetic */ void INSTANCE$annotations() {
        }

        public final StorySettingServiceImpl getINSTANCE() {
            return (StorySettingServiceImpl) StorySettingServiceImpl.INSTANCE$delegate.getValue();
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }
    }

    private StorySettingServiceImpl() {
    }

    public static final StorySettingServiceImpl getINSTANCE() {
        return Companion.getINSTANCE();
    }

    public final void loadData() {
        C42023d.m133574a().mo103189b();
    }

    public final void setFirstPublishSuccStatus() {
        C42023d.m133574a().mo103190c();
    }

    public final boolean getStorySettingDoudouSwitch() {
        C7573i.m23582a((Object) C42023d.m133574a(), "StorySettingManager.getInstance()");
        return C42023d.m133575d();
    }

    public /* synthetic */ StorySettingServiceImpl(C7571f fVar) {
        this();
    }
}
