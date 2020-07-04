package com.p280ss.android.ugc.aweme.shortvideo.WorkSpace;

import com.p280ss.android.ugc.aweme.shortvideo.edit.C39526e;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.WorkSpace.b */
public final class C38417b {

    /* renamed from: a */
    public static final C38417b f99854a = new C38417b();

    private C38417b() {
    }

    /* renamed from: a */
    public static Workspace m122844a(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        if (videoPublishEditModel.isReviewVideo()) {
            Workspace b = Workspace.m122804b(null, null, videoPublishEditModel.mMusicPath, videoPublishEditModel.reverseVideoPath());
            C7573i.m23582a((Object) b, "Workspace.createFromRevi…model.reverseVideoPath())");
            return b;
        } else if (videoPublishEditModel.isFastImport) {
            Workspace a = Workspace.m122802a(null, null, videoPublishEditModel.mMusicPath, videoPublishEditModel.reverseVideoPath());
            C7573i.m23582a((Object) a, "Workspace.createOldFromD…model.reverseVideoPath())");
            return a;
        } else if (C39526e.m126249b(videoPublishEditModel)) {
            Workspace a2 = Workspace.m122802a(null, null, videoPublishEditModel.mMusicPath, videoPublishEditModel.reverseVideoPath());
            C7573i.m23582a((Object) a2, "Workspace.createOldFromD…model.reverseVideoPath())");
            return a2;
        } else {
            Workspace a3 = Workspace.m122802a(videoPublishEditModel.videoPath(), videoPublishEditModel.audioPath(), videoPublishEditModel.mMusicPath, videoPublishEditModel.reverseVideoPath());
            C7573i.m23582a((Object) a3, "Workspace.createOldFromD…model.reverseVideoPath())");
            return a3;
        }
    }
}
