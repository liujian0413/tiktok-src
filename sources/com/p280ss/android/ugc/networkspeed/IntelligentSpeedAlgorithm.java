package com.p280ss.android.ugc.networkspeed;

import com.p280ss.android.p298ml.C6824e;
import com.p280ss.android.ugc.aweme.tools.extract.C42323i;
import com.p280ss.android.ugc.networkspeed.C44903d.C44904a;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.ss.android.ugc.networkspeed.IntelligentSpeedAlgorithm */
public final class IntelligentSpeedAlgorithm implements C44904a {

    /* renamed from: a */
    private volatile double f115465a = -1.0d;

    /* renamed from: b */
    private C44898a f115466b;

    /* renamed from: com.ss.android.ugc.networkspeed.IntelligentSpeedAlgorithm$IntelligentSpeedException */
    public static class IntelligentSpeedException extends Exception {
        private int code;
        private String msg;

        public int getCode() {
            return this.code;
        }

        public String getMsg() {
            return this.msg;
        }

        public IntelligentSpeedException(int i, String str) {
            this.code = i;
            this.msg = str;
        }
    }

    /* renamed from: com.ss.android.ugc.networkspeed.IntelligentSpeedAlgorithm$a */
    public interface C44898a {
        /* renamed from: a */
        Map<String, Object> mo85910a();
    }

    public IntelligentSpeedAlgorithm(C44898a aVar) {
        this.f115466b = aVar;
    }

    /* renamed from: a */
    public final double mo86732a(Queue<C44905e> queue, C44905e[] eVarArr) {
        return this.f115465a;
    }

    /* renamed from: b */
    public final double mo86733b(Queue<C44905e> queue, C44905e[] eVarArr) throws IntelligentSpeedException {
        String str;
        int i;
        C6824e eVar = C44901c.m141653a().f115469a;
        if (eVar == null || !eVar.mo16672b() || !eVar.mo16677f()) {
            this.f115465a = -1.0d;
            if (eVar == null) {
                i = 0;
                str = "component is null";
            } else if (!eVar.mo16672b()) {
                i = 1;
                str = "component is not enable";
            } else {
                i = 3;
                str = "component is not initialized ready";
            }
            throw new IntelligentSpeedException(i, str);
        }
        queue.toArray(eVarArr);
        HashMap hashMap = new HashMap();
        int min = Math.min(eVarArr.length, queue.size());
        int i2 = min - 1;
        for (int i3 = i2; i3 >= 0; i3--) {
            int i4 = min - i3;
            StringBuilder sb = new StringBuilder("f");
            sb.append(i4);
            hashMap.put(sb.toString(), Float.valueOf((float) eVarArr[i3].f115484c));
            StringBuilder sb2 = new StringBuilder("s");
            sb2.append(i4);
            hashMap.put(sb2.toString(), Float.valueOf(((float) eVarArr[i3].f115483b) / 8000.0f));
            StringBuilder sb3 = new StringBuilder(C42323i.f110089f);
            sb3.append(i4);
            hashMap.put(sb3.toString(), Float.valueOf(((float) eVarArr[i2].f115486e) - ((float) eVarArr[i3].f115486e)));
        }
        hashMap.putAll(this.f115466b.mo85910a());
        this.f115465a = (double) eVar.f19442b.mo16663a(hashMap, eVar.mo16674c(), eVar.mo16675d(), eVar.mo16676e());
        if (this.f115465a != -1.0d) {
            return this.f115465a;
        }
        if (!eVar.f19442b.mo16667b()) {
            throw new IntelligentSpeedException(4, "evaluator is not initialized");
        }
        throw new IntelligentSpeedException(5, "evaluator calculate error");
    }
}
