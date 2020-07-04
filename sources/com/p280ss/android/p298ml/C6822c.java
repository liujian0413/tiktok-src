package com.p280ss.android.p298ml;

import android.os.SystemClock;
import com.p280ss.android.p298ml.process.C6831a;
import com.p280ss.android.p298ml.process.C6833c;
import com.p280ss.android.p298ml.process.p299bl.MLConfigModel;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ml.c */
public final class C6822c implements C6823d {

    /* renamed from: a */
    C6823d f19437a;

    /* renamed from: b */
    C6820a f19438b;

    /* renamed from: a */
    public final String mo16664a() {
        return this.f19437a.mo16664a();
    }

    /* renamed from: b */
    public final boolean mo16667b() {
        return this.f19437a.mo16667b();
    }

    /* renamed from: c */
    public final void mo16668c() {
        this.f19437a.mo16668c();
    }

    public C6822c(C6823d dVar, C6820a aVar) {
        this.f19437a = dVar;
        this.f19438b = aVar;
    }

    /* renamed from: a */
    private void m21209a(String str, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("model", this.f19437a.mo16664a());
        hashMap.put("engine", this.f19437a.getClass().getName());
        hashMap.put("method", str);
        hashMap.put("consume", String.valueOf(j));
        this.f19438b.mo16660a("MLCountEngine", hashMap);
    }

    /* renamed from: a */
    public final void mo16666a(FileInputStream fileInputStream, MLConfigModel mLConfigModel) throws Throwable {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f19437a.mo16666a(fileInputStream, mLConfigModel);
        m21209a("loadEvaluator", SystemClock.uptimeMillis() - uptimeMillis);
    }

    /* renamed from: a */
    public final float mo16663a(Map<String, Object> map, List<? extends C6833c> list, C6831a aVar, List<String> list2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        float a = this.f19437a.mo16663a(map, list, aVar, list2);
        m21209a("calculate", SystemClock.uptimeMillis() - uptimeMillis);
        return a;
    }

    /* renamed from: a */
    public final List<String> mo16665a(Map<String, Object> map, List<? extends C6833c> list, C6831a aVar, List<String> list2, Map<String, Float> map2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        List<String> a = this.f19437a.mo16665a(map, list, aVar, list2, map2);
        m21209a("classify", SystemClock.uptimeMillis() - uptimeMillis);
        return a;
    }
}
