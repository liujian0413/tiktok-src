package com.p280ss.android.ugc.aweme.notification.newstyle.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.notification.util.C34615d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.adapter.GroupFilterViewHolder */
public final class GroupFilterViewHolder extends C1293v {

    /* renamed from: a */
    private final View f89991a;

    /* renamed from: b */
    private final ImageView f89992b;

    /* renamed from: c */
    private final TextView f89993c;

    /* renamed from: d */
    private final ImageView f89994d;

    /* renamed from: e */
    private final ImageView f89995e;

    public GroupFilterViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.wc);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.cl_notification_root)");
        this.f89991a = findViewById;
        View findViewById2 = view.findViewById(R.id.ax4);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.ic_notification_group)");
        this.f89992b = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.dyt);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.tv_notification_group)");
        this.f89993c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ax5);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.…ic_notification_selector)");
        this.f89994d = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.bap);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.….iv_notification_red_dot)");
        this.f89995e = (ImageView) findViewById5;
        C34615d.m111861a(this.f89991a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x007b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87811a(com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34355d r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "groupFilterStruct"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            android.widget.ImageView r0 = r5.f89992b
            int r1 = r6.f89530c
            r0.setImageResource(r1)
            android.widget.TextView r0 = r5.f89993c
            android.view.View r1 = r5.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            android.content.Context r1 = r1.getContext()
            int r2 = r6.f89529b
            java.lang.String r1 = r1.getString(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            int r0 = r6.f89528a
            r1 = 8
            r2 = 0
            if (r0 != r7) goto L_0x003d
            android.widget.ImageView r6 = r5.f89992b
            r7 = 1065353216(0x3f800000, float:1.0)
            r6.setAlpha(r7)
            android.widget.TextView r6 = r5.f89993c
            r6.setAlpha(r7)
            android.widget.ImageView r6 = r5.f89994d
            r6.setVisibility(r2)
            goto L_0x0081
        L_0x003d:
            android.widget.ImageView r0 = r5.f89992b
            r3 = 1056964608(0x3f000000, float:0.5)
            r0.setAlpha(r3)
            android.widget.TextView r0 = r5.f89993c
            r0.setAlpha(r3)
            android.widget.ImageView r0 = r5.f89994d
            r0.setVisibility(r1)
            r0 = 36
            r3 = 1
            if (r7 != r0) goto L_0x0055
        L_0x0053:
            r6 = 0
            goto L_0x0079
        L_0x0055:
            int r4 = r6.f89528a
            if (r4 != r0) goto L_0x006f
            int[] r6 = new int[r3]
            r6[r2] = r7
            int r6 = com.p280ss.android.ugc.aweme.notice.api.C34315c.m110974a(r6)
            int[] r7 = new int[r3]
            r7[r2] = r0
            int r7 = com.p280ss.android.ugc.aweme.notice.api.C34315c.m110974a(r7)
            if (r7 <= 0) goto L_0x0053
            if (r7 <= r6) goto L_0x0053
            r6 = 1
            goto L_0x0079
        L_0x006f:
            int[] r7 = new int[r3]
            int r6 = r6.f89528a
            r7[r2] = r6
            boolean r6 = com.p280ss.android.ugc.aweme.notice.api.C34315c.m110982b(r7)
        L_0x0079:
            if (r6 == 0) goto L_0x0081
            android.widget.ImageView r6 = r5.f89995e
            r6.setVisibility(r2)
            return
        L_0x0081:
            android.widget.ImageView r6 = r5.f89995e
            r6.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notification.newstyle.adapter.GroupFilterViewHolder.mo87811a(com.ss.android.ugc.aweme.notice.repo.list.bean.d, int):void");
    }
}
