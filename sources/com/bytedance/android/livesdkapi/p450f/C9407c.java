package com.bytedance.android.livesdkapi.p450f;

import com.bytedance.android.livesdkapi.C9469i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.android.livesdkapi.f.c */
public final class C9407c {

    /* renamed from: a */
    public static final List<String> f25888a = m27868b();

    /* renamed from: b */
    public static final List<Pattern> f25889b = m27869c();

    /* renamed from: c */
    public static final List<String> f25890c = m27870d();

    /* renamed from: d */
    public static final List<Pattern> f25891d = m27871e();

    /* renamed from: e */
    public static final List<String> f25892e = m27872f();

    /* renamed from: f */
    public static final List<Pattern> f25893f = m27873g();

    /* renamed from: g */
    public static final List<String> f25894g = m27874h();

    /* renamed from: h */
    public static final List<Pattern> f25895h = m27875i();

    /* renamed from: i */
    public static final List<String> f25896i = m27876j();

    /* renamed from: j */
    public static final List<Pattern> f25897j = m27877k();

    /* renamed from: k */
    public static final List<String> f25898k = m27878l();

    /* renamed from: l */
    public static final List<Pattern> f25899l = m27879m();

    /* renamed from: d */
    private static List<String> m27870d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("webcast_mt");
        return arrayList;
    }

    /* renamed from: n */
    private static List<String> m27880n() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("webcast_activity");
        return arrayList;
    }

    /* renamed from: b */
    private static List<String> m27868b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("webcast_douyin");
        arrayList.addAll(m27880n());
        return arrayList;
    }

    /* renamed from: f */
    private static List<String> m27872f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("webcast_pipixia");
        arrayList.addAll(m27880n());
        return arrayList;
    }

    /* renamed from: h */
    private static List<String> m27874h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("webcast_huoshan");
        arrayList.addAll(m27880n());
        return arrayList;
    }

    /* renamed from: j */
    private static List<String> m27876j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("webcast_xigua");
        arrayList.addAll(m27880n());
        return arrayList;
    }

    /* renamed from: l */
    private static List<String> m27878l() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("webcast_vigo");
        arrayList.addAll(m27880n());
        return arrayList;
    }

    /* renamed from: a */
    public static List<Pattern> m27867a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) C9469i.m27992d().mo22006a("live_gurd_patterns", new ArrayList())).iterator();
        while (it.hasNext()) {
            arrayList.add(Pattern.compile((String) it.next()));
        }
        return arrayList;
    }

    /* renamed from: e */
    private static List<Pattern> m27871e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pattern.compile(".musical.ly/falcon/"));
        arrayList.add(Pattern.compile(".tiktokv.com/falcon/"));
        arrayList.add(Pattern.compile(".akamaized.net/ies/resource/falcon/"));
        arrayList.add(Pattern.compile(".tiktokcdn.com/ies/resource/falcon/"));
        return arrayList;
    }

    /* renamed from: g */
    private static List<Pattern> m27873g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pattern.compile("api.ribaoapi.com/falcon/"));
        arrayList.add(Pattern.compile("s3.bytecdn.cn/ies/resource/falcon/"));
        arrayList.add(Pattern.compile("s3a.bytecdn.cn/ies/resource/falcon/"));
        arrayList.add(Pattern.compile("/*.snssdk.com/falcon/"));
        arrayList.add(Pattern.compile("webcast-ppx.snssdk.com/falcon/"));
        arrayList.add(Pattern.compile(".bytedance.net/falcon/"));
        return arrayList;
    }

    /* renamed from: i */
    private static List<Pattern> m27875i() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pattern.compile(".snssdk.com/falcon/"));
        arrayList.add(Pattern.compile("s3.bytecdn.cn/ies/resource/falcon/"));
        arrayList.add(Pattern.compile("s3a.bytecdn.cn/ies/resource/falcon/"));
        arrayList.add(Pattern.compile(".amemv.com/falcon/"));
        arrayList.add(Pattern.compile(".bytedance.net/falcon/"));
        arrayList.add(Pattern.compile(".huoshan.com/falcon/"));
        return arrayList;
    }

    /* renamed from: k */
    private static List<Pattern> m27877k() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pattern.compile(".snssdk.com/falcon/"));
        arrayList.add(Pattern.compile("s3.bytecdn.cn/ies/resource/falcon/"));
        arrayList.add(Pattern.compile("s3a.bytecdn.cn/ies/resource/falcon/"));
        arrayList.add(Pattern.compile(".bytedance.net/falcon/"));
        arrayList.add(Pattern.compile(".ixigua.com/falcon/"));
        arrayList.add(Pattern.compile("snssdk.com/feoffline/"));
        return arrayList;
    }

    /* renamed from: m */
    private static List<Pattern> m27879m() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pattern.compile(".hypstar.com/falcon/"));
        arrayList.add(Pattern.compile(".akamaized.net/ies/resource/falcon/"));
        arrayList.add(Pattern.compile(".hypstarcdn.com/ies/resource/falcon/"));
        return arrayList;
    }

    /* renamed from: c */
    private static List<Pattern> m27869c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pattern.compile(".snssdk.com/falcon/"));
        arrayList.add(Pattern.compile("s3.bytecdn.cn/aweme/resource/falcon/"));
        arrayList.add(Pattern.compile("s3a.bytecdn.cn/aweme/resource/falcon/"));
        arrayList.add(Pattern.compile("s3.bytecdn.cn/ies/resource/falcon/"));
        arrayList.add(Pattern.compile("s3a.bytecdn.cn/ies/resource/falcon/"));
        arrayList.add(Pattern.compile(".amemv.com/falcon/"));
        arrayList.add(Pattern.compile(".bytedance.net/falcon/"));
        return arrayList;
    }
}
