package com.p280ss.android.ugc.aweme.photomovie.edit.imageframe;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.support.p029v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.p280ss.android.ugc.aweme.photomovie.edit.imageframe.C34890a.C34893b;
import com.p280ss.android.ugc.aweme.shortvideo.p1573g.C39915b;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.imageframe.ImageFrameView */
public class ImageFrameView extends AppCompatImageView implements C34893b {

    /* renamed from: a */
    private C34890a f90994a;

    /* renamed from: b */
    private C34889a f90995b;

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.imageframe.ImageFrameView$a */
    public interface C34889a {
        /* renamed from: a */
        void mo88408a();
    }

    public C34890a getImageLoader() {
        return this.f90994a;
    }

    /* renamed from: a */
    public final void mo88422a() {
        if (this.f90994a != null) {
            this.f90994a.mo88431b();
        }
    }

    /* renamed from: b */
    public final void mo88425b() {
        if (this.f90995b != null) {
            this.f90995b.mo88408a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (this.f90994a != null) {
            this.f90994a.mo88431b();
        }
        super.onDetachedFromWindow();
    }

    public ImageFrameView(Context context) {
        super(context);
    }

    public void setOnLoadFinishListener(C34889a aVar) {
        this.f90995b = aVar;
    }

    /* renamed from: a */
    public final void mo88424a(C34890a aVar) {
        if (this.f90994a != null) {
            this.f90994a.mo88431b();
        }
        this.f90994a = aVar;
        this.f90994a.mo88429a();
    }

    /* renamed from: a */
    public final void mo88423a(BitmapDrawable bitmapDrawable, C39915b bVar) {
        setImageDrawable(bitmapDrawable);
    }

    public ImageFrameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ImageFrameView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
