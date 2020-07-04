package org.msgpack.template;

import java.util.ArrayList;

public class FieldList {
    public ArrayList<Entry> list;

    public static class Entry {
        public String name;
        public FieldOption option;

        public Entry() {
            this(null, FieldOption.IGNORE);
        }

        public boolean isAvailable() {
            if (this.option != FieldOption.IGNORE) {
                return true;
            }
            return false;
        }

        public Entry(String str, FieldOption fieldOption) {
            this.name = str;
            this.option = fieldOption;
        }
    }
}
