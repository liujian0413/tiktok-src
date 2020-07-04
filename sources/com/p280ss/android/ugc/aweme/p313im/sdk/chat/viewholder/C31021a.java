package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.selectmsg.C30997a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.a */
final /* synthetic */ class C31021a implements OnCheckedChangeListener {

    /* renamed from: a */
    private final BaseViewHolder f81433a;

    /* renamed from: b */
    private final C30997a f81434b;

    C31021a(BaseViewHolder baseViewHolder, C30997a aVar) {
        this.f81433a = baseViewHolder;
        this.f81434b = aVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f81433a.mo81432a(this.f81434b, compoundButton, z);
    }
}
