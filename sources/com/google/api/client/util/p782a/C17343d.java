package com.google.api.client.util.p782a;

import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.google.api.client.util.a.d */
final class C17343d {

    /* renamed from: a */
    private static final ThreadLocal<char[]> f48261a = new ThreadLocal<char[]>() {
        /* renamed from: a */
        private static char[] m57764a() {
            return new char[PreloadTask.BYTE_UNIT_NUMBER];
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return m57764a();
        }
    };

    /* renamed from: a */
    static char[] m57763a() {
        return (char[]) f48261a.get();
    }
}
