package com.bytedance.android.livesdk.gift.effect.normal.view;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.effect.entry.p382d.C8025a;
import com.bytedance.android.livesdk.gift.effect.normal.model.NormalGiftMessage;
import com.bytedance.android.livesdk.gift.effect.normal.p387c.C8050a;
import com.bytedance.android.livesdk.gift.effect.normal.utils.AnimationUtils;
import com.bytedance.android.livesdk.gift.effect.normal.utils.AnimationUtils.C8056b;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a.C9302a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class NormalGiftCombView extends LinearLayout implements OnClickListener, C9302a {

    /* renamed from: a */
    public View f21946a;

    /* renamed from: b */
    public AnimatorSet f21947b;

    /* renamed from: c */
    public C8050a f21948c;

    /* renamed from: d */
    public C9301a f21949d;

    /* renamed from: e */
    public boolean f21950e;

    /* renamed from: f */
    public boolean f21951f;

    /* renamed from: g */
    public C8056b f21952g;

    /* renamed from: h */
    private NormalGiftView f21953h;

    /* renamed from: i */
    private TextView f21954i;

    /* renamed from: j */
    private TextView f21955j;

    /* renamed from: k */
    private TextView f21956k;

    /* renamed from: l */
    private String f21957l;

    /* renamed from: m */
    private NormalGiftMessage f21958m;

    /* renamed from: n */
    private C8025a f21959n;

    /* renamed from: o */
    private boolean f21960o;

    /* renamed from: p */
    private boolean f21961p;

    private int getLayoutResource() {
        return R.layout.awl;
    }

    /* renamed from: a */
    public final void mo21027a() {
        this.f21960o = false;
        m24701a("1");
        this.f21946a.setVisibility(4);
        setAlpha(1.0f);
        this.f21953h.resetUI();
    }

    /* renamed from: e */
    private void m24703e() {
        if (!this.f21961p) {
            if (this.f21947b != null && this.f21947b.isRunning()) {
                this.f21947b.removeAllListeners();
                this.f21947b.cancel();
                this.f21947b = null;
            }
            this.f21948c = null;
        }
    }

    /* renamed from: b */
    public final void mo21031b() {
        if (!this.f21961p) {
            if (this.f21949d.hasMessages(100)) {
                this.f21949d.removeMessages(100);
            }
            m24701a(String.valueOf(this.f21958m.f21913c));
            this.f21947b = AnimationUtils.m24680a(this.f21946a, this.f21952g);
            this.f21950e = true;
            this.f21947b.start();
        }
    }

    /* renamed from: c */
    public final void mo21032c() {
        this.f21961p = true;
        m24703e();
        if (this.f21948c != null) {
            this.f21948c = null;
        }
        if (this.f21959n != null) {
            this.f21959n = null;
        }
        if (this.f21949d.hasMessages(100)) {
            this.f21949d.removeMessages(100);
        }
        if (this.f21953h != null) {
            this.f21953h.stopDraw();
        }
    }

    /* renamed from: d */
    private void m24702d() {
        this.f21953h = (NormalGiftView) findViewById(R.id.ku);
        this.f21946a = findViewById(R.id.yk);
        this.f21954i = (TextView) findViewById(R.id.yo);
        this.f21955j = (TextView) findViewById(R.id.yp);
        this.f21956k = (TextView) findViewById(R.id.yq);
        m24701a("1");
        this.f21946a.setVisibility(4);
        this.f21953h.setOnClickListener(this);
    }

    public void setClickListener(C8025a aVar) {
        this.f21959n = aVar;
    }

    public void setShowCombo(boolean z) {
        this.f21951f = z;
    }

    public NormalGiftCombView(Context context) {
        this(context, null);
    }

    public void setOrientation(int i) {
        if (this.f21953h != null) {
            this.f21953h.setOrientation(i);
        }
    }

    public void onClick(View view) {
        if (this.f21958m != null && this.f21958m.f21926l != null && this.f21959n != null) {
            this.f21959n.mo13961a(this.f21958m.f21926l.getId());
        }
    }

    /* renamed from: a */
    private void m24701a(String str) {
        if (this.f21956k != null) {
            String string = getResources().getString(R.string.esv, new Object[]{str});
            this.f21956k.setText(string);
            this.f21954i.setText(string);
            this.f21955j.setText(string);
        }
    }

    /* renamed from: a */
    public final void mo12403a(Message message) {
        if (message.what == 100 && !this.f21960o) {
            this.f21960o = true;
            this.f21952g.mo21018c();
        }
    }

    public NormalGiftCombView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo21028a(int i, int i2) {
        setX((float) i);
        setY((float) i2);
    }

    /* renamed from: a */
    public final void mo21029a(C8050a aVar, boolean z) {
        if (!this.f21961p) {
            this.f21948c = aVar;
            this.f21953h.playAnimation();
            this.f21947b = AnimationUtils.m24681a(this, z, this.f21952g);
            this.f21947b.start();
        }
    }

    /* renamed from: a */
    public final void mo21030a(NormalGiftMessage normalGiftMessage, boolean z) {
        this.f21958m = normalGiftMessage;
        this.f21953h.settingUi(this.f21958m, z);
        this.f21957l = String.valueOf(this.f21958m.f21913c);
        m24701a(this.f21957l);
    }

    public NormalGiftCombView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21957l = "1";
        this.f21949d = new C9301a(this);
        this.f21952g = new C8056b() {
            /* renamed from: d */
            public final void mo21019d() {
                if (NormalGiftCombView.this.f21948c != null) {
                    NormalGiftCombView.this.f21948c.mo21005c();
                }
            }

            /* renamed from: b */
            public final void mo21017b() {
                NormalGiftCombView.this.f21949d.sendEmptyMessageDelayed(100, 1000);
                NormalGiftCombView.this.f21950e = false;
                if (NormalGiftCombView.this.f21948c != null) {
                    NormalGiftCombView.this.f21948c.mo21003a();
                }
            }

            /* renamed from: a */
            public final void mo21016a() {
                if (NormalGiftCombView.this.f21946a == null || !NormalGiftCombView.this.f21951f) {
                    if (!NormalGiftCombView.this.f21951f) {
                        mo21017b();
                    }
                    return;
                }
                NormalGiftCombView.this.f21946a.setVisibility(0);
                NormalGiftCombView.this.f21947b = AnimationUtils.m24680a(NormalGiftCombView.this.f21946a, NormalGiftCombView.this.f21952g);
                NormalGiftCombView.this.f21950e = true;
                NormalGiftCombView.this.f21947b.start();
            }

            /* renamed from: c */
            public final void mo21018c() {
                if (NormalGiftCombView.this.f21948c != null) {
                    NormalGiftCombView.this.f21948c.mo21004b();
                }
                NormalGiftCombView.this.f21947b = AnimationUtils.m24682b(NormalGiftCombView.this, NormalGiftCombView.this.f21952g);
                NormalGiftCombView.this.f21947b.start();
            }
        };
        LayoutInflater.from(context).inflate(getLayoutResource(), this);
        m24702d();
        if (VERSION.SDK_INT >= 17) {
            setLayoutDirection(0);
        }
    }
}
