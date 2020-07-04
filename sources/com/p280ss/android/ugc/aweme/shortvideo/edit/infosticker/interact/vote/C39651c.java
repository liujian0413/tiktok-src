package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.StickerHelpBoxView;
import com.p280ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.c */
public final class C39651c extends InteractStickerBaseView {

    /* renamed from: k */
    float f103111k;

    /* renamed from: l */
    private int f103112l;

    /* renamed from: m */
    private int f103113m;

    /* renamed from: n */
    private float f103114n = 28.0f;

    /* renamed from: o */
    private int f103115o;

    /* renamed from: p */
    private VotingStickerView f103116p;

    /* renamed from: q */
    private float f103117q;

    /* renamed from: g */
    public final boolean mo98828g() {
        return true;
    }

    public final VotingStickerView getBaseView() {
        return this.f103116p;
    }

    /* renamed from: a */
    public final void mo98753a() {
        this.f103111k = (float) this.f102973g.getMeasuredHeight();
    }

    /* renamed from: b */
    private void m126963b() {
        LayoutInflater.from(this.f102967a).inflate(R.layout.aaz, this);
        this.f102972f = (StickerHelpBoxView) findViewById(R.id.db1);
        this.f102973g = findViewById(R.id.a24);
    }

    /* renamed from: a */
    public final void mo98941a(VotingStickerView votingStickerView) {
        if (votingStickerView != null) {
            this.f103116p = votingStickerView;
            ((ViewGroup) this.f102973g).removeAllViews();
            ((ViewGroup) this.f102973g).addView(votingStickerView);
        }
    }

    public C39651c(Context context) {
        super(context);
        this.f102967a = context;
        this.f103113m = (int) C9738o.m28708b(context, 32.0f);
        this.f103112l = C9738o.m28691a(context) - this.f103113m;
        this.f103115o = this.f103112l;
        this.f103114n = C9738o.m28708b(context, 28.0f);
        this.f103117q = C9738o.m28708b(context, 96.0f);
        m126963b();
    }

    /* renamed from: a */
    public final void mo98942a(VoteStruct voteStruct) {
        if (this.f103116p == null) {
            this.f103116p = new VotingStickerView(getContext());
            this.f103116p.setTouchEnable(true);
            this.f103116p.setEditEnable(false);
            if (voteStruct != null && !C6307b.m19566a((Collection<T>) voteStruct.getOptions())) {
                this.f103116p.mo98910a(voteStruct);
            }
            this.f103116p.mo98912b();
        }
        ((ViewGroup) this.f102973g).removeAllViews();
        ((ViewGroup) this.f102973g).addView(this.f103116p);
    }

    /* renamed from: b */
    public final float mo98943b(VotingStickerView votingStickerView) {
        float height = (this.f103111k - ((float) this.f103116p.getHeight())) * this.f102968b;
        if (height >= 0.0f || !C6319n.m19593a(votingStickerView.getVoteStruct().getQuestion())) {
            return height / 2.0f;
        }
        return height;
    }
}
