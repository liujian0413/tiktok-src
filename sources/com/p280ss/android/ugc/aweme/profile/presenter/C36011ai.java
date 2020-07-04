package com.p280ss.android.ugc.aweme.profile.presenter;

import android.os.Message;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.profile.UserResponse;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.ai */
public final class C36011ai implements C6310a {

    /* renamed from: a */
    public C36046t f94200a;

    /* renamed from: b */
    private boolean f94201b;

    /* renamed from: c */
    private boolean f94202c;

    /* renamed from: d */
    private boolean f94203d;

    /* renamed from: e */
    private boolean f94204e;

    /* renamed from: f */
    private boolean f94205f;

    /* renamed from: g */
    private boolean f94206g;

    /* renamed from: h */
    private boolean f94207h;

    /* renamed from: i */
    private boolean f94208i;

    /* renamed from: j */
    private boolean f94209j;

    /* renamed from: k */
    private boolean f94210k;

    /* renamed from: l */
    private boolean f94211l;

    /* renamed from: m */
    private boolean f94212m;

    /* renamed from: n */
    private boolean f94213n;

    /* renamed from: o */
    private C6309f f94214o;

    /* renamed from: p */
    private int f94215p;

    public C36011ai() {
        this(0);
    }

    /* renamed from: b */
    private void m116004b() {
        this.f94201b = false;
        this.f94202c = false;
        this.f94203d = false;
        this.f94204e = false;
        this.f94205f = false;
        this.f94206g = false;
        this.f94207h = false;
        this.f94208i = false;
        this.f94210k = false;
        this.f94211l = false;
        this.f94212m = false;
        this.f94213n = false;
    }

    /* renamed from: a */
    public final boolean mo91645a() {
        if (this.f94201b) {
            return false;
        }
        this.f94201b = true;
        C6861a.m21337f().queryUser(this.f94214o);
        return true;
    }

    public C36011ai(int i) {
        this.f94215p = i;
        m116004b();
        this.f94214o = new C6309f(this);
    }

    /* renamed from: a */
    public final void mo91641a(String str) {
        if (!this.f94209j) {
            this.f94209j = true;
            C6861a.m21337f().updateId(this.f94214o, str, this.f94215p);
        }
    }

    /* renamed from: c */
    public final void mo91647c(String str) {
        if (!this.f94205f) {
            this.f94205f = true;
            C6861a.m21337f().updateSignature(this.f94214o, str, this.f94215p);
        }
    }

    /* renamed from: d */
    public final void mo91648d(String str) {
        if (!this.f94206g) {
            this.f94206g = true;
            C6861a.m21337f().updateAvatarUri(this.f94214o, str, this.f94215p);
        }
    }

    /* renamed from: b */
    public final void mo91646b(String str) {
        if (!this.f94204e) {
            this.f94204e = true;
            C6861a.m21337f().updateNickName(this.f94214o, str, this.f94215p);
        }
    }

    /* renamed from: a */
    public final void mo91643a(Map<String, String> map) {
        if (map != null && map.size() != 0 && !this.f94201b) {
            this.f94201b = true;
            map.put("page_from", String.valueOf(this.f94215p));
            C6861a.m21337f().updateUserInfo(this.f94214o, map);
        }
    }

