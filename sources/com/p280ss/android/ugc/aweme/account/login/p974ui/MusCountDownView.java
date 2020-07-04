package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.login.fragment.C21524n;
import com.p280ss.android.ugc.aweme.account.util.C22349w;
import com.p280ss.android.ugc.aweme.account.util.C22349w.C22350a;
import com.p280ss.android.ugc.aweme.p1416n.C34032a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.MusCountDownView */
public class MusCountDownView extends RelativeLayout {

    /* renamed from: a */
    public static final boolean f58446a = C7163a.m22363a();

    /* renamed from: b */
    public TextView f58447b;

    /* renamed from: c */
    public TextView f58448c;

    /* renamed from: d */
    public View f58449d;

    /* renamed from: e */
    public boolean f58450e;

    /* renamed from: f */
    private C22349w f58451f;

    /* renamed from: g */
    private C21524n f58452g;

    /* renamed from: h */
    private C22350a f58453h = new C22350a() {

        /* renamed from: b */
        private boolean f58455b;

        /* renamed from: a */
        public final void mo58224a(long j) {
            if (j > 0) {
                MusCountDownView.this.f58447b.setVisibility(0);
                MusCountDownView.this.f58448c.setVisibility(8);
                MusCountDownView.this.f58447b.setText(MusCountDownView.this.getContext().getResources().getString(R.string.dge, new Object[]{Long.valueOf(j)}));
            } else {
                MusCountDownView.this.f58447b.setVisibility(8);
                MusCountDownView.this.f58448c.setVisibility(0);
                MusCountDownView.this.f58448c.setText(MusCountDownView.this.getContext().getString(R.string.cfi));
            }
            if (MusCountDownView.f58446a && j < 50 && !this.f58455b) {
                this.f58455b = true;
            }
            if (j < 50 && MusCountDownView.this.f58450e && MusCountDownView.this.f58449d != null && MusCountDownView.this.f58449d.getVisibility() != 0 && C6399b.m19947w()) {
                MusCountDownView.this.f58449d.setVisibility(0);
            }
        }
    };

    public TextView getResendCodeButton() {
        return this.f58448c;
    }

    public TextView getTimerText() {
        return this.f58447b;
    }

    public long getRemainTick() {
        if (this.f58451f == null) {
            return 0;
        }
        return this.f58451f.f59613b;
    }

    /* renamed from: c */
    private void m72970c() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.afa, this, true);
        this.f58447b = (TextView) inflate.findViewById(R.id.a3e);
        this.f58448c = (TextView) inflate.findViewById(R.id.cs9);
        this.f58448c.setOnTouchListener(new C34032a(0.5f, 150, null));
    }

    /* renamed from: a */
    public final void mo58212a() {
        if (this.f58452g != null && this.f58451f != null) {
            if (this.f58451f.f59613b != 0) {
                mo58215b();
            } else {
                this.f58451f.mo58763a(System.currentTimeMillis(), 60, this.f58453h);
            }
        }
    }

    /* renamed from: b */
    public final void mo58215b() {
        if (this.f58452g != null && this.f58451f != null) {
            int parseInt = Integer.parseInt(String.valueOf(this.f58451f.f59613b));
            long currentTimeMillis = System.currentTimeMillis();
            if (parseInt != 0) {
                this.f58451f.mo58766b(currentTimeMillis, parseInt, this.f58453h);
            }
        }
    }

    public void setTargetView(View view) {
        this.f58449d = view;
    }

    public void setTickListener(C21524n nVar) {
        this.f58452g = nVar;
    }

    public void setVoiceCodeEnabled(boolean z) {
        this.f58450e = z;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f58448c.setOnClickListener(onClickListener);
    }

    public MusCountDownView(Context context) {
        super(context);
        m72970c();
    }

    /* renamed from: a */
    public final void mo58213a(int i) {
        if (this.f58452g != null) {
            this.f58451f = this.f58452g.mo57196b(i);
            if (Integer.parseInt(String.valueOf(this.f58451f.f59613b)) != 0) {
                mo58216b(i);
            } else {
                this.f58451f.mo58763a(System.currentTimeMillis(), 60, this.f58453h);
            }
        }
    }

    /* renamed from: b */
    public final void mo58216b(int i) {
        if (this.f58452g != null) {
            this.f58451f = this.f58452g.mo57196b(i);
            if (this.f58451f != null) {
                int parseInt = Integer.parseInt(String.valueOf(this.f58451f.f59613b));
                long currentTimeMillis = System.currentTimeMillis();
                if (parseInt != 0) {
                    this.f58451f.mo58766b(currentTimeMillis, parseInt, this.f58453h);
                }
            }
        }
    }

    public MusCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m72970c();
    }

    /* renamed from: a */
    public final void mo58214a(int i, String str) {
        if (this.f58452g != null) {
            this.f58452g.mo57192a(i, str, System.currentTimeMillis(), 60, this.f58453h);
            this.f58451f = this.f58452g.mo57196b(i);
        }
    }

    public MusCountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m72970c();
    }
}
