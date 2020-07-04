package com.p280ss.android.ugc.aweme.net.cache;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p637a.C12464d;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.android.ugc.aweme.net.cache.g */
public final class C34051g {

    /* renamed from: a */
    private static Map<String, LruCache<String, C34048d>> f88810a = new HashMap();

    /* renamed from: a */
    static C34049e m109638a(C12462c cVar) {
        Object obj = cVar.f33105i;
        if (obj == null || !(obj instanceof C34049e)) {
            return null;
        }
        return (C34049e) obj;
    }

    /* renamed from: a */
    static C12534t m109637a(C12462c cVar, C12470a aVar, C34049e eVar) throws Exception {
        String str;
        LruCache lruCache;
        C34048d dVar;
        ReentrantLock reentrantLock;
        C12534t tVar;
        C12462c cVar2 = cVar;
        C34049e eVar2 = eVar;
        if (eVar2 == null || eVar2.f88808s == null) {
            return null;
        }
        C34047c cVar3 = eVar2.f88808s;
        StringBuilder sb = new StringBuilder();
        sb.append(cVar3.f88802a);
        sb.append(" ");
        sb.append(cVar3.f88804c);
        sb.append(" ");
        sb.append(cVar3.f88803b);
        String str2 = cVar2.f33098b;
        if (TextUtils.isEmpty(cVar3.f88802a)) {
            str = cVar.mo30444b();
        } else {
            str = cVar3.f88802a;
        }
        synchronized (f88810a) {
            lruCache = (LruCache) f88810a.get(str);
            if (lruCache == null) {
                new StringBuilder("add new map ").append(str);
                lruCache = new LruCache(cVar3.f88803b);
                f88810a.put(str, lruCache);
            }
        }
        synchronized (lruCache) {
            dVar = (C34048d) lruCache.get(str2);
            if (dVar != null) {
                new StringBuilder("has lock ").append(Thread.currentThread().getId());
                reentrantLock = dVar.f88807c;
            } else {
                new StringBuilder("new lock ").append(Thread.currentThread().getId());
                reentrantLock = new ReentrantLock(true);
                dVar = new C34048d();
                dVar.f88807c = reentrantLock;
                lruCache.put(str2, dVar);
            }
        }
        try {
            StringBuilder sb2 = new StringBuilder("before lock ");
            sb2.append(str2);
            sb2.append(Thread.currentThread().getId());
            reentrantLock.lock();
            if (dVar.f88805a != null) {
                if (System.currentTimeMillis() - dVar.f88806b <= ((long) cVar3.f88804c)) {
                    StringBuilder sb3 = new StringBuilder("use cache ");
                    sb3.append(str2);
                    sb3.append(" ");
                    sb3.append(Thread.currentThread().getId());
                    C12464d dVar2 = new C12464d("", C34943c.f91127w, "", Collections.emptyList(), null);
                    tVar = C12534t.m36420a(dVar.f88805a, dVar2);
                    eVar2.f88809t = true;
                    return tVar;
                }
            }
            tVar = aVar.mo30457a(cVar2);
            dVar.f88805a = tVar.f33302b;
            dVar.f88806b = System.currentTimeMillis();
            StringBuilder sb4 = new StringBuilder("new cache ");
            sb4.append(str2);
            sb4.append(" ");
            sb4.append(lruCache.size());
            sb4.append(" ");
            sb4.append(Thread.currentThread().getId());
            eVar2.f88809t = false;
            return tVar;
        } finally {
            reentrantLock.unlock();
            StringBuilder sb5 = new StringBuilder("end lock ");
            sb5.append(str2);
            sb5.append(" ");
            sb5.append(Thread.currentThread().getId());
        }
    }
}
