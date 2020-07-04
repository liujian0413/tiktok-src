package com.p280ss.android.ugc.aweme.setting.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Message;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.livedata.C23352a;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.p313im.C30560g;
import com.p280ss.android.ugc.aweme.profile.api.BlockApi;
import com.p280ss.android.ugc.aweme.profile.model.BlockStruct;
import com.p280ss.android.ugc.aweme.profile.model.StoryBlockInfo;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.setting.adapter.BlackHolder */
public class BlackHolder extends C1293v implements OnClickListener, C6310a {

    /* renamed from: a */
    private Activity f97940a;

    /* renamed from: b */
    private AvatarImageView f97941b;

    /* renamed from: c */
    private TextView f97942c;

    /* renamed from: d */
    private TextView f97943d;

    /* renamed from: e */
    private View f97944e;

    /* renamed from: f */
    private Button f97945f;

    /* renamed from: g */
    private User f97946g;

    /* renamed from: h */
    private C6309f f97947h = new C6309f(this);

    /* renamed from: i */
    private int f97948i;

    /* renamed from: j */
    private int f97949j;

    /* renamed from: k */
    private boolean f97950k;

    /* renamed from: b */
    private int m120286b() {
        if (this.f97950k) {
            return R.string.to;
        }
        return R.string.tj;
    }

    /* renamed from: c */
    private int m120288c() {
        if (this.f97950k) {
            return R.string.fiq;
        }
        return R.string.fip;
    }

    /* renamed from: d */
    private int m120289d() {
        if (this.f97949j == 0) {
            return R.drawable.bg_followed;
        }
        return R.drawable.ma;
    }

    /* renamed from: f */
    private boolean m120291f() {
        if (!this.f97950k) {
            return this.f97946g.isBlock();
        }
        StoryBlockInfo storyBlockInfo = this.f97946g.getStoryBlockInfo();
        if (storyBlockInfo == null) {
            return false;
        }
        return storyBlockInfo.isBlock();
    }

    /* renamed from: a */
    private void m120282a() {
        if (this.f97949j != 0) {
            this.f97944e.setBackgroundColor(this.f97944e.getResources().getColor(R.color.az3));
            this.f97942c.setTextColor(this.f97944e.getResources().getColor(R.color.a6f));
            this.f97943d.setTextColor(this.f97944e.getResources().getColor(R.color.a5r));
        }
    }

    /* renamed from: e */
    private void m120290e() {
        if (this.f97940a != null && !this.f97940a.isFinishing()) {
            new C10741a(this.f97940a).mo25657b((int) R.string.bhb).mo25650a((int) R.string.afn, (DialogInterface.OnClickListener) new C37550a(this)).mo25658b((int) R.string.w_, (DialogInterface.OnClickListener) null).mo25656a().mo25637a();
        }
    }

    /* renamed from: a */
    public final void mo94836a(User user) {
        m120283a(user, 0);
    }

