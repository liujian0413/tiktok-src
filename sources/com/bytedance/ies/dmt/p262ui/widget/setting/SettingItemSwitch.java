package com.bytedance.ies.dmt.p262ui.widget.setting;

import android.content.Context;
import android.support.p029v7.p030a.p031a.C1065a;
import android.support.p029v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.widget.Checkable;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.setting.SettingItemSwitch */
public class SettingItemSwitch extends SettingItemBase implements Checkable {

    /* renamed from: a */
    protected Checkable f29181a;

    /* access modifiers changed from: protected */
    public int getRightLayoutId() {
        return R.layout.b10;
    }

    /* renamed from: a */
    public final boolean mo26028a() {
        return isChecked();
    }

    /* renamed from: b */
    public final boolean mo26029b() {
        return isChecked();
    }

    public boolean isChecked() {
        return this.f29181a.isChecked();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public SettingItemSwitch(Context context) {
        super(context);
    }

    public void setChecked(boolean z) {
        this.f29181a.setChecked(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26011a(Context context) {
        int i;
        int i2;
        super.mo26011a(context);
        this.f29181a = (Checkable) this.f29169f.findViewById(R.id.ctk);
        if (C6394b.m19907b(context)) {
            i = R.color.jq;
        } else {
            i = R.color.jr;
        }
        if (C6394b.m19907b(context)) {
            i2 = R.color.jo;
        } else {
            i2 = R.color.jp;
        }
        ((SwitchCompat) this.f29181a).setTrackTintList(C1065a.m4638a(getContext(), i));
        ((SwitchCompat) this.f29181a).setThumbTintList(C1065a.m4638a(getContext(), i2));
    }

    public SettingItemSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SettingItemSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
