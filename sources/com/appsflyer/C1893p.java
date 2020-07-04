package com.appsflyer;

/* renamed from: com.appsflyer.p */
final class C1893p implements C1894b {

    /* renamed from: ˋ */
    private C1894b f6842 = this;

    /* renamed from: com.appsflyer.p$b */
    interface C1894b {
        /* renamed from: ˎ */
        Class<?> mo7505(String str) throws ClassNotFoundException;
    }

    /* renamed from: com.appsflyer.p$e */
    enum C1895e {
        UNITY("android_unity", "com.unity3d.player.UnityPlayer"),
        REACT_NATIVE("android_reactNative", "com.facebook.react.ReactApplication"),
        CORDOVA("android_cordova", "org.apache.cordova.CordovaActivity"),
        SEGMENT("android_segment", "com.segment.analytics.integrations.Integration"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        DEFAULT("android_native", "android_native");
        
        /* access modifiers changed from: private */

        /* renamed from: ʻ */
        public String f6850;
        /* access modifiers changed from: private */

        /* renamed from: ʼ */
        public String f6851;

        private C1895e(String str, String str2) {
            this.f6851 = str;
            this.f6850 = str2;
        }
    }

    C1893p() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ॱ */
    public final String mo7506() {
        C1895e[] values;
        for (C1895e eVar : C1895e.values()) {
            if (m8789(eVar.f6850)) {
                return eVar.f6851;
            }
        }
        return C1895e.DEFAULT.f6851;
    }

    /* renamed from: ˎ */
    public final Class<?> mo7505(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    /* renamed from: ˋ */
    private boolean m8789(String str) {
        try {
            this.f6842.mo7505(str);
            StringBuilder sb = new StringBuilder("Class: ");
            sb.append(str);
            sb.append(" is found.");
            AFLogger.afRDLog(sb.toString());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return false;
        }
    }
}
