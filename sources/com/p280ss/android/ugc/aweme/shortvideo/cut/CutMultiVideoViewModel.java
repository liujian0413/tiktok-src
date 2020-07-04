package com.p280ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.support.p022v4.util.C0902i;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.C38786e;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel */
public class CutMultiVideoViewModel extends C0063u implements C0042h {

    /* renamed from: a */
    public C0052o<C0902i<Integer, Integer>> f100394a = new C0052o<>();

    /* renamed from: b */
    public C0052o<Long> f100395b = new C0052o<>();

    /* renamed from: c */
    public C0052o<Long> f100396c = new C0052o<>();

    /* renamed from: d */
    public C0052o<Float> f100397d = new C0052o<>();

    /* renamed from: e */
    public C0052o<Void> f100398e = new C0052o<>();

    /* renamed from: f */
    public C0052o<VideoSegment> f100399f = new C0052o<>();

    /* renamed from: g */
    public C0052o<C0902i<Integer, Integer>> f100400g = new C0052o<>();

    /* renamed from: h */
    public C0052o<Void> f100401h = new C0052o<>();

    /* renamed from: i */
    public C0052o<Void> f100402i = new C0052o<>();

    /* renamed from: j */
    public C0052o<C38786e> f100403j = new C0052o<>();

    /* renamed from: k */
    public boolean f100404k;

    /* renamed from: l */
    public int f100405l;

    /* renamed from: m */
    private HashMap<String, Integer> f100406m = new HashMap<>();

    /* renamed from: b */
    public final void mo96670b() {
        this.f100398e.setValue(null);
    }

    /* renamed from: c */
    public final void mo96671c() {
        this.f100401h.setValue(null);
    }

    /* renamed from: d */
    public final void mo96672d() {
        this.f100402i.setValue(null);
    }

    /* renamed from: a */
    public final void mo96662a() {
        this.f100394a.setValue(C0902i.m3837a(Integer.valueOf(0), Integer.valueOf(0)));
    }

    /* renamed from: a */
    public final void mo96667a(VideoSegment videoSegment) {
        this.f100399f.setValue(videoSegment);
    }

    /* renamed from: a */
    public final void mo96663a(float f) {
        this.f100397d.setValue(Float.valueOf(f));
    }

    /* renamed from: a */
    public final void mo96668a(C38786e eVar) {
        this.f100403j.setValue(eVar);
    }

    /* renamed from: a */
    public final void mo96669a(String str) {
        this.f100406m.put(str, Integer.valueOf(1));
    }

    /* renamed from: a */
    public final void mo96664a(int i, int i2) {
        this.f100400g.setValue(C0902i.m3837a(Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* renamed from: a */
    public final void mo96665a(long j, List<VideoSegment> list) {
        int i;
        this.f100395b.setValue(Long.valueOf(j));
        if (this.f100394a.getValue() != null) {
            i = ((Integer) ((C0902i) this.f100394a.getValue()).f3155b).intValue();
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!((VideoSegment) list.get(i2)).f100768j) {
                arrayList.add(list.get(i2));
            }
        }
        long j2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayList.size()) {
                i3 = 0;
                break;
            }
            j2 += ((VideoSegment) arrayList.get(i3)).f100761c;
            if (j2 > j) {
                break;
            }
            i3++;
        }
        if (j > 0) {
            this.f100394a.setValue(C0902i.m3837a(Integer.valueOf(i), Integer.valueOf(i3)));
        }
    }

    /* renamed from: a */
    public final void mo96666a(long j, List<VideoSegment> list, float f) {
        int i;
        this.f100396c.setValue(Long.valueOf(j));
        if (this.f100394a.getValue() != null) {
            i = ((Integer) ((C0902i) this.f100394a.getValue()).f3155b).intValue();
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!((VideoSegment) list.get(i2)).f100768j) {
                arrayList.add(list.get(i2));
            }
        }
        long j2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            VideoSegment videoSegment = (VideoSegment) arrayList.get(i3);
            j2 = (long) (((float) j2) + (((float) (videoSegment.mo96910i() - videoSegment.mo96909h())) / (videoSegment.mo96911j() * f)));
            if (j2 > j) {
                this.f100394a.setValue(C0902i.m3837a(Integer.valueOf(i), Integer.valueOf(i3)));
                return;
            }
        }
    }
}
