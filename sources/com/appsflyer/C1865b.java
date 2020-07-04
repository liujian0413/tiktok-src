package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.appsflyer.b */
final class C1865b {

    /* renamed from: ॱ */
    private IntentFilter f6761 = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: com.appsflyer.b$a */
    static final class C1866a {

        /* renamed from: ˏ */
        static final C1865b f6762 = new C1865b();
    }

    /* renamed from: com.appsflyer.b$c */
    static final class C1867c {

        /* renamed from: ˎ */
        public final String f6763;

        /* renamed from: ˏ */
        public final float f6764;

        C1867c() {
        }

        C1867c(float f, String str) {
            this.f6764 = f;
            this.f6763 = str;
        }
    }

    C1865b() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˊ */
    public final C1867c mo7461(Context context) {
        boolean z;
        String str;
        String str2 = null;
        float f = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver(null, this.f6761);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra("status", -1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    if (intExtra != 4) {
                        switch (intExtra) {
                            case 1:
                                str = "ac";
                                break;
                            case 2:
                                str = "usb";
                                break;
                            default:
                                str = "other";
                                break;
                        }
                    } else {
                        str = "wireless";
                    }
                } else {
                    str = "no";
                }
                str2 = str;
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (!(-1 == intExtra2 || -1 == intExtra3)) {
                    f = (((float) intExtra2) * 100.0f) / ((float) intExtra3);
                }
            }
        } catch (Throwable unused) {
        }
        return new C1867c(f, str2);
    }
}
