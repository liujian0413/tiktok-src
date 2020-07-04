package com.bytedance.polaris.model;

public final class ProfitRemindConfig {

    public enum ProfitType {
        APPRENTICE("pop_up_apprentice"),
        INVITE_BONUS("pop_up_invite_bonus");
        
        public String key;

        private ProfitType(String str) {
            this.key = str;
        }
    }
}
