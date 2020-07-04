package com.p280ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.shortvideo.cover.C38632c;
import com.p280ss.android.ugc.aweme.tools.avdmtview.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.Pair;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView */
public class ChooseVideoCoverView extends FrameLayout implements OnTouchListener {

    /* renamed from: a */
    private int f108260a;

    /* renamed from: b */
    private RecyclerView f108261b;

    /* renamed from: c */
    private VideoCoverFrameView f108262c;

    /* renamed from: d */
    private Context f108263d;

    /* renamed from: e */
    private float f108264e;

    /* renamed from: f */
    private float f108265f;

    /* renamed from: g */
    private View f108266g;

    /* renamed from: h */
    private View f108267h;

    /* renamed from: i */
    private LayoutParams f108268i;

    /* renamed from: j */
    private LayoutParams f108269j;

    /* renamed from: k */
    private int f108270k;

    /* renamed from: l */
    private int f108271l;

    /* renamed from: m */
    private C41661a f108272m;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView$Adapter */
    public static class Adapter extends C1262a<ViewHolder> {

        /* renamed from: a */
        C41706n f108273a;

        /* renamed from: b */
        Pair[] f108274b;

        /* renamed from: c */
        boolean f108275c;

        /* renamed from: d */
        C7321c f108276d;

        /* renamed from: e */
        private int f108277e;

        /* renamed from: f */
        private int f108278f;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView$Adapter$ViewHolder */
        public static class ViewHolder extends C1293v {

            /* renamed from: a */
            public ImageView f108280a;

            public ViewHolder(View view) {
                super(view);
                this.f108280a = (ImageView) view.findViewById(R.id.bd1);
            }
        }

        /* renamed from: a */
        public final void mo102330a() {
            this.f108276d.dispose();
        }

