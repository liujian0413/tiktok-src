package com.p280ss.android.ugc.aweme.status;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.C6600e;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23319b;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.C39695d;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p280ss.android.ugc.aweme.status.p1631a.C41805b;
import com.p280ss.android.ugc.aweme.status.p1631a.C41806c;
import com.p280ss.android.ugc.aweme.status.p1632b.C41809a;
import com.p280ss.android.ugc.aweme.status.repository.Callback;
import com.p280ss.android.ugc.aweme.status.repository.StatusMusicListRepository;
import com.p280ss.android.ugc.aweme.utils.C43136fo;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43756f;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43757g;
import com.p280ss.android.ugc.gamora.recorder.status.C44751c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.text.C7634n;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.status.a */
public final class C41781a {

    /* renamed from: a */
    public RecordStatusViewModel f108711a;

    /* renamed from: b */
    public Music f108712b;

    /* renamed from: c */
    public C41809a f108713c;

    /* renamed from: d */
    public boolean f108714d;

    /* renamed from: e */
    public String f108715e = "";

    /* renamed from: f */
    public String f108716f = "";

    /* renamed from: g */
    public String f108717g;

    /* renamed from: h */
    public String f108718h = "change_mode";

    /* renamed from: i */
    public FragmentActivity f108719i;

    /* renamed from: j */
    public final ShortVideoContext f108720j;

    /* renamed from: k */
    private EffectPlatform f108721k;

    /* renamed from: com.ss.android.ugc.aweme.status.a$a */
    public static final class C41792a implements C43756f {

        /* renamed from: a */
        final /* synthetic */ C41781a f108732a;

        /* renamed from: b */
        final /* synthetic */ C41809a f108733b;

        /* renamed from: com.ss.android.ugc.aweme.status.a$a$a */
        public static final class C41793a extends C41805b {

            /* renamed from: a */
            final /* synthetic */ C41792a f108734a;

            /* renamed from: b */
            final /* synthetic */ C41809a f108735b;

            /* renamed from: com.ss.android.ugc.aweme.status.a$a$a$a */
            static final class C41794a<V> implements Callable<String> {

                /* renamed from: a */
                final /* synthetic */ C41793a f108736a;

