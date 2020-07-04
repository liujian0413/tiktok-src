package com.p280ss.android.ugc.aweme.shortvideo.toolbar;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.toolbar.RecordSimplifyConfigViewModel */
public final class RecordSimplifyConfigViewModel extends C0063u {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f106994a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecordSimplifyConfigViewModel.class), "simplifyConfig", "getSimplifyConfig()I"))};

    /* renamed from: b */
    public static final C41121a f106995b = new C41121a(null);

    /* renamed from: c */
    private final C7541d f106996c = C7546e.m23569a(C41122b.f106997a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.toolbar.RecordSimplifyConfigViewModel$a */
    public static final class C41121a {
        private C41121a() {
        }

        public /* synthetic */ C41121a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static int m131298a(Context context) {
            if (context instanceof FragmentActivity) {
                return ((RecordSimplifyConfigViewModel) C0069x.m159a((FragmentActivity) context).mo147a(RecordSimplifyConfigViewModel.class)).mo101576a();
            }
            return C35563c.f93231M.mo93306b(Property.VideoRecordToolbarConfigure);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.toolbar.RecordSimplifyConfigViewModel$b */
    static final class C41122b extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C41122b f106997a = new C41122b();

        C41122b() {
            super(0);
        }

        /* renamed from: a */
        private static int m131299a() {
            return C35563c.f93231M.mo93306b(Property.VideoRecordToolbarConfigure);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m131299a());
        }
    }

    /* renamed from: a */
    public static final int m131296a(Context context) {
        return C41121a.m131298a(context);
    }

    /* renamed from: a */
    public final int mo101576a() {
        return ((Number) this.f106996c.getValue()).intValue();
    }
}
