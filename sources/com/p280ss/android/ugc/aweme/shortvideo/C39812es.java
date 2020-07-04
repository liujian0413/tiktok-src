package com.p280ss.android.ugc.aweme.shortvideo;

import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.filter.StrArray;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p280ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVETParameterKt;
import com.p280ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.p280ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p280ss.android.ugc.aweme.shortvideo.p1550b.C38505a;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38565k;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import com.p280ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p280ss.android.ugc.aweme.tools.extension.C42311e;
import com.p280ss.android.ugc.aweme.tools.extension.Scene;
import com.p280ss.android.ugc.p1716b.C43659c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.es */
public final class C39812es {
    /* renamed from: a */
    public static ShortVideoContext m127468a(Intent intent) {
        switch (intent.getIntExtra("restore", 0)) {
            case 0:
                return m127472b(intent);
            case 1:
                return m127474c(intent);
            case 2:
                return m127475d(intent);
            default:
                return m127472b(intent);
        }
    }

    /* renamed from: a */
    private static void m127471a(ShortVideoContext shortVideoContext) {
        if (shortVideoContext.mo96141c()) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (!shortVideoContext.f99775k.mo96317e().exists()) {
                shortVideoContext.f99771g = (int) shortVideoContext.f99767c;
                return;
            }
            try {
                m127470a(mediaMetadataRetriever, shortVideoContext.f99775k.mo96317e().getPath());
                shortVideoContext.f99771g = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                shortVideoContext.f99771g = (int) shortVideoContext.f99767c;
            }
        } else {
            shortVideoContext.f99771g = (int) shortVideoContext.f99767c;
        }
    }

    /* renamed from: c */
    private static ShortVideoContext m127474c(Intent intent) {
        int i;
        String str;
        boolean z;
        ShortVideoContext shortVideoContext = new ShortVideoContext(1);
        shortVideoContext.f99696A = AVETParameterKt.generateAVETParam(intent);
        shortVideoContext.f99788x = intent.getStringExtra("shoot_way");
        shortVideoContext.f99775k = (Workspace) intent.getParcelableExtra("workspace");
        shortVideoContext.f99722a = intent.getIntExtra("draft_to_edit_from", 0);
        if (shortVideoContext.f99775k.mo96317e() != null && C38527bf.m123172a(shortVideoContext.f99775k.mo96317e().getPath())) {
            shortVideoContext.f99769e = shortVideoContext.f99775k.mo96317e().toString();
        }
        if (intent.hasExtra("extra_bind_mv_id")) {
            shortVideoContext.f99723aA = intent.getStringExtra("extra_bind_mv_id");
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) intent.getSerializableExtra("video_edit_model");
        if (videoPublishEditModel.videoWidth() == 0) {
            i = 540;
        } else {
            i = videoPublishEditModel.videoWidth();
        }
        shortVideoContext.f99773i = i;
        shortVideoContext.f99774j = videoPublishEditModel.videoHeight();
        shortVideoContext.f99719X = videoPublishEditModel.mShootMode;
        shortVideoContext.f99745af = videoPublishEditModel.mDurationMode;
        shortVideoContext.f99708M = videoPublishEditModel.isMuted;
        shortVideoContext.f99787w = videoPublishEditModel.creationId;
        shortVideoContext.f99790z = videoPublishEditModel.draftId;
        shortVideoContext.mo96148i().setDraftId(videoPublishEditModel.draftId);
        shortVideoContext.mo96148i().setCreationId(videoPublishEditModel.creationId);
        shortVideoContext.f99720Y = StrArray.from(videoPublishEditModel.mCurFilterLabels);
        shortVideoContext.f99721Z = StrArray.from(videoPublishEditModel.mCurFilterIds);
        RecordScene recordScene = C39360dw.m125725a().f102253h;
        if (recordScene == null || recordScene.isSegmentsNotValid()) {
            shortVideoContext.f99776l = new ShortVideoSegments();
            shortVideoContext.f99777m = 0;
            shortVideoContext.f99783s = C36964i.m118920a() ? 1 : 0;
            shortVideoContext.f99784t = true;
            new C38565k();
            if (shortVideoContext.mo96141c()) {
                str = shortVideoContext.f99775k.mo96317e().getPath();
            } else {
                str = null;
            }
            shortVideoContext.f99767c = C38565k.m123250a(str);
            shortVideoContext.f99771g = (int) shortVideoContext.f99767c;
        } else {
            shortVideoContext.f99776l = new ShortVideoSegments(recordScene.videoSegments);
            shortVideoContext.f99777m = (long) TimeSpeedModelExtension.calculateRealTime(shortVideoContext.f99776l);
            shortVideoContext.f99770f = recordScene.musicStart;
            shortVideoContext.f99783s = recordScene.hardEncode;
            if (recordScene.faceBeauty > 0) {
                z = true;
            } else {
                z = false;
            }
            shortVideoContext.f99784t = z;
            shortVideoContext.f99767c = recordScene.maxDuration;
            m127471a(shortVideoContext);
            shortVideoContext.f99768d = recordScene.audioTrack;
        }
        shortVideoContext.f99709N = videoPublishEditModel.title;
        shortVideoContext.f99710O = videoPublishEditModel.structList;
        shortVideoContext.f99772h = videoPublishEditModel.mMusicOrigin;
        shortVideoContext.f99711P = videoPublishEditModel.isPrivate;
        if (!TextUtils.isEmpty(videoPublishEditModel.pic2VideoSource)) {
            String[] split = videoPublishEditModel.pic2VideoSource.split(",");
            if (split.length > 0) {
                shortVideoContext.f99738aP.addAll(Arrays.asList(split));
            }
        }
        shortVideoContext.f99737aO = 0;
        shortVideoContext.f99712Q = true;
        C42311e.m134571a(C40005j.m127910a((BaseShortVideoContext) videoPublishEditModel), C40005j.m127909a(shortVideoContext), Scene.DRAFT, Scene.RECORD);
        shortVideoContext.f99748ai = videoPublishEditModel.extractFramesModel;
        shortVideoContext.f99730aH = videoPublishEditModel.draftEditTransferModel;
        shortVideoContext.f99786v = videoPublishEditModel.metadataMap;
        if (intent.hasExtra("extra_ve_cher_effect_param")) {
            shortVideoContext.f99731aI = (ClientCherEffectParam) intent.getParcelableExtra("extra_ve_cher_effect_param");
        }
        switch (intent.getIntExtra("retake_shoot_mode", -1)) {
            case 1:
                m127469a(intent, shortVideoContext);
                break;
            case 2:
                m127473b(intent, shortVideoContext);
                break;
        }
        return shortVideoContext;
    }

    /* renamed from: d */
    private static ShortVideoContext m127475d(Intent intent) {
        String str;
        ShortVideoContext shortVideoContext = new ShortVideoContext(2);
        shortVideoContext.f99696A = AVETParameterKt.generateAVETParam(intent);
        shortVideoContext.f99788x = intent.getStringExtra("shoot_way");
        shortVideoContext.f99775k = Workspace.m122801a();
        boolean z = false;
        shortVideoContext.f99790z = 0;
        UrlModel a = C35563c.f93246i.mo103841a((Object) intent.getSerializableExtra("music_model"));
        if (a != null) {
            shortVideoContext.f99768d = a;
        }
        if (intent.hasExtra("extra_bind_mv_id")) {
            shortVideoContext.f99723aA = intent.getStringExtra("extra_bind_mv_id");
        }
        shortVideoContext.f99773i = C35563c.f93254q.getVideoWidth();
        shortVideoContext.f99774j = C35563c.f93254q.getVideoHeight();
        RecordScene b = C38505a.m123085b();
        shortVideoContext.f99745af = C35563c.f93230L.mo93342a(Property.DurationMode);
        if (b.isSegmentsNotValid()) {
            shortVideoContext.mo96148i().setCreationId(UUID.randomUUID().toString());
            shortVideoContext.f99787w = UUID.randomUUID().toString();
            shortVideoContext.f99776l = new ShortVideoSegments();
            shortVideoContext.f99777m = 0;
            shortVideoContext.f99783s = C36964i.m118920a() ? 1 : 0;
            shortVideoContext.f99784t = true;
            new C38565k();
            if (shortVideoContext.mo96141c()) {
                str = shortVideoContext.f99775k.mo96317e().getPath();
            } else {
                str = null;
            }
            shortVideoContext.f99767c = C38565k.m123250a(str);
            m127471a(shortVideoContext);
        } else {
            shortVideoContext.mo96148i().setCreationId(b.creationId);
            shortVideoContext.f99787w = b.creationId;
            shortVideoContext.f99776l = new ShortVideoSegments(b.videoSegments);
            shortVideoContext.f99777m = (long) TimeSpeedModelExtension.calculateRealTime(shortVideoContext.f99776l);
            shortVideoContext.f99769e = b.musicPath;
            if (!TextUtils.isEmpty(b.musicPath)) {
                shortVideoContext.f99775k.mo96312a(new File(b.musicPath));
            }
            shortVideoContext.f99770f = b.musicStart;
            shortVideoContext.f99783s = b.hardEncode;
            if (b.faceBeauty > 0) {
                z = true;
            }
            shortVideoContext.f99784t = z;
            shortVideoContext.f99767c = b.maxDuration;
            m127471a(shortVideoContext);
            shortVideoContext.f99768d = b.audioTrack;
            C39360dw.m125725a().mo97928a(b.musicModel);
            shortVideoContext.f99705J = b.reactionParams;
            shortVideoContext.f99748ai = b.extractFramesModel;
            shortVideoContext.f99720Y = StrArray.from(b.filterLabels);
            shortVideoContext.f99721Z = StrArray.from(b.filterIds);
            shortVideoContext.f99704I = b.poiContextStr;
            shortVideoContext.f99731aI = b.cherEffectParam;
            shortVideoContext.f99786v = b.videoRecordMetadata;
            C39360dw.m125725a().mo97927a(b.getChallengeFromStr());
        }
        return shortVideoContext;
    }

    /* renamed from: b */
    private static ShortVideoContext m127472b(Intent intent) {
        String str;
        boolean z;
        boolean z2;
        ShortVideoContext shortVideoContext = new ShortVideoContext(0);
        shortVideoContext.f99696A = AVETParameterKt.generateAVETParam(intent);
        shortVideoContext.f99787w = intent.getStringExtra("creation_id");
        shortVideoContext.f99788x = intent.getStringExtra("shoot_way");
        shortVideoContext.f99789y = intent.getStringExtra("enter_from");
        shortVideoContext.f99790z = 0;
        shortVideoContext.f99775k = Workspace.m122801a();
        shortVideoContext.f99719X = intent.getIntExtra("shoot_mode", 0);
        shortVideoContext.f99700E = intent.getStringExtra("duet_video_path");
        shortVideoContext.f99701F = intent.getStringExtra("duet_audio_path");
        shortVideoContext.f99699D = intent.getStringExtra("duet_from");
        shortVideoContext.f99697B = (User) intent.getSerializableExtra("duet_author");
        shortVideoContext.f99698C = intent.getStringExtra("duet_hash_tag");
        shortVideoContext.f99702G = intent.getIntExtra("duet_video_width", 0);
        shortVideoContext.f99703H = intent.getIntExtra("duet_video_height", -1);
        shortVideoContext.f99705J = (ReactionParams) intent.getParcelableExtra("reaction_params");
        if (shortVideoContext.mo96142d()) {
            str = shortVideoContext.f99701F;
        } else if (shortVideoContext.mo96144e()) {
            str = shortVideoContext.f99705J.wavPath;
        } else {
            str = intent.getStringExtra("path");
        }
        shortVideoContext.f99769e = str;
        if (!TextUtils.isEmpty(shortVideoContext.f99769e)) {
            shortVideoContext.f99775k.mo96312a(new File(shortVideoContext.f99769e));
        }
        if (intent.hasExtra("extra_bind_mv_id")) {
            shortVideoContext.f99723aA = intent.getStringExtra("extra_bind_mv_id");
        }
        UrlModel a = C35563c.f93246i.mo103841a((Object) intent.getSerializableExtra("music_model"));
        if (a != null) {
            shortVideoContext.f99768d = a;
        }
        shortVideoContext.f99745af = C38503az.m123072a().mo96464a();
        if (C35563c.f93230L.mo93343b(Property.DefaultMicrophoneState) == 3) {
            z = true;
        } else {
            z = false;
        }
        shortVideoContext.f99708M = z;
        ShortVideoContext.m122683a(shortVideoContext);
        shortVideoContext.f99770f = intent.getIntExtra("music_start", 0);
        shortVideoContext.f99771g = (int) shortVideoContext.f99767c;
        shortVideoContext.f99773i = C35563c.f93254q.getVideoWidth();
        shortVideoContext.f99774j = C35563c.f93254q.getVideoHeight();
        shortVideoContext.f99776l = new ShortVideoSegments();
        shortVideoContext.f99777m = 0;
        shortVideoContext.f99783s = C36964i.m118920a() ? 1 : 0;
        shortVideoContext.f99784t = C39814eu.m127477a().mo96463a();
        List<AVChallenge> list = C39360dw.m125725a().f102247b;
        if (!C6311g.m19574b(list) || TextUtils.isEmpty(((AVChallenge) list.get(0)).getStickerId())) {
            shortVideoContext.f99714S = intent.getBooleanExtra("use_preset_sticker_at_first", false);
        } else {
            shortVideoContext.f99713R = ((AVChallenge) list.get(0)).getStickerId();
            shortVideoContext.f99714S = true;
        }
        shortVideoContext.f99715T = intent.getStringExtra("task_id");
        shortVideoContext.f99717V = intent.getStringExtra("is_forced_music_from_show_way");
        AVNationalTask aVNationalTask = C39360dw.m125725a().f102248c;
        if (aVNationalTask == null || C6307b.m19566a((Collection<T>) aVNationalTask.getStickerIds())) {
            shortVideoContext.f99714S = intent.getBooleanExtra("use_preset_sticker_at_first", false);
        } else {
            shortVideoContext.f99713R = (String) aVNationalTask.getStickerIds().get(0);
            shortVideoContext.f99714S = true;
        }
        if (aVNationalTask != null && !C6307b.m19566a((Collection<T>) aVNationalTask.getMvIds())) {
            shortVideoContext.f99723aA = (String) aVNationalTask.getMvIds().get(0);
        }
        if (aVNationalTask != null) {
            shortVideoContext.f99715T = aVNationalTask.getId();
        }
        if (aVNationalTask != null && !C6307b.m19566a((Collection<T>) aVNationalTask.getChallengeNames())) {
            shortVideoContext.f99716U = (ArrayList) aVNationalTask.getChallengeNames();
        }
        shortVideoContext.f99718W = intent.getStringExtra("tag_id");
        if (TextUtils.isEmpty(shortVideoContext.f99713R)) {
            shortVideoContext.f99713R = intent.getStringExtra("sticker_id");
        }
        shortVideoContext.f99753an = (GameDuetResource) intent.getParcelableExtra("duet_sticker_game");
        shortVideoContext.f99704I = intent.getStringExtra("poi_struct_in_tools_line");
        shortVideoContext.f99762aw = (MicroAppModel) intent.getSerializableExtra("micro_app_info");
        if (intent.getBooleanExtra("enter_record_from_other_platform", false) || shortVideoContext.f99762aw != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        shortVideoContext.f99763ax = z2;
        shortVideoContext.f99764ay = intent.getBooleanExtra("to_live", false);
        shortVideoContext.f99765az = intent.getBooleanExtra("extra_to_status", false);
        if (intent.hasExtra("extra_mention_uid") && intent.hasExtra("extra_mention_user_name")) {
            shortVideoContext.f99725aC = ExtraMentionUserModel.Companion.newInstance(intent.getStringExtra("extra_mention_uid"), intent.getStringExtra("extra_mention_user_name"));
        }
        shortVideoContext.f99746ag = true;
        C42311e.m134568a(intent, C40005j.m127909a(shortVideoContext));
        return shortVideoContext;
    }

    /* renamed from: a */
    public static void m127469a(Intent intent, ShortVideoContext shortVideoContext) {
        RetakeVideoContext retakeVideoContext = (RetakeVideoContext) intent.getParcelableExtra("retake_video");
        shortVideoContext.f99780p = retakeVideoContext.f99687a;
        shortVideoContext.f99778n = 0;
        shortVideoContext.f99779o = true;
        if (retakeVideoContext.f99691e != null) {
            shortVideoContext.f99776l = new ShortVideoSegments(retakeVideoContext.f99691e.editSegments);
        }
        shortVideoContext.mo96152m().clear();
        shortVideoContext.f99775k.mo96313b(retakeVideoContext.f99692f);
        shortVideoContext.f99781q = retakeVideoContext;
        String str = retakeVideoContext.f99691e.curMultiEditVideoRecordData.musicPath;
        boolean isPlaySingleSegmentMusic = retakeVideoContext.f99691e.curMultiEditVideoRecordData.isPlaySingleSegmentMusic();
        if (str == null || !isPlaySingleSegmentMusic) {
            shortVideoContext.mo96146g();
            return;
        }
        shortVideoContext.f99770f = retakeVideoContext.f99691e.curMultiEditVideoRecordData.musicTrimIn;
        shortVideoContext.f99775k.mo96312a(new File(str));
        shortVideoContext.f99769e = str;
    }

    /* renamed from: b */
    public static void m127473b(Intent intent, ShortVideoContext shortVideoContext) {
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("original_segments");
        int intExtra = intent.getIntExtra("original_music_start", 0);
        AVMusic b = C39360dw.m125725a().mo97931b();
        shortVideoContext.f99780p = 0;
        shortVideoContext.f99778n = 0;
        shortVideoContext.f99779o = false;
        shortVideoContext.f99781q = null;
        shortVideoContext.f99776l = new ShortVideoSegments(parcelableArrayListExtra);
        shortVideoContext.f99777m = (long) TimeSpeedModelExtension.calculateRealTime(shortVideoContext.f99776l);
        shortVideoContext.f99775k.mo96325m();
        if (b != null) {
            String a = C43659c.m138324a().mo105612a(b.getPath());
            shortVideoContext.f99775k.mo96312a(new File(a));
            shortVideoContext.f99769e = a;
            shortVideoContext.f99770f = intExtra;
            return;
        }
        shortVideoContext.mo96146g();
    }

    /* renamed from: a */
    private static void m127470a(MediaMetadataRetriever mediaMetadataRetriever, String str) throws IllegalArgumentException {
        FileInputStream fileInputStream;
        Throwable th;
        if (str != null) {
            try {
                fileInputStream = new FileInputStream(str);
                mediaMetadataRetriever.setDataSource(fileInputStream.getFD(), 0, 576460752303423487L);
                fileInputStream.close();
                return;
            } catch (FileNotFoundException e) {
                throw new IllegalArgumentException(e);
            } catch (IOException e2) {
                throw new IllegalArgumentException(e2);
            } catch (Throwable th2) {
                C6497a.m20181a(th, th2);
            }
        } else {
            throw new IllegalArgumentException("path == null");
        }
        throw th;
    }
}
