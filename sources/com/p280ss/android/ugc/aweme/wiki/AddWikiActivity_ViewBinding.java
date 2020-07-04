package com.p280ss.android.ugc.aweme.wiki;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.wiki.AddWikiActivity_ViewBinding */
public final class AddWikiActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AddWikiActivity f112802a;

    /* renamed from: b */
    private View f112803b;

    /* renamed from: c */
    private View f112804c;

    /* renamed from: d */
    private View f112805d;

    public final void unbind() {
        AddWikiActivity addWikiActivity = this.f112802a;
        if (addWikiActivity != null) {
            this.f112802a = null;
            addWikiActivity.webView = null;
            addWikiActivity.backBtn = null;
            addWikiActivity.closeBtn = null;
            addWikiActivity.titleView = null;
            addWikiActivity.addBtn = null;
            addWikiActivity.statusBar = null;
            this.f112803b.setOnClickListener(null);
            this.f112803b = null;
            this.f112804c.setOnClickListener(null);
            this.f112804c = null;
            this.f112805d.setOnClickListener(null);
            this.f112805d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AddWikiActivity_ViewBinding(final AddWikiActivity addWikiActivity, View view) {
        this.f112802a = addWikiActivity;
        addWikiActivity.webView = (CrossPlatformWebView) Utils.findRequiredViewAsType(view, R.id.a5b, "field 'webView'", CrossPlatformWebView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.jo, "field 'backBtn' and method 'onClickBack'");
        addWikiActivity.backBtn = (ImageView) Utils.castView(findRequiredView, R.id.jo, "field 'backBtn'", ImageView.class);
        this.f112803b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                addWikiActivity.onClickBack();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.xd, "field 'closeBtn' and method 'onClickClose'");
        addWikiActivity.closeBtn = (ImageView) Utils.castView(findRequiredView2, R.id.xd, "field 'closeBtn'", ImageView.class);
        this.f112804c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                addWikiActivity.onClickClose();
            }
        });
        addWikiActivity.titleView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'titleView'", DmtTextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.e0, "field 'addBtn' and method 'onClickAdd'");
        addWikiActivity.addBtn = (LinearLayout) Utils.castView(findRequiredView3, R.id.e0, "field 'addBtn'", LinearLayout.class);
        this.f112805d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                addWikiActivity.onClickAdd();
            }
        });
        addWikiActivity.statusBar = Utils.findRequiredView(view, R.id.dal, "field 'statusBar'");
    }
}
