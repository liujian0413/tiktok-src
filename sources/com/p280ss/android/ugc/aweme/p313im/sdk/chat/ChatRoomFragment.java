package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31876av;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomFragment */
public class ChatRoomFragment extends AmeBaseFragment {

    /* renamed from: e */
    private View f80373e;

    /* renamed from: f */
    private BaseChatPanel f80374f;

    /* renamed from: g */
    private SessionInfo f80375g;

    /* renamed from: f */
    private C30738c m99961f() {
        return new C30738c(this);
    }

    /* renamed from: a */
    public final void mo80410a() {
        if (this.f80374f != null) {
            this.f80374f.mo80394e();
        }
    }

    /* renamed from: d */
    public final void mo80412d() {
        if (this.f80374f != null) {
            this.f80374f.mo80395f();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        getLifecycle().mo56b(this.f80374f);
    }

    public void onResume() {
        super.onResume();
        C31876av.m103569a("enter_chat_room");
    }

    /* renamed from: e */
    private void m99960e() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f80375g = (SessionInfo) arguments.getSerializable("key_session_info");
            if (this.f80375g != null) {
                this.f80374f = m99961f().mo80508a(this.f80373e, this.f80375g);
                getLifecycle().mo55a(this.f80374f);
                return;
            }
        }
        if (getActivity() != null) {
            C9738o.m28697a(getContext(), C6399b.m19921a().getResources().getString(R.string.bj7));
            getActivity().finish();
        }
    }

    public void onPause() {
        String str;
        super.onPause();
        long currentTimeMillis = System.currentTimeMillis() - C31876av.m103571c("enter_chat_room").longValue();
        C31876av.m103570b("enter_chat_room");
        if (currentTimeMillis > 86400000) {
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            sb.append(" start: ");
            if (C31876av.m103571c("enter_chat_room") != null) {
                sb.append(C31876av.m103571c("enter_chat_room"));
            } else {
                sb.append(0);
            }
            sb.append(" leave: ");
            sb.append(System.currentTimeMillis());
            sb.append(" duration: ");
            sb.append(currentTimeMillis);
            hashMap.put("tag", sb.toString());
            C7074e.m22070b("leave_chat_duration", hashMap);
        }
        String conversationId = this.f80375g.getConversationId();
        if (this.f80375g.isGroupChat()) {
            str = "group";
        } else {
            str = "private";
        }
        C31858ad.m103428a(conversationId, str, currentTimeMillis);
    }

    /* renamed from: a */
    public final void mo80411a(boolean z) {
        if (this.f80374f != null) {
            this.f80374f.mo80389a(z);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C31876av.m103569a("enterChatRoom");
        m99960e();
        C31876av.m103570b("enterChatRoom");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f80374f != null) {
            this.f80374f.mo80382a(i, i2, intent);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f80373e = layoutInflater.inflate(R.layout.nd, viewGroup, false);
        return this.f80373e;
    }
}
