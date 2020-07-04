package com.p280ss.android.ugc.gamora.recorder.choosemusic;

import android.app.Activity;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.C39382ed;
import com.p280ss.android.ugc.aweme.shortvideo.C41711y;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.p1619b.C41273a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40832n;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40994w;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42603c.C42604a;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42605d;
import com.p280ss.android.ugc.gamora.recorder.C44460aj;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.c */
public final class C44477c implements C44476b {

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.c$a */
    static final class C44478a extends Lambda implements C7562b<C42605d, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44477c f114749a;

        /* renamed from: b */
        final /* synthetic */ Activity f114750b;

        C44478a(C44477c cVar, Activity activity) {
            this.f114749a = cVar;
            this.f114750b = activity;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m140668a((C42605d) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140668a(C42605d dVar) {
            C7573i.m23587b(dVar, "resultBean");
            if (((VideoRecordNewActivity) this.f114750b).f107267H != null) {
                C44477c.m140664a((VideoRecordNewActivity) this.f114750b);
                C39382ed edVar = ((VideoRecordNewActivity) this.f114750b).f107267H;
                if (edVar != null) {
                    ((C41273a) edVar).mo97901a(dVar.f110761a, dVar.f110762b, dVar.f110763c, dVar.f110764d);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.ChooseMusicViewModel");
                }
            }
            new C41711y(dVar, ((VideoRecordNewActivity) this.f114750b).f107267H).mo102482a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.c$b */
    static final class C44479b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44477c f114751a;

        /* renamed from: b */
        final /* synthetic */ Activity f114752b;

        C44479b(C44477c cVar, Activity activity) {
            this.f114751a = cVar;
            this.f114752b = activity;
            super(0);
        }

        /* renamed from: a */
        private void m140669a() {
            C44477c.m140664a((VideoRecordNewActivity) this.f114752b);
        }

        public final /* synthetic */ Object invoke() {
            m140669a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: a */
    public static void m140664a(VideoRecordNewActivity videoRecordNewActivity) {
        if (videoRecordNewActivity.f107286a.f99782r != null) {
            ((C40832n) videoRecordNewActivity.f107284Y.mo44946a()).mo100424e();
        }
    }

    /* renamed from: c */
    private static void m140666c(VideoRecordNewActivity videoRecordNewActivity) {
        if (videoRecordNewActivity.f107286a.f99782r != null) {
            ((C40832n) videoRecordNewActivity.f107284Y.mo44946a()).mo100423d();
        }
    }

    /* renamed from: a */
    private static C0902i<String, String> m140663a(JSONObject jSONObject) {
        String str;
        String str2;
        String str3 = "";
        String str4 = "";
        try {
            str2 = jSONObject.getString("shoot_way");
            C7573i.m23582a((Object) str2, "shootWayExtra.getString(\"shoot_way\")");
            try {
                str = jSONObject.getString("creation_id");
                C7573i.m23582a((Object) str, "shootWayExtra.getString(…ob.Video.KEY_CREATION_ID)");
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
            str2 = str3;
            str = str4;
            return new C0902i<>(str2, str);
        }
        return new C0902i<>(str2, str);
    }

    /* renamed from: b */
    private static boolean m140665b(VideoRecordNewActivity videoRecordNewActivity) {
        if (!C6399b.m19944t() || videoRecordNewActivity == null) {
            return false;
        }
        if (videoRecordNewActivity.f107286a != null && videoRecordNewActivity.f107286a.f99776l != null && videoRecordNewActivity.f107286a.f99776l.size() > 0) {
            TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) videoRecordNewActivity.f107286a.f99776l.get(0);
            if (timeSpeedModelExtension != null) {
                return timeSpeedModelExtension.isBusiSticker();
            }
        } else if (videoRecordNewActivity.f107324j != null) {
            C40994w wVar = videoRecordNewActivity.f107324j;
            C7573i.m23582a((Object) wVar, "activity.stickerModule");
            if (wVar.mo100301b() != null) {
                C40994w wVar2 = videoRecordNewActivity.f107324j;
                C7573i.m23582a((Object) wVar2, "activity.stickerModule");
                FaceStickerBean b = wVar2.mo100301b();
                if (b == null) {
                    C7573i.m23580a();
                }
                return b.isBusi();
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo106934a(Activity activity) {
        C7573i.m23587b(activity, "activity");
        C0063u a = C0069x.m159a((FragmentActivity) activity).mo147a(ShortVideoContextViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
        JSONObject a2 = C44460aj.m140631a((ShortVideoContextViewModel) a);
        C6907h.onEvent(MobClick.obtain().setEventName("change_music").setLabelName("shoot_page").setJsonObject(a2));
        if (activity instanceof VideoRecordNewActivity) {
            VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) activity;
            ASCameraView aSCameraView = videoRecordNewActivity.f107334t;
            if (aSCameraView != null) {
                C20749b effectController = aSCameraView.getEffectController();
                if (effectController != null) {
                    effectController.mo56116f(true);
                }
            }
            Bundle bundle = new Bundle();
            if (videoRecordNewActivity.f107261B == null || m140665b(videoRecordNewActivity)) {
                if (videoRecordNewActivity.f107286a != null && videoRecordNewActivity.f107286a.f99776l != null && videoRecordNewActivity.f107286a.f99776l.size() > 0) {
                    TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) videoRecordNewActivity.f107286a.f99776l.get(0);
                    if (timeSpeedModelExtension != null && !C6307b.m19566a((Collection<T>) timeSpeedModelExtension.getStickerMusicIds())) {
                        bundle.putString("first_sticker_music_ids", C35563c.f93239b.mo15979b((Object) timeSpeedModelExtension.getStickerMusicIds()));
                        StringBuilder sb = new StringBuilder();
                        sb.append(timeSpeedModelExtension.getStickerId());
                        bundle.putString("first_sticker_id", sb.toString());
                        bundle.putBoolean("is_busi_sticker", timeSpeedModelExtension.isBusiSticker());
                    }
                    if (!(timeSpeedModelExtension == null || timeSpeedModelExtension.getHashtag() == null)) {
                        String str = "challenge";
                        AVChallenge hashtag = timeSpeedModelExtension.getHashtag();
                        if (hashtag == null) {
                            C7573i.m23580a();
                        }
                        bundle.putString(str, hashtag.cid);
                    }
                } else if (videoRecordNewActivity.f107324j != null) {
                    C40994w wVar = videoRecordNewActivity.f107324j;
                    C7573i.m23582a((Object) wVar, "activity.stickerModule");
                    if (wVar.mo100301b() != null) {
                        C40994w wVar2 = videoRecordNewActivity.f107324j;
                        C7573i.m23582a((Object) wVar2, "activity.stickerModule");
                        FaceStickerBean b = wVar2.mo100301b();
                        if (b == null) {
                            C7573i.m23580a();
                        }
                        List musicIds = b.getMusicIds();
                        if (musicIds != null && musicIds.size() > 0) {
                            bundle.putString("first_sticker_music_ids", C35563c.f93239b.mo15979b((Object) musicIds));
                            String str2 = "first_sticker_id";
                            StringBuilder sb2 = new StringBuilder();
                            C40994w wVar3 = videoRecordNewActivity.f107324j;
                            C7573i.m23582a((Object) wVar3, "activity.stickerModule");
                            FaceStickerBean b2 = wVar3.mo100301b();
                            if (b2 == null) {
                                C7573i.m23580a();
                            }
                            sb2.append(b2.getStickerId());
                            bundle.putString(str2, sb2.toString());
                            String str3 = "is_busi_sticker";
                            C40994w wVar4 = videoRecordNewActivity.f107324j;
                            C7573i.m23582a((Object) wVar4, "activity.stickerModule");
                            FaceStickerBean b3 = wVar4.mo100301b();
                            if (b3 == null) {
                                C7573i.m23580a();
                            }
                            bundle.putBoolean(str3, b3.isBusi());
                        }
                        if (videoRecordNewActivity.f107324j != null) {
                            C40994w wVar5 = videoRecordNewActivity.f107324j;
                            C7573i.m23582a((Object) wVar5, "activity.stickerModule");
                            if (wVar5.mo100309d() != null) {
                                String str4 = "challenge";
                                C40994w wVar6 = videoRecordNewActivity.f107324j;
                                C7573i.m23582a((Object) wVar6, "activity.stickerModule");
                                AVChallenge d = wVar6.mo100309d();
                                if (d == null) {
                                    C7573i.m23580a();
                                }
                                bundle.putString(str4, d.cid);
                            }
                        }
                    }
                }
            }
            C39360dw a3 = C39360dw.m125725a();
            C7573i.m23582a((Object) a3, "PublishManager.inst()");
            if (a3.f102247b.size() > 0) {
                C39360dw a4 = C39360dw.m125725a();
                C7573i.m23582a((Object) a4, "PublishManager.inst()");
                bundle.putString("challenge", ((AVChallenge) a4.f102247b.get(0)).cid);
            }
            bundle.putSerializable("sticker_music", videoRecordNewActivity.f107261B);
            m140666c(videoRecordNewActivity);
            C0902i a5 = m140663a(a2);
            C35563c.f93246i.mo103854a(activity, (int) OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, C42604a.m135390a(activity.getString(R.string.zm), 2, true, bundle, (String) a5.f3154a, (String) a5.f3155b), (C7562b<? super C42605d, C7581n>) new C44478a<Object,C7581n>(this, activity), (C7561a<C7581n>) new C44479b<C7581n>(this, activity));
        }
    }
}
