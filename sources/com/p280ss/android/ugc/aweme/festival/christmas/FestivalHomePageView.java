package com.p280ss.android.ugc.aweme.festival.christmas;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.bizactivity.AnimateDraweeView;
import com.p280ss.android.ugc.aweme.festival.p311a.C29125d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.festival.christmas.FestivalHomePageView */
public class FestivalHomePageView extends FrameLayout {

    /* renamed from: a */
    private ImageView f76879a;

    /* renamed from: b */
    private View f76880b;

    /* renamed from: c */
    private AnimateDraweeView f76881c;

    /* renamed from: d */
    private C29131a f76882d;

    /* renamed from: com.ss.android.ugc.aweme.festival.christmas.FestivalHomePageView$a */
    public interface C29131a {
        /* renamed from: a */
        void mo74600a();
    }

    public AnimateDraweeView getHomePageIconView() {
        return this.f76881c;
    }

    /* renamed from: b */
    public final void mo74596b() {
        setVisibility(8);
    }

    /* renamed from: a */
    public final void mo74593a() {
        if (this.f76880b != null) {
            setVisibility(0);
            this.f76880b.setVisibility(0);
        }
    }

    /* renamed from: c */
    public final void mo74597c() {
        Drawable b = C29125d.m95522b();
        if (b != null) {
            this.f76879a.setImageDrawable(b);
            this.f76879a.setVisibility(0);
            this.f76879a.setOnClickListener(new C29136c(this));
        }
    }

    public void setCloseClickListener(C29131a aVar) {
        this.f76882d = aVar;
    }

    public FestivalHomePageView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo74594a(View view) {
        if (this.f76882d != null) {
            this.f76882d.mo74600a();
        }
    }

    /* renamed from: a */
    private void m95551a(Context context) {
        this.f76880b = LayoutInflater.from(context).inflate(R.layout.acb, this, false);
        this.f76879a = (ImageView) this.f76880b.findViewById(R.id.b7g);
        this.f76881c = (AnimateDraweeView) this.f76880b.findViewById(R.id.b_4);
        addView(this.f76880b);
    }

    /* renamed from: a */
    public final void mo74595a(File file) {
        if (file != null && file.exists() && file.isFile()) {
            UrlModel urlModel = new UrlModel();
            ArrayList arrayList = new ArrayList();
            arrayList.add(Uri.fromFile(file).toString());
            urlModel.setUrlList(arrayList);
            this.f76881c.mo61333a(urlModel, true, Config.ARGB_8888);
        }
    }

    public FestivalHomePageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FestivalHomePageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m95551a(context);
    }
}
