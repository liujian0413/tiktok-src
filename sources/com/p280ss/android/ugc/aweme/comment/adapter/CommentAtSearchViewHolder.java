package com.p280ss.android.ugc.aweme.comment.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.challenge.model.Segment;
import com.p280ss.android.ugc.aweme.comment.adapter.CommentAtSearchAdapter.C24037b;
import com.p280ss.android.ugc.aweme.comment.p1103ui.CommentAtAvaterWithVerify;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentAtSearchViewHolder */
public final class CommentAtSearchViewHolder extends C1293v {

    /* renamed from: a */
    public C24037b f63575a;

    /* renamed from: b */
    public SummonFriendItem f63576b;

    /* renamed from: c */
    private Aweme f63577c;

    public CommentAtSearchViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        view.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ CommentAtSearchViewHolder f63578a;

            {
                this.f63578a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                SummonFriendItem summonFriendItem = this.f63578a.f63576b;
                if (summonFriendItem != null) {
                    C24037b bVar = this.f63578a.f63575a;
                    if (bVar != null) {
                        bVar.mo62326a(this.f63578a.getPosition(), summonFriendItem);
                    }
                }
            }
        });
        ((DmtTextView) view.findViewById(R.id.dw6)).setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ CommentAtSearchViewHolder f63579a;

            {
                this.f63579a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                SummonFriendItem summonFriendItem = this.f63579a.f63576b;
                if (summonFriendItem != null) {
                    C24037b bVar = this.f63579a.f63575a;
                    if (bVar != null) {
                        User user = summonFriendItem.mUser;
                        C7573i.m23582a((Object) user, "user");
                        bVar.mo62327a(user);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private final SpannableString m78903a(SpannableString spannableString, int i, int i2) {
        CharSequence charSequence = spannableString;
        if (TextUtils.isEmpty(charSequence)) {
            return spannableString;
        }
        int max = Math.max(0, i);
        if (TextUtils.isEmpty(charSequence) || max > i2 || max >= spannableString.length() || i2 > spannableString.length()) {
            return spannableString;
        }
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        spannableString.setSpan(new ForegroundColorSpan(view.getResources().getColor(R.color.lj)), max, i2, 17);
        return spannableString;
    }

    /* renamed from: a */
    public final void mo62328a(SummonFriendItem summonFriendItem, Aweme aweme, int i, C24037b bVar, int i2, boolean z) {
        String str;
        C7573i.m23587b(summonFriendItem, "item");
        if (summonFriendItem.mUser != null) {
            this.f63575a = bVar;
            this.f63576b = summonFriendItem;
            this.f63577c = aweme;
            if (summonFriendItem.mUser.getNickname() == null) {
                str = "";
            } else {
                str = summonFriendItem.mUser.getNickname();
            }
            SpannableString spannableString = new SpannableString(str);
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            ((C13438a) ((CommentAtAvaterWithVerify) view.findViewById(R.id.czo)).getAvatarImageView().getHierarchy()).mo32891a((int) R.color.l1, C13423b.f35599g);
            View view2 = this.itemView;
            C7573i.m23582a((Object) view2, "itemView");
            CommentAtAvaterWithVerify commentAtAvaterWithVerify = (CommentAtAvaterWithVerify) view2.findViewById(R.id.czo);
            User user = summonFriendItem.mUser;
            C7573i.m23582a((Object) user, "item.user");
            String customVerify = user.getCustomVerify();
            User user2 = summonFriendItem.mUser;
            C7573i.m23582a((Object) user2, "item.user");
            Integer valueOf = Integer.valueOf(user2.getVerificationType());
            User user3 = summonFriendItem.mUser;
            C7573i.m23582a((Object) user3, "item.user");
            UrlModel avatarThumb = user3.getAvatarThumb();
            User user4 = summonFriendItem.mUser;
            C7573i.m23582a((Object) user4, "item.user");
            String weiboVerify = user4.getWeiboVerify();
            User user5 = summonFriendItem.mUser;
            C7573i.m23582a((Object) user5, "item.user");
            UserVerify userVerify = new UserVerify(avatarThumb, customVerify, user5.getEnterpriseVerifyReason(), valueOf, weiboVerify);
            commentAtAvaterWithVerify.setUserData(userVerify);
            if (C6399b.m19945u()) {
                View view3 = this.itemView;
                C7573i.m23582a((Object) view3, "itemView");
                DmtTextView dmtTextView = (DmtTextView) view3.findViewById(R.id.e1z);
                C7573i.m23582a((Object) dmtTextView, "itemView.tv_sign");
                dmtTextView.setVisibility(8);
                View view4 = this.itemView;
                C7573i.m23582a((Object) view4, "itemView");
                DmtTextView dmtTextView2 = (DmtTextView) view4.findViewById(R.id.dyg);
                C7573i.m23582a((Object) dmtTextView2, "itemView.tv_name");
                dmtTextView2.setText(spannableString);
                View view5 = this.itemView;
                C7573i.m23582a((Object) view5, "itemView");
                DmtTextView dmtTextView3 = (DmtTextView) view5.findViewById(R.id.dyg);
                C7573i.m23582a((Object) dmtTextView3, "itemView.tv_name");
                dmtTextView3.setTypeface(Typeface.DEFAULT_BOLD);
                View view6 = this.itemView;
                C7573i.m23582a((Object) view6, "itemView");
                DmtTextView dmtTextView4 = (DmtTextView) view6.findViewById(R.id.dw6);
                C7573i.m23582a((Object) dmtTextView4, "itemView.tv_im");
                dmtTextView4.setVisibility(0);
                View view7 = this.itemView;
                C7573i.m23582a((Object) view7, "itemView");
                DmtTextView dmtTextView5 = (DmtTextView) view7.findViewById(R.id.dut);
                C7573i.m23582a((Object) dmtTextView5, "itemView.tv_following");
                dmtTextView5.setVisibility(8);
                if (z) {
                    View view8 = this.itemView;
                    C7573i.m23582a((Object) view8, "itemView");
                    DmtTextView dmtTextView6 = (DmtTextView) view8.findViewById(R.id.dw6);
                    C7573i.m23582a((Object) dmtTextView6, "itemView.tv_im");
                    dmtTextView6.setVisibility(0);
                    return;
                }
                View view9 = this.itemView;
                C7573i.m23582a((Object) view9, "itemView");
                DmtTextView dmtTextView7 = (DmtTextView) view9.findViewById(R.id.dw6);
                C7573i.m23582a((Object) dmtTextView7, "itemView.tv_im");
                dmtTextView7.setVisibility(8);
                return;
            }
            if (summonFriendItem.segments != null) {
                for (Segment segment : summonFriendItem.segments) {
                    if (segment != null) {
                        spannableString = m78903a(spannableString, segment.begin, segment.end + 1);
                    }
                }
            }
            View view10 = this.itemView;
            C7573i.m23582a((Object) view10, "itemView");
            ((CommentAtAvaterWithVerify) view10.findViewById(R.id.czo)).mo60896b();
            View view11 = this.itemView;
            C7573i.m23582a((Object) view11, "itemView");
            Context context = view11.getContext();
            User user6 = summonFriendItem.mUser;
            C7573i.m23582a((Object) user6, "item.user");
            String customVerify2 = user6.getCustomVerify();
            User user7 = summonFriendItem.mUser;
            C7573i.m23582a((Object) user7, "item.user");
            String enterpriseVerifyReason = user7.getEnterpriseVerifyReason();
            View view12 = this.itemView;
            C7573i.m23582a((Object) view12, "itemView");
            C43126fg.m136801a(context, customVerify2, enterpriseVerifyReason, (DmtTextView) view12.findViewById(R.id.dyg));
            View view13 = this.itemView;
            C7573i.m23582a((Object) view13, "itemView");
            DmtTextView dmtTextView8 = (DmtTextView) view13.findViewById(R.id.dw6);
            C7573i.m23582a((Object) dmtTextView8, "itemView.tv_im");
            dmtTextView8.setVisibility(8);
            View view14 = this.itemView;
            C7573i.m23582a((Object) view14, "itemView");
            DmtTextView dmtTextView9 = (DmtTextView) view14.findViewById(R.id.e1z);
            C7573i.m23582a((Object) dmtTextView9, "itemView.tv_sign");
            dmtTextView9.setVisibility(0);
            View view15 = this.itemView;
            C7573i.m23582a((Object) view15, "itemView");
            DmtTextView dmtTextView10 = (DmtTextView) view15.findViewById(R.id.dyg);
            C7573i.m23582a((Object) dmtTextView10, "itemView.tv_name");
            dmtTextView10.setTypeface(Typeface.DEFAULT);
            User user8 = summonFriendItem.mUser;
            C7573i.m23582a((Object) user8, "item.user");
            if (!C43122ff.m136761a(user8.getFollowStatus()) || i2 != 1) {
                View view16 = this.itemView;
                C7573i.m23582a((Object) view16, "itemView");
                DmtTextView dmtTextView11 = (DmtTextView) view16.findViewById(R.id.dut);
                C7573i.m23582a((Object) dmtTextView11, "itemView.tv_following");
                dmtTextView11.setVisibility(8);
            } else {
                View view17 = this.itemView;
                C7573i.m23582a((Object) view17, "itemView");
                DmtTextView dmtTextView12 = (DmtTextView) view17.findViewById(R.id.dut);
                C7573i.m23582a((Object) dmtTextView12, "itemView.tv_following");
                StringBuilder sb = new StringBuilder(" · ");
                View view18 = this.itemView;
                C7573i.m23582a((Object) view18, "itemView");
                sb.append(view18.getContext().getString(R.string.b92));
                dmtTextView12.setText(sb.toString());
                View view19 = this.itemView;
                C7573i.m23582a((Object) view19, "itemView");
                DmtTextView dmtTextView13 = (DmtTextView) view19.findViewById(R.id.dut);
                C7573i.m23582a((Object) dmtTextView13, "itemView.tv_following");
                dmtTextView13.setVisibility(0);
            }
            if (C6399b.m19946v()) {
                View view20 = this.itemView;
                C7573i.m23582a((Object) view20, "itemView");
                DmtTextView dmtTextView14 = (DmtTextView) view20.findViewById(R.id.e1z);
                C7573i.m23582a((Object) dmtTextView14, "itemView.tv_sign");
                dmtTextView14.setText(spannableString);
                View view21 = this.itemView;
                C7573i.m23582a((Object) view21, "itemView");
                DmtTextView dmtTextView15 = (DmtTextView) view21.findViewById(R.id.dyg);
                C7573i.m23582a((Object) dmtTextView15, "itemView.tv_name");
                dmtTextView15.setText(C43122ff.m136777h(summonFriendItem.mUser));
                return;
            }
            if (C6399b.m19947w()) {
                View view22 = this.itemView;
                C7573i.m23582a((Object) view22, "itemView");
                DmtTextView dmtTextView16 = (DmtTextView) view22.findViewById(R.id.e1z);
                C7573i.m23582a((Object) dmtTextView16, "itemView.tv_sign");
                dmtTextView16.setText(C43122ff.m136777h(summonFriendItem.mUser));
                View view23 = this.itemView;
                C7573i.m23582a((Object) view23, "itemView");
                DmtTextView dmtTextView17 = (DmtTextView) view23.findViewById(R.id.dyg);
                C7573i.m23582a((Object) dmtTextView17, "itemView.tv_name");
                dmtTextView17.setText(spannableString);
            }
        }
    }
}
