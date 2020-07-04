package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.text.TextUtils;
import android.util.Pair;
import java.util.HashMap;

public final class bgz {

    /* renamed from: a */
    private static final HashMap<C15568a, Pair<String, CodecCapabilities>> f41977a = new HashMap<>();

    /* renamed from: com.google.android.gms.internal.ads.bgz$a */
    static final class C15568a {

        /* renamed from: a */
        public final String f41978a;

        /* renamed from: b */
        public final boolean f41979b;

        public C15568a(String str, boolean z) {
            this.f41978a = str;
            this.f41979b = z;
        }

        public final int hashCode() {
            return (((this.f41978a == null ? 0 : this.f41978a.hashCode()) + 31) * 31) + (this.f41979b ? 1231 : 1237);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C15568a.class) {
                return false;
            }
            C15568a aVar = (C15568a) obj;
            return TextUtils.equals(this.f41978a, aVar.f41978a) && this.f41979b == aVar.f41979b;
        }
    }

    /* renamed from: a */
    public static bgg m48760a(String str, boolean z) throws zzgy {
        Pair b = m48761b(str, z);
        if (b == null) {
            return null;
        }
        return new bgg((String) b.first, bkn.f42386a >= 19 ? ((CodecCapabilities) b.second).isFeatureSupported("adaptive-playback") : false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        return r4;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized android.util.Pair<java.lang.String, android.media.MediaCodecInfo.CodecCapabilities> m48761b(java.lang.String r4, boolean r5) throws com.google.android.gms.internal.ads.zzgy {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.bgz> r0 = com.google.android.gms.internal.ads.bgz.class
            monitor-enter(r0)
            com.google.android.gms.internal.ads.bgz$a r1 = new com.google.android.gms.internal.ads.bgz$a     // Catch:{ all -> 0x0043 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0043 }
            java.util.HashMap<com.google.android.gms.internal.ads.bgz$a, android.util.Pair<java.lang.String, android.media.MediaCodecInfo$CodecCapabilities>> r4 = f41977a     // Catch:{ all -> 0x0043 }
            boolean r4 = r4.containsKey(r1)     // Catch:{ all -> 0x0043 }
            if (r4 == 0) goto L_0x001a
            java.util.HashMap<com.google.android.gms.internal.ads.bgz$a, android.util.Pair<java.lang.String, android.media.MediaCodecInfo$CodecCapabilities>> r4 = f41977a     // Catch:{ all -> 0x0043 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x0043 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x0043 }
            monitor-exit(r0)
            return r4
        L_0x001a:
            int r4 = com.google.android.gms.internal.ads.bkn.f42386a     // Catch:{ all -> 0x0043 }
            r2 = 0
            r3 = 21
            if (r4 < r3) goto L_0x0027
            com.google.android.gms.internal.ads.bhe r4 = new com.google.android.gms.internal.ads.bhe     // Catch:{ all -> 0x0043 }
            r4.<init>(r5)     // Catch:{ all -> 0x0043 }
            goto L_0x002c
        L_0x0027:
            com.google.android.gms.internal.ads.bhd r4 = new com.google.android.gms.internal.ads.bhd     // Catch:{ all -> 0x0043 }
            r4.<init>()     // Catch:{ all -> 0x0043 }
        L_0x002c:
            android.util.Pair r4 = m48759a(r1, r4)     // Catch:{ all -> 0x0043 }
            if (r5 == 0) goto L_0x0041
            if (r4 != 0) goto L_0x0041
            int r5 = com.google.android.gms.internal.ads.bkn.f42386a     // Catch:{ all -> 0x0043 }
            if (r5 < r3) goto L_0x0041
            com.google.android.gms.internal.ads.bhd r4 = new com.google.android.gms.internal.ads.bhd     // Catch:{ all -> 0x0043 }
            r4.<init>()     // Catch:{ all -> 0x0043 }
            android.util.Pair r4 = m48759a(r1, r4)     // Catch:{ all -> 0x0043 }
        L_0x0041:
            monitor-exit(r0)
            return r4
        L_0x0043:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bgz.m48761b(java.lang.String, boolean):android.util.Pair");
    }

    /* renamed from: a */
    private static Pair<String, CodecCapabilities> m48759a(C15568a aVar, bhb bhb) throws zzgy {
        C15568a aVar2 = aVar;
        bhb bhb2 = bhb;
        try {
            String str = aVar2.f41978a;
            int a = bhb.mo40684a();
            boolean b = bhb.mo40687b();
            boolean z = false;
            int i = 0;
            while (i < a) {
                MediaCodecInfo a2 = bhb2.mo40685a(i);
                String name = a2.getName();
                if (!a2.isEncoder() && name.startsWith("OMX.") && (b || !name.endsWith(".secure"))) {
                    String[] supportedTypes = a2.getSupportedTypes();
                    int i2 = 0;
                    while (i2 < supportedTypes.length) {
                        String str2 = supportedTypes[i2];
                        if (str2.equalsIgnoreCase(str)) {
                            CodecCapabilities capabilitiesForType = a2.getCapabilitiesForType(str2);
                            boolean a3 = bhb2.mo40686a(aVar2.f41978a, capabilitiesForType);
                            if (!b) {
                                f41977a.put(aVar2.f41979b ? new C15568a(str, z) : aVar2, Pair.create(name, capabilitiesForType));
                                if (a3) {
                                    f41977a.put(aVar2.f41979b ? aVar2 : new C15568a(str, true), Pair.create(String.valueOf(name).concat(".secure"), capabilitiesForType));
                                }
                            } else {
                                f41977a.put(aVar2.f41979b == a3 ? aVar2 : new C15568a(str, a3), Pair.create(name, capabilitiesForType));
                            }
                            if (f41977a.containsKey(aVar2)) {
                                return (Pair) f41977a.get(aVar2);
                            }
                        }
                        i2++;
                        z = false;
                    }
                    continue;
                }
                i++;
                z = false;
            }
            return null;
        } catch (Exception e) {
            throw new zzgy(e);
        }
    }
}
