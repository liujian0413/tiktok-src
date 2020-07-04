package com.p280ss.android.ugc.aweme.shortvideo.p1550b;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.alibaba.fastjson.JSON;
import com.bytedance.common.utility.p481c.C9721b;
import com.p280ss.android.ugc.aweme.draft.model.DraftUpdateService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import com.p280ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.utils.C43009cd;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.b.a */
public final class C38505a {
    /* renamed from: a */
    public static void m123080a(String str, AVMusic aVMusic, int i) {
        float[] musicWaveData;
        Editor edit = C7285c.m22838a(C35563c.f93238a, "publish", 0).edit();
        edit.putString("music_path", str);
        String str2 = "";
        if (aVMusic != null) {
            try {
                str2 = JSON.toJSONString(aVMusic);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                if (aVMusic.getMusicWaveData() != null) {
                    for (float f : aVMusic.getMusicWaveData()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(f);
                        sb2.append(",");
                        sb.append(sb2.toString());
                    }
                }
                StringBuilder sb3 = new StringBuilder("music id:");
                sb3.append(aVMusic.getMusicId());
                sb3.append("; music name:");
                sb3.append(aVMusic.getName());
                sb3.append("; music wave data:");
                sb3.append(sb.toString());
                C41530am.m132280a(sb3.toString());
                throw e;
            }
        }
        edit.putString("music_model", str2);
        edit.putInt("music_start", i);
        C9721b.m28656a(edit);
    }

    /* renamed from: a */
    public static void m123082a(ArrayList<TimeSpeedModelExtension> arrayList) {
        Editor edit = C7285c.m22838a(C35563c.f93238a, "publish", 0).edit();
        edit.putString("segment_video", ShortVideoContext.m122681a(arrayList));
        C9721b.m28656a(edit);
    }

    /* renamed from: a */
    public static void m123081a(String str, String str2) {
        Editor edit = C7285c.m22838a(C35563c.f93238a, "publish", 0).edit();
        edit.putString("filter_labels", str);
        edit.putString("filter_ids", str2);
        C9721b.m28656a(edit);
    }

    /* renamed from: a */
    public static void m123083a(Map<String, Object> map) {
        if (map != null && !map.isEmpty()) {
            Editor edit = C7285c.m22838a(C35563c.f93238a, "publish", 0).edit();
            edit.putString("video_record_metadata", C43009cd.m136508a(map));
            C9721b.m28656a(edit);
        }
    }

    /* renamed from: a */
    public static void m123073a() {
        C41530am.m132280a("PublishSharedPref reset");
        Editor edit = C7285c.m22838a(C35563c.f93238a, "publish", 0).edit();
        edit.putString("music_path", "");
        edit.putString("music_model", "");
        edit.putInt("music_start", 0);
        edit.putInt("face_beauty", 0);
        edit.putString("segment_video", "");
        edit.putInt("hard_encode", 0);
        edit.putString("mp4_path", "");
        edit.putString("duet_video_path", "");
        edit.putString("duet_audio_path", "");
        edit.putString("creation_id", "");
        edit.putInt("record_mode", 0);
        edit.putString("poi_context", "");
        edit.putString("challenge", "");
        C9721b.m28656a(edit);
    }

    /* renamed from: b */
    public static RecordScene m123085b() {
        RecordScene recordScene = new RecordScene();
        SharedPreferences a = C7285c.m22838a(C35563c.f93238a, "publish", 0);
        recordScene.musicPath = a.getString("music_path", "");
        recordScene.musicStart = a.getInt("music_start", 0);
        recordScene.videoSegments = ShortVideoContext.m122682a(a.getString("segment_video", ""));
        recordScene.faceBeauty = a.getInt("face_beauty", 0);
        recordScene.hardEncode = a.getInt("hard_encode", 0);
        recordScene.mp4Path = a.getString("mp4_path", "");
        recordScene.maxDuration = a.getLong("max_duration", C40413c.f105051b);
        recordScene.duetAudioPath = a.getString("duet_audio_path", "");
        recordScene.duetVideoPath = a.getString("duet_video_path", "");
        recordScene.shootMode = a.getInt("shoot_mode", 0);
        recordScene.creationId = a.getString("creation_id", UUID.randomUUID().toString());
        recordScene.recordMode = a.getInt("record_mode", 0);
        recordScene.filterLabels = a.getString("filter_labels", "");
        recordScene.filterIds = a.getString("filter_ids", "");
        recordScene.poiContextStr = a.getString("poi_context", "");
        recordScene.challengeStr = a.getString("challenge", "");
        recordScene.reactionParams = RecordScene.string2ReactionParams(a.getString("reaction", ""));
        recordScene.extractFramesModel = ExtractFramesModel.string2Model(a.getString("shot_extract_frame", ""));
        recordScene.cherEffectParam = RecordScene.getCherEffectParam(a.getString("ve_cher_effect_param", ""));
        recordScene.videoRecordMetadata = C43009cd.m136509a(a.getString("video_record_metadata", ""));
        try {
            recordScene.musicModel = ((DraftUpdateService) ServiceManager.get().getService(DraftUpdateService.class)).transformNewAVMusic(a.getString("music_model", ""));
        } catch (Throwable unused) {
        }
        return recordScene;
    }

