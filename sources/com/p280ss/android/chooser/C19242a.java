package com.p280ss.android.chooser;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.C13439b;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.chooser.C19256e.C19259b;
import com.p280ss.android.chooser.C19256e.C19261d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.ss.android.chooser.a */
public final class C19242a extends BaseAdapter {

    /* renamed from: a */
    public final List<C19262f> f52089a = new ArrayList();

    /* renamed from: b */
    public final Set<C19262f> f52090b = new HashSet(9);

    /* renamed from: c */
    public boolean f52091c;

    /* renamed from: d */
    public boolean f52092d;

    /* renamed from: e */
    public int f52093e = -1;

    /* renamed from: f */
    public int f52094f = -1;

    /* renamed from: g */
    public int f52095g = -1;

    /* renamed from: h */
    public final C19256e f52096h = C19256e.m63104a();

    /* renamed from: i */
    private final Context f52097i;

    /* renamed from: j */
    private final int f52098j;

    /* renamed from: k */
    private final int f52099k;

    /* renamed from: l */
    private int f52100l;

    /* renamed from: m */
    private int f52101m;

    /* renamed from: n */
    private int f52102n = 0;

    /* renamed from: o */
    private int f52103o;

    /* renamed from: p */
    private double f52104p;

    /* renamed from: q */
    private C19261d f52105q = new C19261d() {
        /* renamed from: a */
        public final void mo51048a() {
            C19242a.this.f52090b.clear();
            C19242a.this.f52090b.addAll(C19242a.this.f52096h.mo51086e());
        }
    };

    /* renamed from: r */
    private C19259b f52106r = new C19259b() {
        /* renamed from: a */
        public final void mo51060a(int i) {
            C19242a.this.f52089a.clear();
            C19242a.this.f52089a.addAll(C19242a.this.f52096h.mo51071a(i));
            C19242a.this.notifyDataSetChanged();
        }
    };

    /* renamed from: com.ss.android.chooser.a$a */
    static class C19246a {

        /* renamed from: a */
        SimpleDraweeView f52112a;

        /* renamed from: b */
        ImageView f52113b;

        /* renamed from: c */
        ImageView f52114c;

        /* renamed from: d */
        TextView f52115d;

        /* renamed from: e */
        TextView f52116e;

        /* renamed from: f */
        View f52117f;

        C19246a() {
        }
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getCount() {
        return this.f52089a.size();
    }

    /* renamed from: b */
    public final void mo51055b() {
        this.f52096h.mo51082b(this.f52105q);
        this.f52096h.mo51080b(this.f52106r);
    }

    /* renamed from: a */
    public final void mo51051a() {
        this.f52096h.mo51076a(this.f52105q);
        this.f52096h.mo51074a(this.f52106r);
    }

    /* renamed from: a */
    public final C19262f getItem(int i) {
        return (C19262f) this.f52089a.get(i);
    }

    /* renamed from: b */
    private static String m63080b(int i) {
        int i2 = i % 60;
        int i3 = i / 60;
        int i4 = i3 / 60;
        int i5 = i3 % 60;
        if (i4 == 0) {
            return C1642a.m8035a(Locale.CHINA, "%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)});
        }
        return C1642a.m8035a(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2)});
    }

    /* renamed from: a */
    public final void mo51052a(int i, int i2) {
        if (i > 0 && i2 > 0 && i < i2) {
            this.f52100l = i;
            this.f52101m = i2;
        }
    }

    /* renamed from: a */
    public final void mo51053a(View view, C19262f fVar) {
        String str;
        boolean z = false;
        if (this.f52090b.contains(fVar)) {
            this.f52096h.mo51077a(fVar);
        } else if (this.f52096h.mo51087f() >= this.f52099k) {
            if (this.f52099k > 1) {
                str = this.f52097i.getString(R.string.c8z, new Object[]{Integer.valueOf(this.f52099k)});
            } else {
                str = this.f52097i.getString(R.string.c8x);
            }
            C9738o.m28697a(this.f52097i, str);
            return;
        } else {
            this.f52096h.mo51083b(fVar);
            z = true;
        }
        view.setSelected(z);
    }