    public final void handleMsg(Message message) {
        if (message.obj instanceof Exception) {
            m116002a((Exception) message.obj, message.what);
        } else if (message.obj instanceof User) {
            m116001a((User) message.obj, message.what);
        } else {
            if (message.obj instanceof UserResponse) {
                UserResponse userResponse = (UserResponse) message.obj;
                if (userResponse.getAction() == 1) {
                    m116003a(userResponse.status_msg, true);
                } else if (userResponse.getAction() == 2) {
                    m116003a(userResponse.status_msg, false);
                } else {
                    m116001a(userResponse.getUser(), message.what);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo91644a(boolean z) {
        if (!this.f94210k) {
            this.f94210k = true;
            C6861a.m21337f().updateSecret(this.f94214o, z, this.f94215p);
        }
    }

    /* renamed from: a */
    private void m116003a(String str, boolean z) {
        this.f94201b = false;
        this.f94204e = false;
        if (this.f94200a != null) {
            this.f94200a.mo66088a(str, z);
        }
    }

    /* renamed from: a */
    public final void mo91642a(String str, int i) {
        if (!this.f94207h) {
            this.f94207h = true;
            C6861a.m21337f().updateCoverUri(this.f94214o, str, i, this.f94215p);
        }
    }

    /* renamed from: a */
    private void m116002a(Exception exc, int i) {
        if (i == 112) {
            this.f94201b = false;
        } else if (i == 116) {
            this.f94209j = false;
        } else if (i != 122) {
            switch (i) {
                case 0:
                    this.f94204e = false;
                    break;
                case 1:
                    this.f94203d = false;
                    break;
                case 2:
                    this.f94205f = false;
                    break;
                case 3:
                    this.f94202c = false;
                    break;
                case 4:
                    this.f94206g = false;
                    break;
                case 5:
                    this.f94208i = false;
                    break;
                default:
                    switch (i) {
                        case 7:
                            this.f94211l = false;
                            break;
                        case 8:
                            this.f94212m = false;
                            break;
                        case 9:
                            this.f94213n = false;
                            break;
                        case 10:
                        case 11:
                            this.f94207h = false;
                            break;
                    }
            }
        } else {
            this.f94210k = false;
        }
        if (this.f94200a != null) {
            this.f94200a.mo66087a(exc, i);
            if (!this.f94206g && !this.f94202c && !this.f94203d && !this.f94204e && !this.f94205f && !this.f94209j && !this.f94201b && !this.f94210k && !this.f94207h) {
                this.f94200a.mo66089a(false);
            }
        }
    }

    /* renamed from: a */
    private void m116001a(User user, int i) {
        if (user != null) {
            if (i == 112) {
                if (C6399b.m19946v()) {
                    UrlModel avatarVideoUri = user.getAvatarVideoUri();
                    if (!(avatarVideoUri == null || avatarVideoUri.getUrlList() == null || avatarVideoUri.getUrlList().size() <= 0)) {
                        C6861a.m21337f().getCurUser().setAvatarUpdateReminder(false);
                    }
                }
                this.f94201b = false;
                C6861a.m21337f().updateCurUser(user);
            } else if (i == 116) {
                if (C6399b.m19944t()) {
                    C6861a.m21337f().getCurUser().setNicknameUpdateReminder(false);
                }
                this.f94209j = false;
                C6861a.m21337f().updateCurUserId(user.getUniqueId());
            } else if (i != 122) {
                switch (i) {
                    case 0:
                        if (!C6399b.m19944t()) {
                            C6861a.m21337f().getCurUser().setNicknameUpdateReminder(false);
                        }
                        this.f94204e = false;
                        C6861a.m21337f().updateCurNickname(user.getNickname());
                        break;
                    case 1:
                        this.f94203d = false;
                        C6861a.m21337f().updateCurGender(user.getShowGenderStrategy(), user.getGender());
                        break;
                    case 2:
                        this.f94205f = false;
                        C6861a.m21337f().updateCurSignature(user.getSignature());
                        break;
                    case 3:
                        this.f94202c = false;
                        C6861a.m21337f().updateCurBirthday(user.getBirthday(), user.getBirthdayHideLevel());
                        break;
                    case 4:
                        C6861a.m21337f().getCurUser().setAvatarUpdateReminder(false);
                        this.f94206g = false;
                        C6861a.m21337f().updateCurAvatar(user.getAvatarThumb(), user.getAvatarMedium(), user.getAvatarLarger());
                        break;
                    case 5:
                        this.f94208i = false;
                        C6861a.m21337f().updateCurAllowStatus(user.getAllowStatus());
                        break;
                    default:
                        switch (i) {
                            case 7:
                                this.f94211l = false;
                                C6861a.m21337f().updateCurLocation(user.getIsoCountryCode(), user.getCountry(), user.getProvince(), user.getCityName(), user.getDistrict(), user.hideCity);
                                break;
                            case 8:
                                this.f94212m = false;
                                break;
                            case 9:
                                this.f94213n = false;
                                break;
                            case 10:
                                this.f94207h = false;
                                C6861a.m21337f().updateCurCover(user.getCoverUrls());
                                break;
                            case 11:
                                this.f94207h = false;
                                C6861a.m21337f().updateCurVideoCover(user.getVideoCover());
                                break;
                        }
                }
            } else {
                this.f94210k = false;
                C6861a.m21337f().updateCurSecret(user.isSecret());
            }
            if (this.f94200a != null) {
                this.f94200a.mo66086a(user, i);
                if (!this.f94206g && !this.f94202c && !this.f94203d && !this.f94204e && !this.f94205f && !this.f94209j && !this.f94201b && !this.f94210k && !this.f94207h) {
                    this.f94200a.mo66089a(true);
                }
            }
        }
    }
}
