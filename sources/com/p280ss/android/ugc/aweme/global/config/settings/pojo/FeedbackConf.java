package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf */
public final class FeedbackConf extends Message<FeedbackConf, Builder> {
    public static final DefaultValueProtoAdapter<FeedbackConf> ADAPTER = new ProtoAdapter_FeedbackConf();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String fe_help;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String help;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String normal_entry;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String not_logged_in;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<FeedbackConf, Builder> {
        public String fe_help;
        public String help;
        public String normal_entry;
        public String not_logged_in;

        public final FeedbackConf build() {
            FeedbackConf feedbackConf = new FeedbackConf(this.normal_entry, this.not_logged_in, this.help, this.fe_help, super.buildUnknownFields());
            return feedbackConf;
        }

        public final Builder fe_help(String str) {
            this.fe_help = str;
            return this;
        }

        public final Builder help(String str) {
            this.help = str;
            return this;
        }

        public final Builder normal_entry(String str) {
            this.normal_entry = str;
            return this;
        }

        public final Builder not_logged_in(String str) {
            this.not_logged_in = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf$ProtoAdapter_FeedbackConf */
    static final class ProtoAdapter_FeedbackConf extends DefaultValueProtoAdapter<FeedbackConf> {
        public final FeedbackConf redact(FeedbackConf feedbackConf) {
            return feedbackConf;
        }

        public ProtoAdapter_FeedbackConf() {
            super(FieldEncoding.LENGTH_DELIMITED, FeedbackConf.class);
        }

        public final FeedbackConf decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (FeedbackConf) null);
        }

        public final int encodedSize(FeedbackConf feedbackConf) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, feedbackConf.normal_entry) + ProtoAdapter.STRING.encodedSizeWithTag(2, feedbackConf.not_logged_in) + ProtoAdapter.STRING.encodedSizeWithTag(3, feedbackConf.help) + ProtoAdapter.STRING.encodedSizeWithTag(4, feedbackConf.fe_help) + feedbackConf.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, FeedbackConf feedbackConf) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, feedbackConf.normal_entry);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, feedbackConf.not_logged_in);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, feedbackConf.help);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, feedbackConf.fe_help);
            protoWriter.writeBytes(feedbackConf.unknownFields());
        }

        public final FeedbackConf decode(ProtoReader protoReader, FeedbackConf feedbackConf) throws IOException {
            Builder builder;
            FeedbackConf feedbackConf2 = (FeedbackConf) C10938a.m32097a().mo26425a(FeedbackConf.class, feedbackConf);
            if (feedbackConf2 != null) {
                builder = feedbackConf2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.normal_entry((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.not_logged_in((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.help((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.fe_help((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (feedbackConf2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final String getFeHelp() throws NullValueException {
        if (this.fe_help != null) {
            return this.fe_help;
        }
        throw new NullValueException();
    }

    public final String getHelp() throws NullValueException {
        if (this.help != null) {
            return this.help;
        }
        throw new NullValueException();
    }

    public final String getNormalEntry() throws NullValueException {
        if (this.normal_entry != null) {
            return this.normal_entry;
        }
        throw new NullValueException();
    }

    public final String getNotLoggedIn() throws NullValueException {
        if (this.not_logged_in != null) {
            return this.not_logged_in;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.normal_entry = this.normal_entry;
        builder.not_logged_in = this.not_logged_in;
        builder.help = this.help;
        builder.fe_help = this.fe_help;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i5 = 0;
        if (this.normal_entry != null) {
            i = this.normal_entry.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.not_logged_in != null) {
            i2 = this.not_logged_in.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.help != null) {
            i3 = this.help.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.fe_help != null) {
            i5 = this.fe_help.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.normal_entry != null) {
            sb.append(", normal_entry=");
            sb.append(this.normal_entry);
        }
        if (this.not_logged_in != null) {
            sb.append(", not_logged_in=");
            sb.append(this.not_logged_in);
        }
        if (this.help != null) {
            sb.append(", help=");
            sb.append(this.help);
        }
        if (this.fe_help != null) {
            sb.append(", fe_help=");
            sb.append(this.fe_help);
        }
        StringBuilder replace = sb.replace(0, 2, "FeedbackConf{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeedbackConf)) {
            return false;
        }
        FeedbackConf feedbackConf = (FeedbackConf) obj;
        if (!unknownFields().equals(feedbackConf.unknownFields()) || !Internal.equals(this.normal_entry, feedbackConf.normal_entry) || !Internal.equals(this.not_logged_in, feedbackConf.not_logged_in) || !Internal.equals(this.help, feedbackConf.help) || !Internal.equals(this.fe_help, feedbackConf.fe_help)) {
            return false;
        }
        return true;
    }

    public FeedbackConf(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, ByteString.EMPTY);
    }

    public FeedbackConf(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.normal_entry = str;
        this.not_logged_in = str2;
        this.help = str3;
        this.fe_help = str4;
    }
}
