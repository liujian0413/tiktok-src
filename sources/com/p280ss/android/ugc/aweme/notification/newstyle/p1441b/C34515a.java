package com.p280ss.android.ugc.aweme.notification.newstyle.p1441b;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34355d;
import com.p280ss.android.ugc.aweme.notification.newstyle.adapter.C34512b;
import com.p280ss.android.ugc.aweme.notification.newstyle.adapter.GroupFilterAdapter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.b.a */
public final class C34515a extends PopupWindow {

    /* renamed from: a */
    private RecyclerView f90039a;

    /* renamed from: b */
    private GroupFilterAdapter f90040b;

    /* renamed from: c */
    private View f90041c;

    /* renamed from: d */
    private final Context f90042d;

    /* renamed from: e */
    private final C34512b f90043e;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.b.a$a */
    static final class C34516a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34515a f90044a;

        C34516a(C34515a aVar) {
            this.f90044a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f90044a.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo87827a() {
        GroupFilterAdapter groupFilterAdapter = this.f90040b;
        if (groupFilterAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        groupFilterAdapter.f89987a = 36;
        GroupFilterAdapter groupFilterAdapter2 = this.f90040b;
        if (groupFilterAdapter2 == null) {
            C7573i.m23583a("mAdapter");
        }
        groupFilterAdapter2.notifyDataSetChanged();
    }

    /* renamed from: b */
    private final void m111623b() {
        View inflate = LayoutInflater.from(this.f90042d).inflate(R.layout.b3u, null, false);
        setContentView(inflate);
        View findViewById = inflate.findViewById(R.id.akl);
        C7573i.m23582a((Object) findViewById, "contentView.findViewById(R.id.filter_recycler)");
        this.f90039a = (RecyclerView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.ms);
        C7573i.m23582a((Object) findViewById2, "contentView.findViewById(R.id.blank_view)");
        this.f90041c = findViewById2;
        setWidth(-1);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(this.f90042d.getResources().getColor(R.color.ac4)));
        setFocusable(true);
        setAnimationStyle(R.style.ws);
        View view = this.f90041c;
        if (view == null) {
            C7573i.m23583a("mBlankView");
        }
        view.setOnClickListener(new C34516a(this));
        RecyclerView recyclerView = this.f90039a;
        if (recyclerView == null) {
            C7573i.m23583a("mRecyclerView");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f90042d, 1, false));
        this.f90040b = new GroupFilterAdapter(this.f90043e);
        GroupFilterAdapter groupFilterAdapter = this.f90040b;
        if (groupFilterAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        groupFilterAdapter.mo66516d(false);
        RecyclerView recyclerView2 = this.f90039a;
        if (recyclerView2 == null) {
            C7573i.m23583a("mRecyclerView");
        }
        GroupFilterAdapter groupFilterAdapter2 = this.f90040b;
        if (groupFilterAdapter2 == null) {
            C7573i.m23583a("mAdapter");
        }
        recyclerView2.setAdapter(groupFilterAdapter2);
    }

    /* renamed from: a */
    public final void mo87828a(List<C34355d> list) {
        C7573i.m23587b(list, "list");
        GroupFilterAdapter groupFilterAdapter = this.f90040b;
        if (groupFilterAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        groupFilterAdapter.mo58045a(list);
    }

    public C34515a(Context context, C34512b bVar) {
        C7573i.m23587b(context, "mContext");
        C7573i.m23587b(bVar, "listener");
        super(context);
        this.f90042d = context;
        this.f90043e = bVar;
        m111623b();
    }
}
