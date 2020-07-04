package com.p280ss.android.ugc.aweme.shortvideo.cut.model;

import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38774k;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.model.b */
public final class C38783b {

    /* renamed from: a */
    HashMap<String, Float> f100782a = new HashMap<>();

    /* renamed from: b */
    public HashMap<String, Float> f100783b = new HashMap<>();

    /* renamed from: c */
    public long f100784c;

    /* renamed from: d */
    public long f100785d;

    /* renamed from: e */
    public float f100786e;

    /* renamed from: f */
    public long f100787f;

    /* renamed from: g */
    public float f100788g;

    /* renamed from: h */
    public long f100789h;

    /* renamed from: i */
    public long f100790i;

    /* renamed from: j */
    private float f100791j;

    /* renamed from: a */
    public final long mo96918a(int i) {
        if (i == 2 || i == 0) {
            return this.f100785d;
        }
        return this.f100784c;
    }

    /* renamed from: a */
    public final void mo96921a(String str, float f) {
        this.f100782a.put(str, Float.valueOf(f));
    }

    public C38783b(List<VideoSegment> list, float f) {
        this.f100791j = f;
        for (VideoSegment videoSegment : list) {
            this.f100782a.put(videoSegment.mo96908g(), Float.valueOf(videoSegment.mo96911j()));
        }
    }

    /* renamed from: b */
    private static long m123869b(List<VideoSegment> list, float f) {
        if (C6311g.m19573a(list)) {
            C41530am.m132284c("videoSegmentList is empty");
            return 0;
        }
        float f2 = 0.0f;
        for (VideoSegment videoSegment : list) {
            if (!videoSegment.f100768j) {
                f2 += ((float) (videoSegment.mo96910i() - videoSegment.mo96909h())) / (videoSegment.mo96911j() * f);
            }
        }
        return (long) f2;
    }

    /* renamed from: a */
    public final void mo96922a(List<VideoSegment> list, float f) {
        int i;
        this.f100784c = m123869b(list, f);
        this.f100787f = C38774k.m123814a(this.f100784c);
        StringBuilder sb = new StringBuilder("videoMultiDur: ");
        sb.append(this.f100784c);
        sb.append(" maxCutDuration is ");
        sb.append(this.f100787f);
        sb.append(" videoSize is ");
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        sb.append(i);
        C41530am.m132284c(sb.toString());
        if (this.f100789h > 0) {
            this.f100787f = Math.min(this.f100784c, this.f100789h);
        }
        this.f100786e = ((float) this.f100787f) / this.f100791j;
        this.f100788g = C38774k.m123811a(this.f100786e);
        if (this.f100790i > 0) {
            this.f100788g = ((float) this.f100790i) / this.f100786e;
        }
        for (Entry entry : this.f100782a.entrySet()) {
            this.f100783b.put(entry.getKey(), Float.valueOf(this.f100786e * ((Float) entry.getValue()).floatValue() * f));
        }
    }

    /* renamed from: b */
    private static int m123868b(List<VideoSegment> list, float f, float f2) {
        float f3 = 0.0f;
        for (int i = 0; i < list.size(); i++) {
            VideoSegment videoSegment = (VideoSegment) list.get(i);
            f3 += ((float) (videoSegment.mo96910i() - videoSegment.mo96909h())) / (videoSegment.mo96911j() * f2);
            if (f <= f3) {
                return i;
            }
        }
        return list.size() - 1;
    }

    /* renamed from: a */
    public final float mo96917a(List<VideoSegment> list, long j, float f) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (!((VideoSegment) list.get(i)).f100768j) {
                arrayList.add(list.get(i));
            }
        }
        int i2 = 0;
        float f2 = 0.0f;
        while (true) {
            if (i2 >= arrayList.size()) {
                i2 = 0;
                break;
            }
            VideoSegment videoSegment = (VideoSegment) arrayList.get(i2);
            if (j <= videoSegment.f100761c) {
                break;
            }
            f2 += ((float) (videoSegment.mo96910i() - videoSegment.mo96909h())) / ((videoSegment.mo96911j() * f) * this.f100786e);
            j -= videoSegment.f100761c;
            i2++;
        }
        if (arrayList.isEmpty()) {
            return f2;
        }
        return f2 + (((float) (j - ((VideoSegment) arrayList.get(i2)).mo96909h())) / ((f * ((VideoSegment) arrayList.get(i2)).mo96911j()) * this.f100786e));
    }

    /* renamed from: a */
    public static long m123867a(List<VideoSegment> list, float f, float f2) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!((VideoSegment) list.get(i2)).f100768j) {
                arrayList.add(list.get(i2));
            }
        }
        long j = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayList.size()) {
                break;
            }
            VideoSegment videoSegment = (VideoSegment) arrayList.get(i3);
            j += videoSegment.f100761c;
            if (f <= ((float) (videoSegment.mo96910i() - videoSegment.mo96909h())) / (videoSegment.mo96911j() * f2)) {
                i = i3;
                break;
            }
            f -= ((float) (videoSegment.mo96910i() - videoSegment.mo96909h())) / (videoSegment.mo96911j() * f2);
            i3++;
        }
        if (i3 == arrayList.size()) {
            return (j - ((VideoSegment) arrayList.get(i)).f100761c) + ((VideoSegment) arrayList.get(i)).mo96910i();
        }
        return (long) (((float) ((j - ((VideoSegment) arrayList.get(i)).f100761c) + ((VideoSegment) arrayList.get(i)).mo96909h())) + (f * ((VideoSegment) arrayList.get(i)).mo96911j() * f2));
    }

    /* renamed from: a */
    public final List<String> mo96919a(List<VideoSegment> list, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (!((VideoSegment) list.get(i)).f100768j) {
                arrayList2.add(list.get(i));
            }
        }
        int b = m123868b(arrayList2, f2, f3);
        for (int b2 = m123868b(arrayList2, f, f3); b2 <= b; b2++) {
            arrayList.add(((VideoSegment) arrayList2.get(b2)).mo96908g());
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo96920a(long j, String str, float f, int i) {
        long j2 = (long) (((float) j) / f);
        this.f100785d = j2;
        this.f100787f = C38774k.m123814a(j2);
        StringBuilder sb = new StringBuilder("path: ");
        sb.append(str);
        sb.append(" maxCutDuration is ");
        sb.append(this.f100787f);
        C41530am.m132284c(sb.toString());
        if (this.f100789h > 0) {
            this.f100787f = Math.min(this.f100789h, this.f100785d);
        }
        this.f100786e = ((float) this.f100787f) / this.f100791j;
        if (i == 0) {
            this.f100788g = C38774k.m123822c(this.f100786e);
        } else {
            this.f100788g = C38774k.m123819b(this.f100786e);
        }
        if (this.f100790i > 0) {
            this.f100788g = ((float) this.f100790i) / this.f100786e;
        }
        this.f100783b.put(str, Float.valueOf(this.f100786e * f));
    }
}
