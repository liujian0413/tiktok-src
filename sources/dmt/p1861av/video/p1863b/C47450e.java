package dmt.p1861av.video.p1863b;

import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: dmt.av.video.b.e */
public final class C47450e {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f121848a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C47450e.class), "isUseVERecorder", "isUseVERecorder()Z"))};

    /* renamed from: b */
    public static final C47450e f121849b = new C47450e();

    /* renamed from: c */
    private static final C7541d f121850c = C7546e.m23569a(C47451a.f121852a);

    /* renamed from: d */
    private static boolean f121851d = true;

    /* renamed from: dmt.av.video.b.e$a */
    static final class C47451a extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C47451a f121852a = new C47451a();

        C47451a() {
            super(0);
        }

        /* renamed from: a */
        private static boolean m148165a() {
            return C35563c.f93231M.mo93305a(Property.EnableUserVeRecoder);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m148165a());
        }
    }

    private C47450e() {
    }

    /* renamed from: a */
    public static final boolean m148163a() {
        return ((Boolean) f121850c.getValue()).booleanValue();
    }

    /* renamed from: b */
    public static final boolean m148164b() {
        if (!f121851d) {
            return false;
        }
        f121851d = false;
        return true;
    }
}
