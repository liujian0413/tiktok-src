package com.bytedance.android.livesdk.chatroom.p220ui;

import android.app.Dialog;
import com.bytedance.android.livesdk.C3916b;
import java.util.Random;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dx */
public final class C5302dx extends Dialog {
    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        C3916b.m13813a().mo11465b();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        C3916b.m13813a().mo11466c();
    }

    /* renamed from: a */
    public static int[] m16975a(int i, int i2, int i3) {
        int i4 = i2 + 0 + 1;
        if (i2 < 0 || 3 > i4 || i2 <= 2) {
            return null;
        }
        int[] iArr = new int[i4];
        int i5 = 0;
        for (int i6 = 0; i6 < i4 + 0; i6++) {
            iArr[i6 + 0] = i6;
        }
        int[] iArr2 = new int[3];
        Random random = new Random();
        while (i5 < 3) {
            int i7 = i4 - 1;
            int abs = Math.abs(random.nextInt() % i4);
            iArr2[i5] = iArr[abs];
            iArr[abs] = iArr[i7];
            i5++;
            i4 = i7;
        }
        return iArr2;
    }
}
