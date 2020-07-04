package com.p280ss.android.ugc.aweme.photo.publish;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.photo.publish.PhotoPreviewActivity_ViewBinding */
public class PhotoPreviewActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PhotoPreviewActivity f90651a;

    /* renamed from: b */
    private View f90652b;

    public void unbind() {
        PhotoPreviewActivity photoPreviewActivity = this.f90651a;
        if (photoPreviewActivity != null) {
            this.f90651a = null;
            photoPreviewActivity.mImageView = null;
            this.f90652b.setOnClickListener(null);
            this.f90652b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PhotoPreviewActivity_ViewBinding(final PhotoPreviewActivity photoPreviewActivity, View view) {
        this.f90651a = photoPreviewActivity;
        View findRequiredView = Utils.findRequiredView(view, R.id.cbg, "field 'mImageView' and method 'onClick'");
        photoPreviewActivity.mImageView = (ImageView) Utils.castView(findRequiredView, R.id.cbg, "field 'mImageView'", ImageView.class);
        this.f90652b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                photoPreviewActivity.onClick(view);
            }
        });
    }
}
