package com.p280ss.android.ugc.aweme.feed.p1234j;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p452h.C9412a;
import com.bytedance.ies.abmock.C6384b;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25072c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.experiment.CNYLiveRightViewsExperiment;
import com.p280ss.android.ugc.aweme.feed.C28676s;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28495n.C28497a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.feed.j.o */
public final class C28498o {

    /* renamed from: a */
    public static boolean f75119a;

    /* renamed from: a */
    public static boolean m93669a(Aweme aweme) {
        if (!C25072c.m82577c(aweme) || aweme == null || TextUtils.equals(C28495n.m93652b(aweme), aweme.getAuthorUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m93668a() {
        try {
            return !C6384b.m19835a().mo15292a(CNYLiveRightViewsExperiment.class, true, "live_hide_right_views", C6384b.m19835a().mo15295d().live_hide_right_views, false);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: b */
    public static void m93670b(Aweme aweme) {
        if (C25072c.m82577c(aweme)) {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from_merge", "topview");
            hashMap.put("enter_method", "");
            hashMap.put("anchor_id", C28495n.m93652b(aweme));
            hashMap.put("room_id", C28495n.m93645a(aweme));
            hashMap.put("action_type", "click");
            C6907h.m21524a("livesdk_live_show", (Map) hashMap);
        }
    }

    /* renamed from: a */
    public static void m93662a(Aweme aweme, String str) {
        m93663a(aweme, str, "none");
    }

    /* renamed from: a */
    public static void m93659a(final Context context, final Aweme aweme) {
        if (C25072c.m82577c(aweme) && context != null && aweme != null && !f75119a) {
            f75119a = true;
            C28495n.m93648a(aweme, (C28497a) new C28497a() {
                /* renamed from: b */
                public final void mo71717b() {
                    C28498o.f75119a = false;
                }

                /* renamed from: a */
                public final void mo71715a() {
                    C28498o.f75119a = false;
                    C28498o.m93665a(aweme, "ttlive_cny_inroom_all", false, "enter room fail");
                    C28498o.m93665a(aweme, "ttlive_cny_inroom_error", false, "enter room fail");
                }

                /* renamed from: a */
                public final void mo71716a(Room room) {
                    C28498o.f75119a = false;
                    if (!C6903bc.m21484c().mo59240a()) {
                        User user = new User();
                        user.setUid(String.valueOf(room.getOwnerUserId()));
                        user.roomId = room.getId();
                        Bundle a = C9412a.m27916a(room);
                        a.putString("enable_feed_drawer", "1");
                        a.putString("enter_method", "");
                        C28676s.m94345a(context, user, null, "topview", a);
                        C28498o.m93664a(aweme, "ttlive_cny_inroom_all", true);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m93661a(Aweme aweme, Aweme aweme2) {
        if (C25072c.m82575a(aweme) && aweme != null && aweme2 != null) {
            aweme.setUserDigg(aweme2.getUserDigg());
            aweme.setAuthor(aweme2.getAuthor());
        }
    }

    /* renamed from: a */
    public static void m93666a(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            C7492s.m23282a((C7495v<T>) new C28500p<T>(str, obj)).mo19304b(C7333a.m23044b()).mo19333l();
        }
    }

    /* renamed from: a */
    public static void m93664a(Aweme aweme, String str, boolean z) {
        m93665a(aweme, str, true, "");
    }

    /* renamed from: a */
    private static void m93663a(Aweme aweme, String str, String str2) {
        if (C25072c.m82577c(aweme) && aweme != null && aweme.getAuthor() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", C28495n.m93652b(aweme));
            hashMap.put("topview_video_id", aweme.getAid());
            if (!"none".equals(str2)) {
                hashMap.put("timing", str2);
            }
            C6907h.m21524a(str, (Map) hashMap);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m93667a(String str, Object obj, C47870u uVar) throws Exception {
        try {
            C3166a.m11961b(str, new C6600e().mo15979b(obj));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m93660a(Aweme aweme, View view, boolean z, boolean z2) {
        if (view != null) {
            int i = 0;
            if (C25072c.m82577c(aweme)) {
                boolean z3 = true;
                if (true != m93668a()) {
                    z3 = false;
                }
                if (!z3) {
                    i = 8;
                }
                view.setVisibility(i);
                return;
            }
            view.setVisibility(0);
        }
    }

    /* renamed from: a */
    public static void m93665a(Aweme aweme, String str, boolean z, String str2) {
        if (aweme != null && !TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("room_uid", C28495n.m93652b(aweme));
                jSONObject.put("video_id", aweme.getAid());
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("error_msg", str2);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("tag", "ttlive_sdk");
                jSONObject2.put("ttlive_sdk_version", "1380");
                jSONObject2.put("extra", jSONObject);
                C6877n.m21444a(str, z ^ true ? 1 : 0, jSONObject2);
            } catch (Throwable unused) {
            }
        }
    }
}
