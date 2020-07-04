package com.p280ss.android.ugc.aweme.live;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.C1642a;
import com.bytedance.android.live.base.p123sp.C2384a;
import com.bytedance.android.livesdk.feed.p227b.C5951b;
import com.bytedance.android.livesdkapi.C9469i;
import com.bytedance.android.livesdkapi.depend.model.live.C9383t.C9384a;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.service.C9515c;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.util.C22328g;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.live.p1363c.C32488k;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.story.C41983b;
import com.p280ss.android.ugc.aweme.story.live.C41989d;
import com.p280ss.android.ugc.aweme.utils.C42996by;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.permission.C43162f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.live.a */
public class C32430a {

    /* renamed from: a */
    public static boolean f84599a;

    /* renamed from: b */
    public static boolean f84600b;

    /* renamed from: a */
    static final /* synthetic */ void m105061a(String str, Bundle bundle, long j, DialogInterface dialogInterface, int i) {
        if (TextUtils.equals(str, "push")) {
            C41989d.m133478a(bundle.getString("anchor_id", ""), j, "no_wifi_dialog_cancel");
        }
        dialogInterface.dismiss();
    }

    /* renamed from: a */
    public static boolean m105062a(User user) {
        if (user == null || !user.isLive() || !C41983b.m133444a()) {
            return false;
        }
        if (m105064b(user)) {
            return m105066c(user);
        }
        return true;
    }

    /* renamed from: e */
    public static C9515c m105068e() {
        C9515c d = m105067d();
        m105072i();
        return d;
    }

    /* renamed from: a */
    public static void m105053a() {
        if (!f84600b) {
            C9469i.m27987a();
            C9469i.m27989b();
        }
        f84600b = true;
    }

