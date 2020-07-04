package com.p280ss.android.ugc.aweme.sharer.p338ui.bar;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.p280ss.android.p301ug.aweme.sharer.R$styleable;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.ShareChannelBar */
public final class ShareChannelBar extends FrameLayout implements C38379c {

    /* renamed from: a */
    private List<? extends C38343b> f99623a = C7525m.m23461a();

    /* renamed from: b */
    private C38379c f99624b;

    /* renamed from: c */
    private ShareChannelAdapter f99625c;

    /* renamed from: d */
    private final RecyclerView f99626d;

    /* renamed from: a */
    public final void mo95958a(C38379c cVar) {
        C7573i.m23587b(cVar, "listener");
        this.f99624b = cVar;
    }

    /* renamed from: a */
    public final void mo63024a(C38343b bVar) {
        C7573i.m23587b(bVar, "channel");
        C38379c cVar = this.f99624b;
        if (cVar != null) {
            cVar.mo63024a(bVar);
        }
    }

    /* renamed from: a */
    public final void mo95959a(List<? extends C38343b> list) {
        C7573i.m23587b(list, "channels");
        this.f99623a = list;
        this.f99625c.mo95956a(list);
    }

    public ShareChannelBar(Context context, AttributeSet attributeSet) {
        int i;
        C7573i.m23587b(context, "ctx");
        C7573i.m23587b(attributeSet, "attributeSet");
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ShareChannelBar);
        Context context2 = getContext();
        C7573i.m23582a((Object) context2, "context");
        int color = obtainStyledAttributes.getColor(0, context2.getResources().getColor(R.color.a82));
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(getContext());
        if (z) {
            i = R.layout.aad;
        } else {
            i = R.layout.aa9;
        }
        from.inflate(i, this, true);
        View findViewById = findViewById(R.id.v1);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.channel_list)");
        this.f99626d = (RecyclerView) findViewById;
        ShareChannelAdapter shareChannelAdapter = new ShareChannelAdapter(this, false, false, color, z);
        this.f99625c = shareChannelAdapter;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.f99625c.mo95956a(this.f99623a);
        RecyclerView recyclerView = this.f99626d;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f99625c);
    }
}
