package com.p280ss.android.ugc.aweme.profile.p1487ui.header;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.header.AbsMyCommonHeaderLayout_ViewBinding */
public class AbsMyCommonHeaderLayout_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AbsMyCommonHeaderLayout f95698a;

    /* renamed from: b */
    private View f95699b;

    public void unbind() {
        if (this.f95698a != null) {
            this.f95698a = null;
            if (this.f95699b != null) {
                this.f95699b.setOnClickListener(null);
                this.f95699b = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AbsMyCommonHeaderLayout_ViewBinding(final AbsMyCommonHeaderLayout absMyCommonHeaderLayout, View view) {
        this.f95698a = absMyCommonHeaderLayout;
        View findViewById = view.findViewById(R.id.c2r);
        if (findViewById != null) {
            this.f95699b = findViewById;
            findViewById.setOnClickListener(new DebouncingOnClickListener() {
                public final void doClick(View view) {
                    absMyCommonHeaderLayout.onQrCodeClick(view);
                }
            });
        }
    }
}
