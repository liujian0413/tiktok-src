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

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.MicroShareChannelBar */
public final class MicroShareChannelBar extends FrameLayout implements C38379c {

    /* renamed from: a */
    private List<? extends C38343b> f99594a = C7525m.m23461a();

    /* renamed from: b */
    private C38379c f99595b;

    /* renamed from: c */
    private final ShareChannelAdapter f99596c;

    /* renamed from: d */
    private final RecyclerView f99597d;

    /* renamed from: a */
    public final void mo95947a(C38379c cVar) {
        C7573i.m23587b(cVar, "listener");
        this.f99595b = cVar;
    }

    /* renamed from: a */
    public final void mo63024a(C38343b bVar) {
        C7573i.m23587b(bVar, "channel");
        C38379c cVar = this.f99595b;
        if (cVar != null) {
            cVar.mo63024a(bVar);
        }
    }

    /* renamed from: a */
    public final void mo95948a(List<? extends C38343b> list) {
        C7573i.m23587b(list, "channels");
        this.f99594a = list;
        this.f99596c.mo95956a(list);
    }

    public MicroShareChannelBar(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "ctx");
        C7573i.m23587b(attributeSet, "attributeSet");
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MicroShareChannelBar);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.aac, this, true);
        View findViewById = findViewById(R.id.v1);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.channel_list)");
        this.f99597d = (RecyclerView) findViewById;
        ShareChannelAdapter shareChannelAdapter = new ShareChannelAdapter(this, true, z, 0, false, 24, null);
        this.f99596c = shareChannelAdapter;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.f99596c.mo95956a(this.f99594a);
        RecyclerView recyclerView = this.f99597d;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f99596c);
    }
}
