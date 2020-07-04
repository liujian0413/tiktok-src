package com.p280ss.android.ugc.aweme.status;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.PagerAdapter;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.status.StatusViewPagerAdapter */
public final class StatusViewPagerAdapter extends PagerAdapter {

    /* renamed from: a */
    public LayoutInflater f108703a;

    /* renamed from: b */
    public HashMap<Integer, RecyclerView> f108704b = new HashMap<>();

    /* renamed from: c */
    public RecordStatusViewModel f108705c;

    /* renamed from: d */
    public ArrayList<EffectCategoryResponse> f108706d = new ArrayList<>();

    /* renamed from: e */
    public int f108707e = -1;

    /* renamed from: f */
    public int f108708f;

    /* renamed from: g */
    public FragmentActivity f108709g;

    public final boolean isViewFromObject(View view, Object obj) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(obj, "p1");
        return view == obj;
    }

    public final int getCount() {
        return this.f108706d.size() + 1;
    }

    public final CharSequence getPageTitle(int i) {
        if (i == 0) {
            return this.f108709g.getString(R.string.ala);
        }
        Object obj = this.f108706d.get(i - 1);
        C7573i.m23582a(obj, "categoryList.get(position - 1)");
        return ((EffectCategoryResponse) obj).name;
    }

    public StatusViewPagerAdapter(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "activity");
        this.f108709g = fragmentActivity;
        FragmentActivity fragmentActivity2 = this.f108709g;
        if (fragmentActivity2 != null) {
            LayoutInflater from = LayoutInflater.from(fragmentActivity2);
            C7573i.m23582a((Object) from, "LayoutInflater.from(activity as Context)");
            this.f108703a = from;
            C0063u a = C0069x.m159a(this.f108709g).mo147a(RecordStatusViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…tusViewModel::class.java)");
            this.f108705c = (RecordStatusViewModel) a;
            this.f108705c.mo102531b().observe(this.f108709g, new C0053p<EffectChannelResponse>(this) {

                /* renamed from: a */
                final /* synthetic */ StatusViewPagerAdapter f108710a;

                {
                    this.f108710a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onChanged(EffectChannelResponse effectChannelResponse) {
                    if (effectChannelResponse != null) {
                        this.f108710a.f108706d.clear();
                        this.f108710a.f108706d.addAll(effectChannelResponse.categoryResponseList);
                        this.f108710a.notifyDataSetChanged();
                        return;
                    }
                    C10761a.m31400c((Context) this.f108710a.f108709g, (int) R.string.cjm, 1).mo25750a();
                }
            });
            this.f108708f = C35563c.f93230L.mo93343b(Property.StatusPhoneType);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.content.Context");
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "container");
        RecyclerView recyclerView = (RecyclerView) this.f108704b.get(Integer.valueOf(i));
        if (recyclerView == null || recyclerView.getParent() != null) {
            RecyclerView recyclerView2 = new RecyclerView(this.f108709g);
            recyclerView2.setLayoutParams(new LayoutParams(-1, -1));
            recyclerView2.setLayoutManager(new GridLayoutManager(this.f108709g, 2));
            if (i == 0) {
                int i2 = this.f108708f;
                String string = this.f108709g.getString(R.string.ala);
                C7573i.m23582a((Object) string, "activity.getString(R.str…eation_shoot_status_tab1)");
                recyclerView2.setAdapter(new StatusRecyclerViewAdapter(this.f108709g, "all", i2, string));
                this.f108705c.mo102532c().setValue("all");
            } else {
                FragmentActivity fragmentActivity = this.f108709g;
                int i3 = i - 1;
                Object obj = this.f108706d.get(i3);
                C7573i.m23582a(obj, "categoryList.get(position - 1)");
                String str = ((EffectCategoryResponse) obj).key;
                C7573i.m23582a((Object) str, "categoryList.get(position - 1).key");
                int i4 = this.f108708f;
                Object obj2 = this.f108706d.get(i3);
                C7573i.m23582a(obj2, "categoryList.get(position - 1)");
                String str2 = ((EffectCategoryResponse) obj2).name;
                C7573i.m23582a((Object) str2, "categoryList.get(position - 1).name");
                recyclerView2.setAdapter(new StatusRecyclerViewAdapter(fragmentActivity, str, i4, str2));
                C0052o c = this.f108705c.mo102532c();
                Object obj3 = this.f108706d.get(i3);
                C7573i.m23582a(obj3, "categoryList.get(position - 1)");
                c.setValue(((EffectCategoryResponse) obj3).key);
            }
            recyclerView2.mo5525a((C1272h) new ItemDecoration(this.f108709g, recyclerView2));
            this.f108704b.put(Integer.valueOf(i), recyclerView2);
            viewGroup.addView(recyclerView2);
            return recyclerView2;
        }
        viewGroup.addView(recyclerView);
        return recyclerView;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C7573i.m23587b(viewGroup, "container");
        C7573i.m23587b(obj, "view");
        viewGroup.removeView((RecyclerView) obj);
    }

    public final void setPrimaryItem(View view, int i, Object obj) {
        C7573i.m23587b(view, "container");
        C7573i.m23587b(obj, "object");
        if (this.f108707e != i) {
            this.f108707e = i;
        }
    }
}
