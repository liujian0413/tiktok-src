package com.bytedance.ies.dmt.p262ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.common.C10778e;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.bytedance.ies.dmt.p262ui.titlebar.p566b.C10798a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtIconButton */
public class DmtIconButton extends FrameLayout implements C10778e {

    /* renamed from: a */
    private int f29064a;

    /* renamed from: b */
    private ImageView f29065b;

    /* renamed from: c */
    private TextView f29066c;

    /* renamed from: d */
    private ButtonStyle f29067d;

    /* renamed from: e */
    private int f29068e;

    /* renamed from: a */
    private void m31602a() {
        if (this.f29067d == ButtonStyle.SOLID) {
            m31604b();
        } else {
            m31605c();
        }
    }

    /* renamed from: b */
    private void m31604b() {
        if (this.f29064a == 0) {
            setBackgroundResource(R.drawable.clz);
        } else {
            setBackgroundResource(R.drawable.cly);
        }
        this.f29066c.setTextColor(getContext().getResources().getColor(R.color.aur));
        if (this.f29068e != -1) {
            C10798a.m31571a(getContext(), this.f29065b, this.f29068e, R.color.aur);
        }
    }

    /* renamed from: c */
    private void m31605c() {
        if (this.f29064a == 0) {
            setBackgroundResource(R.drawable.clx);
            this.f29066c.setTextColor(getContext().getResources().getColor(R.color.axg));
            if (this.f29068e != -1) {
                C10798a.m31571a(getContext(), this.f29065b, this.f29068e, R.color.axg);
            }
        } else {
            setBackgroundResource(R.drawable.clw);
            this.f29066c.setTextColor(getContext().getResources().getColor(R.color.axf));
            if (this.f29068e != -1) {
                C10798a.m31571a(getContext(), this.f29065b, this.f29068e, R.color.axf);
            }
        }
    }

    public DmtIconButton(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo25766a(int i) {
        if (this.f29064a != i) {
            this.f29064a = i;
            m31602a();
        }
    }

    /* renamed from: a */
    private void m31603a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.a7b, this, true);
        this.f29065b = (ImageView) inflate.findViewById(R.id.b_a);
        this.f29066c = (TextView) inflate.findViewById(R.id.e38);
        m31602a();
    }

    public DmtIconButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DmtIconButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29064a = C6394b.m19903a().f18686a;
        this.f29067d = ButtonStyle.SOLID;
        this.f29068e = -1;
        m31603a(context);
    }

    /* renamed from: a */
    public final void mo25928a(ButtonStyle buttonStyle, int i, String str) {
        this.f29068e = i;
        if (buttonStyle == ButtonStyle.BORDER) {
            m31605c();
        } else {
            m31604b();
        }
        this.f29066c.setText(str);
    }
}
