package com.p280ss.android.ugc.aweme.user;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.account.C18892b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.user.a */
public final class C42800a {

    /* renamed from: f */
    public static final C42801a f111243f = new C42801a(null);
    @C6593c(mo15949a = "uid")

    /* renamed from: a */
    public final String f111244a;
    @C6593c(mo15949a = "short_id")

    /* renamed from: b */
    public final String f111245b;
    @C6593c(mo15949a = "unique_id")

    /* renamed from: c */
    public final String f111246c;
    @C6593c(mo15949a = "nickname")

    /* renamed from: d */
    public final String f111247d;
    @C6593c(mo15949a = "avatar_url")

    /* renamed from: e */
    public final String f111248e;

    /* renamed from: com.ss.android.ugc.aweme.user.a$a */
    public static final class C42801a {
        private C42801a() {
        }

        public /* synthetic */ C42801a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C42800a m135829a(C18892b bVar) {
            C7573i.m23587b(bVar, "u");
            String str = bVar.f50900h;
            C7573i.m23582a((Object) str, "u.userName");
            String str2 = bVar.f50902j;
            C7573i.m23582a((Object) str2, "u.avatarUrl");
            C42800a aVar = new C42800a(String.valueOf(bVar.f34078a), "", "", str, str2);
            return aVar;
        }

        /* renamed from: a */
        public static C42800a m135830a(User user) {
            String str;
            boolean z;
            C7573i.m23587b(user, "u");
            String uid = user.getUid();
            C7573i.m23582a((Object) uid, "u.uid");
            String shortId = user.getShortId();
            C7573i.m23582a((Object) shortId, "u.shortId");
            String uniqueId = user.getUniqueId();
            C7573i.m23582a((Object) uniqueId, "u.uniqueId");
            String nickname = user.getNickname();
            C7573i.m23582a((Object) nickname, "u.nickname");
            if (user.getAvatarThumb() != null) {
                UrlModel avatarThumb = user.getAvatarThumb();
                C7573i.m23582a((Object) avatarThumb, "u.avatarThumb");
                Collection urlList = avatarThumb.getUrlList();
                if (urlList == null || urlList.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    UrlModel avatarThumb2 = user.getAvatarThumb();
                    C7573i.m23582a((Object) avatarThumb2, "u.avatarThumb");
                    str = (String) avatarThumb2.getUrlList().get(0);
                    String str2 = str;
                    C7573i.m23582a((Object) str2, "if (u.avatarThumb == nul… u.avatarThumb.urlList[0]");
                    C42800a aVar = new C42800a(uid, shortId, uniqueId, nickname, str2);
                    return aVar;
                }
            }
            str = "";
            String str22 = str;
            C7573i.m23582a((Object) str22, "if (u.avatarThumb == nul… u.avatarThumb.urlList[0]");
            C42800a aVar2 = new C42800a(uid, shortId, uniqueId, nickname, str22);
            return aVar2;
        }
    }

    /* renamed from: a */
    public static final C42800a m135827a(C18892b bVar) {
        return C42801a.m135829a(bVar);
    }

    /* renamed from: a */
    public final String mo104443a() {
        boolean z;
        CharSequence charSequence = this.f111246c;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.f111245b;
        }
        return this.f111246c;
    }

    public C42800a(String str, String str2, String str3, String str4, String str5) {
        C7573i.m23587b(str, "uid");
        C7573i.m23587b(str2, "shortId");
        C7573i.m23587b(str3, "uniqueId");
        C7573i.m23587b(str4, "nickname");
        C7573i.m23587b(str5, "avatarUrl");
        this.f111244a = str;
        this.f111245b = str2;
        this.f111246c = str3;
        this.f111247d = str4;
        this.f111248e = str5;
    }

    public /* synthetic */ C42800a(String str, String str2, String str3, String str4, String str5, int i, C7571f fVar) {
        this(str, "", "", "", "");
    }
}
