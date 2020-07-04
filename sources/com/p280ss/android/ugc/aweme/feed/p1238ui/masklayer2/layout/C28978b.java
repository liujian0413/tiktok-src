package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.layout;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a.C28943c;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a.C28954k;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a.C28955l;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.b */
public final class C28978b extends LinearLayout {

    /* renamed from: a */
    private TextView f76342a = ((TextView) findViewById(R.id.col));

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.b$a */
    static final class C28979a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28955l f76343a;

        /* renamed from: b */
        final /* synthetic */ C28980c f76344b;

        C28979a(C28955l lVar, C28980c cVar) {
            this.f76343a = lVar;
            this.f76344b = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f76343a instanceof C28943c) {
                C28943c cVar = (C28943c) this.f76343a;
                if (cVar != null) {
                    C7573i.m23582a((Object) view, "it");
                    cVar.mo74238a(view, this.f76344b);
                }
            } else if (this.f76343a instanceof C28954k) {
                C28955l lVar = this.f76343a;
                if (lVar != null) {
                    C7573i.m23582a((Object) view, "it");
                    lVar.mo74232b(view);
                }
            }
        }
    }

    public C28978b(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.xi, this);
        int b = (int) C9738o.m28708b(getContext(), 16.0f);
        setPadding(b, 0, b, 0);
        setOrientation(1);
        setBackgroundResource(R.drawable.oo);
        TextView textView = this.f76342a;
        if (textView != null) {
            TextPaint paint = textView.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo74262a(C28980c cVar, C28955l lVar) {
        C7573i.m23587b(cVar, "vo");
        TextView textView = this.f76342a;
        if (textView != null) {
            String str = cVar.f76346b;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        }
        setOnClickListener(new C28979a(lVar, cVar));
    }
}
