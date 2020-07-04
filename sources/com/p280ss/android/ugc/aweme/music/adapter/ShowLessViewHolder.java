package com.p280ss.android.ugc.aweme.music.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.ShowLessViewHolder */
public class ShowLessViewHolder extends C1293v {
    LinearLayout tvShowLess;

    public ShowLessViewHolder(View view, final C33742b bVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.tvShowLess.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                bVar.mo86140a(ShowLessViewHolder.this);
            }
        });
    }
}
