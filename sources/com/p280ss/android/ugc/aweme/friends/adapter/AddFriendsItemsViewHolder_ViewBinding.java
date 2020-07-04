package com.p280ss.android.ugc.aweme.friends.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.AddFriendsItemsViewHolder_ViewBinding */
public class AddFriendsItemsViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AddFriendsItemsViewHolder f78827a;

    /* renamed from: b */
    private View f78828b;

    /* renamed from: c */
    private View f78829c;

    /* renamed from: d */
    private View f78830d;

    /* renamed from: e */
    private View f78831e;

    /* renamed from: f */
    private View f78832f;

    public void unbind() {
        AddFriendsItemsViewHolder addFriendsItemsViewHolder = this.f78827a;
        if (addFriendsItemsViewHolder != null) {
            this.f78827a = null;
            addFriendsItemsViewHolder.mRedPointView = null;
            this.f78828b.setOnClickListener(null);
            this.f78828b = null;
            this.f78829c.setOnClickListener(null);
            this.f78829c = null;
            this.f78830d.setOnClickListener(null);
            this.f78830d = null;
            this.f78831e.setOnClickListener(null);
            this.f78831e = null;
            this.f78832f.setOnClickListener(null);
            this.f78832f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AddFriendsItemsViewHolder_ViewBinding(final AddFriendsItemsViewHolder addFriendsItemsViewHolder, View view) {
        this.f78827a = addFriendsItemsViewHolder;
        addFriendsItemsViewHolder.mRedPointView = (TextView) Utils.findRequiredViewAsType(view, R.id.cr1, "field 'mRedPointView'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.e4, "method 'onClick'");
        this.f78828b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                addFriendsItemsViewHolder.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.eb, "method 'onClick'");
        this.f78829c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                addFriendsItemsViewHolder.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.ed, "method 'onClick'");
        this.f78830d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                addFriendsItemsViewHolder.onClick(view);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, R.id.e1, "method 'onClick'");
        this.f78831e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                addFriendsItemsViewHolder.onClick(view);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, R.id.b2v, "method 'onClick'");
        this.f78832f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                addFriendsItemsViewHolder.onClick(view);
            }
        });
    }
}
