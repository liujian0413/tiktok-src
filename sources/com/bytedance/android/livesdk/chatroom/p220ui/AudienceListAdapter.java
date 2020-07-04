package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.bytedance.android.live.base.model.user.C2380l;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.widget.FitTextView;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8439k;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.rank.model.C8857f;
import com.bytedance.android.livesdk.utils.C9094x;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.AudienceListAdapter */
public class AudienceListAdapter extends AbsAudienceListAdapter<C5070a> {

    /* renamed from: a */
    public DataCenter f14498a;

    /* renamed from: b */
    public boolean f14499b;

    /* renamed from: c */
    private final LayoutInflater f14500c;

    /* renamed from: d */
    private OnClickListener f14501d = new OnClickListener() {
        public final void onClick(View view) {
            if (view.getTag() != null && (view.getTag() instanceof Long)) {
                if (AudienceListAdapter.this.f14499b) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("event_belong", "live_take");
                    hashMap.put("event_type", "click");
                    hashMap.put("event_page", "live_take_detail");
                    hashMap.put("path", "top_online_pic");
                    C8443c.m25663a().mo21606a("pm_live_take_anchor_c_audience", hashMap, new C8439k());
                }
                if (AudienceListAdapter.this.f14498a != null) {
                    Room room = (Room) AudienceListAdapter.this.f14498a.get("data_room", null);
                    if (room != null && room.isKoiRoom()) {
                        return;
                    }
                }
                if (AudienceListAdapter.this.f14498a != null) {
                    Room room2 = (Room) AudienceListAdapter.this.f14498a.get("data_room", null);
                    if (room2 != null && room2.isStar()) {
                        return;
                    }
                }
                UserProfileEvent userProfileEvent = new UserProfileEvent(((Long) view.getTag()).longValue());
                userProfileEvent.setClickUserPosition("top_single_room_rank");
                C9097a.m27146a().mo22267a((Object) userProfileEvent);
            }
        }
    };

    /* renamed from: e */
    private List<C8857f> f14502e = new ArrayList();

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.AudienceListAdapter$a */
    static class C5070a extends C1293v {

        /* renamed from: a */
        View f14504a;

        /* renamed from: b */
        ImageView f14505b;

        /* renamed from: c */
        ImageView f14506c;

        /* renamed from: d */
        ImageView f14507d;

        /* renamed from: e */
        ImageView f14508e;

        /* renamed from: f */
        FitTextView f14509f;

        C5070a(View view) {
            super(view);
            this.f14504a = view;
            this.f14505b = (ImageView) view.findViewById(R.id.ic);
            this.f14506c = (ImageView) view.findViewById(R.id.ik);
            this.f14507d = (ImageView) view.findViewById(R.id.avu);
            this.f14508e = (ImageView) view.findViewById(R.id.a5e);
            this.f14509f = (FitTextView) view.findViewById(R.id.a2m);
        }

        /* renamed from: a */
        private void m16344a(User user) {
            C2380l userHonor = user.getUserHonor();
            if (userHonor == null || userHonor.mo8710n() <= 0) {
                this.f14507d.setVisibility(4);
                return;
            }
            this.f14507d.setVisibility(0);
            C5343e.m17030a(this.f14507d, userHonor.mo8711o());
        }

        /* renamed from: a */
        public final void mo13180a(C8857f fVar, OnClickListener onClickListener, DataCenter dataCenter) {
            if (fVar != null && fVar.f24097a != null) {
                User user = fVar.f24097a;
                if (user.getAvatarThumb() == null || C6307b.m19566a((Collection<T>) user.getAvatarThumb().getUrls())) {
                    C5343e.m17029a(this.f14505b, (int) R.drawable.cdk);
                } else {
                    C5343e.m17031a(this.f14505b, user.getAvatarThumb(), (int) R.drawable.cdk);
                }
                if (user.getBorder() == null || user.getBorder().f7818a == null || C6307b.m19566a((Collection<T>) user.getBorder().f7818a.getUrls())) {
                    this.f14506c.setVisibility(8);
                } else {
                    this.f14506c.setVisibility(0);
                    C5343e.m17030a(this.f14506c, user.getBorder().f7818a);
                }
                if (fVar.f24098b > 0) {
                    String b = C9094x.m27136b(fVar.f24098b);
                    this.f14509f.setWidth((int) m16343a(this.f14509f, b, (float) C3358ac.m12510a(20.0f), (float) C3358ac.m12510a(32.0f), C3358ac.m12519b(9.0f)));
                    this.f14509f.setText(b, BufferType.NORMAL);
                    int i = R.drawable.bms;
                    switch (fVar.f24099c) {
                        case 1:
                            i = R.drawable.bmp;
                            break;
                        case 2:
                            i = R.drawable.bmq;
                            break;
                        case 3:
                            i = R.drawable.bmr;
                            break;
                    }
                    this.f14509f.setBackgroundResource(i);
                    this.f14509f.setVisibility(0);
                    this.f14507d.setVisibility(4);
                } else {
                    this.f14509f.setVisibility(8);
                    m16344a(user);
                }
                this.f14504a.setTag(Long.valueOf(user.getId()));
                this.f14504a.setOnClickListener(onClickListener);
                C9738o.m28712b((View) this.f14509f, 8);
            }
        }

        /* renamed from: a */
        private static float m16343a(TextView textView, String str, float f, float f2, float f3) {
            if (textView == null) {
                return 0.0f;
            }
            TextPaint paint = textView.getPaint();
            paint.setTextSize(f3);
            float measureText = paint.measureText(str) + ((float) textView.getPaddingLeft()) + ((float) textView.getPaddingRight());
            if (measureText > f2) {
                measureText = f2;
            }
            if (measureText < f) {
                measureText = f;
            }
            return measureText;
        }
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemCount() {
        return this.f14502e.size();
    }

    /* renamed from: a */
    public final void mo13103a() {
        this.f14502e.clear();
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo13105a(DataCenter dataCenter) {
        this.f14498a = dataCenter;
    }

    /* renamed from: a */
    public final void mo13107a(boolean z) {
        this.f14499b = z;
    }

    /* renamed from: a */
    public final void mo13104a(long j) {
        User user;
        int size = this.f14502e.size() - 1;
        while (size >= 0) {
            C8857f fVar = (C8857f) this.f14502e.get(size);
            if (fVar != null) {
                user = fVar.f24097a;
            } else {
                user = null;
            }
            if (user == null || user.getId() != j) {
                size--;
            } else {
                this.f14502e.remove(size);
                notifyDataSetChanged();
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo13106a(List<C8857f> list) {
        if (list != null) {
            this.f14502e.clear();
            if (!C6307b.m19566a((Collection<T>) list)) {
                this.f14502e.addAll(list);
            }
            notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C5070a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C5070a(this.f14500c.inflate(R.layout.avv, viewGroup, false));
    }

    public AudienceListAdapter(Context context, DataCenter dataCenter) {
        this.f14500c = LayoutInflater.from(context.getApplicationContext());
        this.f14498a = dataCenter;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C5070a aVar, int i) {
        aVar.mo13180a((C8857f) this.f14502e.get(i), this.f14501d, this.f14498a);
    }
}
