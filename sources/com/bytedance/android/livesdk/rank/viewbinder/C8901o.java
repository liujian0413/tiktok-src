package com.bytedance.android.livesdk.rank.viewbinder;

import android.graphics.Typeface;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3404s.C3405a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8439k;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.rank.model.C8857f;
import com.bytedance.android.livesdk.rank.p420b.C8817a;
import com.bytedance.android.livesdk.user.C8984e;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import p1886me.drakeet.multitype.C48226c;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.rank.viewbinder.o */
public class C8901o extends C48226c<C8857f, C8902a> {

    /* renamed from: a */
    public C8984e f24253a;

    /* renamed from: b */
    public boolean f24254b;

    /* renamed from: c */
    public int f24255c;

    /* renamed from: d */
    public Fragment f24256d;

    /* renamed from: f */
    private int f24257f;

    /* renamed from: com.bytedance.android.livesdk.rank.viewbinder.o$a */
    class C8902a extends C1293v {

        /* renamed from: a */
        ImageView f24258a;

        /* renamed from: b */
        TextView f24259b;

        /* renamed from: c */
        ImageView f24260c;

        /* renamed from: d */
        HSImageView f24261d;

        /* renamed from: e */
        View f24262e;

        /* renamed from: f */
        ImageView f24263f;

        /* renamed from: g */
        TextView f24264g;

        /* renamed from: h */
        TextView f24265h;

        /* renamed from: i */
        ImageView f24266i;

        /* renamed from: j */
        TextView f24267j;

        /* renamed from: k */
        User f24268k;

        /* renamed from: l */
        View f24269l;

        /* renamed from: m */
        View f24270m;

        /* renamed from: n */
        boolean f24271n;

        /* renamed from: a */
        private boolean m26636a(boolean z, User user) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo21994a(C8857f fVar, boolean z) {
            if (fVar != null) {
                this.f24271n = z;
                if (22 == C8901o.this.f24255c) {
                    m26631a();
                } else if (fVar.f24099c <= 0) {
                    this.f24258a.setVisibility(0);
                    this.f24258a.setImageLevel(fVar.f24099c + 3);
                    this.f24259b.setVisibility(8);
                } else if (fVar.f24098b <= 0) {
                    this.f24258a.setVisibility(8);
                    this.f24259b.setVisibility(0);
                    this.f24259b.setText("-");
                } else if (fVar.f24099c <= 3) {
                    this.f24258a.setVisibility(0);
                    this.f24258a.setImageLevel(fVar.f24099c + 3);
                    this.f24259b.setVisibility(8);
                } else {
                    this.f24258a.setVisibility(8);
                    this.f24259b.setVisibility(0);
                    this.f24259b.setText(String.valueOf(fVar.f24099c));
                    this.f24259b.setTextColor(C3358ac.m12521b((int) R.color.ahj));
                }
                this.itemView.setBackgroundColor(this.itemView.getResources().getColor(fVar.f24099c < 0 ? R.color.as5 : R.color.ac4));
                C5343e.m17045b(this.f24260c, fVar.f24097a.getAvatarThumb(), this.f24260c.getWidth(), this.f24260c.getHeight(), R.drawable.c4_);
                if (fVar.f24097a.getBorder() != null) {
                    this.f24261d.setVisibility(0);
                    C5343e.m17038a(this.f24261d, fVar.f24097a.getBorder().f7818a);
                } else {
                    this.f24261d.setVisibility(8);
                }
                User user = fVar.f24097a;
                this.f24268k = user;
                if (user == null || !m26636a(z, user)) {
                    this.f24262e.setVisibility(8);
                } else {
                    this.f24262e.setVisibility(0);
                    m26638c(user);
                    this.f24262e.setOnClickListener(new C8904p(this, user));
                }
                ImageModel imageModel = null;
                if (!(user == null || user.getUserHonor() == null)) {
                    imageModel = user.getUserHonor().mo8707k();
                }
                if (imageModel == null || C6307b.m19566a((Collection<T>) imageModel.getUrls())) {
                    this.f24263f.setVisibility(8);
                } else {
                    C5343e.m17035a(this.f24263f, imageModel, (C3405a) new C3405a() {
                        /* renamed from: a */
                        public final void mo10308a(ImageModel imageModel) {
                        }

                        /* renamed from: a */
                        public final void mo10310a(ImageModel imageModel, Exception exc) {
                        }

                        /* renamed from: a */
                        public final void mo10309a(ImageModel imageModel, int i, int i2, boolean z) {
                            LayoutParams layoutParams = C8902a.this.f24263f.getLayoutParams();
                            int a = C3358ac.m12510a(30.0f);
                            layoutParams.width = a;
                            layoutParams.height = (i2 * a) / i;
                            C8902a.this.f24263f.setLayoutParams(layoutParams);
                        }
                    });
                    this.f24263f.setVisibility(0);
                }
                m26640e(user);
                this.f24264g.setText(user != null ? user.getNickName() : "");
                this.f24264g.setTextColor(this.itemView.getResources().getColor(R.color.alf));
                if (22 == C8901o.this.f24255c) {
                    C9738o.m28712b((View) this.f24265h, 8);
                } else {
                    this.f24265h.setText(fVar.f24100d);
                }
                this.itemView.setOnClickListener(new C8905q(this, fVar));
                m26633a(fVar.f24097a);
                m26634a(fVar);
            }
        }

