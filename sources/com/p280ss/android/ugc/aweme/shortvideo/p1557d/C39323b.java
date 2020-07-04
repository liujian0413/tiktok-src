package com.p280ss.android.ugc.aweme.shortvideo.p1557d;

import com.p280ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.status.StatusCreateVideoData;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.d.b */
public final class C39323b {

    /* renamed from: c */
    public static final C39324a f102142c = new C39324a(null);

    /* renamed from: a */
    public final int f102143a;

    /* renamed from: b */
    public final String f102144b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.d.b$a */
    public static final class C39324a {
        private C39324a() {
        }

        public /* synthetic */ C39324a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C39323b m125657a(VideoPublishEditModel videoPublishEditModel) {
            C7573i.m23587b(videoPublishEditModel, "model");
            if (videoPublishEditModel.isMvThemeVideoType()) {
                return new C39323b(videoPublishEditModel.mvCreateVideoData.videoCoverStartTime, videoPublishEditModel.mvCreateVideoData.videoCoverImgPath);
            }
            if (videoPublishEditModel.isStatusVideoType()) {
                return new C39323b(videoPublishEditModel.statusCreateVideoData.getVideoCoverStartTime(), videoPublishEditModel.statusCreateVideoData.getVideoCoverImgPath());
            }
            return new C39323b((int) (videoPublishEditModel.mVideoCoverStartTm * 1000.0f), null, 2, null);
        }
    }

    /* renamed from: b */
    public static final C39323b m125655b(VideoPublishEditModel videoPublishEditModel) {
        return C39324a.m125657a(videoPublishEditModel);
    }

    /* renamed from: a */
    public final void mo97889a(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        if (videoPublishEditModel.isMvThemeVideoType() && videoPublishEditModel.mvCreateVideoData != null) {
            MvCreateVideoData mvCreateVideoData = videoPublishEditModel.mvCreateVideoData;
            mvCreateVideoData.videoCoverStartTime = this.f102143a;
            mvCreateVideoData.videoCoverImgPath = this.f102144b;
        } else if (!videoPublishEditModel.isStatusVideoType() || videoPublishEditModel.statusCreateVideoData == null) {
            videoPublishEditModel.mVideoCoverStartTm = ((float) this.f102143a) / 1000.0f;
        } else {
            StatusCreateVideoData statusCreateVideoData = videoPublishEditModel.statusCreateVideoData;
            statusCreateVideoData.setVideoCoverStartTime(this.f102143a);
            statusCreateVideoData.setVideoCoverImgPath(this.f102144b);
        }
    }

    public C39323b(int i, String str) {
        this.f102143a = i;
        this.f102144b = str;
    }

    public /* synthetic */ C39323b(int i, String str, int i2, C7571f fVar) {
        this(i, null);
    }
}
