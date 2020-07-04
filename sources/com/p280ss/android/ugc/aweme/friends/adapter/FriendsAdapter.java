package com.p280ss.android.ugc.aweme.friends.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.widget.RecyclerHeaderViewAdapter;
import com.p280ss.android.ugc.aweme.friends.model.ContactModel;
import com.p280ss.android.ugc.aweme.friends.model.Friend;
import com.p280ss.android.ugc.aweme.friends.p1281a.C29999a;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.FriendsAdapter */
public class FriendsAdapter<T extends User> extends RecyclerHeaderViewAdapter<T> implements SectionIndexer {

    /* renamed from: e */
    private SectionIndexer f78913e;

    /* renamed from: f */
    private C30014a f78914f = new C30014a();

    /* renamed from: g */
    private int f78915g;

    /* renamed from: h */
    private C29999a f78916h;

    /* renamed from: com.ss.android.ugc.aweme.friends.adapter.FriendsAdapter$a */
    public static final class C30014a {

        /* renamed from: a */
        public int f78917a = -1;

        /* renamed from: b */
        public boolean f78918b;

        /* renamed from: c */
        public boolean f78919c;

        /* renamed from: d */
        public String f78920d;

        /* renamed from: a */
        public final void mo76217a() {
            this.f78917a = -1;
        }
    }

    public Object[] getSections() {
        if (this.f78913e != null) {
            return this.f78913e.getSections();
        }
        return new String[]{" "};
    }

    /* renamed from: a */
    public final void mo76211a(SectionIndexer sectionIndexer) {
        this.f78913e = sectionIndexer;
        this.f78914f.mo76217a();
    }

    public int getPositionForSection(int i) {
        if (this.f78913e != null) {
            return this.f78913e.getPositionForSection(i);
        }
        return -1;
    }

    public int getSectionForPosition(int i) {
        if (this.f78913e != null) {
            return this.f78913e.getSectionForPosition(i);
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        if (C6399b.m19944t()) {
            return super.mo58029a(i);
        }
        if (i == 0 && this.f62015c != null) {
            return f62013a;
        }
        if (i == getItemCount() - 1) {
            return Integer.MIN_VALUE;
        }
        if (!(this.f62015c == null || i == 0)) {
            i--;
        }
        if (((User) this.f67539l.get(i)) instanceof Friend) {
            return 22;
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo76209a(ContactModel contactModel) {
        Friend friend;
        if (contactModel == null) {
            return -1;
        }
        int size = this.f67539l.size();
        for (int i = 0; i < size; i++) {
            if (this.f67539l.get(i) instanceof Friend) {
                friend = (Friend) this.f67539l.get(i);
            } else {
                friend = null;
            }
            if (friend != null && contactModel.equals(new ContactModel(friend.getSocialName(), friend.getNickname()))) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C30014a mo76213b(int i) {
        if (this.f78914f.f78917a == i) {
            return this.f78914f;
        }
        this.f78914f.f78917a = i;
        int sectionForPosition = getSectionForPosition(i);
        boolean z = false;
        if (sectionForPosition == -1 || getPositionForSection(sectionForPosition) != i) {
            this.f78914f.f78918b = false;
            this.f78914f.f78920d = null;
        } else {
            this.f78914f.f78918b = true;
            this.f78914f.f78920d = (String) getSections()[sectionForPosition];
        }
        C30014a aVar = this.f78914f;
        if (getPositionForSection(sectionForPosition + 1) - 1 == i) {
            z = true;
        }
        aVar.f78919c = z;
        return this.f78914f;
    }

    /* renamed from: a */
    public final int mo76210a(String str) {
        if (mo60557c() == 0) {
            return -1;
        }
        int size = this.f67539l.size();
        for (int i = 0; i < size; i++) {
            User user = (User) this.f67539l.get(i);
            if (user != null && TextUtils.equals(user.getUid(), str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo76212a(FollowStatus followStatus) {
        int a = mo76210a(followStatus.userId);
        if (a != -1 && a < this.f67539l.size()) {
            User user = (User) this.f67539l.get(a);
            if (user != null) {
                user.setFollowStatus(followStatus.followStatus);
            }
        }
    }

    public FriendsAdapter(int i, C29999a aVar) {
        this.f78915g = i;
        this.f78916h = aVar;
        mo66506d(R.string.am0);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        if (getItemViewType(i) == 22) {
            if (!(this.f62015c == null || i == 0)) {
                i--;
            }
            mo61148b(vVar, i);
            return;
        }
        super.mo58033a(vVar, i);
    }

    /* renamed from: b */
    public final void mo61148b(C1293v vVar, int i) {
        if (vVar instanceof UnRegisteredFriendsViewHolder) {
            this.f67539l.get(i);
        } else {
            ((FriendsViewHolder) vVar).mo76220a((User) this.f67539l.get(i), this.f78915g, i, this);
        }
    }

    /* renamed from: b */
    public final C1293v mo61146b(ViewGroup viewGroup, int i) {
        boolean z = false;
        if (i == 22) {
            return new UnRegisteredFriendsViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.w8, viewGroup, false), this.f78916h);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.w9, viewGroup, false);
        C29999a aVar = this.f78916h;
        if (this.f78915g != 0) {
            z = true;
        }
        return new FriendsViewHolder(inflate, aVar, z);
    }
}
