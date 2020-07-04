package com.bytedance.android.livesdk.rank.adapter;

import android.graphics.drawable.Drawable;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3385e;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4855f;
import com.bytedance.android.livesdk.chatroom.widget.AvatarIconView;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.widget.C9238b;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

public class LinkRankAdapter extends C1262a<C8814a> {

    /* renamed from: a */
    private List<C4855f> f23954a;

    /* renamed from: b */
    private OnClickListener f23955b = C8815a.f23962a;

    /* renamed from: com.bytedance.android.livesdk.rank.adapter.LinkRankAdapter$a */
    static class C8814a extends C1293v {

        /* renamed from: a */
        public ImageView f23956a;

        /* renamed from: b */
        public View f23957b;

        /* renamed from: c */
        public TextView f23958c;

        /* renamed from: d */
        public AvatarIconView f23959d;

        /* renamed from: e */
        public TextView f23960e;

        /* renamed from: f */
        public TextView f23961f;

        C8814a(View view) {
            super(view);
            this.f23957b = view;
            this.f23956a = (ImageView) view.findViewById(R.id.bbc);
            this.f23958c = (TextView) view.findViewById(R.id.cn4);
            this.f23959d = (AvatarIconView) view.findViewById(R.id.ic);
            this.f23960e = (TextView) view.findViewById(R.id.c33);
            this.f23961f = (TextView) view.findViewById(R.id.cz4);
        }
    }

    public int getItemCount() {
        if (C6311g.m19573a(this.f23954a)) {
            return 0;
        }
        return this.f23954a.size();
    }

    public LinkRankAdapter(List<C4855f> list) {
        this.f23954a = list;
    }

    /* renamed from: a */
    static final /* synthetic */ void m26419a(View view) {
        if (view.getTag() != null && (view.getTag() instanceof User)) {
            C9097a.m27146a().mo22267a((Object) new UserProfileEvent((User) view.getTag(), "guest_contribution_list"));
        }
    }

    public /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m26418a(viewGroup, i);
    }

    /* renamed from: a */
    private static C8814a m26418a(ViewGroup viewGroup, int i) {
        return new C8814a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ax0, null));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C8814a aVar, int i) {
        if (!C6311g.m19573a(this.f23954a)) {
            C4855f fVar = (C4855f) this.f23954a.get(i);
            if (fVar != null) {
                aVar.f23958c.setText(String.valueOf(fVar.f13884c));
                if (fVar.f13884c <= 3) {
                    aVar.f23958c.setVisibility(8);
                    aVar.f23956a.setVisibility(0);
                    if (fVar.f13884c == 1) {
                        aVar.f23956a.setImageResource(R.drawable.c5q);
                    } else if (fVar.f13884c == 2) {
                        aVar.f23956a.setImageResource(R.drawable.c5r);
                    } else if (fVar.f13884c == 3) {
                        aVar.f23956a.setImageResource(R.drawable.c5s);
                    }
                } else {
                    aVar.f23958c.setVisibility(0);
                    aVar.f23956a.setVisibility(8);
                }
                User user = fVar.f13882a;
                if (user != null) {
                    aVar.f23957b.setTag(user);
                    aVar.f23957b.setOnClickListener(this.f23955b);
                    aVar.f23959d.setAvatar(user.getAvatarThumb());
                    if (user.getUserHonor() != null) {
                        aVar.f23959d.setIcon(user.getUserHonor().mo8708l());
                    }
                    aVar.f23960e.setText(user.getNickName());
                }
                String c = C3385e.m12593c(fVar.f13883b);
                StringBuilder sb = new StringBuilder("  ");
                sb.append(c);
                SpannableString spannableString = new SpannableString(sb.toString());
                int b = (int) C9738o.m28708b(C3358ac.m12528e(), 16.0f);
                Drawable drawable = C3358ac.m12528e().getResources().getDrawable(R.drawable.c6f);
                drawable.setBounds(0, 0, b, b);
                spannableString.setSpan(new C9238b(drawable), 0, 1, 33);
                aVar.f23961f.setText(spannableString);
            }
        }
    }
}
