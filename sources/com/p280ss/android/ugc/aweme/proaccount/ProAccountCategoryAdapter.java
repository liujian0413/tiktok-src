package com.p280ss.android.ugc.aweme.proaccount;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.p280ss.android.ttve.utils.C20505c;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.CategoryPageTextStruct;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.ProAccountEnableDetailInfo;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.Ref.ObjectRef;

/* renamed from: com.ss.android.ugc.aweme.proaccount.ProAccountCategoryAdapter */
public final class ProAccountCategoryAdapter extends C1262a<CategoryViewHolder> {

    /* renamed from: a */
    public C35625b f93312a;

    /* renamed from: b */
    public List<Boolean> f93313b = new ArrayList();

    /* renamed from: c */
    public int f93314c = -1;

    /* renamed from: d */
    private final Context f93315d;

    /* renamed from: e */
    private final List<CategoryStruct> f93316e;

    /* renamed from: com.ss.android.ugc.aweme.proaccount.ProAccountCategoryAdapter$CategoryViewHolder */
    public static final class CategoryViewHolder extends C1293v {

        /* renamed from: a */
        public DmtTextView f93317a;

        /* renamed from: b */
        public DmtTextView f93318b;

        /* renamed from: c */
        public DmtTextView f93319c;

        public CategoryViewHolder(View view) {
            C7573i.m23587b(view, "v");
            super(view);
            View findViewById = view.findViewById(R.id.dr8);
            C7573i.m23582a((Object) findViewById, "v.findViewById(R.id.tv_category_check)");
            this.f93317a = (DmtTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.dr_);
            C7573i.m23582a((Object) findViewById2, "v.findViewById(R.id.tv_category_title)");
            this.f93318b = (DmtTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.dr9);
            C7573i.m23582a((Object) findViewById3, "v.findViewById(R.id.tv_category_desc)");
            this.f93319c = (DmtTextView) findViewById3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.ProAccountCategoryAdapter$a */
    static final class C35624a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProAccountCategoryAdapter f93320a;

        /* renamed from: b */
        final /* synthetic */ IntRef f93321b;

        /* renamed from: c */
        final /* synthetic */ int f93322c;

        /* renamed from: d */
        final /* synthetic */ ObjectRef f93323d;

        C35624a(ProAccountCategoryAdapter proAccountCategoryAdapter, IntRef intRef, int i, ObjectRef objectRef) {
            this.f93320a = proAccountCategoryAdapter;
            this.f93321b = intRef;
            this.f93322c = i;
            this.f93323d = objectRef;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f93321b.element != this.f93320a.f93314c) {
                this.f93320a.f93313b.set(this.f93321b.element, Boolean.valueOf(true));
                this.f93320a.notifyItemChanged(this.f93322c);
                if (this.f93320a.f93314c != -1) {
                    this.f93320a.f93313b.set(this.f93320a.f93314c, Boolean.valueOf(false));
                    this.f93320a.notifyItemChanged(this.f93320a.f93314c + 2);
                }
                this.f93320a.f93314c = this.f93321b.element;
            }
            ProAccountCategoryAdapter.m115085a(this.f93320a).mo90437a((String) this.f93323d.element, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.ProAccountCategoryAdapter$b */
    public interface C35625b {
        /* renamed from: a */
        void mo90437a(String str, boolean z);
    }

    public final int getItemCount() {
        return this.f93316e.size() + 2;
    }

    /* renamed from: a */
    public final void mo90435a(C35625b bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f93312a = bVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ C35625b m115085a(ProAccountCategoryAdapter proAccountCategoryAdapter) {
        C35625b bVar = proAccountCategoryAdapter.f93312a;
        if (bVar == null) {
            C7573i.m23583a("onItemClick");
        }
        return bVar;
    }

    /* renamed from: b */
    private static void m115089b(CategoryViewHolder categoryViewHolder) {
        categoryViewHolder.f93317a.setVisibility(8);
        categoryViewHolder.f93319c.setVisibility(0);
        categoryViewHolder.f93318b.setVisibility(8);
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            ProAccountEnableDetailInfo proAccountEnableDetailInfo = a.getProAccountEnableDetailInfo();
            C7573i.m23582a((Object) proAccountEnableDetailInfo, "SettingsReader.get().proAccountEnableDetailInfo");
            CategoryPageTextStruct categoryPageText = proAccountEnableDetailInfo.getCategoryPageText();
            DmtTextView dmtTextView = categoryViewHolder.f93318b;
            C7573i.m23582a((Object) categoryPageText, "categoryStruct");
            dmtTextView.setText(categoryPageText.getDescription());
        } catch (NullValueException unused) {
        }
    }

    /* renamed from: a */
    private static void m115086a(CategoryViewHolder categoryViewHolder) {
        categoryViewHolder.f93317a.setVisibility(8);
        categoryViewHolder.f93319c.setVisibility(8);
        categoryViewHolder.f93318b.setVisibility(0);
        categoryViewHolder.f93318b.setFontType(C10834d.f29332b);
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            ProAccountEnableDetailInfo proAccountEnableDetailInfo = a.getProAccountEnableDetailInfo();
            C7573i.m23582a((Object) proAccountEnableDetailInfo, "SettingsReader.get().proAccountEnableDetailInfo");
            CategoryPageTextStruct categoryPageText = proAccountEnableDetailInfo.getCategoryPageText();
            DmtTextView dmtTextView = categoryViewHolder.f93318b;
            C7573i.m23582a((Object) categoryPageText, "categoryStruct");
            dmtTextView.setText(categoryPageText.getTitle());
        } catch (NullValueException unused) {
        }
    }

    public final /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m115084a(viewGroup, i);
    }

