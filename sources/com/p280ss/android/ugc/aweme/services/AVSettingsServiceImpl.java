package com.p280ss.android.ugc.aweme.services;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6711m;
import com.google.gson.C6712o;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader.C20486b;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader.C20488d;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.port.C35517a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVABAndSettingActivity;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p280ss.android.ugc.aweme.setting.SettingsApiManager;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.p1580k.C40020a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import dmt.p1861av.video.C47452c;
import dmt.p1861av.video.C47460h;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.services.AVSettingsServiceImpl */
public class AVSettingsServiceImpl implements IAVSettingsService {
    private static Property backCameraProperty() {
        return Property.BackCameraFilter;
    }

    private int clamp(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    private static Property frontCameraProperty() {
        return Property.FrontCameraFilter;
    }

    public int getFullScreenPlan() {
        return C39804em.f103457a;
    }

    public void updateABTestModel(C6711m mVar) {
        C6711m e = mVar.mo16152e("data");
        if (e != null) {
            int asInt = getAsInt(e, "private_prompt", 0);
            if (asInt < 0 || asInt > 1) {
                asInt = 0;
            }
            C35563c.f93231M.mo93301a(AVAB.Property.PrivatePrompt, asInt);
            C35563c.f93231M.mo93304a(AVAB.Property.PhotoEditEnabled, getAsBoolean(e, "create_image_aweme", false));
            C35563c.f93231M.mo93301a(AVAB.Property.RecordBitrateCategoryIndex, getAsInt(e, "video_bitrate_category_index", 0));
            C35563c.f93231M.mo93301a(AVAB.Property.RecordQualityCategoryIndex, getAsInt(e, "video_quality_category_index", 0));
            C35563c.f93231M.mo93301a(AVAB.Property.VideoSizeIndex, getAsInt(e, "video_size_index", 0));
            C35563c.f93231M.mo93301a(AVAB.Property.ImportVideoSizeIndex, getAsInt(e, "upload_video_size_index", 0));
            int clamp = clamp(getAsInt(e, "smooth_max", 80), 0, 100);
            float f = (float) clamp;
            C35563c.f93231M.mo93300a(AVAB.Property.SmoothMax, f / 100.0f);
            int asInt2 = getAsInt(e, "smooth_default", -1);
            if (asInt2 == -1) {
                asInt2 = C6399b.m19946v() ? 0 : 48;
            }
            float f2 = 0.0f;
            C35563c.f93231M.mo93300a(AVAB.Property.SmoothDefault, clamp != 0 ? (((float) asInt2) * 1.0f) / f : 0.0f);
            C35563c.f93231M.mo93300a(AVAB.Property.ReshapeMax, ((float) clamp(getAsInt(e, "reshape_max", 100), 0, 100)) / 100.0f);
            C35563c.f93231M.mo93300a(AVAB.Property.ReshapeDefault, ((float) clamp(getAsInt(e, "reshape_default", 60), 0, 100)) / 100.0f);
            int clamp2 = clamp(getAsInt(e, "contour_max", 80), 0, 100);
            float f3 = (float) clamp2;
            C35563c.f93231M.mo93300a(AVAB.Property.ContourMax, f3 / 100.0f);
            int clamp3 = clamp(getAsInt(e, "contour_default", 0), -1, 100);
            if (clamp3 == -1) {
                clamp3 = C6399b.m19946v() ? 0 : 48;
            }
            C35563c.f93231M.mo93300a(AVAB.Property.ContourDefault, clamp2 != 0 ? (((float) clamp3) * 1.0f) / f3 : 0.0f);
            C35563c.f93231M.mo93304a(AVAB.Property.QuietlySynthetic, getAsInt(e, "quietly_synthetic", 0) != 0);
            C35563c.f93231M.mo93301a(AVAB.Property.ColorFilterPanel, getAsInt(e, "color_filter_panel", 1));
            C35563c.f93231M.mo93301a(AVAB.Property.PhotoMovieEnabled, getAsInt(e, "enable_photomovie", 0));
            int clamp4 = clamp(getAsInt(e, "eyes_max", 60), 0, 100);
            float f4 = (float) clamp4;
            C35563c.f93231M.mo93300a(AVAB.Property.EyesMax, f4 / 100.0f);
            int clamp5 = clamp(getAsInt(e, "eyes_default", -1), -1, 100);
            if (clamp5 == -1) {
                clamp5 = C6399b.m19946v() ? 0 : 36;
            }
            C35563c.f93231M.mo93300a(AVAB.Property.EyesDefault, clamp4 != 0 ? (((float) clamp5) * 1.0f) / f4 : 0.0f);
            int clamp6 = clamp(getAsInt(e, "shape_max", 80), 0, 100);
            float f5 = (float) clamp6;
            C35563c.f93231M.mo93300a(AVAB.Property.ShapeMax, f5 / 100.0f);
            int clamp7 = clamp(getAsInt(e, "shape_default", -1), -1, 100);
            if (clamp7 == -1) {
                clamp7 = C6399b.m19946v() ? 0 : 48;
            }
            AVAB avab = C35563c.f93231M;
            AVAB.Property property = AVAB.Property.ShapeDefault;
            if (clamp6 != 0) {
                f2 = (((float) clamp7) * 1.0f) / f5;
            }
            avab.mo93300a(property, f2);
            C35563c.f93231M.mo93301a(AVAB.Property.BeautificationIconStyle, getAsInt(e, "beautification_icon_style", 0));
            C35563c.f93231M.mo93301a(AVAB.Property.RecordHardwareProfile, getAsInt(e, "record_hardware_profile", 1));
            C35563c.f93231M.mo93301a(AVAB.Property.FetchEffectModelType, getAsInt(e, "fetch_effect_model_zip_version", 0));
            C35563c.f93231M.mo93304a(AVAB.Property.PreFetchPopEffectModel, getAsBoolean(e, "pre_fetch_effect_model", false));
            C35563c.f93231M.mo93304a(AVAB.Property.UseContourSlider, getAsBoolean(e, "use_contour_slider", false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableSaveUploadVideo, getAsBoolean(e, "upload_save_local", true));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableInstagramSilentShare, getAsBoolean(e, "instagram_silent_share", false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableUploadFallback, getAsBoolean(e, "enable_upload_fallback", false));
            C35563c.f93231M.mo93304a(AVAB.Property.UploadOptimizeForPie, getAsBoolean(e, "upload_optimize_for_pie", true));
            C35563c.f93231M.mo93304a(AVAB.Property.AddTextInMusically, getAsBoolean(e, "show_button_title_in_record_page", false));
            C35563c.f93231M.mo93304a(AVAB.Property.BeautyModeSwitch, getAsBoolean(e, "beauty_mode_switch", false));
            C35563c.f93231M.mo93304a(AVAB.Property.UseEffectCam, getAsBoolean(e, "use_effectcam_key", false));
            C35563c.f93231M.mo93301a(AVAB.Property.RecommentMusicByAIPolicy, getAsInt(e, "music_ailab_new", 0));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableExposureOptimize, getAsBoolean(e, "enable_exposure_optmize", false));
            C35563c.f93231M.mo93301a(AVAB.Property.RecordCameraTypeAB, getAsInt(e, "camera_type_ab", 0));
            C35563c.f93231M.mo93301a(AVAB.Property.RecordCameraCompatLevelAB, getAsInt(e, "record_camera_compat_level_ab", 0));
            C35563c.f93231M.mo93301a(AVAB.Property.UploadSpeedProbeSize, getAsInt(e, "upload_speed_probe_size", 524288));
            C35563c.f93231M.mo93301a(AVAB.Property.UploadSpeedProbeMinGap, getAsInt(e, "upload_speed_probe_min_gap", 300000));
            C35563c.f93231M.mo93301a(AVAB.Property.UploadSpeedProbeTimeOut, getAsInt(e, "upload_speed_probe_time_out", 20000));
            C35563c.f93231M.mo93301a(AVAB.Property.SyntheticVideoQuality, getAsInt(e, "synthetic_video_quality", -1));
            C35563c.f93231M.mo93302a(AVAB.Property.SyntheticVideoMaxRate, getAsLong(e, "synthetic_video_maxrate", -1));
            C35563c.f93231M.mo93301a(AVAB.Property.SyntheticVideoPreset, getAsInt(e, "synthetic_video_preset", -1));
            C35563c.f93231M.mo93301a(AVAB.Property.SyntheticVideoGop, getAsInt(e, "synthetic_video_gop", -1));
            C35563c.f93231M.mo93300a(AVAB.Property.SyntheticVideoBitrate, getAsFloat(e, "synthetic_video_bitrate", -1.0f));
            C35563c.f93231M.mo93300a(AVAB.Property.VideoBitrate, getAsFloat(e, AVAB.Property.VideoBitrate.key(), -1.0f));
            C35563c.f93231M.mo93304a(AVAB.Property.ShareVideo2GifEditable, getAsBoolean(e, "new_version_gif_share", true));
            C35563c.f93231M.mo93301a(AVAB.Property.UseVECompiler, getAsInt(e, "use_ve_compiler", 0));
            C35563c.f93231M.mo93301a(AVAB.Property.RemoveStoryStrategy, getAsInt(e, "remove_story_strategy", 0));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableSoftEncodeAcc, getAsInt(e, "enable_soft_encode_acc", 0) == 1);
            C35563c.f93231M.mo93304a(AVAB.Property.EnableFullScreenAdapt, getAsBoolean(e, "enable_editor_screen_adaptation", false));
            C35563c.f93231M.mo93304a(AVAB.Property.StickerDetailsEntranceEnable, getAsBoolean(e, "sticker_details_entrance_enable", false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableInfoSticker, getAsBoolean(e, "enable_infosticker", false));
            C35563c.f93231M.mo93304a(AVAB.Property.EffectPlatformUseTTNet, getAsBoolean(e, "effect_platform_use_ttnet", false));
            C35563c.f93231M.mo93304a(AVAB.Property.NeedLoginInBeforeRecord, !getAsBoolean(e, "douyin_shoot_without_login", false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableStickerCollection, getAsBoolean(e, "show_sticker_collection", false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableParallelSynthesizeUpload, getAsBoolean(e, "enable_concurrent_synthesize_upload", true));
            C35563c.f93231M.mo93304a(AVAB.Property.RearCamera, getAsBoolean(e, AVAB.Property.RearCamera.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.UsingMixRecordButton, getAsBoolean(e, "use_mix_record_button", false));
            C35563c.f93231M.mo93304a(AVAB.Property.NeedRecode, getAsBoolean(e, "need_recode", true));
            C35563c.f93231M.mo93304a(AVAB.Property.VeEditorANRDestroy, getAsBoolean(e, "veeditor_anr_destroy", false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableFeedbackLog, getAsBoolean(e, "enable_feedback_log", true));
            setAB(e, AVAB.Property.TTUploaderHttpDNSConfig);
            setAB(e, AVAB.Property.ConcurrentUploadCancelOnAuthKey);
            C35563c.f93231M.mo93304a(AVAB.Property.StoryPreviewUsingSurfaceView, getAsBoolean(e, "is_surface_view_story_preview", false));
            C35563c.f93231M.mo93304a(AVAB.Property.CanShowPublishFriendGuide, getAsBoolean(e, "post_friends_permission_prompts", false));
            C35563c.f93231M.mo93304a(AVAB.Property.VideoSynthesisOpt, getAsBoolean(e, "video_synthesis_opt", false));
            C35563c.f93231M.mo93303a(AVAB.Property.VESynthesisSettings, getAsString(e, "ve_synthesis_settings"));
            C35563c.f93231M.mo93303a(AVAB.Property.VESynthesisSettingsByUploadSpeed, getAsString(e, "ve_synthesis_settings_by_upload_speed"));
            C35563c.f93231M.mo93303a(AVAB.Property.EffectExclusionPattern, getAsString(e, "android_effect_black_list_pattern"));
            C35563c.f93231M.mo93304a(AVAB.Property.UseNewEffectExecutorType, getAsBoolean(e, "effect_download_executor_type", true));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableSearchGIF, getAsBoolean(e, "enable_search_gif", false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableRecordTutorial, getAsBoolean(e, "shoot_tutorial_switch", false));
            C35563c.f93231M.mo93304a(AVAB.Property.LongVideoDefaultUseLong, getAsBoolean(e, "default_enable_long_video", false));
            C35563c.f93231M.mo93304a(AVAB.Property.VideoLegalCheckInLocal, getAsBoolean(e, "video_legal_check_in_local", true));
            C35563c.f93231M.mo93304a(AVAB.Property.LongDurationRecordAsTab, getAsBoolean(e, "is_long_duration_record_as_tab", false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnablePreUpload, getAsBoolean(e, "enable_pre_upload", false));
            C35563c.f93231M.mo93301a(AVAB.Property.EnableOpenGl3, getAsInt(e, "use_open_gl_three", 0));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableEffectParallelFwk, getAsBoolean(e, "enable_effect_parallel_fwk", false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableQIEffectParallelFwk, getAsBoolean(e, AVAB.Property.EnableQIEffectParallelFwk.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.CameraOptionFlagsOpt, getAsBoolean(e, "camera_option_flags_opt", false));
            C35563c.f93231M.mo93304a(AVAB.Property.VEExtractFramesAfterRender, getAsBoolean(e, "ve_extract_frames_after_render", false));
            C35563c.f93231M.mo93304a(AVAB.Property.UseNewPublishShareDescription, getAsBoolean(e, "is_publish_share_description", false));
            C35563c.f93231M.mo93301a(AVAB.Property.DefaultPublishPrivacyType, getAsInt(e, "default_publish_privacy_type", 0));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableSlimVECutProcessor, getAsBoolean(e, "enable_slim_ve_cut_processor", true));
            C35563c.f93231M.mo93304a(AVAB.Property.MvThemeRecordMode, getAsBoolean(e, AVAB.Property.MvThemeRecordMode.key(), false));
            C35563c.f93231M.mo93301a(AVAB.Property.LiveMvTabOrder, getAsInt(e, AVAB.Property.LiveMvTabOrder.key(), 0));
            C35563c.f93231M.mo93304a(AVAB.Property.OpenCameraFrameOptimizeSDK, getAsBoolean(e, AVAB.Property.OpenCameraFrameOptimizeSDK.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.OpenCameraFrameOptimizePreLoadSo, getAsBoolean(e, AVAB.Property.OpenCameraFrameOptimizePreLoadSo.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EditorSceneLazyInit, getAsBoolean(e, AVAB.Property.EditorSceneLazyInit.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableASVESandBox, getAsBoolean(e, AVAB.Property.EnableASVESandBox.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableTextStickerInMain, getAsBoolean(e, AVAB.Property.EnableTextStickerInMain.key(), true));
            C35563c.f93231M.mo93304a(AVAB.Property.OpenStickerRecordWithMusic, getAsBoolean(e, AVAB.Property.OpenStickerRecordWithMusic.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.OpenMusicRecordWithSticker, getAsBoolean(e, AVAB.Property.OpenMusicRecordWithSticker.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableVideoEditActivityUploadSpeedProbe, getAsBoolean(e, AVAB.Property.EnableVideoEditActivityUploadSpeedProbe.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableMVThemePreUpload, getAsBoolean(e, AVAB.Property.EnableMVThemePreUpload.key(), false));
            setAB(e, AVAB.Property.PublishOnNewIntentCheckDelay);
            setAB(e, AVAB.Property.EnableNewEffectEngineForBuiltInEffect);
            setAB(e, AVAB.Property.PreUploadEncryptionMode);
            setAB(e, AVAB.Property.TTUploaderResponseTimeOut);
            setAB(e, AVAB.Property.EnableSingleSegmentConcatUseCopy);
            setAB(e, AVAB.Property.CompileProbeConfig);
            setAB(e, AVAB.Property.VECameraPreviewSize);
            setAB(e, AVAB.Property.RecordMinDiskAmountMB);
            setAB(e, AVAB.Property.UploadStatusReportGapS);
            setAB(e, AVAB.Property.EnableOnlyReportKeyUploadLog);
            setAB(e, AVAB.Property.TTNetExternNetInfo);
            setAB(e, AVAB.Property.EnablePublishDetailALog);
            setAB(e, AVAB.Property.EnableOptimizePublishContainerActivityNotInStack);
            setAB(e, AVAB.Property.EnableVECompileCrfReencode);
            setAB(e, AVAB.Property.TTUploaderTTNetProxyType);
            C35563c.f93231M.mo93304a(AVAB.Property.EnableEffectNewEngine, getAsBoolean(e, AVAB.Property.EnableEffectNewEngine.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableEffectNewEngineEdit, getAsBoolean(e, AVAB.Property.EnableEffectNewEngineEdit.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableVEFastImport, getAsBoolean(e, "enable_ve_fast_import", false));
            C35563c.f93231M.mo93301a(AVAB.Property.FastImportFpsLimit, getAsInt(e, "fast_import_fps_limit", 40));
            C35563c.f93231M.mo93303a(AVAB.Property.FastImportResolutionLimit, getAsString(e, "fast_import_resolution_limit"));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableEnhanceVolume, getAsBoolean(e, "use_enhance_volume", false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableVoiceConversion, getAsBoolean(e, "studio_enable_editpage_voicechanger", false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableRecordConversion, getAsBoolean(e, "studio_enable_video_edit_dub", false));
            C35563c.f93231M.mo93304a(AVAB.Property.StudioEffectNewTabUi, getAsBoolean(e, "studio_effect_new_tab_ui", false));
            C35563c.f93231M.mo93301a(AVAB.Property.EditPageMusicPanelOptimization, getAsInt(e, "edit_page_music_panel_optimization", 0));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableTT265Decoder, getAsBoolean(e, "enable_tt_265_decoder", false));
            C35563c.f93231M.mo93304a(AVAB.Property.DuetFixNewPlan, getAsBoolean(e, AVAB.Property.DuetFixNewPlan.key(), true));
            C35563c.f93231M.mo93301a(AVAB.Property.UlikeBeautyAbGroup, getAsInt(e, "studio_recorder_beautify_effects_group", 0));
            C35563c.f93231M.mo93304a(AVAB.Property.RememberLastRecordDuration, getAsBoolean(e, AVAB.Property.RememberLastRecordDuration.key(), true));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableUserVeRecoder, getAsBoolean(e, AVAB.Property.EnableUserVeRecoder.key(), false));
            C35563c.f93231M.mo93301a(AVAB.Property.VEConfigOptLevel, getAsInt(e, AVAB.Property.VEConfigOptLevel.key(), 0));
            C35563c.f93231M.mo93301a(AVAB.Property.EnableVECacheGLContext, getAsInt(e, AVAB.Property.EnableVECacheGLContext.key(), 0));
            C35563c.f93231M.mo93301a(AVAB.Property.FastImportGopLimit, getAsInt(e, AVAB.Property.SyntheticVideoGop.key(), 3000));
            C35563c.f93231M.mo93304a(AVAB.Property.EditPagePrompt, getAsBoolean(e, AVAB.Property.EditPagePrompt.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableEditPageMemoryOpt, getAsBoolean(e, AVAB.Property.EnableEditPageMemoryOpt.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableStoryCameraOpt, getAsBoolean(e, AVAB.Property.EnableStoryCameraOpt.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableEditPageMVMemoryOpt, getAsBoolean(e, AVAB.Property.EnableEditPageMVMemoryOpt.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnablePublishThreadOpt, getAsBoolean(e, AVAB.Property.EnablePublishThreadOpt.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableMBlackPanel, getAsBoolean(e, AVAB.Property.EnableMBlackPanel.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.OpenSDKQAdaption, getAsBoolean(e, AVAB.Property.OpenSDKQAdaption.key(), true));
            C35563c.f93231M.mo93304a(AVAB.Property.SDKQAdaptionConfig, getAsBoolean(e, AVAB.Property.SDKQAdaptionConfig.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.StudioBeautyEffectComposer, getAsBoolean(e, AVAB.Property.StudioBeautyEffectComposer.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.ComposerPanelHasTitle, getAsBoolean(e, AVAB.Property.ComposerPanelHasTitle.key(), true));
            C35563c.f93231M.mo93304a(AVAB.Property.StudioMBeautyPanel, getAsBoolean(e, AVAB.Property.StudioMBeautyPanel.key(), false));
            C35563c.f93231M.mo93301a(AVAB.Property.StudioBeautyEffectComposerGroup, getAsInt(e, AVAB.Property.StudioBeautyEffectComposerGroup.key(), 0));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableEffectDiskCache, getAsBoolean(e, AVAB.Property.EnableEffectDiskCache.key(), true));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableAsyncInitVesdk, getAsBoolean(e, AVAB.Property.EnableAsyncInitVesdk.key(), true));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableRushLooper, getAsBoolean(e, AVAB.Property.EnableRushLooper.key(), true));
            C35563c.f93231M.mo93301a(AVAB.Property.LightEnhanceBlackList, getAsInt(e, AVAB.Property.LightEnhanceBlackList.key(), 0));
            C35563c.f93231M.mo93301a(AVAB.Property.ShowAutoImproveButtonInEditPage, getAsInt(e, AVAB.Property.ShowAutoImproveButtonInEditPage.key(), 0));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableUploadMetadata, getAsBoolean(e, AVAB.Property.EnableUploadMetadata.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableMusicStickPoint, getAsBoolean(e, AVAB.Property.EnableMusicStickPoint.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableSmartMusicStickPoint, getAsBoolean(e, AVAB.Property.EnableSmartMusicStickPoint.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableSmartStickPointFeedback, getAsBoolean(e, AVAB.Property.EnableSmartStickPointFeedback.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.ShowMusicStickPointBubble, getAsBoolean(e, AVAB.Property.ShowMusicStickPointBubble.key(), false));
            C35563c.f93231M.mo93301a(AVAB.Property.StickPointMusicCutLength, getAsInt(e, AVAB.Property.StickPointMusicCutLength.key(), 20));
            C35563c.f93231M.mo93301a(AVAB.Property.StickPointDefaltMode, getAsInt(e, AVAB.Property.StickPointDefaltMode.key(), 1));
            C35563c.f93231M.mo93304a(AVAB.Property.VEUseNewEffectAlgorithmApi, getAsBoolean(e, AVAB.Property.VEUseNewEffectAlgorithmApi.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableStickerFunctionalities, getAsBoolean(e, AVAB.Property.EnableStickerFunctionalities.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.RearMusicAutoLoop, getAsBoolean(e, AVAB.Property.RearMusicAutoLoop.key(), false));
            C35563c.f93231M.mo93301a(AVAB.Property.VideoRecordToolbarConfigure, getAsInt(e, AVAB.Property.VideoRecordToolbarConfigure.key(), 0));
            C35563c.f93231M.mo93304a(AVAB.Property.IsForcedToDefaultFullScreenPlan, getAsBoolean(e, AVAB.Property.IsForcedToDefaultFullScreenPlan.key(), false));
            C35563c.f93231M.mo93301a(AVAB.Property.EnableProcessRefactor, getAsInt(e, AVAB.Property.EnableProcessRefactor.key(), 0));
            C35563c.f93231M.mo93304a(AVAB.Property.VEEditorCompileForDuetReact, getAsBoolean(e, AVAB.Property.VEEditorCompileForDuetReact.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableUploadVideoSlideAutoJust, getAsBoolean(e, AVAB.Property.EnableUploadVideoSlideAutoJust.key(), false));
            C35563c.f93231M.mo93301a(AVAB.Property.RecordOutputCategory, getAsInt(e, AVAB.Property.RecordOutputCategory.key(), 1));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableThreeBuffer, getAsBoolean(e, AVAB.Property.EnableThreeBuffer.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.UseNewMvStruct, getAsBoolean(e, AVAB.Property.UseNewMvStruct.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableVEUploadApplog, getAsBoolean(e, AVAB.Property.EnableVEUploadApplog.key(), true));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableVideoImageMixed, getAsBoolean(e, AVAB.Property.EnableVideoImageMixed.key(), false));
            C35563c.f93231M.mo93301a(AVAB.Property.EnablePublishPrivacySetting, getAsInt(e, AVAB.Property.EnablePublishPrivacySetting.key(), 0));
            C35563c.f93231M.mo93301a(AVAB.Property.EnableImportAvSync, getAsInt(e, AVAB.Property.EnableImportAvSync.key(), 0));
            C35563c.f93231M.mo93301a(AVAB.Property.EnableOpenGLResourceReuse, getAsInt(e, AVAB.Property.EnableOpenGLResourceReuse.key(), 0));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableSubtitleRecognition, getAsBoolean(e, AVAB.Property.EnableSubtitleRecognition.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableSubtitleRecognitionAI, getAsBoolean(e, AVAB.Property.EnableSubtitleRecognitionAI.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableSearchEffect, getAsBoolean(e, AVAB.Property.EnableSearchEffect.key(), ((Boolean) AVAB.Property.EnableSearchEffect.defValue()).booleanValue()));
            C35563c.f93231M.mo93301a(AVAB.Property.EnableSdkOutputRefactor, getAsInt(e, AVAB.Property.EnableSdkOutputRefactor.key(), 0));
            C35563c.f93231M.mo93301a(AVAB.Property.EnableSdkInputCrossPlatForm, getAsInt(e, AVAB.Property.EnableSdkInputCrossPlatForm.key(), 0));
            C35563c.f93231M.mo93304a(AVAB.Property.MVPBeautyNewIcon, getAsBoolean(e, AVAB.Property.MVPBeautyNewIcon.key(), ((Boolean) AVAB.Property.MVPBeautyNewIcon.defValue()).booleanValue()));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableMultiFastImport, getAsBoolean(e, AVAB.Property.EnableMultiFastImport.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableRemove15sCapMusic, getAsBoolean(e, AVAB.Property.EnableRemove15sCapMusic.key(), ((Boolean) AVAB.Property.EnableRemove15sCapMusic.defValue()).booleanValue()));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableFilterIntensityJust, getAsBoolean(e, AVAB.Property.EnableFilterIntensityJust.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.StudioStickerPinEnable, getAsBoolean(e, AVAB.Property.StudioStickerPinEnable.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableRecordStatusMode, getAsBoolean(e, AVAB.Property.EnableRecordStatusMode.key(), true));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableStatusBgRandomOrder, getAsBoolean(e, AVAB.Property.EnableStatusBgRandomOrder.key(), true));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableRecordStatusRandomAll, getAsBoolean(e, AVAB.Property.EnableRecordStatusRandomAll.key(), true));
            C35563c.f93231M.mo93304a(AVAB.Property.RenderUseVideoSizeIndex, getAsBoolean(e, AVAB.Property.RenderUseVideoSizeIndex.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableMultiVideoEdit, getAsBoolean(e, AVAB.Property.EnableMultiVideoEdit.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableCutVideoSceneRefactor, getAsBoolean(e, AVAB.Property.EnableCutVideoSceneRefactor.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableVboostOpt, getAsBoolean(e, AVAB.Property.EnableVboostOpt.key(), false));
            C35563c.f93231M.mo93301a(AVAB.Property.EnableGLBase, getAsInt(e, AVAB.Property.EnableGLBase.key(), 0));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableSATCamera, getAsBoolean(e, AVAB.Property.EnableSATCamera.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.EnableEffectAsyncAPI, getAsBoolean(e, AVAB.Property.EnableEffectAsyncAPI.key(), false));
            C35563c.f93231M.mo93304a(AVAB.Property.StudioEnableRecorderTutorial, getAsBoolean(e, AVAB.Property.StudioEnableRecorderTutorial.key(), false));
            updateVEAB(e);
            C40020a.f103922a.mo99459b();
        }
    }

    public C35517a<Boolean> bubbleGuideShown() {
        return new C35517a<Boolean>() {
            public Boolean get() {
                return Boolean.valueOf(C35563c.f93230L.mo93342a(Property.BubbleGuideShown));
            }

            public void set(Boolean bool) {
                C35563c.f93230L.mo93341a(Property.BubbleGuideShown, bool.booleanValue());
            }
        };
    }

    public boolean enableFullScreen() {
        return C39805en.m127445a();
    }

    public boolean enableSaveUploadVideo() {
        return C36964i.m118940p();
    }

    public float getRecordBitrate() {
        return C36964i.m118929e();
    }

    public int getRecordQuality() {
        return C36964i.m118931g();
    }

    public C35517a<Boolean> showLockNewYearStickerPopupImg() {
        return new C35517a<Boolean>() {
            public Boolean get() {
                return Boolean.valueOf(C35563c.f93230L.mo93342a(Property.ShowLockNewYearStickerPopupImg));
            }

            public void set(Boolean bool) {
                C35563c.f93230L.mo93341a(Property.ShowLockNewYearStickerPopupImg, bool.booleanValue());
            }
        };
    }

    public C35517a<Boolean> showLockStickerPopupImg() {
        return new C35517a<Boolean>() {
            public Boolean get() {
                return Boolean.valueOf(C35563c.f93230L.mo93342a(Property.ShowLockStickerPopupImg));
            }

            public void set(Boolean bool) {
                C35563c.f93230L.mo93341a(Property.ShowLockStickerPopupImg, bool.booleanValue());
            }
        };
    }

    public boolean showStickerCollection() {
        return C36964i.m118928d();
    }

    public String SdkV4AuthKey() {
        return C35563c.f93230L.mo93346e(Property.SdkV4AuthKey);
    }

    public boolean enableDuetReactVEEditor() {
        return C35563c.f93231M.mo93305a(AVAB.Property.VEEditorCompileForDuetReact);
    }

    public boolean enableFeedbackLog() {
        return C35563c.f93231M.mo93305a(AVAB.Property.EnableFeedbackLog);
    }

    public boolean enableInstagramSilentShare() {
        return C35563c.f93231M.mo93305a(AVAB.Property.EnableInstagramSilentShare);
    }

    public boolean enableMBlackPanel() {
        return C35563c.f93231M.mo93305a(AVAB.Property.EnableMBlackPanel);
    }

    public boolean enablePhotoMovie() {
        if (C35563c.f93231M.mo93306b(AVAB.Property.PhotoMovieEnabled) != 0) {
            return true;
        }
        return false;
    }

    public boolean enableReact() {
        return C35563c.f93230L.mo93342a(Property.CanReact);
    }

    public boolean enableStatusMode() {
        if (!TextUtils.isEmpty(getStatusTabKey())) {
            return true;
        }
        return false;
    }

    public boolean enableStickerDetailsEntrance() {
        return C35563c.f93231M.mo93305a(AVAB.Property.StickerDetailsEntranceEnable);
    }

    public boolean enableUploadFallback() {
        return C35563c.f93231M.mo93305a(AVAB.Property.EnableUploadFallback);
    }

    public boolean enableUploadSyncIns() {
        return C35563c.f93230L.mo93342a(Property.EnableUploadSyncIns);
    }

    public boolean enableUploadSyncInsStory() {
        return C35563c.f93230L.mo93342a(Property.EnableUploadSyncInsStory);
    }

    public boolean enableUploadSyncTwitter() {
        return C35563c.f93230L.mo93342a(Property.EnableUploadSyncTwitter);
    }

    public boolean forceAddVideoHead() {
        return C35563c.f93231M.mo93305a(AVAB.Property.ForceAddVideoHead);
    }

    public String freeFLowCardUrl() {
        return C35563c.f93230L.mo93346e(Property.FreeFLowCardUrl);
    }

    public int getEditPageMusicPanelOptimization() {
        return C35563c.f93231M.mo93306b(AVAB.Property.EditPageMusicPanelOptimization);
    }

    public boolean getEditPagePrompt() {
        return C35563c.f93231M.mo93305a(AVAB.Property.EditPagePrompt);
    }

    public String getStatusTabKey() {
        return C35563c.f93230L.mo93346e(Property.StatusTabKey);
    }

    public boolean isEnableGetThumbsWithEffect() {
        return C35563c.f93230L.mo93342a(Property.EnableVeCoverEffect);
    }

    public boolean isEnableUseVEGetThumbs() {
        return C35563c.f93230L.mo93342a(Property.EnableUseVeCover);
    }

    public boolean isEnableVideoEditActivityUploadSpeedProbe() {
        return C35563c.f93231M.mo93305a(AVAB.Property.EnableVideoEditActivityUploadSpeedProbe);
    }

    public boolean isOpenMusicRecordWithSticker() {
        return C35563c.f93231M.mo93305a(AVAB.Property.OpenMusicRecordWithSticker);
    }

    public boolean isOpenStickerRecordWithMusic() {
        return C35563c.f93231M.mo93305a(AVAB.Property.OpenStickerRecordWithMusic);
    }

    public boolean needLoginBeforeRecord() {
        return C35563c.f93231M.mo93305a(AVAB.Property.NeedLoginInBeforeRecord);
    }

    public long progressBarThreshold() {
        return C35563c.f93230L.mo93344c(Property.ProgressBarThreshold);
    }

    public int recommentMusicByAIPolicy() {
        return C35563c.f93231M.mo93306b(AVAB.Property.RecommentMusicByAIPolicy);
    }

    public boolean shareVideo2GifEditable() {
        return C35563c.f93231M.mo93305a(AVAB.Property.ShareVideo2GifEditable);
    }

    public boolean showMvThemeRecordMode() {
        return C35563c.f93231M.mo93305a(AVAB.Property.MvThemeRecordMode);
    }

    public boolean uploadOptimizeForPie() {
        return C35563c.f93231M.mo93305a(AVAB.Property.UploadOptimizeForPie);
    }

    public boolean enablePreUploadByUser() {
        boolean a = C35563c.f93230L.mo93342a(Property.EnablePreUploadByUser);
        StringBuilder sb = new StringBuilder("Get EnablePreUploadByUser:");
        sb.append(a);
        C41530am.m132280a(sb.toString());
        return a;
    }

    public void startTestABActivity(Context context) {
        AVABAndSettingActivity.m118834a(context);
    }

    public void updateUserSettings(C6711m mVar) {
        configUserPreUploadSetting(mVar);
    }

    private void asynMonitorAwemeSetting(IESSettingsProxy iESSettingsProxy) {
        C1592h.m7853a((Callable<TResult>) new AVSettingsServiceImpl$$Lambda$0<TResult>(iESSettingsProxy));
    }

    public C20488d getLibraryLoader(Application application) {
        if (C35563c.f93231M.mo93305a(AVAB.Property.LoadLibraryFromExternal)) {
            return new C47452c(application, new C20486b());
        }
        return new C47460h();
    }

    public void setEnablePreUploadByUser(boolean z) {
        StringBuilder sb = new StringBuilder("Set EnablePreUploadByUser:");
        sb.append(z);
        C41530am.m132280a(sb.toString());
        C35563c.f93230L.mo93341a(Property.EnablePreUploadByUser, z);
    }

    private void configUserPreUploadSetting(C6711m mVar) {
        int asInt = getAsInt(mVar, "enable_pre_upload", -1);
        StringBuilder sb = new StringBuilder("EnablePreUploadByUser userPreUploadSetting:");
        sb.append(asInt);
        C41530am.m132280a(sb.toString());
        boolean z = false;
        if (asInt != -1) {
            if (asInt == 1) {
                z = true;
            }
            setEnablePreUploadByUser(z);
            return;
        }
        if (!enablePreUploadByUser()) {
            SettingsApiManager.m120238a("enable_pre_upload", 0);
        }
    }

    static final /* synthetic */ Void lambda$asynMonitorAwemeSetting$0$AVSettingsServiceImpl(IESSettingsProxy iESSettingsProxy) throws Exception {
        try {
            C40020a.f103922a.mo99458a("filter", iESSettingsProxy.getBeautyModel().intValue());
            C40020a.f103922a.mo99458a("hard_code_shot", iESSettingsProxy.getUseHardcode().intValue());
            C40020a.f103922a.mo99458a("hard_code_release", iESSettingsProxy.getUseSyntheticHardcode().intValue());
            C40020a.f103922a.mo99458a("hard_code_water_marker", iESSettingsProxy.getUseWatermarkHardcode().booleanValue() ? 1 : 0);
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v7, types: [java.lang.Long] */
    /* JADX WARNING: type inference failed for: r4v11, types: [java.lang.Float] */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v17, types: [java.lang.Boolean] */
    /* JADX WARNING: type inference failed for: r4v21, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r4v24 */
    /* JADX WARNING: type inference failed for: r4v25 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateVEAB(com.google.gson.C6711m r8) {
        /*
            r7 = this;
            com.ss.android.vesdk.VEConfigCenter r0 = com.p280ss.android.vesdk.VEConfigCenter.m142457a()
            java.util.Map<java.lang.String, com.ss.android.vesdk.VEConfigCenter$a> r0 = r0.f116147a
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x000e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x008c
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.get(r2)
            com.ss.android.vesdk.VEConfigCenter$a r3 = (com.p280ss.android.vesdk.VEConfigCenter.C45182a) r3
            if (r3 == 0) goto L_0x000e
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L_0x000e
            r4 = 0
            int[] r5 = com.p280ss.android.ugc.aweme.services.AVSettingsServiceImpl.C374284.$SwitchMap$com$ss$android$vesdk$VEConfigCenter$DataType
            com.ss.android.vesdk.VEConfigCenter$DataType r6 = r3.f116148a
            int r6 = r6.ordinal()
            r5 = r5[r6]
            switch(r5) {
                case 1: goto L_0x0078;
                case 2: goto L_0x0067;
                case 3: goto L_0x0059;
                case 4: goto L_0x0048;
                case 5: goto L_0x0037;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0088
        L_0x0037:
            java.lang.Object r4 = r3.f116149b
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r2 = r7.getAsInt(r8, r2, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            goto L_0x0088
        L_0x0048:
            java.lang.Object r4 = r3.f116149b
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            boolean r2 = r7.getAsBoolean(r8, r2, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            goto L_0x0088
        L_0x0059:
            java.lang.String r2 = r7.getAsString(r8, r2)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L_0x0065
            java.lang.Object r2 = r3.f116149b
        L_0x0065:
            r4 = r2
            goto L_0x0088
        L_0x0067:
            java.lang.Object r4 = r3.f116149b
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            float r2 = r7.getAsFloat(r8, r2, r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r2)
            goto L_0x0088
        L_0x0078:
            java.lang.Object r4 = r3.f116149b
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            long r4 = r7.getAsLong(r8, r2, r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
        L_0x0088:
            r3.mo107839a(r4)
            goto L_0x000e
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.services.AVSettingsServiceImpl.updateVEAB(com.google.gson.m):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(157:0|1|2|3|4|5|6|7|(1:9)|10|11|(1:13)|14|15|(1:17)|18|19|20|21|22|23|24|25|(2:26|27)|28|30|31|(1:33)(1:34)|35|36|37|(1:39)(1:40)|41|(2:42|43)|44|46|47|48|49|50|51|52|53|(2:54|55)|56|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|(2:98|99)|100|102|103|104|105|(1:107)|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|(1:165)(1:166)|167|(1:169)|170|(2:171|172)|173|(3:175|176|177)|(1:180)|181|182) */
    /* JADX WARNING: Can't wrap try/catch for region: R(158:0|1|2|3|4|5|6|7|(1:9)|10|11|(1:13)|14|15|(1:17)|18|19|20|21|22|23|24|25|(2:26|27)|28|30|31|(1:33)(1:34)|35|36|37|(1:39)(1:40)|41|(2:42|43)|44|46|47|48|49|50|51|52|53|(2:54|55)|56|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|(2:98|99)|100|102|103|104|105|(1:107)|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|(1:165)(1:166)|167|(1:169)|170|171|172|173|(3:175|176|177)|(1:180)|181|182) */
    /* JADX WARNING: Can't wrap try/catch for region: R(159:0|1|2|3|4|5|6|7|(1:9)|10|11|(1:13)|14|15|(1:17)|18|19|20|21|22|23|24|25|(2:26|27)|28|30|31|(1:33)(1:34)|35|36|37|(1:39)(1:40)|41|42|43|44|46|47|48|49|50|51|52|53|(2:54|55)|56|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|(2:98|99)|100|102|103|104|105|(1:107)|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|(1:165)(1:166)|167|(1:169)|170|171|172|173|(3:175|176|177)|(1:180)|181|182) */
    /* JADX WARNING: Can't wrap try/catch for region: R(160:0|1|2|3|4|5|6|7|(1:9)|10|11|(1:13)|14|15|(1:17)|18|19|20|21|22|23|24|25|(2:26|27)|28|30|31|(1:33)(1:34)|35|36|37|(1:39)(1:40)|41|42|43|44|46|47|48|49|50|51|52|53|54|55|56|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|(2:98|99)|100|102|103|104|105|(1:107)|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|(1:165)(1:166)|167|(1:169)|170|171|172|173|(3:175|176|177)|(1:180)|181|182) */
    /* JADX WARNING: Can't wrap try/catch for region: R(161:0|1|2|3|4|5|6|7|(1:9)|10|11|(1:13)|14|15|(1:17)|18|19|20|21|22|23|24|25|(2:26|27)|28|30|31|(1:33)(1:34)|35|36|37|(1:39)(1:40)|41|42|43|44|46|47|48|49|50|51|52|53|54|55|56|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|102|103|104|105|(1:107)|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|(1:165)(1:166)|167|(1:169)|170|171|172|173|(3:175|176|177)|(1:180)|181|182) */
    /* JADX WARNING: Can't wrap try/catch for region: R(162:0|1|2|3|4|5|6|7|(1:9)|10|11|(1:13)|14|15|(1:17)|18|19|20|21|22|23|24|25|26|27|28|30|31|(1:33)(1:34)|35|36|37|(1:39)(1:40)|41|42|43|44|46|47|48|49|50|51|52|53|54|55|56|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|102|103|104|105|(1:107)|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|(1:165)(1:166)|167|(1:169)|170|171|172|173|(3:175|176|177)|(1:180)|181|182) */
    /* JADX WARNING: Can't wrap try/catch for region: R(164:0|1|2|3|4|5|6|7|(1:9)|10|11|(1:13)|14|15|(1:17)|18|19|20|21|22|23|24|25|26|27|28|30|31|(1:33)(1:34)|35|36|37|(1:39)(1:40)|41|42|43|44|46|47|48|49|50|51|52|53|54|55|56|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|102|103|104|105|(1:107)|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|(1:165)(1:166)|167|(1:169)|170|171|172|173|175|176|177|(1:180)|181|182) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:104:0x02e6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x0301 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0046 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:110:0x0310 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:112:0x031f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:114:0x032e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:116:0x033d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:118:0x034c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:120:0x035b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:122:0x036a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:124:0x0375 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:126:0x0384 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:128:0x0393 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:130:0x03a2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:132:0x03b1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:134:0x03c0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:136:0x03cf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:138:0x03da */
    /* JADX WARNING: Missing exception handler attribute for start block: B:140:0x03e9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:142:0x03f8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:144:0x0403 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:146:0x0412 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:148:0x041d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x005f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:150:0x0428 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:152:0x0433 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:154:0x0442 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:156:0x0451 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:158:0x0460 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:160:0x046b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0078 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0087 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0096 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00a5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00b4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x000f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00d9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00ed */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x0113 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0128 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0137 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x0146 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x01a4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x01b3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x01c2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x01d1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x01e0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x002d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x01ef */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x01fe */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x020d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x021c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x022b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x023a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:82:0x0249 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x0258 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x0267 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x0276 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x0285 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x0294 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:94:0x02a3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x02b2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:98:0x02c1 */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02f0 A[Catch:{ NullValueException -> 0x0301 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050 A[Catch:{ NullValueException -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x04c9  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069 A[Catch:{ NullValueException -> 0x0078 }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d3 A[Catch:{ NullValueException -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d5 A[Catch:{ NullValueException -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e7 A[Catch:{ NullValueException -> 0x00ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e9 A[Catch:{ NullValueException -> 0x00ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0037 A[Catch:{ NullValueException -> 0x0046 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateServerSettings(com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r8) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.property.AVSettings r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x000f }
            com.ss.android.ugc.aweme.property.AVSettings$Property r1 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.HttpTimeout     // Catch:{ NullValueException -> 0x000f }
            java.lang.Long r2 = r8.getHttpTimeout()     // Catch:{ NullValueException -> 0x000f }
            long r2 = r2.longValue()     // Catch:{ NullValueException -> 0x000f }
            r0.mo93339a(r1, r2)     // Catch:{ NullValueException -> 0x000f }
        L_0x000f:
            com.ss.android.ugc.aweme.property.AVSettings r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x001e }
            com.ss.android.ugc.aweme.property.AVSettings$Property r1 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.HttpRetryInterval     // Catch:{ NullValueException -> 0x001e }
            java.lang.Long r2 = r8.getHttpRetryInterval()     // Catch:{ NullValueException -> 0x001e }
            long r2 = r2.longValue()     // Catch:{ NullValueException -> 0x001e }
            r0.mo93339a(r1, r2)     // Catch:{ NullValueException -> 0x001e }
        L_0x001e:
            com.ss.android.ugc.aweme.property.AVSettings r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x002d }
            com.ss.android.ugc.aweme.property.AVSettings$Property r1 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.VideoBitrate     // Catch:{ NullValueException -> 0x002d }
            java.lang.Float r2 = r8.getVideoBitrate()     // Catch:{ NullValueException -> 0x002d }
            float r2 = r2.floatValue()     // Catch:{ NullValueException -> 0x002d }
            r0.mo93337a(r1, r2)     // Catch:{ NullValueException -> 0x002d }
        L_0x002d:
            java.lang.Integer r0 = r8.getVideoCompose()     // Catch:{ NullValueException -> 0x0046 }
            int r0 = r0.intValue()     // Catch:{ NullValueException -> 0x0046 }
            if (r0 <= 0) goto L_0x0046
            com.ss.android.ugc.aweme.property.AVSettings r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0046 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r1 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.VideoCompose     // Catch:{ NullValueException -> 0x0046 }
            java.lang.Integer r2 = r8.getVideoCompose()     // Catch:{ NullValueException -> 0x0046 }
            int r2 = r2.intValue()     // Catch:{ NullValueException -> 0x0046 }
            r0.mo93338a(r1, r2)     // Catch:{ NullValueException -> 0x0046 }
        L_0x0046:
            java.lang.Integer r0 = r8.getVideoCommit()     // Catch:{ NullValueException -> 0x005f }
            int r0 = r0.intValue()     // Catch:{ NullValueException -> 0x005f }
            if (r0 <= 0) goto L_0x005f
            com.ss.android.ugc.aweme.property.AVSettings r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x005f }
            com.ss.android.ugc.aweme.property.AVSettings$Property r1 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.VideoCommit     // Catch:{ NullValueException -> 0x005f }
            java.lang.Integer r2 = r8.getVideoCommit()     // Catch:{ NullValueException -> 0x005f }
            int r2 = r2.intValue()     // Catch:{ NullValueException -> 0x005f }
            r0.mo93338a(r1, r2)     // Catch:{ NullValueException -> 0x005f }
        L_0x005f:
            java.lang.Boolean r0 = r8.getLongVideoPermitted()     // Catch:{ NullValueException -> 0x0078 }
            boolean r0 = r0.booleanValue()     // Catch:{ NullValueException -> 0x0078 }
            if (r0 == 0) goto L_0x0078
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ NullValueException -> 0x0078 }
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r1)     // Catch:{ NullValueException -> 0x0078 }
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.p280ss.android.ugc.aweme.services.IAVService) r0     // Catch:{ NullValueException -> 0x0078 }
            r0.updateNewPermission()     // Catch:{ NullValueException -> 0x0078 }
        L_0x0078:
            com.ss.android.ugc.aweme.property.AVSettings r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0087 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r1 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.SyntheticVideoBitrate     // Catch:{ NullValueException -> 0x0087 }
            java.lang.Float r2 = r8.getSyntheticVideoBitrate()     // Catch:{ NullValueException -> 0x0087 }
            float r2 = r2.floatValue()     // Catch:{ NullValueException -> 0x0087 }
            r0.mo93337a(r1, r2)     // Catch:{ NullValueException -> 0x0087 }
        L_0x0087:
            com.ss.android.ugc.aweme.property.AVSettings r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0096 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r1 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.PrivateAvailable     // Catch:{ NullValueException -> 0x0096 }
            java.lang.Boolean r2 = r8.getPrivateAvailable()     // Catch:{ NullValueException -> 0x0096 }
            boolean r2 = r2.booleanValue()     // Catch:{ NullValueException -> 0x0096 }
            r0.mo93341a(r1, r2)     // Catch:{ NullValueException -> 0x0096 }
        L_0x0096:
            com.ss.android.ugc.aweme.property.AVSettings r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x00a5 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r1 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.LongVideoPermitted     // Catch:{ NullValueException -> 0x00a5 }
            java.lang.Boolean r2 = r8.getLongVideoPermitted()     // Catch:{ NullValueException -> 0x00a5 }
            boolean r2 = r2.booleanValue()     // Catch:{ NullValueException -> 0x00a5 }
            r0.mo93341a(r1, r2)     // Catch:{ NullValueException -> 0x00a5 }
        L_0x00a5:
            com.ss.android.ugc.aweme.property.AVSettings r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x00b4 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r1 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.LongVideoThreshold     // Catch:{ NullValueException -> 0x00b4 }
            java.lang.Long r2 = r8.getLongVideoThreshold()     // Catch:{ NullValueException -> 0x00b4 }
            long r2 = r2.longValue()     // Catch:{ NullValueException -> 0x00b4 }
            r0.mo93339a(r1, r2)     // Catch:{ NullValueException -> 0x00b4 }
        L_0x00b4:
            com.ss.android.ugc.aweme.property.AVSettings r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x00c3 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r1 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.ProgressBarThreshold     // Catch:{ NullValueException -> 0x00c3 }
            java.lang.Long r2 = r8.getProgressbarThreshold()     // Catch:{ NullValueException -> 0x00c3 }
            long r2 = r2.longValue()     // Catch:{ NullValueException -> 0x00c3 }
            r0.mo93339a(r1, r2)     // Catch:{ NullValueException -> 0x00c3 }
        L_0x00c3:
            r0 = 0
            r1 = 1
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x00d9 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.HardCode     // Catch:{ NullValueException -> 0x00d9 }
            java.lang.Integer r4 = r8.getUseHardcode()     // Catch:{ NullValueException -> 0x00d9 }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x00d9 }
            if (r4 != r1) goto L_0x00d5
            r4 = 1
            goto L_0x00d6
        L_0x00d5:
            r4 = 0
        L_0x00d6:
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x00d9 }
        L_0x00d9:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x00ed }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.SyntheticHardCode     // Catch:{ NullValueException -> 0x00ed }
            java.lang.Integer r4 = r8.getUseSyntheticHardcode()     // Catch:{ NullValueException -> 0x00ed }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x00ed }
            if (r4 != r1) goto L_0x00e9
            r4 = 1
            goto L_0x00ea
        L_0x00e9:
            r4 = 0
        L_0x00ea:
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x00ed }
        L_0x00ed:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x00fc }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.BeautyModel     // Catch:{ NullValueException -> 0x00fc }
            java.lang.Integer r4 = r8.getBeautyModel()     // Catch:{ NullValueException -> 0x00fc }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x00fc }
            r2.mo93338a(r3, r4)     // Catch:{ NullValueException -> 0x00fc }
        L_0x00fc:
            r2 = 51
            com.ss.android.ugc.aweme.property.AVSettings r3 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0113 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r4 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.RecordVideoQuality     // Catch:{ NullValueException -> 0x0113 }
            java.lang.Integer r5 = r8.getVideoQuality()     // Catch:{ NullValueException -> 0x0113 }
            int r5 = r5.intValue()     // Catch:{ NullValueException -> 0x0113 }
            r6 = 18
            int r5 = com.p280ss.android.ugc.aweme.property.C36964i.m118917a(r5, r1, r2, r6)     // Catch:{ NullValueException -> 0x0113 }
            r3.mo93338a(r4, r5)     // Catch:{ NullValueException -> 0x0113 }
        L_0x0113:
            com.ss.android.ugc.aweme.property.AVSettings r3 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0128 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r4 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.SyntheticVideoQuality     // Catch:{ NullValueException -> 0x0128 }
            java.lang.Integer r5 = r8.getSyntheticVideoQuality()     // Catch:{ NullValueException -> 0x0128 }
            int r5 = r5.intValue()     // Catch:{ NullValueException -> 0x0128 }
            r6 = 15
            int r2 = com.p280ss.android.ugc.aweme.property.C36964i.m118917a(r5, r1, r2, r6)     // Catch:{ NullValueException -> 0x0128 }
            r3.mo93338a(r4, r2)     // Catch:{ NullValueException -> 0x0128 }
        L_0x0128:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0137 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.FaceDetectInterval     // Catch:{ NullValueException -> 0x0137 }
            java.lang.Integer r4 = r8.getFaceDetectInterval()     // Catch:{ NullValueException -> 0x0137 }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x0137 }
            r2.mo93338a(r3, r4)     // Catch:{ NullValueException -> 0x0137 }
        L_0x0137:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0146 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.EnableAutoRetryRecord     // Catch:{ NullValueException -> 0x0146 }
            java.lang.Boolean r4 = r8.getEnableAutoRetryRecord()     // Catch:{ NullValueException -> 0x0146 }
            boolean r4 = r4.booleanValue()     // Catch:{ NullValueException -> 0x0146 }
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x0146 }
        L_0x0146:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0151 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.VideoSize     // Catch:{ NullValueException -> 0x0151 }
            java.lang.String r4 = r8.getVideoSize()     // Catch:{ NullValueException -> 0x0151 }
            r2.mo93340a(r3, r4)     // Catch:{ NullValueException -> 0x0151 }
        L_0x0151:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.RecordBitrateCategory
            com.google.gson.e r4 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93239b
            java.util.List r5 = r8.getVideoBitrateCategory()
            java.lang.String r4 = r4.mo15979b(r5)
            r2.mo93340a(r3, r4)
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.RecordQualityCategory
            com.google.gson.e r4 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93239b
            java.util.List r5 = r8.getVideoQualityCategory()
            java.lang.String r4 = r4.mo15979b(r5)
            r2.mo93340a(r3, r4)
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.VideoSizeCategory
            com.google.gson.e r4 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93239b
            java.util.List r5 = r8.getVideoSizeCategory()
            java.lang.String r4 = r4.mo15979b(r5)
            r2.mo93340a(r3, r4)
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.ImportVideoSizeCategory
            com.google.gson.e r4 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93239b
            java.util.List r5 = r8.getUploadVideoSizeCategory()
            java.lang.String r4 = r4.mo15979b(r5)
            r2.mo93340a(r3, r4)
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x01a4 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.SyntheticVideoMaxRate     // Catch:{ NullValueException -> 0x01a4 }
            java.lang.Long r4 = r8.getSyntheticVideoMaxrate()     // Catch:{ NullValueException -> 0x01a4 }
            long r4 = r4.longValue()     // Catch:{ NullValueException -> 0x01a4 }
            r2.mo93339a(r3, r4)     // Catch:{ NullValueException -> 0x01a4 }
        L_0x01a4:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x01b3 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.SyntheticVideoPreset     // Catch:{ NullValueException -> 0x01b3 }
            java.lang.Integer r4 = r8.getSyntheticVideoPreset()     // Catch:{ NullValueException -> 0x01b3 }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x01b3 }
            r2.mo93338a(r3, r4)     // Catch:{ NullValueException -> 0x01b3 }
        L_0x01b3:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x01c2 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.SyntheticVideoGop     // Catch:{ NullValueException -> 0x01c2 }
            java.lang.Integer r4 = r8.getSyntheticVideoGop()     // Catch:{ NullValueException -> 0x01c2 }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x01c2 }
            r2.mo93338a(r3, r4)     // Catch:{ NullValueException -> 0x01c2 }
        L_0x01c2:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x01d1 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.UploadOriginalAudioTrack     // Catch:{ NullValueException -> 0x01d1 }
            java.lang.Boolean r4 = r8.getUploadOriginAudioTrack()     // Catch:{ NullValueException -> 0x01d1 }
            boolean r4 = r4.booleanValue()     // Catch:{ NullValueException -> 0x01d1 }
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x01d1 }
        L_0x01d1:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x01e0 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.RecordBitrateMode     // Catch:{ NullValueException -> 0x01e0 }
            java.lang.Integer r4 = r8.getRecordBitrateMode()     // Catch:{ NullValueException -> 0x01e0 }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x01e0 }
            r2.mo93338a(r3, r4)     // Catch:{ NullValueException -> 0x01e0 }
        L_0x01e0:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x01ef }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.RecordHardwareProfile     // Catch:{ NullValueException -> 0x01ef }
            java.lang.Integer r4 = r8.getRecordOpenHighProfile()     // Catch:{ NullValueException -> 0x01ef }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x01ef }
            r2.mo93338a(r3, r4)     // Catch:{ NullValueException -> 0x01ef }
        L_0x01ef:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x01fe }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.ForbidLocalWatermark     // Catch:{ NullValueException -> 0x01fe }
            java.lang.Boolean r4 = r8.getForbidLocalWatermark()     // Catch:{ NullValueException -> 0x01fe }
            boolean r4 = r4.booleanValue()     // Catch:{ NullValueException -> 0x01fe }
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x01fe }
        L_0x01fe:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x020d }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.ForbidLifeStoryLocalWatermark     // Catch:{ NullValueException -> 0x020d }
            java.lang.Boolean r4 = r8.getForbidLifeStoryLocalWatermark()     // Catch:{ NullValueException -> 0x020d }
            boolean r4 = r4.booleanValue()     // Catch:{ NullValueException -> 0x020d }
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x020d }
        L_0x020d:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x021c }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.WatermarkHardcode     // Catch:{ NullValueException -> 0x021c }
            java.lang.Boolean r4 = r8.getUseWatermarkHardcode()     // Catch:{ NullValueException -> 0x021c }
            boolean r4 = r4.booleanValue()     // Catch:{ NullValueException -> 0x021c }
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x021c }
        L_0x021c:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x022b }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.EnableUploadSyncTwitter     // Catch:{ NullValueException -> 0x022b }
            java.lang.Boolean r4 = r8.getEnableUploadSyncTwitter()     // Catch:{ NullValueException -> 0x022b }
            boolean r4 = r4.booleanValue()     // Catch:{ NullValueException -> 0x022b }
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x022b }
        L_0x022b:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x023a }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.EnableUploadSyncIns     // Catch:{ NullValueException -> 0x023a }
            java.lang.Boolean r4 = r8.getEnableUploadSyncIns()     // Catch:{ NullValueException -> 0x023a }
            boolean r4 = r4.booleanValue()     // Catch:{ NullValueException -> 0x023a }
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x023a }
        L_0x023a:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0249 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.EnableUploadSyncInsStory     // Catch:{ NullValueException -> 0x0249 }
            java.lang.Boolean r4 = r8.getEnableUploadSyncInsStory()     // Catch:{ NullValueException -> 0x0249 }
            boolean r4 = r4.booleanValue()     // Catch:{ NullValueException -> 0x0249 }
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x0249 }
        L_0x0249:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0258 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.RecordCameraType     // Catch:{ NullValueException -> 0x0258 }
            java.lang.Integer r4 = r8.getRecordCameraType()     // Catch:{ NullValueException -> 0x0258 }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x0258 }
            r2.mo93338a(r3, r4)     // Catch:{ NullValueException -> 0x0258 }
        L_0x0258:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0267 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.InCamera2BlackList     // Catch:{ NullValueException -> 0x0267 }
            java.lang.Integer r4 = r8.getInCamera2BlackList()     // Catch:{ NullValueException -> 0x0267 }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x0267 }
            r2.mo93338a(r3, r4)     // Catch:{ NullValueException -> 0x0267 }
        L_0x0267:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0276 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.RecordCameraCompatLevel     // Catch:{ NullValueException -> 0x0276 }
            java.lang.Integer r4 = r8.getRecordCameraCompatLevel()     // Catch:{ NullValueException -> 0x0276 }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x0276 }
            r2.mo93338a(r3, r4)     // Catch:{ NullValueException -> 0x0276 }
        L_0x0276:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0285 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.DefaultMicrophoneState     // Catch:{ NullValueException -> 0x0285 }
            java.lang.Integer r4 = r8.getReactMicStatus()     // Catch:{ NullValueException -> 0x0285 }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x0285 }
            r2.mo93338a(r3, r4)     // Catch:{ NullValueException -> 0x0285 }
        L_0x0285:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0294 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.CanReact     // Catch:{ NullValueException -> 0x0294 }
            java.lang.Boolean r4 = r8.getCanReact()     // Catch:{ NullValueException -> 0x0294 }
            boolean r4 = r4.booleanValue()     // Catch:{ NullValueException -> 0x0294 }
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x0294 }
        L_0x0294:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x02a3 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.CloseUploadExtractFrames     // Catch:{ NullValueException -> 0x02a3 }
            java.lang.Integer r4 = r8.getCloseVframeUpload()     // Catch:{ NullValueException -> 0x02a3 }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x02a3 }
            r2.mo93338a(r3, r4)     // Catch:{ NullValueException -> 0x02a3 }
        L_0x02a3:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x02b2 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.InEvening     // Catch:{ NullValueException -> 0x02b2 }
            java.lang.Integer r4 = r8.getInEvening()     // Catch:{ NullValueException -> 0x02b2 }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x02b2 }
            r2.mo93338a(r3, r4)     // Catch:{ NullValueException -> 0x02b2 }
        L_0x02b2:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x02c1 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.UseLargeMattingModel     // Catch:{ NullValueException -> 0x02c1 }
            java.lang.Boolean r4 = r8.getEnableLargeMattingDetectModel()     // Catch:{ NullValueException -> 0x02c1 }
            boolean r4 = r4.booleanValue()     // Catch:{ NullValueException -> 0x02c1 }
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x02c1 }
        L_0x02c1:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x02d0 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.UseLargeGestureDetectModel     // Catch:{ NullValueException -> 0x02d0 }
            java.lang.Boolean r4 = r8.getEnableLargeGestureDetectModel()     // Catch:{ NullValueException -> 0x02d0 }
            boolean r4 = r4.booleanValue()     // Catch:{ NullValueException -> 0x02d0 }
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x02d0 }
        L_0x02d0:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.ReactDuetSettingChanged
            r2.mo93341a(r3, r0)
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x02e6 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.MusicCopyRightGranted     // Catch:{ NullValueException -> 0x02e6 }
            java.lang.Boolean r4 = r8.getMusicCopyrightGranted()     // Catch:{ NullValueException -> 0x02e6 }
            boolean r4 = r4.booleanValue()     // Catch:{ NullValueException -> 0x02e6 }
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x02e6 }
        L_0x02e6:
            java.lang.Integer r2 = r8.getStoryImagePlayTime()     // Catch:{ NullValueException -> 0x0301 }
            int r2 = r2.intValue()     // Catch:{ NullValueException -> 0x0301 }
            if (r2 <= 0) goto L_0x0301
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0301 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.StoryImagePlayTime     // Catch:{ NullValueException -> 0x0301 }
            java.lang.Integer r4 = r8.getStoryImagePlayTime()     // Catch:{ NullValueException -> 0x0301 }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x0301 }
            int r4 = r4 * 1000
            r2.mo93338a(r3, r4)     // Catch:{ NullValueException -> 0x0301 }
        L_0x0301:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0310 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.EnableWaterBgMask     // Catch:{ NullValueException -> 0x0310 }
            java.lang.Boolean r4 = r8.getEnableWaterBgMask()     // Catch:{ NullValueException -> 0x0310 }
            boolean r4 = r4.booleanValue()     // Catch:{ NullValueException -> 0x0310 }
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x0310 }
        L_0x0310:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x031f }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.BitrateOfRecodeThreshold     // Catch:{ NullValueException -> 0x031f }
            java.lang.Integer r4 = r8.getBitrateOfRecodeThreshold()     // Catch:{ NullValueException -> 0x031f }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x031f }
            r2.mo93338a(r3, r4)     // Catch:{ NullValueException -> 0x031f }
        L_0x031f:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x032e }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.EnableSyntheticFpsSet     // Catch:{ NullValueException -> 0x032e }
            java.lang.Boolean r4 = r8.getEnableSyntheticFpsSet()     // Catch:{ NullValueException -> 0x032e }
            boolean r4 = r4.booleanValue()     // Catch:{ NullValueException -> 0x032e }
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x032e }
        L_0x032e:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x033d }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.ShowLastStoryFrame     // Catch:{ NullValueException -> 0x033d }
            java.lang.Boolean r4 = r8.getStorySupportAnimate()     // Catch:{ NullValueException -> 0x033d }
            boolean r4 = r4.booleanValue()     // Catch:{ NullValueException -> 0x033d }
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x033d }
        L_0x033d:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x034c }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.MaxFansCount     // Catch:{ NullValueException -> 0x034c }
            java.lang.Integer r4 = r8.getVideoUploadNormalizationParam()     // Catch:{ NullValueException -> 0x034c }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x034c }
            r2.mo93338a(r3, r4)     // Catch:{ NullValueException -> 0x034c }
        L_0x034c:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x035b }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.WideCameraInfo     // Catch:{ NullValueException -> 0x035b }
            java.lang.Integer r4 = r8.getWideCameraInfo()     // Catch:{ NullValueException -> 0x035b }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x035b }
            r2.mo93338a(r3, r4)     // Catch:{ NullValueException -> 0x035b }
        L_0x035b:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x036a }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.DefaultWideMode     // Catch:{ NullValueException -> 0x036a }
            java.lang.Boolean r4 = r8.getAvDefaultWideMode()     // Catch:{ NullValueException -> 0x036a }
            boolean r4 = r4.booleanValue()     // Catch:{ NullValueException -> 0x036a }
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x036a }
        L_0x036a:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0375 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.FreeFLowCardUrl     // Catch:{ NullValueException -> 0x0375 }
            java.lang.String r4 = r8.getFreeFlowCardUrlSticker()     // Catch:{ NullValueException -> 0x0375 }
            r2.mo93340a(r3, r4)     // Catch:{ NullValueException -> 0x0375 }
        L_0x0375:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0384 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.ShakeFreeWhiteList     // Catch:{ NullValueException -> 0x0384 }
            java.lang.Integer r4 = r8.getShakeFreeWhiteList()     // Catch:{ NullValueException -> 0x0384 }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x0384 }
            r2.mo93338a(r3, r4)     // Catch:{ NullValueException -> 0x0384 }
        L_0x0384:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0393 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.ShakeFreeDefaultMode     // Catch:{ NullValueException -> 0x0393 }
            java.lang.Boolean r4 = r8.getDefaultShakeFreeMode()     // Catch:{ NullValueException -> 0x0393 }
            boolean r4 = r4.booleanValue()     // Catch:{ NullValueException -> 0x0393 }
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x0393 }
        L_0x0393:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x03a2 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.ShutterSoundEnable     // Catch:{ NullValueException -> 0x03a2 }
            java.lang.Boolean r4 = r8.getShutterSoundEnable()     // Catch:{ NullValueException -> 0x03a2 }
            boolean r4 = r4.booleanValue()     // Catch:{ NullValueException -> 0x03a2 }
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x03a2 }
        L_0x03a2:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x03b1 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.SpringEffectCacheController     // Catch:{ NullValueException -> 0x03b1 }
            java.lang.Boolean r4 = r8.getLifeEffectsColdReq()     // Catch:{ NullValueException -> 0x03b1 }
            boolean r4 = r4.booleanValue()     // Catch:{ NullValueException -> 0x03b1 }
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x03b1 }
        L_0x03b1:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x03c0 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.IsExportHqFrame     // Catch:{ NullValueException -> 0x03c0 }
            java.lang.Boolean r4 = r8.getEnableHqVframe()     // Catch:{ NullValueException -> 0x03c0 }
            boolean r4 = r4.booleanValue()     // Catch:{ NullValueException -> 0x03c0 }
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x03c0 }
        L_0x03c0:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x03cf }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.VideoDurationLimitMillisecond     // Catch:{ NullValueException -> 0x03cf }
            java.lang.Long r4 = r8.getVideoDurationLimitMs()     // Catch:{ NullValueException -> 0x03cf }
            long r4 = r4.longValue()     // Catch:{ NullValueException -> 0x03cf }
            r2.mo93339a(r3, r4)     // Catch:{ NullValueException -> 0x03cf }
        L_0x03cf:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x03da }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.RecordTutorialLink     // Catch:{ NullValueException -> 0x03da }
            java.lang.String r4 = r8.getShootTutorialLink()     // Catch:{ NullValueException -> 0x03da }
            r2.mo93340a(r3, r4)     // Catch:{ NullValueException -> 0x03da }
        L_0x03da:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x03e9 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.PreUploadMemoryLimit     // Catch:{ NullValueException -> 0x03e9 }
            java.lang.Integer r4 = r8.getPreUploadMemoryLimit()     // Catch:{ NullValueException -> 0x03e9 }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x03e9 }
            r2.mo93338a(r3, r4)     // Catch:{ NullValueException -> 0x03e9 }
        L_0x03e9:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x03f8 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.Enable1080pFastImport     // Catch:{ NullValueException -> 0x03f8 }
            java.lang.Integer r4 = r8.getEnable1080pFastImport()     // Catch:{ NullValueException -> 0x03f8 }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x03f8 }
            r2.mo93338a(r3, r4)     // Catch:{ NullValueException -> 0x03f8 }
        L_0x03f8:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0403 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.StickerArtistIconUrl     // Catch:{ NullValueException -> 0x0403 }
            java.lang.String r4 = r8.getStickerArtistIconUrl()     // Catch:{ NullValueException -> 0x0403 }
            r2.mo93340a(r3, r4)     // Catch:{ NullValueException -> 0x0403 }
        L_0x0403:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0412 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.EnableVESingleGL     // Catch:{ NullValueException -> 0x0412 }
            java.lang.Integer r4 = r8.getEnableVeSingleGl()     // Catch:{ NullValueException -> 0x0412 }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x0412 }
            r2.mo93338a(r3, r4)     // Catch:{ NullValueException -> 0x0412 }
        L_0x0412:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x041d }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.EffectSdkConfigSettings     // Catch:{ NullValueException -> 0x041d }
            java.lang.String r4 = r8.getEffectSdkConfigSettings()     // Catch:{ NullValueException -> 0x041d }
            r2.mo93340a(r3, r4)     // Catch:{ NullValueException -> 0x041d }
        L_0x041d:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0428 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.StatusTabKey     // Catch:{ NullValueException -> 0x0428 }
            java.lang.String r4 = r8.getStatusTabKey()     // Catch:{ NullValueException -> 0x0428 }
            r2.mo93340a(r3, r4)     // Catch:{ NullValueException -> 0x0428 }
        L_0x0428:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0433 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.StatusLottieUrl     // Catch:{ NullValueException -> 0x0433 }
            java.lang.String r4 = r8.getStatusLottieUrl()     // Catch:{ NullValueException -> 0x0433 }
            r2.mo93340a(r3, r4)     // Catch:{ NullValueException -> 0x0433 }
        L_0x0433:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0442 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.StatusPhoneType     // Catch:{ NullValueException -> 0x0442 }
            java.lang.Integer r4 = r8.getStatusPhoneType()     // Catch:{ NullValueException -> 0x0442 }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x0442 }
            r2.mo93338a(r3, r4)     // Catch:{ NullValueException -> 0x0442 }
        L_0x0442:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0451 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.EnableUpdateMoji     // Catch:{ NullValueException -> 0x0451 }
            java.lang.Boolean r4 = r8.getEnableMojiUpdateResources()     // Catch:{ NullValueException -> 0x0451 }
            boolean r4 = r4.booleanValue()     // Catch:{ NullValueException -> 0x0451 }
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x0451 }
        L_0x0451:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0460 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.ReviewVideoFastPublish     // Catch:{ NullValueException -> 0x0460 }
            java.lang.Boolean r4 = r8.getUseNewyearDirectUpload()     // Catch:{ NullValueException -> 0x0460 }
            boolean r4 = r4.booleanValue()     // Catch:{ NullValueException -> 0x0460 }
            r2.mo93341a(r3, r4)     // Catch:{ NullValueException -> 0x0460 }
        L_0x0460:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x046b }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.VERuntimeConfig     // Catch:{ NullValueException -> 0x046b }
            java.lang.String r4 = r8.getVeRuntimeConfig()     // Catch:{ NullValueException -> 0x046b }
            r2.mo93340a(r3, r4)     // Catch:{ NullValueException -> 0x046b }
        L_0x046b:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x047a }
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.SATCameraType     // Catch:{ NullValueException -> 0x047a }
            java.lang.Integer r4 = r8.getSatCameraType()     // Catch:{ NullValueException -> 0x047a }
            int r4 = r4.intValue()     // Catch:{ NullValueException -> 0x047a }
            r2.mo93338a(r3, r4)     // Catch:{ NullValueException -> 0x047a }
        L_0x047a:
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.PostDownloadSetting
            java.lang.Boolean r4 = r8.getPostDownloadSetting()
            boolean r4 = r4.booleanValue()
            r2.mo93341a(r3, r4)
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.VEFastImportIgnoreRecode
            java.lang.Boolean r4 = r8.getVeFastImportIgnoreRecode()
            boolean r4 = r4.booleanValue()
            r2.mo93341a(r3, r4)
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.VEFastImportIgnoreRecodeForRotation
            java.lang.Boolean r4 = r8.getVeFastImportIgnoreRecodeForRotation()
            boolean r4 = r4.booleanValue()
            r2.mo93341a(r3, r4)
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.EnableUseVeCover
            java.lang.Integer r4 = r8.getUseVeImage()
            int r4 = r4.intValue()
            if (r4 != r1) goto L_0x04b7
            r4 = 1
            goto L_0x04b8
        L_0x04b7:
            r4 = 0
        L_0x04b8:
            r2.mo93341a(r3, r4)
            com.ss.android.ugc.aweme.property.AVSettings r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r3 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.EnableVeCoverEffect
            java.lang.Integer r4 = r8.getEnableCoverEffect()
            int r4 = r4.intValue()
            if (r4 != r1) goto L_0x04ca
            r0 = 1
        L_0x04ca:
            r2.mo93341a(r3, r0)
            com.ss.android.ugc.aweme.property.AVSettings r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r1 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.EnableUseGameRotationSensor
            java.lang.Boolean r2 = r8.getEnableUseGameRotationSensor()
            boolean r2 = r2.booleanValue()
            r0.mo93341a(r1, r2)
            com.ss.android.ugc.aweme.property.AVSettings r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r1 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.UlikeBeautyDownloadEnable
            java.lang.Boolean r2 = r8.getEnableCameraBeautifyEffect()
            boolean r2 = r2.booleanValue()
            r0.mo93341a(r1, r2)
            com.ss.android.ugc.aweme.property.AVSettings r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r1 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.IsLowMemoryMachine
            java.lang.Boolean r2 = r8.getIsLowMemoryMachineForTools()
            boolean r2 = r2.booleanValue()
            r0.mo93341a(r1, r2)
            com.ss.android.ugc.aweme.property.AVSettings r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L     // Catch:{ NullValueException -> 0x0509 }
            com.ss.android.ugc.aweme.property.AVSettings$Property r1 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.DraftUseMultiVideoEdit     // Catch:{ NullValueException -> 0x0509 }
            java.lang.Boolean r2 = r8.getDraftUseMultiVideoEdit()     // Catch:{ NullValueException -> 0x0509 }
            boolean r2 = r2.booleanValue()     // Catch:{ NullValueException -> 0x0509 }
            r0.mo93341a(r1, r2)     // Catch:{ NullValueException -> 0x0509 }
        L_0x0509:
            r0 = 0
            com.ss.android.ugc.aweme.global.config.settings.pojo.UlikeParams r1 = r8.getUlikeParams()     // Catch:{ NullValueException -> 0x050f }
            r0 = r1
        L_0x050f:
            if (r0 == 0) goto L_0x05a7
            com.ss.android.ugc.aweme.property.AVSettings r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r2 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.UlikeSharpenDefaultValue
            java.lang.Float r3 = r0.getUlikeSharpenDefaultValue()
            float r3 = r3.floatValue()
            r1.mo93337a(r2, r3)
            com.ss.android.ugc.aweme.property.AVSettings r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r2 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.UlikeSmoothDefaultValue
            java.lang.Float r3 = r0.getUlikeSmoothDefaultValue()
            float r3 = r3.floatValue()
            r1.mo93337a(r2, r3)
            com.ss.android.ugc.aweme.property.AVSettings r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r2 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.UlikeShapeDefaultValue
            java.lang.Float r3 = r0.getUlikeShapeDefaultValue()
            float r3 = r3.floatValue()
            r1.mo93337a(r2, r3)
            com.ss.android.ugc.aweme.property.AVSettings r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r2 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.UlikeEyesDefaultValue
            java.lang.Float r3 = r0.getUlikeEyesDefaultValue()
            float r3 = r3.floatValue()
            r1.mo93337a(r2, r3)
            com.ss.android.ugc.aweme.property.AVSettings r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r2 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.UlikeLipDefaultValue
            java.lang.Float r3 = r0.getUlikeLipDefaultValue()
            float r3 = r3.floatValue()
            r1.mo93337a(r2, r3)
            com.ss.android.ugc.aweme.property.AVSettings r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r2 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.UlikeBlusherDefaultValue
            java.lang.Float r3 = r0.getUlikeBlusherDefaultValue()
            float r3 = r3.floatValue()
            r1.mo93337a(r2, r3)
            com.ss.android.ugc.aweme.property.AVSettings r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r2 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.UlikeSmoothMaxValue
            java.lang.Float r3 = r0.getUlikeSmoothMaxValue()
            float r3 = r3.floatValue()
            r1.mo93337a(r2, r3)
            com.ss.android.ugc.aweme.property.AVSettings r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r2 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.UlikeShapeMaxValue
            java.lang.Float r3 = r0.getUlikeShapeMaxValue()
            float r3 = r3.floatValue()
            r1.mo93337a(r2, r3)
            com.ss.android.ugc.aweme.property.AVSettings r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r2 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.UlikeEyesMaxValue
            java.lang.Float r3 = r0.getUlikeEyesMaxValue()
            float r3 = r3.floatValue()
            r1.mo93337a(r2, r3)
            com.ss.android.ugc.aweme.property.AVSettings r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r2 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.EnableBeautySharpen
            java.lang.Boolean r0 = r0.getEnableBeautySharpen()
            boolean r0 = r0.booleanValue()
            r1.mo93341a(r2, r0)
        L_0x05a7:
            com.ss.android.ugc.aweme.shortvideo.k.a r0 = com.p280ss.android.ugc.aweme.shortvideo.p1580k.C40020a.f103922a
            r0.mo99457a()
            r7.asynMonitorAwemeSetting(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.services.AVSettingsServiceImpl.updateServerSettings(com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy):void");
    }

    private String getAsString(C6711m mVar, String str) {
        String str2 = "";
        try {
            C6712o c = mVar.mo16150c(str);
            if (c != null) {
                return c.mo15998c();
            }
            return str2;
        } catch (Exception unused) {
            return str2;
        }
    }

    public void setDefaultFilterForCamera(int i, int i2) {
        if (i == 0) {
            C35563c.f93230L.mo93338a(backCameraProperty(), i2);
        } else {
            C35563c.f93230L.mo93338a(frontCameraProperty(), i2);
        }
    }

    private void setAB(C6711m mVar, AVAB.Property property) {
        switch (property.type()) {
            case Boolean:
                C35563c.f93231M.mo93304a(property, getAsBoolean(mVar, property.key(), ((Boolean) property.defValue()).booleanValue()));
                return;
            case Integer:
                C35563c.f93231M.mo93301a(property, getAsInt(mVar, property.key(), ((Integer) property.defValue()).intValue()));
                return;
            case Long:
                C35563c.f93231M.mo93302a(property, getAsLong(mVar, property.key(), ((Long) property.defValue()).longValue()));
                return;
            case Float:
                C35563c.f93231M.mo93300a(property, getAsFloat(mVar, property.key(), ((Float) property.defValue()).floatValue()));
                return;
            case String:
                C35563c.f93231M.mo93303a(property, getAsString(mVar, property.key()));
                break;
        }
    }

    private float getAsFloat(C6711m mVar, String str, float f) {
        try {
            C6712o c = mVar.mo16150c(str);
            if (c != null) {
                return c.mo16000e();
            }
            return f;
        } catch (Exception unused) {
            return f;
        }
    }

    private long getAsLong(C6711m mVar, String str, long j) {
        try {
            C6712o c = mVar.mo16150c(str);
            if (c != null) {
                return c.mo16002f();
            }
            return j;
        } catch (Exception unused) {
            return j;
        }
    }

    private int getAsInt(C6711m mVar, String str, int i) {
        int i2;
        try {
            C6712o c = mVar.mo16150c(str);
            if (c == null) {
                return i;
            }
            if (!c.mo16156a()) {
                i2 = c.mo16003g();
            } else if (c.mo16004h()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            return i2;
        } catch (Exception unused) {
            return i;
        }
    }

    private boolean getAsBoolean(C6711m mVar, String str, boolean z) {
        try {
            C6712o c = mVar.mo16150c(str);
            if (c == null) {
                return z;
            }
            if (!c.mo16159q()) {
                return c.mo16004h();
            }
            if (c.mo15997b().intValue() == 1) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return z;
        }
    }
}
