package com.p280ss.android.ugc.aweme.web;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.sdk.webview.C20145l;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.web.i */
public final class C43447i implements C20145l {

    /* renamed from: a */
    private static C43447i f112527a = new C43447i();

    /* renamed from: c */
    private static boolean f112528c = true;

    /* renamed from: b */
    private String f112529b;

    private C43447i() {
    }

    /* renamed from: c */
    public static C43447i m137872c() {
        return f112527a;
    }

    /* renamed from: d */
    public static boolean m137873d() {
        return f112528c;
    }

    /* renamed from: h */
    public static String m137876h() {
        if (m137877i()) {
            return "ab3036fdba402306795f6bf85fdbf776";
        }
        return "a738646d5d1ed9ab8340e93ac28e131e";
    }

    /* renamed from: e */
    public static String m137874e() {
        File file = new File(C6399b.m19921a().getFilesDir(), "offline");
        C7276d.m22805a(file);
        return file.getPath();
    }

    /* renamed from: f */
    public static String m137875f() {
        if (C6399b.m19947w()) {
            return "gecko-sg.tiktokv.com";
        }
        if (C6399b.m19946v()) {
            return "gecko-va.musical.ly";
        }
        return "gecko.snssdk.com";
    }

    /* renamed from: j */
    private static String m137878j() {
        if (C6399b.m19947w()) {
            return "f9e6186803d872f739d3d1707d9a652e";
        }
        if (C6399b.m19946v()) {
            return "365b20e8f6c343df1eff65214a0e3e74";
        }
        return "2373bbcf94c1b893dad48961d0a2d086";
    }

    /* renamed from: k */
    private static String m137879k() {
        if (C6399b.m19947w()) {
            return "4776c874d6caa9b5e7c3ed2234893fd9";
        }
        if (C6399b.m19946v()) {
            return "95bcaef5f85b57bef49180849da0ab20";
        }
        return "2d15e0aa4fe4a5c91eb47210a6ddf467";
    }

    /* renamed from: a */
    public final String mo53916a() {
        File file = new File(m137874e(), mo105382g());
        C7276d.m22805a(file);
        return file.getPath();
    }

    /* renamed from: g */
    public final String mo105382g() {
        String str;
        if (TextUtils.isEmpty(this.f112529b)) {
            if (m137877i()) {
                str = m137879k();
            } else {
                str = m137878j();
            }
            this.f112529b = str;
        }
        return this.f112529b;
    }

    /* renamed from: i */
    private static boolean m137877i() {
        boolean c = C6399b.m19928c();
        boolean equals = TextUtils.equals(C6399b.m19941q(), "local_test");
        boolean booleanValue = ((Boolean) SharePrefCache.inst().getGeckoLocalTestUseOnline().mo59877d()).booleanValue();
        if (c || (equals && !booleanValue)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final List<Pattern> mo53918b() {
        ArrayList arrayList = new ArrayList();
        List<String> b = C6887b.m21436b().mo16906b(C6399b.m19921a(), "aweme_gecko_offline_host_prefix", String.class);
        if (!C6307b.m19566a((Collection<T>) b)) {
            for (String compile : b) {
                arrayList.add(Pattern.compile(compile));
            }
            return arrayList;
        }
        arrayList.add(Pattern.compile("s3a.bytecdn.cn/ies/resource/falcon"));
        arrayList.add(Pattern.compile("s3.bytecdn.cn/ies/resource/falcon"));
        arrayList.add(Pattern.compile("aweme.snssdk.com/falcon/"));
        arrayList.add(Pattern.compile("ic.snssdk.com/game_channel"));
        arrayList.add(Pattern.compile("s3.pstatp.com/bytecom/game_channel_fe/"));
        arrayList.add(Pattern.compile("s3.bytecdn.cn/aweme/resource/falcon/"));
        arrayList.add(Pattern.compile("s3a.bytecdn.cn/aweme/resource/falcon/"));
        arrayList.add(Pattern.compile("s16.tiktokcdn.com/tiktok/falcon/"));
        arrayList.add(Pattern.compile("s0.ipstatp.com/tiktok/falcon/"));
        arrayList.add(Pattern.compile("www.tiktok.com/falcon/"));
        arrayList.add(Pattern.compile("m.tiktok.com/falcon/"));
        arrayList.add(Pattern.compile("snssdk.com/feoffline/"));
        arrayList.add(Pattern.compile("pstatp.com/toutiao/feoffline/"));
        arrayList.add(Pattern.compile("test-aweme.snssdk.com/falcon/fe_activity/"));
        return arrayList;
    }

    /* renamed from: a */
    public final String mo53917a(String str) {
        File file = new File(m137874e(), str);
        C7276d.m22805a(file);
        return file.getPath();
    }
}