    public ProAccountCategoryAdapter(Context context, List<CategoryStruct> list) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(list, "list");
        this.f93315d = context;
        this.f93316e = list;
    }

    /* renamed from: a */
    private static CategoryViewHolder m115084a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "p0");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0x, viewGroup, false);
        C7573i.m23582a((Object) inflate, "view");
        return new CategoryViewHolder(inflate);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(CategoryViewHolder categoryViewHolder, int i) {
        C7573i.m23587b(categoryViewHolder, "p0");
        this.f93313b.add(Boolean.valueOf(false));
        switch (i) {
            case 0:
                m115086a(categoryViewHolder);
                return;
            case 1:
                m115089b(categoryViewHolder);
                return;
            default:
                ObjectRef objectRef = new ObjectRef();
                objectRef.element = "";
                IntRef intRef = new IntRef();
                intRef.element = i - 2;
                if (intRef.element < this.f93316e.size() && intRef.element >= 0) {
                    try {
                        T categoryName = ((CategoryStruct) this.f93316e.get(intRef.element)).getCategoryName();
                        C7573i.m23582a((Object) categoryName, "list[position].categoryName");
                        objectRef.element = categoryName;
                        m115088a(categoryViewHolder, (String) objectRef.element, intRef.element);
                    } catch (NullValueException unused) {
                        m115088a(categoryViewHolder, (String) objectRef.element, intRef.element);
                    }
                    categoryViewHolder.itemView.setOnClickListener(new C35624a(this, intRef, i, objectRef));
                    return;
                }
                return;
        }
    }

    /* renamed from: a */
    private final void m115088a(CategoryViewHolder categoryViewHolder, String str, int i) {
        categoryViewHolder.f93317a.setVisibility(0);
        categoryViewHolder.f93319c.setVisibility(8);
        categoryViewHolder.f93318b.setVisibility(8);
        if (((Boolean) this.f93313b.get(i)).booleanValue()) {
            Drawable a = C0683b.m2903a(this.f93315d, (int) R.drawable.ayo);
            if (a == null) {
                C7573i.m23580a();
            }
            a.setBounds(0, 0, (int) C20505c.m68010a(this.f93315d, 32.0f), (int) C20505c.m68010a(this.f93315d, 32.0f));
            categoryViewHolder.f93317a.setCompoundDrawablesRelative(null, null, a, null);
            categoryViewHolder.f93317a.setFontType(C10834d.f29332b);
        } else {
            Drawable a2 = C0683b.m2903a(this.f93315d, (int) R.drawable.ayn);
            if (a2 == null) {
                C7573i.m23580a();
            }
            a2.setBounds(0, 0, (int) C20505c.m68010a(this.f93315d, 32.0f), (int) C20505c.m68010a(this.f93315d, 32.0f));
            categoryViewHolder.f93317a.setCompoundDrawablesRelative(null, null, a2, null);
            categoryViewHolder.f93317a.setFontType(C10834d.f29331a);
        }
        categoryViewHolder.f93317a.setText(str);
    }
}
