package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.cm */
public class C8551cm {
    @C6593c(mo15949a = "portrait")

    /* renamed from: a */
    public C8552a f23555a;
    @C6593c(mo15949a = "landscape")

    /* renamed from: b */
    public C8552a f23556b;

    /* renamed from: com.bytedance.android.livesdk.message.model.cm$a */
    public static class C8552a {
        @C6593c(mo15949a = "text")

        /* renamed from: a */
        public C9505f f23557a;
        @C6593c(mo15949a = "text_font_size")

        /* renamed from: b */
        public int f23558b;
        @C6593c(mo15949a = "background")

        /* renamed from: c */
        public ImageModel f23559c;
        @C6593c(mo15949a = "start")

        /* renamed from: d */
        public long f23560d;
        @C6593c(mo15949a = "duration")

        /* renamed from: e */
        public long f23561e;
        @C6593c(mo15949a = "x")

        /* renamed from: f */
        public int f23562f;
        @C6593c(mo15949a = "y")

        /* renamed from: g */
        public int f23563g;
        @C6593c(mo15949a = "width")

        /* renamed from: h */
        public int f23564h;
        @C6593c(mo15949a = "height")

        /* renamed from: i */
        public int f23565i;
        @C6593c(mo15949a = "shadow_dx")

        /* renamed from: j */
        public int f23566j;
        @C6593c(mo15949a = "shadow_dy")

        /* renamed from: k */
        public int f23567k;
        @C6593c(mo15949a = "shadow_radius")

        /* renamed from: l */
        public int f23568l;
        @C6593c(mo15949a = "shadow_color")

        /* renamed from: m */
        public String f23569m;
        @C6593c(mo15949a = "stroke_color")

        /* renamed from: n */
        public String f23570n;
        @C6593c(mo15949a = "stroke_width")

        /* renamed from: o */
        public int f23571o;

        /* renamed from: a */
        public final int mo21676a() {
            return this.f23558b / 100;
        }

        /* renamed from: b */
        public final float mo21677b() {
            return ((float) this.f23562f) / 10000.0f;
        }

        /* renamed from: c */
        public final float mo21678c() {
            return ((float) this.f23563g) / 10000.0f;
        }

        /* renamed from: d */
        public final float mo21679d() {
            return ((float) this.f23564h) / 10000.0f;
        }

        /* renamed from: e */
        public final float mo21680e() {
            return ((float) this.f23565i) / 10000.0f;
        }

        /* renamed from: f */
        public final float mo21681f() {
            return (float) (this.f23566j / 100);
        }

        /* renamed from: g */
        public final float mo21682g() {
            return (float) (this.f23567k / 100);
        }

        /* renamed from: h */
        public final float mo21683h() {
            return (float) (this.f23568l / 100);
        }
    }
}
