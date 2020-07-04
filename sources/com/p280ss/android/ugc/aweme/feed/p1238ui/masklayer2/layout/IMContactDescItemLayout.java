package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.layout;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.IMContactDescItemLayout */
public final class IMContactDescItemLayout extends LinearLayout {

    /* renamed from: a */
    private TextView f76331a;

    /* renamed from: b */
    private RemoteImageView f76332b;

    public IMContactDescItemLayout(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.xf, this);
        if (C6399b.m19944t()) {
            int b = (int) C9738o.m28708b(getContext(), 12.0f);
            setPadding(b, b, b, b);
        } else {
            int b2 = (int) C9738o.m28708b(getContext(), 16.0f);
            int b3 = (int) C9738o.m28708b(getContext(), 14.0f);
            setPadding(b3, b2, b3, b2);
        }
        setGravity(16);
        this.f76331a = (TextView) findViewById(R.id.a7e);
        TextView textView = this.f76331a;
        if (textView != null) {
            TextPaint paint = textView.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(true);
            }
        }
        this.f76332b = (RemoteImageView) findViewById(R.id.ax9);
    }

    /* renamed from: a */
    public final void mo74257a(IMContact iMContact) {
        C7573i.m23587b(iMContact, "contact");
        C23323e.m76524b(this.f76332b, iMContact.getDisplayAvatar());
        TextView textView = this.f76331a;
        if (textView != null) {
            StringBuilder sb = new StringBuilder();
            Context context = getContext();
            C7573i.m23582a((Object) context, "context");
            sb.append(context.getResources().getText(R.string.a2j).toString());
            sb.append(": ");
            sb.append(iMContact.getDisplayName());
            textView.setText(sb.toString());
        }
    }

    public IMContactDescItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), R.layout.xf, this);
        if (C6399b.m19944t()) {
            int b = (int) C9738o.m28708b(getContext(), 12.0f);
            setPadding(b, b, b, b);
        } else {
            int b2 = (int) C9738o.m28708b(getContext(), 16.0f);
            int b3 = (int) C9738o.m28708b(getContext(), 14.0f);
            setPadding(b3, b2, b3, b2);
        }
        setGravity(16);
        this.f76331a = (TextView) findViewById(R.id.a7e);
        TextView textView = this.f76331a;
        if (textView != null) {
            TextPaint paint = textView.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(true);
            }
        }
        this.f76332b = (RemoteImageView) findViewById(R.id.ax9);
    }

    public IMContactDescItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(getContext(), R.layout.xf, this);
        if (C6399b.m19944t()) {
            int b = (int) C9738o.m28708b(getContext(), 12.0f);
            setPadding(b, b, b, b);
        } else {
            int b2 = (int) C9738o.m28708b(getContext(), 16.0f);
            int b3 = (int) C9738o.m28708b(getContext(), 14.0f);
            setPadding(b3, b2, b3, b2);
        }
        setGravity(16);
        this.f76331a = (TextView) findViewById(R.id.a7e);
        TextView textView = this.f76331a;
        if (textView != null) {
            TextPaint paint = textView.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(true);
            }
        }
        this.f76332b = (RemoteImageView) findViewById(R.id.ax9);
    }
}
