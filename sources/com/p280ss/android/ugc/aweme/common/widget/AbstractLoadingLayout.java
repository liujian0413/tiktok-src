package com.p280ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.ugc.aweme.common.widget.AbstractLoadingLayout */
public class AbstractLoadingLayout extends FrameLayout {

    /* renamed from: a */
    protected View f67668a;

    /* renamed from: b */
    protected View f67669b;

    /* renamed from: c */
    protected View f67670c;

    /* renamed from: d */
    protected View f67671d;

    /* renamed from: e */
    protected int f67672e;

    /* renamed from: f */
    private C25716a f67673f;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.AbstractLoadingLayout$SavedState */
    public static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m84483a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m84482a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m84482a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m84483a(i);
            }
        };

        /* renamed from: a */
        int f67674a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f67674a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f67674a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.AbstractLoadingLayout$a */
    public interface C25716a {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo66617a(Context context, AttributeSet attributeSet, int i) {
        return null;
    }

    /* renamed from: a */
    public void mo66618a(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public View mo66620b(Context context, AttributeSet attributeSet, int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public View mo66621c(Context context, AttributeSet attributeSet, int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f67674a = this.f67672e;
        return savedState;
    }

    public final void setListener(C25716a aVar) {
        this.f67673f = aVar;
    }

    public AbstractLoadingLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        setState(savedState.f67674a);
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    public final void setState(int i) {
        if (i == 0 || i == 1 || i == 3 || i == 2) {
            int i2 = this.f67672e;
            if (i2 != i) {
                this.f67672e = i;
                mo66618a(i2, i);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("state must be one of STATE_OK, STATE_LOADING, STATE_EMPTY and STATE_ERROR.");
    }

    public AbstractLoadingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractLoadingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m84477d(context, attributeSet, i);
        setState(0);
    }

    /* renamed from: d */
    private void m84477d(Context context, AttributeSet attributeSet, int i) {
        this.f67669b = mo66617a(context, attributeSet, i);
        this.f67670c = mo66620b(context, attributeSet, i);
        this.f67671d = mo66621c(context, attributeSet, i);
        if (this.f67669b != null) {
            addView(this.f67669b);
        }
        if (this.f67670c != null) {
            addView(this.f67670c);
        }
        if (this.f67671d != null) {
            addView(this.f67671d);
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (view == this.f67669b || view == this.f67670c || view == this.f67671d) {
            super.addView(view, i, layoutParams);
        } else if (getChildCount() <= 4) {
            super.addView(view, i, layoutParams);
            this.f67668a = view;
        } else {
            throw new IllegalArgumentException("LoadingLayout can only contain one direct custom child.");
        }
    }
}
