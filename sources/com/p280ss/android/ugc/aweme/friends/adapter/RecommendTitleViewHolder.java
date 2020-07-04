package com.p280ss.android.ugc.aweme.friends.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.C1642a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.RecommendTitleViewHolder */
public class RecommendTitleViewHolder extends C1293v {

    /* renamed from: a */
    public Context f78968a;

    /* renamed from: b */
    private TextView f78969b;

    /* renamed from: a */
    private void m98460a() {
        String string = this.f78968a.getString(R.string.fh9);
        String a = C1642a.m8034a(this.f78968a.getString(R.string.fha), new Object[]{this.f78968a.getString(R.string.fh9)});
        int indexOf = a.indexOf(string);
        int length = string.length() + indexOf;
        SpannableString spannableString = new SpannableString(a);
        spannableString.setSpan(new ClickableSpan() {
            public final void onClick(View view) {
                ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).goToPrivacyActivity(RecommendTitleViewHolder.this.f78968a);
            }

            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
                textPaint.setColor(RecommendTitleViewHolder.this.f78968a.getResources().getColor(R.color.a04));
            }
        }, indexOf, length, 33);
        this.f78969b.setText(spannableString);
        this.f78969b.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public RecommendTitleViewHolder(View view) {
        super(view);
        this.f78968a = view.getContext();
        this.f78969b = (TextView) view.findViewById(R.id.cpa);
        if (((Boolean) SharePrefCache.inst().getIsEuropeCountry().mo59877d()).booleanValue()) {
            m98460a();
        } else {
            this.f78969b.setVisibility(8);
        }
    }
}
