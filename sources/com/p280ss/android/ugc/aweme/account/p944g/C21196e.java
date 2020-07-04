package com.p280ss.android.ugc.aweme.account.p944g;

import com.bytedance.lobby.auth.AuthResult;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.g.e */
public interface C21196e {

    /* renamed from: c */
    public static final C21197a f56977c = C21197a.f56978a;

    /* renamed from: com.ss.android.ugc.aweme.account.g.e$a */
    public static final class C21197a {

        /* renamed from: a */
        static final /* synthetic */ C21197a f56978a = new C21197a();

        private C21197a() {
        }

        /* renamed from: a */
        public static C21196e m71365a(String str) {
            C7573i.m23587b(str, "providerId");
            switch (str.hashCode()) {
                case -1240244679:
                    if (str.equals("google")) {
                        return new C21192b();
                    }
                    break;
                case -916346253:
                    if (str.equals("twitter")) {
                        return new C21200h();
                    }
                    break;
                case 3765:
                    if (str.equals("vk")) {
                        return new C21202i();
                    }
                    break;
                case 3321844:
                    if (str.equals("line")) {
                        return new C21195d();
                    }
                    break;
                case 486515695:
                    if (str.equals("kakaotalk")) {
                        return new C21194c();
                    }
                    break;
                case 497130182:
                    if (str.equals("facebook")) {
                        return new C21191a();
                    }
                    break;
            }
            return null;
        }
    }

    /* renamed from: a */
    void mo57131a(AuthResult authResult);
}
