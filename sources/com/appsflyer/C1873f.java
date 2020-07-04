package com.appsflyer;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.content.C0683b;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.appsflyer.f */
final class C1873f {

    /* renamed from: ʻ */
    private static volatile C1873f f6785;

    /* renamed from: ʼ */
    private static final Handler f6786 = new Handler(Looper.getMainLooper());

    /* renamed from: ॱॱ */
    private static final BitSet f6787 = new BitSet(6);

    /* renamed from: ʽ */
    private final Map<C1883i, C1883i> f6788 = new HashMap(f6787.size());

    /* renamed from: ˊ */
    final Runnable f6789 = new C18754();

    /* renamed from: ˋ */
    boolean f6790;

    /* renamed from: ˋॱ */
    private boolean f6791;

    /* renamed from: ˎ */
    final Handler f6792;

    /* renamed from: ˏ */
    final Object f6793 = new Object();

    /* renamed from: ͺ */
    private final SensorManager f6794;

    /* renamed from: ॱ */
    final Runnable f6795 = new C18741();

    /* renamed from: ॱˊ */
    private final Map<C1883i, Map<String, Object>> f6796 = new HashMap(f6787.size());

    /* renamed from: ᐝ */
    final Runnable f6797 = new Runnable() {
        public final void run() {
            synchronized (C1873f.this.f6793) {
                if (C1873f.this.f6790) {
                    C1873f.this.f6792.removeCallbacks(C1873f.this.f6789);
                    C1873f.this.f6792.removeCallbacks(C1873f.this.f6795);
                    C1873f.this.mo7470();
                    C1873f.this.f6790 = false;
                }
            }
        }
    };

    /* renamed from: com.appsflyer.f$1 */
    class C18741 implements Runnable {
        C18741() {
        }

        public final void run() {
            synchronized (C1873f.this.f6793) {
                C1873f.this.mo7470();
                C1873f.this.f6792.postDelayed(C1873f.this.f6789, 1800000);
            }
        }

        C18741() {
        }

        /* renamed from: ˋ */
        static boolean m8756(Context context, String str) {
            int b = C0683b.m2909b(context, str);
            StringBuilder sb = new StringBuilder("is Permission Available: ");
            sb.append(str);
            sb.append("; res: ");
            sb.append(b);
            AFLogger.afRDLog(sb.toString());
            if (b == 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.appsflyer.f$4 */
    class C18754 implements Runnable {

        /* renamed from: ˊ */
        private static String f6799;

        /* renamed from: ॱ */
        private static String f6800;

        C18754() {
        }

        public final void run() {
            synchronized (C1873f.this.f6793) {
                C1873f.this.mo7471();
                C1873f.this.f6792.postDelayed(C1873f.this.f6795, 500);
                C1873f.this.f6790 = true;
            }
        }

        C18754() {
        }

        /* renamed from: ˊ */
        static void m8757(String str) {
            f6799 = str;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (i == 0 || i == str.length() - 1) {
                    sb.append(str.charAt(i));
                } else {
                    sb.append("*");
                }
            }
            f6800 = sb.toString();
        }

        /* renamed from: ॱ */
        static void m8758(String str) {
            if (f6799 == null) {
                m8757(AppsFlyerProperties.getInstance().getString("AppsFlyerKey"));
            }
            if (f6799 != null && str.contains(f6799)) {
                AFLogger.afInfoLog(str.replace(f6799, f6800));
            }
        }
    }

    static {
        f6787.set(1);
        f6787.set(2);
        f6787.set(4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˏ */
    public final void mo7470() {
        try {
            if (!this.f6788.isEmpty()) {
                for (C1883i iVar : this.f6788.values()) {
                    this.f6794.unregisterListener(iVar);
                    iVar.mo7486(this.f6796);
                }
            }
        } catch (Throwable unused) {
        }
        this.f6791 = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˎ */
    public final List<Map<String, Object>> mo7469() {
        synchronized (this.f6793) {
            if (!this.f6788.isEmpty() && this.f6791) {
                for (C1883i r2 : this.f6788.values()) {
                    r2.mo7485(this.f6796);
                }
            }
            if (this.f6796.isEmpty()) {
                List<Map<String, Object>> emptyList = Collections.emptyList();
                return emptyList;
            }
            ArrayList arrayList = new ArrayList(this.f6796.values());
            return arrayList;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ॱ */
    public final void mo7471() {
        boolean z;
        try {
            for (Sensor sensor : this.f6794.getSensorList(-1)) {
                int type = sensor.getType();
                if (type < 0 || !f6787.get(type)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C1883i r3 = C1883i.m8767(sensor);
                    if (!this.f6788.containsKey(r3)) {
                        this.f6788.put(r3, r3);
                    }
                    this.f6794.registerListener((SensorEventListener) this.f6788.get(r3), sensor, 0);
                }
            }
        } catch (Throwable unused) {
        }
        this.f6791 = true;
    }

    /* renamed from: ॱ */
    static C1873f m8751(Context context) {
        return m8752((SensorManager) context.getApplicationContext().getSystemService("sensor"), f6786);
    }

    private C1873f(SensorManager sensorManager, Handler handler) {
        this.f6794 = sensorManager;
        this.f6792 = handler;
    }

    /* renamed from: ॱ */
    private static C1873f m8752(SensorManager sensorManager, Handler handler) {
        if (f6785 == null) {
            synchronized (C1873f.class) {
                if (f6785 == null) {
                    f6785 = new C1873f(sensorManager, handler);
                }
            }
        }
        return f6785;
    }
}
