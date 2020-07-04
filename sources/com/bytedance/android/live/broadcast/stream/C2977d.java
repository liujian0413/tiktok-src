package com.bytedance.android.live.broadcast.stream;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.bytedance.android.live.broadcast.stream.monitor.C2980a;
import com.bytedance.android.live.broadcast.stream.p143b.C2965a;
import com.bytedance.android.live.broadcast.stream.p143b.C2966b;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;

/* renamed from: com.bytedance.android.live.broadcast.stream.d */
public final class C2977d {

    /* renamed from: A */
    int f9243A;

    /* renamed from: B */
    boolean f9244B;

    /* renamed from: C */
    boolean f9245C;

    /* renamed from: D */
    String f9246D;

    /* renamed from: E */
    boolean f9247E;

    /* renamed from: F */
    String f9248F;

    /* renamed from: G */
    String f9249G;

    /* renamed from: H */
    AssetManager f9250H;

    /* renamed from: I */
    Object f9251I;

    /* renamed from: J */
    String f9252J;

    /* renamed from: K */
    boolean f9253K;

    /* renamed from: L */
    int f9254L;

    /* renamed from: a */
    Context f9255a;

    /* renamed from: b */
    String f9256b;

    /* renamed from: c */
    int f9257c;

    /* renamed from: d */
    int f9258d;

    /* renamed from: e */
    int f9259e;

    /* renamed from: f */
    int f9260f;

    /* renamed from: g */
    int f9261g;

    /* renamed from: h */
    int f9262h;

    /* renamed from: i */
    int f9263i;

    /* renamed from: j */
    int f9264j;

    /* renamed from: k */
    int f9265k;

    /* renamed from: l */
    boolean f9266l;

    /* renamed from: m */
    int f9267m;

    /* renamed from: n */
    int f9268n;

    /* renamed from: o */
    long f9269o;

    /* renamed from: p */
    int f9270p;

    /* renamed from: q */
    int f9271q;

    /* renamed from: r */
    C2965a f9272r;

    /* renamed from: s */
    C2980a f9273s;

    /* renamed from: t */
    C2966b f9274t;

    /* renamed from: u */
    Intent f9275u;

    /* renamed from: v */
    int f9276v;

    /* renamed from: w */
    int f9277w;

    /* renamed from: x */
    int f9278x;

    /* renamed from: y */
    float f9279y;

    /* renamed from: z */
    boolean f9280z = true;

    /* renamed from: com.bytedance.android.live.broadcast.stream.d$a */
    public static class C2978a {

        /* renamed from: A */
        String f9281A;

        /* renamed from: B */
        boolean f9282B = true;

        /* renamed from: C */
        String f9283C;

        /* renamed from: D */
        C2965a f9284D;

        /* renamed from: E */
        C2980a f9285E;

        /* renamed from: F */
        AssetManager f9286F;

        /* renamed from: G */
        String f9287G;

        /* renamed from: H */
        Object f9288H;

        /* renamed from: I */
        boolean f9289I;

        /* renamed from: J */
        int f9290J;

        /* renamed from: K */
        int f9291K;

        /* renamed from: L */
        int f9292L = 2;

        /* renamed from: a */
        Context f9293a;

        /* renamed from: b */
        String f9294b;

        /* renamed from: c */
        int f9295c;

        /* renamed from: d */
        int f9296d;

        /* renamed from: e */
        int f9297e;

        /* renamed from: f */
        int f9298f;

        /* renamed from: g */
        int f9299g;

        /* renamed from: h */
        int f9300h;

        /* renamed from: i */
        int f9301i;

        /* renamed from: j */
        boolean f9302j;

        /* renamed from: k */
        int f9303k;

        /* renamed from: l */
        int f9304l;

        /* renamed from: m */
        long f9305m;

        /* renamed from: n */
        int f9306n;

        /* renamed from: o */
        int f9307o;

        /* renamed from: p */
        Intent f9308p;

        /* renamed from: q */
        int f9309q = -1;

        /* renamed from: r */
        int f9310r = -1;

