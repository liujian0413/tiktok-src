package com.airbnb.lottie.p055c;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.model.content.C1807c;
import com.airbnb.lottie.p056d.C1750e;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.l */
public final class C1729l implements C1718aj<C1807c> {

    /* renamed from: a */
    private int f6278a;

    public C1729l(int i) {
        this.f6278a = i;
    }

    /* renamed from: a */
    private void m8286a(C1807c cVar, List<Float> list) {
        int i = this.f6278a * 4;
        if (list.size() > i) {
            int size = (list.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i2 = 0;
            while (i < list.size()) {
                if (i % 2 == 0) {
                    dArr[i2] = (double) ((Float) list.get(i)).floatValue();
                } else {
                    dArr2[i2] = (double) ((Float) list.get(i)).floatValue();
                    i2++;
                }
                i++;
            }
            for (int i3 = 0; i3 < cVar.mo7298a(); i3++) {
                int i4 = cVar.f6504b[i3];
                cVar.f6504b[i3] = Color.argb(m8285a((double) cVar.f6503a[i3], dArr, dArr2), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C1807c mo7163a(JsonReader jsonReader, float f) throws IOException {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (z) {
            jsonReader.endArray();
        }
        if (this.f6278a == -1) {
            this.f6278a = arrayList.size() / 4;
        }
        float[] fArr = new float[this.f6278a];
        int[] iArr = new int[this.f6278a];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f6278a * 4; i3++) {
            int i4 = i3 / 4;
            double floatValue = (double) ((Float) arrayList.get(i3)).floatValue();
            switch (i3 % 4) {
                case 0:
                    fArr[i4] = (float) floatValue;
                    break;
                case 1:
                    Double.isNaN(floatValue);
                    i = (int) (floatValue * 255.0d);
                    break;
                case 2:
                    Double.isNaN(floatValue);
                    i2 = (int) (floatValue * 255.0d);
                    break;
                case 3:
                    Double.isNaN(floatValue);
                    iArr[i4] = Color.argb(NormalGiftView.ALPHA_255, i, i2, (int) (floatValue * 255.0d));
                    break;
            }
        }
        C1807c cVar = new C1807c(fArr, iArr);
        m8286a(cVar, (List<Float>) arrayList);
        return cVar;
    }

    /* renamed from: a */
    private static int m8285a(double d, double[] dArr, double[] dArr2) {
        double[] dArr3 = dArr;
        double[] dArr4 = dArr2;
        for (int i = 1; i < dArr3.length; i++) {
            int i2 = i - 1;
            double d2 = dArr3[i2];
            double d3 = dArr3[i];
            if (dArr3[i] >= d) {
                return (int) (C1750e.m8355a(dArr4[i2], dArr4[i], (d - d2) / (d3 - d2)) * 255.0d);
            }
        }
        return (int) (dArr4[dArr4.length - 1] * 255.0d);
    }
}
