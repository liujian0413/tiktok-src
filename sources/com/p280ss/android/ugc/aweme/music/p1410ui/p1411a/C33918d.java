package com.p280ss.android.ugc.aweme.music.p1410ui.p1411a;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.ttsetting.C10969a;
import com.bytedance.ies.ugc.aweme.ttsetting.C10975b;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.music.experiment.MusicPartnersExperiment;
import com.p280ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.model.MusicCoverInfo;
import com.p280ss.android.ugc.aweme.music.model.ThirdMusicCoverItem;
import com.p280ss.android.ugc.aweme.music.p1409c.C33781b.C33782a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.music.ui.a.d */
public final class C33918d {

    /* renamed from: a */
    public static final C33918d f88507a = new C33918d();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static ThirdMusicCoverItem f88508b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static ThirdMusicCoverItem f88509c;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.a.d$a */
    public static final class C33919a implements C10975b {
        C33919a() {
        }

        /* renamed from: a */
        public final void mo26469a(Throwable th) {
            C7573i.m23587b(th, "throwable");
        }

        /* renamed from: a */
        public final void mo26470a(JSONObject jSONObject) {
            JSONObject jSONObject2;
            JSONObject jSONObject3 = null;
            if (jSONObject != null) {
                jSONObject2 = jSONObject.optJSONObject("aweme_third_party_music_cover");
            } else {
                jSONObject2 = null;
            }
            if (jSONObject != null) {
                jSONObject3 = jSONObject.optJSONObject("aweme_third_party_music_icon");
            }
            if (jSONObject2 != null) {
                try {
                    C33918d.f88508b = (ThirdMusicCoverItem) new C6600e().mo15974a(jSONObject2.toString(), ThirdMusicCoverItem.class);
                    C33782a.m108914a("third_music_cover_info", jSONObject2.toString(), "music_sp");
                } catch (Throwable unused) {
                    String jSONObject4 = jSONObject2.toString();
                    C7573i.m23582a((Object) jSONObject4, "jsonObjectCover.toString()");
                    C33918d.m109338b(jSONObject4);
                }
            }
            if (jSONObject3 != null) {
                try {
                    C33918d.f88509c = (ThirdMusicCoverItem) new C6600e().mo15974a(jSONObject3.toString(), ThirdMusicCoverItem.class);
                    C33782a.m108914a("third_music_icon_info", jSONObject3.toString(), "music_sp");
                } catch (Throwable unused2) {
                    String jSONObject5 = jSONObject3.toString();
                    C7573i.m23582a((Object) jSONObject5, "jsonObjectIcon.toString()");
                    C33918d.m109338b(jSONObject5);
                }
            }
        }
    }

    private C33918d() {
    }

    /* renamed from: a */
    public static void m109333a() {
        C10969a.m32155a((C10975b) new C33919a());
    }

    /* renamed from: b */
    private final ThirdMusicCoverItem m109336b() {
        if (f88508b == null) {
            String a = C33782a.m108912a("third_music_cover_info", "", "music_sp");
            if (!TextUtils.isEmpty(a)) {
                try {
                    f88508b = (ThirdMusicCoverItem) new C6600e().mo15974a(a, ThirdMusicCoverItem.class);
                } catch (Throwable unused) {
                    m109338b(a);
                }
            }
        }
        return f88508b;
    }

    /* renamed from: c */
    private final ThirdMusicCoverItem m109339c() {
        if (f88509c == null) {
            String a = C33782a.m108912a("third_music_icon_info", "", "music_sp");
            if (!TextUtils.isEmpty(a)) {
                try {
                    f88509c = (ThirdMusicCoverItem) new C6600e().mo15974a(a, ThirdMusicCoverItem.class);
                } catch (Throwable unused) {
                    m109338b(a);
                }
            }
        }
        return f88509c;
    }

    /* renamed from: b */
    public static void m109338b(String str) {
        C6379c.m19826a("third_music_json_parse_error", C6869c.m21381a().mo16887a("message", str).mo16888b());
    }

    /* renamed from: a */
    private static boolean m109335a(List<ExternalMusicInfo> list) {
        ExternalMusicInfo externalMusicInfo;
        if (C6307b.m19566a((Collection<T>) list)) {
            return false;
        }
        String str = null;
        if (list != null) {
            externalMusicInfo = (ExternalMusicInfo) list.get(0);
        } else {
            externalMusicInfo = null;
        }
        if (externalMusicInfo != null) {
            str = externalMusicInfo.getPartnerName();
        }
        return TextUtils.equals(str, "awa");
    }

    /* renamed from: a */
    public final List<String> mo86580a(String str) {
        ThirdMusicCoverItem thirdMusicCoverItem;
        if (!C6399b.m19944t() || !C6384b.m19835a().mo15292a(MusicPartnersExperiment.class, true, "music_detail_music_partners_new_style", C6384b.m19835a().mo15295d().music_detail_music_partners_new_style, false)) {
            thirdMusicCoverItem = m109336b();
        } else {
            thirdMusicCoverItem = m109339c();
        }
        if (thirdMusicCoverItem != null) {
            List<MusicCoverInfo> list = thirdMusicCoverItem.musicCoverInfoList;
            if (!C6307b.m19566a((Collection<T>) list)) {
                for (MusicCoverInfo musicCoverInfo : list) {
                    if (musicCoverInfo != null && TextUtils.equals(musicCoverInfo.partnerName, str)) {
                        return musicCoverInfo.coverUrlList;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo86581a(TextView textView, Music music, boolean z) {
        List list;
        int i;
        int i2;
        if (music != null) {
            list = music.getExternalMusicInfos();
        } else {
            list = null;
        }
        if (!m109335a(list)) {
            i = 0;
        } else if (z) {
            i = R.drawable.bkv;
        } else {
            i = R.drawable.bkw;
        }
        if (textView != null) {
            if (i > 0) {
                i2 = C23486n.m77122a(5.0d);
            } else {
                i2 = 0;
            }
            textView.setCompoundDrawablePadding(i2);
        }
        if (textView != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
        }
    }
}
