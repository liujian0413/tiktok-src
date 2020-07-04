package com.p280ss.android.ugc.aweme.music.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p564d.C10789c;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.MusicOwnerAdapter */
public final class MusicOwnerAdapter extends BaseAdapter<MusicOwnerInfo> {

    /* renamed from: a */
    public C33713a f88018a;

    /* renamed from: com.ss.android.ugc.aweme.music.adapter.MusicOwnerAdapter$ViewHolder */
    public final class ViewHolder extends C1293v {

        /* renamed from: a */
        public final AvatarImageView f88019a;

        /* renamed from: b */
        public final DmtTextView f88020b;

        /* renamed from: c */
        public final DmtTextView f88021c;

        /* renamed from: d */
        public final ImageView f88022d;

        /* renamed from: e */
        final /* synthetic */ MusicOwnerAdapter f88023e;

        public ViewHolder(MusicOwnerAdapter musicOwnerAdapter, final View view) {
            C7573i.m23587b(view, "itemView");
            this.f88023e = musicOwnerAdapter;
            super(view);
            View findViewById = view.findViewById(R.id.c1m);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.music_owner_ai_head)");
            this.f88019a = (AvatarImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.c1r);
            C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.….music_owner_tv_nickname)");
            this.f88020b = (DmtTextView) findViewById2;
            TextPaint paint = this.f88020b.getPaint();
            C7573i.m23582a((Object) paint, "tp");
            paint.setFakeBoldText(true);
            View findViewById3 = view.findViewById(R.id.c1s);
            C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.….music_owner_tv_username)");
            this.f88021c = (DmtTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.c1n);
            C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.music_owner_iv_badge)");
            this.f88022d = (ImageView) findViewById4;
            C10789c.m31502a(view);
            view.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ ViewHolder f88024a;

                {
                    this.f88024a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (this.f88024a.f88023e.f88018a != null && !C27326a.m89578a(view)) {
                        C33713a aVar = this.f88024a.f88023e.f88018a;
                        if (aVar != null) {
                            aVar.mo86145a(this.f88024a.getLayoutPosition());
                        }
                    }
                }
            });
        }

        /* renamed from: a */
        public final void mo86143a(List<MusicOwnerInfo> list, int i) {
            C7573i.m23587b(list, "items");
            MusicOwnerInfo musicOwnerInfo = (MusicOwnerInfo) list.get(i);
            this.f88019a.mo60860a(musicOwnerInfo.getAvatar());
            C23323e.m76509a((RemoteImageView) this.f88019a, musicOwnerInfo.getAvatar(), this.f88019a.getControllerListener());
            this.f88020b.setText(musicOwnerInfo.getNickName());
            DmtTextView dmtTextView = this.f88021c;
            StringBuilder sb = new StringBuilder("@");
            sb.append(musicOwnerInfo.getHandle());
            dmtTextView.setText(sb.toString());
            this.f88022d.setVisibility(8);
            if (musicOwnerInfo.getVerified()) {
                this.f88022d.setImageResource(R.drawable.amm);
                this.f88022d.setVisibility(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.adapter.MusicOwnerAdapter$a */
    public interface C33713a {
        /* renamed from: a */
        void mo86145a(int i);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        if (vVar instanceof ViewHolder) {
            ViewHolder viewHolder = (ViewHolder) vVar;
            List a = mo62312a();
            C7573i.m23582a((Object) a, "data");
            viewHolder.mo86143a(a, i);
        }
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.zl, viewGroup, false);
        C7573i.m23582a((Object) inflate, "view");
        return new ViewHolder(this, inflate);
    }
}