        /* renamed from: s */
        C2966b f9311s;

        /* renamed from: t */
        int f9312t;

        /* renamed from: u */
        String f9313u;

        /* renamed from: v */
        float f9314v;

        /* renamed from: w */
        boolean f9315w;

        /* renamed from: x */
        int f9316x;

        /* renamed from: y */
        boolean f9317y;

        /* renamed from: z */
        boolean f9318z;

        /* renamed from: a */
        public final C2978a mo9760a(boolean z) {
            this.f9302j = z;
            return this;
        }

        /* renamed from: a */
        public final C2978a mo9761a(boolean z, String str) {
            this.f9318z = z;
            this.f9281A = str;
            return this;
        }

        /* renamed from: a */
        public final C2977d mo9762a() {
            this.f9296d = this.f9296d == 0 ? VETransitionFilterParam.TransitionDuration_DEFAULT : this.f9296d;
            this.f9297e = this.f9297e == 0 ? C34943c.f91127w : this.f9297e;
            this.f9298f = this.f9298f == 0 ? 800 : this.f9298f;
            this.f9300h = this.f9300h == 0 ? 360 : this.f9300h;
            this.f9301i = this.f9301i == 0 ? 640 : this.f9301i;
            this.f9299g = this.f9299g == 0 ? 15 : this.f9299g;
            this.f9304l = this.f9304l == 0 ? 9 : this.f9304l;
            this.f9305m = this.f9305m == 0 ? 60000 : this.f9305m;
            this.f9306n = this.f9306n == 0 ? 44100 : this.f9306n;
            int i = 2;
            int i2 = 1;
            if (this.f9307o != 2) {
                i = 1;
            }
            this.f9307o = i;
            this.f9294b = TextUtils.isEmpty(this.f9294b) ? "" : this.f9294b;
            this.f9303k = this.f9303k == 0 ? 1 : Math.min(this.f9303k, 3);
            this.f9309q = this.f9309q == -1 ? 4 : this.f9309q;
            this.f9310r = this.f9310r == -1 ? 1 : this.f9310r;
            this.f9313u = "".equals(this.f9313u) ? "live-stream-sdk" : this.f9313u;
            if (this.f9316x != 0) {
                i2 = this.f9316x;
            }
            this.f9316x = i2;
            this.f9314v = this.f9314v == 0.0f ? 2.0f : this.f9314v;
            this.f9283C = this.f9283C == null ? "" : this.f9283C;
            this.f9281A = this.f9281A == null ? "" : this.f9281A;
            return new C2977d(this);
        }

        /* renamed from: a */
        public final C2978a mo9750a(float f) {
            this.f9314v = f;
            return this;
        }

        /* renamed from: b */
        public final C2978a mo9763b(int i) {
            this.f9296d = i;
            return this;
        }

        /* renamed from: c */
        public final C2978a mo9766c(int i) {
            this.f9297e = i;
            return this;
        }

        /* renamed from: d */
        public final C2978a mo9769d(int i) {
            this.f9298f = i;
            return this;
        }

        /* renamed from: e */
        public final C2978a mo9771e(int i) {
            this.f9299g = i;
            return this;
        }

        /* renamed from: f */
        public final C2978a mo9773f(int i) {
            this.f9300h = i;
            return this;
        }

        /* renamed from: g */
        public final C2978a mo9774g(int i) {
            this.f9301i = i;
            return this;
        }

        /* renamed from: h */
        public final C2978a mo9775h(int i) {
            this.f9303k = i;
            return this;
        }

        /* renamed from: i */
        public final C2978a mo9776i(int i) {
            this.f9307o = i;
            return this;
        }

        /* renamed from: j */
        public final C2978a mo9777j(int i) {
            this.f9309q = i;
            return this;
        }

        /* renamed from: k */
        public final C2978a mo9778k(int i) {
            this.f9310r = 0;
            return this;
        }

        /* renamed from: l */
        public final C2978a mo9779l(int i) {
            this.f9312t = i;
            return this;
        }

