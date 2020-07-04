package com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.viewholder;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.Lifecycle.Event;
import android.support.p022v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import com.p280ss.android.ugc.aweme.p313im.sdk.BaseViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.viewmodel.MediaPreviewViewModel;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.viewholder.MediaPreviewViewHolder */
public abstract class MediaPreviewViewHolder extends BaseViewHolder<MediaModel> {

    /* renamed from: b */
    public MediaModel f82367b;

    /* renamed from: c */
    public final MediaPreviewViewModel f82368c;

    /* renamed from: d */
    private int f82369d = -1;

    /* renamed from: e */
    private int f82370e = -1;

    /* renamed from: f */
    private final C0053p<Event> f82371f = new C31458a(this);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.viewholder.MediaPreviewViewHolder$a */
    static final class C31458a<T> implements C0053p<Event> {

        /* renamed from: a */
        final /* synthetic */ MediaPreviewViewHolder f82372a;

        C31458a(MediaPreviewViewHolder mediaPreviewViewHolder) {
            this.f82372a = mediaPreviewViewHolder;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Event event) {
            if (event != null && C31466a.f82391a[event.ordinal()] == 1) {
                this.f82372a.mo82077h();
            }
        }
    }

    /* renamed from: c */
    public void mo80311c() {
    }

    /* renamed from: g */
    public View mo82076g() {
        return null;
    }

    /* renamed from: h */
    public void mo82077h() {
    }

    /* renamed from: f */
    public void mo82075f() {
        this.f82368c.mo82090p().removeObserver(this.f82371f);
    }

    /* renamed from: e */
    public void mo82074e() {
        FragmentActivity d = mo80312d();
        if (d != null) {
            this.f82368c.mo82090p().observe(d, this.f82371f);
        }
    }

    /* renamed from: j */
    private final boolean mo82082j() {
        if (this.f82369d > 0 && this.f82370e > 0) {
            return true;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        FragmentActivity d = mo80312d();
        if (d != null) {
            WindowManager windowManager = d.getWindowManager();
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                if (defaultDisplay != null) {
                    defaultDisplay.getMetrics(displayMetrics);
                }
            }
        }
        this.f82369d = displayMetrics.widthPixels;
        this.f82370e = displayMetrics.heightPixels;
        if (this.f82369d <= 0 || this.f82370e <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private final void mo82081i() {
        int i;
        int i2;
        View g = mo82076g();
        if (g != null) {
            MediaModel mediaModel = this.f82367b;
            if (mediaModel != null && mediaModel.getWidth() > 0 && mediaModel.getHeight() > 0 && mo82082j()) {
                float height = ((float) mediaModel.getHeight()) / ((float) mediaModel.getWidth());
                if (height > ((float) this.f82370e) / ((float) this.f82369d)) {
                    i2 = this.f82370e;
                    i = (int) (((float) this.f82370e) / height);
                } else {
                    int i3 = (int) (((float) this.f82369d) * height);
                    i = this.f82369d;
                    i2 = i3;
                }
                LayoutParams layoutParams = g.getLayoutParams();
                layoutParams.height = i2;
                layoutParams.width = i;
                g.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: a */
    public void mo80308a(MediaModel mediaModel) {
        C7573i.m23587b(mediaModel, "data");
        this.f82367b = mediaModel;
        mo82081i();
    }

    public MediaPreviewViewHolder(View view, MediaPreviewViewModel mediaPreviewViewModel) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(mediaPreviewViewModel, "viewModel");
        super(view);
        this.f82368c = mediaPreviewViewModel;
    }
}
