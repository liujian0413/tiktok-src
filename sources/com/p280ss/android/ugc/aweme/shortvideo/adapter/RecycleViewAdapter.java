package com.p280ss.android.ugc.aweme.shortvideo.adapter;

import android.arch.lifecycle.C0043i;
import android.graphics.Bitmap;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p720g.C13644b;
import com.facebook.imagepipeline.p720g.C13645c;
import com.p280ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache;
import com.p280ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache.C41509a;
import com.p280ss.android.ugc.aweme.shortvideo.util.VideoCoverBitmapCache.C41510b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.adapter.RecycleViewAdapter */
public class RecycleViewAdapter extends C1262a<C38429a> {

    /* renamed from: a */
    private int f99870a;

    /* renamed from: b */
    private int f99871b;

    /* renamed from: c */
    private float f99872c;

    /* renamed from: d */
    private int f99873d;

    /* renamed from: e */
    private int f99874e;

    /* renamed from: f */
    private VideoCoverBitmapCache f99875f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.adapter.RecycleViewAdapter$a */
    static class C38429a extends C1293v {

        /* renamed from: a */
        ImageView f99879a;

        /* renamed from: b */
        C13326a<C13645c> f99880b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo96336a() {
            C13326a.m39001c(this.f99880b);
        }

        C38429a(View view) {
            super(view);
            this.f99879a = (ImageView) view.findViewById(R.id.bd1);
            view.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                }
            });
        }
    }

    public int getItemCount() {
        return this.f99874e;
    }

    public /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m122860a(viewGroup, i);
    }

    /* renamed from: a */
    private static C38429a m122860a(ViewGroup viewGroup, int i) {
        return new C38429a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.akj, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(final C38429a aVar, int i) {
        aVar.mo96336a();
        final int min = (int) Math.min(((float) i) * this.f99872c * 1000.0f, (float) this.f99871b);
        ImageView imageView = aVar.f99879a;
        StringBuilder sb = new StringBuilder();
        sb.append(min);
        imageView.setTag(sb.toString());
        LayoutParams layoutParams = (LayoutParams) aVar.f99879a.getLayoutParams();
        layoutParams.height = this.f99870a;
        layoutParams.width = this.f99870a;
        layoutParams.setMargins(0, 0, 0, 0);
        if (i <= 0 || i >= this.f99874e - 1) {
            int i2 = this.f99870a >> 1;
            if (i == this.f99874e - 1 && i == 0) {
                double d = (double) (((float) this.f99871b) % (this.f99872c * 1000.0f));
                Double.isNaN(d);
                double d2 = d * 1.0d;
                double d3 = (double) (this.f99872c * 1000.0f);
                Double.isNaN(d3);
                double d4 = d2 / d3;
                double d5 = (double) this.f99870a;
                Double.isNaN(d5);
                layoutParams.width = (int) (d4 * d5);
                layoutParams.setMargins(i2, 0, this.f99873d, 0);
            } else if (i == 0) {
                layoutParams.width = this.f99870a;
                layoutParams.setMargins(i2, 0, 0, 0);
            } else if (i == this.f99874e - 1) {
                float f = ((float) this.f99871b) % (this.f99872c * 1000.0f);
                if (f == 0.0f) {
                    f = this.f99872c * 1000.0f;
                }
                double d6 = (double) f;
                Double.isNaN(d6);
                double d7 = d6 * 1.0d;
                double d8 = (double) (this.f99872c * 1000.0f);
                Double.isNaN(d8);
                double d9 = d7 / d8;
                double d10 = (double) this.f99870a;
                Double.isNaN(d10);
                layoutParams.width = (int) (d9 * d10);
                if (i < 5) {
                    layoutParams.setMargins(0, 0, i2 + this.f99873d, 0);
                } else {
                    layoutParams.setMargins(0, 0, i2, 0);
                }
            }
        } else {
            layoutParams.width = this.f99870a;
            aVar.f99879a.setPadding(0, 0, 0, 0);
        }
        aVar.f99879a.setLayoutParams(layoutParams);
        aVar.f99879a.setScaleType(ScaleType.CENTER_CROP);
        aVar.f99879a.setImageBitmap(null);
        if (this.f99875f != null) {
            this.f99875f.mo102165a(min, new C41509a() {
                /* renamed from: a */
                public final void mo96335a(C13326a<C13645c> aVar) {
                    Bitmap d = ((C13644b) aVar.mo32609a()).mo33265d();
                    if (d != null && !d.isRecycled() && aVar.f99879a != null) {
                        Object tag = aVar.f99879a.getTag();
                        StringBuilder sb = new StringBuilder();
                        sb.append(min);
                        if (tag.equals(sb.toString())) {
                            aVar.f99880b = aVar;
                            aVar.f99879a.setImageBitmap(d);
                        }
                    }
                }
            });
        }
    }

    public RecycleViewAdapter(C0043i iVar, int i, int i2, float f, int i3, String str, int i4, int i5, int i6) {
        this.f99870a = i;
        this.f99871b = i2;
        this.f99872c = f;
        this.f99873d = i3;
        this.f99874e = i6;
        this.f99875f = C41510b.m132230a(iVar, str, i4, i5, i6);
    }
}
