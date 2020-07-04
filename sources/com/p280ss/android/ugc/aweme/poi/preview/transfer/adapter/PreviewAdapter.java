package com.p280ss.android.ugc.aweme.poi.preview.transfer.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.p280ss.android.ugc.aweme.poi.preview.transfer.C35166h;
import com.p280ss.android.ugc.aweme.poi.preview.transfer.C35169i;
import com.p280ss.android.ugc.aweme.poi.preview.view.image.TransferImage;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.transfer.adapter.PreviewAdapter */
public final class PreviewAdapter extends TransferAdapter {

    /* renamed from: a */
    public C35169i f91934a;

    /* renamed from: d */
    private int f91935d;

    /* renamed from: e */
    private SparseArray<FrameLayout> f91936e = new SparseArray<>();

    public final int getCount() {
        return this.f91937b;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(obj, "object");
        return view == obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo89457a() {
        boolean z;
        if (this.f91937b > 1) {
            C35166h transConfig = this.f91934a.getTransConfig();
            if (transConfig != null) {
                z = transConfig.f91967D;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final FrameLayout mo89458b(int i) {
        return (FrameLayout) this.f91936e.get(i);
    }

    /* renamed from: a */
    public final TransferImage mo89455a(int i) {
        FrameLayout frameLayout = (FrameLayout) this.f91936e.get(i);
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = frameLayout.getChildAt(i2);
                if (childAt instanceof ImageView) {
                    return (TransferImage) childAt;
                }
            }
        }
        return null;
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "container");
        FrameLayout frameLayout = (FrameLayout) this.f91936e.get(i);
        if (frameLayout == null) {
            frameLayout = m113402a(viewGroup, i);
            this.f91936e.put(i, frameLayout);
            if (i == this.f91935d && this.f91938c != null) {
                this.f91938c.mo89459a();
            }
        }
        ViewGroup viewGroup2 = (ViewGroup) frameLayout.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(frameLayout);
        }
        try {
            viewGroup.addView(frameLayout);
        } catch (Exception unused) {
        }
        return frameLayout;
    }

    /* renamed from: a */
    private final FrameLayout m113402a(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        C35166h transConfig = this.f91934a.getTransConfig();
        TransferImage transferImage = new TransferImage(context);
        C7573i.m23582a((Object) transConfig, "config");
        transferImage.setDuration(transConfig.f91975f);
        transferImage.setBackgroundColor(transConfig.f91974e);
        transferImage.setScaleType(ScaleType.FIT_CENTER);
        transferImage.setLayoutParams(new LayoutParams(-1, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        frameLayout.addView(transferImage);
        if (transConfig.f91976g) {
            this.f91934a.mo89501a(i).mo89461a(transferImage, i);
        }
        return frameLayout;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C7573i.m23587b(viewGroup, "container");
        C7573i.m23587b(obj, "object");
        viewGroup.removeView((View) obj);
    }

    public PreviewAdapter(C35169i iVar, int i, int i2) {
        C7573i.m23587b(iVar, "transfer");
        this.f91934a = iVar;
        this.f91937b = i;
        int i3 = i2 + 1;
        if (i3 == this.f91937b) {
            i3 = i2 - 1;
        }
        this.f91935d = i3;
        if (this.f91935d < 0) {
            this.f91935d = 0;
        }
    }
}
