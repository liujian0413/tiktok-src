package com.p280ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.p022v4.p027os.C0879b;
import android.text.TextUtils;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.base.C17462u;
import com.google.common.util.concurrent.C18245g;
import com.google.gson.C6600e;
import com.google.gson.JsonIOException;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p280ss.android.medialib.camera.C19667g;
import com.p280ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo;
import com.p280ss.android.ugc.aweme.base.C23364n;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.beauty.C23531b;
import com.p280ss.android.ugc.aweme.beauty.C23536f;
import com.p280ss.android.ugc.aweme.effect.C27431j;
import com.p280ss.android.ugc.aweme.festival.FestivalPublishData;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1048ax.C23139a;
import com.p280ss.android.ugc.aweme.photo.p1451a.C34727a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.p280ss.android.ugc.aweme.shortvideo.api.C38456a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39501aw;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39526e;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.C39438b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C39604b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractTrackPage;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.C39608b;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40231c;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41452h;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41555i;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41558k;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42046i;
import com.p280ss.android.ugc.aweme.utils.C43131fk;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.VEWatermarkParam;
import dmt.p1861av.video.C47468m;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ev */
public final class C39815ev {

    /* renamed from: a */
    public static final ExecutorService f103488a = C39820ex.m127492a(C39819ew.f103493a);

