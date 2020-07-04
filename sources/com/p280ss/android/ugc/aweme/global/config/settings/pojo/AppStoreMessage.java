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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AppStoreMessage */
public final class AppStoreMessage extends Message<AppStoreMessage, Builder> {
    public static final DefaultValueProtoAdapter<AppStoreMessage> ADAPTER = new ProtoAdapter_AppStoreMessage();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer section;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer switcher;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String text;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer threshold;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String title;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AppStoreMessage$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AppStoreMessage, Builder> {
        public Integer section;
        public Integer switcher = Integer.valueOf(1);
        public String text;
        public Integer threshold;
        public String title;

        public final AppStoreMessage build() {
            AppStoreMessage appStoreMessage = new AppStoreMessage(this.switcher, this.section, this.threshold, this.title, this.text, super.buildUnknownFields());
            return appStoreMessage;
        }

        public final Builder section(Integer num) {
            this.section = num;
            return this;
        }

        public final Builder switcher(Integer num) {
            this.switcher = num;
            return this;
        }

        public final Builder text(String str) {
            this.text = str;
            return this;
        }

        public final Builder threshold(Integer num) {
            this.threshold = num;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AppStoreMessage$ProtoAdapter_AppStoreMessage */
    static final class ProtoAdapter_AppStoreMessage extends DefaultValueProtoAdapter<AppStoreMessage> {
        public final AppStoreMessage redact(AppStoreMessage appStoreMessage) {
            return appStoreMessage;
        }

        public ProtoAdapter_AppStoreMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, AppStoreMessage.class);
        }

        public final AppStoreMessage decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (AppStoreMessage) null);
        }

        public final int encodedSize(AppStoreMessage appStoreMessage) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, appStoreMessage.switcher) + ProtoAdapter.INT32.encodedSizeWithTag(2, appStoreMessage.section) + ProtoAdapter.INT32.encodedSizeWithTag(3, appStoreMessage.threshold) + ProtoAdapter.STRING.encodedSizeWithTag(4, appStoreMessage.title) + ProtoAdapter.STRING.encodedSizeWithTag(5, appStoreMessage.text) + appStoreMessage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, AppStoreMessage appStoreMessage) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, appStoreMessage.switcher);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, appStoreMessage.section);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, appStoreMessage.threshold);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, appStoreMessage.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, appStoreMessage.text);
            protoWriter.writeBytes(appStoreMessage.unknownFields());
        }

        public final AppStoreMessage decode(ProtoReader protoReader, AppStoreMessage appStoreMessage) throws IOException {
            Builder builder;
            AppStoreMessage appStoreMessage2 = (AppStoreMessage) C10938a.m32097a().mo26425a(AppStoreMessage.class, appStoreMessage);
            if (appStoreMessage2 != null) {
                builder = appStoreMessage2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.switcher((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.section((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.threshold((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (appStoreMessage2 != null) {
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

    public final Integer getSection() throws NullValueException {
        if (this.section != null) {
            return this.section;
        }
        throw new NullValueException();
    }

    public final Integer getSwitcher() throws NullValueException {
        if (this.switcher != null) {
            return this.switcher;
        }
        throw new NullValueException();
    }

    public final String getText() throws NullValueException {
        if (this.text != null) {
            return this.text;
        }
        throw new NullValueException();
    }

    public final Integer getThreshold() throws NullValueException {
        if (this.threshold != null) {
            return this.threshold;
        }
        throw new NullValueException();
    }

    public final String getTitle() throws NullValueException {
        if (this.title != null) {
            return this.title;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.switcher = this.switcher;
        builder.section = this.section;
        builder.threshold = this.threshold;
        builder.title = this.title;
        builder.text = this.text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i6 = 0;
        if (this.switcher != null) {
            i = this.switcher.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        if (this.section != null) {
            i2 = this.section.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        if (this.threshold != null) {
            i3 = this.threshold.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.title != null) {
            i4 = this.title.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.text != null) {
            i6 = this.text.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.switcher != null) {
            sb.append(", switcher=");
            sb.append(this.switcher);
        }
        if (this.section != null) {
            sb.append(", section=");
            sb.append(this.section);
        }
        if (this.threshold != null) {
            sb.append(", threshold=");
            sb.append(this.threshold);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        StringBuilder replace = sb.replace(0, 2, "AppStoreMessage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppStoreMessage)) {
            return false;
        }
        AppStoreMessage appStoreMessage = (AppStoreMessage) obj;
        if (!unknownFields().equals(appStoreMessage.unknownFields()) || !Internal.equals(this.switcher, appStoreMessage.switcher) || !Internal.equals(this.section, appStoreMessage.section) || !Internal.equals(this.threshold, appStoreMessage.threshold) || !Internal.equals(this.title, appStoreMessage.title) || !Internal.equals(this.text, appStoreMessage.text)) {
            return false;
        }
        return true;
    }

    public AppStoreMessage(Integer num, Integer num2, Integer num3, String str, String str2) {
        this(num, num2, num3, str, str2, ByteString.EMPTY);
    }

    public AppStoreMessage(Integer num, Integer num2, Integer num3, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.switcher = num;
        this.section = num2;
        this.threshold = num3;
        this.title = str;
        this.text = str2;
    }
}
