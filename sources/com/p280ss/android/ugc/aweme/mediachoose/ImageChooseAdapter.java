package com.p280ss.android.ugc.aweme.mediachoose;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.p280ss.android.ugc.aweme.mediachoose.p1390a.C33153d;
import com.p280ss.android.ugc.aweme.mediachoose.p1390a.C33153d.C33154a;
import com.p280ss.android.ugc.aweme.music.mediachoose.C33794a;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.utils.C43137g;
import com.p280ss.android.ugc.aweme.utils.MediaType;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapter */
public class ImageChooseAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    public int f86170a = 12;

    /* renamed from: b */
    public final List<MediaModel> f86171b = new ArrayList();

    /* renamed from: c */
    public List<Integer> f86172c;

    /* renamed from: d */
    public PhotoMovieContext f86173d;

    /* renamed from: e */
    public boolean f86174e;

    /* renamed from: f */
    public boolean f86175f;

    /* renamed from: g */
    public C33132a f86176g;

    /* renamed from: h */
    public C33794a f86177h;

    /* renamed from: i */
    public final C33153d f86178i = C33153d.m106972a();

    /* renamed from: j */
    private String f86179j;

    /* renamed from: k */
    private final Context f86180k;

    /* renamed from: l */
    private Map<Long, Float> f86181l = new HashMap();

    /* renamed from: m */
    private List<Integer> f86182m;

    /* renamed from: n */
    private int f86183n;

    /* renamed from: o */
    private List<String> f86184o = new ArrayList();

    /* renamed from: p */
    private double f86185p;

    /* renamed from: q */
    private C33154a f86186q = new C33154a() {
        /* renamed from: a */
        public final void mo84854a(int i) {
            if (!ImageChooseAdapter.this.f86175f) {
                ImageChooseAdapter.this.f86171b.clear();
                ImageChooseAdapter.this.f86171b.addAll(ImageChooseAdapter.this.f86178i.mo84898a(i));
                ImageChooseAdapter.this.mo84848a(ImageChooseAdapter.this.f86171b.size());
                ImageChooseAdapter.this.notifyDataSetChanged();
            }
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapter$a */
    public interface C33132a {
        /* renamed from: a */
        void mo84859a(View view, MediaModel mediaModel);
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapter$b */
    static class C33133b extends C1293v {

        /* renamed from: a */
        RemoteImageView f86200a;

        /* renamed from: b */
        TextView f86201b;

        /* renamed from: c */
        FrameLayout f86202c;

        /* renamed from: d */
        View f86203d;

        /* renamed from: e */
        String f86204e;

        /* renamed from: a */
        public final void mo84860a() {
            this.f86201b.setText("");
            this.f86201b.setBackgroundResource(R.drawable.ne);
        }

        C33133b(View view) {
            super(view);
        }

        /* renamed from: a */
        public final void mo84861a(int i) {
            this.f86201b.setText(String.valueOf(i + 1));
            this.f86201b.setBackgroundResource(R.drawable.nf);
        }
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* renamed from: a */
    public final void mo84850a(Collection<? extends MediaModel> collection) {
        this.f86171b.clear();
        this.f86171b.addAll(collection);
        this.f86175f = !C6311g.m19573a(this.f86171b);
        mo84848a(this.f86171b.size());
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo84849a(final C33133b bVar, final int i, MediaModel mediaModel) {
        int indexOf = this.f86172c.indexOf(Integer.valueOf(i));
        if (indexOf >= 0) {
            this.f86182m.set(i, Integer.valueOf(-1));
            bVar.mo84860a();
            bVar.f86203d.animate().alpha(0.0f).setDuration(300).withEndAction(new Runnable() {
                public final void run() {
                    bVar.f86203d.setVisibility(4);
                    bVar.f86203d.setAlpha(1.0f);
                    ImageChooseAdapter.this.notifyItemChanged(i);
                }
            }).start();
            bVar.f86200a.animate().scaleY(1.0f).scaleX(1.0f).setDuration(300).start();
            if (this.f86173d != null) {
                this.f86173d.mImageList.remove(indexOf);
            }
            this.f86172c.remove(Integer.valueOf(i));
            if (i < this.f86184o.size()) {
                this.f86184o.remove(i);
            }
            int size = this.f86172c.size();
            while (indexOf < size) {
                this.f86182m.set(((Integer) this.f86172c.get(indexOf)).intValue(), Integer.valueOf(indexOf));
                if (size != this.f86170a - 1) {
                    notifyItemChanged(((Integer) this.f86172c.get(indexOf)).intValue());
                }
                indexOf++;
            }
            if (size == this.f86170a - 1) {
                notifyDataSetChanged();
            }
            if (this.f86177h != null) {
                mo84853d();
                this.f86177h.mo84845a(this.f86173d);
            }
        } else if (this.f86172c.size() >= this.f86170a) {
            C10761a.m31403c(this.f86180k, this.f86179j).mo25750a();
        } else if (m106898a(mediaModel)) {
            if (this.f86173d == null) {
                this.f86173d = new PhotoMovieContext();
                this.f86173d.mImageList = new ArrayList();
            }
            this.f86184o.add(mediaModel.mo86200b());
            this.f86173d.mImageList.add(mediaModel.f88156b);
            this.f86172c.add(Integer.valueOf(i));
            bVar.mo84861a(this.f86172c.size() - 1);
            final int size2 = this.f86172c.size();
            this.f86182m.set(i, Integer.valueOf(size2 - 1));
            bVar.f86200a.animate().scaleY(1.1f).scaleX(1.1f).setDuration(300).withEndAction(new Runnable() {
                public final void run() {
                    if (size2 == ImageChooseAdapter.this.f86170a) {
                        ImageChooseAdapter.this.notifyDataSetChanged();
                    } else {
                        ImageChooseAdapter.this.notifyItemChanged(i);
                    }
                    if (ImageChooseAdapter.this.f86177h != null) {
                        ImageChooseAdapter.this.mo84853d();
                        ImageChooseAdapter.this.f86177h.mo84845a(ImageChooseAdapter.this.f86173d);
                    }
                }
            }).start();
            bVar.f86203d.setAlpha(0.0f);
            bVar.f86203d.setVisibility(0);
            bVar.f86203d.animate().alpha(1.0f).setDuration(300).start();
        }
    }

    /* renamed from: b */
    public final void mo84851b() {
        this.f86178i.mo84902a(this.f86186q);
    }

    /* renamed from: c */
    public final void mo84852c() {
        this.f86178i.mo84907b(this.f86186q);
    }

    public int getItemCount() {
        return this.f86171b.size();
    }

    /* renamed from: d */
    public final void mo84853d() {
        if (this.f86173d != null && !C6307b.m19566a((Collection<T>) this.f86184o)) {
            StringBuilder sb = new StringBuilder();
            for (String str : this.f86184o) {
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    sb.append(";");
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                this.f86173d.poiData = sb2.substring(0, sb2.length() - 1);
            }
        }
    }

    /* renamed from: a */
    public final void mo84847a() {
        this.f86174e = !this.f86174e;
        mo84848a(this.f86171b.size());
        notifyDataSetChanged();
        if (this.f86173d != null) {
            this.f86173d.mImageList.clear();
            this.f86173d.poiData = null;
            this.f86177h.mo84845a(this.f86173d);
        }
    }

    public void onViewRecycled(C1293v vVar) {
        super.onViewRecycled(vVar);
        m106896a((C33133b) vVar);
    }

    /* renamed from: a */
    private static void m106896a(C33133b bVar) {
        Object tag = bVar.f86200a.getTag(R.id.bcz);
        if (tag instanceof Bitmap) {
            Bitmap bitmap = (Bitmap) tag;
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            bVar.f86200a.setTag(R.id.bcz, null);
        }
    }

    /* renamed from: a */
    private void m106895a(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width != this.f86183n) {
            int i = layoutParams.height;
            double d = (double) this.f86183n;
            double d2 = this.f86185p;
            Double.isNaN(d);
            if (i != ((int) (d * d2))) {
                layoutParams.width = this.f86183n;
                double d3 = (double) this.f86183n;
                double d4 = this.f86185p;
                Double.isNaN(d3);
                layoutParams.height = (int) (d3 * d4);
            }
        }
    }

    /* renamed from: a */
    public static boolean m106898a(MediaModel mediaModel) {
        if (((float) mediaModel.f88163i) > ((float) mediaModel.f88164j) * 2.2f || ((float) mediaModel.f88164j) > ((float) mediaModel.f88163i) * 2.2f) {
            C10761a.m31409e((Context) C29960a.m98230a(), (int) R.string.dsl).mo25750a();
            return false;
        }
        C43137g.m136830a().mo104766a(mediaModel.f88156b, MediaType.IMAGE);
        return true;
    }

    /* renamed from: a */
    public final void mo84848a(int i) {
        if (this.f86172c == null) {
            this.f86172c = new ArrayList();
        } else {
            this.f86172c.clear();
        }
        this.f86184o.clear();
        if (this.f86182m == null) {
            this.f86182m = new ArrayList();
        } else {
            this.f86182m.clear();
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.f86182m.add(Integer.valueOf(-1));
        }
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        m106897a((C33133b) vVar, i);
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f86180k).inflate(R.layout.sf, viewGroup, false);
        C33133b bVar = new C33133b(inflate);
        bVar.f86200a = (RemoteImageView) inflate.findViewById(R.id.bxo);
        bVar.f86201b = (TextView) inflate.findViewById(R.id.ayi);
        bVar.f86202c = (FrameLayout) inflate.findViewById(R.id.amg);
        bVar.f86203d = inflate.findViewById(R.id.d4f);
        return bVar;
    }

    /* renamed from: a */
    private void m106894a(int i, C33133b bVar) {
        int i2;
        float f;
        FrameLayout frameLayout = bVar.f86202c;
        if (this.f86174e) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        frameLayout.setVisibility(i2);
        float f2 = 1.0f;
        if (i >= 0) {
            bVar.mo84861a(i);
            bVar.f86203d.setVisibility(0);
            f = 1.0f;
            f2 = 1.1f;
        } else {
            bVar.mo84860a();
            bVar.f86203d.setVisibility(4);
            if (this.f86172c.size() >= this.f86170a) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
        }
        if (bVar.f86200a.getAlpha() != f) {
            bVar.f86200a.setAlpha(f);
        }
        if (bVar.f86200a.getScaleX() != f2) {
            bVar.f86200a.setScaleX(f2);
            bVar.f86200a.setScaleY(f2);
        }
    }

    /* renamed from: a */
    private void m106897a(final C33133b bVar, int i) {
        m106895a((View) bVar.f86200a);
        m106895a(bVar.f86203d);
        final MediaModel mediaModel = (MediaModel) this.f86171b.get(i);
        final int intValue = ((Integer) this.f86182m.get(i)).intValue();
        m106894a(intValue, bVar);
        StringBuilder sb = new StringBuilder("file://");
        sb.append(mediaModel.f88156b);
        bVar.f86204e = sb.toString();
        C23323e.m76525b(bVar.f86200a, bVar.f86204e, this.f86183n, this.f86183n);
        bVar.itemView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                boolean z;
                ClickInstrumentation.onClick(view);
                if (intValue >= 0 || ImageChooseAdapter.this.f86172c.size() < ImageChooseAdapter.this.f86170a) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    ImageChooseAdapter.this.f86176g.mo84859a(view, mediaModel);
                }
            }
        });
        bVar.f86202c.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C33175g.m107023a(true, false);
                ImageChooseAdapter.this.mo84849a(bVar, bVar.getAdapterPosition(), mediaModel);
            }
        });
    }

    public ImageChooseAdapter(Context context, int i, double d, float f, int i2) {
        this.f86180k = context;
        this.f86185p = 1.0d;
        context.getResources().getDimensionPixelOffset(R.dimen.im);
        this.f86183n = ((C9738o.m28691a(context) - ((i - 1) * ((int) C9738o.m28708b(this.f86180k, 1.5f)))) + 0) / i;
        this.f86174e = true;
        this.f86179j = this.f86180k.getString(R.string.a3h);
    }
}
