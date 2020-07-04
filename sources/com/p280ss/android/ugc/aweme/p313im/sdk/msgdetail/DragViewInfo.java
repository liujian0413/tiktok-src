package com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.DragView.IViewInfo;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.DragViewInfo */
public final class DragViewInfo implements Parcelable {
    public static final C31537a CREATOR = new C31537a(null);

    /* renamed from: a */
    public long f82549a;

    /* renamed from: b */
    public IViewInfo f82550b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.DragViewInfo$a */
    public static final class C31537a implements Creator<DragViewInfo> {
        private C31537a() {
        }

        /* renamed from: a */
        private static DragViewInfo[] m102517a(int i) {
            return new DragViewInfo[i];
        }

        public /* synthetic */ C31537a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m102516a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m102517a(i);
        }

        /* renamed from: a */
        private static DragViewInfo m102516a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new DragViewInfo(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public DragViewInfo() {
        this.f82549a = -1;
    }

    public DragViewInfo(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this();
        this.f82549a = parcel.readLong();
        this.f82550b = (IViewInfo) parcel.readParcelable(IViewInfo.class.getClassLoader());
    }

    public DragViewInfo(long j, IViewInfo iViewInfo) {
        C7573i.m23587b(iViewInfo, "viewInfo");
        this();
        this.f82549a = j;
        this.f82550b = iViewInfo;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeLong(this.f82549a);
        }
        if (parcel != null) {
            parcel.writeParcelable(this.f82550b, i);
        }
    }
}
