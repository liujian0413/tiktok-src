package com.bytedance.android.livesdk.coupon;

import com.bytedance.android.livesdk.p397k.C8346a;
import com.bytedance.android.livesdk.p397k.C8347b;
import com.bytedance.android.livesdk.p397k.C8347b.C8348a;
import com.bytedance.common.utility.collection.C6307b;
import java.io.File;
import java.util.Collection;
import java.util.Random;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.coupon.f */
public final class C5882f extends C8346a {

    /* renamed from: h */
    public static final C5883a f17407h = new C5883a(null);

    /* renamed from: l */
    private static String f17408l;

    /* renamed from: m */
    private static final String f17409m;

    /* renamed from: a */
    public String f17410a = "";

    /* renamed from: b */
    public String f17411b = "";

    /* renamed from: c */
    public String f17412c = "";

    /* renamed from: d */
    public String f17413d = "";

    /* renamed from: e */
    public String f17414e = "";

    /* renamed from: f */
    public String f17415f = "";

    /* renamed from: g */
    public String f17416g = "";

    /* renamed from: com.bytedance.android.livesdk.coupon.f$a */
    public static final class C5883a {
        private C5883a() {
        }

        public /* synthetic */ C5883a(C7571f fVar) {
            this();
        }
    }

    static {
        C8348a a = C8347b.m25441a();
        C7573i.m23582a((Object) a, "LiveResourceConstant.getCouponZipResource()");
        f17408l = a.f22894a;
        StringBuilder sb = new StringBuilder();
        sb.append(File.separator);
        sb.append(f17408l);
        f17409m = sb.toString();
    }

    /* renamed from: a */
    public final String mo14416a() {
        if (C6307b.m19566a((Collection<T>) this.f22892k)) {
            return "";
        }
        Object obj = this.f22892k.get(new Random().nextInt(this.f22892k.size()));
        C7573i.m23582a(obj, "mFilePathList[random.nextInt(mFilePathList.size)]");
        return (String) obj;
    }

    public C5882f(String str) {
        C7573i.m23587b(str, "root");
        super(str, f17409m);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(f17409m);
        sb.append("/coupon");
        this.f17410a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(f17409m);
        sb2.append("/couponhide");
        this.f17411b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(f17409m);
        sb3.append("/happy");
        this.f17412c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append(f17409m);
        sb4.append("/ttlive_bottom_front_coupon_view.png");
        this.f17413d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str);
        sb5.append(f17409m);
        sb5.append("/ttlive_bottom_behind_coupon_view.png");
        this.f17414e = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str);
        sb6.append(f17409m);
        sb6.append("/ttlive_yellow_double_coupon_view.png");
        this.f17415f = sb6.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(str);
        sb7.append(f17409m);
        sb7.append("/ttlive_yellow_coupon_bg.png");
        this.f17416g = sb7.toString();
        this.f22892k.add(this.f17413d);
        this.f22892k.add(this.f17414e);
        this.f22892k.add(this.f17416g);
        this.f22892k.add(this.f17410a);
        this.f22892k.add(this.f17411b);
        this.f22892k.add(this.f17412c);
    }
}
