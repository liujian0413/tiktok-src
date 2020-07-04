package com.p280ss.android.ugc.aweme.store;

/* renamed from: com.ss.android.ugc.aweme.store.LocalStore */
public final class LocalStore {

    /* renamed from: com.ss.android.ugc.aweme.store.LocalStore$Type */
    public enum Type {
        POST(new C41960b() {
            /* renamed from: a */
            public final Object mo102974a(Object[] objArr) throws Exception {
                C41959a.m133427a(objArr[0]);
                return null;
            }
        }),
        PROFILE(new C41960b() {
            /* renamed from: a */
            public final Object mo102974a(Object[] objArr) throws Exception {
                C41959a.m133429b(objArr[0]);
                return null;
            }
        }),
        COMMENT(new C41960b() {
            /* renamed from: a */
            public final Object mo102974a(Object[] objArr) throws Exception {
                C41959a.m133428a(objArr[0], objArr[1]);
                return null;
            }
        });
        
        private C41960b preloader;

        public final C41960b getPreloader() {
            return this.preloader;
        }

        private Type(C41960b bVar) {
            this.preloader = bVar;
        }
    }
}
