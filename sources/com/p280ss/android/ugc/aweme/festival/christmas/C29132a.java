package com.p280ss.android.ugc.aweme.festival.christmas;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.p1288h.C30221c;
import com.p280ss.android.ugc.aweme.p1288h.C30226d;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.festival.christmas.a */
public final class C29132a {

    /* renamed from: a */
    public static final int d6i = 2131301590;

    /* renamed from: b */
    public static final int axr = 2131298529;

    /* renamed from: c */
    private static int f76883c = 1;

    /* renamed from: d */
    private static boolean f76884d = true;

    /* renamed from: e */
    private static volatile C30221c f76885e;

    /* renamed from: c */
    public static int m95565c() {
        if (m95572g() == null) {
            return 0;
        }
        return m95572g().f79527q;
    }

    /* renamed from: d */
    public static String m95567d() {
        if (m95565c() == 0) {
            return "donation";
        }
        return "lottery";
    }

    /* renamed from: e */
    public static boolean m95569e() {
        if (f76883c >= 6) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static void m95571f() {
        if (f76883c <= 6) {
            f76883c++;
        }
    }

    /* renamed from: i */
    public static C30226d m95574i() {
        C30221c g = m95572g();
        if (g == null) {
            return null;
        }
        return g.f79515e;
    }

    /* renamed from: j */
    private static boolean m95575j() {
        if (m95572g() == null || !m95560a()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m95563b() {
        if (!m95560a() || !m95572g().f79530t) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m95573h() {
        if (m95572g() == null || m95572g().f79515e == null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private static boolean m95576k() {
        return m95561a(((Long) SharePrefCache.inst().getFestivalShareDonationTime().mo59877d()).longValue(), System.currentTimeMillis());
    }

    /* renamed from: g */
    public static C30221c m95572g() {
        if (f76885e != null) {
            return f76885e;
        }
        String str = (String) C23060u.m75742a().mo60054X().mo59877d();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            f76885e = (C30221c) new C6600e().mo15974a(str, C30221c.class);
        } catch (Exception unused) {
            f76885e = null;
        }
        return f76885e;
    }

    /* renamed from: a */
    public static boolean m95560a() {
        if (m95572g() == null || !m95572g().f79514d || C43122ff.m136767b()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m95559a(JSONObject jSONObject) {
        C30221c cVar;
        if (jSONObject != null) {
            try {
                cVar = (C30221c) new C6600e().mo15974a(jSONObject.toString(), C30221c.class);
            } catch (Exception unused) {
                cVar = null;
            }
            if (cVar != null) {
                f76885e = cVar;
            }
        }
    }

    /* renamed from: a */
    private static ArrayList<String> m95558a(String str) {
        String[] split;
        if (str == null || str.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : str.split(",")) {
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m95564b(Aweme aweme) {
        if (!m95575j() || aweme == null) {
            return false;
        }
        String stickerIDs = aweme.getStickerIDs();
        C30221c g = m95572g();
        if (g != null) {
            List<String> list = g.f79520j;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                ArrayList<String> a = m95558a(stickerIDs);
                Iterator it2 = a.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
                for (String str : a) {
                    if (list != null && list.contains(str)) {
                        return true;
                    }
                }
            }
            String str2 = null;
            if (aweme.getUploadMiscInfoStruct() != null) {
                str2 = aweme.getUploadMiscInfoStruct().mvThemeId;
            }
            if (str2 != null) {
                List<String> list2 = g.f79522l;
                if (list2 != null) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        it3.next();
                    }
                    if (list2.contains(str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m95566c(Aweme aweme) {
        if (aweme != null && aweme.getStickerEntranceInfo() != null && !TextUtils.isEmpty(aweme.getStickerEntranceInfo().f108868id) && m95560a()) {
            C30221c g = m95572g();
            if (g != null && m95572g().f79518h != null && !C6307b.m19566a((Collection<T>) g.f79520j) && g.f79520j.contains(aweme.getStickerEntranceInfo().f108868id)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m95568d(Aweme aweme) {
        if (aweme != null && aweme.getUploadMiscInfoStruct() != null && !TextUtils.isEmpty(aweme.getUploadMiscInfoStruct().mvThemeId) && m95560a()) {
            C30221c g = m95572g();
            if (g != null && m95572g().f79518h != null && !C6307b.m19566a((Collection<T>) g.f79522l) && g.f79522l.contains(aweme.getUploadMiscInfoStruct().mvThemeId)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m95570e(Aweme aweme) {
        if (!m95575j() || aweme == null || aweme.getAuthor() == null) {
            return false;
        }
        if (C6861a.m21337f().isMe(aweme.getAuthor().getUid())) {
            User curUser = C6861a.m21337f().getCurUser();
            if (curUser == null || curUser.isSecret()) {
                return false;
            }
            List list = null;
            try {
                list = (List) new C6600e().mo15975a((String) C23060u.m75742a().mo60055Y().mo59877d(), new C6597a<List<String>>() {
                }.type);
            } catch (Exception unused) {
            }
            if (C6307b.m19566a((Collection<T>) list) || !list.contains(aweme.getAid())) {
                return false;
            }
            return true;
        } else if (aweme.getAuthor().isSecret() || !m95564b(aweme)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m95562a(Aweme aweme) {
        if (aweme == null || !m95564b(aweme)) {
            return false;
        }
        User author = aweme.getAuthor();
        if (author == null || C43168s.m136911c(aweme) || C43168s.m136912d(aweme)) {
            return false;
        }
        if (C6861a.m21337f().isMe(author.getUid())) {
            return m95570e(aweme);
        }
        if (!author.isSecret()) {
            return m95576k();
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m95561a(long j, long j2) {
        boolean z;
        boolean z2;
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.setTimeInMillis(j);
        instance2.setTimeInMillis(j2);
        int i = instance.get(1);
        int i2 = instance2.get(1);
        if (i2 > i) {
            z = true;
        } else {
            z = false;
        }
        if (i2 != i || instance2.get(6) - instance.get(6) <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }
}
