package com.p280ss.android.ugc.aweme.photo.publish;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.PermissionSettingItem;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.photo.publish.PhotoPublishFragment_ViewBinding */
public class PhotoPublishFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PhotoPublishFragment f90674a;

    /* renamed from: b */
    private View f90675b;

    /* renamed from: c */
    private View f90676c;

    /* renamed from: d */
    private View f90677d;

    /* renamed from: e */
    private View f90678e;

    public void unbind() {
        PhotoPublishFragment photoPublishFragment = this.f90674a;
        if (photoPublishFragment != null) {
            this.f90674a = null;
            photoPublishFragment.mPermissionSettingItem = null;
            photoPublishFragment.mPhotoThumbView = null;
            photoPublishFragment.mLayoutSettingContainer = null;
            this.f90675b.setOnClickListener(null);
            this.f90675b = null;
            this.f90676c.setOnClickListener(null);
            this.f90676c = null;
            this.f90677d.setOnClickListener(null);
            this.f90677d = null;
            this.f90678e.setOnClickListener(null);
            this.f90678e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PhotoPublishFragment_ViewBinding(final PhotoPublishFragment photoPublishFragment, View view) {
        this.f90674a = photoPublishFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.cag, "field 'mPermissionSettingItem' and method 'onClick'");
        photoPublishFragment.mPermissionSettingItem = (PermissionSettingItem) Utils.castView(findRequiredView, R.id.cag, "field 'mPermissionSettingItem'", PermissionSettingItem.class);
        this.f90675b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                photoPublishFragment.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.ay5, "field 'mPhotoThumbView' and method 'onClick'");
        photoPublishFragment.mPhotoThumbView = (ImageView) Utils.castView(findRequiredView2, R.id.ay5, "field 'mPhotoThumbView'", ImageView.class);
        this.f90676c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                photoPublishFragment.onClick(view);
            }
        });
        photoPublishFragment.mLayoutSettingContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bjq, "field 'mLayoutSettingContainer'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.h9, "method 'onClick'");
        this.f90677d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                photoPublishFragment.onClick(view);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, R.id.clr, "method 'onClick'");
        this.f90678e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                photoPublishFragment.onClick(view);
            }
        });
    }
}
