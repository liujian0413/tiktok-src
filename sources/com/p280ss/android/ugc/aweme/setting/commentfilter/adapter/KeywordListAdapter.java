package com.p280ss.android.ugc.aweme.setting.commentfilter.adapter;

import android.content.Context;
import android.os.IBinder;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.setting.commentfilter.viewholder.AddKeywordViewHolder;
import com.p280ss.android.ugc.aweme.setting.commentfilter.viewholder.C37617a;
import com.p280ss.android.ugc.aweme.setting.commentfilter.viewholder.KeywordViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.adapter.KeywordListAdapter */
public final class KeywordListAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    public List<String> f98056a = C7525m.m23466c("");

    /* renamed from: b */
    public boolean f98057b;

    /* renamed from: c */
    public int f98058c = -1;

    /* renamed from: d */
    public View f98059d;

    /* renamed from: e */
    public boolean f98060e;

    /* renamed from: f */
    public final Context f98061f;

    /* renamed from: g */
    public final View f98062g;

    /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.adapter.KeywordListAdapter$a */
    public static final class C37604a implements C37617a {

        /* renamed from: a */
        final /* synthetic */ KeywordListAdapter f98063a;

        /* renamed from: a */
        public final void mo94912a() {
            this.f98063a.f98057b = false;
            this.f98063a.f98058c = -1;
        }

        C37604a(KeywordListAdapter keywordListAdapter) {
            this.f98063a = keywordListAdapter;
        }

        /* renamed from: a */
        public final boolean mo94915a(int i) {
            IBinder iBinder;
            if (!this.f98063a.f98057b && (this.f98063a.f98058c == -1 || this.f98063a.f98058c == i)) {
                return false;
            }
            View view = this.f98063a.f98059d;
            if (view != null) {
                view.clearFocus();
            }
            Object systemService = this.f98063a.f98061f.getSystemService("input_method");
            if (systemService != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                View view2 = this.f98063a.f98059d;
                if (view2 != null) {
                    iBinder = view2.getWindowToken();
                } else {
                    iBinder = null;
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                return true;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }

        /* renamed from: b */
        public final void mo94916b(int i) {
            IBinder iBinder;
            View view = this.f98063a.f98059d;
            if (view != null) {
                view.clearFocus();
            }
            this.f98063a.f98057b = false;
            Object systemService = this.f98063a.f98061f.getSystemService("input_method");
            if (systemService != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                View view2 = this.f98063a.f98059d;
                if (view2 != null) {
                    iBinder = view2.getWindowToken();
                } else {
                    iBinder = null;
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                this.f98063a.f98056a.remove(i);
                this.f98063a.notifyItemRemoved(i);
                KeywordListAdapter keywordListAdapter = this.f98063a;
                keywordListAdapter.notifyItemRangeChanged(i, keywordListAdapter.getItemCount() - i);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }

        /* renamed from: a */
        public final void mo94913a(int i, View view) {
            C7573i.m23587b(view, "view");
            this.f98063a.f98059d = view;
            this.f98063a.f98057b = true;
            this.f98063a.f98058c = i;
        }

        /* renamed from: a */
        public final void mo94914a(int i, String str) {
            C7573i.m23587b(str, "word");
            this.f98063a.f98056a.set(i, str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.adapter.KeywordListAdapter$b */
    static final class C37605b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ KeywordListAdapter f98064a;

        C37605b(KeywordListAdapter keywordListAdapter) {
            this.f98064a = keywordListAdapter;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f98064a.f98056a.size() == 51) {
                C7573i.m23582a((Object) view, "it");
                C10761a.m31400c(view.getContext(), (int) R.string.a8f, 1).mo25750a();
                return;
            }
            this.f98064a.f98056a.add(1, "");
            this.f98064a.notifyItemInserted(1);
            this.f98064a.notifyItemRangeChanged(1, this.f98064a.getItemCount() - 1);
            this.f98064a.f98060e = true;
            this.f98064a.f98057b = false;
            this.f98064a.f98058c = -1;
        }
    }

    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public final int getItemCount() {
        return this.f98056a.size();
    }

    public KeywordListAdapter(Context context, View view) {
        C7573i.m23587b(context, "mContext");
        C7573i.m23587b(view, "container");
        this.f98061f = context;
        this.f98062g = view;
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "holder");
        if (vVar instanceof KeywordViewHolder) {
            KeywordViewHolder keywordViewHolder = (KeywordViewHolder) vVar;
            keywordViewHolder.mo94926a(i, (String) this.f98056a.get(i));
            if (this.f98060e && i == 1) {
                keywordViewHolder.mo94925a();
                this.f98060e = false;
            }
        }
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.io, viewGroup, false);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…ords_edit, parent, false)");
            return new KeywordViewHolder(inflate, new C37604a(this));
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.in, viewGroup, false);
        C7573i.m23582a((Object) inflate2, "LayoutInflater.from(pare…words_add, parent, false)");
        return new AddKeywordViewHolder(inflate2, new C37605b(this));
    }
}
