package p1896pl.droidsonroids.gif;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

/* renamed from: pl.droidsonroids.gif.GifViewSavedState */
class GifViewSavedState extends BaseSavedState {
    public static final Creator<GifViewSavedState> CREATOR = new Creator<GifViewSavedState>() {
        /* renamed from: a */
        private static GifViewSavedState[] m150087a(int i) {
            return new GifViewSavedState[i];
        }

        /* renamed from: a */
        private static GifViewSavedState m150086a(Parcel parcel) {
            return new GifViewSavedState(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m150086a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m150087a(i);
        }
    };

    /* renamed from: a */
    final long[][] f123519a;

    private GifViewSavedState(Parcel parcel) {
        super(parcel);
        this.f123519a = new long[parcel.readInt()][];
        for (int i = 0; i < this.f123519a.length; i++) {
            this.f123519a[i] = parcel.createLongArray();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f123519a.length);
        for (long[] writeLongArray : this.f123519a) {
            parcel.writeLongArray(writeLongArray);
        }
    }
}