        /* renamed from: m */
        public final C2978a mo9780m(int i) {
            this.f9316x = i;
            return this;
        }

        /* renamed from: n */
        public final C2978a mo9781n(int i) {
            this.f9292L = 1;
            return this;
        }

        /* renamed from: a */
        public final C2978a mo9751a(int i) {
            this.f9295c = i;
            return this;
        }

        /* renamed from: b */
        public final C2978a mo9764b(String str) {
            this.f9283C = str;
            return this;
        }

        /* renamed from: c */
        public final C2978a mo9767c(String str) {
            this.f9287G = str;
            return this;
        }

        /* renamed from: d */
        public final C2978a mo9770d(boolean z) {
            this.f9282B = z;
            return this;
        }

        /* renamed from: e */
        public final C2978a mo9772e(boolean z) {
            this.f9289I = z;
            return this;
        }

        /* renamed from: b */
        public final C2978a mo9765b(boolean z) {
            this.f9315w = z;
            return this;
        }

        /* renamed from: c */
        public final C2978a mo9768c(boolean z) {
            this.f9317y = z;
            return this;
        }

        public C2978a(Context context) {
            this.f9293a = context;
        }

        /* renamed from: a */
        public final C2978a mo9753a(long j) {
            this.f9305m = j;
            return this;
        }

        /* renamed from: a */
        public final C2978a mo9754a(Intent intent) {
            this.f9308p = intent;
            return this;
        }

        /* renamed from: a */
        public final C2978a mo9755a(C2965a aVar) {
            this.f9284D = aVar;
            return this;
        }

        /* renamed from: a */
        public final C2978a mo9756a(C2966b bVar) {
            this.f9311s = bVar;
            return this;
        }

        /* renamed from: a */
        public final C2978a mo9757a(C2980a aVar) {
            this.f9285E = aVar;
            return this;
        }

        /* renamed from: a */
        public final C2978a mo9758a(Object obj) {
            this.f9288H = obj;
            return this;
        }

        /* renamed from: a */
        public final C2978a mo9759a(String str) {
            this.f9313u = str;
            return this;
        }

        /* renamed from: a */
        public final C2978a mo9752a(int i, int i2) {
            this.f9290J = i;
            this.f9291K = i2;
            return this;
        }
    }

    C2977d(C2978a aVar) {
        this.f9255a = aVar.f9293a;
        this.f9256b = aVar.f9294b;
        this.f9257c = aVar.f9295c;
        this.f9258d = aVar.f9296d;
        this.f9259e = aVar.f9297e;
        this.f9260f = aVar.f9298f;
        this.f9261g = aVar.f9299g;
        this.f9264j = aVar.f9300h;
        this.f9265k = aVar.f9301i;
        this.f9266l = aVar.f9302j;
        this.f9267m = aVar.f9303k;
        this.f9268n = aVar.f9304l;
        this.f9269o = aVar.f9305m;
        this.f9270p = aVar.f9306n;
        this.f9271q = aVar.f9307o;
        this.f9272r = aVar.f9284D;
        this.f9274t = aVar.f9311s;
        this.f9273s = aVar.f9285E;
        this.f9275u = aVar.f9308p;
        this.f9276v = aVar.f9309q;
        this.f9277w = aVar.f9310r;
        this.f9278x = aVar.f9312t;
        this.f9248F = aVar.f9313u;
        this.f9279y = aVar.f9314v;
        this.f9280z = aVar.f9315w;
        this.f9243A = aVar.f9316x;
        this.f9244B = aVar.f9317y;
        this.f9245C = aVar.f9318z;
        this.f9246D = aVar.f9281A;
        this.f9247E = aVar.f9282B;
        this.f9249G = aVar.f9283C;
        this.f9250H = aVar.f9286F;
        this.f9252J = aVar.f9287G;
        this.f9251I = aVar.f9288H;
        this.f9253K = aVar.f9289I;
        this.f9263i = aVar.f9291K;
        this.f9262h = aVar.f9290J;
        this.f9254L = aVar.f9292L;
    }
}
