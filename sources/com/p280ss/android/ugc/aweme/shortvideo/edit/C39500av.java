package com.p280ss.android.ugc.aweme.shortvideo.edit;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.beauty.C23531b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.C39450e;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41514ab;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42607e;
import dmt.p1861av.video.C47440an;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.av */
public final class C39500av {
    /* renamed from: a */
    public static final void m126141a(VideoPublishEditModel videoPublishEditModel, String str, String str2, int i) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.m21524a("select_filter", (Map) C22984d.m75611a().mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59970a("draft_id", videoPublishEditModel.draftId).mo59973a("enter_method", str).mo59973a("enter_from", "video_edit_page").mo59973a("filter_name", str2).mo59970a("filter_id", i).f60753a);
    }

    /* renamed from: a */
    public static final void m126139a(VideoPublishEditModel videoPublishEditModel, String str, int i, int i2, String str2) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C7573i.m23587b(str, "musicId");
        C6907h.m21524a("select_music", (Map) C22984d.m75611a().mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("content_source", m126142b(videoPublishEditModel)).mo59973a("content_type", m126133a(videoPublishEditModel)).mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59973a("enter_from", "video_edit_page").mo59973a("music_id", str).mo59970a("music_show_rank", i).mo59970a("music_rec_type", i2).mo59973a("tab_name", str2).f60753a);
    }

    /* renamed from: a */
    public static final void m126140a(VideoPublishEditModel videoPublishEditModel, String str, int i, String str2) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.m21524a("music_show", (Map) C22984d.m75611a().mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("content_source", m126142b(videoPublishEditModel)).mo59973a("content_type", m126133a(videoPublishEditModel)).mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59973a("enter_from", "video_edit_page").mo59973a("music_id", str).mo59970a("music_rec_type", i).mo59973a("tab_name", str2).f60753a);
    }

    /* renamed from: a */
    public static final void m126134a() {
        C6907h.m21524a("function_toast_show", (Map) C22984d.m75611a().mo59973a("enter_from", "video_edit_page").mo59973a("type", "music").f60753a);
    }

    /* renamed from: b */
    public static final void m126143b() {
        C6907h.onEvent(MobClick.obtain().setEventName("next").setLabelName("mid_page"));
    }

    /* renamed from: t */
    public static final void m126164t(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.onEvent(m126132a(videoPublishEditModel, "volumn_edit"));
    }

    /* renamed from: u */
    public static final void m126165u(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.onEvent(m126132a(videoPublishEditModel, "music_edit"));
    }

    /* renamed from: v */
    public static final void m126166v(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.onEvent(m126132a(videoPublishEditModel, "back_to_shoot"));
    }

    /* renamed from: b */
    public static final String m126142b(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        if (videoPublishEditModel.getAvetParameter() != null) {
            return videoPublishEditModel.getAvetParameter().getContentSource();
        }
        if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut || videoPublishEditModel.isMvThemeVideoType()) {
            return "upload";
        }
        return "shoot";
    }

    /* renamed from: c */
    public static final JSONObject m126145c(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        JSONObject b = C6869c.m21381a().mo16887a("shoot_way", videoPublishEditModel.mShootWay).mo16887a("route", "1").mo16885a("is_photo", Integer.valueOf(0)).mo16887a("position", "mid_page").mo16888b();
        C7573i.m23582a((Object) b, "EventJsonBuilder.newBuil…ge\")\n            .build()");
        return b;
    }

    /* renamed from: e */
    public static final void m126149e(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.onEvent(m126132a(videoPublishEditModel, "add_effect"));
        C6907h.m21524a("click_effect_entrance", (Map) C22984d.m75611a().mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59970a("draft_id", videoPublishEditModel.draftId).f60753a);
    }

    /* renamed from: f */
    public static final void m126150f(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.m21524a("click_text_entrance", (Map) C22984d.m75611a().mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59973a("content_type", m126133a(videoPublishEditModel)).mo59973a("content_source", m126142b(videoPublishEditModel)).mo59973a("enter_from", "video_edit_page").f60753a);
    }

    /* renamed from: j */
    public static final void m126154j(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.m21524a("click_auto_subtitle", (Map) C22984d.m75611a().mo59973a("enter_from", "video_edit_page").mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("content_source", m126142b(videoPublishEditModel)).mo59973a("content_type", m126133a(videoPublishEditModel)).f60753a);
    }

    /* renamed from: k */
    public static final void m126155k(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.m21524a("change_music", (Map) C22984d.m75611a().mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59970a("draft_id", videoPublishEditModel.draftId).mo59973a("enter_from", "video_edit_page").f60753a);
    }

    /* renamed from: l */
    public static final void m126156l(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.onEvent(MobClick.obtain().setEventName("filter_slide").setLabelName("mid_page").setJsonObject(m126145c(videoPublishEditModel)));
    }

    /* renamed from: m */
    public static final void m126157m(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.m21524a("back_to_shoot_confirm", (Map) new C22984d().mo59973a("to_status", "cancel").mo59973a("prop_id", videoPublishEditModel.mStickerID).mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59973a("creation_id", videoPublishEditModel.creationId).f60753a);
    }

    /* renamed from: n */
    public static final void m126158n(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.m21524a("back_to_shoot_confirm", (Map) new C22984d().mo59973a("to_status", "confirm").mo59973a("prop_id", videoPublishEditModel.mStickerID).mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59973a("creation_id", videoPublishEditModel.creationId).f60753a);
    }

    /* renamed from: p */
    public static final void m126160p(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.m21524a("change_music", (Map) C22984d.m75611a().mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("content_source", m126142b(videoPublishEditModel)).mo59973a("content_type", m126133a(videoPublishEditModel)).mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59973a("enter_from", "video_edit_page").f60753a);
    }

    /* renamed from: q */
    public static final void m126161q(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.m21524a("music_loading", (Map) C22984d.m75611a().mo59973a("enter_from", "video_edit_page").mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59973a("content_source", m126142b(videoPublishEditModel)).mo59973a("content_type", m126133a(videoPublishEditModel)).mo59973a("content_type", "video").f60753a);
    }

    /* renamed from: r */
    public static final void m126162r(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.m21524a("click_music_entrance", (Map) C22984d.m75611a().mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("content_source", m126142b(videoPublishEditModel)).mo59973a("content_type", m126133a(videoPublishEditModel)).mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59973a("enter_from", "video_edit_page").f60753a);
    }

    /* renamed from: s */
    public static final void m126163s(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.m21524a("change_music_toast_show", (Map) new C22984d().mo59973a("enter_from", "video_edit_page").mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59973a("creation_id", videoPublishEditModel.creationId).f60753a);
    }

    /* renamed from: a */
    public static final String m126133a(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        if (videoPublishEditModel.getAvetParameter() != null) {
            return videoPublishEditModel.getAvetParameter().getContentType();
        }
        if (videoPublishEditModel.isMvThemeVideoType()) {
            return "mv";
        }
        if (videoPublishEditModel.isStickPointMode) {
            return "sound_sync";
        }
        return "video";
    }

    /* renamed from: d */
    public static final void m126147d(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C41514ab a = C41514ab.m132244a();
        C7573i.m23582a((Object) a, "MemoryUtil.getInstance()");
        C41514ab a2 = C41514ab.m132244a();
        C7573i.m23582a((Object) a2, "MemoryUtil.getInstance()");
        C41514ab a3 = C41514ab.m132244a();
        C7573i.m23582a((Object) a3, "MemoryUtil.getInstance()");
        C41514ab a4 = C41514ab.m132244a();
        C7573i.m23582a((Object) a4, "MemoryUtil.getInstance()");
        C6907h.m21524a("av_memory_log", (Map) C22984d.m75611a().mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("enter_from", "video_edit_page").mo59971a("dalvikPss", a.f107964b).mo59971a("nativePss", a2.f107965c).mo59971a("otherPss", a3.f107967e).mo59971a("totalPss", a4.f107966d).f60753a);
    }

    /* renamed from: g */
    public static final void m126151g(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.m21524a("click_voice_modify", (Map) C22984d.m75611a().mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("enter_from", "video_edit_page").mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59973a("content_source", C39450e.m125993a("content_source", videoPublishEditModel)).mo59973a("shoot_entrance", C39450e.m125993a("shoot_entrance", videoPublishEditModel)).mo59973a("content_type", C39450e.m125993a("content_type", videoPublishEditModel)).mo59971a("local_time_ms", System.currentTimeMillis()).f60753a);
    }

    /* renamed from: h */
    public static final void m126152h(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.m21524a("click_modify_entrance", (Map) C22984d.m75611a().mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59973a("content_type", m126133a(videoPublishEditModel)).mo59973a("content_source", m126142b(videoPublishEditModel)).mo59973a("enter_from", "video_edit_page").mo59973a("scene_id", "1004").f60753a);
        C6907h.onEvent(m126132a(videoPublishEditModel, "add_filter"));
    }

    /* renamed from: i */
    public static final void m126153i(VideoPublishEditModel videoPublishEditModel) {
        String str;
        String str2;
        C7573i.m23587b(videoPublishEditModel, "model");
        String str3 = "click_quality_improve";
        C22984d a = C22984d.m75611a().mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59973a("content_source", videoPublishEditModel.getAvetParameter().getContentSource()).mo59973a("content_type", videoPublishEditModel.getAvetParameter().getContentType()).mo59973a("enter_from", "video_edit_page");
        String str4 = "to_status";
        if (videoPublishEditModel.autoEnhanceOn) {
            str = "on";
        } else {
            str = "off";
        }
        C22984d a2 = a.mo59973a(str4, str);
        String str5 = "improve_method";
        if (videoPublishEditModel.autoEnhanceType == 1) {
            str2 = "light";
        } else {
            str2 = "hdr";
        }
        C6907h.m21524a(str3, (Map) a2.mo59973a(str5, str2).f60753a);
    }

    /* renamed from: o */
    public static final void m126159o(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.m21524a("enter_video_shoot_page", (Map) C22984d.m75611a().mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59970a("draft_id", videoPublishEditModel.draftId).mo59973a("filter_list", videoPublishEditModel.mCurFilterLabels).mo59973a("filter_id_list", videoPublishEditModel.mCurFilterIds).mo59973a("content_type", m126133a(videoPublishEditModel)).mo59973a("content_source", m126142b(videoPublishEditModel)).f60753a);
    }

    /* renamed from: a */
    public static final MobClick m126132a(VideoPublishEditModel videoPublishEditModel, String str) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C7573i.m23587b(str, "event");
        MobClick jsonObject = MobClick.obtain().setLabelName("mid_page").setEventName(str).setJsonObject(m126145c(videoPublishEditModel));
        C7573i.m23582a((Object) jsonObject, "MobClick.obtain().setLab…uildShootWayExtra(model))");
        return jsonObject;
    }

    /* renamed from: b */
    public static final void m126144b(VideoPublishEditModel videoPublishEditModel, String str) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.m21524a("click_music_tab", (Map) C22984d.m75611a().mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("content_source", m126142b(videoPublishEditModel)).mo59973a("content_type", m126133a(videoPublishEditModel)).mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59973a("enter_from", "video_edit_page").mo59973a("tab_name", str).f60753a);
    }

    /* renamed from: c */
    public static final void m126146c(VideoPublishEditModel videoPublishEditModel, String str) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.m21524a("click_music_tab", (Map) C22984d.m75611a().mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("content_source", m126142b(videoPublishEditModel)).mo59973a("content_type", m126133a(videoPublishEditModel)).mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59973a("enter_from", "video_edit_page").mo59973a("tab_name", str).f60753a);
    }

    /* renamed from: a */
    public static final void m126135a(Context context, VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(videoPublishEditModel, "model");
        C19282c.m63184a(context, "edit", "draft", 0, 0, m126145c(videoPublishEditModel));
    }

    /* renamed from: d */
    public static final void m126148d(VideoPublishEditModel videoPublishEditModel, String str) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.m21524a("enter_music_tab", (Map) C22984d.m75611a().mo59973a("enter_from", "video_edit_page").mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59973a("content_source", m126142b(videoPublishEditModel)).mo59973a("content_type", m126133a(videoPublishEditModel)).mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("tab_name", str).f60753a);
    }

    /* renamed from: a */
    public static final void m126136a(VideoPublishEditModel videoPublishEditModel, int i) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.m21524a("edit_music", (Map) C22984d.m75611a().mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("content_source", m126142b(videoPublishEditModel)).mo59973a("content_type", m126133a(videoPublishEditModel)).mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59973a("music_id", videoPublishEditModel.musicId).mo59970a("music_rec_type", i).mo59973a("enter_from", "video_edit_page").f60753a);
    }

    /* renamed from: a */
    public static final void m126137a(VideoPublishEditModel videoPublishEditModel, Intent intent) {
        String str;
        int i;
        String str2;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        String str3;
        String str4;
        C7573i.m23587b(videoPublishEditModel, "model");
        int[] a = C47440an.m148109a(videoPublishEditModel.videoPath());
        C22984d a2 = C22984d.m75611a().mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59970a("draft_id", videoPublishEditModel.draftId).mo59973a("filter_list", videoPublishEditModel.mCurFilterLabels).mo59973a("filter_id_list", videoPublishEditModel.mCurFilterIds);
        String str5 = "is_hardcode";
        if (C36964i.m118920a()) {
            str = "1";
        } else {
            str = "0";
        }
        C22984d a3 = a2.mo59973a(str5, str).mo59973a("bite_rate", String.valueOf(C36964i.m118929e()));
        String str6 = "file_bitrate";
        boolean z3 = false;
        if (a != null) {
            i = a[6];
        } else {
            i = 0;
        }
        C22984d a4 = a3.mo59970a(str6, i).mo59970a("video_quality", C36964i.m118931g());
        String str7 = "resolution";
        if (videoPublishEditModel.getOriginal() == 1) {
            str2 = C36964i.m118932h();
        } else {
            str2 = C36964i.m118933i();
        }
        C22984d a5 = a4.mo59973a(str7, str2).mo59973a("content_type", m126133a(videoPublishEditModel)).mo59973a("content_source", m126142b(videoPublishEditModel)).mo59970a("draft_version", videoPublishEditModel.getNewVersion()).mo59973a("prop_list", videoPublishEditModel.mStickerID);
        String str8 = "edit_fps";
        if (a != null) {
            i2 = a[7];
        } else {
            i2 = 0;
        }
        C22984d a6 = a5.mo59970a(str8, i2);
        if (TextUtils.equals(m126142b(videoPublishEditModel), "upload")) {
            a6.mo59970a("fast_import", videoPublishEditModel.isFastImport ? 1 : 0);
            String str9 = "upload_type";
            if (videoPublishEditModel.mFromMultiCut) {
                str4 = "multiple_content";
            } else {
                str4 = "single_content";
            }
            a6.mo59973a(str9, str4);
            a6.mo59970a("fast_import_fail", videoPublishEditModel.fastImportErrorCode);
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.mBindMvId)) {
            a6.mo59973a("mv_id", videoPublishEditModel.mBindMvId);
        }
        if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut) {
            i4 = videoPublishEditModel.videoCount;
            i3 = videoPublishEditModel.photoCount;
        } else {
            if (videoPublishEditModel.extractFramesModel != null && videoPublishEditModel.extractFramesModel.frames != null) {
                i4 = videoPublishEditModel.extractFramesModel.frames.size();
            } else if (videoPublishEditModel.mvCreateVideoData == null || videoPublishEditModel.mvCreateVideoData.selectMediaList == null) {
                i4 = 0;
            } else {
                i3 = videoPublishEditModel.mvCreateVideoData.selectMediaList.size();
                i4 = 0;
            }
            i3 = 0;
        }
        a6.mo59970a("video_cnt", i4);
        a6.mo59970a("pic_cnt", i3);
        a6.mo59970a("beautify_used", C23531b.m77286b());
        a6.mo59973a("beautify_info", C35574k.m114859a().mo70085S().mo15979b((Object) C23531b.m77285a()));
        String str10 = "is_multi_content";
        if (i4 + i3 > 1) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        a6.mo59970a(str10, i5);
        if (intent != null) {
            String str11 = "is_speed_change";
            if (intent.getBooleanExtra("extra_is_change_speed", false)) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            a6.mo59973a(str11, str3);
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.pic2VideoSource)) {
            StringBuilder sb = new StringBuilder();
            String str12 = videoPublishEditModel.pic2VideoSource;
            C7573i.m23582a((Object) str12, "model.pic2VideoSource");
            List<String> b = C7634n.m23768b((CharSequence) str12, new String[]{","}, false, 0);
            if (!b.isEmpty()) {
                for (String str13 : b) {
                    if (str13.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        if (sb.length() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            sb.append(",");
                        }
                        sb.append(str13);
                    }
                }
            }
            if (sb.length() > 0) {
                z3 = true;
            }
            if (z3) {
                a6.mo59973a("picture_source", sb.toString());
            }
        }
        C6907h.m21524a("enter_video_edit_page", (Map) a6.f60753a);
    }

    /* renamed from: a */
    public static final void m126138a(VideoPublishEditModel videoPublishEditModel, C42607e eVar) {
        int i;
        C7573i.m23587b(videoPublishEditModel, "model");
        C7573i.m23587b(eVar, "aiChooseMusicResult");
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        if (!eVar.mo103933a()) {
            List<AVMusic> d = eVar.mo103936d();
            if (d == null) {
                C7573i.m23580a();
            }
            boolean z = false;
            for (AVMusic aVMusic : d) {
                if (z) {
                    sb.append(",");
                }
                sb.append(aVMusic.mid);
                z = true;
            }
        }
        String str = "music_upload_done";
        C22984d a = C22984d.m75611a().mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("enter_from", "video_edit_page");
        String str2 = "music_upload_num";
        List d2 = eVar.mo103936d();
        if (d2 != null) {
            i2 = d2.size();
        }
        C22984d a2 = a.mo59970a(str2, i2).mo59971a("music_upload_duration", eVar.mo103935c()).mo59973a("music_id_list", sb.toString());
        String str3 = "music_rec_type";
        Integer b = eVar.mo103934b();
        if (b != null) {
            i = b.intValue();
        } else {
            i = 2;
        }
        C6907h.m21524a(str, (Map) a2.mo59970a(str3, i).f60753a);
    }
}
