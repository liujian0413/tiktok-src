package org.apache.commons.net.ftp;

public enum FTPCmd {
    ABOR,
    ACCT,
    ALLO,
    APPE,
    CDUP,
    CWD,
    DELE,
    EPRT,
    EPSV,
    FEAT,
    HELP,
    LIST,
    MDTM,
    MFMT,
    MKD,
    MLSD,
    MLST,
    MODE,
    NLST,
    NOOP,
    PASS,
    PASV,
    PORT,
    PWD,
    QUIT,
    REIN,
    REST,
    RETR,
    RMD,
    RNFR,
    RNTO,
    SITE,
    SMNT,
    STAT,
    STOR,
    STOU,
    STRU,
    SYST,
    TYPE,
    USER;
    
    public static final FTPCmd ABORT = null;
    public static final FTPCmd ACCOUNT = null;
    public static final FTPCmd ALLOCATE = null;
    public static final FTPCmd APPEND = null;
    public static final FTPCmd CHANGE_TO_PARENT_DIRECTORY = null;
    public static final FTPCmd CHANGE_WORKING_DIRECTORY = null;
    public static final FTPCmd DATA_PORT = null;
    public static final FTPCmd DELETE = null;
    public static final FTPCmd FEATURES = null;
    public static final FTPCmd FILE_STRUCTURE = null;
    public static final FTPCmd GET_MOD_TIME = null;
    public static final FTPCmd LOGOUT = null;
    public static final FTPCmd MAKE_DIRECTORY = null;
    public static final FTPCmd MOD_TIME = null;
    public static final FTPCmd NAME_LIST = null;
    public static final FTPCmd PASSIVE = null;
    public static final FTPCmd PASSWORD = null;
    public static final FTPCmd PRINT_WORKING_DIRECTORY = null;
    public static final FTPCmd REINITIALIZE = null;
    public static final FTPCmd REMOVE_DIRECTORY = null;
    public static final FTPCmd RENAME_FROM = null;
    public static final FTPCmd RENAME_TO = null;
    public static final FTPCmd REPRESENTATION_TYPE = null;
    public static final FTPCmd RESTART = null;
    public static final FTPCmd RETRIEVE = null;
    public static final FTPCmd SET_MOD_TIME = null;
    public static final FTPCmd SITE_PARAMETERS = null;
    public static final FTPCmd STATUS = null;
    public static final FTPCmd STORE = null;
    public static final FTPCmd STORE_UNIQUE = null;
    public static final FTPCmd STRUCTURE_MOUNT = null;
    public static final FTPCmd SYSTEM = null;
    public static final FTPCmd TRANSFER_MODE = null;
    public static final FTPCmd USERNAME = null;

    public final String getCommand() {
        return name();
    }

    static {
        ABORT = ABOR;
        ACCOUNT = ACCT;
        ALLOCATE = ALLO;
        APPEND = APPE;
        CHANGE_TO_PARENT_DIRECTORY = CDUP;
        CHANGE_WORKING_DIRECTORY = CWD;
        DATA_PORT = PORT;
        DELETE = DELE;
        FEATURES = FEAT;
        FILE_STRUCTURE = STRU;
        GET_MOD_TIME = MDTM;
        LOGOUT = QUIT;
        MAKE_DIRECTORY = MKD;
        MOD_TIME = MDTM;
        NAME_LIST = NLST;
        PASSIVE = PASV;
        PASSWORD = PASS;
        PRINT_WORKING_DIRECTORY = PWD;
        REINITIALIZE = REIN;
        REMOVE_DIRECTORY = RMD;
        RENAME_FROM = RNFR;
        RENAME_TO = RNTO;
        REPRESENTATION_TYPE = TYPE;
        RESTART = REST;
        RETRIEVE = RETR;
        SET_MOD_TIME = MFMT;
        SITE_PARAMETERS = SITE;
        STATUS = STAT;
        STORE = STOR;
        STORE_UNIQUE = STOU;
        STRUCTURE_MOUNT = SMNT;
        SYSTEM = SYST;
        TRANSFER_MODE = MODE;
        USERNAME = USER;
    }
}
