package com.p280ss.android.ugc.aweme.shortvideo.edit;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.apm.util.C6292i;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.C6600e;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.asve.p756d.C15450d;
import com.p280ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.draft.model.DefaultSelectStickerPoi;
import com.p280ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p280ss.android.ugc.aweme.effect.EffectPointModel;
import com.p280ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p280ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.p280ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p280ss.android.ugc.aweme.shortvideo.StoryBoomModel;
import com.p280ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C39604b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractTrackPage;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.MainBusinessContext;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.SocialModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.StoryFestivalModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import com.p280ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p280ss.android.ugc.aweme.shortvideo.stickpoint.StickPointData;
import com.p280ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.status.StatusCreateVideoData;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.utils.C43009cd;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel */
public class VideoPublishEditModel extends BaseShortVideoContext implements Serializable, Cloneable {
    public static final Creator<VideoPublishEditModel> CREATOR = new Creator<VideoPublishEditModel>() {
        /* renamed from: a */
        private static VideoPublishEditModel[] m125902a(int i) {
            return new VideoPublishEditModel[i];
        }

        /* renamed from: a */
        private static VideoPublishEditModel m125901a(Parcel parcel) {
            return new VideoPublishEditModel(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m125901a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m125902a(i);
        }
    };
    private static final long serialVersionUID = 1;
    public String aiMusicLogPbImprId;
    public UrlModel audioTrack;
    public boolean autoEnhanceOn;
    public int autoEnhanceType;
    public int beautyType;
    private final transient C6600e businessGson;
    public String cameraIds;
    public String ccVid;
    public int comFrom;
    public CompileProbeResult compileProbeResult;
    public boolean containBackgroundVideo;
    public ArrayList<Integer> countDownModes;
    public String creationId;
    public DefaultSelectStickerPoi defaultSelectStickerPoi;
    public int draftId;
    public String enterFrom;
    public ExtractFramesModel extractFramesModel;
    public boolean faceBeautyOpen;
    public List<String> faceId;
    public int fastImportErrorCode;
    public String fastImportResolution;
    public int gameScore;
    public ArrayList<ImportVideoInfo> importInfoList;
    public InfoStickerModel infoStickerModel;
    public boolean isCommerceMusic;
    public boolean isFastImport;
    public boolean isMuted;
    public boolean isOriginalSound;
    public boolean isStickPointMode;
    public boolean isStoryTextRecord;
    public transient boolean isSyntheticHardEncode;
    public int mAudioRecordIndex;
    public String mBindMvId;
    public int mCameraPosition;
    public String mCurFilterIds;
    public String mCurFilterLabels;
    public int mCurMusicLength;
    public String mDir;
    public User mDuetAuthor;
    public String mDuetFrom;
    public String mDuetHashTag;
    public boolean mDurationMode;
    public ArrayList<EffectPointModel> mEffectList;
    public String mEncodedAudioOutputFile;
    public String mEyesLabels;
    public int mFaceBeauty;
    public String mFirstStickerMusicIdsJson;
    public boolean mFromCut;
    public boolean mFromMultiCut;
    public int mHardEncode;
    public String mId3Album;
    public String mId3Author;
    public String mId3Title;
    public boolean mIsMultiVideo;
    public int mMusicEnd;
    public String mMusicOrigin;
    public String mMusicPath;
    public int mMusicRecType;
    public int mMusicShowRank;
    public int mMusicStart;
    public int mMusicType;
    private int mNewVersion;
    public int mOrigin;
    public int mOutVideoHeight;
    public int mOutVideoWidth;
    public String mOutputFile;
    public String mParallelUploadOutputFile;
    public int mRecordVideoSelectedFilterIndex;
    public float mRecordVideoSelectedFilterIntensity;
    public String mReshapeLabels;
    public int mRestoreType;
    @C6593c(mo15949a = "save_model")
    public AVUploadSaveModel mSaveModel;
    public float mSelectedFilterIntensity;
    public int mSelectedId;
    public int mShootMode;
    public String mSmoothSkinLabels;
    public String mStickerID;
    public String mStickerPath;
    public String mTanningLabels;
    public EffectPointModel mTimeEffect;
    public String mUploadPath;
    public int mUseFilter;
    public boolean mUseMusicBeforeEdit;
    public int mVideoCanvasHeight;
    public int mVideoCanvasWidth;
    public float mVideoCoverStartTm;
    public String mVideoSegmentsDesc;
    public boolean mWillGoOnShortVideo;
    public transient Workspace mWorkspace;
    private transient MainBusinessContext mainBusinessContext;
    public long maxDuration;
    public String md5;
    public int mentionEditTextLength;
    public ExtraMentionUserModel mentionUserModel;
    public Map<String, Object> metadataMap;
    public String microAppId;
    public MicroAppModel microAppModel;
    public MultiEditVideoStatusRecordData multiEditVideoRecordData;
    public String musicId;
    public float musicVolume;
    public MvCreateVideoData mvCreateVideoData;
    public int photoCount;
    public String pic2VideoSource;
    private EditPreviewInfo previewInfo;
    public float previewStartTime;
    public ReactionParams reactionParams;
    public int recordMode;
    public String reviewVideoId;
    public UrlModel sendToUserHead;
    public String shopDraftId;
    public SocialModel socialModel;
    public StatusCreateVideoData statusCreateVideoData;
    public StickPointData stickPointData;
    public StickerChallenge stickerChallenge;
    public StoryBoomModel storyBoomModel;
    public StoryFestivalModel storyFestivalModel;
    public boolean supportRetake;
    public String textTypes;
    public List<String> texts;
    public AVUploadMiscInfoStruct uploadMiscInfoStruct;
    public UploadSpeedInfo uploadSpeedInfo;
    public boolean usePaint;
    public AudioEffectParam veAudioEffectParam;
    public AudioRecorderParam veAudioRecorderParam;
    public ClientCherEffectParam veCherEffectParam;
    public VideoCategoryParam videoCategory;
    public int videoCount;
    private String videoCoverPath;
    public int videoEditorType;
    public String videoSpeed;
    public int videoType;
    public float voiceVolume;

    public int describeContents() {
        return 0;
    }

    public String getBindMvId() {
        return this.mBindMvId;
    }

    public int getCamera() {
        return this.mCameraPosition;
    }

    public String getCameraIds() {
        return this.cameraIds;
    }

    public String getCity() {
        return this.city;
    }

    public User getDuetAuthor() {
        return this.mDuetAuthor;
    }

    public String getDuetFrom() {
        return this.mDuetFrom;
    }

    public String getDuetHashTag() {
        return this.mDuetHashTag;
    }

    public String getEnterFrom() {
        return this.enterFrom;
    }

    public String getFilterIds() {
        return this.mCurFilterIds;
    }

    public int getFilterIndex() {
        return this.mSelectedId;
    }

    public String getFilterName() {
        return this.mCurFilterLabels;
    }

    public String getFxName() {
        return null;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public String getMicroAppId() {
        return this.microAppId;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public String getNationalTaskId() {
        return this.nationalTaskId;
    }

    public int getNewVersion() {
        return this.mNewVersion;
    }

    public int getOriginal() {
        return this.mOrigin;
    }

    public String getOutputFile() {
        return this.mOutputFile;
    }

    public String getPoiId() {
        return this.poiId;
    }

    public String getPoiName() {
        return this.poiName;
    }

    public int getPrettify() {
        return this.mFaceBeauty;
    }

    public EditPreviewInfo getPreviewInfo() {
        return this.previewInfo;
    }

    public ReactionParams getReactionParams() {
        return this.reactionParams;
    }

    public UrlModel getSendToUserHead() {
        return this.sendToUserHead;
    }

    public String getSpeed() {
        return this.videoSpeed;
    }

    public String getStickers() {
        return this.mStickerID;
    }

    public List<AVTextExtraStruct> getStructList() {
        return this.structList;
    }

    public String getSyncPlatforms() {
        return this.mSyncPlatforms;
    }

    public String getTagId() {
        return this.tagId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getVideoCoverPath() {
        return this.videoCoverPath;
    }

    public boolean isCommercialMusic() {
        return this.isCommerceMusic;
    }

    public boolean isOriginalSound() {
        return this.isOriginalSound;
    }

    public int isPrivate() {
        return this.isPrivate;
    }

    public String draftDir() {
        return uniqueVideoSessionDir(C39811er.f103470f);
    }

    public void generateVideoCoverPath() {
        this.videoCoverPath = C39777p.m127353a();
    }

    public Float getPreviewStartTime() {
        return Float.valueOf(this.previewStartTime);
    }

    public int isMusic() {
        if (this.mMusicPath == null) {
            return 0;
        }
        return 1;
    }

    public boolean isUploadVideo() {
        if (this.mOrigin == 0) {
            return true;
        }
        return false;
    }

    public MultiEditVideoRecordData getCurMultiEditVideoRecordData() {
        if (!isMultiVideoEdit()) {
            return null;
        }
        return this.multiEditVideoRecordData.curMultiEditVideoRecordData;
    }

    public int getFrom() {
        if (this.mFromCut) {
            return 0;
        }
        if (this.mFromMultiCut) {
            return 1;
        }
        return 3;
    }

    public String getLocalFinalPath() {
        if (this.mSaveModel == null) {
            return null;
        }
        return this.mSaveModel.getLocalFinalPath();
    }

    public String getLocalTempPath() {
        if (this.mSaveModel == null) {
            return null;
        }
        return this.mSaveModel.getLocalTempPath();
    }

    public long getMultiEditVideoStartTime() {
        if (!isMultiVideoEdit()) {
            return 0;
        }
        return getCurMultiEditVideoRecordData().startTime;
    }

    public AVMusic getOriginalRecordMusic() {
        if (!isMultiVideoEdit()) {
            return null;
        }
        return this.multiEditVideoRecordData.recordMusic;
    }

    public int getSpecialPoints() {
        if (this.mTimeEffect == null) {
            return 0;
        }
        return this.mTimeEffect.getEndPoint();
    }

    public String getValidVideoCoverPath() {
        if (C7276d.m22812b(this.videoCoverPath)) {
            return this.videoCoverPath;
        }
        return null;
    }

    public boolean hasRecord() {
        if (this.veAudioRecorderParam == null || !this.veAudioRecorderParam.hasRecord()) {
            return false;
        }
        return true;
    }

    public boolean hasRetake() {
        if (!isMultiVideoEdit()) {
            return false;
        }
        return this.multiEditVideoRecordData.curMultiEditVideoRecordData.hasRetake;
    }

    public boolean hasSubtitle() {
        if (this.infoStickerModel != null) {
            return this.infoStickerModel.hasSubtitle();
        }
        return false;
    }

    public boolean isAllowClearMusic() {
        if (isMvThemeVideoType() || isStatusVideoType()) {
            return false;
        }
        return true;
    }

    public boolean isDuet() {
        if (!TextUtils.isEmpty(getDuetFrom())) {
            return true;
        }
        return false;
    }

    public boolean isMediaFromGallery() {
        return TextUtils.equals(getAvetParameter().getContentSource(), "upload");
    }

    public boolean isReviewVideo() {
        if (!TextUtils.isEmpty(this.reviewVideoId)) {
            return true;
        }
        return false;
    }

    public boolean isSaveLocal() {
        if (this.mSaveModel == null || !this.mSaveModel.isSaveLocal()) {
            return false;
        }
        return true;
    }

    public boolean isSaveLocalWithWaterMark() {
        if (this.mSaveModel == null || !this.mSaveModel.isSaveLocalWithWaterMark()) {
            return false;
        }
        return true;
    }

    public boolean isSaveLocalWithoutWaterMark() {
        if (this.mSaveModel == null || this.mSaveModel.isWaterMark()) {
            return false;
        }
        return true;
    }

    public boolean isSaveToAlbum() {
        if (this.mSaveModel == null || !this.mSaveModel.getSaveToAlbum()) {
            return false;
        }
        return true;
    }

    public boolean isSaveToLocalPathInsteadOfAlbum() {
        if (this.mSaveModel == null || !this.mSaveModel.isSaveToAppPathInsteadOfAlbum()) {
            return false;
        }
        return true;
    }

    public boolean isStatusVideoType() {
        if (this.statusCreateVideoData == null || this.videoEditorType != 5) {
            return false;
        }
        return true;
    }

    public boolean isUseMultiEdit() {
        if (!isMultiVideoEdit()) {
            return false;
        }
        return this.multiEditVideoRecordData.isUseMultiEdit;
    }

    public void setUseMultiEdit() {
        if (isMultiVideoEdit()) {
            this.multiEditVideoRecordData.isUseMultiEdit = true;
        }
    }

    public String audioPath() {
        if (getPreviewInfo() == null) {
            return null;
        }
        return ((EditVideoSegment) getPreviewInfo().getVideoList().get(0)).getAudioPath();
    }

    /* access modifiers changed from: protected */
    public VideoPublishEditModel clone() {
        Parcel obtain = Parcel.obtain();
        obtain.writeValue(this);
        obtain.setDataPosition(0);
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obtain.readValue(VideoPublishEditModel.class.getClassLoader());
        obtain.recycle();
        return videoPublishEditModel;
    }

    public int getEffect() {
        if (this.mTimeEffect == null) {
            return 0;
        }
        return Integer.parseInt(this.mTimeEffect.getKey());
    }

    public int getImportVideoCount() {
        if (C6292i.m19525a((List<?>) this.importInfoList)) {
            return 0;
        }
        return this.importInfoList.size();
    }

    public int getVideoLength() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        return getPreviewInfo().getPreviewVideoLength();
    }

    public String getWavFile() {
        if (audioPath() != null && new File(audioPath()).exists()) {
            return audioPath();
        }
        return null;
    }

    public boolean hasInfoStickers() {
        if (this.infoStickerModel == null || !C6311g.m19574b(this.infoStickerModel.stickers)) {
            return false;
        }
        return true;
    }

    public boolean isMvThemeVideoType() {
        if (this.mvCreateVideoData == null || (this.videoEditorType != 2 && this.videoEditorType != 3)) {
            return false;
        }
        return true;
    }

    public boolean isPreviewInfoValid() {
        if (getPreviewInfo() != null && !getPreviewInfo().getVideoList().isEmpty()) {
            return true;
        }
        C41530am.m132283b("EditPreviewInfo in VideoPublishEditModel is null");
        return false;
    }

    public boolean isReaction() {
        if (getReactionParams() == null || TextUtils.isEmpty(getReactionParams().reactionFromId)) {
            return false;
        }
        return true;
    }

    public boolean isRetakeVideo() {
        if (isMultiVideoEdit() && this.multiEditVideoRecordData.restoreMultiEditVideoRecordData != null && this.multiEditVideoRecordData.isMultiEditRetake) {
            return true;
        }
        return false;
    }

    public boolean isReverse() {
        if (this.mTimeEffect == null || !"1".equals(this.mTimeEffect.getKey())) {
            return false;
        }
        return true;
    }

    public boolean isStoryBoomMode() {
        if (getAvetParameter().getShootMode() != 6 || this.storyBoomModel == null) {
            return false;
        }
        return true;
    }

    public boolean isUseTimeReverseEffect() {
        if (this.mTimeEffect == null || !this.mTimeEffect.getKey().equals("1")) {
            return false;
        }
        return true;
    }

    public String reverseVideoPath() {
        if (getPreviewInfo() == null) {
            return null;
        }
        return getPreviewInfo().reverseVideo();
    }

    public int segmentCounts() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        return getPreviewInfo().getVideoList().size();
    }

    public int videoFps() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        return getPreviewInfo().videoFps();
    }

    public int videoHeight() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        return getPreviewInfo().videoHeight(this.isFastImport);
    }