                C41794a(C41793a aVar) {
                    this.f108736a = aVar;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public String call() {
                    C41809a aVar = this.f108736a.f108735b;
                    if (aVar == null) {
                        C7573i.m23580a();
                    }
                    File file = new File(aVar.f108754c.getZipPath());
                    C41809a aVar2 = this.f108736a.f108735b;
                    if (aVar2 == null) {
                        C7573i.m23580a();
                    }
                    C43136fo.m136824a(file, new File(aVar2.f108754c.getUnzipPath()));
                    C41809a aVar3 = this.f108736a.f108735b;
                    if (aVar3 == null) {
                        C7573i.m23580a();
                    }
                    String unzipPath = aVar3.f108754c.getUnzipPath();
                    C7573i.m23582a((Object) unzipPath, "statusBgEffect!!.effect.unzipPath");
                    String a = C44751c.m141247a(unzipPath);
                    if (TextUtils.isEmpty(a)) {
                        return "";
                    }
                    return a;
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.status.a$a$a$b */
            static final class C41795b<TTaskResult, TContinuationResult> implements C1591g<String, Void> {

                /* renamed from: a */
                final /* synthetic */ C41793a f108737a;

                C41795b(C41793a aVar) {
                    this.f108737a = aVar;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void then(C1592h<String> hVar) {
                    C41781a aVar = this.f108737a.f108734a.f108732a;
                    C7573i.m23582a((Object) hVar, "it");
                    aVar.f108715e = (String) hVar.mo6890e();
                    C41781a aVar2 = this.f108737a.f108734a.f108732a;
                    C41809a aVar3 = this.f108737a.f108735b;
                    if (aVar3 == null) {
                        C7573i.m23580a();
                    }
                    String effectId = aVar3.f108754c.getEffectId();
                    C7573i.m23582a((Object) effectId, "statusBgEffect!!.effect.effectId");
                    aVar2.f108716f = effectId;
                    this.f108737a.f108734a.f108732a.mo102586b();
                    return null;
                }
            }

            public final void onProgress(DownloadInfo downloadInfo) {
                super.onProgress(downloadInfo);
                if (downloadInfo != null) {
                    this.f108734a.f108732a.f108711a.mo102539j().setValue(Integer.valueOf(downloadInfo.getDownloadProcess() / 3));
                }
            }

            public final void onSuccessed(DownloadInfo downloadInfo) {
                super.onSuccessed(downloadInfo);
                C1592h.m7853a((Callable<TResult>) new C41794a<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C41795b<TResult,TContinuationResult>(this), C1592h.f5958b);
                C6893q.m21444a("status_template_download_error_state", 0, (JSONObject) null);
            }

            C41793a(C41792a aVar, C41809a aVar2) {
                this.f108734a = aVar;
                this.f108735b = aVar2;
            }

            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                super.onFailed(downloadInfo, baseException);
                JSONObject jSONObject = new JSONObject();
                String str = "effectid";
                C41809a aVar = this.f108734a.f108733b;
                if (aVar == null) {
                    C7573i.m23580a();
                }
                jSONObject.put(str, aVar.f108754c.getEffectId());
                C6893q.m21444a("status_template_download_error_state", 1, jSONObject);
            }
        }

        /* renamed from: a */
        public final void mo70686a(C43726c cVar) {
            this.f108732a.f108715e = "";
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("effect_panel", "status-background");
            C6893q.m21444a("status_template_list_error_state", 1, jSONObject);
        }

        /* renamed from: a */
        public final void mo70687a(CategoryPageModel categoryPageModel) {
            C6893q.m21444a("status_template_list_error_state", 0, (JSONObject) null);
            if (categoryPageModel != null && categoryPageModel.category_effects != null) {
                CategoryEffectModel categoryEffectModel = categoryPageModel.category_effects;
                C7573i.m23582a((Object) categoryEffectModel, "response.categoryEffects");
                List<Effect> list = categoryEffectModel.effects;
                double random = Math.random();
                double size = (double) (list.size() - 1);
                Double.isNaN(size);
                Effect effect = (Effect) list.get((int) (random * size));
                C7573i.m23582a((Object) effect, "effect");
                C41809a aVar = new C41809a(1, effect, "", "", "");
                C41806c.m133030a(this.f108732a.f108719i, aVar, new C41793a(this, aVar));
            }
        }

        C41792a(C41781a aVar, C41809a aVar2) {
            this.f108732a = aVar;
            this.f108733b = aVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.a$b */
    public static final class C41796b extends C41805b {
        C41796b() {
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            super.onSuccessed(downloadInfo);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.a$c */
    public static final class C41797c implements Callback {

        /* renamed from: a */
        final /* synthetic */ C41781a f108738a;

        C41797c(C41781a aVar) {
            this.f108738a = aVar;
        }

        public final void callback(Music music) {
            this.f108738a.f108712b = music;
            this.f108738a.mo102586b();
        }

        public final void onProgress(DownloadInfo downloadInfo) {
            if (downloadInfo != null) {
                this.f108738a.f108711a.mo102538i().setValue(Integer.valueOf(downloadInfo.getDownloadProcess() / 3));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.a$d */
    public static final class C41798d extends C41805b {

        /* renamed from: a */
        final /* synthetic */ C41781a f108739a;

        /* renamed from: b */
        final /* synthetic */ C41809a f108740b;

        /* renamed from: com.ss.android.ugc.aweme.status.a$d$a */
        static final class C41799a<V> implements Callable<Object> {

            /* renamed from: a */
            final /* synthetic */ C41798d f108741a;

            C41799a(C41798d dVar) {
                this.f108741a = dVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public String call() {
                C41809a aVar = this.f108741a.f108740b;
                if (aVar == null) {
                    C7573i.m23580a();
                }
                File file = new File(aVar.f108754c.getZipPath());
                C41809a aVar2 = this.f108741a.f108740b;
                if (aVar2 == null) {
                    C7573i.m23580a();
                }
                return C43136fo.m136824a(file, new File(aVar2.f108754c.getUnzipPath()));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.status.a$d$b */
        static final class C41800b<TTaskResult, TContinuationResult> implements C1591g<Object, Void> {

            /* renamed from: a */
            final /* synthetic */ C41798d f108742a;

            C41800b(C41798d dVar) {
                this.f108742a = dVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void then(C1592h<Object> hVar) {
                this.f108742a.f108739a.f108713c = this.f108742a.f108740b;
                this.f108742a.f108739a.mo102586b();
                return null;
            }
        }

        public final void onProgress(DownloadInfo downloadInfo) {
            super.onProgress(downloadInfo);
            if (downloadInfo != null) {
                this.f108739a.f108711a.mo102540k().setValue(Integer.valueOf(downloadInfo.getDownloadProcess() / 3));
            }
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            super.onSuccessed(downloadInfo);
            C1592h.m7853a((Callable<TResult>) new C41799a<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C41800b<TResult,TContinuationResult>(this), C1592h.f5958b);
            C6893q.m21444a("status_template_download_error_state", 0, (JSONObject) null);
        }

        C41798d(C41781a aVar, C41809a aVar2) {
            this.f108739a = aVar;
            this.f108740b = aVar2;
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            super.onFailed(downloadInfo, baseException);
            JSONObject jSONObject = new JSONObject();
            String str = "effectid";
            C41809a aVar = this.f108740b;
            if (aVar == null) {
                C7573i.m23580a();
            }
            jSONObject.put(str, aVar.f108754c.getEffectId());
            C6893q.m21444a("status_template_download_error_state", 1, jSONObject);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.a$e */
    static final class C41801e<T> implements C23319b<AVChallenge> {

        /* renamed from: a */
        final /* synthetic */ ObjectRef f108743a;

        C41801e(ObjectRef objectRef) {
            this.f108743a = objectRef;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(AVChallenge aVChallenge) {
            List list = (List) this.f108743a.element;
            C7573i.m23582a((Object) aVChallenge, "avChallenge");
            list.add(aVChallenge);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.a$f */
    public static final class C41802f implements C43756f {

        /* renamed from: a */
        final /* synthetic */ C41781a f108744a;

        C41802f(C41781a aVar) {
            this.f108744a = aVar;
        }

        /* renamed from: a */
        public final void mo70686a(C43726c cVar) {
            this.f108744a.f108711a.mo102533d().setValue(null);
        }

        /* renamed from: a */
        public final void mo70687a(CategoryPageModel categoryPageModel) {
            this.f108744a.f108711a.mo102533d().setValue(categoryPageModel);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.status.a$g */
    public static final class C41803g implements C43757g {

        /* renamed from: a */
        final /* synthetic */ C41781a f108745a;

        C41803g(C41781a aVar) {
            this.f108745a = aVar;
        }

        /* renamed from: a */
        public final void mo9274a(C43726c cVar) {
            this.f108745a.f108711a.mo102531b().postValue(null);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("effect_panel", "status-template");
            C6893q.m21444a("status_template_list_error_state", 1, jSONObject);
        }

        /* renamed from: a */
        public final void mo9275a(EffectChannelResponse effectChannelResponse) {
            C7573i.m23587b(effectChannelResponse, "response");
            this.f108745a.f108711a.mo102531b().postValue(effectChannelResponse);
            C6893q.m21444a("status_template_list_error_state", 0, (JSONObject) null);
        }
    }

    /* renamed from: a */
    public final void mo102583a() {
        if (C41808b.m133033a(this.f108719i)) {
            this.f108721k.mo70641b("status-template", false, new C41803g(this));
        }
    }

    /* renamed from: c */
    private final void m133000c() {
        if (this.f108712b == null) {
            new StatusMusicListRepository(this.f108719i, new C41797c(this));
        } else {
            this.f108711a.mo102538i().setValue(Integer.valueOf(33));
        }
    }

    /* renamed from: b */
    public final void mo102586b() {
        if (this.f108714d && this.f108712b != null && !TextUtils.isEmpty(this.f108715e) && this.f108713c != null) {
            this.f108711a.mo102539j().setValue(Integer.valueOf(33));
            this.f108711a.mo102540k().setValue(Integer.valueOf(33));
            this.f108711a.mo102538i().setValue(Integer.valueOf(34));
            C41806c.m133031a(this.f108719i);
            C41809a aVar = this.f108713c;
            if (aVar == null) {
                C7573i.m23580a();
            }
            mo102588c(aVar);
        }
    }

    /* renamed from: b */
    public final void mo102587b(C41809a aVar) {
        C7573i.m23587b(aVar, "statusEffect");
        C41806c.m133030a(this.f108719i, aVar, new C41796b());
    }

    /* renamed from: a */
    private static String m132999a(Effect effect) {
        if (effect == null) {
            return null;
        }
        List<String> tags = effect.getTags();
        if (C6311g.m19573a(tags)) {
            return null;
        }
        for (String str : tags) {
            C7573i.m23582a((Object) str, "tag");
            if (C7634n.m23721b(str, "challenge:", false)) {
                String substring = str.substring(10);
                C7573i.m23582a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                return substring;
            }
        }
        return null;
    }

    /* renamed from: d */
    private final void m133001d(C41809a aVar) {
        if (TextUtils.isEmpty(this.f108715e)) {
            this.f108721k.mo70632a("status-background", "wallpaper", false, 0, 0, 0, "", new C41792a(this, aVar));
        } else {
            this.f108711a.mo102539j().setValue(Integer.valueOf(34));
        }
    }

    /* renamed from: e */
    private final void m133002e(C41809a aVar) {
        if (this.f108713c == null) {
            C41806c.m133030a(this.f108719i, aVar, new C41798d(this, aVar));
        } else {
            this.f108711a.mo102540k().setValue(Integer.valueOf(33));
        }
    }

    /* renamed from: a */
    public final void mo102584a(C41809a aVar) {
        if (C41808b.m133033a(this.f108719i) && aVar != null) {
            m133000c();
            m133002e(aVar);
            m133001d(aVar);
        }
    }

    /* renamed from: a */
    public final void mo102585a(String str) {
        C7573i.m23587b(str, "category");
        if (C41808b.m133033a(this.f108719i)) {
            this.f108721k.mo70632a("status-template", str, false, 0, 0, 0, "", new C41802f(this));
        }
    }

    /* renamed from: c */
    public final void mo102588c(C41809a aVar) {
        CharSequence charSequence;
        Object obj;
        Object obj2;
        C41809a aVar2 = aVar;
        C7573i.m23587b(aVar2, "effect");
        C22984d a = C22984d.m75611a().mo59973a("tab_name", this.f108717g).mo59970a("draft_id", this.f108720j.f99790z);
        Intent intent = new Intent();
        StatusCreateVideoData statusCreateVideoData = new StatusCreateVideoData();
        statusCreateVideoData.setStatusType(aVar2.f108753b);
        if (!TextUtils.isEmpty(aVar2.f108754c.getEffectId())) {
            if (aVar2.f108753b == 1) {
                intent.putExtra("first_sticker_music_ids", new C6600e().mo15979b((Object) this.f108712b));
                Music music = this.f108712b;
                if (music != null) {
                    charSequence = music.getMid();
                } else {
                    charSequence = null;
                }
                if (!TextUtils.isEmpty(charSequence)) {
                    Music music2 = this.f108712b;
                    if (music2 != null) {
                        obj2 = music2.getMid();
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        C7573i.m23580a();
                    }
                    statusCreateVideoData.setMusicIds(C7525m.m23509d((Collection<? extends T>) C7525m.m23457a(obj2)));
                }
                statusCreateVideoData.setBgPath(String.valueOf(this.f108715e));
                statusCreateVideoData.setBgId(this.f108716f);
                statusCreateVideoData.setBgFrom("wallpaper");
                Music music3 = this.f108712b;
                if (music3 != null) {
                    obj = music3.getPath();
                } else {
                    obj = null;
                }
                statusCreateVideoData.setMusicPath(String.valueOf(obj));
                String unzipPath = aVar2.f108754c.getUnzipPath();
                C7573i.m23582a((Object) unzipPath, "effect.effect.unzipPath");
                statusCreateVideoData.setEffectPath(unzipPath);
                statusCreateVideoData.setEffectId("emptystatusmodel");
                this.f108714d = false;
                intent.putExtra("first_sticker_music_ids", new C6600e().mo15979b((Object) statusCreateVideoData.getMusicIds()));
                a.mo59973a("status_template_id", "emptystatusmodel");
                a.mo59973a("enter_method", "direct");
            } else if (!C23477d.m77081a((Collection<T>) aVar2.f108754c.getMusic())) {
                intent.putExtra("first_sticker_music_ids", new C6600e().mo15979b((Object) aVar2.f108754c.getMusic()));
                List music4 = aVar2.f108754c.getMusic();
                C7573i.m23582a((Object) music4, "effect.effect.music");
                statusCreateVideoData.setMusicIds(music4);
                String unzipPath2 = aVar2.f108754c.getUnzipPath();
                C7573i.m23582a((Object) unzipPath2, "effect.effect.unzipPath");
                statusCreateVideoData.setEffectPath(unzipPath2);
                String effectId = aVar2.f108754c.getEffectId();
                C7573i.m23582a((Object) effectId, "effect.effect.effectId");
                statusCreateVideoData.setEffectId(effectId);
                a.mo59973a("status_template_id", statusCreateVideoData.getEffectId());
                a.mo59973a("enter_method", "template");
            }
        }
        C6907h.m21524a("create_status", (Map) a.f60753a);
        intent.putExtra("key_status_enter", true);
        intent.putExtra("key_status_video_data", statusCreateVideoData);
        AVUploadMiscInfoStruct aVUploadMiscInfoStruct = new AVUploadMiscInfoStruct();
        aVUploadMiscInfoStruct.mStatusId = statusCreateVideoData.getEffectId();
        intent.putExtra("av_upload_struct", aVUploadMiscInfoStruct);
        ObjectRef objectRef = new ObjectRef();
        C39360dw a2 = C39360dw.m125725a();
        C7573i.m23582a((Object) a2, "PublishManager.inst()");
        objectRef.element = a2.f102247b;
        if (((List) objectRef.element) == null) {
            objectRef.element = (List) new ArrayList();
        }
        String a3 = m132999a(aVar2.f108754c);
        if (!TextUtils.isEmpty(a3)) {
            C35563c.f93241d.mo83166a(a3, null, 0, 0, new C41801e(objectRef));
        }
        String unzipPath3 = aVar2.f108754c.getUnzipPath();
        C7573i.m23582a((Object) unzipPath3, "effect.effect.unzipPath");
        VideoFileInfo videoFileInfo = new VideoFileInfo(720, 1280, 0, 30);
        EditVideoSegment editVideoSegment = new EditVideoSegment(unzipPath3, null, videoFileInfo);
        C39695d dVar = new C39695d(0, 0, 0, 0, 15, null);
        intent.putExtra("extra_edit_preview_info", dVar.mo99058a(editVideoSegment));
        String str = "challenge";
        List list = (List) objectRef.element;
        if (list != null) {
            intent.putExtra(str, (Serializable) list);
            intent.putExtra("shoot_way", this.f108720j.f99788x);
            intent.putExtra("creation_id", this.f108720j.f99787w);
            intent.putExtra("shoot_mode", this.f108720j.f99719X);
            intent.putExtra("draft_id", this.f108720j.f99790z);
            intent.putExtra("origin", 1);
            intent.putExtra("content_type", "status");
            intent.putExtra("content_source", "shoot");
            intent.putExtra("task_id", this.f108720j.f99715T);
            intent.putExtra("tag_id", this.f108720j.f99718W);
            if (!C6307b.m19566a((Collection<T>) this.f108720j.f99716U)) {
                StringBuilder sb = new StringBuilder();
                Iterator it = this.f108720j.f99716U.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    sb.append("#");
                    sb.append(str2);
                    sb.append(" ");
                }
                this.f108720j.f99709N = sb.toString();
                intent.putExtra("video_title", this.f108720j.f99709N);
            }
            intent.putExtra("poi_data_in_tools_line", this.f108720j.f99704I);
            intent.putExtra("commerce_data_in_tools_line", this.f108720j.f99757ar);
            VEVideoPublishEditActivity.m125843a((Context) this.f108719i, intent, 1);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.io.Serializable");
    }

    public C41781a(FragmentActivity fragmentActivity, ShortVideoContext shortVideoContext) {
        C7573i.m23587b(fragmentActivity, "mActivity");
        C7573i.m23587b(shortVideoContext, "shortVideoContext");
        this.f108719i = fragmentActivity;
        this.f108720j = shortVideoContext;
        String string = this.f108719i.getString(R.string.ala);
        C7573i.m23582a((Object) string, "mActivity.getString(R.st…eation_shoot_status_tab1)");
        this.f108717g = string;
        this.f108721k = new EffectPlatform(this.f108719i, C35563c.f93245h.mo83209c(), C35563c.f93220B.getOKHttpClient());
        C0063u a = C0069x.m159a(this.f108719i).mo147a(RecordStatusViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(mA…tusViewModel::class.java)");
        this.f108711a = (RecordStatusViewModel) a;
        this.f108711a.mo102530a().observe(this.f108719i, new C0053p<Boolean>(this) {

            /* renamed from: a */
            final /* synthetic */ C41781a f108722a;

            {
                this.f108722a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(Boolean bool) {
                this.f108722a.mo102583a();
            }
        });
        this.f108711a.mo102532c().observe(this.f108719i, new C0053p<String>(this) {

            /* renamed from: a */
            final /* synthetic */ C41781a f108725a;

            {
                this.f108725a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(String str) {
                if (str != null) {
                    this.f108725a.mo102585a(str);
                }
            }
        });
        this.f108711a.mo102534e().observe(this.f108719i, new C0053p<C41809a>(this) {

            /* renamed from: a */
            final /* synthetic */ C41781a f108726a;

            {
                this.f108726a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(C41809a aVar) {
                if (aVar != null) {
                    this.f108726a.mo102587b(aVar);
                }
            }
        });
        this.f108711a.mo102535f().observe(this.f108719i, new C0053p<C41809a>(this) {

            /* renamed from: a */
            final /* synthetic */ C41781a f108727a;

            {
                this.f108727a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(C41809a aVar) {
                if (aVar != null) {
                    this.f108727a.mo102588c(aVar);
                }
            }
        });
        this.f108711a.mo102536g().observe(this.f108719i, new C0053p<C41809a>(this) {

            /* renamed from: a */
            final /* synthetic */ C41781a f108728a;

            {
                this.f108728a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(C41809a aVar) {
                this.f108728a.mo102584a(aVar);
            }
        });
        this.f108711a.mo102537h().observe(this.f108719i, new C0053p<C41809a>(this) {

            /* renamed from: a */
            final /* synthetic */ C41781a f108729a;

            {
                this.f108729a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(C41809a aVar) {
                if (aVar == null) {
                    this.f108729a.f108714d = false;
                    C41806c.m133031a(this.f108729a.f108719i);
                    return;
                }
                this.f108729a.f108714d = true;
                if (this.f108729a.f108712b == null || TextUtils.isEmpty(this.f108729a.f108715e) || this.f108729a.f108713c == null) {
                    this.f108729a.mo102584a(aVar);
                    return;
                }
                this.f108729a.f108711a.mo102539j().setValue(Integer.valueOf(33));
                this.f108729a.f108711a.mo102540k().setValue(Integer.valueOf(33));
                this.f108729a.f108711a.mo102538i().setValue(Integer.valueOf(34));
                C41781a aVar2 = this.f108729a;
                C41809a aVar3 = this.f108729a.f108713c;
                if (aVar3 == null) {
                    C7573i.m23580a();
                }
                aVar2.mo102588c(aVar3);
            }
        });
        this.f108711a.mo102543n().observe(this.f108719i, new C0053p<Integer>(this) {

            /* renamed from: a */
            final /* synthetic */ C41781a f108730a;

            {
                this.f108730a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(Integer num) {
                if (num != null) {
                    C6907h.m21524a("enter_status_shoot_page", (Map) C22984d.m75611a().mo59973a("creation_id", this.f108730a.f108720j.f99787w).mo59973a("shoot_way", this.f108730a.f108720j.f99788x).mo59973a("content_source", "upload").mo59973a("content_type", "status").mo59970a("draft_id", this.f108730a.f108720j.f99790z).mo59973a("enter_method", this.f108730a.f108718h).f60753a);
                    this.f108730a.f108718h = "change_mode";
                }
            }
        });
        this.f108711a.mo102545p().observe(this.f108719i, new C0053p<String>(this) {

            /* renamed from: a */
            final /* synthetic */ C41781a f108731a;

            {
                this.f108731a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(String str) {
                if (str != null) {
                    C41781a aVar = this.f108731a;
                    C7573i.m23582a((Object) str, "it");
                    aVar.f108718h = str;
                }
            }
        });
        this.f108711a.mo102546q().observe(this.f108719i, new C0053p<String>(this) {

            /* renamed from: a */
            final /* synthetic */ C41781a f108723a;

            {
                this.f108723a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(String str) {
                C6907h.m21524a("enter_status_tab", (Map) C22984d.m75611a().mo59973a("creation_id", this.f108723a.f108720j.f99787w).mo59973a("shoot_way", this.f108723a.f108720j.f99788x).mo59973a("tab_name", str).f60753a);
                this.f108723a.f108717g = String.valueOf(str);
            }
        });
        this.f108711a.mo102544o().observe(this.f108719i, new C0053p<String>(this) {

            /* renamed from: a */
            final /* synthetic */ C41781a f108724a;

            {
                this.f108724a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(String str) {
                if (str != null) {
                    C6907h.m21524a("show_status_template", (Map) C22984d.m75611a().mo59973a("creation_id", this.f108724a.f108720j.f99787w).mo59973a("shoot_way", this.f108724a.f108720j.f99788x).mo59973a("tab_name", this.f108724a.f108717g).mo59973a("status_template_id", str).f60753a);
                }
            }
        });
    }
}
