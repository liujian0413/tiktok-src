package com.p280ss.android.ugc.aweme.shortvideo.edit;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ttve.editorInfo.C20455a;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.common.ShareContext;
import com.p280ss.android.ugc.aweme.draft.model.C27309a;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.draft.model.C27312d;
import com.p280ss.android.ugc.aweme.draft.model.C27318e;
import com.p280ss.android.ugc.aweme.draft.model.C27320g;
import com.p280ss.android.ugc.aweme.draft.model.DefaultSelectStickerPoi;
import com.p280ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.p280ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p280ss.android.ugc.aweme.effect.EffectListModel;
import com.p280ss.android.ugc.aweme.effect.EffectPointModel;
import com.p280ss.android.ugc.aweme.imported.C32067c;
import com.p280ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p280ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.p280ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.C40005j;
import com.p280ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.p280ss.android.ugc.aweme.shortvideo.WorkSpace.C38417b;
import com.p280ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.MainBusinessContext;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVETParameterKt;
import com.p280ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.StoryFestivalModel;
import com.p280ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40414d;
import com.p280ss.android.ugc.aweme.shortvideo.stickpoint.StickPointData;
import com.p280ss.android.ugc.aweme.status.StatusCreateVideoData;
import com.p280ss.android.ugc.aweme.sticker.StickerInfo;
import com.p280ss.android.ugc.aweme.tools.extension.C42311e;
import com.p280ss.android.ugc.aweme.tools.extension.Scene;
import com.p280ss.android.ugc.aweme.utils.C43009cd;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.ax */
public final class C39502ax {

    /* renamed from: a */
    private final String f102554a;

    public C39502ax(String str) {
        this.f102554a = str;
    }

    /* renamed from: c */
    private static ClientCherEffectParam m126175c(C27311c cVar) {
        if (cVar == null || cVar.f72031S == null || cVar.mo70217af() == null) {
            return null;
        }
        C27318e af = cVar.mo70217af();
        return new ClientCherEffectParam(af.f72066a, af.f72067b, af.f72068c);
    }