    /* renamed from: a */
    public final void mo51054a(Collection<? extends C19262f> collection, Collection<? extends C19262f> collection2) {
        this.f52089a.clear();
        this.f52089a.addAll(collection);
        this.f52090b.clear();
        this.f52090b.addAll(collection2);
        notifyDataSetChanged();
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C19246a aVar;
        int i2;
        if (view == null) {
            view = LayoutInflater.from(this.f52097i).inflate(R.layout.ad9, null);
            aVar = new C19246a();
            aVar.f52112a = (SimpleDraweeView) view.findViewById(R.id.bxo);
            aVar.f52113b = (ImageView) view.findViewById(R.id.bxn);
            aVar.f52115d = (TextView) view.findViewById(R.id.media_device);
            aVar.f52114c = (ImageView) view.findViewById(R.id.media_selected_indicator);
            aVar.f52116e = (TextView) view.findViewById(R.id.eaj);
            aVar.f52117f = view.findViewById(R.id.d4f);
            view.setTag(aVar);
        } else {
            aVar = (C19246a) view.getTag();
        }
        LayoutParams layoutParams = aVar.f52112a.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.f52102n;
            double d = (double) this.f52102n;
            double d2 = this.f52104p;
            Double.isNaN(d);
            layoutParams.height = (int) (d * d2);
        }
        ImageView imageView = aVar.f52114c;
        if (this.f52098j == 1) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        final C19262f fVar = (C19262f) this.f52089a.get(i);
        if (fVar.f52148a == -1) {
            aVar.f52112a.setImageBitmap(null);
            aVar.f52113b.setVisibility(4);
            aVar.f52116e.setVisibility(4);
            aVar.f52117f.setVisibility(4);
            aVar.f52115d.setVisibility(0);
            aVar.f52114c.setVisibility(4);
            int i3 = fVar.f52151d;
            if (i3 == 0) {
                aVar.f52115d.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ac1, 0, 0);
                aVar.f52115d.setText(R.string.c98);
            } else if (1 == i3) {
                aVar.f52115d.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ac0, 0, 0);
                aVar.f52115d.setText(R.string.c97);
            }
            return view;
        }
        aVar.f52115d.setVisibility(4);
        aVar.f52116e.setVisibility(4);
        aVar.f52114c.setSelected(this.f52090b.contains(fVar));
        final ImageView imageView2 = aVar.f52114c;
        aVar.f52114c.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C19242a.this.mo51053a(imageView2, fVar);
            }
        });
        int i4 = fVar.f52151d;
        if (i4 == 2) {
            aVar.f52113b.setVisibility(0);
            aVar.f52113b.getDrawable().setLevel(fVar.f52151d);
        } else {
            aVar.f52113b.setVisibility(4);
        }
        if (1 == i4) {
            aVar.f52116e.setVisibility(0);
            if (this.f52093e != -1) {
                aVar.f52116e.setTextSize(2, (float) this.f52093e);
            }
            if (this.f52094f != -1) {
                aVar.f52116e.setTextColor(this.f52094f);
            }
            if (this.f52095g != -1) {
                aVar.f52116e.setShadowLayer(1.0f, 0.0f, 1.0f, this.f52095g);
            }
            if (!this.f52091c) {
                aVar.f52116e.setBackgroundResource(0);
            } else {
                RoundingParams roundingParams = new RoundingParams();
                roundingParams.mo32879a(C9738o.m28708b(this.f52097i, 2.0f));
                C13438a a = new C13439b(this.f52097i.getResources()).mo32908a();
                a.mo32897a(roundingParams);
                aVar.f52112a.setHierarchy(a);
                aVar.f52116e.setBackgroundResource(R.drawable.b94);
                Drawable drawable = this.f52097i.getResources().getDrawable(R.drawable.cor);
                aVar.f52116e.setCompoundDrawablePadding((int) C9738o.m28708b(this.f52097i, 2.0f));
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                aVar.f52116e.setCompoundDrawables(drawable, null, null, null);
            }
            int round = Math.round((float) (fVar.f52152e / 1000));
            int i5 = round * 1000;
            if (i5 < this.f52100l || i5 > this.f52101m) {
                aVar.f52117f.setVisibility(0);
            } else {
                aVar.f52117f.setVisibility(4);
            }
            aVar.f52116e.setText(m63080b(round));
        } else {
            aVar.f52116e.setVisibility(4);
            aVar.f52117f.setVisibility(4);
        }
        StringBuilder sb = new StringBuilder("file://");
        sb.append(fVar.f52149b);
        aVar.f52112a.setController(((C13382e) ((C13382e) C13380c.m39166a().mo32729b(aVar.f52112a.getController())).mo32748b(ImageRequestBuilder.m40865a(Uri.parse(sb.toString())).mo33468a(new C13596d(this.f52102n, this.f52102n)).mo33476b())).mo32730f());
        return view;
    }

    public C19242a(Context context, int i, int i2, int i3, double d, int i4, int i5) {
        this.f52097i = context;
        this.f52098j = i;
        this.f52099k = i2;
        this.f52103o = i3;
        this.f52104p = d;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.im);
        if (i4 != -1) {
            dimensionPixelOffset = (int) C9738o.m28708b(this.f52097i, (float) i4);
        }
        this.f52102n = ((C9738o.m28691a(context) - ((this.f52103o - 1) * dimensionPixelOffset)) - (i5 * 2)) / this.f52103o;
    }
}