    /* renamed from: f */
    public static boolean m105069f() {
        if (m105067d() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static void m105070g() {
        Context a = C6399b.m19921a();
        if (a != null) {
            C32528i.m105350a(a);
        }
    }

    /* renamed from: i */
    private static void m105072i() {
        if (!f84599a) {
            C9469i.m27987a();
            m105065c();
        }
        f84599a = true;
    }

    /* renamed from: b */
    public static String m105063b() {
        if (C6399b.m19946v()) {
            return "webcast.musical.ly";
        }
        if (C6399b.m19947w()) {
            return "webcast.tiktokv.com";
        }
        return "webcast.amemv.com";
    }

    /* renamed from: c */
    public static void m105065c() {
        try {
            C22328g.m73925a(C1642a.m8034a("https://%s/", new Object[]{m105063b()}));
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static C9515c m105067d() {
        C9515c d = C9469i.m27992d();
        if (d == null) {
            synchronized (C32430a.class) {
                d = C9469i.m27992d();
                if (d == null) {
                    C32529j.m105351a();
                    C9469i.m27988a(new C32488k(), true);
                    C32507e.m105299a(C9469i.m27993e());
                    C9515c d2 = C9469i.m27992d();
                    return d2;
                }
            }
        }
        if (C32507e.m105302c() == null) {
            C32529j.m105351a();
            C9469i.m27988a(new C32488k(), true);
            C32507e.m105299a(C9469i.m27993e());
            d = C9469i.m27992d();
        }
        return d;
    }

    /* renamed from: h */
    public static boolean m105071h() {
        final Activity g = C6405d.m19984g();
        if (g == null) {
            return false;
        }
        if (C43122ff.m136767b()) {
            C6877n.m21407a("aweme_child_mode_live", "", null);
        }
        if (C43162f.m136885a(g) == 0 && C43162f.m136887b(g) == 0 && C43162f.m136888c(g) == 0) {
            m105054a(g);
        } else {
            C22477b.m74364a(g, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"}, new C22480b() {
                /* renamed from: a */
                public final void mo53549a(String[] strArr, int[] iArr) {
                    int length = iArr.length;
                    int i = 0;
                    while (i < length) {
                        if (iArr[i] == 0) {
                            i++;
                        } else {
                            return;
                        }
                    }
                    C32430a.m105054a(g);
                }
            });
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m105064b(User user) {
        if (user == null || !user.isSecret()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m105054a(Activity activity) {
        Intent intent = new Intent();
        intent.putExtra("shoot_way", "direct_shoot");
        intent.putExtra("to_live", true);
        intent.putExtra("translation_type", 3);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity(activity, intent, true, true, ((IAVService) ServiceManager.get().getService(IAVService.class)).isRecording());
    }

    /* renamed from: c */
    private static boolean m105066c(User user) {
        if (user == null || (user.getFollowStatus() != 1 && user.getFollowStatus() != 2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m105059a(Context context, Bundle bundle) {
        if (m105068e() != null) {
            C5951b.m18636a(C9469i.m27993e());
            HashMap hashMap = new HashMap();
            hashMap.put("intercept", "new_style");
            if (bundle.getBoolean("enter_from_live_square", false)) {
                hashMap.put("enter_from_live_square", "live_square");
            }
            if (bundle == null || !bundle.getBoolean("live.intent.extra.FROM_NEW_STYLE", false) || C9469i.m27992d() == null || C9469i.m27992d().mo22024j() == null || !C9469i.m27992d().mo22024j().mo11445a(hashMap)) {
                LiveFeedActivity.m105014a(context, null);
            }
        }
    }

    /* renamed from: a */
    private static void m105060a(String str, Bundle bundle) {
        if (bundle != null && !TextUtils.isEmpty(str)) {
            boolean z = true;
            try {
                Boolean enableEnterLiveRoomStreamOpt = C30199h.m98861a().getEnableEnterLiveRoomStreamOpt();
                if (enableEnterLiveRoomStreamOpt != null && !enableEnterLiveRoomStreamOpt.booleanValue()) {
                    z = false;
                }
            } catch (NullValueException unused) {
            }
            SlimRoom slimRoom = null;
            if (z) {
                slimRoom = (SlimRoom) C42996by.m136484a(str, SlimRoom.class);
            }
            if (slimRoom != null) {
                bundle.putString("live.intent.extra.PULL_STREAM_URL", slimRoom.buildPullUrl());
                bundle.putString("live.intent.extra.PULL_SDK_PARAMS", slimRoom.getSdkParams());
                bundle.putString("live.intent.extra.PULL_STREAM_DATA", slimRoom.getMultiStreamData());
                bundle.putString("live.intent.extra.PULL_DEFAULT_RESOLUTION", slimRoom.getMultiStreamDefaultQualitySdkKey());
                C9384a aVar = slimRoom.getStreamUrlExtraSafely().f25790n;
                if (aVar != null) {
                    bundle.putBoolean("live.intent.extra.EXTRA_STREAM_SR_ENABLED", aVar.f25798a);
                    bundle.putBoolean("live.intent.extra.EXTRA_STREAM_SR_ANTI_ALIAS", aVar.f25799b);
                    bundle.putInt("live.intent.extra.EXTRA_STREAM_SR_STRENGTH", aVar.f25800c);
                }
                bundle.putInt("live.intent.extra.STREAM_TYPE", slimRoom.getStreamType().ordinal());
                bundle.putString("live.intent.extra.PRIVATE_INFO", slimRoom.getPrivateInfo());
            }
        }
    }

    /* renamed from: a */
    public static void m105055a(Context context, long j, Bundle bundle, String str) {
        m105056a(context, j, (String) null, bundle, str);
    }

    /* renamed from: a */
    public static void m105056a(Context context, long j, String str, Bundle bundle, String str2) {
        m105057a(context, j, str, bundle, str2, null);
    }

    /* renamed from: a */
    public static void m105057a(Context context, long j, String str, Bundle bundle, String str2, List<Long> list) {
        Context context2 = context;
        long j2 = j;
        Bundle bundle2 = bundle;
        String str3 = str2;
        if (m105068e() != null) {
            if (!C6399b.m19944t() || C21115b.m71197a().isLogin()) {
                if (C43122ff.m136767b()) {
                    C6877n.m21407a("aweme_child_mode_live", "", null);
                }
                if (NetworkUtils.m19548b(context) || C2384a.m10042b(context) || !(context2 instanceof Activity) || (!C6399b.m19944t() && C6399b.m19944t())) {
                    m105060a(str, bundle);
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("enter_from_merge", str3);
                    String string = bundle2.getString("live.intent.extra.ENTER_AWEME_ID");
                    if (!TextUtils.isEmpty(string)) {
                        bundle3.putLong("video_id", Long.valueOf(string).longValue());
                    }
                    String string2 = bundle2.getString("enter_method");
                    if (!TextUtils.isEmpty(string2)) {
                        bundle3.putString("enter_method", string2);
                    }
                    String string3 = bundle2.getString("previous_page");
                    if (!TextUtils.isEmpty(string3)) {
                        bundle3.putString("previous_page", string3);
                    }
                    bundle2.putBundle("live.intent.extra.ENTER_LIVE_EXTRA", bundle3);
                    if (!C6307b.m19566a((Collection<T>) list)) {
                        long[] jArr = new long[list.size()];
                        for (int i = 0; i < list.size(); i++) {
                            jArr[i] = ((Long) list.get(i)).longValue();
                        }
                        bundle2.putLongArray("live.intent.extra.ENTER_ROOM_IDS", jArr);
                    }
                    LivePlayActivity.m105022a(context, j2, bundle2);
                    return;
                }
                C10741a b = new C10741a(context).mo25657b((int) R.string.fol);
                C32467b bVar = new C32467b(context, j, str, bundle, str2, list);
                b.mo25650a((int) R.string.afn, (OnClickListener) bVar).mo25658b((int) R.string.w_, (OnClickListener) new C32469c(str3, bundle2, j2)).mo25656a().mo25637a();
            } else if (context2 instanceof Activity) {
                Bundle bundle4 = new Bundle();
                bundle2.putBoolean("block_bind_phone", true);
                C32656f.m105744a((Activity) context2, "personal_homepage", "click", bundle4, (C23305g) null);
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m105058a(Context context, long j, String str, Bundle bundle, String str2, List list, DialogInterface dialogInterface, int i) {
        C2384a.m10041a(context);
        m105057a(context, j, str, bundle, str2, list);
        dialogInterface.dismiss();
    }
}
