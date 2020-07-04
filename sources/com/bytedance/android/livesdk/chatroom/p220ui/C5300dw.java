package com.bytedance.android.livesdk.chatroom.p220ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.p029v7.widget.GridLayoutManager.C1241a;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3387g;
import com.bytedance.android.livesdk.chatroom.event.C4417ai;
import com.bytedance.android.livesdk.chatroom.model.C4883ap;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdkapi.depend.model.live.C9379p;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dw */
public final class C5300dw extends Dialog implements C5162b {

    /* renamed from: a */
    public RoomDecorationListAdapter f15505a;

    /* renamed from: b */
    private RecyclerView f15506b;

    /* renamed from: c */
    private boolean f15507c;

    /* renamed from: d */
    private C4883ap f15508d;

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        this.f15507c = false;
    }

    /* renamed from: a */
    private void m16969a() {
        this.f15506b = (RecyclerView) findViewById(R.id.a6l);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        this.f15507c = true;
        m16972b();
    }

    /* renamed from: b */
    private void m16972b() {
        if (this.f15508d == null) {
            m16971a(new Throwable("mRoomDecorationList is null "));
        } else {
            m16970a(this.f15508d);
        }
    }

    /* renamed from: a */
    private void m16971a(Throwable th) {
        if (this.f15507c) {
            dismiss();
        }
    }

    /* renamed from: a */
    private void m16970a(C4883ap apVar) {
        if (this.f15507c) {
            if (this.f15505a == null) {
                this.f15505a = new RoomDecorationListAdapter(apVar, this);
                SSGridLayoutManager sSGridLayoutManager = new SSGridLayoutManager(getContext(), 3, 1, false);
                sSGridLayoutManager.f4721g = new C1241a() {
                    /* renamed from: a */
                    public final int mo5386a(int i) {
                        switch (C5300dw.this.f15505a.getItemViewType(i)) {
                            case 1:
                            case 2:
                                return 3;
                            case 3:
                            case 4:
                                return 1;
                            default:
                                return 1;
                        }
                    }
                };
                this.f15506b.setLayoutManager(sSGridLayoutManager);
                this.f15506b.setAdapter(this.f15505a);
            }
            this.f15505a.mo13406a(apVar);
        }
    }

    /* renamed from: a */
    public final void mo13409a(C9379p pVar) {
        dismiss();
        C9097a.m27146a().mo22267a((Object) new C4417ai(pVar));
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.aox);
        Window window = getWindow();
        if (window != null) {
            if (C3358ac.m12529f()) {
                window.setLayout(-1, -2);
                window.setGravity(80);
            } else {
                window.setLayout(C3358ac.m12510a(392.0f), -1);
                window.setGravity(5);
                if (Build.BRAND.toLowerCase().equals("xiaomi") && C3387g.m12599a(getContext())) {
                    View findViewById = findViewById(R.id.a19);
                    ((LayoutParams) findViewById.getLayoutParams()).topMargin = C3358ac.m12510a(40.0f);
                    findViewById.requestLayout();
                }
            }
        }
        m16969a();
    }

    public C5300dw(Context context, int i, C4883ap apVar) {
        super(context, i);
        this.f15508d = apVar;
    }
}