        public int getItemCount() {
            return this.f108273a.f108561a;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ImageView imageView = (ImageView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.akj, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = this.f108278f;
            layoutParams.width = this.f108277e;
            imageView.setLayoutParams(layoutParams);
            return new ViewHolder(imageView);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            if (this.f108274b[i] == null) {
                Pair pair = this.f108274b[0];
                if (pair != null) {
                    viewHolder.f108280a.setImageBitmap((Bitmap) pair.getSecond());
                } else {
                    viewHolder.f108280a.setImageBitmap(null);
                }
            } else {
                viewHolder.f108280a.setImageBitmap((Bitmap) this.f108274b[i].getSecond());
            }
            if (i != 0) {
                getItemCount();
            }
            viewHolder.f108280a.setPadding(0, 0, 0, 0);
        }

        public Adapter(C38632c cVar, int i, int i2) {
            this(new C41706n(cVar, i, i2, cVar.mo88418a()), i, i2);
        }

        public Adapter(C41706n nVar, int i, int i2) {
            this.f108275c = true;
            this.f108273a = nVar;
            this.f108277e = i;
            this.f108278f = i2;
            this.f108274b = new Pair[nVar.f108561a];
            this.f108276d = this.f108273a.mo102481a().mo19325f((C7326g<? super T>) new C7326g<Pair<Integer, Bitmap>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(Pair<Integer, Bitmap> pair) throws Exception {
                    Adapter.this.f108274b[((Integer) pair.getFirst()).intValue()] = pair;
                    if (Adapter.this.f108275c) {
                        Adapter.this.f108275c = false;
                        Adapter.this.notifyDataSetChanged();
                        return;
                    }
                    Adapter.this.notifyItemChanged(((Integer) pair.getFirst()).intValue());
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView$a */
    public interface C41661a {
        /* renamed from: a */
        void mo88410a(float f);

        /* renamed from: b */
        void mo88412b(float f);

        /* renamed from: c */
        void mo88413c(float f);
    }

    public int getCoverSize() {
        return this.f108260a;
    }

    public int getFrameHeight() {
        return this.f108271l;
    }

    public int getFrameWidth() {
        return this.f108270k;
    }

    public C1262a getAdapter() {
        return this.f108261b.getAdapter();
    }

    /* renamed from: a */
    public final void mo102314a() {
        if (this.f108262c != null) {
            this.f108262c.setImageDrawable(new ColorDrawable(0));
        }
    }

    public float getOneThumbWidth() {
        return (float) (getMeasuredWidth() / this.f108260a);
    }

    public float getOneThumbHeight() {
        return ((float) this.f108262c.getHeight()) - (m132598g(1.0f) * 2.0f);
    }

    /* renamed from: b */
    private void m132592b() {
        this.f108261b = new RecyclerView(this.f108263d);
        this.f108261b.setTag("tag_RecyclerView");
        this.f108261b.setOnTouchListener(this);
        addView(this.f108261b, new LayoutParams(-1, -1));
        this.f108262c = new VideoCoverFrameView(this.f108263d);
        this.f108262c.setScaleType(ScaleType.CENTER_CROP);
        this.f108262c.setColor(this.f108263d.getResources().getColor(R.color.pe));
        this.f108262c.setTag("tag_VideoCoverFrameView");
        this.f108262c.setOnTouchListener(this);
        addView(this.f108262c);
        this.f108266g = new View(this.f108263d);
        this.f108268i = new LayoutParams(-1, -1);
        this.f108266g.setBackgroundResource(R.drawable.ig);
        this.f108267h = new View(this.f108263d);
        this.f108269j = new LayoutParams(-1, -1);
        this.f108267h.setBackgroundResource(R.drawable.ig);
    }

    public void setCoverSize(int i) {
        this.f108260a = i;
    }

    public void setOnScrollListener(C41661a aVar) {
        this.f108272m = aVar;
    }

    public ChooseVideoCoverView(Context context) {
        this(context, null);
    }

    public void setAdapter(C1262a aVar) {
        this.f108261b.setAdapter(aVar);
    }

    public void setLayoutManager(C1273i iVar) {
        this.f108261b.setLayoutManager(iVar);
    }

    /* renamed from: b */
    private float m132591b(float f) {
        return f / ((float) (this.f108262c.getWidth() * this.f108260a));
    }

    /* renamed from: c */
    private void m132594c(float f) {
        if (this.f108272m != null) {
            this.f108272m.mo88410a(m132591b(f));
        }
    }

    /* renamed from: d */
    private void m132595d(float f) {
        if (this.f108272m != null) {
            this.f108272m.mo88413c(m132591b(f));
        }
    }

    /* renamed from: e */
    private void m132596e(float f) {
        if (this.f108272m != null) {
            this.f108272m.mo88412b(m132591b(f));
        }
    }

    /* renamed from: g */
    private float m132598g(float f) {
        return C9738o.m28708b(getContext(), 1.0f);
    }

    /* renamed from: a */
    public final void mo102316a(boolean z) {
        if (this.f108262c != null) {
            this.f108262c.setOnTouchListener(null);
            this.f108262c.setVisibility(8);
        }
    }

    /* renamed from: b */
    private void m132593b(MotionEvent motionEvent) {
        float a = m132590a(motionEvent);
        this.f108262c.animate().x(a).y(this.f108262c.getY()).setDuration(0).start();
        m132597f(a);
        m132596e(a);
    }

    /* renamed from: f */
    private void m132597f(float f) {
        this.f108268i.width = (int) (f - 0.0f);
        this.f108266g.setLayoutParams(this.f108268i);
        this.f108269j.width = (int) ((((float) getMeasuredWidth()) - f) + ((float) this.f108262c.getWidth()));
        this.f108267h.setX(f + ((float) this.f108262c.getWidth()));
        this.f108267h.setLayoutParams(this.f108269j);
    }

    /* renamed from: a */
    public final void mo102315a(float f) {
        float width = ((float) (this.f108262c.getWidth() * (this.f108260a - 1))) * 0.0f;
        this.f108262c.animate().x(width).y(this.f108262c.getY()).setDuration(0).start();
        m132597f(width);
    }

    public void setVideoCoverFrameView(Bitmap bitmap) {
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int oneThumbWidth = (int) getOneThumbWidth();
            int oneThumbHeight = (int) getOneThumbHeight();
            int i = height * oneThumbWidth;
            int i2 = width * oneThumbHeight;
            if (i > i2) {
                oneThumbWidth = i2 / height;
            } else {
                oneThumbHeight = i / width;
            }
            this.f108262c.setImageBitmap(Bitmap.createScaledBitmap(bitmap, oneThumbWidth, oneThumbHeight, true));
        }
    }

    /* renamed from: a */
    private float m132590a(MotionEvent motionEvent) {
        this.f108264e = (float) ((ViewGroup) getParent()).getPaddingLeft();
        this.f108265f = (float) getPaddingLeft();
        float rawX = (this.f108265f + (motionEvent.getRawX() - this.f108264e)) - ((float) (this.f108262c.getWidth() / 2));
        if (rawX > ((float) (this.f108262c.getWidth() * (this.f108260a - 1)))) {
            rawX = (float) (this.f108262c.getWidth() * (this.f108260a - 1));
        }
        if (rawX < 0.0f) {
            return 0.0f;
        }
        return rawX;
    }

    public ChooseVideoCoverView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f108262c.mo102421a(getMeasuredWidth() / this.f108260a, getMeasuredHeight());
        m132597f(this.f108262c.getX());
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        String str = (String) view.getTag();
        if (str == null) {
            return false;
        }
        if (str.equals("tag_VideoCoverFrameView")) {
            switch (motionEvent.getAction()) {
                case 0:
                    m132594c(m132590a(motionEvent));
                    break;
                case 1:
                    m132595d(m132590a(motionEvent));
                    break;
                case 2:
                    m132593b(motionEvent);
                    break;
            }
            return true;
        } else if (!str.equals("tag_RecyclerView")) {
            return super.onTouchEvent(motionEvent);
        } else {
            switch (motionEvent.getAction()) {
                case 0:
                    m132594c(m132590a(motionEvent));
                    break;
                case 1:
                    m132593b(motionEvent);
                    m132595d(m132590a(motionEvent));
                    break;
            }
            return true;
        }
    }

    public ChooseVideoCoverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f108260a = 7;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.VideoEditView);
            this.f108270k = Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
            this.f108271l = Math.round(obtainStyledAttributes.getDimension(4, 0.0f));
        }
        this.f108263d = context;
        m132592b();
    }
}
