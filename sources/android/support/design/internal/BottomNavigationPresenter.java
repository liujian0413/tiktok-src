package android.support.design.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p029v7.view.menu.C1188i;
import android.support.p029v7.view.menu.C1188i.C1189a;
import android.support.p029v7.view.menu.MenuBuilder;
import android.support.p029v7.view.menu.MenuItemImpl;
import android.support.p029v7.view.menu.SubMenuBuilder;

public class BottomNavigationPresenter implements C1188i {

    /* renamed from: a */
    public BottomNavigationMenuView f1129a;

    /* renamed from: b */
    public boolean f1130b;

    /* renamed from: c */
    public int f1131c;

    /* renamed from: d */
    private MenuBuilder f1132d;

    static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m1115a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m1114a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1114a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m1115a(i);
            }
        };

        /* renamed from: a */
        int f1133a;

        SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        SavedState(Parcel parcel) {
            this.f1133a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1133a);
        }
    }

    /* renamed from: a */
    public final void mo1112a(MenuBuilder menuBuilder, boolean z) {
    }

    /* renamed from: a */
    public final void mo1113a(C1189a aVar) {
    }

    /* renamed from: a */
    public final boolean mo1115a() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo1116a(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    /* renamed from: a */
    public final boolean mo1117a(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    /* renamed from: b */
    public final int mo1118b() {
        return this.f1131c;
    }

    /* renamed from: b */
    public final boolean mo1119b(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    /* renamed from: c */
    public final Parcelable mo1120c() {
        SavedState savedState = new SavedState();
        savedState.f1133a = this.f1129a.getSelectedItemId();
        return savedState;
    }

    /* renamed from: a */
    public final void mo1111a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f1129a.mo1086b(((SavedState) parcelable).f1133a);
        }
    }

    /* renamed from: a */
    public final void mo1114a(boolean z) {
        if (!this.f1130b) {
            if (z) {
                this.f1129a.mo1083a();
            } else {
                this.f1129a.mo1085b();
            }
        }
    }

    /* renamed from: a */
    public final void mo1110a(Context context, MenuBuilder menuBuilder) {
        this.f1132d = menuBuilder;
        this.f1129a.mo1084a(this.f1132d);
    }
}
