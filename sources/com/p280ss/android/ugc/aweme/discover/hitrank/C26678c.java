package com.p280ss.android.ugc.aweme.discover.hitrank;

import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f.C33787a;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.discover.hitrank.c */
public final class C26678c {

    /* renamed from: a */
    public static final C26678c f70349a = new C26678c();

    /* renamed from: b */
    private static boolean f70350b;

    /* renamed from: c */
    private static String f70351c = "";

    /* renamed from: d */
    private static boolean f70352d;

    private C26678c() {
    }

    /* renamed from: a */
    public static final String m87643a(String str) {
        return m87644a(str, "", "");
    }

    /* renamed from: a */
    public static void m87648a(boolean z) {
        f70350b = true;
    }

    /* renamed from: b */
    public static void m87651b(boolean z) {
        f70352d = true;
    }

    /* renamed from: b */
    public static void m87650b(String str) {
        C7573i.m23587b(str, "<set-?>");
        f70351c = str;
    }

    /* renamed from: c */
    public static final boolean m87652c(String str) {
        C7573i.m23587b(str, "schema");
        CharSequence charSequence = str;
        if (TextUtils.isEmpty(charSequence) || !C7634n.m23721b(str, "aweme://search/trending", false) || !C7634n.m23776c(charSequence, (CharSequence) "type=4", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m87647a(BaseShortVideoContext baseShortVideoContext) {
        C7573i.m23587b(baseShortVideoContext, "videoEditModel");
        List<AVTextExtraStruct> list = baseShortVideoContext.structList;
        if (list != null) {
            List arrayList = new ArrayList();
            for (AVTextExtraStruct aVTextExtraStruct : list) {
                C7573i.m23582a((Object) aVTextExtraStruct, "struct");
                if (aVTextExtraStruct.getType() == 1) {
                    String hashTagName = aVTextExtraStruct.getHashTagName();
                    C7573i.m23582a((Object) hashTagName, "struct.hashTagName");
                    arrayList.add(hashTagName);
                }
            }
            if (f70352d && arrayList.size() > 0 && !TextUtils.isEmpty(f70351c)) {
                C26682g.m87659a(f70351c, 9, arrayList);
            }
        }
        f70352d = false;
    }

    /* renamed from: a */
    public static void m87646a(FragmentActivity fragmentActivity, String str) {
        C7573i.m23587b(fragmentActivity, "activity");
        if (str != null) {
            C26681f fVar = (C26681f) C23336d.m76560a(C6399b.m19921a(), C26681f.class);
            CharSequence charSequence = str;
            if ((C7634n.m23776c(charSequence, (CharSequence) "153070", false) || C7634n.m23776c(charSequence, (CharSequence) "153071", false)) && f70350b) {
                if (!fVar.mo60428a()) {
                    fVar.mo60427a(true);
                    f70350b = false;
                    C10761a.m31409e((Context) AwemeApplication.m21341a(), (int) R.string.bea).mo25750a();
                }
                C26682g.f70355a.mo68416a(f70351c, 7);
            }
        }
    }

    /* renamed from: a */
    public static final String m87644a(String str, String str2, String str3) {
        C7573i.m23587b(str, "from");
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl billboardStarScheme = inst.getBillboardStarScheme();
        C7573i.m23582a((Object) billboardStarScheme, "SharePrefCache.inst().billboardStarScheme");
        String str4 = (String) billboardStarScheme.mo59877d();
        if (TextUtils.isEmpty(str4)) {
            return "";
        }
        C7573i.m23582a((Object) str4, "billboardStarUrl");
        C33787a a = C33786f.m108941a(str4);
        if (!TextUtils.isEmpty(str2)) {
            String str5 = "star_uid";
            if (str2 == null) {
                C7573i.m23580a();
            }
            a.mo86195a(str5, str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            String str6 = "sec_star_uid";
            if (str3 == null) {
                C7573i.m23580a();
            }
            a.mo86195a(str6, str3);
        }
        a.mo86195a("from", str);
        String uri = a.mo86194a().toString();
        C7573i.m23582a((Object) uri, "parseRnSchema.build().toString()");
        return uri;
    }

    /* renamed from: b */
    public static final String m87649b(String str, String str2, String str3) {
        C7573i.m23587b(str, "from");
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl billboardFansScheme = inst.getBillboardFansScheme();
        C7573i.m23582a((Object) billboardFansScheme, "SharePrefCache.inst().billboardFansScheme");
        String str4 = (String) billboardFansScheme.mo59877d();
        if (TextUtils.isEmpty(str4)) {
            return "";
        }
        C7573i.m23582a((Object) str4, "schema_fans");
        C33787a a = C33786f.m108941a(str4);
        if (!TextUtils.isEmpty(str2)) {
            String str5 = "star_uid";
            if (str2 == null) {
                C7573i.m23580a();
            }
            a.mo86195a(str5, str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            String str6 = "sec_star_uid";
            if (str3 == null) {
                C7573i.m23580a();
            }
            a.mo86195a(str6, str3);
        }
        a.mo86195a("from", str);
        String uri = a.mo86194a().toString();
        C7573i.m23582a((Object) uri, "parseRnSchema.build().toString()");
        return uri;
    }
}
