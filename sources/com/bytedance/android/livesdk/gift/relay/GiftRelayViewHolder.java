package com.bytedance.android.livesdk.gift.relay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.relay.p392a.C8271c;
import com.bytedance.android.livesdk.gift.relay.p392a.C8271c.C8272a;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class GiftRelayViewHolder extends C1293v {

    /* renamed from: a */
    public C8267a f22687a;

    /* renamed from: b */
    private View f22688b;

    /* renamed from: c */
    private HSImageView f22689c;

    /* renamed from: d */
    private HSImageView f22690d;

    /* renamed from: e */
    private HSImageView f22691e;

    /* renamed from: f */
    private TextView f22692f;

    /* renamed from: g */
    private TextView f22693g;

    /* renamed from: h */
    private C8271c f22694h;

    /* renamed from: com.bytedance.android.livesdk.gift.relay.GiftRelayViewHolder$a */
    public interface C8267a {
        /* renamed from: a */
        void mo21406a(GiftRelayViewHolder giftRelayViewHolder, C8272a aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo21420a(boolean z) {
        int i;
        View view = this.f22688b;
        Resources resources = this.itemView.getContext().getResources();
        if (z) {
            i = R.drawable.c24;
        } else {
            i = R.drawable.c25;
        }
        view.setBackgroundDrawable(resources.getDrawable(i));
    }

    /* renamed from: a */
    public final void mo21418a(C8272a aVar) {
        int i;
        if (aVar != null && this.f22694h != null) {
            Context context = this.itemView.getContext();
            mo21420a(aVar.f22721g);
            C5343e.m17038a(this.f22689c, aVar.f22718d);
            C5343e.m17038a(this.f22690d, aVar.f22719e);
            if (aVar.f22716b == 500) {
                C5343e.m17038a(this.f22691e, aVar.f22720f);
            } else {
                this.f22691e.setVisibility(8);
            }
            this.f22692f.setText(aVar.f22715a);
            C8149d findGiftById = GiftManager.inst().findGiftById(this.f22694h.f22712c);
            if (findGiftById != null) {
                i = findGiftById.f22235f;
            } else {
                i = 0;
            }
            this.f22693g.setText(String.valueOf(aVar.f22716b * i));
            Drawable drawable = context.getResources().getDrawable(R.drawable.c41);
            drawable.setBounds(new Rect(0, 0, (int) C9051ar.m27035b(context, 12.0f), (int) C9738o.m28708b(context, 12.0f)));
            if (C3519c.m12965a(context)) {
                this.f22693g.setCompoundDrawables(null, null, drawable, null);
            } else {
                this.f22693g.setCompoundDrawables(drawable, null, null, null);
            }
            this.itemView.setOnClickListener(new C8279g(this, aVar));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21419a(C8272a aVar, View view) {
        if (this.f22687a != null) {
            this.f22687a.mo21406a(this, aVar);
        }
    }

    public GiftRelayViewHolder(View view, C8271c cVar) {
        super(view);
        this.f22688b = view.findViewById(R.id.arm);
        this.f22689c = (HSImageView) view.findViewById(R.id.arv);
        this.f22690d = (HSImageView) view.findViewById(R.id.arq);
        this.f22691e = (HSImageView) view.findViewById(R.id.ar7);
        this.f22692f = (TextView) view.findViewById(R.id.arr);
        this.f22693g = (TextView) view.findViewById(R.id.art);
        this.f22694h = cVar;
        LayoutParams layoutParams = this.f22688b.getLayoutParams();
        if (layoutParams != null) {
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            layoutParams.width = ((point.x - ((int) C9051ar.m27035b(view.getContext(), 28.0f))) / 3) - ((int) C9051ar.m27035b(view.getContext(), 4.0f));
            this.f22688b.setLayoutParams(layoutParams);
        }
    }
}
