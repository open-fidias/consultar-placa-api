/*
 * API de Histórico Veicular
 * Consulte o histórico completo de veículos usando apenas a placa com a API do Consultar Placa.
 *
 * The version of the OpenAPI document: 1.0.12
 * Contact: contato@consultarplaca.com.br
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package br.com.fidias.consultar_placa.model;

import java.util.Objects;
import java.util.Arrays;
import br.com.fidias.consultar_placa.model.VeiculoRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Error
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-30T10:21:51.050-03:00[America/Fortaleza]")
public class Error {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_MENSAGEM = "mensagem";
  @SerializedName(SERIALIZED_NAME_MENSAGEM)
  private String mensagem;

  public static final String SERIALIZED_NAME_TIPO_DO_ERRO = "tipo_do_erro";
  @SerializedName(SERIALIZED_NAME_TIPO_DO_ERRO)
  private String tipoDoErro;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private VeiculoRequest request;


  public Error status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public Error mensagem(String mensagem) {
    
    this.mensagem = mensagem;
    return this;
  }

   /**
   * Get mensagem
   * @return mensagem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMensagem() {
    return mensagem;
  }


  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }


  public Error tipoDoErro(String tipoDoErro) {
    
    this.tipoDoErro = tipoDoErro;
    return this;
  }

   /**
   * Get tipoDoErro
   * @return tipoDoErro
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTipoDoErro() {
    return tipoDoErro;
  }


  public void setTipoDoErro(String tipoDoErro) {
    this.tipoDoErro = tipoDoErro;
  }


  public Error request(VeiculoRequest request) {
    
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VeiculoRequest getRequest() {
    return request;
  }


  public void setRequest(VeiculoRequest request) {
    this.request = request;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.status, error.status) &&
        Objects.equals(this.mensagem, error.mensagem) &&
        Objects.equals(this.tipoDoErro, error.tipoDoErro) &&
        Objects.equals(this.request, error.request);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, mensagem, tipoDoErro, request);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    mensagem: ").append(toIndentedString(mensagem)).append("\n");
    sb.append("    tipoDoErro: ").append(toIndentedString(tipoDoErro)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

