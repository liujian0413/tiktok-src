package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3393m;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.i18n.C3439a;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.gift.effect.entry.p383e.C8026a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.gift.effect.entry.view.a */
public final class C8036a extends ConstraintLayout {

    /* renamed from: g */
    private HSImageView f21871g;

    /* renamed from: h */
    private HSImageView f21872h;

    /* renamed from: i */
    private TextView f21873i;

    /* renamed from: j */
    private HSImageView f21874j;

    /* renamed from: k */
    private BaseLightView f21875k;

    private int getLayoutResource() {
        return R.layout.azf;
    }

    /* renamed from: c */
    public final void mo20986c() {
        this.f21875k.mo20949a();
    }

    /* renamed from: b */
    public final void mo20984b() {
        int i;
        boolean z = false;
        if (this.f21873i.getLayout() != null) {
            i = ((int) this.f21873i.getLayout().getLineWidth(0)) - ((this.f21873i.getWidth() - this.f21873i.getCompoundPaddingRight()) - this.f21873i.getCompoundPaddingLeft());
            if (i > 0) {
                z = true;
            }
        } else {
            i = 0;
        }
        if (z) {
            this.f21873i.post(new C8037b(this, i));
        }
    }

    /* renamed from: d */
    public final void mo20987d() {
        this.f21874j.setVisibility(0);
        ObjectAnimator.ofFloat(this.f21874j, "alpha", new float[]{0.0f, 1.0f}).setDuration(334).start();
    }

    /* renamed from: e */
    private void m24646e() {
        this.f21871g = (HSImageView) findViewById(R.id.iz);
        this.f21872h = (HSImageView) findViewById(R.id.avw);
        this.f21873i = (TextView) findViewById(R.id.a7p);
        this.f21874j = (HSImageView) findViewById(R.id.gb);
        this.f21875k = (BaseLightView) findViewById(R.id.kv);
        if (!C3519c.m12965a(getContext()) && VERSION.SDK_INT >= 17) {
            this.f21873i.setTextDirection(3);
        }
        this.f21874j.setVisibility(4);
    }

    public C8036a(Context context) {
        super(context);
        inflate(context, getLayoutResource(), this);
        m24646e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo20985b(int i) {
        if (this.f21873i.getScrollX() != 0 && C3519c.m12965a(getContext())) {
            i = this.f21873i.getScrollX() - i;
        }
        ObjectAnimator duration = ObjectAnimator.ofInt(this.f21873i, "scrollX", new int[]{i}).setDuration(1200);
        duration.setInterpolator(new LinearInterpolator());
        duration.start();
    }

    public final void setUI(C8026a aVar) {
        String str;
        if (aVar.f21781e != null) {
            C5343e.m17031a((ImageView) this.f21871g, aVar.f21781e, (int) R.drawable.c4_);
        }
        if (aVar.f21782f != null) {
            C3393m.m12633b(this.f21872h, aVar.f21782f);
        } else {
            this.f21872h.setVisibility(8);
        }
        if (aVar.f21789m != null) {
            if (aVar.f21789m.f23405c != null) {
                if (aVar.f21789m.f23405c.f26013a == null || TextUtils.isEmpty(((C3439a) C3596c.m13172a(C3439a.class)).getI18nString(aVar.f21789m.f23405c.f26013a))) {
                    str = aVar.f21789m.f23405c.f26014b;
                } else {
                    str = ((C3439a) C3596c.m13172a(C3439a.class)).getI18nString(aVar.f21789m.f23405c.f26013a);
                }
                this.f21873i.setText(((C3495l) C3596c.m13172a(C3495l.class)).parsePatternAndGetSpannable(str, aVar.f21789m.f23405c).toString());
            }
            if (aVar.mo20941c() || aVar.f21789m.f23404b == null) {
                this.f21874j.setVisibility(8);
            } else {
                C3393m.m12633b(this.f21874j, aVar.f21789m.f23404b);
            }
        }
    }
}
