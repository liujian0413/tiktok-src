package com.p280ss.ttvideoengine;

import com.p280ss.ttvideoengine.p1816i.C46123h;
import java.util.HashMap;

/* renamed from: com.ss.ttvideoengine.ab */
public final class C46034ab {

    /* renamed from: c */
    private static final C46034ab f117592c = new C46034ab();

    /* renamed from: a */
    private HashMap<Long, TTVideoEngine> f117593a = new HashMap<>();

    /* renamed from: b */
    private long f117594b;

    /* renamed from: a */
    public static C46034ab m144233a() {
        return f117592c;
    }

    private C46034ab() {
    }

    /* renamed from: a */
    public final synchronized void mo112119a(long j) {
        try {
            if (this.f117593a.containsKey(Long.valueOf(j))) {
                long longOption = ((TTVideoEngine) this.f117593a.get(Long.valueOf(j))).getLongOption(81);
                if (longOption > 0) {
                    this.f117594b += longOption;
                }
                this.f117593a.remove(Long.valueOf(j));
                StringBuilder sb = new StringBuilder("delete engine: ");
                sb.append(j);
                sb.append(", waste data: ");
                sb.append(longOption);
                C46123h.m144545a("VideoInfoCollecor", sb.toString());
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final synchronized void mo112120a(long j, TTVideoEngine tTVideoEngine) {
        if (!this.f117593a.containsKey(Long.valueOf(j))) {
            this.f117593a.put(Long.valueOf(j), tTVideoEngine);
            StringBuilder sb = new StringBuilder("new engine: ");
            sb.append(j);
            C46123h.m144545a("VideoInfoCollecor", sb.toString());
        }
    }
}
