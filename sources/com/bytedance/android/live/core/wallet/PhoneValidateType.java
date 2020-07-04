package com.bytedance.android.live.core.wallet;

import com.bytedance.android.live.core.utils.C3358ac;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public enum PhoneValidateType {
    UNBIND_ALI_PAY("unbind_ali_pay", "alipay", C3358ac.m12515a((int) R.string.eh8), C3358ac.m12515a((int) R.string.eh4), 1),
    CHANGE_BANK_CARD("change_bank_card", "bankcard", C3358ac.m12515a((int) R.string.eh7), C3358ac.m12515a((int) R.string.efq), 2),
    UNBIND_BANK_CARD("unbind_bank_card", "bankcard_unbind", C3358ac.m12515a((int) R.string.eh9), C3358ac.m12515a((int) R.string.eh4), 3);
    
    public String goNext;
    public String mobName;
    public int sendSmsScene;
    public String title;
    public String type;

    public static PhoneValidateType getByType(String str) {
        PhoneValidateType[] values;
        for (PhoneValidateType phoneValidateType : values()) {
            if (phoneValidateType.type.equals(str)) {
                return phoneValidateType;
            }
        }
        throw new IllegalAccessError("当前类型未定义");
    }

    private PhoneValidateType(String str, String str2, String str3, String str4, int i) {
        this.type = str;
        this.mobName = str2;
        this.title = str3;
        this.goNext = str4;
        this.sendSmsScene = i;
    }
}
