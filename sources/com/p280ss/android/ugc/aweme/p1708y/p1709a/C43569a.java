package com.p280ss.android.ugc.aweme.p1708y.p1709a;

import com.p280ss.android.ugc.aweme.history.C30232c;
import com.p280ss.android.ugc.aweme.music.dislike.C33790a;
import com.p280ss.android.ugc.aweme.p1017ao.p1018a.C22665a;
import com.p280ss.android.ugc.aweme.p1040aq.C23067a;
import com.p280ss.android.ugc.aweme.p1043at.C23091a;
import com.p280ss.android.ugc.aweme.p1072bc.C23527a;
import com.p280ss.android.ugc.aweme.p1708y.p1709a.p1710a.C43571a;
import com.p280ss.android.ugc.aweme.p1708y.p1709a.p1710a.C43573b;
import com.p280ss.android.ugc.aweme.p1708y.p1709a.p1710a.C43574c;
import com.p280ss.android.ugc.aweme.p1708y.p1709a.p1710a.C43575d;
import com.p280ss.android.ugc.aweme.p1708y.p1709a.p1710a.C43576e;
import com.p280ss.android.ugc.aweme.p1708y.p1709a.p1710a.C43577f;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.y.a.a */
public final class C43569a {

    /* renamed from: a */
    public static final Map<Object, Object> f112818a = new LinkedHashMap();

    /* renamed from: b */
    public static final C43570a f112819b = new C43570a(null);

    /* renamed from: com.ss.android.ugc.aweme.y.a.a$a */
    public static final class C43570a {
        private C43570a() {
        }

        public /* synthetic */ C43570a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final <T> T mo105516a(Class<T> cls) {
            C7573i.m23587b(cls, "clazz");
            T t = C43569a.f112818a.get(cls);
            if (t != null) {
                return t;
            }
            T b = m138094b(cls);
            C43569a.f112818a.put(cls, b);
            return b;
        }

        /* renamed from: b */
        private static <T> T m138094b(Class<T> cls) {
            if (C7573i.m23585a((Object) cls, (Object) C43574c.class)) {
                return new C22665a();
            }
            if (C7573i.m23585a((Object) cls, (Object) C43571a.class)) {
                return new C30232c();
            }
            if (C7573i.m23585a((Object) cls, (Object) C43573b.class)) {
                return new C33790a();
            }
            if (C7573i.m23585a((Object) cls, (Object) C43576e.class)) {
                return new C23091a();
            }
            if (C7573i.m23585a((Object) cls, (Object) C43575d.class)) {
                return new C23067a();
            }
            if (C7573i.m23585a((Object) cls, (Object) C43577f.class)) {
                return new C23527a();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(cls);
            sb.append("  impl not register");
            throw new Exception(sb.toString());
        }
    }

    /* renamed from: a */
    public static final <T> T m138093a(Class<T> cls) {
        return f112819b.mo105516a(cls);
    }
}
