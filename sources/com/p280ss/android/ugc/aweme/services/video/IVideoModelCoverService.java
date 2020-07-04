package com.p280ss.android.ugc.aweme.services.video;

import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.services.video.IVideoModelCoverService */
public interface IVideoModelCoverService {
    VideoExposureData converToExposureData(Object obj);

    Serializable convertFromDraft(C27311c cVar);

    boolean instanceOfVideoPublishEditModel(Object obj);
}
