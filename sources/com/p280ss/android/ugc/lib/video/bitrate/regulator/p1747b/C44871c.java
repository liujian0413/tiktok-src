package com.p280ss.android.ugc.lib.video.bitrate.regulator.p1747b;

import android.os.Build.VERSION;
import com.p280ss.android.p298ml.C6824e;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.BitrateNotMatchException;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44863c;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44864d;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44866f;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1747b.C44867a.C44868a;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1747b.C44875d.C44877a;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1747b.C44875d.C44878b;
import com.taobao.android.dexposed.ClassUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.lib.video.bitrate.regulator.b.c */
public final class C44871c extends C44867a {

    /* renamed from: e */
    public C44879e f115394e;

    /* renamed from: com.ss.android.ugc.lib.video.bitrate.regulator.b.c$a */
    public static class C44873a extends C44868a {
        /* renamed from: a */
        public final C44879e mo107318a() {
            C44871c cVar = new C44871c(this.f115388a);
            C44879e a = new C44877a(this.f115388a).mo107317a(this.f115389b).mo107319b(this.f115390c).mo107316a(this.f115391d).mo107318a();
            a.mo107312a(this.f115389b);
            a.mo107313b(this.f115390c);
            a.mo107311a(this.f115391d);
            cVar.f115394e = a;
            return cVar;
        }

        public C44873a(C44864d dVar) {
            super(dVar);
        }
    }

    /* renamed from: com.ss.android.ugc.lib.video.bitrate.regulator.b.c$b */
    public static class C44874b {

        /* renamed from: a */
        private Map<String, Object> f115395a = new HashMap();

        /* renamed from: a */
        public static C44874b m141581a() {
            return new C44874b();
        }

        private C44874b() {
        }

        /* renamed from: b */
        public final Map<String, Object> mo107327b() {
            try {
                int indexOf = VERSION.RELEASE.indexOf(ClassUtils.PACKAGE_SEPARATOR);
                if (indexOf < 0) {
                    indexOf = VERSION.RELEASE.length();
                }
                m141582i(Integer.valueOf(VERSION.RELEASE.substring(0, indexOf)).intValue());
            } catch (NumberFormatException unused) {
                m141582i(0);
            }
            return this.f115395a;
        }

        /* renamed from: f */
        public final C44874b mo107335f(List<Integer> list) {
            this.f115395a.put("cache_size_list", list);
            return this;
        }

