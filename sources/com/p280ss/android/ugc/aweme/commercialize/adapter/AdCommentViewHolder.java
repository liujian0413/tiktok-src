package com.p280ss.android.ugc.aweme.commercialize.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.commercialize.views.AdCommentView;
import com.p280ss.android.ugc.aweme.p984ad.p986b.C22385a;
import com.p280ss.android.ugc.aweme.p984ad.services.p992a.C22466b;
import com.p280ss.android.ugc.aweme.p984ad.services.p992a.C22468d;
import com.p280ss.android.ugc.aweme.p984ad.view.IAdViewHolder;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.commercialize.adapter.AdCommentViewHolder */
public class AdCommentViewHolder extends IAdViewHolder {

    /* renamed from: a */
    private AdCommentView f64705a;

    /* renamed from: b */
    private WeakReference<C22385a> f64706b;

    /* renamed from: a */
    public final void mo64308a(String str) {
        this.f64705a.setEventType(str);
    }

    public AdCommentViewHolder(View view, C22385a aVar) {
        super(view);
        this.f64705a = (AdCommentView) view;
        this.f64706b = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public final void mo58902a(Context context, C22466b bVar) {
        C22468d dVar = (C22468d) bVar;
        this.f64705a.setData(dVar.f59913e);
        m80513a(dVar.f59914f, (View) this.f64705a);
        if (this.f64706b.get() != null) {
            this.f64705a.setOnInternalEventListener((C22385a) this.f64706b.get());
        }
    }

    /* renamed from: a */
    private static void m80513a(Rect rect, View view) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (rect != null) {
            if (rect.top >= 0) {
                i = rect.top;
            } else {
                i = view.getPaddingTop();
            }
            if (rect.bottom >= 0) {
                i2 = rect.bottom;
            } else {
                i2 = view.getPaddingBottom();
            }
            if (VERSION.SDK_INT >= 17) {
                if (rect.left >= 0) {
                    i5 = rect.left;
                } else {
                    i5 = view.getPaddingStart();
                }
                if (rect.right >= 0) {
                    i6 = rect.right;
                } else {
                    i6 = view.getPaddingEnd();
                }
                view.setPaddingRelative(i5, i, i6, i2);
                return;
            }
            if (rect.left >= 0) {
                i3 = rect.left;
            } else {
                i3 = view.getPaddingLeft();
            }
            if (rect.right >= 0) {
                i4 = rect.right;
            } else {
                i4 = view.getPaddingRight();
            }
            if (C43127fh.m136806a(C6399b.m19921a())) {
                view.setPadding(i4, i, i3, i2);
                return;
            }
            view.setPadding(i3, i, i4, i2);
        }
    }
}
