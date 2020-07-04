package com.p280ss.android.ugc.aweme.emoji.miniemojichoose;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.emoji.base.C27517a;
import com.p280ss.android.ugc.aweme.emoji.base.C27524h;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.miniemojichoose.MiniEmojiAdapter */
public class MiniEmojiAdapter extends C1262a<EmojiViewHolder> {

    /* renamed from: a */
    private ArrayList<C27517a> f72751a = new ArrayList<>();

    /* renamed from: b */
    private C27524h f72752b;

    /* renamed from: com.ss.android.ugc.aweme.emoji.miniemojichoose.MiniEmojiAdapter$EmojiViewHolder */
    public static final class EmojiViewHolder extends C1293v implements OnClickListener {

        /* renamed from: a */
        private RemoteImageView f72753a;

        /* renamed from: b */
        private C27524h f72754b;

        /* renamed from: c */
        private C27517a f72755c;

        /* renamed from: a */
        public final void mo70897a(C27517a aVar) {
            if (aVar != null) {
                this.f72755c = aVar;
                C27608b.m90503a(this.f72753a, aVar);
                if (!TextUtils.isEmpty(aVar.f72558c)) {
                    this.f72753a.setContentDescription(aVar.f72558c);
                }
            }
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f72755c != null) {
                this.f72754b.mo63243a(this.f72755c.f72558c, 2);
            }
        }

        public EmojiViewHolder(View view, C27524h hVar) {
            super(view);
            this.f72753a = (RemoteImageView) view.findViewById(R.id.adx);
            this.f72754b = hVar;
            this.f72753a.setOnClickListener(this);
        }
    }

    public int getItemCount() {
        if (this.f72751a == null) {
            return 0;
        }
        return this.f72751a.size();
    }

    public MiniEmojiAdapter(C27524h hVar) {
        this.f72752b = hVar;
    }

    /* renamed from: a */
    public final void mo70896a(List<C27517a> list) {
        this.f72751a.clear();
        if (list != null) {
            this.f72751a.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(EmojiViewHolder emojiViewHolder, int i) {
        emojiViewHolder.mo70897a((C27517a) this.f72751a.get(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public EmojiViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new EmojiViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ly, viewGroup, false), this.f72752b);
    }
}
