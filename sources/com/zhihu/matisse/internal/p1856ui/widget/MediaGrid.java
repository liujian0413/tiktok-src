package com.zhihu.matisse.internal.p1856ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.zhihu.matisse.internal.entity.Item;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.zhihu.matisse.internal.ui.widget.MediaGrid */
public class MediaGrid extends SquareFrameLayout implements OnClickListener {

    /* renamed from: a */
    public C47363b f121549a;

    /* renamed from: b */
    private SimpleDraweeView f121550b;

    /* renamed from: c */
    private CheckView f121551c;

    /* renamed from: d */
    private ImageView f121552d;

    /* renamed from: e */
    private TextView f121553e;

    /* renamed from: f */
    private Item f121554f;

    /* renamed from: g */
    private C47362a f121555g;

    /* renamed from: com.zhihu.matisse.internal.ui.widget.MediaGrid$a */
    public interface C47362a {
        /* renamed from: a */
        void mo119413a(ImageView imageView, Item item, C1293v vVar);

        /* renamed from: a */
        void mo119414a(CheckView checkView, Item item, C1293v vVar);
    }

    /* renamed from: com.zhihu.matisse.internal.ui.widget.MediaGrid$b */
    public static class C47363b {

        /* renamed from: a */
        int f121556a;

        /* renamed from: b */
        Drawable f121557b;

        /* renamed from: c */
        boolean f121558c;

        /* renamed from: d */
        C1293v f121559d;

        public C47363b(int i, Drawable drawable, boolean z, C1293v vVar) {
            this.f121556a = i;
            this.f121557b = drawable;
            this.f121558c = z;
            this.f121559d = vVar;
        }
    }

    public Item getMedia() {
        return this.f121554f;
    }

    /* renamed from: b */
    private void m147910b() {
        this.f121551c.setCountable(this.f121549a.f121558c);
    }

    /* renamed from: a */
    private void m147908a() {
        int i;
        ImageView imageView = this.f121552d;
        if (this.f121554f.mo119355c()) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: d */
    private void m147912d() {
        if (this.f121554f.mo119356d()) {
            this.f121553e.setVisibility(0);
            this.f121553e.setText(DateUtils.formatElapsedTime(this.f121554f.f121438e / 1000));
            return;
        }
        this.f121553e.setVisibility(8);
    }

    /* renamed from: c */
    private void m147911c() {
        ImageRequest b = ImageRequestBuilder.m40865a(this.f121554f.f121436c).mo33468a(new C13596d(this.f121549a.f121556a, this.f121549a.f121556a)).mo33476b();
        if (this.f121554f.mo119355c()) {
            this.f121550b.setController(((C13382e) ((C13382e) ((C13382e) C13380c.m39166a().mo32729b(this.f121550b.getController())).mo32748b(b)).mo32751c(true)).mo32730f());
            return;
        }
        this.f121550b.setImageRequest(b);
    }

    public void setOnMediaGridClickListener(C47362a aVar) {
        this.f121555g = aVar;
    }

    public MediaGrid(Context context) {
        super(context);
        m147909a(context);
    }

    public void setCheckEnabled(boolean z) {
        this.f121551c.setEnabled(z);
    }

    public void setChecked(boolean z) {
        this.f121551c.setChecked(z);
    }

    public void setCheckedNum(int i) {
        this.f121551c.setCheckedNum(i);
    }

    /* renamed from: a */
    public final void mo119437a(Item item) {
        this.f121554f = item;
        m147908a();
        m147910b();
        m147911c();
        m147912d();
    }

    public void onClick(View view) {
        if (this.f121555g != null) {
            if (view == this.f121550b) {
                this.f121555g.mo119413a((ImageView) this.f121550b, this.f121554f, this.f121549a.f121559d);
            } else if (view == this.f121551c) {
                this.f121555g.mo119414a(this.f121551c, this.f121554f, this.f121549a.f121559d);
            }
        }
    }

    /* renamed from: a */
    private void m147909a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.adb, this, true);
        this.f121550b = (SimpleDraweeView) findViewById(R.id.bxm);
        this.f121551c = (CheckView) findViewById(R.id.vg);
        this.f121552d = (ImageView) findViewById(R.id.aqe);
        this.f121553e = (TextView) findViewById(R.id.eaj);
        this.f121550b.setOnClickListener(this);
        this.f121551c.setOnClickListener(this);
    }

    public MediaGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m147909a(context);
    }
}
