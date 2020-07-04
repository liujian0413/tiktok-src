package com.bytedance.android.livesdk.rank;

import android.os.SystemClock;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.core.p148d.C3171d;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.livesdk.rank.model.C8852a;
import com.bytedance.android.livesdk.rank.model.CurrentRankListResponse;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.rank.l */
public final class C8850l {

    /* renamed from: a */
    public static long f24060a = 0;

    /* renamed from: b */
    public static long f24061b = 0;

    /* renamed from: c */
    public static long f24062c = 0;

    /* renamed from: d */
    public static long f24063d = 0;

    /* renamed from: e */
    private static int f24064e = 0;

    /* renamed from: f */
    private static int f24065f = 0;

    /* renamed from: g */
    private static int f24066g = 0;

    /* renamed from: h */
    private static int f24067h = 1;

    /* renamed from: a */
    private static String m26467a(int i) {
        if (i == -1) {
            return "ttlive_watermelon_rank_api";
        }
        if (i == 7 || i == 9) {
            return "ttlive_week_rank_api";
        }
        if (i != 12) {
            switch (i) {
                case 16:
                    break;
                case 17:
                case 18:
                    return "ttlive_current_rank_api";
                default:
                    return "";
            }
        }
        return "ttlive_hour_rank_api";
    }

    /* renamed from: a */
    public static long m26466a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        f24063d = uptimeMillis;
        return uptimeMillis;
    }

    /* renamed from: b */
    private static String m26474b(String str) {
        return C3171d.m11993b(str);
    }

    /* renamed from: a */
    private static String m26468a(String str) {
        return C3171d.m11992a(str);
    }

    /* renamed from: a */
    private static int m26465a(C3477b bVar) {
        if (bVar == null) {
            return 0;
        }
        if (bVar.data instanceof C8852a) {
            C8852a aVar = (C8852a) bVar.data;
            if (aVar.f24068a != null) {
                return aVar.f24068a.size();
            }
            return 0;
        } else if (!(bVar.data instanceof CurrentRankListResponse)) {
            return 0;
        } else {
            CurrentRankListResponse currentRankListResponse = (CurrentRankListResponse) bVar.data;
            if (currentRankListResponse.ranks != null) {
                return currentRankListResponse.ranks.size();
            }
            return 0;
        }
    }

    /* renamed from: b */
    private static void m26475b(int i, int i2) {
        if (i2 == 17) {
            f24064e = i + i2;
            f24060a = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: c */
    private static void m26476c(int i, int i2) {
        if (i2 == -1) {
            f24066g = i + i2;
            f24062c = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: d */
    private static void m26477d(int i, int i2) {
        if (i2 == 7) {
            f24065f = i + i2;
            f24061b = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: a */
    public static void m26469a(int i, int i2) {
        m26475b(i, i2);
        m26477d(i, i2);
        m26476c(i, i2);
    }

    /* renamed from: a */
    public static void m26470a(int i, C3477b bVar) {
        m26471a(i, bVar, -1);
    }

    /* renamed from: a */
    public static void m26472a(int i, Throwable th) {
        m26473a(i, th, -1);
    }

    /* renamed from: a */
    public static void m26471a(int i, C3477b bVar, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("rank_type", Integer.valueOf(i));
        hashMap.put("rank_numbers", Integer.valueOf(m26465a(bVar)));
        if (i == 12) {
            hashMap.put("rank_hour_info", Integer.valueOf(i2));
            if (i2 == 1 && bVar != null && (bVar.data instanceof C8852a)) {
                hashMap.put("rank_hour_hide", Boolean.valueOf(((C8852a) bVar.data).f24078k));
            }
        }
        if (bVar != null) {
            hashMap.put("error_code", Integer.valueOf(bVar.statusCode));
        }
        C3172e.m12001a(m26468a(m26467a(i)), 0, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m26473a(int i, Throwable th, int i2) {
        String str;
        HashMap hashMap = new HashMap();
        String str2 = "error_msg";
        if (th != null) {
            str = th.getMessage();
        } else {
            str = "";
        }
        hashMap.put(str2, str);
        if (th instanceof ApiServerException) {
            hashMap.put("error_code", Integer.valueOf(((ApiServerException) th).getErrorCode()));
        }
        if (i == 12) {
            hashMap.put("rank_hour_info", Integer.valueOf(i2));
        }
        C3172e.m12001a(m26468a(m26467a(i)), 1, (Map<String, Object>) hashMap);
        C3172e.m12001a(m26474b(m26467a(i)), 1, (Map<String, Object>) hashMap);
    }
}
