package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1001al.C22488a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.C40005j;
import com.p280ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p280ss.android.ugc.aweme.shortvideo.WorkSpace.C38417b;
import com.p280ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38793q;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39500av;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39502ax;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39779q;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.C39693b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p280ss.android.ugc.aweme.shortvideo.music.C40088b;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39323b;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39331i;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41463q;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41514ab;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.p280ss.android.ugc.aweme.tools.C42130a;
import com.p280ss.android.ugc.aweme.tools.extension.C42311e;
import com.p280ss.android.ugc.aweme.tools.extension.Scene;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.p280ss.android.ugc.aweme.utils.C43009cd;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a;
import com.p280ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C7705c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity */
public class VideoPublishActivity extends AmeSSActivity {

    /* renamed from: a */
    TextView f107176a;

    /* renamed from: b */
    TextView f107177b;

    /* renamed from: c */
    TextView f107178c;

    /* renamed from: d */
    public VideoPublishEditModel f107179d;

    /* renamed from: e */
    private VideoPublishFragment f107180e;

    /* renamed from: f */
    private boolean f107181f;

    /* renamed from: g */
    private int f107182g;

    /* renamed from: h */
    private boolean f107183h;

    /* renamed from: i */
    private ToolSafeHandler f107184i = new ToolSafeHandler(this);

