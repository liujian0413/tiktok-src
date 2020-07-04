package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.squareup.picasso.C18824e;
import com.squareup.picasso.Picasso;
import com.twitter.sdk.android.core.C46827f;
import com.twitter.sdk.android.core.internal.C46937t;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import com.twitter.sdk.android.core.models.C46947d;
import com.twitter.sdk.android.core.models.C46952i;
import com.twitter.sdk.android.core.models.C46959o;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.tweetui.C47017ai;
import com.twitter.sdk.android.tweetui.C47029aq;
import com.twitter.sdk.android.tweetui.GalleryActivity;
import com.twitter.sdk.android.tweetui.GalleryActivity.GalleryItem;
import com.twitter.sdk.android.tweetui.PlayerActivity;
import com.twitter.sdk.android.tweetui.PlayerActivity.PlayerItem;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class TweetMediaView extends ViewGroup implements OnClickListener {

    /* renamed from: a */
    final float[] f120713a;

    /* renamed from: b */
    int f120714b;

    /* renamed from: c */
    int f120715c;

    /* renamed from: d */
    final C47045a f120716d;

    /* renamed from: e */
    boolean f120717e;

    /* renamed from: f */
    C47017ai f120718f;

    /* renamed from: g */
    C46959o f120719g;

    /* renamed from: h */
    private final C47073g[] f120720h;

    /* renamed from: i */
    private List<MediaEntity> f120721i;

    /* renamed from: j */
    private final Path f120722j;

    /* renamed from: k */
    private final RectF f120723k;

    /* renamed from: l */
    private final int f120724l;

    /* renamed from: m */
    private int f120725m;

    /* renamed from: com.twitter.sdk.android.tweetui.internal.TweetMediaView$a */
    static class C47045a {
        C47045a() {
        }

        /* renamed from: a */
        static Picasso m147116a() {
            return C47029aq.m147040a().f120677g;
        }
    }

    /* renamed from: com.twitter.sdk.android.tweetui.internal.TweetMediaView$b */
    static class C47046b implements C18824e {

        /* renamed from: a */
        final WeakReference<ImageView> f120726a;

        /* renamed from: b */
        public final void mo50024b() {
        }

        /* renamed from: a */
        public final void mo50023a() {
            ImageView imageView = (ImageView) this.f120726a.get();
            if (imageView != null) {
                imageView.setBackgroundResource(17170445);
            }
        }

        C47046b(ImageView imageView) {
            this.f120726a = new WeakReference<>(imageView);
        }
    }

    /* renamed from: com.twitter.sdk.android.tweetui.internal.TweetMediaView$c */
    static class C47047c {

        /* renamed from: a */
        static final C47047c f120727a = new C47047c();

        /* renamed from: b */
        final int f120728b;

        /* renamed from: c */
        final int f120729c;

        private C47047c() {
            this(0, 0);
        }

        private C47047c(int i, int i2) {
            this.f120728b = i;
            this.f120729c = i2;
        }

        /* renamed from: a */
        static C47047c m147119a(int i, int i2) {
            int max = Math.max(i, 0);
            int max2 = Math.max(i2, 0);
            if (max == 0 && max2 == 0) {
                return f120727a;
            }
            return new C47047c(max, max2);
        }
    }

    /* renamed from: a */
    public final void mo118272a(int i, int i2, int i3, int i4) {
        float f = (float) i;
        this.f120713a[0] = f;
        this.f120713a[1] = f;
        float f2 = (float) i2;
        this.f120713a[2] = f2;
        this.f120713a[3] = f2;
        float f3 = (float) i3;
        this.f120713a[4] = f3;
        this.f120713a[5] = f3;
        float f4 = (float) i4;
        this.f120713a[6] = f4;
        this.f120713a[7] = f4;
        requestLayout();
    }

    /* renamed from: a */
    private void m147107a(C46959o oVar) {
        C46947d dVar = oVar.f120426H;
        Intent intent = new Intent(getContext(), PlayerActivity.class);
        PlayerItem playerItem = new PlayerItem(C46937t.m146808c(dVar), true, false, null, null);
        intent.putExtra("PLAYER_ITEM", playerItem);
        intent.putExtra("SCRIBE_ITEM", ScribeItem.fromTweetCard(oVar.f120435i, dVar));
        C46827f.m146486b(getContext(), intent);
    }

    /* renamed from: a */
    public final void mo118273a(C46959o oVar, List<MediaEntity> list) {
        if (oVar != null && list != null && !list.isEmpty() && !list.equals(this.f120721i)) {
            this.f120719g = oVar;
            this.f120721i = list;
            m147112b();
            m147109a(list);
            this.f120717e = C47081l.m147194a((MediaEntity) list.get(0));
            requestLayout();
        }
    }

    /* renamed from: a */
    private void m147109a(List<MediaEntity> list) {
        this.f120725m = Math.min(4, list.size());
        for (int i = 0; i < this.f120725m; i++) {
            C47073g b = m147110b(i);
            MediaEntity mediaEntity = (MediaEntity) list.get(i);
            m147104a((ImageView) b, mediaEntity.altText);
            m147113b(b, m147111b(mediaEntity));
            m147108a(b, C47081l.m147196b(mediaEntity));
        }
    }

    /* renamed from: a */
    private void m147106a(C46947d dVar) {
        this.f120725m = 1;
        C47073g b = m147110b(0);
        C46952i d = C46937t.m146809d(dVar);
        m147104a((ImageView) b, d.f120392d);
        m147113b(b, d.f120391c);
        m147108a(b, true);
    }

    /* renamed from: a */
    private void m147108a(C47073g gVar, boolean z) {
        if (z) {
            gVar.setOverlayDrawable(getContext().getResources().getDrawable(R.drawable.clf));
        } else {
            gVar.setOverlayDrawable(null);
        }
    }

    /* renamed from: b */
    private void m147112b() {
        for (int i = 0; i < this.f120725m; i++) {
            C47073g gVar = this.f120720h[i];
            if (gVar != null) {
                gVar.setVisibility(8);
            }
        }
        this.f120725m = 0;
    }

    /* renamed from: a */
    private void m147100a() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = (measuredWidth - this.f120724l) / 2;
        int i2 = (measuredHeight - this.f120724l) / 2;
        int i3 = i + this.f120724l;
        switch (this.f120725m) {
            case 1:
                m147103a(0, 0, 0, measuredWidth, measuredHeight);
                return;
            case 2:
                int i4 = measuredHeight;
                m147103a(0, 0, 0, i, i4);
                m147103a(1, i + this.f120724l, 0, measuredWidth, i4);
                return;
            case 3:
                m147103a(0, 0, 0, i, measuredHeight);
                int i5 = i3;
                int i6 = measuredWidth;
                m147103a(1, i5, 0, i6, i2);
                m147103a(2, i5, i2 + this.f120724l, i6, measuredHeight);
                return;
            case 4:
                int i7 = i;
                m147103a(0, 0, 0, i7, i2);
                m147103a(2, 0, i2 + this.f120724l, i7, measuredHeight);
                int i8 = i3;
                int i9 = measuredWidth;
                m147103a(1, i8, 0, i9, i2);
                m147103a(3, i8, i2 + this.f120724l, i9, measuredHeight);
                break;
        }
    }

    public void setMediaBgColor(int i) {
        this.f120714b = i;
    }

    public void setPhotoErrorResId(int i) {
        this.f120715c = i;
    }

    public void setTweetMediaClickListener(C47017ai aiVar) {
        this.f120718f = aiVar;
    }

    public TweetMediaView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private String m147111b(MediaEntity mediaEntity) {
        if (this.f120725m <= 1) {
            return mediaEntity.mediaUrlHttps;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mediaEntity.mediaUrlHttps);
        sb.append(":small");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (!this.f120717e || VERSION.SDK_INT < 18) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.f120722j);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    private void m147101a(int i) {
        Intent intent = new Intent(getContext(), GalleryActivity.class);
        intent.putExtra("GALLERY_ITEM", new GalleryItem(this.f120719g.f120435i, i, this.f120721i));
        C46827f.m146486b(getContext(), intent);
    }

    public void setVineCard(C46959o oVar) {
        if (oVar != null && oVar.f120426H != null && C46937t.m146806a(oVar.f120426H)) {
            this.f120719g = oVar;
            this.f120721i = Collections.emptyList();
            m147112b();
            m147106a(oVar.f120426H);
            this.f120717e = false;
            requestLayout();
        }
    }

    /* renamed from: b */
    private C47073g m147110b(int i) {
        C47073g gVar = this.f120720h[i];
        if (gVar == null) {
            gVar = new C47073g(getContext());
            gVar.setLayoutParams(generateDefaultLayoutParams());
            gVar.setOnClickListener(this);
            this.f120720h[i] = gVar;
            addView(gVar, i);
        } else {
            m147102a(i, 0, 0);
            m147103a(i, 0, 0, 0, 0);
        }
        gVar.setVisibility(0);
        gVar.setBackgroundColor(this.f120714b);
        gVar.setTag(R.id.e5n, Integer.valueOf(i));
        return gVar;
    }

    public void onClick(View view) {
        Integer num = (Integer) view.getTag(R.id.e5n);
        if (this.f120718f != null) {
            if (!this.f120721i.isEmpty()) {
                this.f120721i.get(num.intValue());
            }
            return;
        }
        if (!this.f120721i.isEmpty()) {
            MediaEntity mediaEntity = (MediaEntity) this.f120721i.get(num.intValue());
            if (C47081l.m147196b(mediaEntity)) {
                m147105a(mediaEntity);
            } else {
                if (C47081l.m147194a(mediaEntity)) {
                    m147101a(num.intValue());
                }
            }
        } else {
            m147107a(this.f120719g);
        }
    }

    /* renamed from: a */
    private void m147105a(MediaEntity mediaEntity) {
        if (C47081l.m147199c(mediaEntity) != null) {
            Intent intent = new Intent(getContext(), PlayerActivity.class);
            PlayerItem playerItem = new PlayerItem(C47081l.m147199c(mediaEntity).url, C47081l.m147200d(mediaEntity), C47081l.m147203e(mediaEntity), null, null);
            intent.putExtra("PLAYER_ITEM", playerItem);
            C46827f.m146486b(getContext(), intent);
        }
    }

    public TweetMediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new C47045a());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C47047c cVar;
        if (this.f120725m > 0) {
            cVar = m147099a(i, i2);
        } else {
            cVar = C47047c.f120727a;
        }
        setMeasuredDimension(cVar.f120728b, cVar.f120729c);
    }

    /* renamed from: a */
    private C47047c m147099a(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int i3 = (size - this.f120724l) / 2;
        int i4 = (size2 - this.f120724l) / 2;
        switch (this.f120725m) {
            case 1:
                m147102a(0, size, size2);
                break;
            case 2:
                m147102a(0, i3, size2);
                m147102a(1, i3, size2);
                break;
            case 3:
                m147102a(0, i3, size2);
                m147102a(1, i3, i4);
                m147102a(2, i3, i4);
                break;
            case 4:
                m147102a(0, i3, i4);
                m147102a(1, i3, i4);
                m147102a(2, i3, i4);
                m147102a(3, i3, i4);
                break;
        }
        return C47047c.m147119a(size, size2);
    }

    /* renamed from: b */
    private void m147113b(ImageView imageView, String str) {
        Picasso a = C47045a.m147116a();
        if (a != null) {
            a.mo49979a(str).mo50085a().mo50098c().mo50097b(this.f120715c).mo50094a(imageView, (C18824e) new C47046b(imageView));
        }
    }

    /* renamed from: a */
    private void m147104a(ImageView imageView, String str) {
        if (!TextUtils.isEmpty(str)) {
            imageView.setContentDescription(str);
        } else {
            imageView.setContentDescription(getResources().getString(R.string.fh3));
        }
    }

    /* renamed from: a */
    private void m147102a(int i, int i2, int i3) {
        this.f120720h[i].measure(MeasureSpec.makeMeasureSpec(i2, 1073741824), MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    TweetMediaView(Context context, AttributeSet attributeSet, C47045a aVar) {
        super(context, attributeSet);
        this.f120720h = new C47073g[4];
        this.f120721i = Collections.emptyList();
        this.f120722j = new Path();
        this.f120723k = new RectF();
        this.f120713a = new float[8];
        this.f120714b = -16777216;
        this.f120716d = aVar;
        this.f120724l = getResources().getDimensionPixelSize(R.dimen.vv);
        this.f120715c = R.drawable.cl1;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f120722j.reset();
        this.f120723k.set(0.0f, 0.0f, (float) i, (float) i2);
        this.f120722j.addRoundRect(this.f120723k, this.f120713a, Direction.CW);
        this.f120722j.close();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f120725m > 0) {
            m147100a();
        }
    }

    /* renamed from: a */
    private void m147103a(int i, int i2, int i3, int i4, int i5) {
        C47073g gVar = this.f120720h[i];
        if (gVar.getLeft() != i2 || gVar.getTop() != i3 || gVar.getRight() != i4 || gVar.getBottom() != i5) {
            gVar.layout(i2, i3, i4, i5);
        }
    }
}
