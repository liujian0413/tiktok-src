package com.p280ss.android.ugc.aweme.shortvideo.edit;

import com.p280ss.android.ugc.aweme.services.publish.PublishOutput;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.ay */
public final class C39503ay {
    /* renamed from: a */
    public static final PublishOutput m126179a(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "$this$toPublishOutput");
        PublishOutput publishOutput = new PublishOutput(videoPublishEditModel.creationId, videoPublishEditModel.videoPath(), videoPublishEditModel.musicId, videoPublishEditModel.isCommercialMusic(), videoPublishEditModel.isOriginalSound());
        return publishOutput;
    }
}
