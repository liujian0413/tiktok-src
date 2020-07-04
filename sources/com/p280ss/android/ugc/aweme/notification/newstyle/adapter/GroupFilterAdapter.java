package com.p280ss.android.ugc.aweme.notification.newstyle.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34355d;
import com.p280ss.android.ugc.aweme.notification.util.C34614c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.adapter.GroupFilterAdapter */
public final class GroupFilterAdapter extends BaseAdapter<C34355d> {

    /* renamed from: a */
    public int f89987a = 36;

    /* renamed from: b */
    private final C34512b f89988b;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.adapter.GroupFilterAdapter$a */
    static final class C34502a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupFilterAdapter f89989a;

        /* renamed from: b */
        final /* synthetic */ int f89990b;

        C34502a(GroupFilterAdapter groupFilterAdapter, int i) {
            this.f89989a = groupFilterAdapter;
            this.f89990b = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            GroupFilterAdapter groupFilterAdapter = this.f89989a;
            Object obj = this.f89989a.mo62312a().get(this.f89990b);
            C7573i.m23582a(obj, "data[position]");
            groupFilterAdapter.mo87809a((C34355d) obj);
        }
    }

    public GroupFilterAdapter(C34512b bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f89988b = bVar;
    }

    /* renamed from: a */
    public final void mo87809a(C34355d dVar) {
        this.f89987a = dVar.f89528a;
        notifyDataSetChanged();
        m111554b(dVar);
        this.f89988b.mo87790a(dVar);
    }

    /* renamed from: b */
    private static void m111554b(C34355d dVar) {
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tab_name", C34614c.m111858a(dVar.f89528a));
        linkedHashMap.put("scene_id", "1002");
        if (C34315c.m110982b(dVar.f89528a)) {
            linkedHashMap.put("notice_type", "yellow_dot");
        }
        C6907h.m21524a("enter_homepage_message", linkedHashMap);
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        if (viewGroup == null) {
            C7573i.m23580a();
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.af1, viewGroup, false);
        C7573i.m23582a((Object) inflate, "itemView");
        return new GroupFilterViewHolder(inflate);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        if (vVar instanceof GroupFilterViewHolder) {
            GroupFilterViewHolder groupFilterViewHolder = (GroupFilterViewHolder) vVar;
            Object obj = mo62312a().get(i);
            C7573i.m23582a(obj, "data[position]");
            groupFilterViewHolder.mo87811a((C34355d) obj, this.f89987a);
            vVar.itemView.setOnClickListener(new C34502a(this, i));
        }
    }
}
