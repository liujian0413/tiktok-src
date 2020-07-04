package com.p280ss.android.ugc.aweme.music.p1409c;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.c.b */
public final class C33781b {

    /* renamed from: a */
    public static final C33782a f88142a = new C33782a(null);

    /* renamed from: com.ss.android.ugc.aweme.music.c.b$a */
    public static final class C33782a {
        private C33782a() {
        }

        public /* synthetic */ C33782a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static String m108912a(String str, String str2, String str3) {
            C7573i.m23587b(str, "key");
            C7573i.m23587b(str3, "repo");
            String string = Keva.getRepoFromSp(C6399b.m19921a(), str3, 0).getString(str, str2);
            C7573i.m23582a((Object) string, "keva.getString(key, default?:\"\")");
            return string;
        }

        /* renamed from: a */
        public static <T> List<T> m108913a(String str, Class<T> cls, String str2) {
            C7573i.m23587b(str, "key");
            C7573i.m23587b(cls, "clazz");
            C7573i.m23587b(str2, "repo");
            String string = Keva.getRepoFromSp(C6399b.m19921a(), str2, 0).getString(str, "");
            if (TextUtils.isEmpty(string)) {
                return new ArrayList<>();
            }
            List<T> parseArray = JSON.parseArray(string, cls);
            C7573i.m23582a((Object) parseArray, "JSON.parseArray(json, clazz)");
            return parseArray;
        }

        /* renamed from: a */
        public static <T> void m108914a(String str, T t, String str2) {
            C7573i.m23587b(str, "key");
            C7573i.m23587b(str2, "repo");
            Keva repoFromSp = Keva.getRepoFromSp(C6399b.m19921a(), str2, 0);
            if (t instanceof String) {
                repoFromSp.storeString(str, (String) t);
            } else if (t instanceof Boolean) {
                repoFromSp.storeBoolean(str, ((Boolean) t).booleanValue());
            } else {
                repoFromSp.storeString(str, JSON.toJSONString(t));
            }
        }

        /* renamed from: a */
        public static boolean m108915a(String str, Boolean bool, String str2) {
            C7573i.m23587b(str, "key");
            C7573i.m23587b(str2, "repo");
            boolean z = false;
            Keva repoFromSp = Keva.getRepoFromSp(C6399b.m19921a(), str2, 0);
            if (bool != null) {
                z = bool.booleanValue();
            }
            return repoFromSp.getBoolean(str, z);
        }
    }

    /* renamed from: a */
    public static final <T> List<T> m108909a(String str, Class<T> cls, String str2) {
        return C33782a.m108913a(str, cls, str2);
    }

    /* renamed from: a */
    public static final <T> void m108910a(String str, T t, String str2) {
        C33782a.m108914a(str, t, str2);
    }

    /* renamed from: a */
    public static final boolean m108911a(String str, Boolean bool, String str2) {
        return C33782a.m108915a(str, bool, str2);
    }
}
