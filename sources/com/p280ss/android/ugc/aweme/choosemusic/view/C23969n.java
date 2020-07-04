package com.p280ss.android.ugc.aweme.choosemusic.view;

import android.os.Build.VERSION;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.view.View;
import android.view.View.OnScrollChangeListener;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.n */
public final class C23969n {

    /* renamed from: a */
    int f63322a;

    /* renamed from: b */
    int f63323b;

    /* renamed from: c */
    int f63324c;

    /* renamed from: d */
    public boolean f63325d = true;

    /* renamed from: e */
    private C23971a f63326e;

    /* renamed from: f */
    private int f63327f;

    /* renamed from: g */
    private int f63328g;

    /* renamed from: h */
    private boolean f63329h = true;

    /* renamed from: i */
    private int f63330i;

    /* renamed from: j */
    private int f63331j;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.n$a */
    public interface C23971a {
        /* renamed from: a */
        void mo62102a(int i, int i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.n$b */
    class C23972b implements OnScrollChangeListener {
        private C23972b() {
        }

        public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
            if (view instanceof RecyclerView) {
                C23969n.this.mo62185b((RecyclerView) view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.n$c */
    class C23973c extends C1281m {
        private C23973c() {
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            C23969n.this.mo62185b(recyclerView);
        }
    }

    /* renamed from: a */
    public final void mo62183a() {
        this.f63328g = 0;
        this.f63330i = 0;
        this.f63331j = 0;
    }

    /* renamed from: a */
    public final void mo62184a(RecyclerView recyclerView) {
        if (VERSION.SDK_INT >= 23) {
            recyclerView.setOnScrollChangeListener(new C23972b());
        } else {
            recyclerView.setOnScrollListener(new C23973c());
        }
    }

    /* renamed from: b */
    public final void mo62185b(RecyclerView recyclerView) {
        if (this.f63325d) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            this.f63323b = recyclerView.getChildCount();
            this.f63324c = linearLayoutManager.mo5744A();
            this.f63322a = linearLayoutManager.mo5445j();
            if (this.f63324c < this.f63328g) {
                this.f63331j = this.f63330i;
                this.f63328g = this.f63324c;
                if (this.f63324c == 0) {
                    this.f63329h = true;
                }
            }
            if (this.f63329h && this.f63324c > this.f63328g) {
                this.f63329h = false;
                this.f63328g = this.f63324c;
                this.f63331j++;
            }
            if (!this.f63329h && this.f63324c - this.f63323b <= this.f63322a + this.f63327f) {
                if (this.f63326e != null) {
                    this.f63326e.mo62102a(this.f63331j + 1, this.f63324c);
                }
                this.f63329h = true;
            }
        }
    }

    public C23969n(C23971a aVar, int i) {
        this.f63326e = aVar;
        this.f63327f = i;
    }
}
