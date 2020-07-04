package com.p280ss.android.ugc.aweme.feed.guide;

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
import com.bytedance.ies.dmt.p262ui.widget.ButtonStyle;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.AutoCenterDmtIconButton */
public class AutoCenterDmtIconButton extends FrameLayout implements C10778e {

    /* renamed from: a */
    private int f74714a;

    /* renamed from: b */
    private ImageView f74715b;

    /* renamed from: c */
    private TextView f74716c;

    /* renamed from: d */
    private ButtonStyle f74717d;

    /* renamed from: e */
    private int f74718e;

    /* renamed from: a */
    private void m93180a() {
        if (this.f74717d == ButtonStyle.SOLID) {
            m93182b();
        } else {
            m93183c();
        }
    }

    /* renamed from: b */
    private void m93182b() {
        if (this.f74714a == 0) {
            setBackgroundResource(R.drawable.clz);
        } else {
            setBackgroundResource(R.drawable.cly);
        }
        this.f74716c.setTextColor(getContext().getResources().getColor(R.color.aur));
        if (this.f74718e != -1) {
            this.f74715b.setVisibility(0);
            C10798a.m31571a(getContext(), this.f74715b, this.f74718e, R.color.aur);
            return;
        }
        this.f74715b.setVisibility(8);
    }

    /* renamed from: c */
    private void m93183c() {
        if (this.f74714a == 0) {
            setBackgroundResource(R.drawable.clx);
            this.f74716c.setTextColor(getContext().getResources().getColor(R.color.axg));
            if (this.f74718e != -1) {
                this.f74715b.setVisibility(0);
                C10798a.m31571a(getContext(), this.f74715b, this.f74718e, R.color.axg);
                return;
            }
            this.f74715b.setVisibility(8);
            return;
        }
        setBackgroundResource(R.drawable.clw);
        this.f74716c.setTextColor(getContext().getResources().getColor(R.color.axf));
        if (this.f74718e != -1) {
            this.f74715b.setVisibility(0);
            C10798a.m31571a(getContext(), this.f74715b, this.f74718e, R.color.axf);
            return;
        }
        this.f74715b.setVisibility(8);
    }

    public AutoCenterDmtIconButton(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo25766a(int i) {
        if (this.f74714a != i) {
            this.f74714a = i;
            m93180a();
        }
    }

    /* renamed from: a */
    private void m93181a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.a7c, this, true);
        this.f74715b = (ImageView) inflate.findViewById(R.id.b_a);
        this.f74716c = (TextView) inflate.findViewById(R.id.e38);
        m93180a();
    }

    public AutoCenterDmtIconButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AutoCenterDmtIconButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f74714a = C6394b.m19903a().f18686a;
        this.f74717d = ButtonStyle.SOLID;
        this.f74718e = -1;
        m93181a(context);
    }

    /* renamed from: a */
    public final void mo72028a(ButtonStyle buttonStyle, int i, int i2) {
        mo72029a(buttonStyle, i, getContext().getString(i2));
    }

    /* renamed from: a */
    public final void mo72029a(ButtonStyle buttonStyle, int i, String str) {
        this.f74718e = i;
        if (buttonStyle == ButtonStyle.BORDER) {
            m93183c();
        } else {
            m93182b();
        }
        this.f74716c.setText(str);
    }
}
