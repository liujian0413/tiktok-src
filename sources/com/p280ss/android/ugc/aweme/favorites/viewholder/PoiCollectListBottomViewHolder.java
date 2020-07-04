package com.p280ss.android.ugc.aweme.favorites.viewholder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.p280ss.android.ugc.aweme.favorites.adapter.C27733b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.PoiCollectListBottomViewHolder */
public final class PoiCollectListBottomViewHolder extends JediSimpleViewHolder<C27733b> {

    /* renamed from: g */
    public static final C27827b f73368g = new C27827b(null);

    /* renamed from: f */
    public final View f73369f;

    /* renamed from: j */
    private final DmtStatusView f73370j;

    /* renamed from: k */
    private final ImageView f73371k;

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.PoiCollectListBottomViewHolder$a */
    public static final class C27825a {

        /* renamed from: a */
        public final int f73372a;

        /* renamed from: b */
        public final C7561a<C7581n> f73373b;

        public C27825a() {
            this(0, null, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C27825a) {
                    C27825a aVar = (C27825a) obj;
                    if (!(this.f73372a == aVar.f73372a) || !C7573i.m23585a((Object) this.f73373b, (Object) aVar.f73373b)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f73372a) * 31;
            C7561a<C7581n> aVar = this.f73373b;
            return hashCode + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BottomState(state=");
            sb.append(this.f73372a);
            sb.append(", loadMore=");
            sb.append(this.f73373b);
            sb.append(")");
            return sb.toString();
        }

        public C27825a(int i, C7561a<C7581n> aVar) {
            C7573i.m23587b(aVar, "loadMore");
            this.f73372a = i;
            this.f73373b = aVar;
        }

        public /* synthetic */ C27825a(int i, C7561a aVar, int i2, C7571f fVar) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                aVar = C278261.f73374a;
            }
            this(i, aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.PoiCollectListBottomViewHolder$b */
    public static final class C27827b {
        private C27827b() {
        }

        public /* synthetic */ C27827b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.PoiCollectListBottomViewHolder$c */
    static final class C27828c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Object f73375a;

        C27828c(Object obj) {
            this.f73375a = obj;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ((C27825a) this.f73375a).f73373b.invoke();
        }
    }

    /* renamed from: p */
    private final void m91233p() {
        this.f73370j.mo25942f();
        this.f73371k.setVisibility(8);
    }

    /* renamed from: q */
    private final void m91234q() {
        this.f73370j.mo25944h();
        this.f73371k.setVisibility(0);
    }

    /* renamed from: r */
    private final void m91235r() {
        this.f73370j.mo25943g();
        this.f73371k.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo29209a(C27733b bVar) {
        C7573i.m23587b(bVar, "item");
        if (bVar.f73162b instanceof C27825a) {
            Object obj = bVar.f73162b;
            this.itemView.setOnClickListener(null);
            switch (((C27825a) obj).f73372a) {
                case 1:
                    m91233p();
                    return;
                case 2:
                    m91234q();
                    this.itemView.setOnClickListener(new C27828c(obj));
                    return;
                case 3:
                    m91235r();
                    break;
            }
        }
    }

    public PoiCollectListBottomViewHolder(View view) {
        C7573i.m23587b(view, "view");
        super(view);
        this.f73369f = view;
        View findViewById = this.f73369f.findViewById(R.id.cdg);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.poi_collect_bottom_text)");
        this.f73370j = (DmtStatusView) findViewById;
        View findViewById2 = this.f73369f.findViewById(R.id.cdf);
        C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.poi_collect_bottom_img)");
        this.f73371k = (ImageView) findViewById2;
        View inflate = LayoutInflater.from(this.f73369f.getContext()).inflate(R.layout.b2x, null);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            textView.setText(this.f73369f.getContext().getString(R.string.cjg));
            textView.setTextSize(13.0f);
            textView.setGravity(17);
            Context context = this.f73369f.getContext();
            C7573i.m23582a((Object) context, "view.context");
            textView.setTextColor(context.getResources().getColor(R.color.a1t));
            View inflate2 = LayoutInflater.from(this.f73369f.getContext()).inflate(R.layout.b2z, null);
            if (inflate2 != null) {
                TextView textView2 = (TextView) inflate2;
                textView2.setText(this.f73369f.getContext().getString(R.string.cjf));
                textView.setTextSize(13.0f);
                textView2.setGravity(17);
                Context context2 = this.f73369f.getContext();
                C7573i.m23582a((Object) context2, "view.context");
                textView2.setTextColor(context2.getResources().getColor(R.color.a1t));
                this.f73370j.setBuilder(C10803a.m31631a(this.f73369f.getContext()).mo25963b((View) textView).mo25966c((View) textView2));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }
}
