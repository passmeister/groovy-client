package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils


import java.util.*;

@Mixin(ApiUtils)
class PassApi {
    String basePath = "https://localhost"
    String versionPath = "/api/v1"

    def createOrUpdatePass ( Object passTypeId, Object passId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/pass"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (passTypeId == null) {
            throw new RuntimeException("missing required params passTypeId")
        }

        if (!"null".equals(String.valueOf(passTypeId)))
            queryParams.put("passTypeId", String.valueOf(passTypeId))
if (!"null".equals(String.valueOf(passId)))
            queryParams.put("passId", String.valueOf(passId))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def deletePass ( Object passTypeId, Object passId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/pass"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (passTypeId == null) {
            throw new RuntimeException("missing required params passTypeId")
        }
        // verify required params are set
        if (passId == null) {
            throw new RuntimeException("missing required params passId")
        }

        if (!"null".equals(String.valueOf(passTypeId)))
            queryParams.put("passTypeId", String.valueOf(passTypeId))
if (!"null".equals(String.valueOf(passId)))
            queryParams.put("passId", String.valueOf(passId))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getPass ( Object passTypeId, Object passId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/pass"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (passTypeId == null) {
            throw new RuntimeException("missing required params passTypeId")
        }
        // verify required params are set
        if (passId == null) {
            throw new RuntimeException("missing required params passId")
        }

        if (!"null".equals(String.valueOf(passTypeId)))
            queryParams.put("passTypeId", String.valueOf(passTypeId))
if (!"null".equals(String.valueOf(passId)))
            queryParams.put("passId", String.valueOf(passId))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    null )
                    
    }
    def passList ( Object passTypeId, Object page, Object limit, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/pass/list"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (passTypeId == null) {
            throw new RuntimeException("missing required params passTypeId")
        }

        if (!"null".equals(String.valueOf(passTypeId)))
            queryParams.put("passTypeId", String.valueOf(passTypeId))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(limit)))
            queryParams.put("limit", String.valueOf(limit))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    null )
                    
    }
    def passSync ( Object passTypeId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/pass/sync"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (passTypeId == null) {
            throw new RuntimeException("missing required params passTypeId")
        }

        if (!"null".equals(String.valueOf(passTypeId)))
            queryParams.put("passTypeId", String.valueOf(passTypeId))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
}
