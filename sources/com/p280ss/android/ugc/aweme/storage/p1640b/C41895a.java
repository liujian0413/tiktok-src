package com.p280ss.android.ugc.aweme.storage.p1640b;

import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1601c.C40517g;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.storage.b.a */
public final class C41895a {

    /* renamed from: a */
    public static final C41895a f108972a = new C41895a();

    /* renamed from: b */
    private static final HashSet<String> f108973b;

    private C41895a() {
    }

    /* renamed from: a */
    public static HashSet<String> m133242a() {
        return f108973b;
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(m133243b());
        f108973b = hashSet;
    }

    /* renamed from: b */
    private static Set<String> m133243b() {
        HashSet hashSet = new HashSet();
        hashSet.add(C39811er.f103469e);
        hashSet.add(C39811er.f103470f);
        hashSet.add(C39811er.f103472h);
        hashSet.add(C39811er.f103475k);
        hashSet.add(C39811er.f103476l);
        hashSet.add(C39811er.f103477m);
        hashSet.add(C39811er.f103478n);
        hashSet.add(C39811er.f103480p);
        hashSet.add(C39811er.f103481q);
        hashSet.add(C39811er.f103482r);
        File file = EffectPlatform.f72449a;
        C7573i.m23582a((Object) file, "EffectPlatform.LOCAL_CACHEDIR");
        hashSet.add(file.getPath());
        hashSet.add(C39811er.f103483s);
        hashSet.add(C39811er.f103484t);
        hashSet.add(C39811er.f103485u);
        hashSet.add(C39811er.f103486v);
        hashSet.add(C39811er.f103487w);
        hashSet.add(C39810eq.f103465a);
        StringBuilder sb = new StringBuilder();
        sb.append(C39811er.f103468d);
        sb.append("ve_frame_cache2");
        hashSet.add(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C39811er.f103468d);
        sb2.append("mvtheme");
        hashSet.add(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(C39811er.f103468d);
        sb3.append("filter");
        hashSet.add(sb3.toString());
        hashSet.add(C40517g.m129522a());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C39811er.f103468d);
        sb4.append("shortvideo/shoot/");
        hashSet.add(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(C39811er.f103468d);
        sb5.append("shortvideo/videoedit/");
        hashSet.add(sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append(C39811er.f103468d);
        sb6.append("shortvideo/publish");
        hashSet.add(sb6.toString());
        StringBuilder sb7 = new StringBuilder();
        sb7.append(C39811er.f103468d);
        sb7.append("shortvideo/cache/");
        hashSet.add(sb7.toString());
        StringBuilder sb8 = new StringBuilder();
        sb8.append(C39811er.f103468d);
        sb8.append("shortvideo/resources/");
        hashSet.add(sb8.toString());
        StringBuilder sb9 = new StringBuilder();
        sb9.append(C39811er.f103468d);
        sb9.append("shortvideo/draft/");
        hashSet.add(sb9.toString());
        return hashSet;
    }
}