        /* renamed from: i */
        private C44874b m141582i(int i) {
            this.f115395a.put("os_ver", Integer.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public final C44874b mo107325b(int i) {
            this.f115395a.put("video_duration", Integer.valueOf(i));
            return this;
        }

        /* renamed from: c */
        public final C44874b mo107328c(int i) {
            this.f115395a.put("tcp_rtt", Integer.valueOf(i));
            return this;
        }

        /* renamed from: d */
        public final C44874b mo107330d(int i) {
            this.f115395a.put("tcp_bandwith", Integer.valueOf(i));
            return this;
        }

        /* renamed from: e */
        public final C44874b mo107332e(int i) {
            this.f115395a.put("http_rtt", Integer.valueOf(i));
            return this;
        }

        /* renamed from: f */
        public final C44874b mo107334f(int i) {
            this.f115395a.put("signal", Integer.valueOf(i));
            return this;
        }

        /* renamed from: g */
        public final C44874b mo107336g(int i) {
            this.f115395a.put("access", Integer.valueOf(i));
            return this;
        }

        /* renamed from: h */
        public final C44874b mo107337h(int i) {
            this.f115395a.put("carrier", Integer.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public final C44874b mo107323a(int i) {
            Map<String, Object> map = this.f115395a;
            String str = "internet_speed";
            int i2 = i / 8000;
            if (i2 < 0) {
                i2 = 0;
            }
            map.put(str, Integer.valueOf(i2));
            return this;
        }

        /* renamed from: a */
        public final C44874b mo107324a(List<Integer> list) {
            int i;
            int i2;
            int i3;
            if (list == null) {
                return this;
            }
            if (list.size() > 0) {
                i = ((Integer) list.get(0)).intValue();
            } else {
                i = 0;
            }
            Map<String, Object> map = this.f115395a;
            String str = "internet_speed_0";
            int i4 = i / 8000;
            if (i4 < 0) {
                i4 = 0;
            }
            map.put(str, Integer.valueOf(i4));
            if (list.size() >= 2) {
                i2 = ((Integer) list.get(1)).intValue();
            } else {
                i2 = 0;
            }
            Map<String, Object> map2 = this.f115395a;
            String str2 = "internet_speed_1";
            int i5 = i2 / 8000;
            if (i5 < 0) {
                i5 = 0;
            }
            map2.put(str2, Integer.valueOf(i5));
            if (list.size() >= 3) {
                i3 = ((Integer) list.get(2)).intValue();
            } else {
                i3 = 0;
            }
            Map<String, Object> map3 = this.f115395a;
            String str3 = "internet_speed_2";
            int i6 = i3 / 8000;
            if (i6 < 0) {
                i6 = 0;
            }
            map3.put(str3, Integer.valueOf(i6));
            return this;
        }

        /* renamed from: b */
        public final C44874b mo107326b(List<Integer> list) {
            int i;
            int i2;
            if (list == null) {
                return this;
            }
            Map<String, Object> map = this.f115395a;
            String str = "block_cnt_0";
            int i3 = 0;
            if (list.size() > 0) {
                i = ((Integer) list.get(0)).intValue();
            } else {
                i = 0;
            }
            map.put(str, Integer.valueOf(i));
            Map<String, Object> map2 = this.f115395a;
            String str2 = "block_cnt_1";
            if (list.size() >= 2) {
                i2 = ((Integer) list.get(1)).intValue();
            } else {
                i2 = 0;
            }
            map2.put(str2, Integer.valueOf(i2));
            Map<String, Object> map3 = this.f115395a;
            String str3 = "block_cnt_2";
            if (list.size() >= 3) {
                i3 = ((Integer) list.get(2)).intValue();
            }
            map3.put(str3, Integer.valueOf(i3));
            return this;
        }

        /* renamed from: c */
        public final C44874b mo107329c(List<Integer> list) {
            int i;
            int i2;
            if (list == null) {
                return this;
            }
            Map<String, Object> map = this.f115395a;
            String str = "block_time_0";
            int i3 = 0;
            if (list.size() > 0) {
                i = ((Integer) list.get(0)).intValue();
            } else {
                i = 0;
            }
            map.put(str, Integer.valueOf(i));
            Map<String, Object> map2 = this.f115395a;
            String str2 = "block_time_1";
            if (list.size() >= 2) {
                i2 = ((Integer) list.get(1)).intValue();
            } else {
                i2 = 0;
            }
            map2.put(str2, Integer.valueOf(i2));
            Map<String, Object> map3 = this.f115395a;
            String str3 = "block_time_2";
            if (list.size() >= 3) {
                i3 = ((Integer) list.get(2)).intValue();
            }
            map3.put(str3, Integer.valueOf(i3));
            return this;
        }

        /* renamed from: d */
        public final C44874b mo107331d(List<Integer> list) {
            int i;
            int i2;
            if (list == null) {
                return this;
            }
            Map<String, Object> map = this.f115395a;
            String str = "video_bitrate_0";
            int i3 = 0;
            if (list.size() > 0) {
                i = ((Integer) list.get(0)).intValue();
            } else {
                i = 0;
            }
            map.put(str, Integer.valueOf(i));
            Map<String, Object> map2 = this.f115395a;
            String str2 = "video_bitrate_1";
            if (list.size() >= 2) {
                i2 = ((Integer) list.get(1)).intValue();
            } else {
                i2 = 0;
            }
            map2.put(str2, Integer.valueOf(i2));
            Map<String, Object> map3 = this.f115395a;
            String str3 = "video_bitrate_2";
            if (list.size() >= 3) {
                i3 = ((Integer) list.get(2)).intValue();
            }
            map3.put(str3, Integer.valueOf(i3));
            return this;
        }

        /* renamed from: e */
        public final C44874b mo107333e(List<Integer> list) {
            int i;
            int i2;
            if (list == null) {
                return this;
            }
            Map<String, Object> map = this.f115395a;
            String str = "play_time_0";
            int i3 = 0;
            if (list.size() > 0) {
                i = ((Integer) list.get(0)).intValue();
            } else {
                i = 0;
            }
            map.put(str, Integer.valueOf(i));
            Map<String, Object> map2 = this.f115395a;
            String str2 = "play_time_1";
            if (list.size() >= 2) {
                i2 = ((Integer) list.get(1)).intValue();
            } else {
                i2 = 0;
            }
            map2.put(str2, Integer.valueOf(i2));
            Map<String, Object> map3 = this.f115395a;
            String str3 = "play_time_2";
            if (list.size() >= 3) {
                i3 = ((Integer) list.get(2)).intValue();
            }
            map3.put(str3, Integer.valueOf(i3));
            return this;
        }
    }

    private C44871c(C44864d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final C44866f mo107322a(List<? extends C44863c> list, Map<String, Object> map) {
        C44866f fVar = new C44866f();
        if (list == null || list.isEmpty()) {
            fVar.f115381b = new BitrateNotMatchException(0, "bitrate list is empty...");
            return fVar;
        }
        List c = mo107314c(list);
        if (c.isEmpty()) {
            fVar.f115381b = new BitrateNotMatchException(5, "Intersection bitrate list is empty.");
            return fVar;
        }
        C44863c cVar = null;
        try {
            cVar = m141578b(c, map);
        } catch (Throwable th) {
            fVar.f115381b = new BitrateNotMatchException(9, th.getMessage());
        }
        if (cVar == null) {
            fVar = this.f115394e.mo107322a(c, C44878b.m141608a().mo107339a(((Integer) map.get("internet_speed")).intValue()).f115397a);
            fVar.f115382c = 0;
        } else {
            fVar.f115380a = cVar;
            fVar.f115382c = 1;
        }
        return fVar;
    }

    /* renamed from: b */
    private static C44863c m141578b(List<? extends C44863c> list, Map<String, Object> map) {
        int i;
        List<? extends C44863c> list2 = list;
        Map<String, Object> map2 = map;
        C6824e eVar = C44869b.m141575a().f115392a;
        if (eVar == null || !eVar.mo16672b() || !eVar.mo16677f()) {
            return null;
        }
        List list3 = (List) map2.get("cache_size_list");
        if (list3 == null) {
            return null;
        }
        int intValue = ((Integer) map2.get("internet_speed")).intValue();
        if (intValue <= 0) {
            return null;
        }
        int intValue2 = ((Integer) map2.get("internet_speed_0")).intValue();
        int intValue3 = ((Integer) map2.get("internet_speed_1")).intValue();
        int intValue4 = ((Integer) map2.get("internet_speed_2")).intValue();
        for (int i2 = 0; i2 < list.size(); i2++) {
            int bitRate = ((C44863c) list2.get(i2)).getBitRate();
            map2.put("video_bitrate", Integer.valueOf(bitRate));
            String str = "cache_size";
            if (list3.size() - 1 >= i2) {
                i = ((Integer) list3.get(i2)).intValue();
            } else {
                i = 0;
            }
            map2.put(str, Integer.valueOf(i));
            float f = (float) bitRate;
            map2.put("bitrate_speed", Float.valueOf(f / (((float) intValue) + 1.0f)));
            map2.put("bitrate_speed_0", Float.valueOf(f / (((float) intValue2) + 1.0f)));
            map2.put("bitrate_speed_1", Float.valueOf(f / (((float) intValue3) + 1.0f)));
            map2.put("bitrate_speed_2", Float.valueOf(f / (((float) intValue4) + 1.0f)));
            List a = eVar.f19442b.mo16665a(map, eVar.mo16674c(), eVar.mo16675d(), eVar.mo16676e(), null);
            if (a != null && a.size() > 0 && ((String) a.get(0)).equalsIgnoreCase("true")) {
                return (C44863c) list2.get(i2);
            }
        }
        return (C44863c) list2.get(list.size() - 1);
    }
}
