/*
 * Authentication API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 6.35.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alterian.auth.model;

import java.util.Objects;
import com.alterian.auth.model.SettingValue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alterian.auth.JSON;

/**
 * UpdateLoginExRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class UpdateLoginExRequest {
  public static final String SERIALIZED_NAME_EXTERNAL_AUTHENTICATION = "ExternalAuthentication";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_AUTHENTICATION)
  private Boolean externalAuthentication;

  public static final String SERIALIZED_NAME_LOGIN_ID = "LoginId";
  @SerializedName(SERIALIZED_NAME_LOGIN_ID)
  private UUID loginId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_PASSWORD = "NewPassword";
  @SerializedName(SERIALIZED_NAME_NEW_PASSWORD)
  private String newPassword;

  public static final String SERIALIZED_NAME_SETTINGS = "Settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private List<SettingValue> settings;

  public UpdateLoginExRequest() {
  }

  public UpdateLoginExRequest externalAuthentication(Boolean externalAuthentication) {
    this.externalAuthentication = externalAuthentication;
    return this;
  }

   /**
   * Should this login be exteral authenticated
   * @return externalAuthentication
  **/
  @javax.annotation.Nullable
  public Boolean getExternalAuthentication() {
    return externalAuthentication;
  }

  public void setExternalAuthentication(Boolean externalAuthentication) {
    this.externalAuthentication = externalAuthentication;
  }


  public UpdateLoginExRequest loginId(UUID loginId) {
    this.loginId = loginId;
    return this;
  }

   /**
   * Id of the login
   * @return loginId
  **/
  @javax.annotation.Nullable
  public UUID getLoginId() {
    return loginId;
  }

  public void setLoginId(UUID loginId) {
    this.loginId = loginId;
  }


  public UpdateLoginExRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the login
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public UpdateLoginExRequest newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

   /**
   * If you want to reset the password, provide it here.  If ExternalAuth is true, this property is ignored.
   * @return newPassword
  **/
  @javax.annotation.Nullable
  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }


  public UpdateLoginExRequest settings(List<SettingValue> settings) {
    this.settings = settings;
    return this;
  }

  public UpdateLoginExRequest addSettingsItem(SettingValue settingsItem) {
    if (this.settings == null) {
      this.settings = new ArrayList<>();
    }
    this.settings.add(settingsItem);
    return this;
  }

   /**
   * Settings to apply to the login
   * @return settings
  **/
  @javax.annotation.Nullable
  public List<SettingValue> getSettings() {
    return settings;
  }

  public void setSettings(List<SettingValue> settings) {
    this.settings = settings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateLoginExRequest updateLoginExRequest = (UpdateLoginExRequest) o;
    return Objects.equals(this.externalAuthentication, updateLoginExRequest.externalAuthentication) &&
        Objects.equals(this.loginId, updateLoginExRequest.loginId) &&
        Objects.equals(this.name, updateLoginExRequest.name) &&
        Objects.equals(this.newPassword, updateLoginExRequest.newPassword) &&
        Objects.equals(this.settings, updateLoginExRequest.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalAuthentication, loginId, name, newPassword, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLoginExRequest {\n");
    sb.append("    externalAuthentication: ").append(toIndentedString(externalAuthentication)).append("\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("ExternalAuthentication");
    openapiFields.add("LoginId");
    openapiFields.add("Name");
    openapiFields.add("NewPassword");
    openapiFields.add("Settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateLoginExRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateLoginExRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateLoginExRequest is not found in the empty JSON string", UpdateLoginExRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateLoginExRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateLoginExRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("LoginId") != null && !jsonObj.get("LoginId").isJsonNull()) && !jsonObj.get("LoginId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LoginId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LoginId").toString()));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("NewPassword") != null && !jsonObj.get("NewPassword").isJsonNull()) && !jsonObj.get("NewPassword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NewPassword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NewPassword").toString()));
      }
      if (jsonObj.get("Settings") != null && !jsonObj.get("Settings").isJsonNull()) {
        JsonArray jsonArraysettings = jsonObj.getAsJsonArray("Settings");
        if (jsonArraysettings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Settings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Settings` to be an array in the JSON string but got `%s`", jsonObj.get("Settings").toString()));
          }

          // validate the optional field `Settings` (array)
          for (int i = 0; i < jsonArraysettings.size(); i++) {
            SettingValue.validateJsonElement(jsonArraysettings.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateLoginExRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateLoginExRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateLoginExRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateLoginExRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateLoginExRequest>() {
           @Override
           public void write(JsonWriter out, UpdateLoginExRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateLoginExRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateLoginExRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateLoginExRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateLoginExRequest
  */
  public static UpdateLoginExRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateLoginExRequest.class);
  }

 /**
  * Convert an instance of UpdateLoginExRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

