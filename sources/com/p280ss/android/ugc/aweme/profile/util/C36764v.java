package com.p280ss.android.ugc.aweme.profile.util;

import android.content.SharedPreferences;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.util.v */
public final class C36764v {

    /* renamed from: a */
    public static final C36765a f96491a = new C36765a(null);

    /* renamed from: com.ss.android.ugc.aweme.profile.util.v$a */
    public static final class C36765a {
        private C36765a() {
        }

        /* renamed from: a */
        public final boolean mo93096a() {
            return m118501b().getBoolean("enalbe_youtube_request_server_auth_code", false);
        }

        /* renamed from: b */
        private static SharedPreferences m118501b() {
            SharedPreferences a = C7285c.m22838a(C6399b.m19921a(), "authorization_sp_file", 0);
            C7573i.m23582a((Object) a, "AppContextManager.getApp…LE, Context.MODE_PRIVATE)");
            return a;
        }

        public /* synthetic */ C36765a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public static final boolean m118500a() {
        return f96491a.mo93096a();
    }
}
