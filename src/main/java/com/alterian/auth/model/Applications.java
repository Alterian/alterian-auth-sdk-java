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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(Applications.Adapter.class)
public enum Applications {
  
  /**
   * 
   */
  All(0),
  
  /**
   * 
   */
  Alchemy(1),
  
  /**
   * 
   */
  DynamicMessenger(2),
  
  /**
   * Authentication Management
   */
  Management(3),
  
  /**
   * Alchemy infrastructure management [add clients, etc.]
   */
  AlchemyManagement(4),
  
  /**
   * Connecting to Tridion for Profile Rule Export, etc
   */
  Tridion(5),
  
  /**
   * The Realtime Rules Engine (RERE) can use the Campaigns Auth server - so list it here.
   */
  RERE(6),
  
  /**
   * PowerBI in Token mode
   */
  PowerBI(7),
  
  NUMBER_unknown_default_open_api(11184809);

  private Integer value;

  Applications(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Applications fromValue(Integer value) {
    for (Applications b : Applications.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return NUMBER_unknown_default_open_api;
  }

  public static class Adapter extends TypeAdapter<Applications> {
    @Override
    public void write(final JsonWriter jsonWriter, final Applications enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Applications read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return Applications.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    Applications.fromValue(value);
  }
}

