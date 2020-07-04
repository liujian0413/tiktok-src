package com.p1848vk.sdk.api.httpClient;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import com.p1848vk.sdk.api.httpClient.C47135a.C47139a;
import com.p1848vk.sdk.api.httpClient.VKAbstractOperation.C47133a;
import com.p1848vk.sdk.api.httpClient.VKAbstractOperation.C47134b;
import com.p1848vk.sdk.api.httpClient.VKAbstractOperation.VKOperationState;

/* renamed from: com.vk.sdk.api.httpClient.f */
public final class C47147f extends C47145e<Bitmap> {

    /* renamed from: f */
    public float f120968f;

    /* renamed from: com.vk.sdk.api.httpClient.f$a */
    public static abstract class C47150a extends C47133a<C47147f, Bitmap> {
    }

    /* renamed from: g */
    public final Bitmap mo118432c() {
        byte[] e = mo118434e();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(e, 0, e.length);
        if (this.f120968f > 0.0f) {
            return Bitmap.createScaledBitmap(decodeByteArray, (int) (((float) decodeByteArray.getWidth()) * this.f120968f), (int) (((float) decodeByteArray.getHeight()) * this.f120968f), true);
        }
        return decodeByteArray;
    }

    /* renamed from: a */
    public final void mo118436a(final C47150a aVar) {
        this.f120943c = new C47134b() {
            /* renamed from: a */
            public final void mo118424a() {
                if (C47147f.this.f120944d == VKOperationState.Finished && C47147f.this.f120963b == null) {
                    final Bitmap g = C47147f.this.mo118432c();
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            aVar.mo118402a(C47147f.this, g);
                        }
                    });
                    return;
                }
                aVar.mo118401a(C47147f.this, C47147f.this.mo118430a(C47147f.this.f120963b));
            }
        };
    }

    public C47147f(String str) {
        super(new C47139a(str));
    }
}
