package com.p280ss.android.ugc.aweme.p962f.p963a;

import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.C6600e;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.p962f.C21704d;
import com.p280ss.android.ugc.aweme.p962f.p964b.C21702a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.f.a.a */
public class C21695a {

    /* renamed from: b */
    private static C21695a f58103b;

    /* renamed from: a */
    public boolean f58104a;

    /* renamed from: c */
    private C21700d f58105c;

    /* renamed from: d */
    private C21702a f58106d;

    /* renamed from: e */
    private C21702a f58107e;

    private C21695a() {
    }

    /* renamed from: e */
    private static boolean m72602e() {
        return C21704d.m72621a();
    }

    /* renamed from: a */
    public static C21695a m72595a() {
        if (f58103b == null) {
            synchronized (C21695a.class) {
                if (f58103b == null) {
                    f58103b = new C21695a();
                }
            }
        }
        return f58103b;
    }

    /* renamed from: b */
    public final C21698b mo57965b() {
        if (!m72602e() || this.f58105c == null || this.f58105c.f58121c == null) {
            return null;
        }
        return m72596a(this.f58105c.f58121c);
    }

    /* renamed from: c */
    private boolean m72600c() {
        HashMap hashMap;
        int i;
        try {
            hashMap = (HashMap) new C6600e().mo15975a((String) C23060u.m75742a().mo60032B().mo59877d(), new C6597a<HashMap<String, Integer>>() {
            }.type);
        } catch (JsonSyntaxException unused) {
            hashMap = null;
        }
        int intValue = ((Integer) SharePrefCache.inst().getCompleteProfilePolicyTimes().mo59877d()).intValue();
        if (hashMap == null || !hashMap.containsKey(C21115b.m71197a().getCurUserId())) {
            i = 0;
        } else {
            i = ((Integer) hashMap.get(C21115b.m71197a().getCurUserId())).intValue();
        }
        if (i >= intValue) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m72601d() {
        HashMap hashMap;
        long j;
        try {
            hashMap = (HashMap) new C6600e().mo15975a((String) C23060u.m75742a().mo60031A().mo59877d(), new C6597a<HashMap<String, Long>>() {
            }.type);
        } catch (JsonSyntaxException unused) {
            hashMap = null;
        }
        if (hashMap == null || !hashMap.containsKey(C21115b.m71197a().getCurUserId())) {
            j = 0;
        } else {
            j = ((Long) hashMap.get(C21115b.m71197a().getCurUserId())).longValue();
        }
        if (((int) ((((System.currentTimeMillis() - j) / 1000) / 3600) / 24)) < ((Integer) SharePrefCache.inst().getCompleteProfilePolicyInterval().mo59877d()).intValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo57966b(boolean z) {
        if (this.f58107e != null) {
            this.f58107e.mo57970a(System.currentTimeMillis());
        }
    }

    /* renamed from: a */
    private static C21698b m72596a(List<C21698b> list) {
        for (C21698b bVar : list) {
            if (bVar.f58115f == C21115b.m71197a().getCurUser().getLoginPlatform() && bVar.f58114e) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m72597a(String str) {
        String str2 = "user";
        String str3 = "用户";
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith(str2)) {
            String substring = str.substring(str2.length());
            if (!TextUtils.isEmpty(substring) && TextUtils.isDigitsOnly(substring)) {
                return false;
            }
            return true;
        } else if (!str.startsWith(str3)) {
            return true;
        } else {
            String substring2 = str.substring(str3.length());
            if (!TextUtils.isEmpty(substring2) && TextUtils.isDigitsOnly(substring2)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo57964a(boolean z) {
        if (!m72602e()) {
            return false;
        }
        if (z) {
            if (this.f58107e == null || !this.f58107e.mo57972b(System.currentTimeMillis())) {
                return false;
            }
            return true;
        } else if (this.f58106d == null || !this.f58106d.mo57972b(System.currentTimeMillis())) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: b */
    private static boolean m72598b(List<String> list, int i, int i2) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        if (i < 100 && i2 < 100) {
            return false;
        }
        Set<String> set = (Set) SharePrefCache.inst().getDefaultAvatarUrl().mo59877d();
        if (set != null && !set.isEmpty()) {
            String str = (String) list.get(0);
            for (String parse : set) {
                try {
                    if (str.contains(Uri.parse(parse).getLastPathSegment())) {
                        return false;
                    }
                } catch (Exception unused) {
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final C21699c mo57963a(List<String> list, int i, int i2) {
        if (m72602e()) {
            return new C21699c(false);
        }
        if (m72600c()) {
            return new C21699c(false);
        }
        if (m72601d()) {
            return new C21699c(false);
        }
        return m72599c(list, i, i2);
    }

    /* renamed from: c */
    private C21699c m72599c(List<String> list, int i, int i2) {
        int i3;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        User curUser = C21115b.m71197a().getCurUser();
        float f7 = 0.0f;
        if (curUser == null) {
            return new C21699c(false, 0.0f, 2);
        }
        if (m72598b(list, i, i2)) {
            i3 = (int) (((Float) SharePrefCache.inst().getProfilePerfectionAvatar().mo59877d()).floatValue() * 100.0f);
        } else {
            i3 = 0;
        }
        if (m72597a(curUser.getNickname())) {
            f = ((Float) SharePrefCache.inst().getProfilePerfectionNickname().mo59877d()).floatValue() * 100.0f;
        } else {
            f = 0.0f;
        }
        int i4 = (int) f;
        if (!TextUtils.isEmpty(curUser.getUniqueId())) {
            f2 = ((Float) SharePrefCache.inst().getProfilePerfectionShortId().mo59877d()).floatValue() * 100.0f;
        } else {
            f2 = 0.0f;
        }
        int i5 = (int) f2;
        if (curUser.getGender() != 0) {
            f3 = ((Float) SharePrefCache.inst().getProfilePerfectionGender().mo59877d()).floatValue() * 100.0f;
        } else {
            f3 = 0.0f;
        }
        int i6 = (int) f3;
        if (!TextUtils.isEmpty(curUser.getBirthday())) {
            f4 = ((Float) SharePrefCache.inst().getProfilePerfectionBirthday().mo59877d()).floatValue() * 100.0f;
        } else {
            f4 = 0.0f;
        }
        int i7 = (int) f4;
        if (!TextUtils.isEmpty(curUser.getSchoolName())) {
            f5 = ((Float) SharePrefCache.inst().getProfilePerfectionSchool().mo59877d()).floatValue() * 100.0f;
        } else {
            f5 = 0.0f;
        }
        int i8 = (int) f5;
        if (!TextUtils.isEmpty(curUser.getSignature())) {
            f6 = ((Float) SharePrefCache.inst().getProfilePerfectionSignature().mo59877d()).floatValue() * 100.0f;
        } else {
            f6 = 0.0f;
        }
        int i9 = (int) f6;
        if (!TextUtils.isEmpty(curUser.getIsoCountryCode()) || !TextUtils.isEmpty(curUser.getCity())) {
            f7 = ((Float) SharePrefCache.inst().getProfilePerfectionLocation().mo59877d()).floatValue() * 100.0f;
        }
        int i10 = i4 + i3 + i5 + i6 + i7 + i8 + i9 + ((int) f7);
        if (i10 >= ((int) (((Float) SharePrefCache.inst().getProfileCompletionThreshold().mo59877d()).floatValue() * 100.0f))) {
            return new C21699c(false, (float) i10, 0);
        }
        if (i3 != 0) {
            return new C21699c(true, (float) i10, 1);
        }
        return new C21699c(true, (float) i10, 2);
    }
}
