package com.p280ss.android.ugc.aweme.video.hashtag;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.LogPbBean;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.utils.C43003ca;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.video.hashtag.HashTagListAdapter */
public class HashTagListAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    public Context f111885a;

    /* renamed from: b */
    public C43232e f111886b;

    /* renamed from: c */
    public boolean f111887c;

    /* renamed from: d */
    private List<C43228b> f111888d;

    /* renamed from: e */
    private String f111889e;

    /* renamed from: f */
    private LogPbBean f111890f;

    /* renamed from: com.ss.android.ugc.aweme.video.hashtag.HashTagListAdapter$ItemViewHolder */
    public static class ItemViewHolder extends C1293v {
        @BindView(2131493018)
        LinearLayout mContent;
        @BindView(2131493220)
        ImageView mHashTagImage;
        @BindView(2131493222)
        TextView mHashTagNum;
        @BindView(2131493223)
        TextView mHashTagTitle;
        @BindView(2131493284)
        ImageView mHashTagUser;

        public ItemViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.hashtag.HashTagListAdapter$ItemViewHolder_ViewBinding */
    public class ItemViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ItemViewHolder f111896a;

        public void unbind() {
            ItemViewHolder itemViewHolder = this.f111896a;
            if (itemViewHolder != null) {
                this.f111896a = null;
                itemViewHolder.mHashTagTitle = null;
                itemViewHolder.mHashTagImage = null;
                itemViewHolder.mHashTagNum = null;
                itemViewHolder.mContent = null;
                itemViewHolder.mHashTagUser = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.f111896a = itemViewHolder;
            itemViewHolder.mHashTagTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.au5, "field 'mHashTagTitle'", TextView.class);
            itemViewHolder.mHashTagImage = (ImageView) Utils.findRequiredViewAsType(view, R.id.au2, "field 'mHashTagImage'", ImageView.class);
            itemViewHolder.mHashTagNum = (TextView) Utils.findRequiredViewAsType(view, R.id.au4, "field 'mHashTagNum'", TextView.class);
            itemViewHolder.mContent = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.a1q, "field 'mContent'", LinearLayout.class);
            itemViewHolder.mHashTagUser = (ImageView) Utils.findRequiredViewAsType(view, R.id.az5, "field 'mHashTagUser'", ImageView.class);
        }
    }

    public int getItemCount() {
        return this.f111888d.size();
    }

    /* renamed from: a */
    public final void mo104952a() {
        String str;
        if (!(this.f111889e == null || this.f111888d == null || this.f111888d.isEmpty())) {
            C43228b bVar = null;
            int i = 0;
            while (true) {
                if (i >= this.f111888d.size()) {
                    break;
                }
                C43228b bVar2 = (C43228b) this.f111888d.get(i);
                if (this.f111889e.equals(bVar2.f111900a.challengeName)) {
                    bVar = bVar2;
                    break;
                }
                i++;
            }
            if (bVar != null) {
                String cid = bVar.f111900a.getCid();
                String str2 = "add_tag";
                C6909j jVar = new C6909j();
                String str3 = "tag_id";
                if (cid == null) {
                    cid = "";
                }
                C6909j a = jVar.mo16966a(str3, cid);
                String str4 = "log_pb";
                if (this.f111890f == null) {
                    str = "";
                } else {
                    str = C35563c.f93239b.mo15979b((Object) this.f111890f);
                }
                C6907h.m21525a(str2, a.mo16966a(str4, str).mo16966a("tag_source", "input").mo16966a("tag_content", bVar.f111900a.challengeName).mo16966a("rank", String.valueOf(i)).mo16967a());
            }
        }
    }

    public int getItemViewType(int i) {
        return ((C43228b) this.f111888d.get(i)).f111901b;
    }

    /* renamed from: a */
    public final void mo104954a(String str, LogPbBean logPbBean) {
        this.f111889e = str;
        this.f111890f = logPbBean;
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 2) {
            return null;
        }
        return new ItemViewHolder(LayoutInflater.from(this.f111885a).inflate(R.layout.wh, viewGroup, false));
    }

    /* renamed from: b */
    private static void m137129b(C43228b bVar, int i) {
        C6907h.m21525a("show_tag_words", new C6909j().mo16966a("tag_id", bVar.f111900a.getCid()).mo16966a("tag_source", bVar.f111905f).mo16966a("tag_content", bVar.f111900a.challengeName).mo16966a("rank", String.valueOf(i)).mo16967a());
    }

    /* renamed from: a */
    public final void mo104953a(C43228b bVar, int i) {
        String str;
        String cid = bVar.f111900a.getCid();
        String str2 = "add_tag";
        C6909j jVar = new C6909j();
        String str3 = "tag_id";
        if (cid == null) {
            cid = "";
        }
        C6909j a = jVar.mo16966a(str3, cid);
        String str4 = "log_pb";
        if (this.f111890f == null) {
            str = "";
        } else {
            str = C35563c.f93239b.mo15979b((Object) this.f111890f);
        }
        C6907h.m21525a(str2, a.mo16966a(str4, str).mo16966a("tag_source", bVar.f111905f).mo16966a("tag_content", bVar.f111900a.challengeName).mo16966a("rank", String.valueOf(i)).mo16967a());
    }

    public void onBindViewHolder(final C1293v vVar, final int i) {
        final C43228b bVar;
        int i2;
        if (i < 0 || i >= this.f111888d.size()) {
            bVar = null;
        } else {
            bVar = (C43228b) this.f111888d.get(i);
        }
        if ((vVar instanceof ItemViewHolder) && bVar != null) {
            String challengeName = bVar.f111900a.getChallengeName();
            if (!challengeName.startsWith("#")) {
                StringBuilder sb = new StringBuilder("#");
                sb.append(challengeName);
                challengeName = sb.toString();
            }
            ItemViewHolder itemViewHolder = (ItemViewHolder) vVar;
            itemViewHolder.mHashTagTitle.setText(challengeName);
            itemViewHolder.mHashTagNum.setText(C43003ca.m136496a(bVar.f111900a.getDisplayCount()));
            TextView textView = itemViewHolder.mHashTagNum;
            int i3 = 8;
            if (!bVar.f111903d) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView.setVisibility(i2);
            itemViewHolder.mHashTagUser.setVisibility(4);
            int i4 = bVar.f111902c;
            ImageView imageView = itemViewHolder.mHashTagImage;
            if (this.f111887c && i4 > 0) {
                i3 = 0;
            }
            imageView.setVisibility(i3);
            if (i4 > 0) {
                itemViewHolder.mHashTagImage.setImageResource(i4);
            }
            vVar.itemView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (HashTagListAdapter.this.f111886b != null) {
                        HashTagListAdapter.this.mo104953a(bVar, i);
                        HashTagListAdapter.this.f111886b.mo96528a(bVar.f111900a);
                    }
                    if (bVar.f111904e != null) {
                        bVar.f111904e.mo61662b(HashTagListAdapter.this.f111885a, i);
                    }
                }
            });
            if (bVar.f111904e != null) {
                bVar.f111904e.mo61661a(this.f111885a, i);
            }
            if (bVar.f111901b == 2) {
                itemViewHolder.mContent.setOnTouchListener(new OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            ((ItemViewHolder) vVar).mContent.setAlpha(0.5f);
                        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            ((ItemViewHolder) vVar).mContent.setAlpha(1.0f);
                        }
                        return false;
                    }
                });
            }
            m137129b(bVar, i);
        }
    }

    public HashTagListAdapter(Context context, List list, C43232e eVar) {
        this.f111888d = list;
        this.f111885a = context;
        this.f111886b = eVar;
    }
}
