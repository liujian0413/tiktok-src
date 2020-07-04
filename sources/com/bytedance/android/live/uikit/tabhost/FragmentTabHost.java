package com.bytedance.android.live.uikit.tabhost;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabWidget;
import java.util.ArrayList;

public class FragmentTabHost extends TabHost implements OnTabChangeListener {

    /* renamed from: a */
    private boolean f10743a;

    /* renamed from: b */
    private final ArrayList<C3590b> f10744b = new ArrayList<>();

    /* renamed from: c */
    private FrameLayout f10745c;

    /* renamed from: d */
    private Context f10746d;

    /* renamed from: e */
    private C0608j f10747e;

    /* renamed from: f */
    private int f10748f;

    /* renamed from: g */
    private OnTabChangeListener f10749g;

    /* renamed from: h */
    private C3590b f10750h;

    /* renamed from: i */
    private boolean f10751i;

    /* renamed from: j */
    private C3589a f10752j;

    /* renamed from: k */
    private boolean f10753k = false;

    /* renamed from: l */
    private boolean f10754l = false;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m13166a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m13165a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m13165a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m13166a(i);
            }
        };

        /* renamed from: a */
        String f10755a;

        public String toString() {
            StringBuilder sb = new StringBuilder("FragmentTabHost.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" curTab=");
            sb.append(this.f10755a);
            sb.append("}");
            return sb.toString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f10755a = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f10755a);
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.tabhost.FragmentTabHost$a */
    public interface C3589a {
    }

    /* renamed from: com.bytedance.android.live.uikit.tabhost.FragmentTabHost$b */
    static final class C3590b {

        /* renamed from: a */
        public final String f10756a;

        /* renamed from: b */
        public final Class<?> f10757b;

        /* renamed from: c */
        public final Bundle f10758c;

        /* renamed from: d */
        public Fragment f10759d;
    }

    public boolean getDispatchWindowFocusChangedToAllTab() {
        return this.f10743a;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10751i = false;
    }

    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    public Fragment getCurrentFragment() {
        if (this.f10750h != null) {
            return this.f10750h.f10759d;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10755a = getCurrentTabTag();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        C0633q qVar = null;
        for (int i = 0; i < this.f10744b.size(); i++) {
            C3590b bVar = (C3590b) this.f10744b.get(i);
            bVar.f10759d = this.f10747e.mo2644a(bVar.f10756a);
            if (bVar.f10759d != null && !bVar.f10759d.mDetached) {
                if (bVar.f10756a.equals(currentTabTag)) {
                    this.f10750h = bVar;
                } else {
                    if (qVar == null) {
                        qVar = this.f10747e.mo2645a();
                    }
                    qVar.mo2607d(bVar.f10759d);
                }
            }
        }
        this.f10751i = true;
        C0633q a = m13163a(currentTabTag, qVar);
        if (a != null) {
            a.mo2606d();
            this.f10747e.mo2654b();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        Context context = getContext();
        if (context != null && findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f10745c = frameLayout2;
            this.f10745c.setId(this.f10748f);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    public void setDispatchWindowFocusChangedToAllTab(boolean z) {
        this.f10743a = z;
    }

    public void setOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        this.f10749g = onTabChangeListener;
    }

    public void setOnTabSwitchListener(C3589a aVar) {
        this.f10752j = aVar;
    }

    public void setSuperOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        super.setOnTabChangedListener(onTabChangeListener);
    }

    public void setHideWhenTabChanged(boolean z) {
        if (!this.f10754l) {
            this.f10753k = z;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f10755a);
    }

    public FragmentTabHost(Context context) {
        super(context, null);
        m13164a(context, (AttributeSet) null);
    }

    public void dispatchWindowFocusChanged(boolean z) {
        if (this.f10743a) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchWindowFocusChanged(z);
            }
            return;
        }
        super.dispatchWindowFocusChanged(z);
    }

    public void onTabChanged(String str) {
        if (this.f10751i) {
            C0633q a = m13163a(str, (C0633q) null);
            if (a != null) {
                a.mo2606d();
            }
        }
        if (this.f10749g != null) {
            this.f10749g.onTabChanged(str);
        }
    }

    /* renamed from: a */
    private void m13164a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f10748f = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13164a(context, attributeSet);
    }

    /* renamed from: a */
    private C0633q m13163a(String str, C0633q qVar) {
        this.f10754l = true;
        C3590b bVar = null;
        for (int i = 0; i < this.f10744b.size(); i++) {
            C3590b bVar2 = (C3590b) this.f10744b.get(i);
            if (bVar2.f10756a.equals(str)) {
                bVar = bVar2;
            }
        }
        if (bVar == null) {
            return null;
        }
        if (this.f10750h != bVar) {
            if (qVar == null) {
                qVar = this.f10747e.mo2645a();
            }
            if (!(this.f10750h == null || this.f10750h.f10759d == null)) {
                if (this.f10753k) {
                    qVar.mo2601b(this.f10750h.f10759d);
                } else {
                    qVar.mo2607d(this.f10750h.f10759d);
                }
            }
            if (bVar != null) {
                if (bVar.f10759d == null) {
                    bVar.f10759d = Fragment.instantiate(this.f10746d, bVar.f10757b.getName(), bVar.f10758c);
                    qVar.mo2586a(this.f10748f, bVar.f10759d, bVar.f10756a);
                } else if (this.f10753k) {
                    if (bVar.f10759d.mDetached) {
                        qVar.mo2608e(bVar.f10759d);
                    }
                    if (bVar.f10759d.mHidden) {
                        qVar.mo2605c(bVar.f10759d);
                    }
                } else {
                    qVar.mo2608e(bVar.f10759d);
                }
            }
            this.f10750h = bVar;
        }
        return qVar;
    }
}
