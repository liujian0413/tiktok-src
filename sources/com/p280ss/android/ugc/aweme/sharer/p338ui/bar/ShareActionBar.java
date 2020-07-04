package com.p280ss.android.ugc.aweme.sharer.p338ui.bar;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7585d;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.ShareActionBar */
public final class ShareActionBar extends FrameLayout implements C38378b {

    /* renamed from: a */
    private List<? extends C38389f> f99606a = C7525m.m23461a();

    /* renamed from: b */
    private C38378b f99607b;

    /* renamed from: c */
    private final ShareActionAdapter f99608c;

    /* renamed from: d */
    private final RecyclerView f99609d;

    /* renamed from: e */
    private final LinearLayoutManager f99610e;

    /* renamed from: f */
    private final Set<String> f99611f = new LinkedHashSet();

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.ShareActionBar$a */
    static final /* synthetic */ class C38375a extends FunctionReference implements C7561a<C7581n> {
        C38375a(ShareActionBar shareActionBar) {
            super(0, shareActionBar);
        }

        public final String getName() {
            return "filterVisible";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(ShareActionBar.class);
        }

        public final String getSignature() {
            return "filterVisible()V";
        }

        /* renamed from: a */
        private void m122580a() {
            ((ShareActionBar) this.receiver).mo95951a();
        }

        public final /* synthetic */ Object invoke() {
            m122580a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: b */
    public final void mo95954b() {
        if (!this.f99606a.isEmpty()) {
            this.f99609d.mo5561d(this.f99606a.size() - 1);
        }
    }

    /* renamed from: a */
    public final void mo95951a() {
        boolean z;
        Collection collection = this.f99606a;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int l = this.f99610e.mo5447l();
            int j = this.f99610e.mo5445j();
            if (l >= 0 && j >= 0 && j <= l) {
                while (true) {
                    C38389f fVar = (C38389f) this.f99606a.get(j);
                    if (!this.f99611f.contains(fVar.mo95715b())) {
                        this.f99611f.add(fVar.mo95715b());
                        Context context = getContext();
                        C7573i.m23582a((Object) context, "context");
                        fVar.mo95711a(context);
                    }
                    if (j == l) {
                        break;
                    }
                    j++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo95952a(C38378b bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f99607b = bVar;
    }

    /* renamed from: a */
    public final void mo95944a(C38389f fVar) {
        C7573i.m23587b(fVar, "action");
        C38378b bVar = this.f99607b;
        if (bVar != null) {
            bVar.mo95944a(fVar);
        }
    }

    /* renamed from: a */
    public final void mo95953a(List<? extends C38389f> list) {
        C7573i.m23587b(list, "actions");
        this.f99606a = list;
        this.f99608c.mo95949a(list);
    }

    public ShareActionBar(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "ctx");
        C7573i.m23587b(attributeSet, "attributeSet");
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R.layout.aa6, this, true);
        View findViewById = findViewById(R.id.ag);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.action_list)");
        this.f99609d = (RecyclerView) findViewById;
        this.f99608c = new ShareActionAdapter(this);
        this.f99610e = new LinearLayoutManager(context, 0, false);
        this.f99608c.mo95949a(this.f99606a);
        RecyclerView recyclerView = this.f99609d;
        recyclerView.setLayoutManager(this.f99610e);
        recyclerView.setAdapter(this.f99608c);
        recyclerView.mo5528a((C1281m) new ShareActionBar$$special$$inlined$apply$lambda$1(this));
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postDelayed(new C38377a(new C38375a(this)), 300);
    }
}
