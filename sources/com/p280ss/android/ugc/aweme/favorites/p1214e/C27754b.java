package com.p280ss.android.ugc.aweme.favorites.p1214e;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.google.common.collect.C17795bu;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25242ao;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.feed.C28410h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.location.C32616a;
import com.p280ss.android.ugc.aweme.login.utils.C32698a;
import com.p280ss.android.ugc.aweme.main.C32961dd;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.p280ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity;
import com.p280ss.android.ugc.aweme.utils.permission.C43162f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.favorites.e.b */
public final class C27754b {
    /* renamed from: a */
    public static boolean m90997a() {
        if (!Keva.getRepo("collect").getBoolean("first_favourite_success", false) || !((Boolean) SharePrefCache.inst().getShouldShowFavouriteTip().mo59877d()).booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m91000b(Context context) {
        if (!C43162f.m136886a() || ((C32961dd) C23336d.m76560a(context, C32961dd.class)).mo60461b() || C32616a.m105657e() || C6399b.m19944t()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m90998a(Context context) {
        if (C21115b.m71197a().getCurUser().getCollectCount() > 0) {
            C7213d.m22500a();
            if (C7213d.m22502aq() && !TimeLockRuler.isTeenModeON() && !C28410h.m93379s() && !m91000b(context)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m90999a(Aweme aweme, String str) {
        if (aweme == null || !TextUtils.equals(str, "collection_video") || !aweme.isCollected() || (aweme.isCanPlay() && !C32698a.m105818a(aweme))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m90996a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            C7167b.m22380b().mo18647a().openMiniApp(context, str, new C33472a().mo85791b(str2).mo85790a());
        }
    }

    /* renamed from: a */
    public static void m90995a(Context context, NewFaceStickerBean newFaceStickerBean, String str, String str2) {
        C27752a.m90981b(newFaceStickerBean.f108868id, str, str2);
        C27752a.m90991i(newFaceStickerBean.f108868id, str, str2);
        StickerPropDetailActicity.m133131a(context, C17795bu.m59146a((E[]) new String[]{newFaceStickerBean.f108868id}));
    }

    /* renamed from: a */
    public static void m90993a(Activity activity, Challenge challenge, String str, String str2) {
        String str3;
        if (challenge != null) {
            String uuid = UUID.randomUUID().toString();
            C7195s a = C7195s.m22438a();
            StringBuilder sb = new StringBuilder("aweme://challenge/detail/");
            sb.append(challenge.getCid());
            C7203u a2 = C7203u.m22460a(sb.toString());
            String str4 = "is_commerce";
            if (C25242ao.m82976b(challenge)) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            a.mo18679a(activity, a2.mo18694a(str4, str3).mo18694a("enter_from", str).mo18694a("process_id", uuid).mo18695a());
            C27752a.m90975a(challenge.getCid(), str, str2, uuid);
            C27752a.m90987e(challenge.getCid(), str, str2);
        }
    }

    /* renamed from: a */
    public static void m90994a(Context context, Music music, String str, String str2) {
        if (music == null || music.getMusicStatus() != 0) {
            if (music != null) {
                if (!C33784d.m108931a(music.convertToMusicModel(), context, true)) {
                    C6907h.m21524a("enter_music_detail_failed", (Map) new C22984d().mo59973a("group_id", "").mo59973a("author_id", "").mo59973a("music_id", music.getMid()).mo59973a("enter_from", str).f60753a);
                    return;
                }
                C27752a.m90990h(music.getMid(), str, str2);
                C7195s a = C7195s.m22438a();
                StringBuilder sb = new StringBuilder("aweme://music/detail/");
                sb.append(music.getMid());
                a.mo18682a(sb.toString());
            }
            return;
        }
        String offlineDesc = music.getOfflineDesc();
        if (TextUtils.isEmpty(offlineDesc)) {
            offlineDesc = context.getString(R.string.chd);
        }
        C10761a.m31410e(context, offlineDesc).mo25750a();
    }
}
