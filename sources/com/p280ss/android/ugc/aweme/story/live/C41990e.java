package com.p280ss.android.ugc.aweme.story.live;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.live.C32430a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.story.model.Story;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p346io.reactivex.p350f.C7332a;

/* renamed from: com.ss.android.ugc.aweme.story.live.e */
public final class C41990e {

    /* renamed from: a */
    private static C41990e f109067a = new C41990e();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f109068b = false;

    /* renamed from: com.ss.android.ugc.aweme.story.live.e$a */
    public static final class C41991a {

        /* renamed from: a */
        Context f109069a;

        /* renamed from: b */
        User f109070b;

        /* renamed from: c */
        Rect f109071c;

        /* renamed from: d */
        HashMap<String, String> f109072d = new HashMap<>();

        /* renamed from: e */
        String f109073e;

        /* renamed from: f */
        String f109074f;

        /* renamed from: g */
        String f109075g;

        /* renamed from: h */
        String f109076h;

        /* renamed from: i */
        Bundle f109077i;

        /* renamed from: j */
        List<Story> f109078j;

        /* renamed from: k */
        int f109079k = -1;

        /* renamed from: l */
        int f109080l;

        /* renamed from: m */
        long[] f109081m;

        /* renamed from: a */
        public final C41991a mo103117a(int i) {
            this.f109080l = 4;
            return this;
        }

        /* renamed from: b */
        public final C41991a mo103122b(String str) {
            this.f109074f = str;
            return this;
        }

        /* renamed from: c */
        public final C41991a mo103123c(String str) {
            this.f109075g = str;
            return this;
        }

        /* renamed from: d */
        public final C41991a mo103124d(String str) {
            this.f109076h = str;
            return this;
        }

        /* renamed from: a */
        public final C41991a mo103118a(Rect rect) {
            this.f109071c = rect;
            return this;
        }

        /* renamed from: a */
        public final C41991a mo103119a(Bundle bundle) {
            this.f109077i = bundle;
            return this;
        }

        /* renamed from: a */
        public final C41991a mo103120a(String str) {
            this.f109073e = str;
            return this;
        }

        public C41991a(Context context, User user) {
            this.f109069a = context;
            this.f109070b = user;
        }

        /* renamed from: a */
        public final C41991a mo103121a(String str, String str2) {
            this.f109072d.put(str, str2);
            return this;
        }
    }

    /* renamed from: a */
    public static C41990e m133498a() {
        return f109067a;
    }

    /* renamed from: b */
    public static boolean m133508b() {
        return C32430a.m105069f();
    }

    public C41990e() {
        if (C7332a.m23031b() == null && !C7163a.m22363a()) {
            C7332a.m23027a(C41992f.f109082a);
        }
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        if (iAccountService != null) {
            iAccountService.addLoginOrLogoutListener(C41993g.f109083a);
        }
    }

    /* renamed from: c */
    public static boolean m133510c() {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || !iUserService.isLogin() || !f109068b) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m133507b(boolean z) {
        f109068b = z;
    }

    /* renamed from: c */
    private static long m133509c(C41991a aVar) {
        String str;
        if (aVar.f109070b != null) {
            str = aVar.f109070b.getUid();
        } else {
            str = null;
        }
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    /* renamed from: a */
    static final /* synthetic */ void m133504a(Throwable th) throws Exception {
        if (th == null) {
            th = new IllegalStateException("unknown error");
        }
        C6921a.m21562b("Live", Log.getStackTraceString(th));
    }

    /* renamed from: b */
    private static List<Long> m133506b(C41991a aVar) {
        ArrayList arrayList = new ArrayList();
        if (aVar.f109078j != null) {
            for (Story story : aVar.f109078j) {
                if (story.getUserInfo() != null) {
                    arrayList.add(Long.valueOf(story.getUserInfo().roomId));
                }
            }
            return arrayList;
        } else if (aVar.f109081m == null || aVar.f109081m.length <= 0) {
            return null;
        } else {
            for (long valueOf : aVar.f109081m) {
                arrayList.add(Long.valueOf(valueOf));
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public static void m133503a(C41991a aVar) {
        Bundle bundle;
        int i = -1;
        try {
            if (!C6319n.m19593a(aVar.f109073e)) {
                i = Integer.parseInt(aVar.f109073e);
            }
        } catch (Throwable unused) {
        }
        if (aVar.f109077i == null) {
            bundle = new Bundle();
        } else {
            bundle = aVar.f109077i;
        }
        Bundle bundle2 = bundle;
        bundle2.putInt("live.intent.extra.ENTER_LIVE_ORDER", aVar.f109079k);
        bundle2.putInt("live.intent.extra.BACK_TAB_INDEX", i);
        bundle2.putString("live.intent.extra.REQUEST_ID", aVar.f109076h);
        bundle2.putLong("anchor_id", m133509c(aVar));
        for (String str : aVar.f109072d.keySet()) {
            bundle2.putString(str, (String) aVar.f109072d.get(str));
        }
        if (!TextUtils.isEmpty(aVar.f109075g)) {
            bundle2.putString("enter_method", aVar.f109075g);
        }
        bundle2.putParcelable("live.intent.extra.SOURCE_POSITION", aVar.f109071c);
        String str2 = null;
        long j = -1;
        if (aVar.f109070b != null) {
            str2 = aVar.f109070b.roomData;
            j = aVar.f109070b.roomId;
        }
        long j2 = j;
        C32430a.m105057a(aVar.f109069a, j2, str2, bundle2, aVar.f109074f, m133506b(aVar));
    }

    /* renamed from: a */
    public static void m133505a(boolean z) {
        C42961az.m136380a(new C41986a(z));
    }

    /* renamed from: a */
    public static void m133500a(Context context, Bundle bundle) {
        C32430a.m105059a(context, bundle);
    }

    /* renamed from: a */
    public final void mo103116a(Context context, User user, Rect rect, String str) {
        m133502a(context, user, (Rect) null, (String) null, str);
    }

    /* renamed from: a */
    public static void m133501a(Context context, User user, Rect rect, String str, Bundle bundle) {
        try {
            bundle.putLong("anchor_id", Long.valueOf(user.getUid()).longValue());
        } catch (Exception unused) {
        }
        C32430a.m105056a(context, user.roomId, user.roomData, bundle, str);
    }

    /* renamed from: a */
    private static void m133502a(Context context, User user, Rect rect, String str, String str2) {
        int i;
        try {
            if (!C6319n.m19593a((String) null)) {
                i = Integer.parseInt(null);
                Bundle bundle = new Bundle();
                bundle.putInt("live.intent.extra.ENTER_LIVE_ORDER", -1);
                bundle.putInt("live.intent.extra.BACK_TAB_INDEX", i);
                bundle.putParcelable("live.intent.extra.SOURCE_POSITION", rect);
                bundle.putLong("anchor_id", Long.valueOf(user.getUid()).longValue());
                C32430a.m105056a(context, user.roomId, user.roomData, bundle, str2);
            }
        } catch (Throwable unused) {
        }
        i = -1;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("live.intent.extra.ENTER_LIVE_ORDER", -1);
        bundle2.putInt("live.intent.extra.BACK_TAB_INDEX", i);
        bundle2.putParcelable("live.intent.extra.SOURCE_POSITION", rect);
        try {
            bundle2.putLong("anchor_id", Long.valueOf(user.getUid()).longValue());
        } catch (Exception unused2) {
        }
        C32430a.m105056a(context, user.roomId, user.roomData, bundle2, str2);
    }
}
