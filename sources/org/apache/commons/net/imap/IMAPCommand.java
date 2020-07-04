package org.apache.commons.net.imap;

public enum IMAPCommand {
    CAPABILITY((String) 0),
    NOOP((String) 0),
    LOGOUT((String) 0),
    STARTTLS((String) 0),
    AUTHENTICATE((String) 1),
    LOGIN((String) 2),
    XOAUTH((String) 1),
    SELECT((String) 1),
    EXAMINE((String) 1),
    CREATE((String) 1),
    DELETE((String) 1),
    RENAME((String) 2),
    SUBSCRIBE((String) 1),
    UNSUBSCRIBE((String) 1),
    LIST((String) 2),
    LSUB((String) 2),
    STATUS((String) 2),
    APPEND((String) 2, 4),
    CHECK((String) 0),
    CLOSE((String) 0),
    EXPUNGE((String) 0),
    SEARCH((String) 1, Integer.MAX_VALUE),
    FETCH((String) 2),
    STORE((String) 3),
    COPY((String) 2),
    UID((String) 2, Integer.MAX_VALUE);
    
    private final String imapCommand;
    private final int maxParamCount;
    private final int minParamCount;

    public final String getIMAPCommand() {
        if (this.imapCommand != null) {
            return this.imapCommand;
        }
        return name();
    }

    public static final String getCommand(IMAPCommand iMAPCommand) {
        return iMAPCommand.getIMAPCommand();
    }

    private IMAPCommand(int i) {
        this(r7, r8, null, i, i);
    }

    private IMAPCommand(String str) {
        this(r2, r3, str, 0);
    }

    private IMAPCommand(int i, int i2) {
        this(r7, r8, null, i, i2);
    }

    private IMAPCommand(String str, int i) {
        this(r7, r8, str, i, i);
    }

    private IMAPCommand(String str, int i, int i2) {
        this.imapCommand = str;
        this.minParamCount = i;
        this.maxParamCount = i2;
    }
}
