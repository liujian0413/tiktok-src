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
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant */
public final class UgNewFeedPendant extends Message<UgNewFeedPendant, Builder> {
    public static final DefaultValueProtoAdapter<UgNewFeedPendant> ADAPTER = new ProtoAdapter_UgNewFeedPendant();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer disappear_after;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String h5_link;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewUser#ADAPTER", tag = 2)
    public final UgNewUser new_user;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", label = 2, tag = 1)
    public final List<UrlModel> resource_url;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UgUserLimit#ADAPTER", tag = 5)
    public final UgUserLimit user_limit;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UgNewFeedPendant, Builder> {
        public Integer disappear_after;
        public String h5_link;
        public UgNewUser new_user;
        public List<UrlModel> resource_url = Internal.newMutableList();
        public UgUserLimit user_limit;

        public final UgNewFeedPendant build() {
            UgNewFeedPendant ugNewFeedPendant = new UgNewFeedPendant(this.resource_url, this.new_user, this.disappear_after, this.h5_link, this.user_limit, super.buildUnknownFields());
            return ugNewFeedPendant;
        }

        public final Builder disappear_after(Integer num) {
            this.disappear_after = num;
            return this;
        }

        public final Builder h5_link(String str) {
            this.h5_link = str;
            return this;
        }

        public final Builder new_user(UgNewUser ugNewUser) {
            this.new_user = ugNewUser;
            return this;
        }

        public final Builder user_limit(UgUserLimit ugUserLimit) {
            this.user_limit = ugUserLimit;
            return this;
        }

        public final Builder resource_url(List<UrlModel> list) {
            Internal.checkElementsNotNull(list);
            this.resource_url = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant$ProtoAdapter_UgNewFeedPendant */
    static final class ProtoAdapter_UgNewFeedPendant extends DefaultValueProtoAdapter<UgNewFeedPendant> {
        public final UgNewFeedPendant redact(UgNewFeedPendant ugNewFeedPendant) {
            return ugNewFeedPendant;
        }

        public ProtoAdapter_UgNewFeedPendant() {
            super(FieldEncoding.LENGTH_DELIMITED, UgNewFeedPendant.class);
        }

        public final UgNewFeedPendant decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (UgNewFeedPendant) null);
        }

        public final int encodedSize(UgNewFeedPendant ugNewFeedPendant) {
            return UrlModel.ADAPTER.asRepeated().encodedSizeWithTag(1, ugNewFeedPendant.resource_url) + UgNewUser.ADAPTER.encodedSizeWithTag(2, ugNewFeedPendant.new_user) + ProtoAdapter.INT32.encodedSizeWithTag(3, ugNewFeedPendant.disappear_after) + ProtoAdapter.STRING.encodedSizeWithTag(4, ugNewFeedPendant.h5_link) + UgUserLimit.ADAPTER.encodedSizeWithTag(5, ugNewFeedPendant.user_limit) + ugNewFeedPendant.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, UgNewFeedPendant ugNewFeedPendant) throws IOException {
            UrlModel.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, ugNewFeedPendant.resource_url);
            UgNewUser.ADAPTER.encodeWithTag(protoWriter, 2, ugNewFeedPendant.new_user);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, ugNewFeedPendant.disappear_after);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, ugNewFeedPendant.h5_link);
            UgUserLimit.ADAPTER.encodeWithTag(protoWriter, 5, ugNewFeedPendant.user_limit);
            protoWriter.writeBytes(ugNewFeedPendant.unknownFields());
        }

        public final UgNewFeedPendant decode(ProtoReader protoReader, UgNewFeedPendant ugNewFeedPendant) throws IOException {
            Builder builder;
            UgNewFeedPendant ugNewFeedPendant2 = (UgNewFeedPendant) C10938a.m32097a().mo26425a(UgNewFeedPendant.class, ugNewFeedPendant);
            if (ugNewFeedPendant2 != null) {
                builder = ugNewFeedPendant2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<UrlModel> newMutableList = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            newMutableList.add(UrlModel.ADAPTER.decode(protoReader, C10938a.m32097a().mo26424a(UrlModel.class)));
                            break;
                        case 2:
                            builder.new_user((UgNewUser) UgNewUser.ADAPTER.decode(protoReader, builder.new_user));
                            break;
                        case 3:
                            builder.disappear_after((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.h5_link((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.user_limit((UgUserLimit) UgUserLimit.ADAPTER.decode(protoReader, builder.user_limit));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (ugNewFeedPendant2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.resource_url = newMutableList;
                    }
                    return builder.build();
                }
            }
        }
    }

    public final List<UrlModel> getResourceUrl() {
        return this.resource_url;
    }

    public final Integer getDisappearAfter() throws NullValueException {
        if (this.disappear_after != null) {
            return this.disappear_after;
        }
        throw new NullValueException();
    }

    public final String getH5Link() throws NullValueException {
        if (this.h5_link != null) {
            return this.h5_link;
        }
        throw new NullValueException();
    }

    public final UgNewUser getNewUser() throws NullValueException {
        if (this.new_user != null) {
            return this.new_user;
        }
        throw new NullValueException();
    }

    public final UgUserLimit getUserLimit() throws NullValueException {
        if (this.user_limit != null) {
            return this.user_limit;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.resource_url = Internal.copyOf("resource_url", this.resource_url);
        builder.new_user = this.new_user;
        builder.disappear_after = this.disappear_after;
        builder.h5_link = this.h5_link;
        builder.user_limit = this.user_limit;
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
        int hashCode = ((unknownFields().hashCode() * 37) + this.resource_url.hashCode()) * 37;
        int i5 = 0;
        if (this.new_user != null) {
            i = this.new_user.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.disappear_after != null) {
            i2 = this.disappear_after.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.h5_link != null) {
            i3 = this.h5_link.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.user_limit != null) {
            i5 = this.user_limit.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.resource_url.isEmpty()) {
            sb.append(", resource_url=");
            sb.append(this.resource_url);
        }
        if (this.new_user != null) {
            sb.append(", new_user=");
            sb.append(this.new_user);
        }
        if (this.disappear_after != null) {
            sb.append(", disappear_after=");
            sb.append(this.disappear_after);
        }
        if (this.h5_link != null) {
            sb.append(", h5_link=");
            sb.append(this.h5_link);
        }
        if (this.user_limit != null) {
            sb.append(", user_limit=");
            sb.append(this.user_limit);
        }
        StringBuilder replace = sb.replace(0, 2, "UgNewFeedPendant{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UgNewFeedPendant)) {
            return false;
        }
        UgNewFeedPendant ugNewFeedPendant = (UgNewFeedPendant) obj;
        if (!unknownFields().equals(ugNewFeedPendant.unknownFields()) || !this.resource_url.equals(ugNewFeedPendant.resource_url) || !Internal.equals(this.new_user, ugNewFeedPendant.new_user) || !Internal.equals(this.disappear_after, ugNewFeedPendant.disappear_after) || !Internal.equals(this.h5_link, ugNewFeedPendant.h5_link) || !Internal.equals(this.user_limit, ugNewFeedPendant.user_limit)) {
            return false;
        }
        return true;
    }

    public UgNewFeedPendant(List<UrlModel> list, UgNewUser ugNewUser, Integer num, String str, UgUserLimit ugUserLimit) {
        this(list, ugNewUser, num, str, ugUserLimit, ByteString.EMPTY);
    }

    public UgNewFeedPendant(List<UrlModel> list, UgNewUser ugNewUser, Integer num, String str, UgUserLimit ugUserLimit, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_url = Internal.immutableCopyOf("resource_url", list);
        this.new_user = ugNewUser;
        this.disappear_after = num;
        this.h5_link = str;
        this.user_limit = ugUserLimit;
    }
}