    /* renamed from: b */
    private static C27318e m126171b(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null || videoPublishEditModel.veCherEffectParam == null) {
            return null;
        }
        return new C27318e(videoPublishEditModel.veCherEffectParam.getMatrix(), videoPublishEditModel.veCherEffectParam.getDuration(), videoPublishEditModel.veCherEffectParam.getSegUseCher());
    }

    /* renamed from: c */
    private static C27320g m126174c(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null || videoPublishEditModel.veAudioEffectParam == null) {
            return null;
        }
        C27320g gVar = new C27320g(videoPublishEditModel.veAudioEffectParam.getUploadId(), videoPublishEditModel.veAudioEffectParam.getTrackType(), videoPublishEditModel.veAudioEffectParam.getTrackIndex(), videoPublishEditModel.veAudioEffectParam.getEffectPath(), videoPublishEditModel.veAudioEffectParam.getEffectTag(), videoPublishEditModel.veAudioEffectParam.getSeqIn(), videoPublishEditModel.veAudioEffectParam.getSeqOut());
        return gVar;
    }

    /* renamed from: d */
    private static AudioEffectParam m126176d(C27311c cVar) {
        String str;
        if (cVar == null || cVar.f72031S == null || cVar.mo70218ag() == null) {
            return null;
        }
        C27320g ag = cVar.mo70218ag();
        if (ag.f72077a != null) {
            str = ag.f72077a;
        } else {
            str = "";
        }
        AudioEffectParam audioEffectParam = new AudioEffectParam(str, ag.f72078b, ag.f72079c, ag.f72080d, ag.f72081e, ag.f72082f, ag.f72083g, null);
        return audioEffectParam;
    }

    /* renamed from: a */
    public final VideoPublishEditModel mo98354a(Intent intent) {
        float f;
        float f2;
        VideoPublishEditModel b = m126172b(intent);
        if (b.getDuetFrom() != null) {
            f = 1.0f;
        } else {
            f = intent.getFloatExtra("music_volume", 0.5f);
        }
        b.musicVolume = f;
        if (b.isMuted) {
            f2 = 0.0f;
        } else {
            f2 = intent.getFloatExtra("voice_volume", 0.5f);
        }
        b.voiceVolume = f2;
        if (b.isFastImport && b.isStickPointMode) {
            b.voiceVolume = 0.0f;
        }
        return b;
    }

    /* renamed from: b */
    private void m126173b(C27311c cVar) {
        int a = C27312d.m89559a(cVar);
        if (a != 0 && !cVar.mo70177S()) {
            C6893q.m21444a("aweme_draft_load_fail_rate", -1, C6869c.m21381a().mo16887a("owner", this.f102554a).mo16887a("validity", String.valueOf(a)).mo16887a("videoPath", C27312d.m89562b(cVar)).mo16882a("is_fast_import", Boolean.valueOf(cVar.mo70215ad())).mo16888b());
        }
    }

    /* renamed from: a */
    public static VideoPublishEditModel m126170a(C27311c cVar) {
        boolean z;
        String str;
        float f;
        VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        videoPublishEditModel.setPreviewInfo(cVar.mo70214ac());
        videoPublishEditModel.mDir = C39811er.f103468d;
        if (cVar.mo70177S()) {
            videoPublishEditModel.mvCreateVideoData = cVar.mo70175Q();
            if (videoPublishEditModel.mvCreateVideoData == null || videoPublishEditModel.mvCreateVideoData.mvType != 1) {
                videoPublishEditModel.videoEditorType = 2;
            } else {
                videoPublishEditModel.videoEditorType = 3;
            }
            videoPublishEditModel.uploadMiscInfoStruct = cVar.mo70183Y();
        }
        if (cVar.mo70178T()) {
            videoPublishEditModel.statusCreateVideoData = cVar.mo70176R();
            videoPublishEditModel.videoEditorType = 5;
            videoPublishEditModel.uploadMiscInfoStruct = cVar.mo70183Y();
        }
        videoPublishEditModel.isStickPointMode = cVar.mo70184Z();
        if (videoPublishEditModel.isStickPointMode) {
            videoPublishEditModel.stickPointData = cVar.mo70232au();
        }
        videoPublishEditModel.containBackgroundVideo = cVar.mo70212aa();
        videoPublishEditModel.isFastImport = cVar.mo70215ad();
        videoPublishEditModel.fastImportResolution = cVar.mo70216ae();
        videoPublishEditModel.title = cVar.f72033b.f71933a;
        videoPublishEditModel.challenges = cVar.f72033b.f71935c;
        videoPublishEditModel.structList = cVar.f72033b.f71934b;
        videoPublishEditModel.musicId = C32067c.m104094a(cVar.f72036e);
        videoPublishEditModel.mMusicPath = cVar.f72038g;
        videoPublishEditModel.mMusicStart = cVar.f72043l;
        videoPublishEditModel.mMusicEnd = cVar.mo70264i();
        videoPublishEditModel.mMusicOrigin = cVar.mo70301w();
        videoPublishEditModel.mSelectedId = cVar.f72042k;
        videoPublishEditModel.mFaceBeauty = cVar.f72016D;
        videoPublishEditModel.mCameraPosition = cVar.f72051t;
        videoPublishEditModel.mCurFilterLabels = cVar.f72050s;
        videoPublishEditModel.mCurFilterIds = cVar.mo70233b();
        videoPublishEditModel.mOrigin = cVar.f72045n;
        videoPublishEditModel.mVideoSegmentsDesc = cVar.f72019G;
        videoPublishEditModel.mHardEncode = cVar.f72020H;
        videoPublishEditModel.mStickerID = cVar.f72023K;
        videoPublishEditModel.defaultSelectStickerPoi = cVar.mo70272k();
        videoPublishEditModel.isPrivate = cVar.f72013A;
        videoPublishEditModel.commentSetting = cVar.mo70281n();
        videoPublishEditModel.maxDuration = cVar.f72015C;
        videoPublishEditModel.audioTrack = cVar.f72048q;
        videoPublishEditModel.videoSpeed = cVar.f72047p;
        videoPublishEditModel.cameraIds = cVar.mo70284o();
        videoPublishEditModel.beautyType = cVar.mo70287p();
        videoPublishEditModel.mUploadPath = cVar.mo70244d();
        videoPublishEditModel.importInfoList = cVar.mo70290q();
        videoPublishEditModel.metadataMap = cVar.mo70297t();
        videoPublishEditModel.commerceData = C35563c.f93251n.mo83169a(cVar);
        videoPublishEditModel.mSelectedFilterIntensity = cVar.mo70228aq();
        videoPublishEditModel.setVideoLength(cVar.f72033b.f71936d);
        if (cVar.f72014B != null) {
            videoPublishEditModel.mEffectList = cVar.f72014B.getEffectPointModels();
        }
        int i = cVar.f72044m;
        if (i != 0) {
            videoPublishEditModel.mTimeEffect = new EffectPointModel();
            videoPublishEditModel.mTimeEffect.setKey(String.valueOf(i));
            videoPublishEditModel.mTimeEffect.setEndPoint(cVar.f72021I);
        }
        videoPublishEditModel.mVideoCoverStartTm = cVar.f72027O;
        videoPublishEditModel.setVideoCoverPath(cVar.mo70275l());
        videoPublishEditModel.mOutVideoWidth = cVar.mo70248e();
        videoPublishEditModel.mOutVideoHeight = cVar.mo70252f();
        videoPublishEditModel.mVideoCanvasWidth = cVar.mo70256g();
        videoPublishEditModel.mVideoCanvasHeight = cVar.mo70260h();
        if (cVar.f72036e != null && C35563c.f93259v.mo83157e()) {
            videoPublishEditModel.mId3Album = cVar.f72036e.getAlbum();
            videoPublishEditModel.mId3Author = cVar.f72036e.getSinger();
            videoPublishEditModel.mId3Title = cVar.f72036e.getName();
            videoPublishEditModel.mMusicType = C35563c.f93246i.mo103860a(cVar.f72036e.getMusicType()) ? 1 : 0;
            videoPublishEditModel.previewStartTime = cVar.f72036e.getPreviewStartTime();
        }
        videoPublishEditModel.mDuetFrom = cVar.f72028P;
        videoPublishEditModel.mSyncPlatforms = cVar.f72029Q;
        boolean z2 = false;
        if (cVar.mo70299u() == 1) {
            z = true;
        } else {
            z = false;
        }
        videoPublishEditModel.mFromMultiCut = z;
        if (cVar.mo70299u() == 0) {
            z2 = true;
        }
        videoPublishEditModel.mFromCut = z2;
        videoPublishEditModel.mShootMode = cVar.mo70300v();
        videoPublishEditModel.microAppId = cVar.mo70168J();
        videoPublishEditModel.microAppModel = cVar.mo70170L();
        videoPublishEditModel.microAppModel = cVar.mo70170L();
        videoPublishEditModel.creationId = cVar.mo70303y();
        videoPublishEditModel.draftId = cVar.mo70304z();
        float f2 = 0.5f;
        float f3 = 0.0f;
        if (cVar.f72026N == C35563c.f93224F.mo70090e().mo90403b()) {
            videoPublishEditModel.voiceVolume = ((float) cVar.f72040i) / 100.0f;
            f2 = ((float) cVar.f72041j) / 100.0f;
        } else {
            if (videoPublishEditModel.getWavFile() == null) {
                f = 0.0f;
            } else {
                f = 0.5f;
            }
            videoPublishEditModel.voiceVolume = f;
            if (videoPublishEditModel.isMusic() <= 0) {
                f2 = 0.0f;
            }
        }
        videoPublishEditModel.musicVolume = f2;
        videoPublishEditModel.mShootWay = cVar.mo70162D();
        videoPublishEditModel.autoEnhanceType = cVar.mo70224am();
        videoPublishEditModel.autoEnhanceOn = cVar.mo70223al();
        videoPublishEditModel.mDurationMode = cVar.mo70302x();
        videoPublishEditModel.mIsMultiVideo = cVar.mo70159A();
        videoPublishEditModel.setNewVersion(cVar.f72026N);
        videoPublishEditModel.reactionParams = cVar.mo70163E();
        videoPublishEditModel.isMuted = cVar.mo70164F();
        if (!videoPublishEditModel.isMuted) {
            f3 = videoPublishEditModel.voiceVolume;
        }
        videoPublishEditModel.voiceVolume = f3;
        videoPublishEditModel.recordMode = cVar.mo70160B();
        videoPublishEditModel.gameScore = cVar.mo70161C();
        videoPublishEditModel.extractFramesModel = cVar.mo70165G();
        videoPublishEditModel.mSaveModel = cVar.mo70166H();
        videoPublishEditModel.infoStickerModel = cVar.mo70169K();
        videoPublishEditModel.poiId = cVar.mo70167I();
        videoPublishEditModel.videoType = cVar.mo70171M();
        videoPublishEditModel.usePaint = cVar.mo70173O();
        videoPublishEditModel.texts = cVar.mo70172N();
        videoPublishEditModel.socialModel = cVar.mo70174P();
        Workspace a = C38417b.m122844a(videoPublishEditModel);
        videoPublishEditModel.mOutputFile = a.mo96322j().getPath();
        videoPublishEditModel.mEncodedAudioOutputFile = a.mo96323k().getPath();
        videoPublishEditModel.mParallelUploadOutputFile = a.mo96324l().getPath();
        C42311e.m134571a(C40005j.m127912b(cVar.f72031S), C40005j.m127911b((BaseShortVideoContext) videoPublishEditModel), Scene.DRAFT, Scene.PUBLISH);
        if (cVar.f72031S == null) {
            str = null;
        } else {
            str = cVar.f72031S.f71944H;
        }
        videoPublishEditModel.mFirstStickerMusicIdsJson = str;
        videoPublishEditModel.draftEditTransferModel = new DraftEditTransferModel(cVar.mo70221aj(), cVar.mo70222ak());
        videoPublishEditModel.veCherEffectParam = m126175c(cVar);
        videoPublishEditModel.veAudioEffectParam = m126176d(cVar);
        videoPublishEditModel.videoCategory = cVar.mo70185a();
        videoPublishEditModel.stickerChallenge = cVar.mo70226ao();
        if (C35563c.f93231M.mo93305a(Property.EnableRecordConversion)) {
            videoPublishEditModel.veAudioRecorderParam = cVar.mo70219ah();
        }
        videoPublishEditModel.faceId = cVar.mo70227ap();
        videoPublishEditModel.multiEditVideoRecordData = cVar.mo70225an();
        videoPublishEditModel.supportRetake = cVar.mo70231at();
        videoPublishEditModel.videoCount = cVar.mo70293r();
        videoPublishEditModel.photoCount = cVar.mo70295s();
        videoPublishEditModel.pic2VideoSource = cVar.mo70213ab();
        videoPublishEditModel.allowDownloadSetting = cVar.mo70229ar();
        videoPublishEditModel.mUseMusicBeforeEdit = cVar.mo70271j();
        videoPublishEditModel.reviewVideoId = cVar.mo70230as();
        if (videoPublishEditModel.isReviewVideo()) {
            C39360dw.m125725a().f102246a = cVar.f72036e;
            videoPublishEditModel.musicId = null;
            videoPublishEditModel.mMusicPath = null;
        }
        if (cVar.mo70177S()) {
            videoPublishEditModel.mvCreateVideoData = cVar.mo70175Q();
            if (videoPublishEditModel.mvCreateVideoData == null || videoPublishEditModel.mvCreateVideoData.mvType != 1) {
                videoPublishEditModel.videoEditorType = 2;
            } else {
                videoPublishEditModel.videoEditorType = 3;
            }
            videoPublishEditModel.uploadMiscInfoStruct = cVar.mo70183Y();
        } else if (videoPublishEditModel.isStickPointMode) {
            videoPublishEditModel.videoEditorType = 4;
        } else if (videoPublishEditModel.isMultiVideoEdit()) {
            videoPublishEditModel.videoEditorType = 6;
        }
        return videoPublishEditModel;
    }

    /* renamed from: b */
    private static VideoPublishEditModel m126172b(Intent intent) {
        String str;
        int i;
        float f;
        float f2;
        VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        videoPublishEditModel.setPreviewInfo((EditPreviewInfo) intent.getParcelableExtra("extra_edit_preview_info"));
        videoPublishEditModel.setAvetParameter(AVETParameterKt.generateAVETParam(intent));
        videoPublishEditModel.mWorkspace = (Workspace) intent.getParcelableExtra("workspace");
        if (videoPublishEditModel.mWorkspace == null) {
            videoPublishEditModel.mWorkspace = Workspace.m122801a();
        }
        videoPublishEditModel.mFromCut = intent.getBooleanExtra("fromCut", false);
        videoPublishEditModel.mFromMultiCut = intent.getBooleanExtra("fromMultiCut", false);
        videoPublishEditModel.mDir = intent.getStringExtra("dir");
        if (TextUtils.isEmpty(videoPublishEditModel.mDir)) {
            str = C39810eq.f103468d;
        } else {
            str = videoPublishEditModel.mDir;
        }
        videoPublishEditModel.mDir = str;
        videoPublishEditModel.mEncodedAudioOutputFile = videoPublishEditModel.mWorkspace.mo96323k().getPath();
        videoPublishEditModel.mParallelUploadOutputFile = videoPublishEditModel.mWorkspace.mo96324l().getPath();
        videoPublishEditModel.mFaceBeauty = intent.getIntExtra("face_beauty", 0);
        videoPublishEditModel.faceBeautyOpen = intent.getBooleanExtra("face_beauty_open", false);
        videoPublishEditModel.mSelectedId = intent.getIntExtra("filter_id", 0);
        videoPublishEditModel.mSelectedFilterIntensity = intent.getFloatExtra("extra_selected_filter_intensity", -1.0f);
        videoPublishEditModel.mRecordVideoSelectedFilterIndex = intent.getIntExtra("extra_record_video_selected_filter_index", 0);
        videoPublishEditModel.mRecordVideoSelectedFilterIntensity = intent.getFloatExtra("extra_record_video_selected_filter_intensity", -1.0f);
        videoPublishEditModel.mCameraPosition = intent.getIntExtra("camera", 0);
        videoPublishEditModel.mCurFilterLabels = intent.getStringExtra("filter_lables");
        videoPublishEditModel.mCurFilterIds = intent.getStringExtra("filter_ids");
        videoPublishEditModel.mSmoothSkinLabels = intent.getStringExtra("smooth_skin_labels");
        videoPublishEditModel.mReshapeLabels = intent.getStringExtra("smooth_reshape_labels");
        videoPublishEditModel.mTanningLabels = intent.getStringExtra("smooth_tanning_labels");
        videoPublishEditModel.mEyesLabels = intent.getStringExtra("smooth_eyes_labels");
        videoPublishEditModel.videoCategory = (VideoCategoryParam) intent.getParcelableExtra("video_category");
        videoPublishEditModel.videoSpeed = intent.getStringExtra("extra_aweme_speed");
        videoPublishEditModel.cameraIds = intent.getStringExtra("extra_av_camera_ids");
        videoPublishEditModel.beautyType = intent.getIntExtra("extra_beauty_type", -1);
        videoPublishEditModel.metadataMap = C43009cd.m136509a(intent.getStringExtra("extra_video_record_metadata"));
        if (videoPublishEditModel.mWorkspace.mo96317e() != null) {
            videoPublishEditModel.mMusicPath = videoPublishEditModel.mWorkspace.mo96317e().getPath();
            videoPublishEditModel.mMusicStart = intent.getIntExtra("music_start", 0);
            videoPublishEditModel.mMusicEnd = intent.getIntExtra("extra_music_end", 0);
        }
        videoPublishEditModel.mOutputFile = videoPublishEditModel.mWorkspace.mo96322j().getPath();
        String str2 = null;
        if (intent.getBooleanExtra("enable_music_path_check", true) && videoPublishEditModel.mMusicPath == null) {
            C39360dw.m125725a().mo97928a((AVMusic) null);
        }
        videoPublishEditModel.maxDuration = intent.getLongExtra("max_duration", C40413c.f105051b);
        videoPublishEditModel.audioTrack = (UrlModel) intent.getSerializableExtra("wav_form");
        if (!videoPublishEditModel.mFromCut) {
            videoPublishEditModel.mVideoSegmentsDesc = intent.getStringExtra("video_segment");
        }
        videoPublishEditModel.mHardEncode = intent.getIntExtra("hard_encode", 0);
        videoPublishEditModel.mStickerPath = intent.getStringExtra("sticker_path");
        videoPublishEditModel.mStickerID = intent.getStringExtra("sticker_id");
        videoPublishEditModel.defaultSelectStickerPoi = (DefaultSelectStickerPoi) intent.getSerializableExtra("default_select_sticker_poi");
        videoPublishEditModel.stickerInfo = (StickerInfo) intent.getSerializableExtra("prop_info");
        videoPublishEditModel.mFirstStickerMusicIdsJson = intent.getStringExtra("first_sticker_music_ids");
        videoPublishEditModel.mRestoreType = intent.getIntExtra("restore", 0);
        if (videoPublishEditModel.mSelectedId == 0) {
            i = 1;
        } else {
            i = 0;
        }
        videoPublishEditModel.mUseFilter = i;
        videoPublishEditModel.mWillGoOnShortVideo = intent.getBooleanExtra("com.ss.android.ugc.aweme.intent.extra.RECORD_FILTER", false);
        videoPublishEditModel.mShootWay = intent.getStringExtra("shoot_way");
        videoPublishEditModel.nationalTaskId = intent.getStringExtra("task_id");
        videoPublishEditModel.mIsFromDraft = intent.getBooleanExtra("isFromDraft", false);
        if (videoPublishEditModel.mIsFromDraft) {
            videoPublishEditModel.mVideoCanvasWidth = intent.getIntExtra("extra_video_canvas_width", 0);
            videoPublishEditModel.mVideoCanvasHeight = intent.getIntExtra("extra_video_canvas_height", 0);
        }
        float f3 = 0.0f;
        videoPublishEditModel.mVideoCoverStartTm = intent.getFloatExtra("videoCoverStartTm", 0.0f);
        videoPublishEditModel.generateVideoCoverPath();
        videoPublishEditModel.mEffectList = intent.getParcelableArrayListExtra("effectList");
        videoPublishEditModel.mTimeEffect = (EffectPointModel) intent.getParcelableExtra("time_effect");
        videoPublishEditModel.mOrigin = intent.getIntExtra("origin", 0);
        videoPublishEditModel.challenges = (List) intent.getSerializableExtra("challenge");
        videoPublishEditModel.nationalTaskId = intent.getStringExtra("task_id");
        videoPublishEditModel.tagId = intent.getStringExtra("tag_id");
        videoPublishEditModel.mDuetFrom = intent.getStringExtra("duet_from");
        videoPublishEditModel.mDuetAuthor = (User) intent.getSerializableExtra("duet_author");
        videoPublishEditModel.mDuetHashTag = intent.getStringExtra("duet_hash_tag");
        videoPublishEditModel.mSyncPlatforms = intent.getStringExtra("sync_platform");
        videoPublishEditModel.mShootMode = intent.getIntExtra("shoot_mode", 0);
        videoPublishEditModel.creationId = intent.getStringExtra("creation_id");
        videoPublishEditModel.ccVid = intent.getStringExtra("cc_vid");
        videoPublishEditModel.draftId = intent.getIntExtra("draft_id", 0);
        if (videoPublishEditModel.getWavFile() == null) {
            f = 0.0f;
        } else {
            f = 0.5f;
        }
        videoPublishEditModel.voiceVolume = f;
        if (videoPublishEditModel.mDuetFrom != null) {
            f2 = 1.0f;
        } else if (videoPublishEditModel.isMusic() > 0) {
            f2 = 0.5f;
        } else {
            f2 = 0.0f;
        }
        videoPublishEditModel.musicVolume = f2;
        videoPublishEditModel.title = intent.getStringExtra("video_title");
        videoPublishEditModel.isPrivate = intent.getIntExtra("is_rivate", 0);
        videoPublishEditModel.commentSetting = intent.getIntExtra("comment_setting", 0);
        videoPublishEditModel.structList = (List) intent.getSerializableExtra("struct_list");
        videoPublishEditModel.mDurationMode = intent.getBooleanExtra("duration_mode", false);
        videoPublishEditModel.mIsMultiVideo = intent.getBooleanExtra("upload_video_type", false);
        videoPublishEditModel.autoEnhanceType = intent.getIntExtra("extra_auto_enhance_type", 0);
        videoPublishEditModel.autoEnhanceOn = intent.getBooleanExtra("extra_auto_enhance_state", false);
        videoPublishEditModel.poiId = intent.getStringExtra("poi_struct_in_tools_line");
        C42311e.m134568a(intent, C40005j.m127911b((BaseShortVideoContext) videoPublishEditModel));
        videoPublishEditModel.reactionParams = (ReactionParams) intent.getParcelableExtra("reaction_params");
        videoPublishEditModel.isMuted = intent.getBooleanExtra("is_muted", false);
        if (!videoPublishEditModel.isMuted) {
            f3 = videoPublishEditModel.voiceVolume;
        }
        videoPublishEditModel.voiceVolume = f3;
        videoPublishEditModel.recordMode = intent.getIntExtra("record_mode", 0);
        videoPublishEditModel.gameScore = intent.getIntExtra("record_game_score", 0);
        videoPublishEditModel.mMusicOrigin = intent.getStringExtra("music_origin");
        videoPublishEditModel.microAppId = intent.getStringExtra("micro_app_id");
        videoPublishEditModel.microAppModel = (MicroAppModel) intent.getSerializableExtra("micro_app_info");
        videoPublishEditModel.extractFramesModel = (ExtractFramesModel) intent.getSerializableExtra("extract_model");
        videoPublishEditModel.infoStickerModel = (InfoStickerModel) intent.getParcelableExtra("infosticker_model");
        videoPublishEditModel.md5 = intent.getStringExtra("md5");
        videoPublishEditModel.storyFestivalModel = (StoryFestivalModel) intent.getParcelableExtra("story_festival_model");
        if (intent.hasExtra("extra_import_video_info_list")) {
            videoPublishEditModel.importInfoList = intent.getParcelableArrayListExtra("extra_import_video_info_list");
        }
        videoPublishEditModel.videoCount = intent.getIntExtra("extra_video_count", 0);
        videoPublishEditModel.photoCount = intent.getIntExtra("extra_photo_count", 0);
        videoPublishEditModel.enterFrom = intent.getStringExtra("enter_from");
        videoPublishEditModel.sendToUserHead = (UrlModel) intent.getSerializableExtra("send_to_user_head");
        videoPublishEditModel.isFastImport = intent.getBooleanExtra("extra_av_is_fast_import", false);
        videoPublishEditModel.fastImportErrorCode = intent.getIntExtra("extra_fast_import_error_code", -1);
        videoPublishEditModel.fastImportResolution = intent.getStringExtra("extra_av_enable_fast_import_resolution");
        videoPublishEditModel.isStickPointMode = intent.getBooleanExtra("extra_stickpoint_mode", false);
        if (intent.hasExtra("extra_share_context")) {
            ShareContext shareContext = (ShareContext) intent.getSerializableExtra("extra_share_context");
            if (shareContext != null) {
                shareContext.mAppName = intent.getStringExtra("extra_share_app_name");
                if (C6399b.m19945u()) {
                    String str3 = shareContext.mAnchorInfo;
                    if (!TextUtils.isEmpty(str3) && TextUtils.isEmpty(null)) {
                        str2 = C35563c.f93251n.mo83170a(str3, 2);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        videoPublishEditModel.commerceData = str2;
                    }
                }
            }
            MainBusinessContext mainBusinessContext = new MainBusinessContext();
            mainBusinessContext.setShareContext(shareContext);
            videoPublishEditModel.setMainBusinessContext(mainBusinessContext);
        }
        if (intent.hasExtra("extra_mention_user_model")) {
            videoPublishEditModel.mentionUserModel = (ExtraMentionUserModel) intent.getSerializableExtra("extra_mention_user_model");
        }
        if (intent.hasExtra("extra_ar_text")) {
            videoPublishEditModel.arTextList = intent.getStringArrayListExtra("extra_ar_text");
        }
        if (intent.hasExtra("extra_sticker_text")) {
            videoPublishEditModel.messageBubbleTexts = intent.getStringArrayListExtra("extra_sticker_text");
        }
        if (intent.hasExtra("extra_countdown_mode")) {
            videoPublishEditModel.countDownModes = intent.getIntegerArrayListExtra("extra_countdown_mode");
        }
        if (intent.hasExtra("extra_draft_transform_model")) {
            videoPublishEditModel.draftEditTransferModel = (DraftEditTransferModel) intent.getParcelableExtra("extra_draft_transform_model");
        }
        if (intent.hasExtra("av_upload_struct")) {
            videoPublishEditModel.uploadMiscInfoStruct = (AVUploadMiscInfoStruct) intent.getSerializableExtra("av_upload_struct");
        }
        videoPublishEditModel.containBackgroundVideo = intent.getBooleanExtra("contain_backgroundvideo", false);
        videoPublishEditModel.supportRetake = intent.getBooleanExtra("support_retake", true);
        if (intent.hasExtra("extra_multi_edit_video_data")) {
            videoPublishEditModel.multiEditVideoRecordData = (MultiEditVideoStatusRecordData) intent.getParcelableExtra("extra_multi_edit_video_data");
        }
        if (intent.hasExtra("key_mv_theme_data")) {
            videoPublishEditModel.mvCreateVideoData = (MvCreateVideoData) intent.getSerializableExtra("key_mv_theme_data");
            if (videoPublishEditModel.mvCreateVideoData != null) {
                if (videoPublishEditModel.mvCreateVideoData.mvType == 1) {
                    videoPublishEditModel.videoEditorType = 3;
                } else {
                    videoPublishEditModel.videoEditorType = 2;
                }
            }
        } else if (videoPublishEditModel.isStickPointMode) {
            videoPublishEditModel.videoEditorType = 4;
        } else if (videoPublishEditModel.isMultiVideoEdit()) {
            videoPublishEditModel.videoEditorType = 6;
        }
        if (intent.hasExtra("key_stick_point_data")) {
            videoPublishEditModel.stickPointData = (StickPointData) intent.getSerializableExtra("key_stick_point_data");
        }
        if (intent.hasExtra("extra_ve_cher_effect_param")) {
            videoPublishEditModel.veCherEffectParam = (ClientCherEffectParam) intent.getParcelableExtra("extra_ve_cher_effect_param");
        }
        if (intent.hasExtra("extra_ve_audio_effect_param")) {
            videoPublishEditModel.veAudioEffectParam = (AudioEffectParam) intent.getParcelableExtra("extra_ve_audio_effect_param");
        }
        if (intent.hasExtra("sticker_challenge")) {
            videoPublishEditModel.stickerChallenge = (StickerChallenge) intent.getParcelableExtra("sticker_challenge");
        }
        if (intent.hasExtra("audio_record_param")) {
            videoPublishEditModel.veAudioRecorderParam = (AudioRecorderParam) intent.getParcelableExtra("audio_record_param");
        }
        videoPublishEditModel.faceId = intent.getStringArrayListExtra("extra_face_id");
        videoPublishEditModel.pic2VideoSource = intent.getStringExtra("picture_source");
        videoPublishEditModel.allowDownloadSetting = intent.getIntExtra("download_setting", 0);
        if (intent.hasExtra("key_status_video_data")) {
            videoPublishEditModel.statusCreateVideoData = (StatusCreateVideoData) intent.getParcelableExtra("key_status_video_data");
            if (videoPublishEditModel.statusCreateVideoData != null) {
                videoPublishEditModel.videoEditorType = 5;
                if (!TextUtils.isEmpty(videoPublishEditModel.statusCreateVideoData.getMusicPath()) && TextUtils.isEmpty(videoPublishEditModel.mMusicPath)) {
                    videoPublishEditModel.mMusicPath = videoPublishEditModel.statusCreateVideoData.getMusicPath();
                }
            }
        }
        videoPublishEditModel.mUseMusicBeforeEdit = intent.getBooleanExtra("use_music_before_edit", false);
        videoPublishEditModel.reviewVideoId = intent.getStringExtra("video_id");
        return videoPublishEditModel;
    }

    /* renamed from: a */
    public final C27311c mo98353a(VideoPublishEditModel videoPublishEditModel) {
        C27311c cVar = new C27311c();
        cVar.mo70199a(videoPublishEditModel.getPreviewInfo());
        cVar.mo70257g(videoPublishEditModel.getNewVersion());
        C27309a aVar = new C27309a();
        aVar.f71933a = videoPublishEditModel.title;
        aVar.f71935c = videoPublishEditModel.challenges;
        aVar.f71936d = videoPublishEditModel.getVideoLength();
        aVar.f71934b = videoPublishEditModel.getStructList();
        cVar.f72033b = aVar;
        cVar.mo70274k(C35563c.f93250m.mo83215a(videoPublishEditModel.poiId));
        if (videoPublishEditModel.isReviewVideo()) {
            cVar.f72036e = C39360dw.m125725a().f102246a;
        } else {
            cVar.f72036e = C39360dw.m125725a().mo97931b();
        }
        cVar.mo70190a(videoPublishEditModel.videoCategory);
        cVar.f72038g = videoPublishEditModel.mMusicPath;
        cVar.f72043l = videoPublishEditModel.mMusicStart;
        cVar.mo70253f(videoPublishEditModel.mMusicEnd);
        cVar.mo70262h(videoPublishEditModel.mMusicOrigin);
        cVar.mo70249e(videoPublishEditModel.getFilterIndex());
        cVar.mo70234b(videoPublishEditModel.mSelectedFilterIntensity);
        cVar.f72016D = videoPublishEditModel.mFaceBeauty;
        cVar.f72051t = videoPublishEditModel.mCameraPosition;
        cVar.f72050s = videoPublishEditModel.mCurFilterLabels;
        cVar.mo70207a(videoPublishEditModel.mCurFilterIds);
        cVar.f72045n = videoPublishEditModel.mOrigin;
        cVar.f72017E = C35563c.f93260w.mo57091d();
        cVar.f72019G = videoPublishEditModel.mVideoSegmentsDesc;
        cVar.f72020H = videoPublishEditModel.mHardEncode;
        cVar.f72023K = videoPublishEditModel.mStickerID;
        cVar.mo70189a(videoPublishEditModel.defaultSelectStickerPoi);
        cVar.mo70250e(videoPublishEditModel.getVideoCoverPath());
        cVar.f72052u = videoPublishEditModel.faceBeautyOpen ? 1 : 0;
        cVar.f72013A = videoPublishEditModel.isPrivate;
        cVar.mo70261h(videoPublishEditModel.commentSetting);
        cVar.f72015C = videoPublishEditModel.maxDuration;
        cVar.f72048q = videoPublishEditModel.audioTrack;
        cVar.f72047p = videoPublishEditModel.videoSpeed;
        cVar.mo70254f(videoPublishEditModel.cameraIds);
        cVar.mo70265i(videoPublishEditModel.beautyType);
        cVar.mo70208a(videoPublishEditModel.importInfoList);
        cVar.mo70210a(videoPublishEditModel.metadataMap);
        cVar.mo70187a(videoPublishEditModel.mOutVideoWidth);
        cVar.mo70235b(videoPublishEditModel.mOutVideoHeight);
        cVar.mo70239c(videoPublishEditModel.mVideoCanvasWidth);
        cVar.mo70245d(videoPublishEditModel.mVideoCanvasHeight);
        EffectListModel effectListModel = new EffectListModel();
        effectListModel.setEffectPointModels(videoPublishEditModel.mEffectList);
        cVar.f72014B = effectListModel;
        cVar.f72044m = videoPublishEditModel.getEffect();
        cVar.f72021I = videoPublishEditModel.getSpecialPoints();
        cVar.mo70186a(videoPublishEditModel.mVideoCoverStartTm);
        cVar.f72028P = videoPublishEditModel.mDuetFrom;
        cVar.mo70236b(videoPublishEditModel.mUploadPath);
        cVar.f72029Q = videoPublishEditModel.mSyncPlatforms;
        cVar.mo70276l(videoPublishEditModel.getFrom());
        cVar.mo70279m(videoPublishEditModel.mShootMode);
        cVar.mo70277l(videoPublishEditModel.microAppId);
        cVar.mo70198a(videoPublishEditModel.microAppModel);
        cVar.mo70266i(videoPublishEditModel.creationId);
        cVar.mo70288p(videoPublishEditModel.draftId);
        cVar.mo70269j(videoPublishEditModel.mShootWay);
        cVar.mo70267i(videoPublishEditModel.autoEnhanceOn);
        cVar.mo70294r(videoPublishEditModel.autoEnhanceType);
        cVar.mo70238b(videoPublishEditModel.mDurationMode);
        cVar.mo70242c(videoPublishEditModel.mIsMultiVideo);
        cVar.mo70204a(videoPublishEditModel.reactionParams);
        cVar.mo70247d(videoPublishEditModel.isMuted);
        cVar.mo70282n(videoPublishEditModel.recordMode);
        cVar.mo70285o(videoPublishEditModel.gameScore);
        cVar.mo70202a(videoPublishEditModel.extractFramesModel);
        cVar.mo70201a(videoPublishEditModel.mSaveModel);
        cVar.mo70194a(videoPublishEditModel.infoStickerModel);
        cVar.mo70291q(videoPublishEditModel.videoType);
        cVar.mo70209a(videoPublishEditModel.texts);
        cVar.mo70251e(videoPublishEditModel.usePaint);
        cVar.mo70203a(videoPublishEditModel.socialModel);
        cVar.mo70195a(videoPublishEditModel.stickerChallenge);
        if (videoPublishEditModel.getNewVersion() == C35563c.f93224F.mo70090e().mo90403b()) {
            cVar.f72041j = (int) (videoPublishEditModel.musicVolume * 100.0f);
            cVar.f72040i = (int) (videoPublishEditModel.voiceVolume * 100.0f);
        }
        C42311e.m134571a(C40005j.m127910a((BaseShortVideoContext) videoPublishEditModel), C40005j.m127907a(cVar.f72031S), Scene.PUBLISH, Scene.DRAFT);
        cVar.f72031S.f72002p = videoPublishEditModel.poiData;
        cVar.f72031S.f71944H = videoPublishEditModel.mFirstStickerMusicIdsJson;
        cVar.mo70280m(videoPublishEditModel.commerceData);
        cVar.mo70263h(videoPublishEditModel.isFastImport);
        cVar.mo70286o(videoPublishEditModel.fastImportResolution);
        cVar.mo70196a(videoPublishEditModel.mvCreateVideoData);
        cVar.mo70206a(videoPublishEditModel.statusCreateVideoData);
        cVar.mo70255f(videoPublishEditModel.isStickPointMode);
        cVar.mo70259g(videoPublishEditModel.containBackgroundVideo);
        cVar.mo70197a(videoPublishEditModel.uploadMiscInfoStruct);
        if (videoPublishEditModel.draftEditTransferModel != null) {
            cVar.f72035d = videoPublishEditModel.draftEditTransferModel.getPrimaryKey();
            if (videoPublishEditModel.draftEditTransferModel.getVideoSegmentsCopy() != null) {
                cVar.mo70237b(videoPublishEditModel.draftEditTransferModel.getVideoSegmentsCopy());
            }
        }
        videoPublishEditModel.draftEditTransferModel = new DraftEditTransferModel(cVar.mo70221aj(), cVar.mo70222ak());
        cVar.mo70192a(m126171b(videoPublishEditModel));
        cVar.mo70193a(m126174c(videoPublishEditModel));
        if (videoPublishEditModel.veAudioRecorderParam != null) {
            cVar.mo70188a(videoPublishEditModel.veAudioRecorderParam);
        }
        if (videoPublishEditModel.mOrigin == 0) {
            cVar.mo70210a(C20455a.m67874b());
        } else {
            cVar.mo70210a(videoPublishEditModel.metadataMap);
        }
        cVar.mo70241c(videoPublishEditModel.faceId);
        cVar.mo70268j(videoPublishEditModel.videoCount);
        cVar.mo70273k(videoPublishEditModel.photoCount);
        cVar.mo70283n(videoPublishEditModel.pic2VideoSource);
        cVar.mo70296s(videoPublishEditModel.allowDownloadSetting);
        cVar.mo70211a(videoPublishEditModel.mUseMusicBeforeEdit);
        cVar.mo70289p(videoPublishEditModel.reviewVideoId);
        cVar.mo70200a(videoPublishEditModel.multiEditVideoRecordData);
        cVar.mo70270j(videoPublishEditModel.supportRetake);
        cVar.mo70205a(videoPublishEditModel.stickPointData);
        cVar.mo70292q(C40414d.m129228c(videoPublishEditModel));
        m126173b(cVar);
        return cVar;
    }
}
