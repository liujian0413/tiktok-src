package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.emoji;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.emoji.base.C27517a;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.p1202b.p1204b.C27507a;
import com.p280ss.android.ugc.aweme.emoji.utils.C27632c;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C30570e;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.C30803b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.view.C31008a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31892bd;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.c */
public final class C30839c {

    /* renamed from: a */
    public C30803b f80769a;

    /* renamed from: b */
    public C30803b f80770b;

    /* renamed from: c */
    public C31008a f80771c;

    /* renamed from: d */
    public String f80772d;

    /* renamed from: e */
    private ViewGroup f80773e;

    /* renamed from: f */
    private LinearLayout f80774f;

    /* renamed from: g */
    private int f80775g;

    /* renamed from: h */
    private int f80776h;

    /* renamed from: i */
    private int f80777i;

    /* renamed from: j */
    private int f80778j;

    /* renamed from: k */
    private int f80779k;

    /* renamed from: l */
    private int f80780l;

    /* renamed from: m */
    private int f80781m;

    /* renamed from: n */
    private View f80782n;

    /* renamed from: o */
    private Activity f80783o;

    /* renamed from: p */
    private Handler f80784p = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final void mo80725a(List<Emoji> list) {
        int i;
        int i2;
        this.f80784p.removeCallbacksAndMessages(null);
        if (C6307b.m19566a((Collection<T>) list)) {
            if (this.f80771c != null && this.f80771c.isShowing()) {
                this.f80771c.dismiss();
            }
            return;
        }
        C31858ad.m103406a();
        C31858ad.m103495l(this.f80772d);
        if (list.size() == 1) {
            i2 = this.f80776h;
            i = (C9738o.m28691a(this.f80773e.getContext()) - this.f80776h) - this.f80779k;
        } else if (list.size() == 2) {
            i2 = this.f80777i;
            i = (C9738o.m28691a(this.f80773e.getContext()) - this.f80777i) - this.f80779k;
        } else {
            i2 = this.f80775g;
            i = (C9738o.m28691a(this.f80773e.getContext()) - this.f80775g) - this.f80779k;
        }
        this.f80774f.removeAllViews();
        for (Emoji a : list) {
            this.f80774f.addView(m100511a(this.f80774f.getContext(), a));
        }
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.height = this.f80781m;
        layoutParams.width = i2;
        this.f80773e.setLayoutParams(layoutParams);
        if (this.f80771c == null || !this.f80771c.isShowing()) {
            this.f80771c = new C31008a();
        } else {
            this.f80771c.dismiss();
        }
        this.f80771c.mo81419a(this.f80773e, this.f80783o, layoutParams.width, layoutParams.height);
        this.f80771c.f81181a = 0;
        this.f80771c.mo81418a(this.f80782n, i, -this.f80780l);
        this.f80771c.update(layoutParams.width, layoutParams.height);
        this.f80784p.postDelayed(new Runnable() {
            public final void run() {
                if (C30839c.this.f80771c != null && C30839c.this.f80771c.isShowing()) {
                    C30839c.this.f80771c.dismiss();
                }
            }
        }, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
    }

    /* renamed from: a */
    private View m100511a(Context context, final Emoji emoji) {
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setScaleType(ScaleType.FIT_XY);
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(this.f80778j, this.f80778j);
        marginLayoutParams.rightMargin = this.f80779k;
        remoteImageView.setLayoutParams(marginLayoutParams);
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("file://");
        sb.append(C27632c.m90591b(emoji));
        arrayList.add(sb.toString());
        urlModel.setUrlList(arrayList);
        StringBuilder sb2 = new StringBuilder("file://");
        sb2.append(C27632c.m90591b(emoji));
        urlModel.setUri(sb2.toString());
        C31892bd.m103615b(remoteImageView, urlModel);
        remoteImageView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C27517a aVar = new C27517a();
                aVar.f72558c = C27507a.m90162b(emoji);
                aVar.f72559d = emoji;
                C30839c.this.f80770b.mo80324a(aVar);
                C30839c.this.f80769a.mo80331b();
                C31858ad.m103406a();
                C31858ad.m103468e(C30839c.this.f80772d, String.valueOf(emoji.getId()));
            }
        });
        return remoteImageView;
    }

    public C30839c(C30803b bVar, View view, String str) {
        this.f80769a = bVar;
        this.f80782n = view;
        this.f80772d = str;
        this.f80783o = (Activity) view.getContext();
        this.f80770b = new C30570e(bVar, this.f80783o);
        this.f80773e = (ViewGroup) LayoutInflater.from(this.f80783o).inflate(R.layout.a65, null);
        this.f80774f = (LinearLayout) this.f80773e.findViewById(R.id.adz);
        this.f80776h = (int) C9738o.m28708b(this.f80773e.getContext(), 96.0f);
        this.f80777i = (int) C9738o.m28708b(this.f80773e.getContext(), 181.0f);
        this.f80775g = (int) C9738o.m28708b(this.f80773e.getContext(), 218.0f);
        this.f80778j = (int) C9738o.m28708b(this.f80773e.getContext(), 80.0f);
        this.f80779k = (int) C9738o.m28708b(this.f80773e.getContext(), 5.0f);
        this.f80780l = (int) C9738o.m28708b(this.f80773e.getContext(), 5.0f);
        this.f80781m = (int) C9738o.m28708b(this.f80773e.getContext(), 102.6f);
    }
}
