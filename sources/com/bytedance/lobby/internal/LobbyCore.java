package com.bytedance.lobby.internal;

import android.app.Application;
import com.bytedance.lobby.C12191a;
import com.bytedance.lobby.C12203b;
import com.bytedance.lobby.auth.C12201d;
import com.bytedance.lobby.internal.C12222c.C12224a;
import com.bytedance.lobby.p614a.C12193b;

public final class LobbyCore {
    private static final boolean DEBUG = C12191a.f32435a;
    private static Application sApplication;

    public static Application getApplication() {
        return sApplication;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.lobby.p614a.C12193b createShare(com.bytedance.lobby.C12203b r3) {
        /*
            java.lang.String r0 = r3.f32466b
            int r1 = r0.hashCode()
            r2 = -1240244679(0xffffffffb6135e39, float:-2.1959552E-6)
            if (r1 == r2) goto L_0x001b
            r2 = 497130182(0x1da19ac6, float:4.2776377E-21)
            if (r1 == r2) goto L_0x0011
            goto L_0x0025
        L_0x0011:
            java.lang.String r1 = "facebook"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0025
            r0 = 1
            goto L_0x0026
        L_0x001b:
            java.lang.String r1 = "google"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0025
            r0 = 0
            goto L_0x0026
        L_0x0025:
            r0 = -1
        L_0x0026:
            switch(r0) {
                case 0: goto L_0x0031;
                case 1: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r3 = 0
            return r3
        L_0x002b:
            com.bytedance.lobby.facebook.FacebookShare r0 = new com.bytedance.lobby.facebook.FacebookShare
            r0.<init>(r3)
            return r0
        L_0x0031:
            com.bytedance.lobby.google.GoogleShare r0 = new com.bytedance.lobby.google.GoogleShare
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lobby.internal.LobbyCore.createShare(com.bytedance.lobby.b):com.bytedance.lobby.a.b");
    }

    static void initialize(C12224a aVar) {
        if (aVar.f32506a != null) {
            sApplication = (Application) aVar.f32507b;
            C12191a.f32435a = aVar.f32508c;
            for (C12203b bVar : aVar.f32506a) {
                int i = bVar.f32465a;
                if (i == 2) {
                    registerAuth(bVar);
                } else if (i == 3) {
                    registerShare(bVar);
                } else {
                    registerAuth(bVar);
                    registerShare(bVar);
                }
            }
        }
    }

    private static void registerAuth(C12203b bVar) {
        C12201d createAuth = createAuth(bVar);
        if (createAuth != null) {
            C12222c.m35539a().mo29967a(createAuth);
        } else if (C12191a.f32435a) {
            StringBuilder sb = new StringBuilder("Cannot find Provider with id ");
            sb.append(bVar.f32466b);
            throw new NullPointerException(sb.toString());
        }
    }

    private static void registerShare(C12203b bVar) {
        C12193b createShare = createShare(bVar);
        if (createShare != null) {
            C12222c.m35541b().mo29915a(createShare);
        } else if (C12191a.f32435a) {
            StringBuilder sb = new StringBuilder("Cannot find Provider with id ");
            sb.append(bVar.f32466b);
            throw new NullPointerException(sb.toString());
        }
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.lobby.auth.C12201d createAuth(com.bytedance.lobby.C12203b r2) {
        /*
            java.lang.String r0 = r2.f32466b
            int r1 = r0.hashCode()
            switch(r1) {
                case -1240244679: goto L_0x0046;
                case -916346253: goto L_0x003c;
                case 3765: goto L_0x0032;
                case 3321844: goto L_0x0028;
                case 28903346: goto L_0x001e;
                case 486515695: goto L_0x0014;
                case 497130182: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x0050
        L_0x000a:
            java.lang.String r1 = "facebook"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0050
            r0 = 1
            goto L_0x0051
        L_0x0014:
            java.lang.String r1 = "kakaotalk"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0050
            r0 = 5
            goto L_0x0051
        L_0x001e:
            java.lang.String r1 = "instagram"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0050
            r0 = 3
            goto L_0x0051
        L_0x0028:
            java.lang.String r1 = "line"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0050
            r0 = 2
            goto L_0x0051
        L_0x0032:
            java.lang.String r1 = "vk"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0050
            r0 = 6
            goto L_0x0051
        L_0x003c:
            java.lang.String r1 = "twitter"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0050
            r0 = 4
            goto L_0x0051
        L_0x0046:
            java.lang.String r1 = "google"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0050
            r0 = 0
            goto L_0x0051
        L_0x0050:
            r0 = -1
        L_0x0051:
            switch(r0) {
                case 0: goto L_0x007a;
                case 1: goto L_0x0074;
                case 2: goto L_0x006e;
                case 3: goto L_0x0068;
                case 4: goto L_0x0062;
                case 5: goto L_0x005c;
                case 6: goto L_0x0056;
                default: goto L_0x0054;
            }
        L_0x0054:
            r2 = 0
            return r2
        L_0x0056:
            com.bytedance.lobby.vk.VkAuth r0 = new com.bytedance.lobby.vk.VkAuth
            r0.<init>(r2)
            return r0
        L_0x005c:
            com.bytedance.lobby.kakao.KakaoAuth r0 = new com.bytedance.lobby.kakao.KakaoAuth
            r0.<init>(r2)
            return r0
        L_0x0062:
            com.bytedance.lobby.twitter.TwitterAuth r0 = new com.bytedance.lobby.twitter.TwitterAuth
            r0.<init>(r2)
            return r0
        L_0x0068:
            com.bytedance.lobby.instagram.InstagramAuth r0 = new com.bytedance.lobby.instagram.InstagramAuth
            r0.<init>(r2)
            return r0
        L_0x006e:
            com.bytedance.lobby.line.LineAuth r0 = new com.bytedance.lobby.line.LineAuth
            r0.<init>(r2)
            return r0
        L_0x0074:
            com.bytedance.lobby.facebook.FacebookAuth r0 = new com.bytedance.lobby.facebook.FacebookAuth
            r0.<init>(r2)
            return r0
        L_0x007a:
            com.bytedance.lobby.google.GoogleAuth r0 = new com.bytedance.lobby.google.GoogleAuth
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lobby.internal.LobbyCore.createAuth(com.bytedance.lobby.b):com.bytedance.lobby.auth.d");
    }
}
