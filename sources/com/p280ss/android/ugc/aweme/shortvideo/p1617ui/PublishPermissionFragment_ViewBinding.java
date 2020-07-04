package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.content.Context;
import android.content.res.Resources;
import android.support.p022v4.content.C0683b;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.PublishPermissionFragment_ViewBinding */
public class PublishPermissionFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PublishPermissionFragment f107099a;

    /* renamed from: b */
    private View f107100b;

    /* renamed from: c */
    private View f107101c;

    /* renamed from: d */
    private View f107102d;

    public void unbind() {
        PublishPermissionFragment publishPermissionFragment = this.f107099a;
        if (publishPermissionFragment != null) {
            this.f107099a = null;
            publishPermissionFragment.mImgPermissionPrivate = null;
            publishPermissionFragment.mImgPermissionFriend = null;
            publishPermissionFragment.mImgPermissionOpen = null;
            publishPermissionFragment.permissionFriendLayout = null;
            publishPermissionFragment.permissionOpenLayout = null;
            publishPermissionFragment.permissionPrivateLayout = null;
            publishPermissionFragment.mTvPermissionOpen = null;
            publishPermissionFragment.mTvPermissionOpenText = null;
            this.f107100b.setOnClickListener(null);
            this.f107100b = null;
            this.f107101c.setOnClickListener(null);
            this.f107101c = null;
            this.f107102d.setOnClickListener(null);
            this.f107102d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PublishPermissionFragment_ViewBinding(final PublishPermissionFragment publishPermissionFragment, View view) {
        this.f107099a = publishPermissionFragment;
        publishPermissionFragment.mImgPermissionPrivate = (ImageView) Utils.findRequiredViewAsType(view, R.id.caf, "field 'mImgPermissionPrivate'", ImageView.class);
        publishPermissionFragment.mImgPermissionFriend = (ImageView) Utils.findRequiredViewAsType(view, R.id.cad, "field 'mImgPermissionFriend'", ImageView.class);
        publishPermissionFragment.mImgPermissionOpen = (ImageView) Utils.findRequiredViewAsType(view, R.id.cae, "field 'mImgPermissionOpen'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.bis, "field 'permissionFriendLayout' and method 'onClick'");
        publishPermissionFragment.permissionFriendLayout = (LinearLayout) Utils.castView(findRequiredView, R.id.bis, "field 'permissionFriendLayout'", LinearLayout.class);
        this.f107100b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                publishPermissionFragment.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.bit, "field 'permissionOpenLayout' and method 'onClick'");
        publishPermissionFragment.permissionOpenLayout = (LinearLayout) Utils.castView(findRequiredView2, R.id.bit, "field 'permissionOpenLayout'", LinearLayout.class);
        this.f107101c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                publishPermissionFragment.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.biu, "field 'permissionPrivateLayout' and method 'onClick'");
        publishPermissionFragment.permissionPrivateLayout = (LinearLayout) Utils.castView(findRequiredView3, R.id.biu, "field 'permissionPrivateLayout'", LinearLayout.class);
        this.f107102d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                publishPermissionFragment.onClick(view);
            }
        });
        publishPermissionFragment.mTvPermissionOpen = (TextView) Utils.findRequiredViewAsType(view, R.id.dzh, "field 'mTvPermissionOpen'", TextView.class);
        publishPermissionFragment.mTvPermissionOpenText = (TextView) Utils.findRequiredViewAsType(view, R.id.dzi, "field 'mTvPermissionOpenText'", TextView.class);
        Context context = view.getContext();
        Resources resources = context.getResources();
        publishPermissionFragment.mImgSelected = C0683b.m2903a(context, (int) R.drawable.alq);
        publishPermissionFragment.mImgNormal = C0683b.m2903a(context, (int) R.drawable.gc);
        publishPermissionFragment.mTitle = resources.getString(R.string.d9f);
    }
}
