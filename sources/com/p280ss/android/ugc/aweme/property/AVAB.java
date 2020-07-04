package com.p280ss.android.ugc.aweme.property;

import android.content.Context;
import android.content.SharedPreferences;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.property.PropertyStore.C36952a;
import com.p280ss.android.ugc.aweme.property.PropertyStore.PropertyType;

/* renamed from: com.ss.android.ugc.aweme.property.AVAB */
public final class AVAB {

    /* renamed from: a */
    private SharedPreferences f96780a;

    /* renamed from: b */
    private PropertyStore f96781b = new PropertyStore(this.f96780a);

    /* renamed from: com.ss.android.ugc.aweme.property.AVAB$Property */
    public enum Property implements C36952a {
        PhotoEditEnabled("photo_edit_enabled", PropertyType.Boolean, Boolean.valueOf(false), true),
        RecordBitrateCategoryIndex("record_bitrate_category_index", PropertyType.Integer, Integer.valueOf(0), true),
        RecordQualityCategoryIndex("record_quality_category_index", PropertyType.Integer, Integer.valueOf(0), true),
        PrivatePrompt("private_prompt", PropertyType.Integer, Integer.valueOf(0), true),
        QuietlySynthetic("quietly_synthetic", PropertyType.Boolean, Boolean.valueOf(false), true),
        VideoSizeIndex("setting_video_size_index", PropertyType.Integer, Integer.valueOf(0), true),
        ImportVideoSizeIndex("setting_upload_video_size_index", PropertyType.Integer, Integer.valueOf(0), true),
        SmoothMax("smooth_max", PropertyType.Float, Float.valueOf(0.8f), true),
        SmoothDefault("smooth_default", PropertyType.Float, Float.valueOf(0.6f), true),
        ReshapeMax("reshape_max", PropertyType.Float, Float.valueOf(0.6f), true),
        ReshapeDefault("reshape_default", PropertyType.Float, Float.valueOf(0.36f), true),
        ContourMax("contour_max", PropertyType.Float, Float.valueOf(0.8f), true),
        ContourDefault("contour_default", PropertyType.Float, Float.valueOf(0.0f), true),
        ColorFilterPanel("color_filter_panel", PropertyType.Integer, Integer.valueOf(1), true),
        EnableReuseFaceSticker("enable_reuse_face_sticker", PropertyType.Boolean, Boolean.valueOf(false), true),
        PhotoMovieEnabled("enable_photomovie", (int) PropertyType.Integer, (String) Integer.valueOf(0), (PropertyType) C36990u.m119001a(Integer.valueOf(0), Integer.valueOf(1)), (Object) true),
        ShowAutoImproveButtonInEditPage("show_auto_improve_button", PropertyType.Integer, Integer.valueOf(0), true),
        LightEnhanceBlackList("is_weak_light_enhance_black", PropertyType.Integer, Integer.valueOf(0), true),
        CanShowPublishFriendGuide("can_show_publish_friend_guide", PropertyType.Boolean, Boolean.valueOf(false), true),
        EyesMax("eyes_max", PropertyType.Float, Float.valueOf(0.6f), true),
        EyesDefault("eyes_default", PropertyType.Float, Float.valueOf(0.6f), true),
        ShapeMax("shape_max", PropertyType.Float, Float.valueOf(0.6f), true),
        ShapeDefault("shape_default", PropertyType.Float, Float.valueOf(0.6f), true),
        BeautificationIconStyle("beautification_icon_style", PropertyType.Integer, Integer.valueOf(0), true),
        RearCamera("rear_camera", PropertyType.Boolean, Boolean.valueOf(false), true),
        RecordHardwareProfile("record_hardware_profile", PropertyType.Integer, Integer.valueOf(1), true),
        FetchEffectModelType("fetch_effect_model_zip_version", PropertyType.Integer, Integer.valueOf(0), true),
        PreFetchPopEffectModel("pre_fetch_effect_model", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableSaveUploadVideo("upload_save_local", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableInstagramSilentShare("isInstagramSilentShare", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableUploadFallback("enable_upload_fallback", PropertyType.Boolean, Boolean.valueOf(false), true),
        UploadOptimizeForPie("upload_optimize_for_pie", PropertyType.Boolean, Boolean.valueOf(true), true),
        UseContourSlider("use_contour_slider", PropertyType.Boolean, Boolean.valueOf(false), true),
        AddTextInMusically("show_button_title_in_record_page", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableExposureOptimize("enable_exposure_optmize", PropertyType.Boolean, Boolean.valueOf(true), true),
        RecordCameraTypeAB("camera_type_ab", PropertyType.Integer, Integer.valueOf(-1), true),
        RecordCameraCompatLevelAB("record_camera_compat_level_ab", PropertyType.Integer, Integer.valueOf(-1), true),
        PublishOnNewIntentCheckDelay("publish_on_new_intent_check_delay", PropertyType.Integer, Integer.valueOf(0), true),
        EnableNewEffectEngineForBuiltInEffect("enable_new_effect_engine_for_built_in_effect", (int) PropertyType.Boolean, (String) Boolean.valueOf(false), (PropertyType) true, (Object) new C36978m()),
        UploadSpeedProbeSize("upload_speed_probe_size", PropertyType.Integer, Integer.valueOf(524288), true),
        ConcurrentUploadCancelOnAuthKey("concurrent_upload_cancel_on_auth_key", PropertyType.Boolean, Boolean.valueOf(true), true),
        UploadSpeedProbeMinGap("upload_speed_probe_min_gap", PropertyType.Integer, Integer.valueOf(300000), true),
        UploadSpeedProbeTimeOut("upload_speed_probe_time_out", PropertyType.Integer, Integer.valueOf(20000), true),
        TTUploaderTTNetProxyType("ttuploader_ttnet_proxy_type", PropertyType.Integer, Integer.valueOf(-1), true),
        RecordMinDiskAmountMB("record_min_disk_amount_mb", PropertyType.Integer, Integer.valueOf(20), true),
        UploadStatusReportGapS("upload_status_report_gap_s", PropertyType.Integer, Integer.valueOf(-1), true),
        EnableOnlyReportKeyUploadLog("enable_only_report_key_upload_log", PropertyType.Boolean, Boolean.valueOf(false), true),
        TTNetExternNetInfo("ttnet_extern_net_info", PropertyType.String, "", true),
        EnableVECompileCrfReencode("enable_ve_compile_crf_reencode", PropertyType.Boolean, Boolean.valueOf(false), true),
        SyntheticVideoQuality("synthetic_video_quality", PropertyType.Integer, Integer.valueOf(-1), true),
        SyntheticVideoMaxRate("synthetic_video_maxrate", PropertyType.Long, Long.valueOf(-1), true),
        SyntheticVideoPreset("synthetic_video_preset", PropertyType.Integer, Integer.valueOf(-1), true),
        SyntheticVideoGop("synthetic_video_gop", PropertyType.Integer, Integer.valueOf(-1), true),
        VideoBitrate("video_bitrate", PropertyType.Float, Float.valueOf(-1.0f), true),
        SyntheticVideoBitrate("synthetic_video_bitrate", PropertyType.Float, Float.valueOf(-1.0f), true),
        ShareVideo2GifEditable("new_version_gif_share", PropertyType.Boolean, Boolean.valueOf(true), true),
        UseEffectCam("use_effectcam_key", PropertyType.Boolean, Boolean.valueOf(false), false),
        UsePlanQi("use_plan_qi_key", PropertyType.Boolean, Boolean.valueOf(false), false),
        LoadLibraryFromExternal("从/sdcard/加载so重启生效", PropertyType.Boolean, Boolean.valueOf(false), true),
        GetEffectVersionFromLib("使用 Effect SDK 中的版本号", PropertyType.Boolean, Boolean.valueOf(true), true),
        RecommentMusicByAIPolicy("recomment_music_by_ai_policy", PropertyType.Integer, Integer.valueOf(0), true),
        ShowVideoInfo("show_video_info", PropertyType.Boolean, Boolean.valueOf(false), false),
        StickerDetailsEntranceEnable("sticker_details_entrance_enable", PropertyType.Boolean, Boolean.valueOf(false), true),
        UseVECompiler("use_ve_compiler", PropertyType.Integer, Integer.valueOf(0), false),
        EnableOpenGl3("use_open_gl_three", PropertyType.Integer, Integer.valueOf(1), true),
        EnableEffectParallelFwk("enable_effect_parallel_fwk", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableQIEffectParallelFwk("enable_effect_parallel_fwk_qi", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableInfoSticker("enable_infosticker", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableParallelSynthesizeUpload("enable_parallel_synthesize_upload", PropertyType.Boolean, Boolean.valueOf(true), true),
        EnablePreUpload("enable_pre_upload", PropertyType.Boolean, Boolean.valueOf(false), true),
        BeautyModeSwitch("beauty_mode_switch", PropertyType.Boolean, Boolean.valueOf(false), true),
        EffectPlatformUseTTNet("effect_platform_use_ttnet", PropertyType.Boolean, Boolean.valueOf(false), true),
        NeedLoginInBeforeRecord("need_login_in_before_record", PropertyType.Boolean, Boolean.valueOf(true), true),
        EnableStickerCollection("show_sticker_collection", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableSoftEncodeAcc("enable_soft_encode_acc", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableFullScreenAdapt("enable_editor_screen_adaptation", PropertyType.Boolean, Boolean.valueOf(true), true),
        ForceAddVideoHead("force_add_video_head", PropertyType.Boolean, Boolean.valueOf(false), true),
        UsingMixRecordButton("use_mix_record_button", PropertyType.Boolean, Boolean.valueOf(true), true),
        NeedRecode("need_recode", PropertyType.Boolean, Boolean.valueOf(false), true),
        StoryPreviewUsingSurfaceView("is_surface_view_story_preview", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableFeedbackLog("enable_feedback_log", PropertyType.Boolean, Boolean.valueOf(false), true),
        VeEditorANRDestroy("veeditor_anr_destroy", PropertyType.Boolean, Boolean.valueOf(false), true),
        VECutVideoEnable("enable_ve_cut_video", PropertyType.Boolean, Boolean.valueOf(true), true),
        VideoSynthesisOpt("video_synthesis_opt", PropertyType.Boolean, Boolean.valueOf(false), true),
        EffectExclusionPattern("effect_exclusion_pattern", PropertyType.String, "", true),
        UseNewEffectExecutorType("effect_download_executor_type", PropertyType.Boolean, Boolean.valueOf(true), true),
        VESynthesisSettings("ve_synthesis_settings", PropertyType.String, "", true),
        EnablePublishDetailALog("enable_publish_detail_alog", PropertyType.Boolean, Boolean.valueOf(false), true),
        VESynthesisSettingsByUploadSpeed("ve_synthesis_settings_by_upload_speed", PropertyType.String, "", true),
        TTUploaderResponseTimeOut("tt_uploader_response_time_out", PropertyType.Integer, Integer.valueOf(0), true),
        TTUploaderHttpDNSConfig("tt_uploader_http_dns_config", PropertyType.String, "", true),
        CompileProbeConfig("compile_probe_config", PropertyType.String, "", true),
        VECameraPreviewSize("ve_camera_preview_size", PropertyType.String, "", true),
        EnableRecordTutorial("shoot_tutorial_switch", PropertyType.Boolean, Boolean.valueOf(false), true),
        LongVideoDefaultUseLong("default_enable_long_video", PropertyType.Boolean, Boolean.valueOf(true), false),
        VideoLegalCheckInLocal("video_legal_check_in_local", PropertyType.Boolean, Boolean.valueOf(true), true),
        LongDurationRecordAsTab("is_long_duration_record_as_tab", PropertyType.Boolean, Boolean.valueOf(false), true),
        UseNewPublishShareDescription("is_publish_share_description", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableSearchGIF("enable_search_gif", PropertyType.Boolean, Boolean.valueOf(false), true),
        VEExtractFramesAfterRender("ve_extract_frames_after_render", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableVEFastImport("enable_ve_fast_import", PropertyType.Boolean, Boolean.valueOf(true), true),
        FastImportFpsLimit("fast_import_fps_limit", PropertyType.Integer, Integer.valueOf(40), true),
        FastImportResolutionLimit("fast_import_resolution_limit", PropertyType.String, "720*1280", true),
        FastImportGopLimit("fast_import_gop_limit", PropertyType.Integer, Integer.valueOf(3000), true),
        EnableSlimVECutProcessor("enable_slim_ve_cut_processor", PropertyType.Boolean, Boolean.valueOf(true), true),
        CameraOptionFlagsOpt("camera_option_flags_opt", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableVENewFrameworkVersion("enable_ve_new_framework_version", PropertyType.Boolean, Boolean.valueOf(false), true),
        DefaultPublishPrivacyType("default_publish_privacy_type", PropertyType.Integer, Integer.valueOf(0), true),
        MvThemeRecordMode("mv_theme_mode_switch", PropertyType.Boolean, Boolean.valueOf(false), true),
        LiveMvTabOrder("publish_page_live_location", PropertyType.Integer, Integer.valueOf(0), true),
        OpenCameraFrameOptimizeSDK("open_camera_frame_optimize_sdk", PropertyType.Boolean, Boolean.valueOf(false), true),
        OpenCameraFrameOptimizePreLoadSo("open_camera_frame_optimize_pre_load_so", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableTextStickerInMain("enable_text_sticker_in_main", PropertyType.Boolean, Boolean.valueOf(true), true),
        StudioEffectNewTabUi("studio_effect_new_tab_ui", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableVoiceConversion("studio_enable_editpage_voicechanger", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableRecordConversion("studio_enable_video_edit_dub", PropertyType.Boolean, Boolean.valueOf(false), true),
        OpenStickerRecordWithMusic("open_sticker_record_with_music", PropertyType.Boolean, Boolean.valueOf(false), true),
        OpenMusicRecordWithSticker("open_music_record_with_sticker", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableSingleSegmentConcatUseCopy("enable_single_segment_concat_use_copy", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableVideoEditActivityUploadSpeedProbe("enable_video_edit_activity_upload_speed_probe", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableMVThemePreUpload("enable_mv_theme_pre_upload", PropertyType.Boolean, Boolean.valueOf(false), true),
        PreUploadEncryptionMode("pre_upload_encryption_mode", PropertyType.Integer, Integer.valueOf(0), true),
        EnableEffectNewEngine("enable_effect_new_engine", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableEffectNewEngineEdit("enable_effect_new_engine_edit", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableTT265Decoder("enable_tt_265_decoder", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableOptimizePublishContainerActivityNotInStack("enable_optimize_publish_container_activity_not_in_stack", PropertyType.Boolean, Boolean.valueOf(true), true),
        EnableEnhanceVolume("enable_enhance_volume", PropertyType.Boolean, Boolean.valueOf(false), true),
        EditPageMusicPanelOptimization("edit_page_music_panel_optimization", PropertyType.Integer, Integer.valueOf(0), true),
        VEConfigOptLevel("ve_sdk_config_level", PropertyType.Integer, Integer.valueOf(0), true),
        EnableVECacheGLContext("enable_ve_cache_gl_context", PropertyType.Integer, Integer.valueOf(0), true),
        DuetFixNewPlan("enable_duet_fix_new_plan", PropertyType.Boolean, Boolean.valueOf(true), true),
        UlikeBeautyAbGroup("studio_recorder_beautify_effects_group", PropertyType.Integer, Integer.valueOf(0), true),
        EnableSilentShareOptimize("enable_silent_share_optimize", PropertyType.Boolean, Boolean.valueOf(true), true),
        RemoveStoryStrategy("remove_story_strategy", PropertyType.Integer, Integer.valueOf(0), true),
        EnableEditPageMemoryOpt("enable_edit_page_memory_opt", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableStoryCameraOpt("enable_story_camera_opt", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableEditPageMVMemoryOpt("enable_edit_page_mv_memory_opt", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnablePublishThreadOpt("enable_publish_thread_opt", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableVboostOpt("enable_vboost_opt", PropertyType.Boolean, Boolean.valueOf(false), true),
        RememberLastRecordDuration("remember_last_record_duration", PropertyType.Boolean, Boolean.valueOf(false), true),
        EditPagePrompt("edit_page_prompt", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableUserVeRecoder("enable_use_ve_recoder", PropertyType.Boolean, Boolean.valueOf(false), true),
        PubRecHashTag("pub_rec_hashtag", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableMBlackPanel("enable_m_black_panel", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableMusicStickPoint("enable_music_stick_point", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableSmartMusicStickPoint("enable_music_smart_stick_point", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableSmartStickPointFeedback("enable_smart_stick_point_feedback", PropertyType.Boolean, Boolean.valueOf(false), true),
        ShowMusicStickPointBubble("show_music_stick_point_bubble", PropertyType.Boolean, Boolean.valueOf(false), true),
        StickPointMusicCutLength("music_smart_stick_point_max_music_duration", PropertyType.Integer, Integer.valueOf(20), true),
        StickPointDefaltMode("music_stickpoint_defalt_mode", PropertyType.Integer, Integer.valueOf(1), true),
        OpenSDKQAdaption("open_sdk_Q_adaption", PropertyType.Boolean, Boolean.valueOf(true), true),
        SDKQAdaptionConfig("sdk_Q_adaption", PropertyType.Boolean, Boolean.valueOf(false), true),
        StudioBeautyEffectComposer("studio_beauty_effect_composer", PropertyType.Boolean, Boolean.valueOf(false), true),
        ComposerPanelHasTitle("composer_panel_has_title", PropertyType.Boolean, Boolean.valueOf(true), true),
        StudioMBeautyPanel("studio_m_beauty_panel", PropertyType.Boolean, Boolean.valueOf(false), true),
        StudioBeautyEffectComposerGroup("studio_beauty_effect_composer_group", PropertyType.Integer, Integer.valueOf(0), true),
        EnableEffectDiskCache("use_effect_lru_cache", PropertyType.Boolean, Boolean.valueOf(true), true),
        EnableAsyncInitVesdk("async_init_vesdk", PropertyType.Boolean, Boolean.valueOf(true), true),
        EnableRushLooper("catch_crash_activity", PropertyType.Boolean, Boolean.valueOf(true), true),
        VideoRecordToolbarConfigure("video_recorder_simplify_config", PropertyType.Integer, Integer.valueOf(0), true),
        EnableUploadMetadata("upload_metadata", PropertyType.Boolean, Boolean.valueOf(false), true),
        VEUseNewEffectAlgorithmApi("ve_use_new_effect_algorithm", PropertyType.Boolean, Boolean.valueOf(false), true),
        UseNewMvStruct("studio_recorder_mv_thumbnail_style", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableVEUploadApplog("enable_ve_upload_applog", PropertyType.Boolean, Boolean.valueOf(true), true),
        EnableStickerFunctionalities("enable_sticker_functionalities", PropertyType.Boolean, Boolean.valueOf(false), true),
        RearMusicAutoLoop("rear_music_auto_loop", PropertyType.Boolean, Boolean.valueOf(false), true),
        IsForcedToDefaultFullScreenPlan("is_forced_to_default_full_screen_plan", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableProcessRefactor("enable_process_refactor", PropertyType.Integer, Integer.valueOf(0), true),
        EnableVideoImageMixed("enable_video_image_mixed", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableRemove15sCapMusic("remove_15s_cap_music", PropertyType.Boolean, Boolean.valueOf(true), false),
        EnableMultiFastImport("enable_multi_fast_import", PropertyType.Boolean, Boolean.valueOf(false), true),
        VEEditorCompileForDuetReact("using_veeditor_for_duet_react", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableUploadVideoSlideAutoJust("upload_video_slider_auto_adjust", PropertyType.Boolean, Boolean.valueOf(false), true),
        RecordOutputCategory("record_output_category", PropertyType.Integer, Integer.valueOf(1), true),
        EnableThreeBuffer("enable_three_buffer", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableImportAvSync("enable_import_avsync", PropertyType.Integer, Integer.valueOf(0), true),
        EnableOpenGLResourceReuse("enable_open_gl_resource_reuse", PropertyType.Integer, Integer.valueOf(0), true),
        EnableSubtitleRecognition("enable_subtitle_recognition", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableSubtitleRecognitionAI("enable_subtitle_recognition_ai", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnablePublishPrivacySetting("enable_publish_privacy_setting", PropertyType.Integer, Integer.valueOf(0), true),
        EnableSearchEffect("enable_search_effect", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableSdkOutputRefactor("enable_sdk_output_refactor", PropertyType.Integer, Integer.valueOf(0), true),
        EnableSdkInputCrossPlatForm("enable_sdk_input_cross_platform", PropertyType.Integer, Integer.valueOf(0), true),
        MVPBeautyNewIcon("mvp_beauty_new_icon", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableFilterIntensityJust("studio_enable_filter_effect_slider", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableRecordStatusMode("enable_record_status_mode", PropertyType.Boolean, Boolean.valueOf(true), true),
        EnableRecordStatusRandomAll("enable_record_status_random_all", PropertyType.Boolean, Boolean.valueOf(true), true),
        EnableStatusBgRandomOrder("enable_status_bg_random_order", PropertyType.Boolean, Boolean.valueOf(true), true),
        StudioStickerPinEnable("studio_sticker_pin_enable", PropertyType.Boolean, Boolean.valueOf(false), true),
        EditorSceneLazyInit("scene_lazy_init", PropertyType.Boolean, Boolean.valueOf(true), true),
        RemoveIESMediaPlayer("remove_ies_media_player", PropertyType.Boolean, Boolean.valueOf(false), true),
        RenderUseVideoSizeIndex("render_use_videosize_index", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableMultiVideoEdit("studio_editor_allow_deleting_clip", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableCutVideoSceneRefactor("cut_video_scene_refactor", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableGLBase("enable_vesdk_glbase", PropertyType.Integer, Integer.valueOf(0), true),
        EnableASVESandBox("enable_sand_box", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableSATCamera("enable_sat_camera", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableEffectAsyncAPI("enable_effect_async_api", PropertyType.Boolean, Boolean.valueOf(false), true),
        StudioEnableRecorderTutorial("studio_enable_recorder_tutorial", PropertyType.Boolean, Boolean.valueOf(false), true);
        
        private final Object defVal;
        private final String key;
        private final boolean supportPersist;
        private final PropertyType type;
        private final C36930a updateCallback;
        private final C36990u<?> valueRange;

        /* renamed from: com.ss.android.ugc.aweme.property.AVAB$Property$a */
        interface C36930a {
            /* renamed from: a */
            void mo93317a(Object obj);
        }

        public final Object checkDefValue(PropertyType propertyType, Object obj) {
            return C36988s.m118987a(this, propertyType, obj);
        }

        public final Object defValue() {
            return this.defVal;
        }

        public final C36930a getUpdateCallback() {
            return this.updateCallback;
        }

        public final String key() {
            return this.key;
        }

        public final boolean supportPersist() {
            return this.supportPersist;
        }

        public final PropertyType type() {
            return this.type;
        }

        public final <T extends Comparable<T>> C36990u<T> valueRange() {
            return this.valueRange;
        }

        private Property(String str, PropertyType propertyType, Object obj, boolean z) {
            this(r10, r11, str, propertyType, obj, null, z, null);
        }

        private Property(String str, PropertyType propertyType, Object obj, C36990u<?> uVar, boolean z) {
            this(r10, r11, str, propertyType, obj, uVar, z, null);
        }

        private Property(String str, PropertyType propertyType, Object obj, boolean z, C36930a aVar) {
            this(r10, r11, str, propertyType, obj, null, z, aVar);
        }

        private Property(String str, PropertyType propertyType, Object obj, C36990u<?> uVar, boolean z, C36930a aVar) {
            Object checkDefValue = checkDefValue(propertyType, obj);
            this.key = str;
            this.type = propertyType;
            this.defVal = checkDefValue;
            this.valueRange = uVar;
            this.supportPersist = z;
            this.updateCallback = aVar;
        }
    }

    /* renamed from: b */
    public final synchronized int mo93306b(Property property) {
        return this.f96781b.mo93363b(property);
    }

    /* renamed from: c */
    public final synchronized long mo93307c(Property property) {
        return this.f96781b.mo93364c(property);
    }

    /* renamed from: d */
    public final synchronized float mo93308d(Property property) {
        return this.f96781b.mo93365d(property);
    }

    /* renamed from: e */
    public final synchronized String mo93309e(Property property) {
        return this.f96781b.mo93366e(property);
    }

    public AVAB(Context context) {
        this.f96780a = C7285c.m22838a(context, "av_ab.xml", 0);
    }

    /* renamed from: a */
    public final synchronized boolean mo93305a(Property property) {
        return this.f96781b.mo93362a(property);
    }

    /* renamed from: a */
    public final synchronized void mo93300a(Property property, float f) {
        this.f96781b.mo93357a((C36952a) property, f);
    }

    /* renamed from: a */
    public final synchronized void mo93301a(Property property, int i) {
        this.f96781b.mo93358a((C36952a) property, i);
    }

    /* renamed from: a */
    public final synchronized void mo93302a(Property property, long j) {
        this.f96781b.mo93359a((C36952a) property, j);
    }

    /* renamed from: a */
    public final synchronized void mo93303a(Property property, String str) {
        this.f96781b.mo93360a((C36952a) property, str);
    }

    /* renamed from: a */
    public final synchronized void mo93304a(Property property, boolean z) {
        this.f96781b.mo93361a((C36952a) property, z);
    }
}
