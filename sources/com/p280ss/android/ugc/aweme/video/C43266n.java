package com.p280ss.android.ugc.aweme.video;

import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34972b;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer;
import com.p280ss.android.ugc.aweme.video.p1700d.C43208c;
import com.p280ss.android.ugc.aweme.video.p1700d.C43209d;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.Type;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.n */
public final class C43266n implements C34972b {
    /* renamed from: a */
    public final IPlayer mo88612a(Type type) {
        return C43209d.m137008a(type);
    }

    /* renamed from: a */
    private static JSONObject m137246a(long j, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        C6869c a = C6869c.m21381a().mo16887a("duration", sb.toString());
        a.mo16882a("is_cache", Boolean.valueOf(z));
        a.mo16882a("h265", Boolean.valueOf(z2));
        a.mo16886a("video_duration", Long.valueOf(C43316v.m137451L().mo104910i()));
        C43208c.m137001a(a);
        return a.mo16888b();
    }

    /* renamed from: b */
    public final void mo88614b(String str, long j, Type type, boolean z, boolean z2) {
        String str2;
        if (j > 0) {
            switch (type) {
                case EXO:
                    str2 = "aweme_movie_play_exo";
                    break;
                case TT:
                    str2 = "aweme_movie_play_tt";
                    break;
                case IjkHardware:
                    str2 = "aweme_movie_ijk_hardware";
                    break;
                case TT_IJK_ENGINE:
                    str2 = "aweme_movie_tt_ijk_engine";
                    break;
                case TT_HARDWARE:
                    str2 = "aweme_movie_tt_hardware";
                    break;
                default:
                    str2 = "aweme_movie_play";
                    break;
            }
            C6907h.onEvent(MobClick.obtain().setEventName(str2).setLabelName("perf_monitor").setExtValueLong(j));
            C6877n.m21447a(str, m137246a(j, z, z2));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", str);
                jSONObject.put("player_type", str2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("duration", j);
                C6379c.m19828a("ttmp_play_info_ff", jSONObject, jSONObject2, (JSONObject) null);
            } catch (Throwable th) {
                C2077a.m9160a(th);
            }
        }
    }

    /* renamed from: a */
    public final void mo88613a(String str, long j, Type type, boolean z, boolean z2) {
        String str2;
        if (j > 0) {
            switch (type) {
                case EXO:
                    str2 = "aweme_movie_play_exo";
                    break;
                case TT:
                    str2 = "aweme_movie_play_tt";
                    break;
                case IjkHardware:
                    str2 = "aweme_movie_ijk_hardware";
                    break;
                case TT_IJK_ENGINE:
                    str2 = "aweme_movie_tt_ijk_engine";
                    break;
                default:
                    str2 = "aweme_movie_play";
                    break;
            }
            C6877n.m21447a(str, m137246a(j, z, z2));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", str);
                jSONObject.put("player_type", str2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("duration", j);
                C6379c.m19828a("ttmp_play_info_prepare", jSONObject, jSONObject2, (JSONObject) null);
            } catch (Throwable th) {
                C2077a.m9160a(th);
            }
        }
    }
}
