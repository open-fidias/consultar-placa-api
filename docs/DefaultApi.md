# DefaultApi

All URIs are relative to *https://api.consultarplaca.com.br/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**consultarPlacaGet**](DefaultApi.md#consultarPlacaGet) | **GET** /consultarPlaca | 


<a name="consultarPlacaGet"></a>
# **consultarPlacaGet**
> Veiculo consultarPlacaGet(placa)



### Example
```java
// Import classes:
import br.com.fidias.consultar_placa.ApiClient;
import br.com.fidias.consultar_placa.ApiException;
import br.com.fidias.consultar_placa.Configuration;
import br.com.fidias.consultar_placa.auth.*;
import br.com.fidias.consultar_placa.models.*;
import br.com.fidias.consultar_placa.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.consultarplaca.com.br/v2");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String placa = "placa_example"; // String | 
    try {
      Veiculo result = apiInstance.consultarPlacaGet(placa);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#consultarPlacaGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **placa** | **String**|  | [optional]

### Return type

[**Veiculo**](Veiculo.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Consultar Placa - Informações básicas |  -  |
**400** | Erro de Requisição |  -  |
**403** | Permissão Negada |  -  |
**429** | Limite de Requisições Excedido |  -  |
**500** | Erro Interno |  -  |

