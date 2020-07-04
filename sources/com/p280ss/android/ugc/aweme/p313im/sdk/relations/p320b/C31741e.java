package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b;

import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.e */
public final class C31741e {

    /* renamed from: a */
    public static final C31741e f83051a = new C31741e();

    private C31741e() {
    }

    /* renamed from: a */
    public static Pair<List<String>, List<Integer>> m103077a(List<? extends IMUser> list) {
        int i;
        C7573i.m23587b(list, "users");
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        int size = list.size();
        Object obj = null;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            String initialLetter = ((IMUser) list.get(i3)).getInitialLetter();
            CharSequence charSequence = initialLetter;
            if (!TextUtils.isEmpty(charSequence)) {
                if (obj == null || TextUtils.equals(charSequence, (CharSequence) obj)) {
                    i = i2 + 1;
                } else {
                    arrayList.add(obj);
                    arrayList2.add(Integer.valueOf(i2));
                    i = 1;
                }
                if (i3 == list.size() - 1) {
                    C7573i.m23582a((Object) initialLetter, "lastLetter");
                    arrayList.add(initialLetter);
                    arrayList2.add(Integer.valueOf(i));
                }
                i2 = i;
                obj = initialLetter;
            }
        }
        return C7579l.m23633a(arrayList, arrayList2);
    }

    /* renamed from: a */
    public final void mo82533a(TextView textView, IMUser iMUser, String str) {
        boolean z;
        C7573i.m23587b(textView, "textView");
        C7573i.m23587b(iMUser, "user");
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        CharSequence charSequence = str;
        boolean z2 = true;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            textView.setText(iMUser.getDisplayName());
            return;
        }
        if (C31915n.m103671a()) {
            CharSequence nickName = iMUser.getNickName();
            if (!(nickName == null || nickName.length() == 0)) {
                z2 = false;
            }
            if (!z2) {
                String nickName2 = iMUser.getNickName();
                C7573i.m23582a((Object) nickName2, "user.nickName");
                if (!C7634n.m23776c((CharSequence) nickName2, charSequence, false)) {
                    str = str.toLowerCase();
                    C7573i.m23582a((Object) str, "(this as java.lang.String).toLowerCase()");
                    String nickName3 = iMUser.getNickName();
                    C7573i.m23582a((Object) nickName3, "user.nickName");
                    if (nickName3 != null) {
                        String lowerCase = nickName3.toLowerCase();
                        C7573i.m23582a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                        int a = C7634n.m23730a((CharSequence) lowerCase, str, 0, false, 6, (Object) null);
                        if (a != -1) {
                            int min = Math.min(str.length() + a, iMUser.getNickName().length());
                            String nickName4 = iMUser.getNickName();
                            C7573i.m23582a((Object) nickName4, "user.nickName");
                            if (nickName4 != null) {
                                str = nickName4.substring(a, min);
                                C7573i.m23582a((Object) str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
        } else if (iMUser.getSearchType() == 5) {
            str = C7048a.m21924a(iMUser.getRemarkName(), iMUser.getRemarkPinyin(), iMUser.getRemarkInitial(), str);
            C7573i.m23582a((Object) str, "CharacterUtil.convertPin…nitial, highLightKeyword)");
        } else if (iMUser.getSearchType() == 3) {
            str = C7048a.m21924a(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str);
            C7573i.m23582a((Object) str, "CharacterUtil.convertPin…nitial, highLightKeyword)");
        }
        String displayName = iMUser.getDisplayName();
        C7573i.m23582a((Object) displayName, "user.displayName");
        m103079a(textView, displayName, str, 0);
    }

    /* renamed from: a */
    public static void m103079a(TextView textView, String str, String str2, int i) {
        C7573i.m23587b(textView, "textView");
        C7573i.m23587b(str, "src");
        C7573i.m23587b(str2, POIService.KEY_KEYWORD);
        textView.setText(C31740d.m103076a(C0683b.m2912c(textView.getContext(), R.color.uk), str, str2, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m103078a(TextView textView, IMUser iMUser, String str, boolean z) {
        boolean z2;
        boolean z3;
        C7573i.m23587b(textView, "textView");
        C7573i.m23587b(iMUser, "user");
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        boolean z4 = true;
        if (str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                CharSequence signature = iMUser.getSignature();
                if (!(signature == null || signature.length() == 0)) {
                    z4 = false;
                }
                if (!z4) {
                    textView.setText(iMUser.getSignature());
                    textView.setVisibility(0);
                    return;
                }
            }
            textView.setVisibility(8);
        } else if (iMUser.getSearchType() == 5) {
            if (z) {
                CharSequence signature2 = iMUser.getSignature();
                if (!(signature2 == null || signature2.length() == 0)) {
                    z4 = false;
                }
                if (!z4) {
                    textView.setText(iMUser.getSignature());
                    textView.setVisibility(0);
                    return;
                }
            }
            textView.setVisibility(8);
        } else if (iMUser.getSearchType() == 3) {
            CharSequence remarkName = iMUser.getRemarkName();
            if (remarkName == null || remarkName.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                if (z) {
                    CharSequence signature3 = iMUser.getSignature();
                    if (!(signature3 == null || signature3.length() == 0)) {
                        z4 = false;
                    }
                    if (!z4) {
                        textView.setText(iMUser.getSignature());
                        textView.setVisibility(0);
                        return;
                    }
                }
                textView.setVisibility(8);
                return;
            }
            String string = C6399b.m19921a().getResources().getString(R.string.bnj, new Object[]{iMUser.getNickName()});
            String a = C7048a.m21924a(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str);
            C7573i.m23582a((Object) a, "CharacterUtil.convertPin…nitial, highLightKeyword)");
            C7573i.m23582a((Object) string, "str");
            m103079a(textView, string, a, 3);
            textView.setVisibility(0);
        } else if (iMUser.getSearchType() == 1) {
            String displayId = iMUser.getDisplayId();
            String c = C7048a.m21930c(displayId);
            C7573i.m23582a((Object) c, "CharacterUtil.hanziToPinyin(id)");
            if (c != null) {
                String lowerCase = c.toLowerCase();
                C7573i.m23582a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                String a2 = C7048a.m21924a(displayId, lowerCase, C7048a.m21928b(displayId), str);
                C7573i.m23582a((Object) a2, "CharacterUtil.convertPin…al(id), highLightKeyword)");
                StringBuilder sb = new StringBuilder();
                sb.append(C6399b.m19921a().getResources().getString(R.string.bfu));
                sb.append(displayId);
                m103079a(textView, sb.toString(), a2, 4);
                textView.setVisibility(0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } else if (iMUser.getSearchType() == 2) {
            String string2 = C6399b.m19921a().getResources().getString(R.string.bia, new Object[]{iMUser.getContactName()});
            String a3 = C7048a.m21924a(iMUser.getContactName(), iMUser.getContactNamePinyin(), iMUser.getContactNameInitial(), str);
            C7573i.m23582a((Object) a3, "CharacterUtil.convertPin…tactNameInitial, keyword)");
            C7573i.m23582a((Object) string2, "str");
            m103079a(textView, string2, a3, 6);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }
}
