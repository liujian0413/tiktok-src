package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItem;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemBase.C10813a;
import com.p280ss.android.ugc.aweme.setting.p1516d.C37618a;
import com.p280ss.android.ugc.aweme.setting.p336a.C37539h;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.AbStateView */
public class AbStateView extends FrameLayout {

    /* renamed from: a */
    public C37539h f98325a;

    /* renamed from: b */
    private SettingItem f98326b;

    /* renamed from: b */
    private void m120631b() {
        this.f98326b = (SettingItem) findViewById(R.id.b36);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo95087a() {
        try {
            String a = this.f98325a.mo94822a();
            SettingItem settingItem = this.f98326b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f98325a.mo94824b());
            sb.append(":  ");
            sb.append(a);
            settingItem.setStartText(sb.toString());
        } catch (IllegalAccessException unused) {
        }
    }

    public AbStateView(Context context) {
        this(context, null);
    }

    public AbStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo95089a(String[] strArr, OnClickListener onClickListener) {
        C1081a aVar = new C1081a(getContext());
        aVar.mo4236a((CharSequence[]) strArr, onClickListener);
        aVar.mo4245c();
    }

    /* renamed from: a */
    public final void mo95088a(Field field, Object obj) {
        this.f98325a = new C37539h(field, obj);
        mo95087a();
        this.f98326b.setOnSettingItemClickListener(new C10813a() {
            public final void OnSettingItemClick(View view) {
                AbStateView.this.mo95089a(AbStateView.this.f98325a.mo94825c(), (OnClickListener) new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        AbStateView.this.f98325a.mo94823a(i);
                        AbStateView.this.mo95087a();
                        C42961az.m136380a(new C37618a());
                    }
                });
            }
        });
    }

    public AbStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.a4f, this, true);
        m120631b();
    }
}
