package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.gift.effect.entry.p383e.C8027b;
import com.bytedance.android.livesdk.utils.C9094x;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class EcomEnterTrayView extends LinearLayout {

    /* renamed from: a */
    private TextView f21819a;

    /* renamed from: b */
    private HSImageView f21820b;

    /* renamed from: a */
    private void m24616a() {
        inflate(getContext(), R.layout.apg, this);
        this.f21819a = (TextView) findViewById(R.id.dtr);
        this.f21820b = (HSImageView) findViewById(R.id.b8r);
        setGravity(16);
    }

    public EcomEnterTrayView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo20952a(C8027b bVar) {
        if (bVar != null) {
            setTextContent(bVar);
            setEcomIcon(bVar);
            setBackgroundResource(R.drawable.bpf);
        }
    }

    private void setEcomIcon(C8027b bVar) {
        if (TextUtils.isEmpty(bVar.f21796t)) {
            this.f21820b.setImageResource(R.drawable.ccs);
        } else {
            C5343e.m17040a(this.f21820b, bVar.f21796t);
        }
    }

    private void setTextContent(C8027b bVar) {
        String str;
        String str2;
        if (TextUtils.isEmpty(bVar.f21783g)) {
            str = getContext().getString(R.string.eiv);
        } else {
            str = bVar.f21783g;
        }
        if (bVar.f21795s == 1) {
            str2 = getContext().getString(R.string.eix, new Object[]{bVar.f21778b, str});
        } else {
            String a = C9094x.m27135a(bVar.f21795s);
            str2 = getContext().getString(R.string.eiw, new Object[]{bVar.f21778b, a, str});
        }
        this.f21819a.setText(str2);
    }

    public EcomEnterTrayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EcomEnterTrayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24616a();
    }
}
