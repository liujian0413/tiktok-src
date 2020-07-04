package com.p280ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38159c;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38356g;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage.C7219a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.CouponSharePackage */
public final class CouponSharePackage extends SharePackage {
    public static final Creator<CouponSharePackage> CREATOR = new C38192c();

    /* renamed from: a */
    public static final C38191b f99331a = new C38191b(null);

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.CouponSharePackage$a */
    public static final class C38190a extends C7219a<CouponSharePackage> {
        /* access modifiers changed from: private */
        /* renamed from: b */
        public CouponSharePackage mo18866a() {
            return new CouponSharePackage(this);
        }

        /* renamed from: a */
        public final C38190a mo18867b(Parcel parcel) {
            C7573i.m23587b(parcel, "source");
            super.mo18867b(parcel);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.CouponSharePackage$b */
    public static final class C38191b {
        private C38191b() {
        }

        public /* synthetic */ C38191b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.CouponSharePackage$c */
    public static final class C38192c implements Creator<CouponSharePackage> {
        C38192c() {
        }

        /* renamed from: a */
        private static CouponSharePackage[] m121996a(int i) {
            return new CouponSharePackage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m121995a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m121996a(i);
        }

        /* renamed from: a */
        private static CouponSharePackage m121995a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new CouponSharePackage(parcel);
        }
    }

    /* renamed from: a */
    public final boolean mo18861a(C38343b bVar, Context context) {
        C7573i.m23587b(bVar, "channel");
        C7573i.m23587b(context, "context");
        return false;
    }

    /* renamed from: a */
    public final boolean mo18862a(C38389f fVar, Context context) {
        C7573i.m23587b(fVar, "action");
        C7573i.m23587b(context, "context");
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public CouponSharePackage(C38190a aVar) {
        C7573i.m23587b(aVar, "builder");
        super(aVar);
    }

    public CouponSharePackage(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this(new C38190a().mo18867b(parcel));
    }

    /* renamed from: a */
    public final C38354f mo18860a(C38343b bVar) {
        C7573i.m23587b(bVar, "channel");
        return new C38356g(C38159c.m121914a(this.f20185k, bVar), this.f20183i, this.f20184j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
