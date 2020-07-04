package com.p280ss.android.ugc.aweme.effectplatform;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.FilterEffect */
public final class FilterEffect extends Effect implements Parcelable {
    public static final Creator<FilterEffect> CREATOR = new C27469b();
    public static final C27468a Companion = new C27468a(null);
    @C6593c(mo15949a = "is_buildin")
    private boolean buildIn;
    @C6593c(mo15949a = "is_checked")
    private boolean checked;

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.FilterEffect$a */
    public static final class C27468a {
        private C27468a() {
        }

        public /* synthetic */ C27468a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.FilterEffect$b */
    public static final class C27469b implements Creator<FilterEffect> {
        C27469b() {
        }

        /* renamed from: a */
        private static FilterEffect[] m90048a(int i) {
            return new FilterEffect[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m90047a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m90048a(i);
        }

        /* renamed from: a */
        private static FilterEffect m90047a(Parcel parcel) {
            C7573i.m23587b(parcel, "source");
            return new FilterEffect(parcel);
        }
    }

    public FilterEffect() {
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean getBuildIn() {
        return this.buildIn;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final int getInt(boolean z) {
        return z ? 1 : 0;
    }

    public final int toInt(boolean z) {
        return z ? 1 : 0;
    }

    public final void setBuildIn(boolean z) {
        this.buildIn = z;
    }

    public final void setChecked(boolean z) {
        this.checked = z;
    }

    public FilterEffect(Parcel parcel) {
        boolean z;
        C7573i.m23587b(parcel, "source");
        super(parcel);
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.checked = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.buildIn = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "dest");
        super.writeToParcel(parcel, i);
        parcel.writeByte((byte) getInt(this.checked));
        parcel.writeByte((byte) getInt(this.checked));
    }
}
