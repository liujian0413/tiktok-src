package com.p280ss.android.ugc.aweme.imported;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.C38418a;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import com.p280ss.android.ugc.aweme.utils.C43003ca;
import com.p280ss.android.ugc.aweme.video.hashtag.C43232e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.imported.AVHashTagListAdapter */
public class AVHashTagListAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    public boolean f83857a;

    /* renamed from: b */
    public AVSearchChallengeList f83858b;

    /* renamed from: c */
    private List<C38418a> f83859c;

    /* renamed from: d */
    private Context f83860d;

    /* renamed from: e */
    private C43232e f83861e;

    /* renamed from: com.ss.android.ugc.aweme.imported.AVHashTagListAdapter$ItemViewHolder */
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

    /* renamed from: com.ss.android.ugc.aweme.imported.AVHashTagListAdapter$ItemViewHolder_ViewBinding */
    public class ItemViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ItemViewHolder f83864a;

        public void unbind() {
            ItemViewHolder itemViewHolder = this.f83864a;
            if (itemViewHolder != null) {
                this.f83864a = null;
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
            this.f83864a = itemViewHolder;
            itemViewHolder.mHashTagTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.au5, "field 'mHashTagTitle'", TextView.class);
            itemViewHolder.mHashTagImage = (ImageView) Utils.findRequiredViewAsType(view, R.id.au2, "field 'mHashTagImage'", ImageView.class);
            itemViewHolder.mHashTagNum = (TextView) Utils.findRequiredViewAsType(view, R.id.au4, "field 'mHashTagNum'", TextView.class);
            itemViewHolder.mContent = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.a1q, "field 'mContent'", LinearLayout.class);
            itemViewHolder.mHashTagUser = (ImageView) Utils.findRequiredViewAsType(view, R.id.az5, "field 'mHashTagUser'", ImageView.class);
        }
    }

    public int getItemCount() {
        return this.f83859c.size();
    }

    public int getItemViewType(int i) {
        return ((C38418a) this.f83859c.get(i)).f99856b;
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 2) {
            return null;
        }
        return new ItemViewHolder(LayoutInflater.from(this.f83860d).inflate(R.layout.wh, viewGroup, false));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo83028a(int i, View view) {
        if (this.f83861e != null && i >= 0 && i < this.f83859c.size()) {
            if (this.f83858b != null) {
                C6907h.m21528b("add_tag", new C6909j().mo16966a("search_keyword", this.f83858b.keyword).mo16966a("tag_id", ((C38418a) this.f83859c.get(i)).f99855a.getCid()).mo16966a("log_pb", C35563c.f93239b.mo15979b((Object) this.f83858b.logPb)).mo16967a());
            }
            this.f83861e.mo96528a(((C38418a) this.f83859c.get(i)).f99855a);
        }
    }

    public void onBindViewHolder(final C1293v vVar, int i) {
        int i2;
        if (vVar instanceof ItemViewHolder) {
            String challengeName = ((C38418a) this.f83859c.get(i)).f99855a.getChallengeName();
            if (!challengeName.startsWith("#")) {
                StringBuilder sb = new StringBuilder("#");
                sb.append(challengeName);
                challengeName = sb.toString();
            }
            ItemViewHolder itemViewHolder = (ItemViewHolder) vVar;
            itemViewHolder.mHashTagTitle.setText(challengeName);
            itemViewHolder.mHashTagNum.setText(C43003ca.m136496a(((C38418a) this.f83859c.get(i)).f99855a.getDisplayCount()));
            TextView textView = itemViewHolder.mHashTagNum;
            int i3 = 8;
            if (!((C38418a) this.f83859c.get(i)).f99858d) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView.setVisibility(i2);
            itemViewHolder.mHashTagUser.setVisibility(4);
            int i4 = ((C38418a) this.f83859c.get(i)).f99857c;
            ImageView imageView = itemViewHolder.mHashTagImage;
            if (this.f83857a && i4 > 0) {
                i3 = 0;
            }
            imageView.setVisibility(i3);
            if (i4 > 0) {
                itemViewHolder.mHashTagImage.setImageResource(i4);
            }
            vVar.itemView.setOnClickListener(new C32065a(this, i));
            if (((C38418a) this.f83859c.get(i)).f99856b == 2) {
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
        }
    }
}
