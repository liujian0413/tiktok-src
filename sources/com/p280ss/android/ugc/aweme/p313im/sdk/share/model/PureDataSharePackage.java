package com.p280ss.android.ugc.aweme.p313im.sdk.share.model;

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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.model.PureDataSharePackage */
public final class PureDataSharePackage extends SharePackage {
    public static final Creator<PureDataSharePackage> CREATOR = new C31822c();

    /* renamed from: a */
    public static final C31821b f83247a = new C31821b(null);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.model.PureDataSharePackage$a */
    public static final class C31820a extends C7219a<PureDataSharePackage> {
        /* access modifiers changed from: private */
        /* renamed from: b */
        public PureDataSharePackage mo18866a() {
            return new PureDataSharePackage(this);
        }

        /* renamed from: a */
        public final C31820a mo18867b(Parcel parcel) {
            C7573i.m23587b(parcel, "source");
            super.mo18867b(parcel);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.model.PureDataSharePackage$b */
    public static final class C31821b {
        private C31821b() {
        }

        public /* synthetic */ C31821b(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static PureDataSharePackage m103274a(String str) {
            C7573i.m23587b(str, "type");
            return (PureDataSharePackage) new C31820a().mo18868d(str).mo18866a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.model.PureDataSharePackage$c */
    public static final class C31822c implements Creator<PureDataSharePackage> {
        C31822c() {
        }

        /* renamed from: a */
        private static PureDataSharePackage[] m103276a(int i) {
            return new PureDataSharePackage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m103275a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m103276a(i);
        }

        /* renamed from: a */
        private static PureDataSharePackage m103275a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new PureDataSharePackage(parcel);
        }
    }

    /* renamed from: a */
    public static final PureDataSharePackage m103267a(String str) {
        return C31821b.m103274a(str);
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

    public PureDataSharePackage(C31820a aVar) {
        C7573i.m23587b(aVar, "builder");
        super(aVar);
    }

    public PureDataSharePackage(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this(new C31820a().mo18867b(parcel));
    }

    /* renamed from: a */
    public final C38354f mo18860a(C38343b bVar) {
        C7573i.m23587b(bVar, "channel");
        return new C38358i("Ensure Not Reach Here!", null, 2, null);
    }
}
