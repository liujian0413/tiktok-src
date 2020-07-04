package com.p280ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38358i;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage.C7219a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.PureDataSharePackage */
public final class PureDataSharePackage extends SharePackage {
    public static final Creator<PureDataSharePackage> CREATOR = new C38219c();

    /* renamed from: a */
    public static final C38218b f99371a = new C38218b(null);

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.PureDataSharePackage$a */
    public static final class C38217a extends C7219a<PureDataSharePackage> {
        /* access modifiers changed from: private */
        /* renamed from: b */
        public PureDataSharePackage mo18866a() {
            return new PureDataSharePackage(this);
        }

        /* renamed from: a */
        public final C38217a mo18867b(Parcel parcel) {
            C7573i.m23587b(parcel, "source");
            super.mo18867b(parcel);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.PureDataSharePackage$b */
    public static final class C38218b {
        private C38218b() {
        }

        public /* synthetic */ C38218b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.PureDataSharePackage$c */
    public static final class C38219c implements Creator<PureDataSharePackage> {
        C38219c() {
        }

        /* renamed from: a */
        private static PureDataSharePackage[] m122090a(int i) {
            return new PureDataSharePackage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m122089a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m122090a(i);
        }

        /* renamed from: a */
        private static PureDataSharePackage m122089a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new PureDataSharePackage(parcel);
        }
    }

    /* renamed from: a */
    public final boolean mo18861a(C38343b bVar, Context context) {
        C7573i.m23587b(bVar, "channel");
        C7573i.m23587b(context, "context");
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public PureDataSharePackage(C38217a aVar) {
        C7573i.m23587b(aVar, "builder");
        super(aVar);
    }

    public PureDataSharePackage(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this(new C38217a().mo18867b(parcel));
    }

    /* renamed from: a */
    public final C38354f mo18860a(C38343b bVar) {
        C7573i.m23587b(bVar, "channel");
        return new C38358i("Ensure Not Reach Here!", null, 2, null);
    }
}