    /* renamed from: b */
    private void m120287b(boolean z) {
        boolean z2 = !z;
        BlockApi.m115435a(this.f97947h, this.f97946g.getUid(), z2 ? 1 : 0, this.f97948i);
        if (z) {
            C30560g.m99817a("black_list", this.f97946g.getUid());
        } else {
            C30560g.m99818a("black_list", this.f97946g.getUid(), "");
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C37551b.m120301a(C6399b.m19921a())) {
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.cjs).mo25750a();
            return;
        }
        int id = view.getId();
        if (id != R.id.mj) {
            if (id == R.id.mn) {
                C7195s a = C7195s.m22438a();
                Activity activity = this.f97940a;
                StringBuilder sb = new StringBuilder("aweme://user/profile/");
                sb.append(this.f97946g.getUid());
                a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18694a("sec_user_id", this.f97946g.getSecUid()).mo18695a());
            }
        } else if (!m120291f()) {
            m120290e();
        } else {
            m120287b(true);
        }
    }

    /* renamed from: a */
    private void m120285a(boolean z) {
        if (z) {
            this.f97945f.setText(m120288c());
            this.f97945f.setBackgroundResource(m120289d());
            if (this.f97949j == 0) {
                this.f97945f.setTextColor(C6399b.m19921a().getResources().getColor(R.color.a4z));
            } else {
                this.f97945f.setTextColor(C6399b.m19921a().getResources().getColor(R.color.a6c));
            }
        } else {
            this.f97945f.setText(m120286b());
            this.f97945f.setBackgroundResource(R.drawable.lv);
            this.f97945f.setTextColor(C6399b.m19921a().getResources().getColor(R.color.yj));
        }
    }

    public void handleMsg(Message message) {
        int i;
        int i2;
        if (!this.f97940a.isFinishing()) {
            int i3 = message.what;
            Object obj = message.obj;
            if (i3 == 31 || i3 == 32) {
                if (obj instanceof ExecutionException) {
                    obj = ((ExecutionException) obj).getCause();
                }
                if (obj instanceof ApiServerException) {
                    C10761a.m31403c(C6399b.m19921a(), ((ApiServerException) obj).getErrorMsg()).mo25750a();
                } else if (obj instanceof Exception) {
                    C10761a.m31399c(C6399b.m19921a(), (int) R.string.cjm).mo25750a();
                } else if (obj instanceof BlockStruct) {
                    boolean z = false;
                    boolean z2 = true;
                    if (((BlockStruct) obj).blockStatus != 1) {
                        z2 = false;
                    }
                    if (i3 == 32) {
                        StoryBlockInfo storyBlockInfo = this.f97946g.getStoryBlockInfo();
                        if (storyBlockInfo == null) {
                            storyBlockInfo = new StoryBlockInfo();
                            this.f97946g.setStoryBlockInfo(storyBlockInfo);
                        }
                        storyBlockInfo.setBlock(z2);
                        if (storyBlockInfo != null) {
                            z = storyBlockInfo.isBlock();
                        }
                        m120285a(z);
                        Context a = C6399b.m19921a();
                        Resources resources = this.f97940a.getResources();
                        if (z2) {
                            i2 = R.string.ts;
                        } else {
                            i2 = R.string.fir;
                        }
                        C10761a.m31403c(a, resources.getString(i2)).mo25750a();
                    } else {
                        this.f97946g.setBlock(z2);
                        Context a2 = C6399b.m19921a();
                        Resources resources2 = this.f97940a.getResources();
                        if (z2) {
                            i = R.string.ic;
                        } else {
                            i = R.string.fip;
                        }
                        C10761a.m31403c(a2, resources2.getString(i)).mo25750a();
                        m120285a(this.f97946g.isBlock());
                    }
                    C23352a.m76612a().mo60651a("aweme.main.profile.more_page_user_info_change", User.class).postValue(this.f97946g);
                }
            }
        }
    }

    /* renamed from: a */
    private void m120283a(User user, int i) {
        m120284a(user, 0, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo94835a(DialogInterface dialogInterface, int i) {
        m120287b(false);
    }

    public BlackHolder(View view, Activity activity) {
        super(view);
        this.f97940a = activity;
        this.f97941b = (AvatarImageView) view.findViewById(R.id.mk);
        this.f97942c = (TextView) view.findViewById(R.id.ml);
        this.f97943d = (TextView) view.findViewById(R.id.mm);
        this.f97944e = view.findViewById(R.id.mn);
        this.f97945f = (Button) view.findViewById(R.id.mj);
        C34626j.m111876a(this.f97944e);
        C34626j.m111876a(this.f97945f);
        this.f97944e.setOnClickListener(this);
        this.f97945f.setOnClickListener(this);
    }

    /* renamed from: a */
    private void m120284a(User user, int i, int i2) {
        String str;
        if (user != null) {
            boolean z = false;
            this.f97949j = 0;
            m120282a();
            this.f97948i = i;
            if (this.f97948i == 1) {
                z = true;
            }
            this.f97950k = z;
            this.f97946g = user;
            if (this.f97950k) {
                if (this.f97946g.getStoryBlockInfo() == null) {
                    StoryBlockInfo storyBlockInfo = new StoryBlockInfo();
                    storyBlockInfo.setBlock(true);
                    this.f97946g.setStoryBlockInfo(storyBlockInfo);
                }
                m120285a(true);
            } else {
                this.f97946g.setBlock(true);
            }
            C23323e.m76524b(this.f97941b, this.f97946g.getAvatarThumb());
            this.f97942c.setText(this.f97946g.getNickname());
            TextView textView = this.f97943d;
            StringBuilder sb = new StringBuilder("@");
            if (TextUtils.isEmpty(user.getUniqueId())) {
                str = user.getShortId();
            } else {
                str = user.getUniqueId();
            }
            sb.append(str);
            textView.setText(sb.toString());
        }
    }
}
