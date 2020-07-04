package com.p280ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.p1619b.C41273a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40832n;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42363m;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42603c.C42604a;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42605d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.v */
public final class C41579v implements C42161ba {

    /* renamed from: a */
    public final C41273a f108047a;

    /* renamed from: b */
    C39382ed f108048b;

    /* renamed from: a */
    public final void mo102203a() {
        VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) this.f108048b.f33526d_;
        if (videoRecordNewActivity != null && videoRecordNewActivity.f107286a.f99782r != null) {
            ((C40832n) videoRecordNewActivity.f107284Y.mo44946a()).mo100423d();
        }
    }

    /* renamed from: b */
    public final void mo102204b() {
        VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) this.f108048b.f33526d_;
        if (videoRecordNewActivity != null && videoRecordNewActivity.f107286a.f99782r != null) {
            ((C40832n) videoRecordNewActivity.f107284Y.mo44946a()).mo100424e();
        }
    }

    /* renamed from: a */
    public static boolean m132410a(VideoRecordNewActivity videoRecordNewActivity) {
        if (!C6399b.m19944t() || videoRecordNewActivity == null) {
            return false;
        }
        if (videoRecordNewActivity.f107286a != null && videoRecordNewActivity.f107286a.f99776l != null && videoRecordNewActivity.f107286a.f99776l.size() > 0) {
            TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) videoRecordNewActivity.f107286a.f99776l.get(0);
            if (timeSpeedModelExtension != null) {
                return timeSpeedModelExtension.isBusiSticker();
            }
        } else if (!(videoRecordNewActivity.f107324j == null || videoRecordNewActivity.f107324j.mo100301b() == null)) {
            return videoRecordNewActivity.f107324j.mo100301b().isBusi();
        }
        return false;
    }

    public C41579v(C39382ed edVar, C41273a aVar) {
        this.f108048b = edVar;
        this.f108047a = aVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42363m.class) {
            return null;
        }
        return new C42159az<T>() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ C7581n mo102205a() {
                C41579v.this.mo102204b();
                return null;
            }

            /* renamed from: a */
            private static C0902i<String, String> m132414a(JSONObject jSONObject) {
                String str;
                String str2;
                String str3 = "";
                try {
                    str2 = jSONObject.getString("shoot_way");
                    try {
                        str = jSONObject.getString("creation_id");
                    } catch (JSONException unused) {
                        str = str3;
                        return new C0902i<>(str2, str);
                    }
                } catch (JSONException unused2) {
                    str2 = "";
                    str = str3;
                    return new C0902i<>(str2, str);
                }
                return new C0902i<>(str2, str);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ C7581n mo102206a(C42605d dVar) {
                if (C41579v.this.f108047a != null) {
                    C41579v.this.mo102204b();
                    C41579v.this.f108047a.mo97901a(dVar.f110761a, dVar.f110762b, dVar.f110763c, dVar.f110764d);
                }
                new C41711y(dVar, C41579v.this.f108048b).mo102482a();
                return null;
            }

            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                Serializable serializable;
                JSONObject S = C41579v.this.f108048b.mo97966S();
                C6907h.onEvent(MobClick.obtain().setEventName("change_music").setLabelName("shoot_page").setJsonObject(S));
                Bundle bundle = new Bundle();
                VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) C41579v.this.f108048b.f33526d_;
                if (!(videoRecordNewActivity == null || videoRecordNewActivity.f107334t == null)) {
                    videoRecordNewActivity.f107334t.mo56289i(true);
                }
                if (videoRecordNewActivity == null || videoRecordNewActivity.f107261B == null || C41579v.m132410a(videoRecordNewActivity)) {
                    if (videoRecordNewActivity != null && videoRecordNewActivity.f107286a != null && videoRecordNewActivity.f107286a.f99776l != null && videoRecordNewActivity.f107286a.f99776l.size() > 0) {
                        TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) videoRecordNewActivity.f107286a.f99776l.get(0);
                        if (timeSpeedModelExtension != null && !C6307b.m19566a((Collection<T>) timeSpeedModelExtension.getStickerMusicIds())) {
                            bundle.putString("first_sticker_music_ids", C35563c.f93239b.mo15979b((Object) timeSpeedModelExtension.getStickerMusicIds()));
                            StringBuilder sb = new StringBuilder();
                            sb.append(timeSpeedModelExtension.getStickerId());
                            bundle.putString("first_sticker_id", sb.toString());
                            bundle.putBoolean("is_busi_sticker", timeSpeedModelExtension.isBusiSticker());
                        }
                        if (!(timeSpeedModelExtension == null || timeSpeedModelExtension.getHashtag() == null)) {
                            bundle.putString("challenge", timeSpeedModelExtension.getHashtag().cid);
                        }
                    } else if (!(videoRecordNewActivity == null || videoRecordNewActivity.f107324j == null || videoRecordNewActivity.f107324j.mo100301b() == null)) {
                        List musicIds = videoRecordNewActivity.f107324j.mo100301b().getMusicIds();
                        if (musicIds != null && musicIds.size() > 0) {
                            bundle.putString("first_sticker_music_ids", C35563c.f93239b.mo15979b((Object) musicIds));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(videoRecordNewActivity.f107324j.mo100301b().getStickerId());
                            bundle.putString("first_sticker_id", sb2.toString());
                            bundle.putBoolean("is_busi_sticker", videoRecordNewActivity.f107324j.mo100301b().isBusi());
                        }
                        if (!(videoRecordNewActivity.f107324j == null || videoRecordNewActivity.f107324j.mo100309d() == null)) {
                            bundle.putString("challenge", videoRecordNewActivity.f107324j.mo100309d().cid);
                        }
                    }
                }
                if (C39360dw.m125725a().f102247b.size() > 0) {
                    bundle.putString("challenge", ((AVChallenge) C39360dw.m125725a().f102247b.get(0)).cid);
                }
                String str = "sticker_music";
                if (videoRecordNewActivity == null) {
                    serializable = null;
                } else {
                    serializable = videoRecordNewActivity.f107261B;
                }
                bundle.putSerializable(str, serializable);
                C41579v.this.mo102203a();
                C0902i a = m132414a(S);
                IAVMusicService iAVMusicService = C35563c.f93246i;
                FragmentActivity O = C41579v.this.f108048b.mo97962O();
                iAVMusicService.mo103854a((Activity) O, (int) OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, C42604a.m135390a(C41579v.this.f108048b.mo30999a((int) R.string.zm), 2, true, bundle, (String) a.f3154a, (String) a.f3155b), (C7562b<? super C42605d, C7581n>) new C41659w<Object,C7581n>(this), (C7561a<C7581n>) new C41710x<C7581n>(this));
            }
        };
    }
}