    /* renamed from: a */
    public final void mo99237a(VideoPublishEditModel videoPublishEditModel, LinkedHashMap<String, String> linkedHashMap) {
        String str;
        String str2;
        float f;
        int i;
        if (!TextUtils.isEmpty(videoPublishEditModel.reviewVideoId)) {
            if (C39360dw.m125725a().f102246a != null && !TextUtils.isEmpty(C39360dw.m125725a().f102246a.mid)) {
                linkedHashMap.put("music_id", C39360dw.m125725a().f102246a.mid);
            }
        } else if (!TextUtils.isEmpty(videoPublishEditModel.musicId)) {
            linkedHashMap.put("music_id", videoPublishEditModel.musicId);
        }
        linkedHashMap.put("original", String.valueOf(videoPublishEditModel.getOriginal()));
        if (!TextUtils.isEmpty(videoPublishEditModel.creationId)) {
            linkedHashMap.put("creation_id", videoPublishEditModel.creationId);
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.ccVid)) {
            linkedHashMap.put("cc_vid", videoPublishEditModel.ccVid);
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.getSpeed())) {
            linkedHashMap.put("speed", videoPublishEditModel.getSpeed());
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.getStickers())) {
            linkedHashMap.put("stickers", videoPublishEditModel.getStickers());
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.getFilterName())) {
            linkedHashMap.put("filter_name", videoPublishEditModel.getFilterName());
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.getFilterIds())) {
            linkedHashMap.put("filter_id", videoPublishEditModel.getFilterIds());
        }
        linkedHashMap.put("camera", String.valueOf(videoPublishEditModel.getCamera()));
        linkedHashMap.put("prettify", String.valueOf(videoPublishEditModel.getPrettify()));
        ArrayList arrayList = new ArrayList();
        if (C6311g.m19574b(videoPublishEditModel.mEffectList)) {
            arrayList.addAll(videoPublishEditModel.mEffectList);
        }
        if (videoPublishEditModel.mTimeEffect != null) {
            arrayList.add(videoPublishEditModel.mTimeEffect);
        }
        if (C6311g.m19574b(arrayList)) {
            linkedHashMap.put("fx_name", C27431j.m89897b(arrayList));
            linkedHashMap.put("effect_id", C27431j.m89893a(arrayList));
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.mId3Author)) {
            linkedHashMap.put("author", videoPublishEditModel.mId3Author);
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.mId3Title)) {
            linkedHashMap.put("title", videoPublishEditModel.mId3Title);
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.mId3Album)) {
            linkedHashMap.put("album", videoPublishEditModel.mId3Album);
        }
        if (videoPublishEditModel.mMusicType > 0) {
            linkedHashMap.put("music_type", String.valueOf(videoPublishEditModel.mMusicType));
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.getDuetFrom())) {
            linkedHashMap.put("duet_from", videoPublishEditModel.getDuetFrom());
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.shopDraftId)) {
            linkedHashMap.put("shop_draft_id", videoPublishEditModel.shopDraftId);
        }
        linkedHashMap.put("is_upload_audio_track", String.valueOf(videoPublishEditModel.shouldUploadOriginalSound()));
        linkedHashMap.put("is_multi_video_upload", String.valueOf(videoPublishEditModel.mIsMultiVideo));
        boolean z = true;
        if (videoPublishEditModel.recordMode == 1) {
            linkedHashMap.put("game_type", String.valueOf(videoPublishEditModel.recordMode));
            linkedHashMap.put("game_score", String.valueOf(videoPublishEditModel.gameScore));
        }
        linkedHashMap.put("use_camera_type", String.valueOf(C41558k.m132341a()));
        linkedHashMap.put("h264_high_profile", String.valueOf(C35563c.f93230L.mo93343b(Property.RecordUseSuccessRecordProfile)));
        linkedHashMap.put("camera_compat_level", String.valueOf(C19667g.m64797b().mo52342o()));
        if (!TextUtils.isEmpty(videoPublishEditModel.mEyesLabels)) {
            linkedHashMap.put("eye", videoPublishEditModel.mEyesLabels);
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.mReshapeLabels)) {
            linkedHashMap.put("shape", videoPublishEditModel.mReshapeLabels);
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.mTanningLabels)) {
            linkedHashMap.put("tanning", videoPublishEditModel.mTanningLabels);
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.mSmoothSkinLabels)) {
            linkedHashMap.put("smooth", videoPublishEditModel.mSmoothSkinLabels);
        }
        if (C6311g.m19574b(videoPublishEditModel.importInfoList)) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = videoPublishEditModel.importInfoList.iterator();
            while (it.hasNext()) {
                ImportVideoInfo importVideoInfo = (ImportVideoInfo) it.next();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("h", importVideoInfo.getVideoHeight());
                    jSONObject.put("w", importVideoInfo.getVideoWidth());
                    jSONObject.put("b", importVideoInfo.getBitRate());
                    jSONObject.put("e", importVideoInfo.getEncodeId());
                    jSONArray.put(jSONObject);
                } catch (JSONException unused) {
                }
            }
            linkedHashMap.put("import_video_info", jSONArray.toString());
        }
        if (videoPublishEditModel.getReactionParams() != null && !TextUtils.isEmpty(videoPublishEditModel.getReactionParams().reactionFromId)) {
            linkedHashMap.put("react_from", videoPublishEditModel.getReactionParams().reactionFromId);
            if (!TextUtils.isEmpty(videoPublishEditModel.getReactionParams().reactionOriginId)) {
                linkedHashMap.put("react_origin", videoPublishEditModel.getReactionParams().reactionOriginId);
            }
            if (!TextUtils.isEmpty(videoPublishEditModel.getReactionParams().reactionViewId)) {
                linkedHashMap.put("react_view", videoPublishEditModel.getReactionParams().reactionViewId);
            }
            C6600e eVar = C35563c.f93239b;
            if (C6311g.m19574b(videoPublishEditModel.getReactionParams().windowInfoList)) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                for (ReactionWindowInfo reactionWindowInfo : videoPublishEditModel.getReactionParams().windowInfoList) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(reactionWindowInfo.getWidth());
                    arrayList2.add(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(reactionWindowInfo.getHeight());
                    arrayList3.add(sb2.toString());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(reactionWindowInfo.getAngle());
                    arrayList4.add(sb3.toString());
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(reactionWindowInfo.getType());
                    arrayList5.add(sb4.toString());
                }
                linkedHashMap.put("react_width", eVar.mo15979b((Object) arrayList2));
                linkedHashMap.put("react_height", eVar.mo15979b((Object) arrayList3));
                linkedHashMap.put("react_angle", eVar.mo15979b((Object) arrayList4));
                linkedHashMap.put("react_type", eVar.mo15979b((Object) arrayList5));
            }
        }
        linkedHashMap.put("music_begin_time", String.valueOf(videoPublishEditModel.mMusicStart));
        linkedHashMap.put("music_end_time", String.valueOf(videoPublishEditModel.mMusicStart + videoPublishEditModel.getVideoLength()));
        if (videoPublishEditModel.hasInfoStickers()) {
            linkedHashMap.put("info_sticker", videoPublishEditModel.infoStickerModel.getInfoStickerIds());
            linkedHashMap.put("other_sticker", videoPublishEditModel.infoStickerModel.getOtherEffect());
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.mMusicOrigin)) {
            linkedHashMap.put("music_selected_from", String.valueOf(videoPublishEditModel.mMusicOrigin));
            if ("edit_page_recommend".equals(videoPublishEditModel.mMusicOrigin)) {
                linkedHashMap.put("music_show_rank", String.valueOf(videoPublishEditModel.mMusicShowRank));
                linkedHashMap.put("music_rec_type", String.valueOf(videoPublishEditModel.mMusicRecType));
            }
        }
        if (videoPublishEditModel.getMainBusinessContext() != null) {
            Collection a = C39604b.m126713a(videoPublishEditModel.getMainBusinessContext(), InteractTrackPage.TRACK_PAGE_EDIT);
            if (!C6307b.m19566a(a)) {
                m127481a(videoPublishEditModel, a);
                linkedHashMap.put("interaction_stickers", C35563c.f93220B.getRetrofitFactoryGson().mo15979b((Object) a));
            }
            StringBuilder sb5 = new StringBuilder();
            if (linkedHashMap.containsKey("info_sticker")) {
                String str3 = (String) linkedHashMap.get("info_sticker");
                if (!C6319n.m19593a(str3)) {
                    sb5.append(str3);
                }
            }
            String a2 = C39604b.m126709a(videoPublishEditModel.getMainBusinessContext());
            if (sb5.length() == 0) {
                sb5.append(a2);
            } else {
                sb5.append(",");
                sb5.append(a2);
            }
            linkedHashMap.put("info_sticker", sb5.toString());
        }
        if (C39604b.m126716a(videoPublishEditModel)) {
            linkedHashMap.put("aweme_type", "54");
        } else if (videoPublishEditModel.isMvThemeVideoType()) {
            linkedHashMap.put("aweme_type", "53");
        } else if (videoPublishEditModel.isStickPointMode) {
            linkedHashMap.put("aweme_type", "55");
            String str4 = (String) linkedHashMap.get("video_id");
            String a3 = C39182e.m125091a();
            if (videoPublishEditModel.stickPointData != null && C39182e.m125103f()) {
                if (TextUtils.isEmpty(videoPublishEditModel.stickPointData.getAiCutId()) && !TextUtils.isEmpty(a3)) {
                    videoPublishEditModel.stickPointData.setAiCutId(a3);
                }
                if (!TextUtils.isEmpty(videoPublishEditModel.stickPointData.getAiCutId())) {
                    videoPublishEditModel.stickPointData.setVideoId(str4);
                    linkedHashMap.put("stick_point_data", C35563c.f93239b.mo15979b((Object) videoPublishEditModel.stickPointData));
                }
            }
        } else if (videoPublishEditModel.isStatusVideoType()) {
            linkedHashMap.put("aweme_type", "56");
        }
        if (videoPublishEditModel.statusCreateVideoData != null) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(videoPublishEditModel.statusCreateVideoData.getBgSize());
            linkedHashMap.put("status_background_size", sb6.toString());
            StringBuilder sb7 = new StringBuilder();
            sb7.append(videoPublishEditModel.statusCreateVideoData.getBgHeight());
            linkedHashMap.put("status_background_height", sb7.toString());
            StringBuilder sb8 = new StringBuilder();
            sb8.append(videoPublishEditModel.statusCreateVideoData.getBgHeight());
            linkedHashMap.put("status_background_width", sb8.toString());
            linkedHashMap.put("status_template_text", videoPublishEditModel.statusCreateVideoData.getTemplateText());
            linkedHashMap.put("status_user_text", videoPublishEditModel.statusCreateVideoData.getUserText());
            int length = videoPublishEditModel.statusCreateVideoData.getUserText().length();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(length);
            linkedHashMap.put("status_text_length", sb9.toString());
            linkedHashMap.put("status_background_id", videoPublishEditModel.statusCreateVideoData.getBgId());
            linkedHashMap.put("status_background_selected_from", videoPublishEditModel.statusCreateVideoData.getBgFrom());
        }
        String a4 = C41452h.m132105a(videoPublishEditModel);
        if (!TextUtils.isEmpty(a4)) {
            linkedHashMap.put("source_info", a4);
        }
        int i2 = (videoPublishEditModel.veAudioRecorderParam == null || !videoPublishEditModel.veAudioRecorderParam.hasRecord()) ? 0 : 1;
        StringBuilder sb10 = new StringBuilder();
        sb10.append(i2);
        linkedHashMap.put("is_dubbed", sb10.toString());
        String a5 = C39438b.m125962a(videoPublishEditModel);
        if (!TextUtils.isEmpty(a5)) {
            linkedHashMap.put("voice_modify_id", a5);
        }
        if (videoPublishEditModel.videoCategory != null) {
            linkedHashMap.put("category", String.valueOf(videoPublishEditModel.videoCategory.getCategoryIndex()));
        }
        m127483b(videoPublishEditModel, linkedHashMap);
        FestivalPublishData a6 = C39526e.m126243a(videoPublishEditModel);
        if (a6 != null && !TextUtils.isEmpty(a6.getDiamondGameId())) {
            if (videoPublishEditModel.uploadMiscInfoStruct == null) {
                videoPublishEditModel.uploadMiscInfoStruct = new AVUploadMiscInfoStruct();
            }
            videoPublishEditModel.uploadMiscInfoStruct.diamondGameId = a6.getDiamondGameId();
            linkedHashMap.put("is_spring", "1");
        }
        if (videoPublishEditModel.uploadMiscInfoStruct != null) {
            try {
                String b = new C6600e().mo15979b((Object) videoPublishEditModel.uploadMiscInfoStruct);
                if (!TextUtils.isEmpty(b)) {
                    linkedHashMap.put("misc_info", b);
                }
            } catch (Exception unused2) {
            }
        }
        if (C6311g.m19574b(videoPublishEditModel.faceId)) {
            linkedHashMap.put("moji_feature", C35563c.f93239b.mo15979b((Object) videoPublishEditModel.faceId));
        }
        linkedHashMap.put("countdown_list", videoPublishEditModel.countDownModes != null ? videoPublishEditModel.countDownModes.toString() : "");
        linkedHashMap.put("is_music_looped", String.valueOf(C35563c.f93231M.mo93305a(AVAB.Property.RearMusicAutoLoop) ? 1 : 0));
        linkedHashMap.put("text_fonts", videoPublishEditModel.textTypes != null ? videoPublishEditModel.textTypes : "");
        linkedHashMap.put("is_subtitled", videoPublishEditModel.hasSubtitle() ? "1" : "0");
        linkedHashMap.put("has_text", videoPublishEditModel.hasText() ? "1" : "0");
        if (videoPublishEditModel.mentionEditTextLength >= 0) {
            StringBuilder sb11 = new StringBuilder();
            sb11.append(videoPublishEditModel.mentionEditTextLength);
            linkedHashMap.put("caption_word_cnt", sb11.toString());
        }
        if (C35563c.f93231M.mo93305a(AVAB.Property.EnableFilterIntensityJust)) {
            if (videoPublishEditModel.mSelectedId == 0) {
                i = videoPublishEditModel.mRecordVideoSelectedFilterIndex;
                f = videoPublishEditModel.mRecordVideoSelectedFilterIntensity;
            } else {
                i = videoPublishEditModel.mSelectedId;
                f = videoPublishEditModel.mSelectedFilterIntensity;
            }
            StringBuilder sb12 = new StringBuilder();
            sb12.append(f);
            linkedHashMap.put("filter_value", sb12.toString());
            C29296g a7 = C35563c.f93224F.mo70097l().mo74949b().mo74962a(i);
            if (((double) Math.abs(a7.f77275j - f)) >= 0.01d && a7.f77275j != -1.0f) {
                z = false;
            }
            linkedHashMap.put("is_original_filter", z ? "1" : "0");
        }
        linkedHashMap.put("beautify_info", C35574k.m114859a().mo70085S().mo15979b((Object) C23531b.m77285a()));
        linkedHashMap.put("beautify_used", String.valueOf(C23531b.m77286b()));
        linkedHashMap.put("is_composer", C23536f.m77298a() ? "1" : "0");
        linkedHashMap.put("fast_import", videoPublishEditModel.isFastImport ? "1" : "0");
        String str5 = "music_volume";
        if (videoPublishEditModel.mMusicPath == null) {
            str = "";
        } else {
            StringBuilder sb13 = new StringBuilder();
            sb13.append((int) (videoPublishEditModel.musicVolume * 100.0f));
            str = sb13.toString();
        }
        linkedHashMap.put(str5, str);
        String str6 = "origin_volume";
        if (videoPublishEditModel.getWavFile() == null) {
            str2 = "";
        } else {
            StringBuilder sb14 = new StringBuilder();
            sb14.append((int) (videoPublishEditModel.voiceVolume * 100.0f));
            str2 = sb14.toString();
        }
        linkedHashMap.put(str6, str2);
        linkedHashMap.put("improve_status", videoPublishEditModel.autoEnhanceOn ? "1" : "0");
        if (videoPublishEditModel.poiServerMobParam != null) {
            linkedHashMap.putAll(videoPublishEditModel.poiServerMobParam);
        }
        linkedHashMap.put("is_trimmed", videoPublishEditModel.isUseMultiEdit() ? "1" : "0");
        if (!TextUtils.isEmpty(videoPublishEditModel.getPropGradeKey())) {
            linkedHashMap.put("grade_prop_list", videoPublishEditModel.getPropGradeKey());
        }
    }

    /* renamed from: b */
    public final Bitmap mo99238b(Object obj) {
        return m127478a((VideoPublishEditModel) obj);
    }

    /* renamed from: a */
    static final /* synthetic */ Thread m127480a(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("sdk-synthetise");
        return thread;
    }

    /* renamed from: c */
    public static long m127484c(Object obj) {
        return new File(((VideoPublishEditModel) obj).mOutputFile).length();
    }

    /* renamed from: a */
    public final C39359dv<SynthetiseResult> mo99234a(Object obj) {
        return m127479a((VideoPublishEditModel) obj, new C0879b(), false);
    }

    /* renamed from: a */
    private static Bitmap m127478a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isMvThemeVideoType()) {
            String str = videoPublishEditModel.mvCreateVideoData.videoCoverImgPath;
            if (C7276d.m22812b(str)) {
                return C41555i.m132333a(str, 90, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED);
            }
        }
        if (videoPublishEditModel.isStatusVideoType()) {
            String videoCoverImgPath = videoPublishEditModel.statusCreateVideoData.getVideoCoverImgPath();
            if (C7276d.m22812b(videoCoverImgPath)) {
                return C41555i.m132333a(videoCoverImgPath, 90, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED);
            }
        }
        if (videoPublishEditModel.isMultiVideoEdit()) {
            String str2 = videoPublishEditModel.multiEditVideoRecordData.coverImagePath;
            if (C7276d.m22812b(str2)) {
                return C41555i.m132333a(str2, 90, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED);
            }
        }
        String validVideoCoverPath = videoPublishEditModel.getValidVideoCoverPath();
        if (validVideoCoverPath != null) {
            return C41555i.m132333a(validVideoCoverPath, 90, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED);
        }
        C43131fk.m136816a();
        return C43131fk.m136815a(videoPublishEditModel.videoPath(), 90, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, 1);
    }

    /* renamed from: d */
    public static boolean m127485d(Object obj) {
        boolean z;
        String str;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        if (!videoPublishEditModel.isSaveLocal()) {
            return false;
        }
        String localTempPath = videoPublishEditModel.getLocalTempPath();
        boolean isSaveToLocalPathInsteadOfAlbum = videoPublishEditModel.isSaveToLocalPathInsteadOfAlbum();
        if (videoPublishEditModel.isSaveToAlbum() || !isSaveToLocalPathInsteadOfAlbum) {
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.isEmpty(localTempPath) || !new File(localTempPath).exists() || new File(localTempPath).length() <= 0) {
            return false;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(C23139a.m76055a(C35563c.f93238a));
            sb.append(new File(localTempPath).getName());
            str = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C35563c.f93259v.mo83146a((Context) C35563c.f93238a));
            sb2.append(new File(localTempPath).getName());
            str = sb2.toString();
        }
        C7276d.m22820d(localTempPath, str);
        videoPublishEditModel.mSaveModel.setLocalFinalPath(str);
        if (z) {
            C34727a.m112060a(C35563c.f93238a, str);
        }
        return true;
    }

    /* renamed from: a */
    private static void m127482a(LinkedHashMap<String, String> linkedHashMap, int i) {
        if (C35563c.f93230L.mo93342a(Property.PostDownloadSetting) && C35563c.f93231M.mo93306b(AVAB.Property.EnablePublishPrivacySetting) == 2) {
            linkedHashMap.put("item_download", String.valueOf(i));
        }
    }

    /* renamed from: b */
    private static void m127483b(VideoPublishEditModel videoPublishEditModel, LinkedHashMap<String, String> linkedHashMap) {
        float f;
        if (videoPublishEditModel.isMvThemeVideoType()) {
            f = ((float) videoPublishEditModel.mvCreateVideoData.videoCoverStartTime) / 1000.0f;
        } else {
            f = videoPublishEditModel.mVideoCoverStartTm;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f);
        linkedHashMap.put("cover_tsp", sb.toString());
    }

    /* renamed from: a */
    private void m127481a(VideoPublishEditModel videoPublishEditModel, Collection<InteractStickerStruct> collection) {
        if (videoPublishEditModel != null && !C6307b.m19566a(collection) && C39501aw.m126169b(videoPublishEditModel)) {
            for (InteractStickerStruct interactStickerStruct : collection) {
                List<NormalTrackTimeStamp> list = null;
                try {
                    list = (List) C35563c.f93220B.getRetrofitFactoryGson().mo15975a(interactStickerStruct.getTrackList(), new C6597a<List<NormalTrackTimeStamp>>() {
                    }.type);
                } catch (Exception unused) {
                }
                if (C6311g.m19574b(list)) {
                    for (NormalTrackTimeStamp normalTrackTimeStamp : list) {
                        if (normalTrackTimeStamp != null) {
                            float[] a = C39501aw.m126168a(normalTrackTimeStamp.getX(), normalTrackTimeStamp.getY(), videoPublishEditModel.mVideoCanvasWidth, videoPublishEditModel.mVideoCanvasHeight, videoPublishEditModel.mOutVideoWidth, videoPublishEditModel.mOutVideoHeight);
                            normalTrackTimeStamp.setX(C39608b.m126723b(a[0]));
                            normalTrackTimeStamp.setY(C39608b.m126723b(a[1]));
                        }
                    }
                    try {
                        interactStickerStruct.setTrackList(C35563c.f93239b.mo15979b((Object) list));
                    } catch (JsonIOException unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private C39359dv<SynthetiseResult> m127479a(VideoPublishEditModel videoPublishEditModel, C0879b bVar, boolean z) {
        VEWatermarkParam vEWatermarkParam;
        int i = 2;
        if (videoPublishEditModel.isSaveLocalWithWaterMark()) {
            final int[] a = C47468m.m148189a(videoPublishEditModel);
            int saveType = videoPublishEditModel.mSaveModel.getSaveType();
            boolean a2 = C39799ej.m127420a(saveType);
            vEWatermarkParam = ((IWaterMarkService) ServiceManager.get().getService(IWaterMarkService.class)).watermarkParamBuilderService().createWatermark(saveType, videoPublishEditModel.getLocalTempPath(), C35563c.f93260w.mo57092e(), a, true, videoPublishEditModel.getLocalTempPath(), a2);
            if (a2 && vEWatermarkParam != null) {
                int i2 = a[1] - a[0];
                if (i2 > 0) {
                    vEWatermarkParam.yOffset += i2 / 2;
                }
            }
            if (vEWatermarkParam == null) {
                return new C39359dv<SynthetiseResult>() {
                    {
                        StringBuilder sb = new StringBuilder("add water failed, context is ");
                        sb.append(a[0]);
                        sb.append(" ");
                        sb.append(a[1]);
                        mo47087a((Throwable) new SynthetiseException(sb.toString(), new SynthetiseResult()));
                    }
                };
            }
        } else {
            vEWatermarkParam = null;
        }
        C35563c.m114839f();
        if (videoPublishEditModel.mSaveModel == null || videoPublishEditModel.mSaveModel.getSaveType() != 1) {
            i = 0;
        }
        return new C47468m(i).mo119591a(videoPublishEditModel, vEWatermarkParam, bVar);
    }

    /* renamed from: a */
    public final C39359dv<SynthetiseResult> mo99235a(Object obj, C0879b bVar, boolean z) {
        C39359dv<SynthetiseResult> a = m127479a((VideoPublishEditModel) obj, bVar, z);
        a.mo47111a(new C18245g<SynthetiseResult>() {
            public final /* synthetic */ void onSuccess(Object obj) {
                m127491a((SynthetiseResult) obj);
            }

            public final void onFailure(Throwable th) {
                C39913g a = C39913g.m127678a();
                StringBuilder sb = new StringBuilder("synthetise failed\n");
                sb.append(C17462u.m58024b(th));
                a.mo99319a(sb.toString());
            }

            /* renamed from: a */
            private static void m127491a(SynthetiseResult synthetiseResult) {
                C39913g a = C39913g.m127678a();
                StringBuilder sb = new StringBuilder("synthetise success ");
                sb.append(synthetiseResult.outputFile);
                a.mo99319a(sb.toString());
                if (synthetiseResult.outputFile != null) {
                    C39913g a2 = C39913g.m127678a();
                    StringBuilder sb2 = new StringBuilder(" size: ");
                    sb2.append(new File(synthetiseResult.outputFile).length());
                    a2.mo99319a(sb2.toString());
                    return;
                }
                C39913g.m127678a().mo99319a("output file == null");
            }
        }, C23364n.f61448a);
        return a;
    }

    /* renamed from: a */
    public final void mo99236a(BaseShortVideoContext baseShortVideoContext, SynthetiseResult synthetiseResult, LinkedHashMap<String, String> linkedHashMap) {
        int[] a;
        C6600e eVar = C35563c.f93239b;
        if (baseShortVideoContext.challenges != null && !baseShortVideoContext.challenges.isEmpty()) {
            ArrayList arrayList = new ArrayList(baseShortVideoContext.challenges.size());
            for (AVChallenge cid : baseShortVideoContext.challenges) {
                arrayList.add(cid.getCid());
            }
            linkedHashMap.put("challenge_list", eVar.mo15979b((Object) arrayList));
        }
        if (baseShortVideoContext.title != null) {
            linkedHashMap.put("text", baseShortVideoContext.title);
        }
        if (baseShortVideoContext.structList != null && !baseShortVideoContext.structList.isEmpty()) {
            String b = eVar.mo15979b((Object) baseShortVideoContext.structList);
            if (b.contains("hashTagName")) {
                b = b.replaceAll("hashTagName", "hashtag_name");
            }
            linkedHashMap.put("text_extra", b);
        }
        if (!TextUtils.isEmpty(baseShortVideoContext.city)) {
            linkedHashMap.put("city", baseShortVideoContext.city);
        }
        if (!TextUtils.isEmpty(baseShortVideoContext.longitude)) {
            linkedHashMap.put("longitude", baseShortVideoContext.longitude);
        }
        if (!TextUtils.isEmpty(baseShortVideoContext.latitude)) {
            linkedHashMap.put("latitude", baseShortVideoContext.latitude);
        }
        linkedHashMap.put("is_private", String.valueOf(baseShortVideoContext.isPrivate));
        linkedHashMap.put("is_hash_tag", "1");
        if (!TextUtils.isEmpty(baseShortVideoContext.mSyncPlatforms)) {
            for (int i : C38456a.m122938a(baseShortVideoContext.mSyncPlatforms)) {
                if (i != 100) {
                    switch (i) {
                        case 0:
                            linkedHashMap.put("sync_to_hotsoon", "1");
                            break;
                        case 1:
                            linkedHashMap.put("sync_to_toutiao", "1");
                            break;
                    }
                } else {
                    linkedHashMap.put("sync_to_helo", "1");
                }
            }
        }
        if (!TextUtils.isEmpty(baseShortVideoContext.mShootWay)) {
            linkedHashMap.put("shoot_way", baseShortVideoContext.mShootWay);
        }
        if (!TextUtils.isEmpty(baseShortVideoContext.getPropSource())) {
            linkedHashMap.put("prop_selected_from", baseShortVideoContext.getPropSource());
        }
        linkedHashMap.put("is_hard_code", String.valueOf(synthetiseResult.getReportHardEncode()));
        if (!TextUtils.isEmpty(synthetiseResult.cpuName)) {
            linkedHashMap.put("cpu_info", synthetiseResult.cpuName);
        }
        if (!TextUtils.isEmpty(synthetiseResult.gpuName)) {
            linkedHashMap.put("gpu_info", synthetiseResult.gpuName);
        }
        linkedHashMap.put("file_fps", String.valueOf(synthetiseResult.fileFps));
        linkedHashMap.put("item_comment", String.valueOf(baseShortVideoContext.commentSetting));
        if (C6399b.m19944t()) {
            linkedHashMap.put("item_react", String.valueOf(baseShortVideoContext.reactDuetSetting));
            linkedHashMap.put("item_duet", String.valueOf(baseShortVideoContext.reactDuetSetting));
            m127482a(linkedHashMap, baseShortVideoContext.allowDownloadSetting);
        }
        for (C40231c a2 : C35563c.f93257t.mo83283b()) {
            a2.mo64277a(baseShortVideoContext, linkedHashMap);
        }
        if (!C23477d.m77081a((Collection<T>) baseShortVideoContext.arTextList)) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = baseShortVideoContext.arTextList.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            String jSONArray2 = jSONArray.toString();
            if (!TextUtils.isEmpty(jSONArray2)) {
                linkedHashMap.put("ar_text", jSONArray2);
            }
        }
        JSONArray jSONArray3 = new JSONArray();
        if (!C23477d.m77081a((Collection<T>) baseShortVideoContext.messageBubbleTexts)) {
            JSONArray jSONArray4 = new JSONArray();
            Iterator it2 = baseShortVideoContext.messageBubbleTexts.iterator();
            while (it2.hasNext()) {
                jSONArray4.put((String) it2.next());
            }
            try {
                jSONArray3.put(new JSONObject().put("type", 1).put("data", jSONArray4));
            } catch (JSONException unused) {
            }
        }
        C42046i.m133658a(baseShortVideoContext, jSONArray3);
        C42046i.m133661b(baseShortVideoContext, jSONArray3);
        if (!TextUtils.isEmpty(baseShortVideoContext.getMainBusinessData())) {
            if (!C6307b.m19566a(C39604b.m126712a(baseShortVideoContext, InteractTrackPage.TRACK_PAGE_EDIT))) {
                InteractStickerStruct a3 = C39604b.m126706a(baseShortVideoContext, 1, InteractTrackPage.TRACK_PAGE_EDIT);
                if (!(a3 == null || a3.getVoteStruct() == null)) {
                    try {
                        jSONArray3.put(new JSONObject().put("type", 3).put("data", new JSONObject(C35563c.f93220B.getRetrofitFactoryGson().mo15979b((Object) C39604b.m126705a(a3.getVoteStruct())))));
                    } catch (JSONException unused2) {
                    }
                }
            }
        }
        if (jSONArray3.length() != 0) {
            linkedHashMap.put("sticker_text", jSONArray3.toString());
        }
    }
}
