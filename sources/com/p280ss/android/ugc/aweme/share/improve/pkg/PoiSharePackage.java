package com.p280ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.aweme.poi.model.PoiBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38159c;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38356g;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage.C7219a;
import java.io.Serializable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.PoiSharePackage */
public final class PoiSharePackage extends SharePackage {
    public static final Creator<PoiSharePackage> CREATOR = new C38216c();

    /* renamed from: b */
    public static final C38215b f99364b = new C38215b(null);

    /* renamed from: a */
    public final PoiStruct f99365a;

    /* renamed from: c */
    private final PoiDetail f99366c;

    /* renamed from: d */
    private final PoiBundle f99367d;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.PoiSharePackage$a */
    public static final class C38214a extends C7219a<PoiSharePackage> {

        /* renamed from: a */
        public PoiStruct f99368a;

        /* renamed from: b */
        public PoiDetail f99369b;

        /* renamed from: c */
        public PoiBundle f99370c;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public PoiSharePackage mo18866a() {
            return new PoiSharePackage(this);
        }

        /* renamed from: a */
        public final C38214a mo18867b(Parcel parcel) {
            C7573i.m23587b(parcel, "source");
            super.mo18867b(parcel);
            Serializable readSerializable = parcel.readSerializable();
            if (readSerializable != null) {
                this.f99368a = (PoiStruct) readSerializable;
                Serializable readSerializable2 = parcel.readSerializable();
                if (readSerializable2 != null) {
                    this.f99369b = (PoiDetail) readSerializable2;
                    Serializable readSerializable3 = parcel.readSerializable();
                    if (!(readSerializable3 instanceof PoiBundle)) {
                        readSerializable3 = null;
                    }
                    this.f99370c = (PoiBundle) readSerializable3;
                    return this;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.model.PoiDetail");
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.model.PoiStruct");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.PoiSharePackage$b */
    public static final class C38215b {
        private C38215b() {
        }

        public /* synthetic */ C38215b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.PoiSharePackage$c */
    public static final class C38216c implements Creator<PoiSharePackage> {
        C38216c() {
        }

        /* renamed from: a */
        private static PoiSharePackage[] m122082a(int i) {
            return new PoiSharePackage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m122081a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m122082a(i);
        }

        /* renamed from: a */
        private static PoiSharePackage m122081a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new PoiSharePackage(parcel);
        }
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

    public PoiSharePackage(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this(new C38214a().mo18867b(parcel));
    }

    /* renamed from: a */
    public final C38354f mo18860a(C38343b bVar) {
        C7573i.m23587b(bVar, "channel");
        return new C38356g(C38159c.m121914a(this.f20185k, bVar), this.f20183i, this.f20184j);
    }

    public PoiSharePackage(C38214a aVar) {
        C7573i.m23587b(aVar, "builder");
        super(aVar);
        PoiStruct poiStruct = aVar.f99368a;
        if (poiStruct == null) {
            C7573i.m23580a();
        }
        this.f99365a = poiStruct;
        PoiDetail poiDetail = aVar.f99369b;
        if (poiDetail == null) {
            C7573i.m23580a();
        }
        this.f99366c = poiDetail;
        this.f99367d = aVar.f99370c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        if (parcel != null) {
            parcel.writeSerializable(this.f99365a);
            parcel.writeSerializable(this.f99366c);
            parcel.writeSerializable(this.f99367d);
        }
    }
}
