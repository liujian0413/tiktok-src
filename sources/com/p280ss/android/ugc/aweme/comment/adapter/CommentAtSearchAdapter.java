package com.p280ss.android.ugc.aweme.comment.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.comment.p1103ui.CommentAtSearchLoadingView;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentAtSearchAdapter */
public final class CommentAtSearchAdapter extends BaseAdapter<SummonFriendItem> {

    /* renamed from: d */
    public static final C24036a f63568d = new C24036a(null);

    /* renamed from: a */
    public C24037b f63569a;

    /* renamed from: b */
    public int f63570b;

    /* renamed from: c */
    public boolean f63571c;

    /* renamed from: e */
    private CommentAtSearchLoadingView f63572e;

    /* renamed from: f */
    private final Aweme f63573f;

    /* renamed from: g */
    private final boolean f63574g;

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentAtSearchAdapter$a */
    public static final class C24036a {
        private C24036a() {
        }

        public /* synthetic */ C24036a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentAtSearchAdapter$b */
    public interface C24037b {
        /* renamed from: a */
        void mo62326a(int i, SummonFriendItem summonFriendItem);

        /* renamed from: a */
        void mo62327a(User user);
    }

    public final void ag_() {
        super.ag_();
        CommentAtSearchLoadingView commentAtSearchLoadingView = this.f63572e;
        if (commentAtSearchLoadingView != null) {
            commentAtSearchLoadingView.mo63060a(true);
        }
    }

    public final void ai_() {
        super.ai_();
        CommentAtSearchLoadingView commentAtSearchLoadingView = this.f63572e;
        if (commentAtSearchLoadingView != null) {
            commentAtSearchLoadingView.mo63060a(false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* renamed from: a_ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.support.p029v7.widget.RecyclerView.C1293v mo61886a_(android.view.ViewGroup r11) {
        /*
            r10 = this;
            android.support.v7.widget.RecyclerView$v r0 = super.mo61886a_(r11)
            android.view.View r1 = r0.itemView
            if (r1 == 0) goto L_0x0072
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = (com.bytedance.ies.dmt.p262ui.widget.DmtStatusView) r1
            r2 = 0
            if (r11 == 0) goto L_0x001e
            android.content.Context r4 = r11.getContext()
            if (r4 == 0) goto L_0x001e
            com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLoadingView r9 = new com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLoadingView
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x001f
        L_0x001e:
            r9 = r2
        L_0x001f:
            r10.f63572e = r9
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r3 = r1.mo25937c()
            com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLoadingView r4 = r10.f63572e
            android.view.View r4 = (android.view.View) r4
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r3 = r3.mo25960a(r4)
            r1.setBuilder(r3)
            r3 = 2
            android.view.View r1 = r1.mo25935b(r3)
            if (r1 == 0) goto L_0x006a
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r11 == 0) goto L_0x0048
            android.content.Context r11 = r11.getContext()
            if (r11 == 0) goto L_0x0048
            r2 = 2131824426(0x7f110f2a, float:1.928168E38)
            java.lang.String r2 = r11.getString(r2)
        L_0x0048:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            android.content.Context r11 = r1.getContext()
            java.lang.String r2 = "errorView.context"
            kotlin.jvm.internal.C7573i.m23582a(r11, r2)
            android.content.res.Resources r11 = r11.getResources()
            r2 = 2131100117(0x7f0601d5, float:1.7812606E38)
            int r11 = r11.getColor(r2)
            r1.setTextColor(r11)
            java.lang.String r11 = "footer"
            kotlin.jvm.internal.C7573i.m23582a(r0, r11)
            return r0
        L_0x006a:
            kotlin.TypeCastException r11 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            r11.<init>(r0)
            throw r11
        L_0x0072:
            kotlin.TypeCastException r11 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.adapter.CommentAtSearchAdapter.mo61886a_(android.view.ViewGroup):android.support.v7.widget.RecyclerView$v");
    }

    public CommentAtSearchAdapter(Aweme aweme, boolean z) {
        this.f63573f = aweme;
        this.f63574g = z;
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.a2b, viewGroup, false);
        C7573i.m23582a((Object) inflate, "view");
        return new CommentAtSearchViewHolder(inflate);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        boolean z;
        if (vVar != null) {
            CommentAtSearchViewHolder commentAtSearchViewHolder = (CommentAtSearchViewHolder) vVar;
            Object obj = this.f67539l.get(i);
            C7573i.m23582a(obj, "mItems[position]");
            SummonFriendItem summonFriendItem = (SummonFriendItem) obj;
            Aweme aweme = this.f63573f;
            C24037b bVar = this.f63569a;
            int i2 = this.f63570b;
            if (!this.f63574g || !this.f63571c) {
                z = false;
            } else {
                z = true;
            }
            commentAtSearchViewHolder.mo62328a(summonFriendItem, aweme, i, bVar, i2, z);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.comment.adapter.CommentAtSearchViewHolder");
    }
}
