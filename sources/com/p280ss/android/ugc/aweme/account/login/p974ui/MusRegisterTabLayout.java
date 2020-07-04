package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.MusRegisterTabLayout */
public class MusRegisterTabLayout extends FrameLayout implements OnClickListener {

    /* renamed from: a */
    private DmtButton f58472a;

    /* renamed from: b */
    private DmtButton f58473b;

    /* renamed from: c */
    private C21840a f58474c;

    /* renamed from: d */
    private int f58475d;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.MusRegisterTabLayout$SavedState */
    public static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m72989a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m72987a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m72987a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m72989a(i);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m72988a(parcel, classLoader);
            }

            /* renamed from: a */
            private static SavedState m72988a(Parcel parcel, ClassLoader classLoader) {
                if (VERSION.SDK_INT >= 24) {
                    return new SavedState(parcel, classLoader);
                }
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        int f58476a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f58476a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f58476a);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f58476a = parcel.readInt();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.MusRegisterTabLayout$a */
    public interface C21840a {
        /* renamed from: a */
        void mo57538a();

        /* renamed from: b */
        void mo57539b();
    }

    public int getCurrentPage() {
        return this.f58475d;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f58476a = this.f58475d;
        return savedState;
    }

    /* renamed from: a */
    private void m72986a() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.af_, this, true);
        this.f58472a = (DmtButton) inflate.findViewById(R.id.r4);
        this.f58473b = (DmtButton) inflate.findViewById(R.id.q4);
        this.f58472a.setOnClickListener(this);
        this.f58473b.setOnClickListener(this);
        this.f58472a.setSelected(true);
        this.f58473b.setSelected(false);
        this.f58472a.setTextColor(getContext().getResources().getColor(R.color.ab1));
        this.f58473b.setTextColor(getContext().getResources().getColor(R.color.ab6));
    }

    public void setListener(C21840a aVar) {
        this.f58474c = aVar;
    }

    public MusRegisterTabLayout(Context context) {
        super(context);
        m72986a();
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.r4) {
            setCurrentPage(0);
            return;
        }
        if (id == R.id.q4) {
            setCurrentPage(1);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        setCurrentPageWithoutClick(savedState.f58476a);
        if (this.f58474c != null) {
            switch (savedState.f58476a) {
                case 0:
                    this.f58474c.mo57538a();
                    break;
                case 1:
                    this.f58474c.mo57539b();
                    break;
            }
        }
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    public void setCurrentPage(int i) {
        this.f58475d = i;
        if (i == 0) {
            this.f58472a.setSelected(true);
            this.f58473b.setSelected(false);
            this.f58472a.setTextColor(getContext().getResources().getColor(R.color.ab1));
            this.f58473b.setTextColor(getContext().getResources().getColor(R.color.ab6));
            if (this.f58474c != null) {
                this.f58474c.mo57538a();
            }
        } else if (i == 1) {
            this.f58472a.setSelected(false);
            this.f58473b.setSelected(true);
            this.f58472a.setTextColor(getContext().getResources().getColor(R.color.ab6));
            this.f58473b.setTextColor(getContext().getResources().getColor(R.color.ab1));
            this.f58475d = 1;
            if (this.f58474c != null) {
                this.f58474c.mo57539b();
            }
        }
    }

    public void setCurrentPageWithoutClick(int i) {
        this.f58475d = i;
        if (i == 0) {
            this.f58472a.setSelected(true);
            this.f58473b.setSelected(false);
            this.f58472a.setTextColor(getContext().getResources().getColor(R.color.ab1));
            this.f58473b.setTextColor(getContext().getResources().getColor(R.color.ab6));
            return;
        }
        if (i == 1) {
            this.f58472a.setSelected(false);
            this.f58473b.setSelected(true);
            this.f58472a.setTextColor(getContext().getResources().getColor(R.color.ab6));
            this.f58473b.setTextColor(getContext().getResources().getColor(R.color.ab1));
            this.f58475d = 1;
        }
    }

    public MusRegisterTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m72986a();
    }

    public MusRegisterTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m72986a();
    }
}
