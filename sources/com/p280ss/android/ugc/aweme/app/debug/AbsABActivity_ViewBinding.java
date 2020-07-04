package com.p280ss.android.ugc.aweme.app.debug;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.app.debug.AbsABActivity_ViewBinding */
public class AbsABActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AbsABActivity f60664a;

    /* renamed from: b */
    private View f60665b;

    public void unbind() {
        if (this.f60664a != null) {
            this.f60664a = null;
            this.f60665b.setOnClickListener(null);
            this.f60665b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AbsABActivity_ViewBinding(final AbsABActivity absABActivity, View view) {
        this.f60664a = absABActivity;
        View findRequiredView = Utils.findRequiredView(view, R.id.jn, "method 'back'");
        this.f60665b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                absABActivity.back();
            }
        });
    }
}