    /* renamed from: j */
    private String f107185j;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: g */
    private boolean m131424g() {
        return ((VideoPublishFragment) getSupportFragmentManager().mo2642a((int) R.id.aoy)).f107219q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo101757c() {
        C39360dw.m125725a().mo97934d();
        finish();
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("video_post_page");
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void onBackPressed() {
        if (getIntent().getIntExtra("fromDraft", 0) == 0) {
            mo101750a();
            mo101757c();
            return;
        }
        mo101754b();
        mo101757c();
    }

    /* renamed from: f */
    private void m131423f() {
        new C10741a(this).mo25657b((int) R.string.dau).mo25650a((int) R.string.bbe, (OnClickListener) new C41263ar(this)).mo25658b((int) R.string.w_, C41264as.f107510a).mo25656a().mo25637a();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onResume", true);
        super.onResume();
        if (this.f107180e != null && this.f107180e.mo101780l()) {
            this.f107178c.setText(R.string.czp);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onResume", false);
    }

    /* renamed from: a */
    public final void mo101750a() {
        VideoPublishFragment videoPublishFragment = (VideoPublishFragment) getSupportFragmentManager().mo2642a((int) R.id.aoy);
        videoPublishFragment.mo101772b("enter_video_edit_page");
        videoPublishFragment.mo101762a();
        videoPublishFragment.mo101771b();
        VideoPublishEditModel videoPublishEditModel = videoPublishFragment.f107218p;
        C39331i iVar = new C39331i(videoPublishEditModel.title, videoPublishEditModel.structList, videoPublishEditModel.isPrivate, videoPublishEditModel.poiId, videoPublishEditModel.challenges, videoPublishEditModel.defaultSelectStickerPoi, C39323b.m125655b(videoPublishEditModel), videoPublishEditModel.stickerChallenge, videoPublishEditModel.compileProbeResult);
        iVar.f102170g = videoPublishEditModel.commentSetting;
        iVar.f102174k = videoPublishEditModel.commerceData;
        iVar.f102175l = videoPublishEditModel.allowDownloadSetting;
        iVar.f102176m = videoPublishEditModel.videoCategory;
        C7705c.m23799a().mo20394d(iVar);
    }

    /* renamed from: d */
    private void m131421d() {
        this.f107183h = false;
        String stringExtra = getIntent().getStringExtra("review_video_draft_primary_key");
        if (!TextUtils.isEmpty(stringExtra)) {
            C42130a.m134090a().execute(new C41259an(this, stringExtra));
            return;
        }
        this.f107179d = new VideoPublishEditModel();
        this.f107183h = true;
        this.f107179d.reviewVideoId = this.f107185j;
        this.f107179d.creationId = getIntent().getStringExtra("creation_id");
        this.f107179d.mShootWay = getIntent().getStringExtra("shoot_way");
        this.f107179d.challenges = (List) getIntent().getSerializableExtra("challenge");
        this.f107179d.mOrigin = 0;
        this.f107179d.mFromCut = true;
        this.f107179d.isFastImport = true;
        this.f107179d.fastImportResolution = C38793q.m123909a();
        String stringExtra2 = getIntent().getStringExtra("video_path");
        int[] iArr = new int[10];
        if (VEUtils.getVideoFileInfo(stringExtra2, iArr) != 0) {
            C10761a.m31399c(getApplicationContext(), (int) R.string.avg).mo25750a();
            return;
        }
        VideoFileInfo videoFileInfo = new VideoFileInfo(iArr[0], iArr[1], (long) iArr[3], iArr[7]);
        EditVideoSegment editVideoSegment = new EditVideoSegment(stringExtra2, null, videoFileInfo);
        VideoCutInfo videoCutInfo = new VideoCutInfo(0, editVideoSegment.getVideoFileInfo().getDuration(), 1.0f, 0);
        editVideoSegment.setVideoCutInfo(videoCutInfo);
        ArrayList arrayList = new ArrayList();
        arrayList.add(editVideoSegment);
        this.f107179d.setPreviewInfo(new C39693b(C35563c.f93255r.getVideoWidth(), C35563c.f93255r.getVideoHeight()).mo99056a(arrayList));
        this.f107179d.videoWidth();
        ArrayList<ImportVideoInfo> arrayList2 = new ArrayList<>();
        ImportVideoInfo importVideoInfo = r5;
        ImportVideoInfo importVideoInfo2 = new ImportVideoInfo(iArr[0], iArr[1], iArr[6], iArr[8], stringExtra2, (long) iArr[3], (long) iArr[3]);
        arrayList2.add(importVideoInfo);
        this.f107179d.importInfoList = arrayList2;
        this.f107179d.mDir = C39811er.f103468d;
        Workspace a = C38417b.m122844a(this.f107179d);
        this.f107179d.mOutputFile = a.mo96322j().getPath();
        this.f107179d.mEncodedAudioOutputFile = a.mo96323k().getPath();
        this.f107179d.mParallelUploadOutputFile = a.mo96324l().getPath();
        this.f107179d.videoCount = 1;
        this.f107179d.voiceVolume = 0.5f;
        this.f107179d.mShootMode = -1;
        this.f107179d.mDuetFrom = null;
        this.f107179d.setNewVersion(C35563c.f93224F.mo70090e().mo90403b());
        this.f107179d.generateVideoCoverPath();
        C39779q.m127366a(true);
        C41463q.m132132a(this.f107179d.creationId);
        m131422e();
    }

    /* renamed from: e */
    private void m131422e() {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        int i2;
        int i3;
        int i4;
        String str5;
        boolean z = false;
        if (getIntent().getIntExtra("fromDraft", 0) == 0) {
            if (this.f107179d.isReviewVideo()) {
                this.f107176a.setText(R.string.ps);
                this.f107177b.setVisibility(0);
                this.f107177b.setOnClickListener(new C41260ao(this));
                this.f107176a.setOnClickListener(new C42939as() {
                    /* renamed from: a */
                    public final void mo70606a(View view) {
                        VideoPublishActivity.this.mo101754b();
                        VideoPublishActivity.this.mo101757c();
                    }
                });
            } else {
                if (C35574k.m114859a().mo70110y().mo83122g() && this.f107179d.mIsFromDraft) {
                    this.f107177b.setVisibility(0);
                    this.f107177b.setOnClickListener(new C41261ap(this));
                }
                this.f107176a.setOnClickListener(new C42939as() {
                    /* renamed from: a */
                    public final void mo70606a(View view) {
                        C6907h.onEvent(MobClick.obtain().setEventName("back_to_edit").setLabelName("edit_page"));
                        C39500av.m126137a(VideoPublishActivity.this.f107179d, (Intent) null);
                        VideoPublishActivity.this.mo101750a();
                        VideoPublishActivity.this.mo101757c();
                    }
                });
            }
            this.f107179d.challenges = (List) getIntent().getSerializableExtra("challenge");
            this.f107179d.nationalTaskId = getIntent().getStringExtra("task_id");
            this.f107179d.tagId = getIntent().getStringExtra("tag_id");
        } else {
            this.f107176a.setText(R.string.ps);
            this.f107176a.setOnClickListener(new C42939as() {
                /* renamed from: a */
                public final void mo70606a(View view) {
                    C6907h.onEvent(MobClick.obtain().setEventName("back_to_edit").setLabelName("edit_page"));
                    VideoPublishActivity.this.mo101754b();
                    VideoPublishActivity.this.mo101757c();
                }
            });
            this.f107177b.setVisibility(0);
            this.f107177b.setOnClickListener(new C41262aq(this));
            this.f107179d.mIsFromDraft = true;
            StringBuilder sb = new StringBuilder("[Filter Intensity] VideoPublishActivity 从草稿箱来 mSelectedFilterIntensity:");
            sb.append(this.f107179d.mSelectedFilterIntensity);
            sb.append(" mSelectedId:");
            sb.append(this.f107179d.mSelectedId);
            sb.append(" mUseFilter:");
            sb.append(this.f107179d.mUseFilter);
            C41530am.m132280a(sb.toString());
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("args", this.f107179d);
        bundle.putInt("music_rec_type", getIntent().getIntExtra("music_rec_type", -1));
        bundle.putBoolean("enter_record_from_other_platform", this.f107181f);
        bundle.putBoolean("edit_publish_session_end_together", getIntent().getBooleanExtra("edit_publish_session_end_together", false));
        if (getIntent().getBooleanExtra("review_video_fast_publish", false)) {
            bundle.putBoolean("review_video_fast_publish", true);
        }
        C0608j supportFragmentManager = getSupportFragmentManager();
        this.f107180e = (VideoPublishFragment) supportFragmentManager.mo2642a((int) R.id.aoy);
        if (this.f107180e == null) {
            this.f107180e = new VideoPublishFragment();
            this.f107180e.setArguments(bundle);
            supportFragmentManager.mo2645a().mo2585a((int) R.id.aoy, (Fragment) this.f107180e).mo2604c();
        }
        C22984d a = C22984d.m75611a().mo59973a("creation_id", this.f107179d.creationId).mo59973a("shoot_way", this.f107179d.mShootWay).mo59970a("draft_id", this.f107179d.draftId).mo59973a("filter_list", this.f107179d.mCurFilterLabels).mo59973a("filter_id_list", this.f107179d.mCurFilterIds);
        String str6 = "is_hardcode";
        if (C36964i.m118920a()) {
            str = "1";
        } else {
            str = "0";
        }
        C22984d a2 = a.mo59973a(str6, str).mo59973a("bite_rate", String.valueOf(C36964i.m118929e())).mo59970a("video_quality", C36964i.m118931g());
        String str7 = "resolution";
        if (this.f107179d.getOriginal() == 0) {
            str2 = C36964i.m118933i();
        } else {
            str2 = C36964i.m118932h();
        }
        C22984d a3 = a2.mo59973a(str7, str2).mo59973a("content_type", this.f107179d.getAvetParameter().getContentType());
        String str8 = "improve_status";
        if (this.f107179d.autoEnhanceOn) {
            str3 = "on";
        } else {
            str3 = "off";
        }
        C22984d a4 = a3.mo59973a(str8, str3);
        String str9 = "is_dubbed";
        if (this.f107179d.veAudioRecorderParam == null || !this.f107179d.veAudioRecorderParam.hasRecord()) {
            i = 0;
        } else {
            i = 1;
        }
        C22984d a5 = a4.mo59970a(str9, i);
        String str10 = "improve_method";
        if (this.f107179d.autoEnhanceType == 1) {
            str4 = "light";
        } else {
            str4 = "hdr";
        }
        C22984d a6 = a5.mo59973a(str10, str4).mo59973a("content_source", this.f107179d.getAvetParameter().getContentSource()).mo59970a("is_subtitled", this.f107179d.hasSubtitle() ? 1 : 0);
        if (this.f107179d.mFromCut || this.f107179d.mFromMultiCut) {
            i3 = this.f107179d.videoCount;
            i2 = this.f107179d.photoCount;
            String str11 = "upload_type";
            if (this.f107179d.mFromMultiCut) {
                str5 = "multiple_content";
            } else {
                str5 = "single_content";
            }
            a6.mo59973a(str11, str5);
        } else {
            if (this.f107179d.extractFramesModel != null && this.f107179d.extractFramesModel.frames != null) {
                i3 = this.f107179d.extractFramesModel.frames.size();
            } else if (this.f107179d.mvCreateVideoData == null || this.f107179d.mvCreateVideoData.selectMediaList == null) {
                i3 = 0;
            } else {
                i2 = this.f107179d.mvCreateVideoData.selectMediaList.size();
                i3 = 0;
            }
            i2 = 0;
        }
        a6.mo59970a("video_cnt", i3);
        a6.mo59970a("pic_cnt", i2);
        String str12 = "is_multi_content";
        if (i3 + i2 > 1) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        a6.mo59970a(str12, i4);
        if (!TextUtils.isEmpty(this.f107179d.getBindMvId())) {
            a6.mo59973a("mv_id", this.f107179d.getBindMvId());
        }
        if (!TextUtils.isEmpty(this.f107179d.pic2VideoSource)) {
            StringBuilder sb2 = new StringBuilder();
            String[] split = this.f107179d.pic2VideoSource.split(",");
            if (!C23477d.m77082a((T[]) split)) {
                for (String str13 : split) {
                    if (!str13.isEmpty()) {
                        if (sb2.length() != 0) {
                            sb2.append(",");
                        }
                        sb2.append(str13);
                    }
                }
            }
            if (!TextUtils.isEmpty(sb2)) {
                a6.mo59973a("picture_source", sb2.toString());
            }
        }
        C6907h.m21524a("enter_video_post_page", (Map) a6.f60753a);
        C6907h.m21524a("av_memory_log", (Map) C22984d.m75611a().mo59973a("creation_id", this.f107179d.creationId).mo59973a("enter_from", "publish").mo59971a("dalvikPss", C41514ab.m132244a().f107964b).mo59971a("nativePss", C41514ab.m132244a().f107965c).mo59971a("otherPss", C41514ab.m132244a().f107967e).mo59971a("totalPss", C41514ab.m132244a().f107966d).f60753a);
        if (C39805en.m127445a()) {
            ImmersionBar statusBarColor = ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a3z);
            if (C6399b.m19946v() || ((IMainService) ServiceManager.get().getService(IMainService.class)).isTiktokWhite()) {
                z = true;
            }
            statusBarColor.statusBarDarkFont(z).init();
            return;
        }
        ImmersionBar fitsSystemWindows = ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a3z).fitsSystemWindows(true);
        if (C6399b.m19946v() || ((IMainService) ServiceManager.get().getService(IMainService.class)).isTiktokWhite()) {
            z = true;
        }
        fitsSystemWindows.statusBarDarkFont(z).init();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo101754b() {
        String str;
        String str2;
        Object obj;
        boolean z;
        C39500av.m126137a(this.f107179d, (Intent) null);
        VideoPublishFragment videoPublishFragment = (VideoPublishFragment) getSupportFragmentManager().mo2642a((int) R.id.aoy);
        videoPublishFragment.mo101772b("enter_video_edit_page");
        videoPublishFragment.mo101762a();
        videoPublishFragment.mo101771b();
        VideoPublishEditModel videoPublishEditModel = videoPublishFragment.f107218p;
        Intent intent = new Intent();
        intent.putExtra("draft_to_edit_from", this.f107182g);
        if (!videoPublishEditModel.isReviewVideo() || !this.f107183h) {
            intent.putExtra("workspace", C38417b.m122844a(videoPublishEditModel));
        } else {
            intent.putExtra("workspace", videoPublishEditModel.mWorkspace);
        }
        intent.putExtra("sticker_challenge", videoPublishEditModel.stickerChallenge);
        intent.putExtra("creation_id", videoPublishEditModel.creationId);
        intent.putExtra("dir", C39810eq.f103468d);
        intent.putExtra("face_beauty", videoPublishEditModel.mFaceBeauty);
        intent.putExtra("face_beauty_open", videoPublishEditModel.faceBeautyOpen);
        intent.putExtra("filter_id", videoPublishEditModel.mSelectedId);
        intent.putExtra("extra_selected_filter_intensity", videoPublishEditModel.mSelectedFilterIntensity);
        intent.putExtra("camera", videoPublishEditModel.mCameraPosition);
        intent.putExtra("filter_lables", videoPublishEditModel.mCurFilterLabels);
        intent.putExtra("filter_ids", videoPublishEditModel.mCurFilterIds);
        intent.putExtra("smooth_skin_labels", videoPublishEditModel.mSmoothSkinLabels);
        intent.putExtra("smooth_reshape_labels", videoPublishEditModel.mReshapeLabels);
        intent.putExtra("smooth_eyes_labels", videoPublishEditModel.mEyesLabels);
        intent.putExtra("smooth_tanning_labels", videoPublishEditModel.mTanningLabels);
        intent.putExtra("extra_aweme_speed", videoPublishEditModel.videoSpeed);
        intent.putExtra("extra_av_camera_ids", videoPublishEditModel.cameraIds);
        if (!videoPublishEditModel.isReviewVideo() || !this.f107183h) {
            intent.putExtra("extra_beauty_type", videoPublishEditModel.beautyType);
        }
        intent.putExtra("extra_video_record_metadata", C43009cd.m136508a(videoPublishEditModel.metadataMap));
        intent.putExtra("music_start", videoPublishEditModel.mMusicStart);
        intent.putExtra("extra_music_end", videoPublishEditModel.mMusicEnd);
        if (!videoPublishEditModel.isReviewVideo() || !this.f107183h) {
            intent.putExtra("max_duration", videoPublishEditModel.maxDuration);
        }
        intent.putExtra("wav_form", videoPublishEditModel.audioTrack);
        intent.putExtra("video_segment", videoPublishEditModel.mVideoSegmentsDesc);
        String str3 = "content_type";
        if (videoPublishEditModel.isMvThemeVideoType()) {
            str = "mv";
        } else {
            str = "video";
        }
        intent.putExtra(str3, str);
        String str4 = "content_source";
        if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut || videoPublishEditModel.isMvThemeVideoType()) {
            str2 = "upload";
        } else {
            str2 = "shoot";
        }
        intent.putExtra(str4, str2);
        intent.putExtra("default_select_sticker_poi", videoPublishEditModel.defaultSelectStickerPoi);
        intent.putExtra("hard_encode", videoPublishEditModel.mHardEncode);
        intent.putExtra("sticker_path", videoPublishEditModel.mStickerPath);
        intent.putExtra("sticker_id", videoPublishEditModel.mStickerID);
        intent.putExtra("first_sticker_music_ids", videoPublishEditModel.mFirstStickerMusicIdsJson);
        intent.putExtra("draft_id", videoPublishEditModel.draftId);
        boolean z2 = true;
        if (!videoPublishEditModel.isReviewVideo() || !this.f107183h) {
            intent.putExtra("isFromDraft", true);
        }
        intent.putExtra("videoCoverStartTm", videoPublishEditModel.mVideoCoverStartTm);
        if (!videoPublishEditModel.isReviewVideo() || !this.f107183h) {
            intent.putExtra("effectList", videoPublishEditModel.mEffectList);
        }
        StringBuilder sb = new StringBuilder("effect list from publish : ");
        if (videoPublishEditModel.mEffectList != null) {
            obj = Integer.valueOf(videoPublishEditModel.mEffectList.size());
        } else {
            obj = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        sb.append(obj);
        intent.putExtra("extra_video_canvas_width", videoPublishEditModel.mVideoCanvasWidth);
        intent.putExtra("extra_video_canvas_height", videoPublishEditModel.mVideoCanvasHeight);
        intent.putExtra("origin", videoPublishEditModel.mOrigin);
        intent.putExtra("extra_import_video_info_list", videoPublishEditModel.importInfoList);
        intent.putExtra("extra_video_count", videoPublishEditModel.videoCount);
        intent.putExtra("extra_photo_count", videoPublishEditModel.photoCount);
        intent.putExtra("challenge", (Serializable) videoPublishEditModel.challenges);
        if (!videoPublishEditModel.isReviewVideo() || !this.f107183h) {
            intent.putExtra("shoot_way", "draft_again");
        } else {
            intent.putExtra("shoot_way", "direct_shoot");
        }
        intent.putExtra("video_title", videoPublishEditModel.title);
        intent.putExtra("struct_list", (Serializable) videoPublishEditModel.structList);
        intent.putExtra("is_rivate", videoPublishEditModel.isPrivate);
        intent.putExtra("comment_setting", videoPublishEditModel.commentSetting);
        intent.putExtra("poi_struct_in_tools_line", videoPublishEditModel.poiId);
        if (!videoPublishEditModel.isReviewVideo() || !this.f107183h) {
            intent.putExtra("duet_from", videoPublishEditModel.getDuetFrom());
        }
        intent.putExtra("duet_author", videoPublishEditModel.getDuetAuthor());
        intent.putExtra("duet_hash_tag", videoPublishEditModel.getDuetHashTag());
        intent.putExtra("fromMultiCut", videoPublishEditModel.mFromMultiCut);
        intent.putExtra("fromCut", videoPublishEditModel.mFromCut);
        intent.putExtra("shoot_mode", videoPublishEditModel.mShootMode);
        intent.putExtra("duration_mode", videoPublishEditModel.mDurationMode);
        intent.putExtra("task_id", videoPublishEditModel.nationalTaskId);
        intent.putExtra("tag_id", videoPublishEditModel.tagId);
        intent.putExtra("contain_backgroundvideo", videoPublishEditModel.containBackgroundVideo);
        intent.putExtra("upload_video_type", videoPublishEditModel.mIsMultiVideo);
        intent.putExtra("record_mode", videoPublishEditModel.recordMode);
        intent.putExtra("record_game_score", videoPublishEditModel.gameScore);
        intent.putExtra("extra_auto_enhance_state", videoPublishEditModel.autoEnhanceOn);
        intent.putExtra("extra_auto_enhance_type", videoPublishEditModel.autoEnhanceType);
        intent.putExtra("time_effect", videoPublishEditModel.mTimeEffect);
        intent.putExtra("reaction_params", videoPublishEditModel.reactionParams);
        intent.putExtra("is_muted", videoPublishEditModel.isMuted);
        if (!videoPublishEditModel.isReviewVideo() || !this.f107183h) {
            intent.putExtra("music_volume", videoPublishEditModel.musicVolume);
        }
        intent.putExtra("voice_volume", videoPublishEditModel.voiceVolume);
        if (videoPublishEditModel.veCherEffectParam != null) {
            intent.putExtra("extra_ve_cher_effect_param", videoPublishEditModel.veCherEffectParam);
        }
        if (videoPublishEditModel.veAudioEffectParam != null) {
            intent.putExtra("extra_ve_audio_effect_param", videoPublishEditModel.veAudioEffectParam);
        }
        if (videoPublishEditModel.veAudioRecorderParam != null) {
            intent.putExtra("audio_record_param", videoPublishEditModel.veAudioRecorderParam);
        }
        if (videoPublishEditModel.videoCategory != null) {
            intent.putExtra("video_category", videoPublishEditModel.videoCategory);
        }
        C42311e.m134569a(intent, C40005j.m127910a((BaseShortVideoContext) videoPublishEditModel), Scene.PUBLISH, Scene.EDIT);
        intent.putExtra("extract_model", videoPublishEditModel.extractFramesModel);
        intent.putExtra("infosticker_model", videoPublishEditModel.infoStickerModel);
        intent.putExtra("extra_auto_enhance_type", videoPublishEditModel.autoEnhanceType);
        intent.putExtra("extra_auto_enhance_state", videoPublishEditModel.autoEnhanceOn);
        intent.putExtra("download_setting", videoPublishEditModel.allowDownloadSetting);
        if (C35563c.f93231M.mo93306b(Property.RecommentMusicByAIPolicy) != 0) {
            z = true;
        } else {
            z = false;
        }
        intent.putExtra("key_status_video_data", videoPublishEditModel.statusCreateVideoData);
        intent.putExtra("av_upload_struct", videoPublishEditModel.uploadMiscInfoStruct);
        if (videoPublishEditModel.isMvThemeVideoType()) {
            intent.putExtra("key_mv_theme_data", videoPublishEditModel.mvCreateVideoData);
        }
        intent.putExtra("extra_multi_edit_video_data", videoPublishEditModel.multiEditVideoRecordData);
        intent.putExtra("extra_stickpoint_mode", videoPublishEditModel.isStickPointMode);
        intent.putExtra("key_stick_point_data", videoPublishEditModel.stickPointData);
        if (!z || videoPublishEditModel == null || !TextUtils.isEmpty(videoPublishEditModel.getDuetFrom()) || videoPublishEditModel.getReactionParams() != null) {
            z2 = false;
        }
        if (z) {
            C35563c.f93246i.mo103867e().mo103919a(videoPublishEditModel.extractFramesModel, z2, videoPublishEditModel.creationId);
            if (C40088b.m128104a() == 2) {
                C35563c.f93246i.mo103864c();
            }
        }
        intent.setClass(this, VEVideoPublishEditActivity.class);
        intent.putExtra("extra_av_is_fast_import", videoPublishEditModel.isFastImport);
        intent.putExtra("extra_av_enable_fast_import_resolution", videoPublishEditModel.fastImportResolution);
        if (videoPublishEditModel.getPreviewInfo() != null) {
            intent.putExtra("extra_edit_preview_info", videoPublishEditModel.getPreviewInfo());
        }
        if (videoPublishEditModel.draftEditTransferModel != null) {
            intent.putExtra("extra_draft_transform_model", videoPublishEditModel.draftEditTransferModel);
        }
        intent.putExtra("picture_source", videoPublishEditModel.pic2VideoSource);
        intent.putExtra("use_music_before_edit", videoPublishEditModel.mUseMusicBeforeEdit);
        if (!TextUtils.isEmpty(videoPublishEditModel.reviewVideoId)) {
            intent.putExtra("video_id", videoPublishEditModel.reviewVideoId);
        }
        if (!videoPublishEditModel.isReviewVideo() || !this.f107183h) {
            C39779q.m127366a(false);
        }
        startActivity(intent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101753a(String str) {
        runOnUiThread(new C41265at(this, ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().queryDraft(str)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo101756b(View view) {
        Intent intent = new Intent();
        intent.setFlags(536870912);
        C22488a.m74376a().mo59046a((Activity) this, intent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo101758c(View view) {
        if (m131424g()) {
            m131423f();
        } else {
            mo101757c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101752a(C27311c cVar) {
        if (cVar != null) {
            new C39502ax("VideoPublishActivity");
            this.f107179d = C39502ax.m126170a(cVar);
            getIntent().putExtra("fromDraft", 1);
            C41463q.m132136b(this.f107179d.creationId);
            m131422e();
            return;
        }
        C10761a.m31409e(getApplicationContext(), (int) R.string.avg).mo25750a();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.fc);
        this.f107176a = (TextView) findViewById(R.id.jn);
        this.f107177b = (TextView) findViewById(R.id.sp);
        this.f107178c = (TextView) findViewById(R.id.title);
        this.f107179d = (VideoPublishEditModel) getIntent().getSerializableExtra("args");
        this.f107181f = getIntent().getBooleanExtra("enter_record_from_other_platform", false);
        this.f107182g = getIntent().getIntExtra("draft_to_edit_from", 0);
        this.f107185j = getIntent().getStringExtra("video_id");
        if (TextUtils.isEmpty(this.f107185j) || this.f107179d != null) {
            m131422e();
        } else {
            m131421d();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onCreate", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101751a(View view) {
        if (!m131424g() || C35574k.m114859a().mo70110y().mo83122g()) {
            mo101757c();
        } else {
            m131423f();
        }
        C6907h.m21524a("video_post_page_cancel", (Map) C22984d.m75611a().mo59973a("creation_id", this.f107179d.creationId).mo59973a("shoot_way", this.f107179d.mShootWay).mo59970a("draft_id", this.f107179d.draftId).f60753a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo101755b(DialogInterface dialogInterface, int i) {
        mo101757c();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C43152a.m136868a((Activity) this, i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f107180e != null && this.f107180e.isAdded()) {
            this.f107180e.onActivityResult(i, i2, intent);
        }
    }
}
