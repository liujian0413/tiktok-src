package com.p280ss.android.ugc.aweme.setting.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.p280ss.android.ugc.aweme.setting.C37561an;
import com.p280ss.android.ugc.aweme.setting.p1513c.C37587a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.adapter.RegionListAdapter */
public final class RegionListAdapter extends C1262a<CountryViewHolder> {

    /* renamed from: a */
    public C37561an f97952a;

    /* renamed from: b */
    public final List<C37587a> f97953b;

    /* renamed from: c */
    public int f97954c;

    /* renamed from: d */
    private final Context f97955d;

    /* renamed from: com.ss.android.ugc.aweme.setting.adapter.RegionListAdapter$CountryViewHolder */
    public static final class CountryViewHolder extends C1293v {

        /* renamed from: a */
        public final CommonItemView f97956a;

        public CountryViewHolder(CommonItemView commonItemView) {
            C7573i.m23587b(commonItemView, "v");
            super(commonItemView);
            this.f97956a = commonItemView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.adapter.RegionListAdapter$a */
    static final class C37549a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RegionListAdapter f97957a;

        /* renamed from: b */
        final /* synthetic */ int f97958b;

        C37549a(RegionListAdapter regionListAdapter, int i) {
            this.f97957a = regionListAdapter;
            this.f97958b = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f97958b != this.f97957a.f97954c) {
                ((C37587a) this.f97957a.f97953b.get(this.f97958b)).f98023e = true;
                this.f97957a.mo94838a().mo94846c();
                this.f97957a.notifyItemChanged(this.f97958b);
                if (!C37587a.f98018g.mo94900a(this.f97957a.f97954c)) {
                    ((C37587a) this.f97957a.f97953b.get(this.f97957a.f97954c)).f98023e = false;
                    this.f97957a.notifyItemChanged(this.f97957a.f97954c);
                }
                this.f97957a.f97954c = this.f97958b;
            }
        }
    }

    public final int getItemCount() {
        return this.f97953b.size();
    }

    /* renamed from: a */
    public final C37561an mo94838a() {
        C37561an anVar = this.f97952a;
        if (anVar == null) {
            C7573i.m23583a("doneClickableListener");
        }
        return anVar;
    }

    /* renamed from: a */
    public final void mo94839a(C37561an anVar) {
        C7573i.m23587b(anVar, "<set-?>");
        this.f97952a = anVar;
    }

    public final /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m120297a(viewGroup, i);
    }

    /* renamed from: a */
    private static CountryViewHolder m120297a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "p0");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a2w, viewGroup, false);
        if (inflate != null) {
            return new CountryViewHolder((CommonItemView) inflate);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.common.views.CommonItemView");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(CountryViewHolder countryViewHolder, int i) {
        C7573i.m23587b(countryViewHolder, "p0");
        String string = this.f97955d.getString(((C37587a) this.f97953b.get(i)).f98019a);
        C7573i.m23582a((Object) string, "context.getString(list[p1].nameRes)");
        countryViewHolder.f97956a.setLeftText(string);
        if (((C37587a) this.f97953b.get(i)).f98023e) {
            countryViewHolder.f97956a.setRightIconRes(R.drawable.aax);
        } else {
            countryViewHolder.f97956a.setRightIconRes(0);
        }
        countryViewHolder.itemView.setOnClickListener(new C37549a(this, i));
    }

    public RegionListAdapter(Context context, List<C37587a> list, int i) {
        boolean z;
        C7573i.m23587b(context, "context");
        C7573i.m23587b(list, "list");
        this.f97955d = context;
        this.f97953b = list;
        this.f97954c = i;
        int i2 = 0;
        for (C37587a aVar : this.f97953b) {
            if (i2 == this.f97954c) {
                z = true;
            } else {
                z = false;
            }
            aVar.f98023e = z;
            i2++;
        }
    }
}
