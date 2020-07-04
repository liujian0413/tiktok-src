package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3393m;
import com.bytedance.android.live.core.utils.C3404s.C3406b;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.livesdk.chatroom.utils.C5358p;
import com.bytedance.android.livesdk.gift.effect.entry.p383e.C8026a;
import com.bytedance.android.livesdk.gift.effect.p375a.C7962a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.gift.effect.entry.view.c */
public final class C8038c extends LinearLayout {

    /* renamed from: a */
    public ImageView f21878a;

    /* renamed from: b */
    public C7962a f21879b;

    /* renamed from: c */
    private TextView f21880c;

    /* renamed from: d */
    private TextView f21881d;

    /* renamed from: e */
    private ImageView f21882e;

    /* renamed from: f */
    private View f21883f;

    private int getLayoutResource() {
        return R.layout.avz;
    }

    /* renamed from: a */
    private void m24651a() {
        this.f21883f = findViewById(R.id.kr);
        this.f21878a = (ImageView) findViewById(R.id.avy);
        this.f21880c = (TextView) findViewById(R.id.e9t);
        this.f21881d = (TextView) findViewById(R.id.a7p);
        this.f21882e = (ImageView) findViewById(R.id.d_l);
    }

    public final void setDrawingCacheListener(C7962a aVar) {
        this.f21879b = aVar;
    }

    public C8038c(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getLayoutResource(), this);
        m24651a();
    }

    public final void setUI(C8026a aVar) {
        int i = aVar.f21787k;
        m24652a(i, aVar.f21778b);
        if (i == 0) {
            this.f21883f.setBackgroundResource(R.drawable.byi);
            this.f21882e.setBackgroundResource(R.drawable.c_u);
        } else if (i == 2) {
            this.f21883f.setBackgroundResource(R.drawable.byg);
            this.f21882e.setBackgroundResource(R.drawable.c_t);
        } else {
            this.f21883f.setBackgroundResource(R.drawable.byh);
            this.f21882e.setBackgroundResource(R.drawable.c_u);
        }
        if (i == 0) {
            this.f21878a.setBackgroundResource(R.drawable.cc5);
        } else {
            C3393m.m12629a(aVar.f21785i, 0, 0, (C3406b) new C3406b() {
                /* renamed from: a */
                public final void mo10311a(Bitmap bitmap) {
                    if (bitmap != null) {
                        C8038c.this.f21878a.setImageBitmap(bitmap);
                        C8038c.this.invalidate();
                        if (C8038c.this.f21879b != null) {
                            C8038c.this.f21879b.updateDrawingCache(C8038c.this);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m24652a(int i, String str) {
        this.f21880c.setText(str);
        if (i == 2) {
            this.f21881d.setText(R.string.eje);
            this.f21880c.setTextColor(getResources().getColor(R.color.arp));
            this.f21881d.setTextColor(getResources().getColor(R.color.arp));
            return;
        }
        this.f21881d.setText(R.string.ejf);
        this.f21880c.setTextColor(getResources().getColor(R.color.arq));
        this.f21881d.setTextColor(getResources().getColor(R.color.arq));
    }

    /* renamed from: a */
    public final void mo20991a(CharSequence charSequence, ImageModel imageModel, ImageModel imageModel2) {
        if (this.f21883f != null && !TextUtils.isEmpty(charSequence) && imageModel2 != null) {
            this.f21881d.setVisibility(8);
            this.f21882e.setVisibility(8);
            this.f21880c.setText(charSequence);
            this.f21880c.setEllipsize(null);
            this.f21880c.setMaxWidth(this.f21883f.getWidth());
            C5358p.m17090a(imageModel2, this.f21883f, C3519c.m12965a(C3358ac.m12528e()), new Runnable() {
                public final void run() {
                    if (C8038c.this.f21879b != null) {
                        C8038c.this.f21879b.updateDrawingCache(C8038c.this);
                    }
                }
            });
            C3393m.m12617a(imageModel, 0, 0, false, new C3406b() {
                /* renamed from: a */
                public final void mo10311a(Bitmap bitmap) {
                    if (bitmap != null && C8038c.this.f21878a != null && bitmap.getHeight() > 0 && bitmap.getWidth() > 0) {
                        LayoutParams layoutParams = C8038c.this.f21878a.getLayoutParams();
                        int height = C8038c.this.f21878a.getHeight();
                        layoutParams.height = height;
                        layoutParams.width = (bitmap.getWidth() * height) / bitmap.getHeight();
                        C8038c.this.f21878a.setLayoutParams(layoutParams);
                        C8038c.this.f21878a.setScaleType(ScaleType.FIT_XY);
                        C8038c.this.f21878a.setImageBitmap(bitmap);
                        C8038c.this.invalidate();
                        if (C8038c.this.f21879b != null) {
                            C8038c.this.f21879b.updateDrawingCache(C8038c.this);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo20990a(C8026a aVar, int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (aVar != null && this.f21883f != null) {
            LayoutParams layoutParams = this.f21883f.getLayoutParams();
            layoutParams.height = i;
            this.f21883f.setLayoutParams(layoutParams);
            if (i2 != -1) {
                this.f21883f.setBackgroundResource(i2);
            }
            this.f21882e.setVisibility(8);
            if (!TextUtils.isEmpty(charSequence)) {
                this.f21881d.setText(charSequence);
            } else {
                this.f21881d.setText(R.string.ejf);
            }
            this.f21880c.setText(aVar.f21778b);
            if (i3 != -1) {
                this.f21880c.setTextColor(getResources().getColor(i3));
            }
            if (i4 != -1) {
                this.f21881d.setTextColor(getResources().getColor(i4));
            }
            C3393m.m12629a(aVar.f21785i, 0, 0, (C3406b) new C3406b() {
                /* renamed from: a */
                public final void mo10311a(Bitmap bitmap) {
                    if (bitmap != null) {
                        C8038c.this.f21878a.setImageBitmap(bitmap);
                        C8038c.this.invalidate();
                        if (C8038c.this.f21879b != null) {
                            C8038c.this.f21879b.updateDrawingCache(C8038c.this);
                        }
                    }
                }
            });
        }
    }
}
