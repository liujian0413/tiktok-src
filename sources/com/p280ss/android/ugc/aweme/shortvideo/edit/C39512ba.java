package com.p280ss.android.ugc.aweme.shortvideo.edit;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.ba */
public final class C39512ba {
    /* renamed from: a */
    public static final C39504az m126206a(VideoPublishEditModel videoPublishEditModel, boolean z) {
        C39395a aVar;
        C39395a aVar2;
        C7573i.m23587b(videoPublishEditModel, "model");
        if (z) {
            if (videoPublishEditModel.isFastImport) {
                aVar2 = new C39784u(videoPublishEditModel);
            } else {
                aVar2 = new C39785v(videoPublishEditModel);
            }
            return aVar2;
        }
        if (videoPublishEditModel.isFastImport) {
            aVar = new C39676k(videoPublishEditModel);
        } else {
            aVar = new C39514c(videoPublishEditModel);
        }
        return aVar;
    }
}
