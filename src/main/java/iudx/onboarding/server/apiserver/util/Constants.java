package iudx.onboarding.server.apiserver.util;

import io.vertx.core.http.HttpMethod;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Constants {

  // Header params
  public static final String HEADER_TOKEN = "token";
  public static final String HEADER_HOST = "Host";
  public static final String HEADER_ACCEPT = "Accept";
  public static final String HEADER_CONTENT_LENGTH = "Content-Length";
  public static final String HEADER_CONTENT_TYPE = "Content-Type";
  public static final String HEADER_ORIGIN = "Origin";
  public static final String HEADER_REFERER = "Referer";
  public static final String HEADER_ALLOW_ORIGIN = "Access-Control-Allow-Origin";
  public static final String HEADER_OPTIONS = "options";
  public static final String HEADER_PUBLIC_KEY = "publicKey";
  public static final String HEADER_RESPONSE_FILE_FORMAT = "format";
  public static final String MIME_APPLICATION_JSON = "application/json";
  public static final Set<String> ALLOWED_HEADERS =
          new HashSet<>(Arrays.asList(HEADER_ACCEPT, HEADER_TOKEN, HEADER_CONTENT_LENGTH,
                  HEADER_CONTENT_TYPE, HEADER_HOST, HEADER_ORIGIN, HEADER_REFERER, HEADER_ALLOW_ORIGIN));

  public static final Set<HttpMethod> ALLOWED_METHODS =
          new HashSet<>(Arrays.asList(HttpMethod.GET,
                  HttpMethod.POST, HttpMethod.OPTIONS, HttpMethod.DELETE, HttpMethod.PATCH,
                  HttpMethod.PUT));
  // request/response params
  public static final String CONTENT_TYPE = "content-type";
  public static final String APPLICATION_JSON = "application/json";
  public static final String STATUS_CODE = "statusCode";
  public static final String RESULTS = "results";

  // endpoints
  public static final String ONBOARDING_API = "/item";
  public static final String INGESTION_API = "/ingestion";
  public static final String TOKEN_API = "/token";
  public static final String INSTANCE_API = "/instance";
  public static final String DOMAIN_API = "/domain";
  public static final String DETAIL = "detail";


}
