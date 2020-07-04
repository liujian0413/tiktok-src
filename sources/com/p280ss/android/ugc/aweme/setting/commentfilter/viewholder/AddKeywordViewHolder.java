package com.p280ss.android.ugc.aweme.setting.commentfilter.viewholder;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27009an;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.viewholder.AddKeywordViewHolder */
public final class AddKeywordViewHolder extends C1293v {

    /* renamed from: a */
    public long f98073a;

    /* renamed from: b */
    public final View f98074b;

    /* renamed from: c */
    public final ImageView f98075c;

    /* renamed from: d */
    public final View f98076d;

    /* renamed from: e */
    public final OnClickListener f98077e;

    public AddKeywordViewHolder(View view, OnClickListener onClickListener) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(onClickListener, "listener");
        super(view);
        this.f98076d = view;
        this.f98077e = onClickListener;
        View findViewById = this.f98076d.findViewById(R.id.a9n);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.div)");
        this.f98074b = findViewById;
        View findViewById2 = this.f98076d.findViewById(R.id.ax9);
        C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.icon)");
        this.f98075c = (ImageView) findViewById2;
        View view2 = this.f98074b;
        Context context = this.f98076d.getContext();
        C7573i.m23582a((Object) context, "view.context");
        view2.setBackgroundColor(context.getResources().getColor(R.color.le));
        this.f98075c.setImageResource(R.drawable.as8);
        this.f98076d.setOnTouchListener(new C27009an(this) {

            /* renamed from: a */
            final /* synthetic */ AddKeywordViewHolder f98078a;

            {
                this.f98078a = r1;
            }

            /* renamed from: b */
            public final void mo67959b(View view, MotionEvent motionEvent) {
                C7573i.m23587b(view, "view");
                C7573i.m23587b(motionEvent, "event");
                if (System.currentTimeMillis() - this.f98078a.f98073a >= 500) {
                    this.f98078a.f98073a = System.currentTimeMillis();
                    view.requestFocus();
                    this.f98078a.f98077e.onClick(view);
                }
            }
        });
    }
}
