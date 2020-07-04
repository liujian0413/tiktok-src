package com.p280ss.android.ugc.aweme.property;

import android.content.Context;
import android.content.SharedPreferences;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.property.PropertyStore.C36952a;
import com.p280ss.android.ugc.aweme.property.PropertyStore.PropertyType;

/* renamed from: com.ss.android.ugc.aweme.property.AVSettings */
public final class AVSettings {

    /* renamed from: a */
    private SharedPreferences f96806a;

    /* renamed from: b */
    private PropertyStore f96807b = new PropertyStore(this.f96806a);

    /* renamed from: com.ss.android.ugc.aweme.property.AVSettings$Property */
    public enum Property implements C36952a {
        PrivateAvailable("private_available", PropertyType.Boolean, Boolean.valueOf(true), true),
        AwemePrivate("aweme_private", PropertyType.Boolean, Boolean.valueOf(false), true),
        EffectBubbleShown("effect_bubble_shown", PropertyType.Boolean, Boolean.valueOf(false), true),
        POIBubbleShow("poi_bubble_show", PropertyType.Boolean, Boolean.valueOf(false), false),
        DraftBubbleShown("draft_bubble_shown", PropertyType.Boolean, Boolean.valueOf(false), true),
        FirstSetPrivate("first_set_private", PropertyType.Boolean, Boolean.valueOf(false), true),
        RecordGuideShown("record_guide_shown", PropertyType.Boolean, Boolean.valueOf(false), true),
        SwitchFilterGuideShown("switch_filter_guide_shown", PropertyType.Boolean, Boolean.valueOf(false), true),
        CountDownGuideShown("countdown_guide_shown", PropertyType.Boolean, Boolean.valueOf(false), true),
        LongVideoPermitted("long_video_permitted", PropertyType.Boolean, Boolean.valueOf(false), true),
        LongVideoThreshold("long_video_threshold", PropertyType.Long, Long.valueOf(60000), true),
        HardCode("hard_encode", PropertyType.Boolean, Boolean.valueOf(false), true),
        SyntheticHardCode("synthetic_hardcode", PropertyType.Boolean, Boolean.valueOf(false), true),
        VideoBitrate("video_bitrate", PropertyType.Float, Float.valueOf(1.0f), true),
        SyntheticVideoBitrate("synthetic_video_bitrate", PropertyType.Float, Float.valueOf(1.0f), true),
        RecordVideoQuality("record_video_quality", PropertyType.Integer, Integer.valueOf(18), true),
        SyntheticVideoQuality("synthetic_video_quality", PropertyType.Integer, Integer.valueOf(15), true),
        ForbidLocalWatermark("forbid_local_watermark", PropertyType.Boolean, Boolean.valueOf(false), true),
        ForbidLifeStoryLocalWatermark("forbid_story_local_watermark", PropertyType.Boolean, Boolean.valueOf(false), true),
        WatermarkHardcode("use_watermark_hardcode", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableUploadSyncTwitter("enable_upload_sync_twitter", PropertyType.Boolean, Boolean.valueOf(true), true),
        EnableUploadSyncIns("enable_upload_sync_ins", PropertyType.Boolean, Boolean.valueOf(true), true),
        EnableUploadSyncInsStory("enable_upload_sync_ins_story", PropertyType.Boolean, Boolean.valueOf(true), true),
        EnableUploadSyncLocal("enable_upload_sync_local", PropertyType.Boolean, Boolean.valueOf(true), true),
        EnableSyntheticFpsSet("enable_synthetic_fps_set", PropertyType.Boolean, Boolean.valueOf(true), true),
        RecordBitrateCategory("record_bitrate_category", PropertyType.String, "", true),
        RecordQualityCategory("record_quality_category", PropertyType.String, "", true),
        LastPublishFailed("last_publish_failed", PropertyType.Boolean, Boolean.valueOf(false), true),
        BackCameraFilter("back_camera_filter", PropertyType.Integer, Integer.valueOf(0), true),
        StorageMonitorLocalSwitch("storage_monitor_local_switch", PropertyType.Boolean, Boolean.valueOf(true), true),
        FrontCameraFilter("front_camera_filter", PropertyType.Integer, Integer.valueOf(0), true),
        DisableFilter("disable_filter", PropertyType.Boolean, Boolean.valueOf(false), true),
        BackCameraFilterV2("back_camera_filter_v2", PropertyType.Integer, Integer.valueOf(0), true),
        FrontCameraFilterV2("front_camera_filter_v2", PropertyType.Integer, Integer.valueOf(0), true),
        StoryBackCameraFilter("story_back_camera_filter", PropertyType.Integer, Integer.valueOf(0), true),
        StoryFrontCameraFilter("story_front_camera_filter", PropertyType.Integer, Integer.valueOf(0), true),
        CameraPosition("camera_position", PropertyType.Integer, Integer.valueOf(1), true),
        StoryCameraPosition("story_camera_position", PropertyType.Integer, Integer.valueOf(0), true),
        VideoCompose("video_compose", PropertyType.Integer, Integer.valueOf(70), true),
        VideoCommit("video_commit", PropertyType.Integer, Integer.valueOf(30), true),
        HttpTimeout("http_timeout", PropertyType.Long, Long.valueOf(DouPlusShareGuideExperiment.MIN_VALID_DURATION), true),
        HttpRetryInterval("http_retry_interval", PropertyType.Long, Long.valueOf(500), true),
        ARStickerGuideTimes("ar_sticker_guide_times", PropertyType.Integer, Integer.valueOf(0), true),
        ARStickerFilterTimes("ar_sticker_filter_guide_times", PropertyType.Integer, Integer.valueOf(0), true),
        UseSenseTime("use_sensetime", PropertyType.Boolean, Boolean.valueOf(true), true),
        BodyDanceGuideTimes("body_dance_guide_times", PropertyType.Integer, Integer.valueOf(0), true),
        BeautyModel("beauty_model", PropertyType.Integer, Integer.valueOf(0), true),
        BeautificationMode("beautification_mode", PropertyType.Integer, Integer.valueOf(0), true),
        ProgressBarThreshold("progressbar_threshold", PropertyType.Long, Long.valueOf(30000), true),
        UseTTUploader("use_tt_uploader", PropertyType.Boolean, Boolean.valueOf(true), true),
        PublishPermissionShowDot("publish_permission_show_dot", PropertyType.Boolean, Boolean.valueOf(false), true),
        PublishPermissionDialogPrivate("publish_permission_dialog_private", PropertyType.Boolean, Boolean.valueOf(true), true),
        PublishPermissionDialogFriend("publish_permission_dialog_friend", PropertyType.Boolean, Boolean.valueOf(true), true),
        ShowFilterNewTag("show_filter_new_tag", PropertyType.Boolean, Boolean.valueOf(true), true),
        SmoothSkinIndex("smooth_skin_index", PropertyType.Integer, Integer.valueOf(3), true),
        ReshapeIndex("big_eyes_index", PropertyType.Integer, Integer.valueOf(3), true),
        FaceDetectInterval("face_detect_interval", PropertyType.Integer, Integer.valueOf(0), true),
        VideoSizeCategory("setting_video_size_category", PropertyType.String, "", true),
        ImportVideoSizeCategory("setting_upload_video_size_category", PropertyType.String, "", true),
        VideoSize("setting_video_size", PropertyType.String, "", true),
        BubbleGuideShown("setting_bubble_guide_shown", PropertyType.Boolean, Boolean.valueOf(false), true),
        EffectModelCopied("effect_model_copied", PropertyType.Boolean, Boolean.valueOf(false), true),
        ReshapeModelCopied("reshape_mode_copied", PropertyType.Boolean, Boolean.valueOf(false), true),
        AmericaRecordUploadGuideShow("america_record_upload_show", PropertyType.Boolean, Boolean.valueOf(false), true),
        BubbleFavoriteStickerShown("setting_bubble_guide_shown", PropertyType.Boolean, Boolean.valueOf(false), true),
        StickerCollectionFirst("setting_sticker_first", PropertyType.Boolean, Boolean.valueOf(true), true),
        StickerCollectionFirstShown("setting_sticker_first_shown", PropertyType.Boolean, Boolean.valueOf(false), true),
        SdkV4AuthKey("sdk_v4_auth_key", PropertyType.String, "", true),
        StorySdkV4AuthKey("story_sdk_v4_auth_key", PropertyType.String, "", true),
        SpeedPanelOpen("speed_panel_open", PropertyType.Boolean, Boolean.valueOf(false), true),
        SyntheticVideoMaxRate("synthetic_video_maxrate", PropertyType.Long, Long.valueOf(15000000), true),
        SyntheticVideoPreset("synthetic_video_preset", PropertyType.Integer, Integer.valueOf(0), true),
        SyntheticVideoGop("synthetic_video_gop", PropertyType.Integer, Integer.valueOf(35), true),
        BitrateOfRecodeThreshold("bitrate_of_recode_threshold", PropertyType.Integer, Integer.valueOf(10000000), true),
        UploadOriginalAudioTrack("upload_origin_audio_track", PropertyType.Boolean, Boolean.valueOf(false), true),
        CloseUploadExtractFrames("close_vframe_upload", PropertyType.Integer, Integer.valueOf(0), true),
        AutoApplySticker("time_auto_apply_sticker", PropertyType.Long, Long.valueOf(0), true),
        RecordBitrateMode("record_bitrate_mode", PropertyType.Integer, Integer.valueOf(1), true),
        RecordHardwareProfile("record_open_high_profile", PropertyType.Integer, Integer.valueOf(1), true),
        UserSmoothSkinLevel("user_smooth_skin_level", PropertyType.Integer, Integer.valueOf(-1), true),
        UserShapeLevel("user_shape_level", PropertyType.Integer, Integer.valueOf(-1), true),
        UserBigEyeLevel("user_big_eye_level", PropertyType.Integer, Integer.valueOf(-1), true),
        UserContourLevel("user_contour_level", PropertyType.Integer, Integer.valueOf(-1), true),
        UserLipLevel("user_lip_level", PropertyType.Integer, Integer.valueOf(-1), true),
        UserBlushLevel("user_blush_level", PropertyType.Integer, Integer.valueOf(-1), true),
        UserChangeSkinLevel("user_change_smooth_skin_level", PropertyType.Boolean, Boolean.valueOf(false), true),
        UserChangeShapeLevel("user_change_shape_level", PropertyType.Boolean, Boolean.valueOf(false), true),
        UserChangeBigEyeLevel("user_change_big_eye_level", PropertyType.Boolean, Boolean.valueOf(false), true),
        UserChangeContourLevel("user_change_contour_level", PropertyType.Boolean, Boolean.valueOf(false), true),
        UserChangeLipLevel("user_change_lip_level", PropertyType.Boolean, Boolean.valueOf(false), true),
        UserChangeBlushLevel("user_change_blush_level", PropertyType.Boolean, Boolean.valueOf(false), true),
        MusNeedResetShapeLevel("mus_need_reset_shape_level", PropertyType.Boolean, Boolean.valueOf(true), true),
        LoadOldUserLevel("load_old_user_level", PropertyType.Boolean, Boolean.valueOf(true), true),
        UserUlikeSmoothSkinLevel("user_ulike_smooth_skin_level", PropertyType.Integer, Integer.valueOf(-1), true),
        UserUlikeShapeLevel("user_ulike_shape_level", PropertyType.Integer, Integer.valueOf(-1), true),
        UserUlikeBigEyeLevel("user_ulike_big_eye_level", PropertyType.Integer, Integer.valueOf(-1), true),
        UserUlikeLipLevel("user_ulike_lip_level", PropertyType.Integer, Integer.valueOf(-1), true),
        UserUlikeBlushLevel("user_ulike_blush_level", PropertyType.Integer, Integer.valueOf(-1), true),
        ContourModelCopied("contour_mode_copied", PropertyType.Boolean, Boolean.valueOf(false), true),
        SHOW_MEMORY_INFO("show_memory_info", PropertyType.Boolean, Boolean.valueOf(true), true),
        UlikeNewReshapeCopied("ulike_new_reshape_model_copied", PropertyType.Boolean, Boolean.valueOf(false), true),
        UlikeBeautyCopied("ulike_beauty_model_copied", PropertyType.Boolean, Boolean.valueOf(false), true),
        EffectShareCopied("effect_share_copied", PropertyType.Boolean, Boolean.valueOf(false), true),
        EffectResourceVersion("effect_resource_version", PropertyType.Integer, Integer.valueOf(0), true),
        UlikeSharpenDefaultValue("ulike_sharpen_default_value", PropertyType.Float, Float.valueOf(0.05f), true),
        UlikeSmoothDefaultValue("ulike_smooth_default_value", PropertyType.Float, Float.valueOf(0.6f), true),
        UlikeShapeDefaultValue("ulike_shape_default_value", PropertyType.Float, Float.valueOf(0.5f), true),
        UlikeEyesDefaultValue("ulike_eyes_default_value", PropertyType.Float, Float.valueOf(0.3f), true),
        UlikeLipDefaultValue("ulike_lip_default_value", PropertyType.Float, Float.valueOf(0.3f), true),
        UlikeBlusherDefaultValue("ulike_blusher_default_value", PropertyType.Float, Float.valueOf(0.3f), true),
        UlikeSmoothMaxValue("ulike_smooth_max_value", PropertyType.Float, Float.valueOf(0.8f), true),
        UlikeShapeMaxValue("ulike_shape_max_value", PropertyType.Float, Float.valueOf(0.8f), true),
        UlikeEyesMaxValue("ulike_eyes_max_value", PropertyType.Float, Float.valueOf(0.5f), true),
        EnableBeautyMakeup("enable_beauty_makeup", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableBeautySharpen("enable_beauty_sharpen", PropertyType.Boolean, Boolean.valueOf(false), true),
        MALE_PROB_THRESHOLD("male_prob_threshold", PropertyType.Float, Float.valueOf(0.8f), true),
        DurationMode("duration_mode", PropertyType.Boolean, Boolean.valueOf(true), true),
        RecordCameraType("record_camera_type", PropertyType.Integer, Integer.valueOf(-1), true),
        InCamera2BlackList("in_camera2_black_list", PropertyType.Integer, Integer.valueOf(0), true),
        EnablePreUploadByUser("enable_pre_upload_by_user", PropertyType.Boolean, Boolean.valueOf(true), true),
        PreUploadMemoryLimit("pre_upload_memory_limit", PropertyType.Integer, Integer.valueOf(1600), true),
        IsLowMemoryMachine("is_low_memory_machine", PropertyType.Boolean, Boolean.valueOf(false), true),
        RecordUseSuccessCameraType("record_use_success_camera_type", PropertyType.Integer, Integer.valueOf(0), true),
        RecordUseSuccessRecordProfile("record_use_success_hardware_profile", PropertyType.Integer, Integer.valueOf(1), true),
        ReactionTipShow("reaction_tip_show", PropertyType.Boolean, Boolean.valueOf(false), true),
        ReactionWindowChangeTipShow("reaction_window_change_tip_show", PropertyType.Boolean, Boolean.valueOf(false), true),
        RecordCameraCompatLevel("record_camera_compat_level", PropertyType.Integer, Integer.valueOf(1), true),
        CanReact("can_react", PropertyType.Boolean, Boolean.valueOf(false), true),
        DefaultMicrophoneState("react_mic_status", PropertyType.Integer, Integer.valueOf(1), true),
        InEvening("in_evening", PropertyType.Integer, Integer.valueOf(0), false),
        EnableSdkLog("enable_sdk_log", PropertyType.Boolean, Boolean.valueOf(false), false),
        EnableUpdateMoji("enable_moji_update_resources", PropertyType.Boolean, Boolean.valueOf(true), true),
        UseLargeGestureDetectModel("enable_large_gesture_detect_model", PropertyType.Boolean, Boolean.valueOf(true), true),
        UseSmallGestureDetectModel("enable_small_gesture_detect_model", PropertyType.Boolean, Boolean.valueOf(true), true),
        UseLargeMattingModel("enable_large_matting_detect_model", PropertyType.Boolean, Boolean.valueOf(false), true),
        ReactDuetSettingCurrent("react_duet_setting", PropertyType.Integer, Integer.valueOf(2), true),
        ReactDuetSettingChanged("user_changed_setting", PropertyType.Boolean, Boolean.valueOf(false), true),
        ShowLockStickerPopupImg("show_lock_sticker_popup_img", PropertyType.Boolean, Boolean.valueOf(true), true),
        EnableWaterBgMask("enable_water_bg_mask", PropertyType.Boolean, Boolean.valueOf(false), true),
        CombinedShootModeTipShown("show_combine_shoot_mode_tip", PropertyType.Boolean, Boolean.valueOf(true), true),
        EnableCommerceUnlockStickerCollectTips("show_commerce_unlock_sticker_collect_tips", PropertyType.Boolean, Boolean.valueOf(true), true),
        ShowLockNewYearStickerPopupImg("new_year_show_lock_sticker_popup_img", PropertyType.Boolean, Boolean.valueOf(true), true),
        MusicCopyRightGranted("music_copyright_granted", PropertyType.Boolean, Boolean.valueOf(false), true),
        StoryImagePlayTime("story_image_play_time", PropertyType.Integer, Integer.valueOf(4000), true),
        ShowLastStoryFrame("show_last_story_frame", PropertyType.Boolean, Boolean.valueOf(true), true),
        MaxFansCount("max_fans_count", PropertyType.Integer, Integer.valueOf(0), true),
        WideCameraInfo("wide_camera_info", PropertyType.Integer, Integer.valueOf(-1), true),
        DefaultWideMode("default_wide_mode", PropertyType.Boolean, Boolean.valueOf(false), true),
        ShakeFreeWhiteList("shake_free_white_list", PropertyType.Integer, Integer.valueOf(-1), true),
        ShakeFreeDefaultMode("default_shake_free_mode", PropertyType.Boolean, Boolean.valueOf(false), true),
        ShutterSoundEnable("shutter_sound_enable", PropertyType.Boolean, Boolean.valueOf(false), true),
        FreeFLowCardUrl("free_flow_card_url_sticker", PropertyType.String, "", true),
        SpringEffectCacheController("life_effects_cold_req", PropertyType.Boolean, Boolean.valueOf(true), true),
        FolderInfo("folder_info", PropertyType.String, "", true),
        VideoDurationLimitMillisecond("video_duration_limit_ms", PropertyType.Long, Long.valueOf(1000), true),
        RecordTutorialLink("shoot_tutorial_link", PropertyType.String, "", true),
        EnableAutoRetryRecord("enable_auto_retry_record", PropertyType.Boolean, Boolean.valueOf(true), true),
        IsExportHqFrame("enable_hq_vframe", PropertyType.Boolean, Boolean.valueOf(false), true),
        FilterColors("filter_colors", PropertyType.String, "", true),
        UlikeBeautyDownloadEnable("enable_camera_beautify_effect", PropertyType.Boolean, Boolean.valueOf(false), true),
        ModelFileTestEnv("model_file_test_env", PropertyType.Boolean, Boolean.valueOf(false), true),
        Enable1080pFastImport("enable_1080p_fast_import", PropertyType.Integer, Integer.valueOf(0), true),
        EnableVESingleGL("enable_ve_single_gl", PropertyType.Integer, Integer.valueOf(0), true),
        StickerArtistIconUrl("sticker_artist_icon_url", PropertyType.String, "", true),
        VEFastImportIgnoreRecode("ve_fast_import_ignore_recode", PropertyType.Boolean, Boolean.valueOf(false), true),
        VEFastImportIgnoreRecodeForRotation("ve_fast_import_ignore_recode_for_rotation", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableUseVeCover("use_ve_image", PropertyType.Boolean, Boolean.valueOf(false), true),
        EnableVeCoverEffect("enable_cover_effect", PropertyType.Boolean, Boolean.valueOf(false), true),
        EffectSdkConfigSettings("effect_sdk_config_settings", PropertyType.String, "", true),
        EnableUseEffect("enable_use_effect", PropertyType.Boolean, Boolean.valueOf(true), true),
        PostDownloadSetting("post_download_setting", PropertyType.Boolean, Boolean.valueOf(false), true),
        StatusTabKey("status_tab_key", PropertyType.String, "", true),
        StatusLottieUrl("status_lottie_url", PropertyType.String, "", true),
        StatusPhoneType("status_phone_type", PropertyType.Integer, Integer.valueOf(2), true),
        EnableUseGameRotationSensor("enable_use_game_rotation_sensor", PropertyType.Boolean, Boolean.valueOf(true), true),
        ReviewVideoFastPublish("use_newyear_direct_upload", PropertyType.Boolean, Boolean.valueOf(false), false),
        VERuntimeConfig("ve_runtime_config", PropertyType.String, "", true),
        SATCameraType("sat_camera_type", PropertyType.Integer, Integer.valueOf(0), true),
        DraftUseMultiVideoEdit("draft_use_multi_video_edit", PropertyType.Boolean, Boolean.valueOf(false), true);
        
        private final Object defVal;
        private final String key;
        private final boolean supportPersist;
        private final PropertyType type;

        public final Object checkDefValue(PropertyType propertyType, Object obj) {
            return C36988s.m118987a(this, propertyType, obj);
        }

        public final Object defValue() {
            return this.defVal;
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

        private Property(String str, PropertyType propertyType, Object obj, boolean z) {
            Object checkDefValue = checkDefValue(propertyType, obj);
            this.key = str;
            this.type = propertyType;
            this.defVal = checkDefValue;
            this.supportPersist = z;
        }
    }

    /* renamed from: b */
    public final synchronized int mo93343b(Property property) {
        return this.f96807b.mo93363b(property);
    }

    /* renamed from: c */
    public final synchronized long mo93344c(Property property) {
        return this.f96807b.mo93364c(property);
    }

    /* renamed from: d */
    public final synchronized float mo93345d(Property property) {
        return this.f96807b.mo93365d(property);
    }

    /* renamed from: e */
    public final synchronized String mo93346e(Property property) {
        return this.f96807b.mo93366e(property);
    }

    /* renamed from: f */
    public final synchronized boolean mo93347f(Property property) {
        return this.f96807b.mo93367f(property);
    }

    /* renamed from: g */
    public final synchronized void mo93348g(Property property) {
        this.f96807b.mo93368g(property);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        mo93348g(com.p280ss.android.ugc.aweme.property.AVSettings.Property.SmoothSkinIndex);
        mo93348g(com.p280ss.android.ugc.aweme.property.AVSettings.Property.ReshapeIndex);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        mo93341a(com.p280ss.android.ugc.aweme.property.AVSettings.Property.EffectModelCopied, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        mo93341a(com.p280ss.android.ugc.aweme.property.AVSettings.Property.EffectModelCopied, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        mo93341a(com.p280ss.android.ugc.aweme.property.AVSettings.Property.EffectModelCopied, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        mo93341a(com.p280ss.android.ugc.aweme.property.AVSettings.Property.EffectModelCopied, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m118855a(int r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.content.SharedPreferences r0 = r4.f96806a     // Catch:{ all -> 0x005d }
            java.lang.String r1 = "_version_"
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x005d }
            if (r0 != 0) goto L_0x001b
            android.content.SharedPreferences r0 = r4.f96806a     // Catch:{ all -> 0x005d }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x005d }
            java.lang.String r1 = "_version_"
            r0.putInt(r1, r5)     // Catch:{ all -> 0x005d }
            r0.apply()     // Catch:{ all -> 0x005d }
            monitor-exit(r4)
            return
        L_0x001b:
            android.content.SharedPreferences r0 = r4.f96806a     // Catch:{ all -> 0x005d }
            java.lang.String r1 = "_version_"
            r2 = 0
            int r0 = r0.getInt(r1, r2)     // Catch:{ all -> 0x005d }
            if (r5 <= r0) goto L_0x0034
            android.content.SharedPreferences r1 = r4.f96806a     // Catch:{ all -> 0x005d }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x005d }
            java.lang.String r3 = "_version_"
            r1.putInt(r3, r5)     // Catch:{ all -> 0x005d }
            r1.apply()     // Catch:{ all -> 0x005d }
        L_0x0034:
            switch(r0) {
                case 1: goto L_0x0038;
                case 2: goto L_0x003d;
                case 3: goto L_0x0047;
                case 4: goto L_0x004c;
                case 5: goto L_0x0051;
                case 6: goto L_0x0056;
                default: goto L_0x0037;
            }     // Catch:{ all -> 0x005d }
        L_0x0037:
            goto L_0x005b
        L_0x0038:
            com.ss.android.ugc.aweme.property.AVSettings$Property r5 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.EffectModelCopied     // Catch:{ all -> 0x005d }
            r4.mo93341a(r5, r2)     // Catch:{ all -> 0x005d }
        L_0x003d:
            com.ss.android.ugc.aweme.property.AVSettings$Property r5 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.SmoothSkinIndex     // Catch:{ all -> 0x005d }
            r4.mo93348g(r5)     // Catch:{ all -> 0x005d }
            com.ss.android.ugc.aweme.property.AVSettings$Property r5 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.ReshapeIndex     // Catch:{ all -> 0x005d }
            r4.mo93348g(r5)     // Catch:{ all -> 0x005d }
        L_0x0047:
            com.ss.android.ugc.aweme.property.AVSettings$Property r5 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.EffectModelCopied     // Catch:{ all -> 0x005d }
            r4.mo93341a(r5, r2)     // Catch:{ all -> 0x005d }
        L_0x004c:
            com.ss.android.ugc.aweme.property.AVSettings$Property r5 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.EffectModelCopied     // Catch:{ all -> 0x005d }
            r4.mo93341a(r5, r2)     // Catch:{ all -> 0x005d }
        L_0x0051:
            com.ss.android.ugc.aweme.property.AVSettings$Property r5 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.EffectModelCopied     // Catch:{ all -> 0x005d }
            r4.mo93341a(r5, r2)     // Catch:{ all -> 0x005d }
        L_0x0056:
            com.ss.android.ugc.aweme.property.AVSettings$Property r5 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.EffectModelCopied     // Catch:{ all -> 0x005d }
            r4.mo93341a(r5, r2)     // Catch:{ all -> 0x005d }
        L_0x005b:
            monitor-exit(r4)
            return
        L_0x005d:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.property.AVSettings.m118855a(int):void");
    }

    /* renamed from: a */
    public final synchronized boolean mo93342a(Property property) {
        return this.f96807b.mo93362a(property);
    }

    /* renamed from: a */
    public final synchronized void mo93337a(Property property, float f) {
        this.f96807b.mo93357a((C36952a) property, f);
    }

    public AVSettings(Context context, int i) {
        this.f96806a = C7285c.m22838a(context, "av_settings.xml", 0);
        m118855a(7);
    }

    /* renamed from: a */
    public final synchronized void mo93338a(Property property, int i) {
        this.f96807b.mo93358a((C36952a) property, i);
    }

    /* renamed from: a */
    public final synchronized void mo93339a(Property property, long j) {
        this.f96807b.mo93359a((C36952a) property, j);
    }

    /* renamed from: a */
    public final synchronized void mo93340a(Property property, String str) {
        this.f96807b.mo93360a((C36952a) property, str);
    }

    /* renamed from: a */
    public final synchronized void mo93341a(Property property, boolean z) {
        this.f96807b.mo93361a((C36952a) property, z);
    }
}