        /* renamed from: a */
        private void m26631a() {
            C9738o.m28712b((View) this.f24258a, 8);
            C9738o.m28712b((View) this.f24259b, 8);
            if (this.itemView != null && this.itemView.getContext() != null) {
                C9738o.m28702a(this.itemView.findViewById(R.id.e8p), (int) C9738o.m28708b(this.itemView.getContext(), 8.0f), -3, -3, -3);
            }
        }

        /* renamed from: c */
        private void m26638c(User user) {
            if (user != null) {
                user.getFollowInfo();
            }
        }

        /* renamed from: e */
        private void m26640e(User user) {
            m26632a(8);
        }

        /* renamed from: a */
        private void m26632a(int i) {
            C9738o.m28712b((View) this.f24266i, 8);
            C9738o.m28712b((View) this.f24267j, 8);
        }

        /* renamed from: a */
        private void m26634a(C8857f fVar) {
            if (this.f24264g != null) {
                this.f24264g.setTypeface(Typeface.DEFAULT_BOLD);
            }
            C9738o.m28712b(this.f24270m, 8);
            C9738o.m28700a(this.f24269l, 0);
        }

        /* renamed from: b */
        private void m26637b(User user) {
            if (!this.f24271n) {
                this.f24262e.setVisibility(8);
            } else {
                this.f24262e.setVisibility(8);
            }
        }

        /* renamed from: d */
        private static boolean m26639d(User user) {
            if (user == null || user.getFollowInfo() == null) {
                return false;
            }
            long followStatus = user.getFollowInfo().getFollowStatus();
            if (1 == followStatus || 2 == followStatus) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private void m26633a(User user) {
            if (C8901o.this.f24256d.isAdded()) {
                C8901o.this.f24253a.mo22184d(user.getId()).mo19293a(C3303k.m12369a(C8901o.this.f24256d)).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C8906r<Object>(this, user), C8907s.f24280a);
            }
        }

        public C8902a(View view) {
            super(view);
            this.f24258a = (ImageView) view.findViewById(R.id.cnb);
            this.f24259b = (TextView) view.findViewById(R.id.cnf);
            this.f24260c = (ImageView) view.findViewById(R.id.e8m);
            this.f24261d = (HSImageView) view.findViewById(R.id.b65);
            this.f24262e = view.findViewById(R.id.anj);
            this.f24263f = (ImageView) view.findViewById(R.id.avv);
            this.f24264g = (TextView) view.findViewById(R.id.e9m);
            this.f24265h = (TextView) view.findViewById(R.id.dj0);
            this.f24266i = (ImageView) view.findViewById(R.id.do4);
            this.f24267j = (TextView) view.findViewById(R.id.do3);
            this.f24269l = view.findViewById(R.id.cwn);
            this.f24270m = view.findViewById(R.id.ahv);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo21991a(User user, View view) {
            C9097a.m27146a().mo22267a((Object) new C8817a(user.getId(), !m26639d(user)));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo21992a(User user, FollowPair followPair) throws Exception {
            if (this.f24268k == user && this.f24268k.getId() == user.getId()) {
                user.setFollowStatus(followPair.mo22844a());
                m26637b(user);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo21993a(C8857f fVar, View view) {
            if (C8901o.this.f24254b) {
                HashMap hashMap = new HashMap();
                hashMap.put("event_belong", "live_take");
                hashMap.put("event_type", "click");
                hashMap.put("event_page", "live_take_detail");
                hashMap.put("path", "rank_pic");
                C8443c.m25663a().mo21606a("pm_live_take_anchor_c_audience", hashMap, new C8439k());
            }
            UserProfileEvent userProfileEvent = new UserProfileEvent(fVar.f24097a.getId());
            if (C8901o.this.f24255c == 17) {
                userProfileEvent.setClickUserPosition("single_room_rank");
            } else if (C8901o.this.f24255c == 7) {
                userProfileEvent.setClickUserPosition("weekly_rank");
            } else if (C8901o.this.f24255c == 9) {
                userProfileEvent.setClickUserPosition("totally_rank");
            }
            C9097a.m27146a().mo22267a((Object) userProfileEvent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo21966a(C8902a aVar, C8857f fVar) {
        boolean z;
        if (fVar.f24099c <= this.f24257f) {
            z = true;
        } else {
            z = false;
        }
        aVar.mo21994a(fVar, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C8902a mo21965a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C8902a(layoutInflater.inflate(R.layout.at6, viewGroup, false));
    }

    public C8901o(C8984e eVar, boolean z, int i, Fragment fragment, int i2) {
        this.f24253a = eVar;
        this.f24254b = z;
        this.f24257f = i;
        this.f24256d = fragment;
        this.f24255c = i2;
    }
}
