package com.p280ss.android.ugc.aweme.commercialize.views.bottomdialog;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.commercialize.model.C25003l;
import com.p280ss.android.ugc.aweme.commercialize.views.bottomdialog.OptionListViewHolder.C25534a;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.OptionListAdapter */
public final class OptionListAdapter extends C1262a<OptionListViewHolder> {

    /* renamed from: e */
    public static final C25523b f67230e = new C25523b(null);

    /* renamed from: a */
    public int f67231a = -1;

    /* renamed from: b */
    public C25522a f67232b;

    /* renamed from: c */
    public final List<C25003l> f67233c;

    /* renamed from: d */
    public final boolean f67234d;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.OptionListAdapter$a */
    public interface C25522a {
        /* renamed from: a */
        void mo66270a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.OptionListAdapter$b */
    public static final class C25523b {
        private C25523b() {
        }

        public /* synthetic */ C25523b(C7571f fVar) {
            this();
        }
    }

    public final int getItemCount() {
        return this.f67233c.size();
    }

    /* renamed from: a */
    public final void mo66268a() {
        this.f67233c.clear();
        this.f67231a = -1;
    }

    /* renamed from: a */
    public final void mo66269a(int i) {
        if (this.f67231a != i) {
            if (this.f67231a != -1) {
                notifyItemChanged(this.f67231a);
            }
            this.f67231a = i;
            notifyItemChanged(i);
            C25522a aVar = this.f67232b;
            if (aVar != null) {
                aVar.mo66270a(i);
            }
        } else {
            this.f67231a = -1;
            notifyItemChanged(i);
            C25522a aVar2 = this.f67232b;
            if (aVar2 != null) {
                aVar2.mo66270a(-1);
            }
        }
    }

    public final /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m83909a(viewGroup, i);
    }

    public OptionListAdapter(List<C25003l> list, boolean z) {
        C7573i.m23587b(list, "dataList");
        this.f67233c = list;
        this.f67234d = z;
    }

    /* renamed from: a */
    private static OptionListViewHolder m83909a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        return C25534a.m83932a(viewGroup);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(OptionListViewHolder optionListViewHolder, int i) {
        C7573i.m23587b(optionListViewHolder, "holder");
        optionListViewHolder.mo66278a(this, i, this.f67234d);
    }
}
