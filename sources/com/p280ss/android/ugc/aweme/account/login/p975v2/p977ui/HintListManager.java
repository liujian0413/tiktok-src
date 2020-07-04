package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui;

import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.p280ss.android.ugc.aweme.account.login.p975v2.C21886a;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.HintListManager */
public final class HintListManager {

    /* renamed from: g */
    public static final C22040a f58925g = new C22040a(null);

    /* renamed from: a */
    public boolean f58926a;

    /* renamed from: b */
    public int f58927b = -1;

    /* renamed from: c */
    public int f58928c = -1;

    /* renamed from: d */
    public final RecyclerView f58929d;

    /* renamed from: e */
    public List<String> f58930e;

    /* renamed from: f */
    public final C7562b<String, C7581n> f58931f;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.HintListManager$BottomHintAdapter */
    public final class BottomHintAdapter extends C1262a<BottomHintViewHolder> {
        public final int getItemCount() {
            List<String> list = HintListManager.this.f58930e;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public BottomHintAdapter() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public BottomHintViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            C7573i.m23587b(viewGroup, "p0");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tk, viewGroup, false);
            HintListManager hintListManager = HintListManager.this;
            if (inflate != null) {
                return new BottomHintViewHolder(hintListManager, (TextView) inflate);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onBindViewHolder(BottomHintViewHolder bottomHintViewHolder, int i) {
            boolean z;
            C7573i.m23587b(bottomHintViewHolder, "holder");
            List<String> list = HintListManager.this.f58930e;
            if (list == null) {
                C7573i.m23580a();
            }
            String str = (String) list.get(i);
            if (HintListManager.this.f58928c == i) {
                z = true;
            } else {
                z = false;
            }
            bottomHintViewHolder.mo58392a(str, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.HintListManager$BottomHintViewHolder */
    public final class BottomHintViewHolder extends C1293v {

        /* renamed from: a */
        public final TextView f58933a;

        /* renamed from: b */
        final /* synthetic */ HintListManager f58934b;

        /* renamed from: a */
        public final void mo58391a() {
            if (!this.f58934b.f58926a || getAdapterPosition() != 0) {
                this.f58934b.f58927b = this.f58934b.f58928c;
                this.f58934b.f58928c = getAdapterPosition();
                if (this.f58934b.f58927b != -1) {
                    C1262a adapter = this.f58934b.f58929d.getAdapter();
                    if (adapter == null) {
                        C7573i.m23580a();
                    }
                    adapter.notifyItemChanged(this.f58934b.f58927b);
                }
                C1262a adapter2 = this.f58934b.f58929d.getAdapter();
                if (adapter2 == null) {
                    C7573i.m23580a();
                }
                adapter2.notifyItemChanged(this.f58934b.f58928c);
                C7562b<String, C7581n> bVar = this.f58934b.f58931f;
                List<String> list = this.f58934b.f58930e;
                if (list == null) {
                    C7573i.m23580a();
                }
                bVar.invoke(list.get(getAdapterPosition()));
            }
        }

        public BottomHintViewHolder(HintListManager hintListManager, TextView textView) {
            C7573i.m23587b(textView, "item");
            this.f58934b = hintListManager;
            super(textView);
            this.f58933a = textView;
            TextView textView2 = this.f58933a;
            if (textView2 != null) {
                ((DmtTextView) textView2).setFontType(C10834d.f29332b);
                this.f58933a.setOnClickListener(new OnClickListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ BottomHintViewHolder f58935a;

                    {
                        this.f58935a = r1;
                    }

                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        this.f58935a.mo58391a();
                    }
                });
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtTextView");
        }

        /* renamed from: a */
        public final void mo58392a(String str, boolean z) {
            C7573i.m23587b(str, "s");
            this.f58933a.setText(str);
            if (!this.f58934b.f58926a || getAdapterPosition() != 0) {
                this.f58933a.setSelected(z);
                this.f58933a.setBackground(this.f58933a.getResources().getDrawable(R.drawable.hp));
                this.f58933a.setTextColor(this.f58933a.getResources().getColor(R.color.lw));
                return;
            }
            this.f58933a.setBackground(this.f58933a.getResources().getDrawable(R.color.ac4));
            this.f58933a.setTextColor(this.f58933a.getResources().getColor(R.color.ly));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.HintListManager$a */
    public static final class C22040a {

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.HintListManager$a$a */
        static final class C22041a extends Lambda implements C7562b<String, C7581n> {

            /* renamed from: a */
            final /* synthetic */ EditText f58936a;

            /* renamed from: b */
            final /* synthetic */ String f58937b;

            /* renamed from: c */
            final /* synthetic */ String f58938c;

            C22041a(EditText editText, String str, String str2) {
                this.f58936a = editText;
                this.f58937b = str;
                this.f58938c = str2;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m73331a((String) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m73331a(String str) {
                C7573i.m23587b(str, "it");
                Editable text = this.f58936a.getText();
                if (TextUtils.isEmpty(text)) {
                    this.f58936a.setText(str);
                } else {
                    if (text == null) {
                        C7573i.m23580a();
                    }
                    int a = C7634n.m23730a((CharSequence) text.toString(), "@", 0, false, 6, (Object) null);
                    if (a != -1) {
                        text.replace(a, text.length(), str);
                    } else {
                        text.append(str);
                    }
                }
                C6907h.m21524a("choose_recommend_email_suffix", (Map) new C21102b().mo56946a("enter_from", this.f58937b).mo56946a("enter_method", this.f58938c).f56672a);
            }
        }

        private C22040a() {
        }

        public /* synthetic */ C22040a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static HintListManager m73330a(RecyclerView recyclerView, EditText editText, String str, String str2) {
            C7573i.m23587b(recyclerView, "recyclerView");
            C7573i.m23587b(editText, "editText");
            C7573i.m23587b(str, "enterFrom");
            C7573i.m23587b(str2, "enterMethod");
            List a = C21886a.m73066a();
            List list = null;
            if (a != null) {
                List e = C7525m.m23510e(a);
                if (e != null) {
                    Iterable<String> iterable = e;
                    Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                    for (String str3 : iterable) {
                        if (!C7634n.m23776c((CharSequence) str3, (CharSequence) "@", false)) {
                            StringBuilder sb = new StringBuilder("@");
                            sb.append(str3);
                            str3 = sb.toString();
                        }
                        arrayList.add(str3);
                    }
                    list = C7525m.m23509d((Collection<? extends T>) (List) arrayList);
                }
            }
            return new HintListManager(recyclerView, list, new C22041a(editText, str, str2));
        }
    }

    /* renamed from: a */
    public final void mo58390a(List<String> list) {
        this.f58930e = list;
        if (this.f58930e != null) {
            List<String> list2 = this.f58930e;
            if (list2 == null) {
                C7573i.m23580a();
            }
            if (!list2.isEmpty()) {
                if (this.f58929d.getVisibility() != 0) {
                    this.f58929d.mo5541b(0);
                    this.f58929d.setVisibility(0);
                }
                if (this.f58926a) {
                    List<String> list3 = this.f58930e;
                    if (list3 == null) {
                        C7573i.m23580a();
                    }
                    String string = this.f58929d.getContext().getString(R.string.acv);
                    C7573i.m23582a((Object) string, "recyclerView.context.get…on_email_input_suggested)");
                    list3.add(0, string);
                }
                if (this.f58929d.getAdapter() == null) {
                    this.f58929d.setAdapter(new BottomHintAdapter());
                    return;
                }
                C1262a adapter = this.f58929d.getAdapter();
                if (adapter == null) {
                    C7573i.m23580a();
                }
                adapter.notifyDataSetChanged();
            }
        }
        if (this.f58929d.getVisibility() != 8) {
            this.f58929d.setVisibility(8);
        }
    }

    public HintListManager(RecyclerView recyclerView, List<String> list, C7562b<? super String, C7581n> bVar) {
        C7573i.m23587b(recyclerView, "recyclerView");
        C7573i.m23587b(bVar, "selectCallBack");
        this.f58929d = recyclerView;
        this.f58930e = list;
        this.f58931f = bVar;
        this.f58929d.setLayoutManager(new LinearLayoutManager(this.f58929d.getContext(), 0, false));
        if (this.f58930e != null) {
            List<String> list2 = this.f58930e;
            if (list2 == null) {
                C7573i.m23580a();
            }
            if (!list2.isEmpty()) {
                if (this.f58926a) {
                    List<String> list3 = this.f58930e;
                    if (list3 == null) {
                        C7573i.m23580a();
                    }
                    String string = this.f58929d.getContext().getString(R.string.acv);
                    C7573i.m23582a((Object) string, "recyclerView.context.get…on_email_input_suggested)");
                    list3.add(0, string);
                }
                if (this.f58929d.getAdapter() == null) {
                    this.f58929d.setAdapter(new BottomHintAdapter());
                    return;
                }
                C1262a adapter = this.f58929d.getAdapter();
                if (adapter == null) {
                    C7573i.m23580a();
                }
                adapter.notifyDataSetChanged();
            }
        }
    }
}
