package com.p280ss.android.ugc.aweme.services.video;

import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39502ax;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.Serializable;
import java.util.UUID;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.services.video.VideoModelCoverServiceImpl */
public final class VideoModelCoverServiceImpl implements IVideoModelCoverService {
    public static final Companion Companion = new Companion(null);
    public static final C7541d INSTANCE$delegate = C7546e.m23569a(VideoModelCoverServiceImpl$Companion$INSTANCE$2.INSTANCE);

    /* renamed from: com.ss.android.ugc.aweme.services.video.VideoModelCoverServiceImpl$Companion */
    public static final class Companion {
        static final /* synthetic */ C7595j[] $$delegatedProperties = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(Companion.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/ugc/aweme/services/video/VideoModelCoverServiceImpl;"))};

        private Companion() {
        }

        public static /* synthetic */ void INSTANCE$annotations() {
        }

        public final VideoModelCoverServiceImpl getINSTANCE() {
            return (VideoModelCoverServiceImpl) VideoModelCoverServiceImpl.INSTANCE$delegate.getValue();
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }
    }

    private VideoModelCoverServiceImpl() {
    }

    public static final VideoModelCoverServiceImpl getINSTANCE() {
        return Companion.getINSTANCE();
    }

    public /* synthetic */ VideoModelCoverServiceImpl(C7571f fVar) {
        this();
    }

    public final boolean instanceOfVideoPublishEditModel(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj instanceof VideoPublishEditModel;
    }

    public final Serializable convertFromDraft(C27311c cVar) {
        C7573i.m23587b(cVar, "awemeDraft");
        new C39502ax("VideoModelCoverServiceImpl");
        VideoPublishEditModel a = C39502ax.m126170a(cVar);
        C7573i.m23582a((Object) a, "VideoPublishEditModelBri…vertFromDraft(awemeDraft)");
        return a;
    }

    public final VideoExposureData converToExposureData(Object obj) {
        C7573i.m23587b(obj, "any");
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        String videoPath = videoPublishEditModel.videoPath();
        C7573i.m23582a((Object) videoPath, "any.videoPath()");
        float f = videoPublishEditModel.mVideoCoverStartTm;
        String mainBusinessData = videoPublishEditModel.getMainBusinessData();
        String str = videoPublishEditModel.mOutputFile;
        C7573i.m23582a((Object) str, "any.mOutputFile");
        String videoPath2 = videoPublishEditModel.videoPath();
        C7573i.m23582a((Object) videoPath2, "any.videoPath()");
        String str2 = videoPublishEditModel.creationId;
        if (str2 == null) {
            str2 = UUID.randomUUID().toString();
            C7573i.m23582a((Object) str2, "UUID.randomUUID().toString()");
        }
        VideoExposureData videoExposureData = new VideoExposureData(videoPath, f, mainBusinessData, str, videoPath2, str2, videoPublishEditModel.isSaveLocal(), videoPublishEditModel.getLocalFinalPath(), videoPublishEditModel.mSaveModel, videoPublishEditModel.mOrigin, videoPublishEditModel.getDraftPrimaryKey(), videoPublishEditModel.mShootWay);
        return videoExposureData;
    }
}
