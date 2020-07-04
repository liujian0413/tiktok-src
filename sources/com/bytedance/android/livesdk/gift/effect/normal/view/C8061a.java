package com.bytedance.android.livesdk.gift.effect.normal.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.gift.effect.normal.model.NormalGiftMessage;
import com.bytedance.android.livesdk.gift.effect.normal.utils.C8057a;
import com.bytedance.android.livesdk.gift.effect.p375a.C7962a;
import com.bytedance.android.livesdk.gift.p373c.C7887f;
import com.bytedance.android.livesdkapi.host.C9456c;
import com.bytedance.android.livesdkapi.host.C9456c.C9457a;
import com.bytedance.android.livesdkapi.host.C9456c.C9459c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.gift.effect.normal.view.a */
public final class C8061a extends ConstraintLayout {

    /* renamed from: g */
    public C7962a f21964g;

    /* renamed from: h */
    private View f21965h;

    /* renamed from: i */
    private ImageView f21966i;

    /* renamed from: j */
    private ImageView f21967j;

    /* renamed from: k */
    private ImageView f21968k;

    /* renamed from: l */
    private ImageView f21969l;

    /* renamed from: m */
    private TextView f21970m;

    /* renamed from: n */
    private TextView f21971n;

    /* renamed from: o */
    private TextView f21972o;

    /* renamed from: p */
    private int f21973p;

    private int getLayoutResource() {
        return R.layout.aw0;
    }

    /* renamed from: b */
    public final void mo20984b() {
        this.f21970m.setText("");
        this.f21971n.setText("");
        this.f21972o.setVisibility(8);
        this.f21966i.setImageResource(R.drawable.cdk);
        this.f21968k.setImageResource(0);
        this.f21967j.setImageResource(0);
        this.f21969l.setImageResource(R.drawable.c49);
    }

    /* renamed from: c */
    private void m24718c() {
        this.f21965h = findViewById(R.id.ks);
        this.f21966i = (ImageView) findViewById(R.id.e8r);
        this.f21967j = (ImageView) findViewById(R.id.e8n);
        this.f21968k = (ImageView) findViewById(R.id.avx);
        this.f21969l = (ImageView) findViewById(R.id.ar4);
        this.f21970m = (TextView) findViewById(R.id.e9t);
        this.f21971n = (TextView) findViewById(R.id.aql);
        this.f21972o = (TextView) findViewById(R.id.asw);
    }

    public final void setDrawingCacheListener(C7962a aVar) {
        this.f21964g = aVar;
    }

    public final void setOrientation(int i) {
        this.f21973p = i;
    }

    public C8061a(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getLayoutResource(), this);
        m24718c();
    }

    public final void setUI(NormalGiftMessage normalGiftMessage) {
        String str;
        String str2 = normalGiftMessage.f21926l.displayId;
        TextView textView = this.f21970m;
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        textView.setText(str2);
        TextView textView2 = this.f21971n;
        if (TextUtils.isEmpty(normalGiftMessage.f21925k)) {
            str = "";
        } else {
            str = normalGiftMessage.f21925k;
        }
        textView2.setText(str);
        if (normalGiftMessage.f21911a > 1) {
            this.f21972o.setText(String.valueOf(normalGiftMessage.f21911a));
            this.f21972o.setVisibility(0);
        } else {
            this.f21972o.setVisibility(8);
        }
        if (!(normalGiftMessage.f21926l == null || normalGiftMessage.f21926l.getAvatarThumb() == null)) {
            m24716a(this.f21966i, normalGiftMessage.f21926l.getAvatarThumb());
        }
        if (!(normalGiftMessage.f21926l == null || normalGiftMessage.f21926l.getUserHonor() == null)) {
            m24716a(this.f21968k, normalGiftMessage.f21926l.getUserHonor().mo8708l());
        }
        if (!(normalGiftMessage.f21926l == null || normalGiftMessage.f21926l.getBorder() == null || normalGiftMessage.f21926l.getBorder().f7818a == null)) {
            m24716a(this.f21967j, normalGiftMessage.f21926l.getBorder().f7818a);
        }
        if (normalGiftMessage.f21915e != null) {
            m24717a(this.f21969l, normalGiftMessage.f21915e, false);
        }
        this.f21965h.setBackgroundResource(C7887f.m24171a().mo20670a(normalGiftMessage.f21929o * normalGiftMessage.f21911a));
        invalidate();
    }

    /* renamed from: a */
    private void m24716a(ImageView imageView, ImageModel imageModel) {
        m24717a(imageView, imageModel, true);
    }

    /* renamed from: a */
    private void m24717a(final ImageView imageView, ImageModel imageModel, final boolean z) {
        ((C9456c) C3596c.m13172a(C9456c.class)).mo23192a(imageModel, (C9459c) new C9459c() {
            /* renamed from: a */
            public final void mo9922a(C9457a aVar) {
            }

            /* renamed from: a */
            public final void mo9921a(Bitmap bitmap) {
                Bitmap bitmap2;
                if (bitmap != null) {
                    if (z) {
                        bitmap2 = C8057a.m24688a(bitmap);
                    } else {
                        bitmap2 = C8057a.m24690b(bitmap);
                    }
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        imageView.setImageBitmap(bitmap2);
                        C8061a.this.invalidate();
                        if (C8061a.this.f21964g != null) {
                            C8061a.this.f21964g.updateDrawingCache(C8061a.this);
                        }
                    }
                }
            }
        });
    }
}
