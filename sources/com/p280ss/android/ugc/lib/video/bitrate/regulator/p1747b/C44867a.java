package com.p280ss.android.ugc.lib.video.bitrate.regulator.p1747b;

import android.text.TextUtils;
import android.util.Pair;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.BitrateNotMatchException;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44861a;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44862b;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44863c;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44864d;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44865e;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.lib.video.bitrate.regulator.b.a */
public abstract class C44867a implements C44879e {

    /* renamed from: a */
    protected final C44864d f115384a;

    /* renamed from: b */
    protected List<? extends C44865e> f115385b;

    /* renamed from: c */
    protected List<? extends C44862b> f115386c;

    /* renamed from: d */
    protected C44861a f115387d;

    /* renamed from: com.ss.android.ugc.lib.video.bitrate.regulator.b.a$a */
    public static abstract class C44868a {

        /* renamed from: a */
        protected C44864d f115388a;

        /* renamed from: b */
        protected List<? extends C44865e> f115389b;

        /* renamed from: c */
        protected List<? extends C44862b> f115390c;

        /* renamed from: d */
        protected C44861a f115391d;

        /* renamed from: a */
        public abstract C44879e mo107318a();

        /* renamed from: a */
        public final C44868a mo107316a(C44861a aVar) {
            this.f115391d = aVar;
            return this;
        }

        /* renamed from: b */
        public final C44868a mo107319b(List<? extends C44862b> list) {
            this.f115390c = list;
            return this;
        }

        public C44868a(C44864d dVar) {
            this.f115388a = dVar;
        }

        /* renamed from: a */
        public final C44868a mo107317a(List<? extends C44865e> list) {
            this.f115389b = list;
            return this;
        }
    }

    /* renamed from: a */
    public final void mo107311a(C44861a aVar) {
        this.f115387d = aVar;
    }

    /* renamed from: b */
    public final void mo107313b(List<? extends C44862b> list) {
        this.f115386c = list;
    }

    protected C44867a(C44864d dVar) {
        this.f115384a = dVar;
    }

    /* renamed from: a */
    public final void mo107312a(List<? extends C44865e> list) {
        this.f115385b = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final <T extends C44863c> T mo107315d(List<T> list) throws BitrateNotMatchException {
        String a = this.f115384a.mo104863a();
        double c = this.f115384a.mo104865c();
        if (c <= 0.0d) {
            for (T t : list) {
                if (TextUtils.equals(t.getGearName(), a)) {
                    return t;
                }
            }
            StringBuilder sb = new StringBuilder("defaultGearName = ");
            sb.append(a);
            sb.append(" bitrates = ");
            sb.append(list.toString());
            throw new BitrateNotMatchException(4, sb.toString());
        }
        double d = Double.MAX_VALUE;
        T t2 = null;
        for (T t3 : list) {
            double bitRate = (double) t3.getBitRate();
            Double.isNaN(bitRate);
            double abs = Math.abs(bitRate - c);
            if (d > abs) {
                t2 = t3;
                d = abs;
            }
        }
        return t2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final <T extends C44863c> List<T> mo107314c(List<T> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (this.f115384a == null || list.isEmpty()) {
            return arrayList;
        }
        Pair d = this.f115384a.mo104866d();
        Set b = this.f115384a.mo104864b();
        if (d == null || this.f115384a.mo104865c() <= 0.0d) {
            z = false;
        } else {
            z = true;
        }
        for (T t : list) {
            if (z) {
                double bitRate = (double) t.getBitRate();
                if (bitRate >= ((Double) d.first).doubleValue() && bitRate <= ((Double) d.second).doubleValue()) {
                    arrayList.add(t);
                }
            } else if (b != null && b.contains(t.getGearName())) {
                arrayList.add(t);
            }
        }
        if (arrayList.isEmpty()) {
            if (z) {
                C44863c cVar = null;
                for (T t2 : list) {
                    if (cVar != null) {
                        double bitRate2 = (double) t2.getBitRate();
                        double c = this.f115384a.mo104865c();
                        Double.isNaN(bitRate2);
                        double abs = Math.abs(bitRate2 - c);
                        double bitRate3 = (double) cVar.getBitRate();
                        double c2 = this.f115384a.mo104865c();
                        Double.isNaN(bitRate3);
                        if (abs >= Math.abs(bitRate3 - c2)) {
                        }
                    }
                    cVar = t2;
                }
                arrayList.add(cVar);
            } else {
                arrayList.add(list.get(0));
            }
        }
        return arrayList;
    }
}