    public String videoPath() {
        if (getPreviewInfo() == null) {
            return "";
        }
        return ((EditVideoSegment) getPreviewInfo().getVideoList().get(0)).getVideoPath();
    }

    public int videoWidth() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        return getPreviewInfo().videoWidth(this.isFastImport);
    }

    public VideoPublishEditModel() {
        this.mAudioRecordIndex = -1;
        this.aiMusicLogPbImprId = "";
        this.mentionEditTextLength = -1;
        this.mSelectedFilterIntensity = -1.0f;
        this.mRecordVideoSelectedFilterIntensity = -1.0f;
        this.mEffectList = new ArrayList<>();
        this.importInfoList = new ArrayList<>();
        this.mDuetFrom = "";
        this.isMuted = false;
        this.businessGson = new C6600e();
        this.uploadSpeedInfo = new UploadSpeedInfo();
        this.textTypes = "";
        this.pic2VideoSource = "";
    }

    public void copyMultiEditMusicInfo() {
        if (isMultiVideoEdit()) {
            getCurMultiEditVideoRecordData().musicPath = this.mMusicPath;
            getCurMultiEditVideoRecordData().musicVolume = this.musicVolume;
            getCurMultiEditVideoRecordData().originVolume = this.voiceVolume;
            getCurMultiEditVideoRecordData().musicTrimIn = this.mMusicStart;
        }
    }

    public MainBusinessContext getMainBusinessContext() {
        if (!C15450d.m45250b()) {
            String mainBusinessData = super.getMainBusinessData();
            if (mainBusinessData != null) {
                try {
                    return (MainBusinessContext) this.businessGson.mo15974a(mainBusinessData, MainBusinessContext.class);
                } catch (Exception unused) {
                }
            }
            return null;
        } else if (this.mainBusinessContext != null) {
            return this.mainBusinessContext;
        } else {
            String mainBusinessData2 = super.getMainBusinessData();
            if (mainBusinessData2 != null) {
                try {
                    this.mainBusinessContext = (MainBusinessContext) this.businessGson.mo15974a(mainBusinessData2, MainBusinessContext.class);
                } catch (Exception unused2) {
                    return null;
                }
            }
            return this.mainBusinessContext;
        }
    }

    public String getMainBusinessData() {
        if (!C15450d.m45250b()) {
            return super.getMainBusinessData();
        }
        String mainBusinessData = super.getMainBusinessData();
        if (mainBusinessData != null) {
            return mainBusinessData;
        }
        if (this.mainBusinessContext != null) {
            mainBusinessData = this.businessGson.mo15979b((Object) this.mainBusinessContext);
            super.setMainBusinessData(mainBusinessData);
        }
        return mainBusinessData;
    }

    public List<MediaModel> getMediaModelList() {
        if (isMultiVideoEdit()) {
            return getCurMultiEditVideoRecordData().convertMediaModelList();
        }
        ArrayList arrayList = new ArrayList();
        if (getPreviewInfo() != null) {
            for (EditVideoSegment a : getPreviewInfo().getVideoList()) {
                arrayList.add(C39526e.m126244a(a));
            }
        }
        return arrayList;
    }

    public boolean hasStickers() {
        InteractStickerStruct interactStickerStruct;
        MainBusinessContext mainBusinessContext2 = getMainBusinessContext();
        if (mainBusinessContext2 != null) {
            interactStickerStruct = C39604b.m126707a(mainBusinessContext2, 1, InteractTrackPage.TRACK_PAGE_EDIT);
        } else {
            interactStickerStruct = null;
        }
        if (hasInfoStickers() || (interactStickerStruct != null && interactStickerStruct.getVoteStruct() != null)) {
            return true;
        }
        return false;
    }

    public boolean hasText() {
        if (this.infoStickerModel != null && !C6307b.m19566a((Collection<T>) this.infoStickerModel.stickers)) {
            for (StickerItemModel stickerItemModel : this.infoStickerModel.stickers) {
                if (stickerItemModel.type == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isMultiVideoEdit() {
        if (!this.mIsFromDraft || !C35574k.m114859a().mo70091f().mo93342a(Property.DraftUseMultiVideoEdit)) {
            return isMultiVideoEditOldJudge();
        }
        if (this.multiEditVideoRecordData == null || !this.multiEditVideoRecordData.isSupportMultiEdit || this.multiEditVideoRecordData.curMultiEditVideoRecordData == null) {
            return false;
        }
        return true;
    }

    public boolean shouldUploadExtractFrames() {
        if (!TextUtils.isEmpty(this.mStickerID) || ((this.mEffectList != null && !this.mEffectList.isEmpty()) || (this.infoStickerModel != null && C6311g.m19574b(this.infoStickerModel.stickers)))) {
            return true;
        }
        return false;
    }

    public boolean shouldUploadOriginalSound() {
        if ((this.mOrigin != 0 || isMusic() <= 0) && (((getWavFile() == null && !this.isFastImport && !hasRecord()) || this.mMusicPath == null || this.musicVolume <= 0.0f || (this.voiceVolume <= 0.0f && !hasRecord())) && this.veAudioEffectParam == null)) {
            return false;
        }
        return true;
    }

    public String getEditEffectList() {
        if (C6311g.m19573a(this.mEffectList)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(((EffectPointModel) this.mEffectList.get(0)).getKey());
        for (int i = 1; i < this.mEffectList.size(); i++) {
            sb.append(",");
            sb.append(((EffectPointModel) this.mEffectList.get(i)).getKey());
        }
        return sb.toString();
    }

    public String getInfoStickerList() {
        String a = C39604b.m126709a(getMainBusinessContext());
        if (this.infoStickerModel == null || C6311g.m19573a(this.infoStickerModel.stickers)) {
            return a;
        }
        String str = "";
        if (!TextUtils.isEmpty(a)) {
            StringBuilder sb = new StringBuilder(",");
            sb.append(a);
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.infoStickerModel.getNotEmptyInfoStickerIds());
        sb2.append(str);
        return sb2.toString();
    }

    public List<Integer> getVideoRotateArray() {
        if (getPreviewInfo() == null) {
            return Collections.singletonList(Integer.valueOf(0));
        }
        ArrayList arrayList = new ArrayList();
        for (EditVideoSegment editVideoSegment : getPreviewInfo().getVideoList()) {
            if (editVideoSegment.getVideoCutInfo() != null) {
                arrayList.add(Integer.valueOf(editVideoSegment.getVideoCutInfo().getRotate()));
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(Integer.valueOf(0));
        }
        return arrayList;
    }

    public boolean isChangeMultiEditData() {
        if (!isMultiVideoEdit() || this.multiEditVideoRecordData.originMultiEditRecordData == null) {
            return false;
        }
        Pair playInOutTime = getCurMultiEditVideoRecordData().getPlayInOutTime();
        Pair playInOutTime2 = this.multiEditVideoRecordData.originMultiEditRecordData.getPlayInOutTime();
        if (((Integer) playInOutTime.first).equals(playInOutTime2.first) && ((Integer) playInOutTime.second).equals(playInOutTime2.second) && getCurMultiEditVideoRecordData().isEqual(this.multiEditVideoRecordData.originMultiEditRecordData)) {
            return false;
        }
        return true;
    }

    public boolean isMultiVideoEditOldJudge() {
        boolean z;
        if (!C35574k.m114859a().mo70096k().mo93305a(AVAB.Property.EnableMultiVideoEdit)) {
            return false;
        }
        if (isDuet() || isMvThemeVideoType() || isReaction() || this.mFromCut || this.mFromMultiCut || !this.supportRetake || this.containBackgroundVideo) {
            z = false;
        } else {
            z = true;
        }
        if (this.multiEditVideoRecordData != null) {
            this.multiEditVideoRecordData.isSupportMultiEdit = z;
        }
        if (!z || this.multiEditVideoRecordData == null || this.multiEditVideoRecordData.curMultiEditVideoRecordData == null) {
            return false;
        }
        return true;
    }

    public void setMultiEditChallenges() {
        if (isMultiVideoEdit() && !C6292i.m19525a((List<?>) this.multiEditVideoRecordData.editSegments)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.multiEditVideoRecordData.editSegments.iterator();
            while (it.hasNext()) {
                TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it.next();
                if (!(timeSpeedModelExtension == null || timeSpeedModelExtension.getHashtag() == null)) {
                    arrayList.add(timeSpeedModelExtension.getHashtag());
                }
            }
            if (!C6292i.m19525a((List<?>) arrayList)) {
                this.challenges.clear();
                this.challenges.addAll(arrayList);
            }
        }
    }

    public void setMultiEditStickIds() {
        if (isMultiVideoEdit() && !C6292i.m19525a((List<?>) this.multiEditVideoRecordData.editSegments)) {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.multiEditVideoRecordData.editSegments.iterator();
            while (it.hasNext()) {
                TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it.next();
                if (timeSpeedModelExtension != null && !TextUtils.isEmpty(timeSpeedModelExtension.getStickerId())) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(timeSpeedModelExtension.getStickerId());
                    sb2.append(",");
                    sb.append(sb2.toString());
                }
            }
            if (!TextUtils.isEmpty(sb.toString())) {
                this.mStickerID = sb.toString().substring(0, sb.toString().length() - 1);
            }
        }
    }

    public void setCommercialMusic(boolean z) {
        this.isCommerceMusic = z;
    }

    public void setMicroAppId(String str) {
        this.microAppId = str;
    }

    public void setNewVersion(int i) {
        this.mNewVersion = i;
    }

    public void setOriginalSound(boolean z) {
        this.isOriginalSound = z;
    }

    public void setPreviewInfo(EditPreviewInfo editPreviewInfo) {
        this.previewInfo = editPreviewInfo;
    }

    public void setPreviewStartTime(float f) {
        this.previewStartTime = f;
    }

    public void setVideoCoverPath(String str) {
        this.videoCoverPath = str;
    }

    public static VideoPublishEditModel makeCopy(VideoPublishEditModel videoPublishEditModel) {
        return videoPublishEditModel.clone();
    }

    public void setVideoLength(int i) {
        if (getPreviewInfo() != null) {
            getPreviewInfo().setPreviewVideoLength(i);
        }
    }

    public void setMainBusinessData(String str) {
        if (!C15450d.m45250b()) {
            super.setMainBusinessData(str);
        } else if (!TextUtils.equals(super.getMainBusinessData(), str)) {
            super.setMainBusinessData(str);
            if (this.mainBusinessContext != null) {
                this.mainBusinessContext = null;
            }
        }
    }

    private AVTextExtraStruct getStructByChallenge(AVChallenge aVChallenge) {
        if (!(aVChallenge == null || this.structList == null)) {
            for (AVTextExtraStruct aVTextExtraStruct : this.structList) {
                if (aVChallenge.challengeName.equals(aVTextExtraStruct.getHashTagName())) {
                    return aVTextExtraStruct;
                }
            }
        }
        return null;
    }

    public void setMainBusinessContext(MainBusinessContext mainBusinessContext2) {
        if (!C15450d.m45250b()) {
            super.setMainBusinessData(this.businessGson.mo15979b((Object) mainBusinessContext2));
        } else if (this.mainBusinessContext != mainBusinessContext2) {
            this.mainBusinessContext = mainBusinessContext2;
            if (super.getMainBusinessData() != null) {
                super.setMainBusinessData(null);
            }
        }
    }

    public String uniqueVideoSessionDir(String str) {
        String videoPath = videoPath();
        if (this.isFastImport) {
            if (TextUtils.isEmpty(this.creationId)) {
                this.creationId = UUID.randomUUID().toString();
            }
            videoPath = this.creationId;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(C6306c.m19561a(videoPath));
        return sb.toString();
    }

    public void removeChallengeFromTitleAndStruct(Collection<AVChallenge> collection) {
        for (AVChallenge aVChallenge : collection) {
            if (!TextUtils.isEmpty(this.title)) {
                String str = this.title;
                StringBuilder sb = new StringBuilder("#");
                sb.append(aVChallenge.challengeName);
                sb.append(" ");
                this.title = str.replace(sb.toString(), "");
            }
            if (this.structList != null && !this.structList.isEmpty()) {
                AVTextExtraStruct structByChallenge = getStructByChallenge(aVChallenge);
                if (structByChallenge != null) {
                    this.structList.remove(structByChallenge);
                }
            }
        }
    }

    protected VideoPublishEditModel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        super(parcel);
        this.mAudioRecordIndex = -1;
        this.aiMusicLogPbImprId = "";
        this.mentionEditTextLength = -1;
        this.mSelectedFilterIntensity = -1.0f;
        this.mRecordVideoSelectedFilterIntensity = -1.0f;
        this.mEffectList = new ArrayList<>();
        this.importInfoList = new ArrayList<>();
        this.mDuetFrom = "";
        boolean z17 = false;
        this.isMuted = false;
        this.businessGson = new C6600e();
        this.uploadSpeedInfo = new UploadSpeedInfo();
        this.textTypes = "";
        this.pic2VideoSource = "";
        setPreviewInfo((EditPreviewInfo) parcel.readParcelable(EditPreviewInfo.class.getClassLoader()));
        this.mDir = parcel.readString();
        this.mCurFilterLabels = parcel.readString();
        this.mCurFilterIds = parcel.readString();
        this.mSmoothSkinLabels = parcel.readString();
        this.mReshapeLabels = parcel.readString();
        this.videoSpeed = parcel.readString();
        this.cameraIds = parcel.readString();
        this.beautyType = parcel.readInt();
        this.mMusicPath = parcel.readString();
        this.mVideoSegmentsDesc = parcel.readString();
        this.mStickerPath = parcel.readString();
        this.mStickerID = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mFromCut = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mFromMultiCut = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.faceBeautyOpen = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mWillGoOnShortVideo = z4;
        this.mOrigin = parcel.readInt();
        this.mHardEncode = parcel.readInt();
        this.mRestoreType = parcel.readInt();
        this.mFaceBeauty = parcel.readInt();
        this.mSelectedId = parcel.readInt();
        this.mSelectedFilterIntensity = parcel.readFloat();
        this.mRecordVideoSelectedFilterIndex = parcel.readInt();
        this.mRecordVideoSelectedFilterIntensity = parcel.readFloat();
        this.mCameraPosition = parcel.readInt();
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.autoEnhanceOn = z5;
        this.autoEnhanceType = parcel.readInt();
        this.mMusicStart = parcel.readInt();
        this.mMusicEnd = parcel.readInt();
        this.mMusicOrigin = parcel.readString();
        this.mMusicShowRank = parcel.readInt();
        this.mMusicRecType = parcel.readInt();
        this.mUseFilter = parcel.readInt();
        this.mVideoCoverStartTm = parcel.readFloat();
        this.maxDuration = parcel.readLong();
        this.mTimeEffect = (EffectPointModel) parcel.readParcelable(EffectPointModel.class.getClassLoader());
        this.mEffectList = parcel.createTypedArrayList(EffectPointModel.CREATOR);
        this.importInfoList = parcel.createTypedArrayList(ImportVideoInfo.CREATOR);
        this.audioTrack = (UrlModel) parcel.readSerializable();
        this.musicId = parcel.readString();
        this.previewStartTime = parcel.readFloat();
        this.mOutputFile = parcel.readString();
        this.mId3Title = parcel.readString();
        this.mId3Author = parcel.readString();
        this.mId3Album = parcel.readString();
        this.mMusicType = parcel.readInt();
        this.mDuetFrom = parcel.readString();
        this.mDuetAuthor = (User) parcel.readSerializable();
        this.mDuetHashTag = parcel.readString();
        this.mShootMode = parcel.readInt();
        this.creationId = parcel.readString();
        this.ccVid = parcel.readString();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.mDurationMode = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.isMuted = z7;
        this.draftId = parcel.readInt();
        this.mEncodedAudioOutputFile = parcel.readString();
        this.mParallelUploadOutputFile = parcel.readString();
        this.voiceVolume = parcel.readFloat();
        this.musicVolume = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.mIsMultiVideo = z8;
        this.shopDraftId = parcel.readString();
        this.mNewVersion = parcel.readInt();
        this.mSaveModel = (AVUploadSaveModel) parcel.readParcelable(AVUploadSaveModel.class.getClassLoader());
        this.reactionParams = (ReactionParams) parcel.readParcelable(ReactionParams.class.getClassLoader());
        this.recordMode = parcel.readInt();
        this.gameScore = parcel.readInt();
        this.mEyesLabels = parcel.readString();
        this.mTanningLabels = parcel.readString();
        this.videoCoverPath = parcel.readString();
        this.microAppId = parcel.readString();
        this.extractFramesModel = (ExtractFramesModel) parcel.readSerializable();
        this.infoStickerModel = (InfoStickerModel) parcel.readParcelable(InfoStickerModel.class.getClassLoader());
        this.microAppModel = (MicroAppModel) parcel.readSerializable();
        this.texts = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.usePaint = z9;
        this.videoType = parcel.readInt();
        this.socialModel = (SocialModel) parcel.readParcelable(SocialModel.class.getClassLoader());
        this.storyBoomModel = (StoryBoomModel) parcel.readParcelable(StoryBoomModel.class.getClassLoader());
        this.md5 = parcel.readString();
        this.storyFestivalModel = (StoryFestivalModel) parcel.readParcelable(StoryFestivalModel.class.getClassLoader());
        this.multiEditVideoRecordData = (MultiEditVideoStatusRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.isStoryTextRecord = z10;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.supportRetake = z11;
        this.mentionUserModel = (ExtraMentionUserModel) parcel.readSerializable();
        this.mFirstStickerMusicIdsJson = parcel.readString();
        this.defaultSelectStickerPoi = (DefaultSelectStickerPoi) parcel.readSerializable();
        this.uploadMiscInfoStruct = (AVUploadMiscInfoStruct) parcel.readSerializable();
        this.videoEditorType = parcel.readInt();
        this.mvCreateVideoData = (MvCreateVideoData) parcel.readSerializable();
        this.compileProbeResult = (CompileProbeResult) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.isFastImport = z12;
        this.fastImportResolution = parcel.readString();
        this.veCherEffectParam = (ClientCherEffectParam) parcel.readParcelable(ClientCherEffectParam.class.getClassLoader());
        this.mOutVideoWidth = parcel.readInt();
        this.mOutVideoHeight = parcel.readInt();
        this.aiMusicLogPbImprId = parcel.readString();
        this.comFrom = parcel.readInt();
        this.mVideoCanvasWidth = parcel.readInt();
        this.mVideoCanvasHeight = parcel.readInt();
        this.veAudioEffectParam = (AudioEffectParam) parcel.readParcelable(AudioEffectParam.class.getClassLoader());
        this.aiMusicLogPbImprId = parcel.readString();
        this.comFrom = parcel.readInt();
        this.uploadSpeedInfo = (UploadSpeedInfo) parcel.readParcelable(UploadSpeedInfo.class.getClassLoader());
        this.fastImportErrorCode = parcel.readInt();
        if (parcel.readByte() == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.isCommerceMusic = z13;
        if (parcel.readByte() == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.isOriginalSound = z14;
        this.mBindMvId = parcel.readString();
        this.stickerChallenge = (StickerChallenge) parcel.readParcelable(StickerChallenge.class.getClassLoader());
        this.metadataMap = C43009cd.m136509a(parcel.readString());
        if (parcel.readByte() != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.isStickPointMode = z15;
        this.mUploadPath = parcel.readString();
        this.countDownModes = new ArrayList<>();
        parcel.readList(this.countDownModes, Integer.class.getClassLoader());
        this.faceId = parcel.createStringArrayList();
        this.veAudioRecorderParam = (AudioRecorderParam) parcel.readParcelable(AudioRecorderParam.class.getClassLoader());
        this.videoCategory = (VideoCategoryParam) parcel.readParcelable(VideoCategoryParam.class.getClassLoader());
        this.textTypes = parcel.readString();
        this.videoCount = parcel.readInt();
        this.photoCount = parcel.readInt();
        this.mentionEditTextLength = parcel.readInt();
        this.pic2VideoSource = parcel.readString();
        this.statusCreateVideoData = (StatusCreateVideoData) parcel.readParcelable(StatusCreateVideoData.class.getClassLoader());
        if (parcel.readByte() == 1) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.mUseMusicBeforeEdit = z16;
        if (parcel.readByte() != 0) {
            z17 = true;
        }
        this.containBackgroundVideo = z17;
        this.reviewVideoId = parcel.readString();
        this.stickPointData = (StickPointData) parcel.readSerializable();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(getPreviewInfo(), i);
        parcel.writeString(this.mDir);
        parcel.writeString(this.mCurFilterLabels);
        parcel.writeString(this.mCurFilterIds);
        parcel.writeString(this.mSmoothSkinLabels);
        parcel.writeString(this.mReshapeLabels);
        parcel.writeString(this.videoSpeed);
        parcel.writeString(this.cameraIds);
        parcel.writeInt(this.beautyType);
        parcel.writeString(this.mMusicPath);
        parcel.writeString(this.mVideoSegmentsDesc);
        parcel.writeString(this.mStickerPath);
        parcel.writeString(this.mStickerID);
        parcel.writeByte(this.mFromCut ? (byte) 1 : 0);
        parcel.writeByte(this.mFromMultiCut ? (byte) 1 : 0);
        parcel.writeByte(this.faceBeautyOpen ? (byte) 1 : 0);
        parcel.writeByte(this.mWillGoOnShortVideo ? (byte) 1 : 0);
        parcel.writeInt(this.mOrigin);
        parcel.writeInt(this.mHardEncode);
        parcel.writeInt(this.mRestoreType);
        parcel.writeInt(this.mFaceBeauty);
        parcel.writeInt(this.mSelectedId);
        parcel.writeFloat(this.mSelectedFilterIntensity);
        parcel.writeInt(this.mRecordVideoSelectedFilterIndex);
        parcel.writeFloat(this.mRecordVideoSelectedFilterIntensity);
        parcel.writeInt(this.mCameraPosition);
        parcel.writeInt(this.autoEnhanceOn ? 1 : 0);
        parcel.writeInt(this.autoEnhanceType);
        parcel.writeInt(this.mMusicStart);
        parcel.writeInt(this.mMusicEnd);
        parcel.writeString(this.mMusicOrigin);
        parcel.writeInt(this.mMusicShowRank);
        parcel.writeInt(this.mMusicRecType);
        parcel.writeInt(this.mUseFilter);
        parcel.writeFloat(this.mVideoCoverStartTm);
        parcel.writeLong(this.maxDuration);
        parcel.writeParcelable(this.mTimeEffect, i);
        parcel.writeTypedList(this.mEffectList);
        parcel.writeTypedList(this.importInfoList);
        parcel.writeSerializable(this.audioTrack);
        parcel.writeString(this.musicId);
        parcel.writeFloat(this.previewStartTime);
        parcel.writeString(this.mOutputFile);
        parcel.writeString(this.mId3Title);
        parcel.writeString(this.mId3Author);
        parcel.writeString(this.mId3Album);
        parcel.writeInt(this.mMusicType);
        parcel.writeString(this.mDuetFrom);
        parcel.writeSerializable(this.mDuetAuthor);
        parcel.writeString(this.mDuetHashTag);
        parcel.writeInt(this.mShootMode);
        parcel.writeString(this.creationId);
        parcel.writeString(this.ccVid);
        parcel.writeByte(this.mDurationMode ? (byte) 1 : 0);
        parcel.writeByte(this.isMuted ? (byte) 1 : 0);
        parcel.writeInt(this.draftId);
        parcel.writeString(this.mEncodedAudioOutputFile);
        parcel.writeString(this.mParallelUploadOutputFile);
        parcel.writeFloat(this.voiceVolume);
        parcel.writeFloat(this.musicVolume);
        parcel.writeByte(this.mIsMultiVideo ? (byte) 1 : 0);
        parcel.writeString(this.shopDraftId);
        parcel.writeInt(this.mNewVersion);
        parcel.writeParcelable(this.mSaveModel, i);
        parcel.writeParcelable(this.reactionParams, i);
        parcel.writeInt(this.recordMode);
        parcel.writeInt(this.gameScore);
        parcel.writeString(this.mEyesLabels);
        parcel.writeString(this.mTanningLabels);
        parcel.writeString(this.videoCoverPath);
        parcel.writeString(this.microAppId);
        parcel.writeSerializable(this.extractFramesModel);
        parcel.writeParcelable(this.infoStickerModel, i);
        parcel.writeSerializable(this.microAppModel);
        parcel.writeStringList(this.texts);
        parcel.writeByte(this.usePaint ? (byte) 1 : 0);
        parcel.writeInt(this.videoType);
        parcel.writeParcelable(this.socialModel, i);
        parcel.writeParcelable(this.storyBoomModel, i);
        parcel.writeString(this.md5);
        parcel.writeParcelable(this.storyFestivalModel, i);
        parcel.writeParcelable(this.multiEditVideoRecordData, i);
        parcel.writeByte(this.isStoryTextRecord ? (byte) 1 : 0);
        parcel.writeByte(this.supportRetake ? (byte) 1 : 0);
        parcel.writeSerializable(this.mentionUserModel);
        parcel.writeString(this.mFirstStickerMusicIdsJson);
        parcel.writeSerializable(this.defaultSelectStickerPoi);
        parcel.writeSerializable(this.uploadMiscInfoStruct);
        parcel.writeInt(this.videoEditorType);
        parcel.writeSerializable(this.mvCreateVideoData);
        parcel.writeSerializable(this.compileProbeResult);
        parcel.writeByte(this.isFastImport ? (byte) 1 : 0);
        parcel.writeString(this.fastImportResolution);
        parcel.writeParcelable(this.veCherEffectParam, i);
        parcel.writeInt(this.mOutVideoWidth);
        parcel.writeInt(this.mOutVideoHeight);
        parcel.writeString(this.aiMusicLogPbImprId);
        parcel.writeInt(this.comFrom);
        parcel.writeInt(this.mVideoCanvasWidth);
        parcel.writeInt(this.mVideoCanvasHeight);
        parcel.writeParcelable(this.veAudioEffectParam, i);
        parcel.writeString(this.aiMusicLogPbImprId);
        parcel.writeInt(this.comFrom);
        parcel.writeParcelable(this.uploadSpeedInfo, i);
        parcel.writeInt(this.fastImportErrorCode);
        parcel.writeByte(this.isCommerceMusic ? (byte) 1 : 0);
        parcel.writeByte(this.isOriginalSound ? (byte) 1 : 0);
        parcel.writeString(this.mBindMvId);
        parcel.writeParcelable(this.stickerChallenge, i);
        parcel.writeString(C43009cd.m136508a(this.metadataMap));
        parcel.writeByte(this.isStickPointMode ? (byte) 1 : 0);
        parcel.writeString(this.mUploadPath);
        parcel.writeList(this.countDownModes);
        parcel.writeStringList(this.faceId);
        parcel.writeParcelable(this.veAudioRecorderParam, i);
        parcel.writeParcelable(this.videoCategory, i);
        parcel.writeString(this.textTypes);
        parcel.writeInt(this.videoCount);
        parcel.writeInt(this.photoCount);
        parcel.writeInt(this.mentionEditTextLength);
        parcel.writeString(this.pic2VideoSource);
        parcel.writeParcelable(this.statusCreateVideoData, i);
        parcel.writeByte(this.mUseMusicBeforeEdit ? (byte) 1 : 0);
        parcel.writeByte(this.containBackgroundVideo ? (byte) 1 : 0);
        parcel.writeString(this.reviewVideoId);
        parcel.writeSerializable(this.stickPointData);
    }
}
