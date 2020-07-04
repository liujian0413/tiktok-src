package com.p280ss.android.ugc.aweme.services.publish;

/* renamed from: com.ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils */
public final class AVPublishExtensionUtils {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r1 == false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T findExtension(java.util.List<? extends android.support.p022v4.util.C0902i<java.lang.Class<?>, com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension<?>>> r5, java.lang.Class<?> r6) {
        /*
            java.lang.String r0 = "$this$findExtension"
            kotlin.jvm.internal.C7573i.m23587b(r5, r0)
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r1 = 0
            r2 = r0
        L_0x0013:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x0035
            java.lang.Object r3 = r5.next()
            r4 = r3
            android.support.v4.util.i r4 = (android.support.p022v4.util.C0902i) r4
            F r4 = r4.f3154a
            if (r4 != 0) goto L_0x0027
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0027:
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r4 = kotlin.jvm.internal.C7573i.m23585a(r4, r6)
            if (r4 == 0) goto L_0x0013
            if (r1 == 0) goto L_0x0032
            goto L_0x0037
        L_0x0032:
            r1 = 1
            r2 = r3
            goto L_0x0013
        L_0x0035:
            if (r1 != 0) goto L_0x0038
        L_0x0037:
            r2 = r0
        L_0x0038:
            android.support.v4.util.i r2 = (android.support.p022v4.util.C0902i) r2
            if (r2 == 0) goto L_0x0041
            S r5 = r2.f3155b
            r0 = r5
            com.ss.android.ugc.aweme.services.publish.IAVPublishExtension r0 = (com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension) r0
        L_0x0041:
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils.findExtension(java.util.List, java.lang.Class):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r1 == false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T findModel(java.util.List<? extends android.support.p022v4.util.C0902i<java.lang.Class<?>, com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension<?>>> r5, java.lang.Class<T> r6) {
        /*
            java.lang.String r0 = "$this$findModel"
            kotlin.jvm.internal.C7573i.m23587b(r5, r0)
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r1 = 0
            r2 = r0
        L_0x0013:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x0035
            java.lang.Object r3 = r5.next()
            r4 = r3
            android.support.v4.util.i r4 = (android.support.p022v4.util.C0902i) r4
            F r4 = r4.f3154a
            if (r4 != 0) goto L_0x0027
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0027:
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r4 = kotlin.jvm.internal.C7573i.m23585a(r4, r6)
            if (r4 == 0) goto L_0x0013
            if (r1 == 0) goto L_0x0032
            goto L_0x0037
        L_0x0032:
            r1 = 1
            r2 = r3
            goto L_0x0013
        L_0x0035:
            if (r1 != 0) goto L_0x0038
        L_0x0037:
            r2 = r0
        L_0x0038:
            android.support.v4.util.i r2 = (android.support.p022v4.util.C0902i) r2
            if (r2 == 0) goto L_0x0047
            S r5 = r2.f3155b
            com.ss.android.ugc.aweme.services.publish.IAVPublishExtension r5 = (com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension) r5
            if (r5 == 0) goto L_0x0047
            java.lang.Object r5 = r5.provideExtensionData()
            return r5
        L_0x0047:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils.findModel(java.util.List, java.lang.Class):java.lang.Object");
    }
}
