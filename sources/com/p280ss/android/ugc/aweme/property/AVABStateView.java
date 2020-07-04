package com.p280ss.android.ugc.aweme.property;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemBase.C10813a;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemSwitch;
import com.p280ss.android.ugc.aweme.property.PropertyStore.C36952a;
import com.p280ss.android.ugc.aweme.property.PropertyStore.PropertyType;

/* renamed from: com.ss.android.ugc.aweme.property.AVABStateView */
public class AVABStateView extends SettingItemSwitch {

    /* renamed from: b */
    C36952a f96804b;

    public void toggle() {
        setChecked(!isChecked());
        if (C36989t.m118998f(this.f96804b) != null) {
            C36989t.m118998f(this.f96804b).mo93317a(Boolean.valueOf(isChecked()));
        }
    }

    public AVABStateView(Context context) {
        super(context);
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.f29170g.setOnLongClickListener(onLongClickListener);
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        C36989t.m118992a(this.f96804b, z);
    }

    public AVABStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo93335a(C36952a aVar, String str) {
        this.f29174k.setSingleLine(true);
        if (aVar == null) {
            throw new NullPointerException();
        } else if (aVar.type() == PropertyType.Boolean) {
            this.f96804b = aVar;
            setChecked(C36989t.m118993a(aVar));
            setStartText(str);
            setOnSettingItemClickListener(new C10813a() {
                public final void OnSettingItemClick(View view) {
                    AVABStateView.this.toggle();
                }
            });
        } else {
            throw new IllegalArgumentException();
        }
    }

    public AVABStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
