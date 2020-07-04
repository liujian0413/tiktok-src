package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareOpenGraphValueContainer.C14577a;

public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer<ShareOpenGraphAction, C14574a> {
    public static final Creator<ShareOpenGraphAction> CREATOR = new Creator<ShareOpenGraphAction>() {
        /* renamed from: a */
        private static ShareOpenGraphAction[] m42133a(int i) {
            return new ShareOpenGraphAction[i];
        }

        /* renamed from: a */
        private static ShareOpenGraphAction m42132a(Parcel parcel) {
            return new ShareOpenGraphAction(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m42132a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m42133a(i);
        }
    };

    /* renamed from: com.facebook.share.model.ShareOpenGraphAction$a */
    public static final class C14574a extends C14577a<ShareOpenGraphAction, C14574a> {
        /* renamed from: a */
        public final ShareOpenGraphAction mo36783a() {
            return new ShareOpenGraphAction(this);
        }

        /* renamed from: a */
        private C14574a m42135a(String str) {
            mo36795a("og:type", str);
            return this;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C14574a mo36784a(ShareOpenGraphAction shareOpenGraphAction) {
            if (shareOpenGraphAction == null) {
                return this;
            }
            return ((C14574a) super.mo36784a(shareOpenGraphAction)).m42135a(shareOpenGraphAction.mo36779a());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C14574a mo36782a(Parcel parcel) {
            return mo36784a((ShareOpenGraphAction) parcel.readParcelable(ShareOpenGraphAction.class.getClassLoader()));
        }
    }

    /* renamed from: a */
    public final String mo36779a() {
        return mo36791b("og:type");
    }

    ShareOpenGraphAction(Parcel parcel) {
        super(parcel);
    }

    private ShareOpenGraphAction(C14574a aVar) {
        super((C14577a<P, E>) aVar);
    }
}
