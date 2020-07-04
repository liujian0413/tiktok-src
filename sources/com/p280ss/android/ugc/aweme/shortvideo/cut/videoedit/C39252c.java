package com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.c */
public interface C39252c {
    /* renamed from: a */
    void mo97620a();

    /* renamed from: a */
    void mo97624a(C0902i<Float, Float> iVar, boolean z);

    /* renamed from: a */
    void mo97599a(List<VideoSegment> list);

    /* renamed from: a */
    void mo97600a(boolean z);

    /* renamed from: a */
    void mo97628a(boolean z, C0902i<Float, Float> iVar);

    /* renamed from: a */
    boolean mo97632a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, String str);

    /* renamed from: a */
    boolean mo97633a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, List<MediaModel> list);

    /* renamed from: a */
    boolean mo97634a(FragmentActivity fragmentActivity, CutMultiVideoViewModel cutMultiVideoViewModel, List<MediaModel> list, boolean z);

    /* renamed from: b */
    void mo97635b();

    /* renamed from: c */
    void mo97640c();

    /* renamed from: d */
    void mo97602d();

    /* renamed from: e */
    void mo97603e();

    /* renamed from: f */
    boolean mo97642f();

    int getCurrentRotate();

    float getCurrentSpeed();

    int getEditState();

    long getLeftSeekingValue();

    long getMaxCutDuration();

    long getMultiPlayingPosition();

    long getMultiSeekTime();

    C0902i<Long, Long> getPlayBoundary();

    long getPlayingPosition();

    long getRightSeekingValue();

    float getSelectedTime();

    long getSinglePlayingPosition();

    long getSingleSeekTime();

    C0902i<Float, Float> getSlideX();

    void setExtractFramesInRoughMode(boolean z);

    void setLoadThumbnailDirectly(boolean z);

    void setMaxVideoLength(long j);

    void setMinVideoLength(long j);
}
