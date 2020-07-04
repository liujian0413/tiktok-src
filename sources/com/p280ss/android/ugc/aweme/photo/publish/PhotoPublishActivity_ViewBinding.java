package com.p280ss.android.ugc.aweme.photo.publish;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.photo.publish.PhotoPublishActivity_ViewBinding */
public class PhotoPublishActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PhotoPublishActivity f90658a;

    /* renamed from: b */
    private View f90659b;

    public void unbind() {
        if (this.f90658a != null) {
            this.f90658a = null;
            this.f90659b.setOnClickListener(null);
            this.f90659b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PhotoPublishActivity_ViewBinding(final PhotoPublishActivity photoPublishActivity, View view) {
        this.f90658a = photoPublishActivity;
        View findRequiredView = Utils.findRequiredView(view, R.id.jn, "method 'onClick'");
        this.f90659b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                photoPublishActivity.onClick(view);
            }
        });
    }
}
