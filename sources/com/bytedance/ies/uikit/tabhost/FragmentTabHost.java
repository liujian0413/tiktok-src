package com.bytedance.ies.uikit.tabhost;

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
import android.view.View;
import android.view.View.BaseSavedState;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabContentFactory;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;

public class FragmentTabHost extends TabHost implements OnTabChangeListener {

    /* renamed from: a */
    private boolean f30090a;

    /* renamed from: b */
    private final ArrayList<C11077c> f30091b = new ArrayList<>();

    /* renamed from: c */
    private FrameLayout f30092c;

    /* renamed from: d */
    private Context f30093d;

    /* renamed from: e */
    private C0608j f30094e;

    /* renamed from: f */
    private int f30095f;

    /* renamed from: g */
    private OnTabChangeListener f30096g;

    /* renamed from: h */
    private C11077c f30097h;

    /* renamed from: i */
    private boolean f30098i;

    /* renamed from: j */
    private C11076b f30099j;

    /* renamed from: k */
    private boolean f30100k = false;

    /* renamed from: l */
    private boolean f30101l = false;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m32448a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m32447a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m32447a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m32448a(i);
            }
        };

        /* renamed from: a */
        String f30102a;

        public String toString() {
            StringBuilder sb = new StringBuilder("FragmentTabHost.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" curTab=");
            sb.append(this.f30102a);
            sb.append("}");
            return sb.toString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f30102a = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f30102a);
        }
    }

    /* renamed from: com.bytedance.ies.uikit.tabhost.FragmentTabHost$a */
    static class C11075a implements TabContentFactory {

        /* renamed from: a */
        private final Context f30103a;

        public C11075a(Context context) {
            this.f30103a = context;
        }

        public final View createTabContent(String str) {
            View view = new View(this.f30103a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    /* renamed from: com.bytedance.ies.uikit.tabhost.FragmentTabHost$b */
    public interface C11076b {
        /* renamed from: a */
        void mo26587a(String str, Fragment fragment, Fragment fragment2);
    }

    /* renamed from: com.bytedance.ies.uikit.tabhost.FragmentTabHost$c */
    static final class C11077c {

        /* renamed from: a */
        public final String f30104a;

        /* renamed from: b */
        public final Class<?> f30105b;

        /* renamed from: c */
        public final Bundle f30106c;

        /* renamed from: d */
        public Fragment f30107d;

        C11077c(String str, Class<?> cls, Bundle bundle) {
            this.f30104a = str;
            this.f30105b = cls;
            this.f30106c = bundle;
        }
    }

    public boolean getDispatchWindowFocusChangedToAllTab() {
        return this.f30090a;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        C11078a.m32450a(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30098i = false;
    }

    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    public Fragment getCurrentFragment() {
        if (this.f30097h != null) {
            return this.f30097h.f30107d;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f30102a = getCurrentTabTag();
        return savedState;
    }

    /* renamed from: b */
    private void m32443b() {
        if (this.f30092c == null) {
            this.f30092c = (FrameLayout) findViewById(this.f30095f);
            if (this.f30092c == null) {
                StringBuilder sb = new StringBuilder("No tab content FrameLayout found for id ");
                sb.append(this.f30095f);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo26963a() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        C0633q qVar = null;
        for (int i = 0; i < this.f30091b.size(); i++) {
            C11077c cVar = (C11077c) this.f30091b.get(i);
            cVar.f30107d = this.f30094e.mo2644a(cVar.f30104a);
            if (cVar.f30107d != null && !cVar.f30107d.mDetached) {
                if (cVar.f30104a.equals(currentTabTag)) {
                    this.f30097h = cVar;
                } else {
                    if (qVar == null) {
                        qVar = this.f30094e.mo2645a();
                    }
                    qVar.mo2607d(cVar.f30107d);
                }
            }
        }
        this.f30098i = true;
        C0633q a = m32441a(currentTabTag, qVar);
        if (a != null) {
            a.mo2606d();
            this.f30094e.mo2654b();
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
            this.f30092c = frameLayout2;
            this.f30092c.setId(this.f30095f);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    public void setDispatchWindowFocusChangedToAllTab(boolean z) {
        this.f30090a = z;
    }

    public void setOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        this.f30096g = onTabChangeListener;
    }

    public void setOnTabSwitchListener(C11076b bVar) {
        this.f30099j = bVar;
    }

    public void setSuperOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        super.setOnTabChangedListener(onTabChangeListener);
    }

    public void setHideWhenTabChanged(boolean z) {
        if (!this.f30101l) {
            this.f30100k = z;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f30102a);
    }

    public FragmentTabHost(Context context) {
        super(context, null);
        m32442a(context, (AttributeSet) null);
    }

    public void dispatchWindowFocusChanged(boolean z) {
        if (this.f30090a) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchWindowFocusChanged(z);
            }
            return;
        }
        super.dispatchWindowFocusChanged(z);
    }

    public void onTabChanged(String str) {
        Fragment fragment;
        Fragment fragment2 = null;
        if (this.f30098i) {
            if (this.f30097h != null) {
                fragment = this.f30097h.f30107d;
            } else {
                fragment = null;
            }
            C0633q a = m32441a(str, (C0633q) null);
            if (a != null) {
                a.mo2606d();
            }
        } else {
            fragment = null;
        }
        if (this.f30096g != null) {
            this.f30096g.onTabChanged(str);
        }
        if (this.f30099j != null) {
            if (this.f30097h != null) {
                fragment2 = this.f30097h.f30107d;
            }
            if (fragment2 != fragment) {
                this.f30099j.mo26587a(str, fragment2, fragment);
            }
        }
    }

    /* renamed from: a */
    private void m32442a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f30095f = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m32442a(context, attributeSet);
    }

    /* renamed from: a */
    private C0633q m32441a(String str, C0633q qVar) {
        this.f30101l = true;
        C11077c cVar = null;
        for (int i = 0; i < this.f30091b.size(); i++) {
            C11077c cVar2 = (C11077c) this.f30091b.get(i);
            if (cVar2.f30104a.equals(str)) {
                cVar = cVar2;
            }
        }
        if (cVar == null) {
            return null;
        }
        if (this.f30097h != cVar) {
            if (qVar == null) {
                qVar = this.f30094e.mo2645a();
            }
            if (!(this.f30097h == null || this.f30097h.f30107d == null)) {
                if (this.f30100k) {
                    qVar.mo2601b(this.f30097h.f30107d);
                } else {
                    qVar.mo2607d(this.f30097h.f30107d);
                }
            }
            if (cVar != null) {
                if (cVar.f30107d == null) {
                    cVar.f30107d = Fragment.instantiate(this.f30093d, cVar.f30105b.getName(), cVar.f30106c);
                    qVar.mo2586a(this.f30095f, cVar.f30107d, cVar.f30104a);
                } else if (this.f30100k) {
                    if (cVar.f30107d.mDetached) {
                        qVar.mo2608e(cVar.f30107d);
                    }
                    qVar.mo2605c(cVar.f30107d);
                } else {
                    qVar.mo2608e(cVar.f30107d);
                }
            }
            this.f30097h = cVar;
        }
        return qVar;
    }

    /* renamed from: a */
    public final void mo26964a(Context context, C0608j jVar, int i) {
        super.setup();
        this.f30093d = context;
        this.f30094e = jVar;
        this.f30095f = R.id.dfc;
        m32443b();
        this.f30092c.setId(R.id.dfc);
        if (getId() == -1) {
            setId(16908306);
        }
    }

    /* renamed from: a */
    public final void mo26965a(TabSpec tabSpec, Class<?> cls, Bundle bundle) {
        tabSpec.setContent(new C11075a(this.f30093d));
        String tag = tabSpec.getTag();
        C11077c cVar = new C11077c(tag, cls, bundle);
        if (this.f30098i) {
            cVar.f30107d = this.f30094e.mo2644a(tag);
            if (cVar.f30107d != null && !cVar.f30107d.mDetached) {
                C0633q a = this.f30094e.mo2645a();
                a.mo2607d(cVar.f30107d);
                a.mo2606d();
            }
        }
        this.f30091b.add(cVar);
        addTab(tabSpec);
    }
}
