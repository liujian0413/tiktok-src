package com.p280ss.android.ugc.aweme.shortvideo;

import com.google.common.base.C17457s;
import com.google.common.base.C17458t;
import com.google.common.base.Optional;
import com.p280ss.android.ugc.aweme.port.p1479in.IRecordingStateService;
import com.p280ss.android.ugc.aweme.story.api.IAVStoryService;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.RecordingStateServiceImpl */
public class RecordingStateServiceImpl implements IRecordingStateService {
    private final C17457s<Optional<IAVStoryService>> mIAVStoryServiceSupplier = C17458t.m58015a(C39796eh.f103446a);

    public boolean isRecording() {
        Optional optional = (Optional) this.mIAVStoryServiceSupplier.mo44946a();
        if (optional.isPresent()) {
            return ((IAVStoryService) optional.get()).isStoryRecording();
        }
        return false;
    }
}
