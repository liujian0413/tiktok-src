package android.support.p022v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.FragmentTabHost */
public final class FragmentTabHost extends TabHost implements OnTabChangeListener {

    /* renamed from: a */
    private final ArrayList<C0558a> f2182a;

    /* renamed from: b */
    private Context f2183b;

    /* renamed from: c */
    private C0608j f2184c;

    /* renamed from: d */
    private int f2185d;

    /* renamed from: e */
    private OnTabChangeListener f2186e;

    /* renamed from: f */
    private C0558a f2187f;

    /* renamed from: g */
    private boolean f2188g;

    /* renamed from: android.support.v4.app.FragmentTabHost$SavedState */
    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m2303a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m2302a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m2302a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m2303a(i);
            }
        };

        /* renamed from: a */
        String f2189a;

        public String toString() {
            StringBuilder sb = new StringBuilder("FragmentTabHost.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" curTab=");
            sb.append(this.f2189a);
            sb.append("}");
            return sb.toString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f2189a = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f2189a);
        }
    }

    /* renamed from: android.support.v4.app.FragmentTabHost$a */
    static final class C0558a {

        /* renamed from: a */
        final String f2190a;

        /* renamed from: b */
        final Class<?> f2191b;

        /* renamed from: c */
        final Bundle f2192c;

        /* renamed from: d */
        Fragment f2193d;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2188g = false;
    }

    public final void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2189a = getCurrentTabTag();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f2182a.size();
        C0633q qVar = null;
        for (int i = 0; i < size; i++) {
            C0558a aVar = (C0558a) this.f2182a.get(i);
            aVar.f2193d = this.f2184c.mo2644a(aVar.f2190a);
            if (aVar.f2193d != null && !aVar.f2193d.mDetached) {
                if (aVar.f2190a.equals(currentTabTag)) {
                    this.f2187f = aVar;
                } else {
                    if (qVar == null) {
                        qVar = this.f2184c.mo2645a();
                    }
                    qVar.mo2607d(aVar.f2193d);
                }
            }
        }
        this.f2188g = true;
        C0633q a = m2301a(currentTabTag, qVar);
        if (a != null) {
            a.mo2604c();
            this.f2184c.mo2654b();
        }
    }

    public final void setOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        this.f2186e = onTabChangeListener;
    }

    /* renamed from: a */
    private C0558a m2300a(String str) {
        int size = this.f2182a.size();
        for (int i = 0; i < size; i++) {
            C0558a aVar = (C0558a) this.f2182a.get(i);
            if (aVar.f2190a.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f2189a);
    }

    public final void onTabChanged(String str) {
        if (this.f2188g) {
            C0633q a = m2301a(str, null);
            if (a != null) {
                a.mo2604c();
            }
        }
        if (this.f2186e != null) {
            this.f2186e.onTabChanged(str);
        }
    }

    /* renamed from: a */
    private C0633q m2301a(String str, C0633q qVar) {
        C0558a a = m2300a(str);
        if (this.f2187f != a) {
            if (qVar == null) {
                qVar = this.f2184c.mo2645a();
            }
            if (!(this.f2187f == null || this.f2187f.f2193d == null)) {
                qVar.mo2607d(this.f2187f.f2193d);
            }
            if (a != null) {
                if (a.f2193d == null) {
                    a.f2193d = Fragment.instantiate(this.f2183b, a.f2191b.getName(), a.f2192c);
                    qVar.mo2586a(this.f2185d, a.f2193d, a.f2190a);
                } else {
                    qVar.mo2608e(a.f2193d);
                }
            }
            this.f2187f = a;
        }
        return qVar;
    }
}
