package com.facebook.keyframes;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import com.facebook.keyframes.C14005b.C14006a;
import com.facebook.keyframes.model.C14052j;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.keyframes.d */
public final class C14027d {

    /* renamed from: a */
    public C14052j f37041a;

    /* renamed from: b */
    public int f37042b = 60;

    /* renamed from: c */
    public C14028a f37043c = new C14028a();

    /* renamed from: com.facebook.keyframes.d$a */
    public class C14028a {

        /* renamed from: a */
        public Map<String, C14006a> f37044a;

        /* renamed from: a */
        public final C14005b mo33684a() {
            return C14027d.this.mo33682a();
        }

        public C14028a() {
        }

        /* renamed from: a */
        public final C14028a mo33685a(Pair<String, Pair<Drawable, Matrix>>... pairArr) {
            this.f37044a = new HashMap();
            for (int i = 0; i <= 0; i++) {
                Pair<String, Pair<Drawable, Matrix>> pair = pairArr[0];
                this.f37044a.put(pair.first, new C14006a((Drawable) ((Pair) pair.second).first, (Matrix) ((Pair) pair.second).second));
            }
            return this;
        }
    }

    /* renamed from: a */
    public final C14005b mo33682a() {
        if (this.f37041a != null) {
            return new C14005b(this);
        }
        throw new IllegalArgumentException("No KFImage provided!");
    }

    /* renamed from: a */
    public final C14027d mo33683a(C14052j jVar) {
        this.f37041a = jVar;
        return this;
    }
}
