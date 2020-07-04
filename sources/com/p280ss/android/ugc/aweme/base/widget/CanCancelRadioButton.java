package com.p280ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.BaseSavedState;
import android.widget.RadioGroup;
import com.bytedance.ies.dmt.p262ui.widget.DmtRadioButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton */
public class CanCancelRadioButton extends DmtRadioButton {

    /* renamed from: a */
    public boolean f61972a = true;

    /* renamed from: b */
    private List<C23495a> f61973b = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton$SavedState */
    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m77172a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m77171a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m77171a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m77172a(i);
            }
        };

        /* renamed from: a */
        boolean f61974a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            boolean z;
            super(parcel);
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f61974a = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f61974a ? 1 : 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton$a */
    public interface C23495a {
        /* renamed from: a */
        boolean mo61113a(View view);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f61974a = this.f61972a;
        return savedState;
    }

    public void toggle() {
        for (C23495a a : this.f61973b) {
            if (!a.mo61113a(this)) {
                return;
            }
        }
        if (this.f61972a) {
            setChecked(!isChecked());
            if (!isChecked()) {
                ((RadioGroup) getParent()).clearCheck();
            }
        }
    }

    public void setCanChecked(boolean z) {
        this.f61972a = z;
    }

    /* renamed from: a */
    public final void mo61105a(C23495a aVar) {
        this.f61973b.add(aVar);
    }

    public CanCancelRadioButton(Context context) {
        super(context);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCanChecked(savedState.f61974a);
    }

    public CanCancelRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CanCancelRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
