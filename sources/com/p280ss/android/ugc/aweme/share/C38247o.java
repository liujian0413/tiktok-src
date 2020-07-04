package com.p280ss.android.ugc.aweme.share;

import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.Fragment;
import android.widget.LinearLayout;
import com.p280ss.android.ugc.aweme.base.widget.CanCancelRadioButton.C23495a;

/* renamed from: com.ss.android.ugc.aweme.share.o */
public abstract class C38247o extends LinearLayout {

    /* renamed from: a */
    public Fragment f99400a;

    /* renamed from: a */
    public abstract void mo95855a();

    /* renamed from: a */
    public abstract void mo95856a(int i);

    /* renamed from: a */
    public abstract void mo95857a(int i, int i2, Intent intent);

    /* renamed from: a */
    public abstract void mo95858a(int i, C23495a aVar);

    /* renamed from: a */
    public abstract void mo95859a(int i, boolean z);

    /* renamed from: b */
    public abstract String mo95860b();

    public Fragment getFragment() {
        return this.f99400a;
    }

    public abstract int getSaveUploadType();

    public abstract void setSaveLocalEnabled(boolean z);

    public abstract void setSyncIconSize(int i);

    public abstract void setSyncShareViewTextColor(int i);

    public abstract void setSyncShareViewTextSize(float f);

    public void setSyncShareViewTitle(String str) {
    }

    public C38247o(Context context) {
        super(context);
    }
}
