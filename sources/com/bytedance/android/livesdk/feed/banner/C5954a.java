package com.bytedance.android.livesdk.feed.banner;

import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.base.model.live.C2352c;
import com.bytedance.android.live.base.model.live.C2353d;
import com.bytedance.android.live.core.utils.C3404s;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.bytedance.android.livesdkapi.C9469i;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.feed.banner.a */
public final class C5954a {

    /* renamed from: a */
    ImageView f17668a;

    /* renamed from: b */
    ImageView f17669b;

    /* renamed from: c */
    TextView f17670c;

    /* renamed from: d */
    List<ImageView> f17671d = new ArrayList(3);

    /* renamed from: e */
    boolean f17672e;

    /* renamed from: f */
    private final View f17673f;

    /* renamed from: g */
    private final int[] f17674g;

    /* renamed from: a */
    public final void mo14600a(final C2353d dVar) {
        int i;
        if (this.f17672e) {
            C3404s.m12659b(this.f17669b, dVar.f7726e);
        }
        C3404s.m12659b(this.f17668a, dVar.f7722a);
        this.f17670c.setText(dVar.f7723b);
        this.f17673f.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                try {
                    Uri parse = Uri.parse(dVar.f7725d);
                    if (C9469i.m27992d() != null) {
                        C9469i.m27992d().mo22014a(view.getContext(), parse);
                    }
                } catch (Exception unused) {
                }
            }
        });
        int size = this.f17671d.size();
        if (dVar.f7724c == null) {
            i = 0;
        } else {
            i = dVar.f7724c.size();
        }
        int max = Math.max(0, size - i);
        for (int i2 = 0; i2 < this.f17671d.size(); i2++) {
            ImageView imageView = (ImageView) this.f17671d.get(i2);
            if (i2 < max) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                if (i2 < this.f17674g.length) {
                    imageView.setBackgroundResource(this.f17674g[i2]);
                }
                C3404s.m12650a(imageView, ((C2352c) dVar.f7724c.get(i2 - max)).f7719b);
            }
        }
    }

    public C5954a(View view, boolean z) {
        this.f17672e = z;
        this.f17673f = view;
        this.f17670c = (TextView) view.findViewById(R.id.cng);
        this.f17668a = (ImageView) view.findViewById(R.id.cna);
        this.f17669b = (ImageView) view.findViewById(R.id.cn5);
        this.f17671d.add(view.findViewById(R.id.ie));
        this.f17671d.add(view.findViewById(R.id.f124297if));
        this.f17671d.add(view.findViewById(R.id.ig));
        if (z) {
            this.f17669b.setVisibility(0);
            ImageView imageView = (ImageView) view.findViewById(R.id.h4);
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = (ImageView) view.findViewById(R.id.cn9);
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            this.f17670c.setTextColor(view.getContext().getResources().getColor(R.color.ah9));
            this.f17670c.setTextSize(C9051ar.m27031a(view.getContext(), 24.0f));
            for (ImageView imageView3 : this.f17671d) {
                int b = (int) C9051ar.m27035b(view.getContext(), 54.0f);
                int b2 = (int) C9051ar.m27035b(imageView3.getContext(), 10.0f);
                int b3 = (int) C9051ar.m27035b(imageView3.getContext(), 3.0f);
                imageView3.getLayoutParams().height = b;
                imageView3.getLayoutParams().width = b;
                if (imageView3.getLayoutParams() instanceof LayoutParams) {
                    LayoutParams layoutParams = (LayoutParams) imageView3.getLayoutParams();
                    layoutParams.topMargin = b3;
                    layoutParams.leftMargin = -((int) C9051ar.m27035b(view.getContext(), 8.0f));
                    imageView3.setLayoutParams(layoutParams);
                }
                imageView3.setPadding(imageView3.getPaddingLeft(), b2, imageView3.getRight(), b2);
            }
            this.f17674g = new int[]{R.drawable.bmz, R.drawable.bn0, R.drawable.bmy};
            return;
        }
        this.f17674g = new int[]{R.drawable.bmx, R.drawable.bn2, R.drawable.bmw};
    }
}
