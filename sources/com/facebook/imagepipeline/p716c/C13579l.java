package com.facebook.imagepipeline.p716c;

import com.facebook.cache.common.C13265a;
import com.facebook.common.internal.C13310j;
import com.facebook.common.memory.C13318c;
import com.facebook.common.memory.PooledByteBuffer;

/* renamed from: com.facebook.imagepipeline.c.l */
public final class C13579l {
    /* renamed from: a */
    public static C13570h<C13265a, PooledByteBuffer> m39974a(C13310j<C13586q> jVar, C13318c cVar) {
        C13570h<C13265a, PooledByteBuffer> hVar = new C13570h<>(new C13592v<PooledByteBuffer>() {
            /* renamed from: a */
            private static int m39975a(PooledByteBuffer pooledByteBuffer) {
                return pooledByteBuffer.mo32575a();
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ int mo29877a(Object obj) {
                return m39975a((PooledByteBuffer) obj);
            }
        }, new C13588s(), jVar);
        cVar.mo29905a(hVar);
        return hVar;
    }
}
