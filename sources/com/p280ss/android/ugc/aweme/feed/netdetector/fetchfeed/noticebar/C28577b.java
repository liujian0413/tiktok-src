package com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.base.utils.C23485m;
import com.p280ss.android.ugc.aweme.feed.netdetector.C28545a;
import com.p280ss.android.ugc.aweme.feed.netdetector.C28548b;
import com.p280ss.android.ugc.aweme.feed.panel.C28648x;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar.b */
public final class C28577b implements C28576a {

    /* renamed from: a */
    public Activity f75243a;

    /* renamed from: b */
    public View f75244b;

    /* renamed from: c */
    public FeedTopNoticeView f75245c;

    /* renamed from: d */
    private C28648x f75246d;

    /* renamed from: e */
    private C7562b<Boolean, C7581n> f75247e = new C7562b<Boolean, C7581n>() {
        /* access modifiers changed from: private */
        /* renamed from: b */
        public C7581n invoke(Boolean bool) {
            C23485m.m77116a(new C28579c(this, bool));
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo73291a(Boolean bool) {
            if (C28577b.this.f75243a != null && !C28577b.this.f75243a.isFinishing() && C28577b.this.f75244b != null) {
                if (bool.booleanValue()) {
                    if (C28577b.this.f75245c == null) {
                        C28577b.this.f75245c = new FeedTopNoticeView(C28577b.this.f75243a);
                        if (C28577b.this.f75244b instanceof FrameLayout) {
                            ((FrameLayout) C28577b.this.f75244b).addView(C28577b.this.f75245c);
                        }
                    }
                    C28577b.this.mo73289b();
                    return;
                }
                C28577b.this.mo73290c();
            }
        }
    };

    /* renamed from: d */
    private void m93821d() {
        C28545a.f75190b.mo73258a(this.f75247e);
    }

    /* renamed from: e */
    private void m93822e() {
        C28545a.f75190b.mo73259b(this.f75247e);
    }

    /* renamed from: b */
    public final void mo73289b() {
        if (this.f75245c != null) {
            this.f75245c.mo73284a();
        }
    }

    /* renamed from: c */
    public final void mo73290c() {
        if (this.f75245c != null) {
            this.f75245c.mo73285b();
        }
    }

    /* renamed from: a */
    public final void mo73288a() {
        try {
            mo73290c();
            m93822e();
            this.f75247e = null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C28577b m93820a(Activity activity, View view, C28648x xVar) {
        if (C28548b.m93760b()) {
            return new C28577b(activity, view, xVar);
        }
        return null;
    }

    private C28577b(Activity activity, View view, C28648x xVar) {
        this.f75243a = activity;
        this.f75244b = view;
        this.f75246d = xVar;
        m93821d();
    }
}
