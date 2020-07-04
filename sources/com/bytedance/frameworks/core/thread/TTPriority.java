package com.bytedance.frameworks.core.thread;

public interface TTPriority {

    public enum Priority {
        LOW(1),
        NORMAL(2),
        HIGHT(3);
        
        final int priority;

        public final int getValue() {
            return this.priority;
        }

        private Priority(int i) {
            this.priority = i;
        }
    }

    public enum ThreadType {
        API(1),
        DEFAULT(2);
        
        final int type;

        public final int getValue() {
            return this.type;
        }

        private ThreadType(int i) {
            this.type = i;
        }
    }
}
