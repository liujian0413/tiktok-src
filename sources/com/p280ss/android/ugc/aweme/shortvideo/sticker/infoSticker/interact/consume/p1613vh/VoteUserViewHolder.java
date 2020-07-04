package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1613vh;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.vh.VoteUserViewHolder */
public final class VoteUserViewHolder extends C1293v {

    /* renamed from: a */
    private final CircleImageView f105987a;

    /* renamed from: b */
    private final DmtTextView f105988b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.vh.VoteUserViewHolder$a */
    static final class C40759a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VoteUserViewHolder f105989a;

        /* renamed from: b */
        final /* synthetic */ User f105990b;

        C40759a(VoteUserViewHolder voteUserViewHolder, User user) {
            this.f105989a = voteUserViewHolder;
            this.f105990b = user;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            View view2 = this.f105989a.itemView;
            C7573i.m23582a((Object) view2, "itemView");
            UserProfileActivity.m117392a(view2.getContext(), this.f105990b.getUid(), this.f105990b.getSecUid());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.vh.VoteUserViewHolder$b */
    static final class C40760b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VoteUserViewHolder f105991a;

        /* renamed from: b */
        final /* synthetic */ User f105992b;

        C40760b(VoteUserViewHolder voteUserViewHolder, User user) {
            this.f105991a = voteUserViewHolder;
            this.f105992b = user;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            View view2 = this.f105991a.itemView;
            C7573i.m23582a((Object) view2, "itemView");
            UserProfileActivity.m117392a(view2.getContext(), this.f105992b.getUid(), this.f105992b.getSecUid());
        }
    }

    public VoteUserViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.b9u);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.iv_head)");
        this.f105987a = (CircleImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.dyg);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.tv_name)");
        this.f105988b = (DmtTextView) findViewById2;
    }

    /* renamed from: a */
    public final void mo100990a(User user) {
        C7573i.m23587b(user, "user");
        C23323e.m76524b(this.f105987a, user.getAvatarMedium());
        this.f105988b.setText(C43122ff.m136756a(user, true));
        this.f105987a.setOnClickListener(new C40759a(this, user));
        this.f105988b.setOnClickListener(new C40760b(this, user));
    }
}
