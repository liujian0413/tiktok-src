package com.p280ss.android.ugc.aweme.forward.p1272vh;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.forward.vh.BaseForwardViewHolder_ViewBinding */
public class BaseForwardViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseForwardViewHolder f78604a;

    /* renamed from: b */
    private View f78605b;

    /* renamed from: c */
    private View f78606c;

    /* renamed from: d */
    private View f78607d;

    /* renamed from: e */
    private View f78608e;

    /* renamed from: f */
    private View f78609f;

    /* renamed from: g */
    private View f78610g;

    /* renamed from: h */
    private View f78611h;

    /* renamed from: i */
    private View f78612i;

    public void unbind() {
        if (this.f78604a != null) {
            this.f78604a = null;
            if (this.f78605b != null) {
                this.f78605b.setOnClickListener(null);
                this.f78605b = null;
            }
            this.f78606c.setOnClickListener(null);
            this.f78606c = null;
            this.f78607d.setOnClickListener(null);
            this.f78607d = null;
            if (this.f78608e != null) {
                this.f78608e.setOnClickListener(null);
                this.f78608e = null;
            }
            this.f78609f.setOnClickListener(null);
            this.f78609f = null;
            if (this.f78610g != null) {
                this.f78610g.setOnClickListener(null);
                this.f78610g = null;
            }
            this.f78611h.setOnClickListener(null);
            this.f78611h = null;
            this.f78612i.setOnClickListener(null);
            this.f78612i = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseForwardViewHolder_ViewBinding(final BaseForwardViewHolder baseForwardViewHolder, View view) {
        this.f78604a = baseForwardViewHolder;
        View findViewById = view.findViewById(R.id.b90);
        if (findViewById != null) {
            this.f78605b = findViewById;
            findViewById.setOnClickListener(new DebouncingOnClickListener() {
                public final void doClick(View view) {
                    baseForwardViewHolder.clickExtra();
                }
            });
        }
        View findRequiredView = Utils.findRequiredView(view, R.id.bgo, "method 'onClickAuthorAvatar'");
        this.f78606c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseForwardViewHolder.onClickAuthorAvatar(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.e4i, "method 'onClickAuthorName'");
        this.f78607d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseForwardViewHolder.onClickAuthorName(view);
            }
        });
        View findViewById2 = view.findViewById(R.id.bhm);
        if (findViewById2 != null) {
            this.f78608e = findViewById2;
            findViewById2.setOnClickListener(new DebouncingOnClickListener() {
                public final void doClick(View view) {
                    baseForwardViewHolder.showCreateForward(view);
                }
            });
        }
        View findRequiredView3 = Utils.findRequiredView(view, R.id.bgx, "method 'expandComment'");
        this.f78609f = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseForwardViewHolder.expandComment(view);
            }
        });
        View findViewById3 = view.findViewById(R.id.bjr);
        if (findViewById3 != null) {
            this.f78610g = findViewById3;
            findViewById3.setOnClickListener(new DebouncingOnClickListener() {
                public final void doClick(View view) {
                    baseForwardViewHolder.showShare(view);
                }
            });
        }
        View findRequiredView4 = Utils.findRequiredView(view, R.id.bgk, "method 'addComment'");
        this.f78611h = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseForwardViewHolder.addComment();
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, R.id.bh7, "method 'clickLike'");
        this.f78612i = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseForwardViewHolder.clickLike(view);
            }
        });
    }
}
