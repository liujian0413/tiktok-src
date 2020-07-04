package com.p280ss.android.ugc.aweme.favorites.adapter;

import android.view.View;
import android.widget.TextView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.favorites.adapter.PoiCollectListHeadViewHolder */
public final class PoiCollectListHeadViewHolder extends JediSimpleViewHolder<C27733b> {

    /* renamed from: g */
    public static final C27721a f73098g = new C27721a(null);

    /* renamed from: f */
    public final View f73099f;

    /* renamed from: com.ss.android.ugc.aweme.favorites.adapter.PoiCollectListHeadViewHolder$a */
    public static final class C27721a {
        private C27721a() {
        }

        public /* synthetic */ C27721a(C7571f fVar) {
            this();
        }
    }

    public PoiCollectListHeadViewHolder(View view) {
        C7573i.m23587b(view, "view");
        super(view);
        this.f73099f = view;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo29209a(C27733b bVar) {
        C7573i.m23587b(bVar, "item");
        if (bVar.f73162b instanceof Integer) {
            TextView textView = (TextView) this.f73099f.findViewById(R.id.bne);
            Object obj = bVar.f73162b;
            if (C7573i.m23585a(obj, (Object) Integer.valueOf(0))) {
                C7573i.m23582a((Object) textView, "textView");
                textView.setText(this.f73099f.getContext().getString(R.string.cjh));
            } else if (C7573i.m23585a(obj, (Object) Integer.valueOf(1))) {
                C7573i.m23582a((Object) textView, "textView");
                textView.setText(this.f73099f.getContext().getString(R.string.dil));
            }
        }
    }
}