    /* renamed from: a */
    public static void m123074a(int i) {
        Editor edit = C7285c.m22838a(C35563c.f93238a, "publish", 0).edit();
        edit.putInt("record_mode", i);
        C9721b.m28656a(edit);
    }

    /* renamed from: b */
    public static void m123086b(int i) {
        Editor edit = C7285c.m22838a(C35563c.f93238a, "publish", 0).edit();
        edit.putInt("hard_encode", i);
        C9721b.m28656a(edit);
    }

    /* renamed from: c */
    public static void m123089c(int i) {
        Editor edit = C7285c.m22838a(C35563c.f93238a, "publish", 0).edit();
        edit.putInt("face_beauty", i);
        C9721b.m28656a(edit);
    }

    /* renamed from: d */
    public static void m123091d(int i) {
        Editor edit = C7285c.m22838a(C35563c.f93238a, "publish", 0).edit();
        edit.putInt("shoot_mode", i);
        C9721b.m28656a(edit);
    }

    /* renamed from: a */
    public static void m123075a(long j) {
        Editor edit = C7285c.m22838a(C35563c.f93238a, "publish", 0).edit();
        edit.putLong("max_duration", j);
        C9721b.m28656a(edit);
    }

    /* renamed from: b */
    private static ExtractFramesModel m123084b(ExtractFramesModel extractFramesModel) {
        ExtractFramesModel extractFramesModel2 = new ExtractFramesModel(extractFramesModel.extractType);
        extractFramesModel2.extractFramesDir = extractFramesModel.extractFramesDir;
        if (extractFramesModel.frames != null && !extractFramesModel.frames.isEmpty()) {
            extractFramesModel2.frames.putAll(extractFramesModel.frames);
        }
        if (extractFramesModel.stickerFaces != null && !extractFramesModel.stickerFaces.isEmpty()) {
            extractFramesModel2.stickerFaces.putAll(extractFramesModel.stickerFaces);
        }
        return extractFramesModel2;
    }

    /* renamed from: c */
    public static void m123090c(String str) {
        Editor edit = C7285c.m22838a(C35563c.f93238a, "publish", 0).edit();
        edit.putString("challenge", str);
        C9721b.m28656a(edit);
    }

    /* renamed from: b */
    public static void m123087b(String str) {
        Editor edit = C7285c.m22838a(C35563c.f93238a, "publish", 0).edit();
        edit.putString("poi_context", str);
        C9721b.m28656a(edit);
    }

    /* renamed from: a */
    public static void m123076a(ClientCherEffectParam clientCherEffectParam) {
        Editor edit = C7285c.m22838a(C35563c.f93238a, "publish", 0).edit();
        if (clientCherEffectParam != null) {
            edit.putString("ve_cher_effect_param", C35563c.f93239b.mo15979b((Object) clientCherEffectParam));
        } else {
            edit.remove("ve_cher_effect_param");
        }
        C9721b.m28656a(edit);
    }

    /* renamed from: a */
    public static void m123077a(ExtractFramesModel extractFramesModel) {
        ExtractFramesModel b = m123084b(extractFramesModel);
        Editor edit = C7285c.m22838a(C35563c.f93238a, "publish", 0).edit();
        edit.putString("shot_extract_frame", C35563c.f93239b.mo15979b((Object) b));
        C9721b.m28656a(edit);
    }

    /* renamed from: a */
    public static void m123078a(ReactionParams reactionParams) {
        Editor edit = C7285c.m22838a(C35563c.f93238a, "publish", 0).edit();
        edit.putString("reaction", C35563c.f93239b.mo15979b((Object) reactionParams));
        C9721b.m28656a(edit);
    }

    /* renamed from: a */
    public static void m123079a(String str) {
        Editor edit = C7285c.m22838a(C35563c.f93238a, "publish", 0).edit();
        edit.putString("creation_id", str);
        C9721b.m28656a(edit);
    }

    /* renamed from: b */
    public static void m123088b(String str, String str2) {
        Editor edit = C7285c.m22838a(C35563c.f93238a, "publish", 0).edit();
        edit.putString("duet_video_path", str);
        edit.putString("duet_audio_path", str2);
        C9721b.m28656a(edit);
    }
}
