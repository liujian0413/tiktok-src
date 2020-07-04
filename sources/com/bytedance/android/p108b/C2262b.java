package com.bytedance.android.p108b;

import android.content.Context;
import android.text.TextUtils;
import android.view.TextureView;
import com.bytedance.android.livesdkapi.depend.model.live.C9383t.C9384a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.p108b.C2260a.C2261a;

/* renamed from: com.bytedance.android.b.b */
public interface C2262b extends C2260a {

    /* renamed from: com.bytedance.android.b.b$a */
    public static class C2263a {

        /* renamed from: a */
        public Context f7532a;

        /* renamed from: b */
        public String f7533b;

        /* renamed from: c */
        public String f7534c;

        /* renamed from: d */
        public String f7535d;

        /* renamed from: e */
        public String f7536e;

        /* renamed from: f */
        public LiveMode f7537f;

        /* renamed from: g */
        public C9384a f7538g;

        /* renamed from: h */
        public boolean f7539h = true;

        /* renamed from: i */
        public int f7540i;

        /* renamed from: c */
        public final boolean mo8046c() {
            if (this.f7540i == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo8044b() {
            if (this.f7540i == 2) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo8042a() {
            if (this.f7540i == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final C2263a mo8039a(LiveMode liveMode) {
            this.f7537f = liveMode;
            return this;
        }

        /* renamed from: b */
        public final C2263a mo8043b(String str) {
            this.f7534c = str;
            return this;
        }

        /* renamed from: d */
        public final C2263a mo8047d(String str) {
            this.f7536e = str;
            return this;
        }

        /* renamed from: a */
        public static C2263a m9735a(Context context) {
            return new C2263a(context);
        }

        private C2263a(Context context) {
            this.f7532a = context;
        }

        /* renamed from: a */
        public final C2263a mo8040a(C9384a aVar) {
            this.f7538g = aVar;
            return this;
        }

        /* renamed from: a */
        public final C2263a mo8041a(String str) {
            this.f7533b = str;
            if (!TextUtils.isEmpty(this.f7533b)) {
                this.f7540i = 1;
            }
            return this;
        }

        /* renamed from: c */
        public final C2263a mo8045c(String str) {
            this.f7535d = str;
            if (this.f7540i == 0 && !TextUtils.isEmpty(this.f7535d)) {
                this.f7540i = 2;
            }
            return this;
        }
    }

    void attach(Context context, TextureView textureView, C2261a aVar);

    long getRoomId();

    void initialize(long j, C2263a aVar);

    void release();

    boolean warmUp();
}
