package com.p280ss.android.ugc.aweme.shortvideo.edit;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.common.ShareContext;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.festival.FestivalPublishData;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.MainBusinessContext;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.tools.p1665a.C42133c;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.VECherEffectParam;
import com.p280ss.android.vesdk.VEUtils;
import dmt.p1861av.video.VEPreviewParams;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.collections.C7519g;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;
import kotlin.p1884io.C47984g;
import kotlin.text.C7634n;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.e */
public final class C39526e {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.e$a */
    static final class C39527a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ EditPreviewInfo f102589a;

        /* renamed from: b */
        final /* synthetic */ C27311c f102590b;

        /* renamed from: c */
        final /* synthetic */ C7561a f102591c;

        C39527a(EditPreviewInfo editPreviewInfo, C27311c cVar, C7561a aVar) {
            this.f102589a = editPreviewInfo;
            this.f102590b = cVar;
            this.f102591c = aVar;
        }

        public final /* synthetic */ Object call() {
            m126250a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m126250a() {
            List arrayList = new ArrayList();
            int i = 0;
            for (Object next : this.f102589a.getVideoList()) {
                int i2 = i + 1;
                if (i < 0) {
                    C7525m.m23465b();
                }
                EditVideoSegment editVideoSegment = (EditVideoSegment) next;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f102589a.getDraftDir());
                sb.append(C47984g.m148945d(new File(editVideoSegment.getVideoPath())));
                sb.append("_copy");
                String sb2 = sb.toString();
                VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo == null) {
                    C7573i.m23580a();
                }
                int start = (int) videoCutInfo.getStart();
                VideoCutInfo videoCutInfo2 = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo2 == null) {
                    C7573i.m23580a();
                }
                int end = (int) videoCutInfo2.getEnd();
                int[] iArr = {start, end};
                if (editVideoSegment.getVideoFileInfo().getDuration() - ((long) (end - start)) <= DouPlusShareGuideExperiment.MIN_VALID_DURATION) {
                    C7276d.m22820d(editVideoSegment.getVideoPath(), sb2);
                    C41530am.m132280a("draftOpt==>copy full video data");
                } else {
                    File file = new File(sb2);
                    if (!file.exists()) {
                        C7276d.m22803a(sb2, true);
                    } else {
                        file.delete();
                    }
                    VEUtils.trimToDraft(editVideoSegment.getVideoPath(), new int[]{start, end}, sb2, iArr);
                    C41530am.m132280a("draftOpt==>copy apart video data");
                }
                EditVideoSegment editVideoSegment2 = new EditVideoSegment(sb2, editVideoSegment.getAudioPath(), VideoFileInfo.copy$default(editVideoSegment.getVideoFileInfo(), 0, 0, 0, 0, 15, null));
                VideoCutInfo videoCutInfo3 = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo3 != null) {
                    VideoCutInfo videoCutInfo4 = new VideoCutInfo((long) iArr[0], (long) iArr[1], videoCutInfo3.getSpeed(), videoCutInfo3.getRotate());
                    editVideoSegment2.setVideoCutInfo(videoCutInfo4);
                }
                arrayList.add(editVideoSegment2);
                i = i2;
            }
            this.f102590b.mo70237b(arrayList);
            this.f102591c.invoke();
        }
    }

    /* renamed from: a */
    public static final FestivalPublishData m126243a(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "$this$festivalPublishData");
        MainBusinessContext mainBusinessContext = videoPublishEditModel.getMainBusinessContext();
        if (mainBusinessContext == null) {
            return null;
        }
        C7573i.m23582a((Object) mainBusinessContext, "businessContext");
        ShareContext shareContext = mainBusinessContext.getShareContext();
        if (shareContext != null) {
            return m126242a(shareContext);
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m126249b(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "$this$isMiracleGame");
        String str = videoPublishEditModel.mShootWay;
        if (str != null) {
            return C7634n.m23721b(str, "miracle_game", false);
        }
        return false;
    }

    /* renamed from: a */
    public static final FestivalPublishData m126242a(ShareContext shareContext) {
        boolean z;
        FestivalPublishData festivalPublishData;
        C7573i.m23587b(shareContext, "$this$findFestivalData");
        String str = shareContext.mExtras;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            festivalPublishData = (FestivalPublishData) C35574k.m114859a().mo70085S().mo15975a(new JSONObject(str).optString("extra_festival_data"), (Type) FestivalPublishData.class);
        } catch (Exception unused) {
            festivalPublishData = null;
        }
        return festivalPublishData;
    }

    /* renamed from: a */
    public static final MediaModel m126244a(EditVideoSegment editVideoSegment) {
        C7573i.m23587b(editVideoSegment, "$this$toMediaModel");
        MediaModel mediaModel = new MediaModel(-1);
        mediaModel.f88156b = editVideoSegment.getVideoPath();
        mediaModel.f88163i = editVideoSegment.getVideoFileInfo().getWidth();
        mediaModel.f88164j = editVideoSegment.getVideoFileInfo().getHeight();
        mediaModel.f88159e = editVideoSegment.getVideoFileInfo().getDuration();
        return mediaModel;
    }

    /* renamed from: a */
    public static final EditVideoSegment m126245a(VideoSegment videoSegment) {
        C7573i.m23587b(videoSegment, "$this$toEditVideoSegment");
        String a = videoSegment.mo96896a(false);
        C7573i.m23582a((Object) a, "getPath(false)");
        VideoFileInfo videoFileInfo = new VideoFileInfo(videoSegment.f100765g, videoSegment.f100766h, videoSegment.f100761c, videoSegment.mo96902c());
        EditVideoSegment editVideoSegment = new EditVideoSegment(a, null, videoFileInfo);
        VideoCutInfo videoCutInfo = new VideoCutInfo(videoSegment.mo96909h(), videoSegment.mo96910i(), videoSegment.mo96911j(), videoSegment.f100769k);
        editVideoSegment.setVideoCutInfo(videoCutInfo);
        return editVideoSegment;
    }

    /* renamed from: a */
    public static final VideoFileInfo m126246a(String str) {
        C7573i.m23587b(str, "$this$videoFileInfo");
        int[] iArr = new int[10];
        if (C42133c.m134093a(str, iArr) == 0) {
            VideoFileInfo videoFileInfo = new VideoFileInfo(iArr[0], iArr[1], (long) iArr[3], iArr[7]);
            return videoFileInfo;
        }
        VideoFileInfo videoFileInfo2 = new VideoFileInfo(0, 0, 0, 0);
        return videoFileInfo2;
    }

    /* renamed from: a */
    public static final VEPreviewParams m126247a(VideoPublishEditModel videoPublishEditModel, int i, int i2) {
        C7573i.m23587b(videoPublishEditModel, "$this$toPreviewParams");
        VEPreviewParams vEPreviewParams = new VEPreviewParams();
        EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
        int size = previewInfo.getVideoList().size();
        String[] strArr = new String[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            strArr[i4] = "";
        }
        vEPreviewParams.mVideoPaths = strArr;
        String[] strArr2 = new String[size];
        for (int i5 = 0; i5 < size; i5++) {
            strArr2[i5] = "";
        }
        vEPreviewParams.mAudioPaths = strArr2;
        for (Object next : previewInfo.getVideoList()) {
            int i6 = i3 + 1;
            if (i3 < 0) {
                C7525m.m23465b();
            }
            EditVideoSegment editVideoSegment = (EditVideoSegment) next;
            vEPreviewParams.mVideoPaths[i3] = editVideoSegment.getVideoPath();
            vEPreviewParams.mAudioPaths[i3] = editVideoSegment.getAudioPath();
            VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
            if (videoCutInfo != null) {
                if (vEPreviewParams.speedArray == null) {
                    vEPreviewParams.speedArray = new float[size];
                }
                if (vEPreviewParams.rotateArray == null) {
                    vEPreviewParams.rotateArray = new int[size];
                }
                if (vEPreviewParams.mVTrimIn == null) {
                    vEPreviewParams.mVTrimIn = new int[size];
                }
                if (vEPreviewParams.mVTrimOut == null) {
                    vEPreviewParams.mVTrimOut = new int[size];
                }
                vEPreviewParams.speedArray[i3] = videoCutInfo.getSpeed();
                vEPreviewParams.rotateArray[i3] = videoCutInfo.getRotate();
                vEPreviewParams.mVTrimIn[i3] = (int) videoCutInfo.getStart();
                vEPreviewParams.mVTrimOut[i3] = (int) videoCutInfo.getEnd();
            }
            i3 = i6;
        }
        vEPreviewParams.sceneIn = (int) previewInfo.getSceneIn();
        vEPreviewParams.sceneOut = (int) previewInfo.getSceneOut();
        vEPreviewParams.previewWidth = previewInfo.getPreviewWidth();
        vEPreviewParams.previewHeight = previewInfo.getPreviewHeight();
        if (i != -1) {
            vEPreviewParams.mPageType = i;
        }
        if (i2 != -1) {
            vEPreviewParams.mFps = i2;
        }
        vEPreviewParams.mWorkspace = videoPublishEditModel.draftDir();
        vEPreviewParams.canvasWidth = videoPublishEditModel.mVideoCanvasWidth;
        vEPreviewParams.canvasHeight = videoPublishEditModel.mVideoCanvasHeight;
        vEPreviewParams.mVolume = videoPublishEditModel.voiceVolume;
        vEPreviewParams.mMusicVolume = videoPublishEditModel.musicVolume;
        vEPreviewParams.mMusicInPoint = videoPublishEditModel.mMusicStart;
        vEPreviewParams.mMusicOutPoint = videoPublishEditModel.mMusicEnd;
        vEPreviewParams.mMusicPath = videoPublishEditModel.mMusicPath;
        vEPreviewParams.isFastImport = videoPublishEditModel.isFastImport;
        vEPreviewParams.mIsFromDraft = videoPublishEditModel.mIsFromDraft;
        vEPreviewParams.videoEditorType = videoPublishEditModel.videoEditorType;
        vEPreviewParams.mvCreateVideoData = videoPublishEditModel.mvCreateVideoData;
        vEPreviewParams.statusCreateVideoData = videoPublishEditModel.statusCreateVideoData;
        vEPreviewParams.recordData = videoPublishEditModel.multiEditVideoRecordData;
        if (videoPublishEditModel.veCherEffectParam != null) {
            String[] matrix = videoPublishEditModel.veCherEffectParam.getMatrix();
            double[] duration = videoPublishEditModel.veCherEffectParam.getDuration();
            boolean[] segUseCher = videoPublishEditModel.veCherEffectParam.getSegUseCher();
            if (segUseCher == null) {
                C7573i.m23580a();
            }
            vEPreviewParams.veCherEffectParam = new VECherEffectParam(matrix, duration, segUseCher);
        }
        if (videoPublishEditModel.veAudioEffectParam != null) {
            vEPreviewParams.veAudioEffectParam = videoPublishEditModel.veAudioEffectParam;
        }
        if (videoPublishEditModel.isFastImport) {
            vEPreviewParams.mAudioPaths = null;
        }
        vEPreviewParams.fromPublishVideo = videoPublishEditModel.isReviewVideo();
        String[] strArr3 = vEPreviewParams.mAudioPaths;
        if (strArr3 != null) {
            List c = C7519g.m23444c((T[]) strArr3);
            if (c != null && c.isEmpty()) {
                vEPreviewParams.mAudioPaths = null;
            }
        }
        return vEPreviewParams;
    }

    /* renamed from: a */
    public static final void m126248a(EditPreviewInfo editPreviewInfo, C27311c cVar, C7561a<C7581n> aVar) {
        C7573i.m23587b(editPreviewInfo, "$this$copy2Draft");
        C7573i.m23587b(cVar, "draft");
        C7573i.m23587b(aVar, "updateDraft");
        C1592h.m7853a((Callable<TResult>) new C39527a<TResult>(editPreviewInfo, cVar, aVar));
    }
}
