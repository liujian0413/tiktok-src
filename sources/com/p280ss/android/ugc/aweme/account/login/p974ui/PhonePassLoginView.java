package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21337n;
import com.p280ss.android.ugc.aweme.account.util.C22341r;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.main.p1385g.C33016c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginView */
public class PhonePassLoginView extends LinearLayout implements C21337n {

    /* renamed from: a */
    public static final String f58503a = "PhonePassLoginView";

    /* renamed from: b */
    public C21852a f58504b;

    /* renamed from: c */
    public boolean f58505c;

    /* renamed from: d */
    public C0043i f58506d;

    /* renamed from: e */
    public EditText f58507e;

    /* renamed from: f */
    private LoginButton f58508f;

    /* renamed from: g */
    private TextView f58509g;

    /* renamed from: h */
    private String f58510h;

    /* renamed from: i */
    private View f58511i;

    /* renamed from: j */
    private String f58512j;

    /* renamed from: k */
    private int f58513k;

    /* renamed from: l */
    private OnClickListener f58514l;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginView$SavedState */
    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m73013a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m73012a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m73012a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m73013a(i);
            }
        };

        /* renamed from: a */
        final boolean f58516a;

        private SavedState(Parcel parcel) {
            super(parcel);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f58516a = z;
        }

        SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.f58516a = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f58516a ? 1 : 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginView$a */
    public interface C21852a {
        /* renamed from: a */
        void mo58209a();
    }

    /* renamed from: Z_ */
    public final void mo57356Z_() {
        if (this.f58508f != null) {
            this.f58508f.mo57356Z_();
        }
    }

    /* renamed from: a */
    public final void mo57357a() {
        if (this.f58508f != null) {
            this.f58508f.mo57357a();
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f58505c);
    }

    /* renamed from: b */
    private void m73007b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(getResources().getString(R.string.c6e));
        SpannableString spannableString = new SpannableString(getResources().getString(R.string.fmv));
        spannableString.setSpan(C22341r.m73950a(this.f58513k), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString(getResources().getString(R.string.d4n));
        spannableString2.setSpan(C22341r.m73951b(this.f58513k), 0, spannableString2.length(), 33);
        spannableStringBuilder.append(spannableString).append(getResources().getString(R.string.c6f)).append(spannableString2);
        this.f58509g.setMovementMethod(LinkMovementMethod.getInstance());
        this.f58509g.setHighlightColor(0);
        this.f58509g.setText(spannableStringBuilder);
    }

    public void setEditText(EditText editText) {
        this.f58507e = editText;
    }

    public void setEnterMethod(String str) {
        this.f58510h = str;
    }

    public void setLifecycleOwner(C0043i iVar) {
        this.f58506d = iVar;
    }

    public void setLoginListener(C21852a aVar) {
        this.f58504b = aVar;
    }

    public PhonePassLoginView(Context context) {
        this(context, null);
    }

    public void setLoginBtnEnable(boolean z) {
        this.f58508f.setEnabled(z);
    }

    /* renamed from: a */
    public final void mo58249a(String str) {
        int i;
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            i = 0;
        } else {
            i = str.length();
        }
        LoginButton loginButton = this.f58508f;
        if (i == 4) {
            z = true;
        }
        loginButton.setEnabled(z);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.f58505c != savedState.f58516a) {
            mo58250a(savedState.f58516a);
        }
    }

    /* renamed from: a */
    public final void mo58250a(boolean z) {
        ImageView imageView = (ImageView) findViewById(R.id.cjh);
        if (z) {
            imageView.setImageResource(R.drawable.ba3);
        } else {
            imageView.setImageResource(R.drawable.ba2);
        }
        if (imageView.getVisibility() == 0) {
            if (z) {
                imageView.setContentDescription(getResources().getString(R.string.a2z, new Object[]{this.f58512j}));
                this.f58509g.setContentDescription(getResources().getString(R.string.a2z, new Object[]{this.f58512j}));
            } else {
                imageView.setContentDescription(getResources().getString(R.string.fjc, new Object[]{this.f58512j}));
                this.f58509g.setContentDescription(getResources().getString(R.string.fjc, new Object[]{this.f58512j}));
            }
        }
        this.f58505c = z;
    }

    public PhonePassLoginView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhonePassLoginView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58514l = new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (view.getId() == R.id.qm) {
                    ((C33016c) C21671bd.m72521a(C33016c.class)).mo60008a("login");
                }
                KeyboardUtils.m77057c(PhonePassLoginView.this.f58507e);
                if (PhonePassLoginView.this.f58504b != null) {
                    PhonePassLoginView.this.f58504b.mo58209a();
                }
            }
        };
        LayoutInflater.from(context).inflate(R.layout.b3j, this);
        setOrientation(1);
        this.f58508f = (LoginButton) findViewById(R.id.qm);
        this.f58508f.setOnClickListener(this.f58514l);
        this.f58508f.setEnabled(false);
        this.f58509g = (TextView) findViewById(R.id.dxf);
        this.f58511i = findViewById(R.id.cji);
        this.f58513k = getResources().getColor(R.color.a4r);
        m73007b();
    }
}
