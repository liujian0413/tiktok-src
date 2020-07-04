package com.bytedance.ies.bullet.core.kit;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

public final class KitApiFinder {

    /* renamed from: a */
    public static final KitApiFinder f28063a = new KitApiFinder();

    /* renamed from: b */
    private static final Map<KitType, C10378c<C10386k, C10379d, C10382g, C10380e>> f28064b = new LinkedHashMap();

    /* renamed from: c */
    private static final Map<KitType, Class<C10378c<C10386k, C10379d, C10382g, C10380e>>> f28065c;

    public enum KitType {
        KIT_RN,
        KIT_WEB
    }

    private KitApiFinder() {
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037 A[Catch:{ Exception -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b A[Catch:{ Exception -> 0x0043 }] */
    static {
        /*
            com.bytedance.ies.bullet.core.kit.KitApiFinder r0 = new com.bytedance.ies.bullet.core.kit.KitApiFinder
            r0.<init>()
            f28063a = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            f28064b = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            com.bytedance.ies.bullet.core.kit.KitApiFinder$KitType r1 = com.bytedance.ies.bullet.core.kit.KitApiFinder.KitType.KIT_RN     // Catch:{ Exception -> 0x002d }
            java.lang.String r2 = "com.bytedance.ies.bullet.kit.rn.RnKitApi"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x002d }
            if (r2 == 0) goto L_0x0025
            r0.put(r1, r2)     // Catch:{ Exception -> 0x002d }
            goto L_0x002d
        L_0x0025:
            kotlin.TypeCastException r1 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x002d }
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Class<com.bytedance.ies.bullet.core.kit.KitGeneric /* = com.bytedance.ies.bullet.core.kit.IKitApi<com.bytedance.ies.bullet.core.kit.IKitSettingsProvider, com.bytedance.ies.bullet.core.kit.IKitDelegatesProvider, com.bytedance.ies.bullet.core.kit.IKitInstanceApi, com.bytedance.ies.bullet.core.kit.IKitGlobalSettingsProvider> */>"
            r1.<init>(r2)     // Catch:{ Exception -> 0x002d }
            throw r1     // Catch:{ Exception -> 0x002d }
        L_0x002d:
            com.bytedance.ies.bullet.core.kit.KitApiFinder$KitType r1 = com.bytedance.ies.bullet.core.kit.KitApiFinder.KitType.KIT_WEB     // Catch:{ Exception -> 0x0043 }
            java.lang.String r2 = "com.bytedance.ies.bullet.kit.web.WebKitApi"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x0043 }
            if (r2 == 0) goto L_0x003b
            r0.put(r1, r2)     // Catch:{ Exception -> 0x0043 }
            goto L_0x0043
        L_0x003b:
            kotlin.TypeCastException r1 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x0043 }
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Class<com.bytedance.ies.bullet.core.kit.KitGeneric /* = com.bytedance.ies.bullet.core.kit.IKitApi<com.bytedance.ies.bullet.core.kit.IKitSettingsProvider, com.bytedance.ies.bullet.core.kit.IKitDelegatesProvider, com.bytedance.ies.bullet.core.kit.IKitInstanceApi, com.bytedance.ies.bullet.core.kit.IKitGlobalSettingsProvider> */>"
            r1.<init>(r2)     // Catch:{ Exception -> 0x0043 }
            throw r1     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            f28065c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.core.kit.KitApiFinder.<clinit>():void");
    }

    /* renamed from: b */
    public static Class<C10378c<C10386k, C10379d, C10382g, C10380e>> m30651b(KitType kitType) {
        C7573i.m23587b(kitType, "type");
        return (Class) f28065c.get(kitType);
    }

    /* renamed from: a */
    public static C10378c<C10386k, C10379d, C10382g, C10380e> m30650a(KitType kitType) {
        C7573i.m23587b(kitType, "type");
        if (f28064b.get(kitType) == null) {
            try {
                if (kitType == KitType.KIT_RN) {
                    Map<KitType, C10378c<C10386k, C10379d, C10382g, C10380e>> map = f28064b;
                    Object newInstance = Class.forName("com.bytedance.ies.bullet.kit.rn.RnKitApi").newInstance();
                    if (newInstance != null) {
                        map.put(kitType, (C10378c) newInstance);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.core.kit.KitGeneric /* = com.bytedance.ies.bullet.core.kit.IKitApi<com.bytedance.ies.bullet.core.kit.IKitSettingsProvider, com.bytedance.ies.bullet.core.kit.IKitDelegatesProvider, com.bytedance.ies.bullet.core.kit.IKitInstanceApi, com.bytedance.ies.bullet.core.kit.IKitGlobalSettingsProvider> */");
                    }
                }
                if (kitType == KitType.KIT_WEB) {
                    Map<KitType, C10378c<C10386k, C10379d, C10382g, C10380e>> map2 = f28064b;
                    Object newInstance2 = Class.forName("com.bytedance.ies.bullet.kit.web.WebKitApi").newInstance();
                    if (newInstance2 != null) {
                        map2.put(kitType, (C10378c) newInstance2);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.core.kit.KitGeneric /* = com.bytedance.ies.bullet.core.kit.IKitApi<com.bytedance.ies.bullet.core.kit.IKitSettingsProvider, com.bytedance.ies.bullet.core.kit.IKitDelegatesProvider, com.bytedance.ies.bullet.core.kit.IKitInstanceApi, com.bytedance.ies.bullet.core.kit.IKitGlobalSettingsProvider> */");
                    }
                }
            } catch (Exception unused) {
            }
        }
        return (C10378c) f28064b.get(kitType);
    }
}
